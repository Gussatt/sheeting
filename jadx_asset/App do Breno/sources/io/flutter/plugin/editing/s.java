package io.flutter.plugin.editing;

import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import v2.z;
import w2.C1617j;
import x2.C1643d;

/* JADX INFO: loaded from: classes.dex */
public class s implements z.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v2.z f7933a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextServicesManager f7934b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SpellCheckerSession f7935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1617j.d f7936d;

    public s(TextServicesManager textServicesManager, v2.z zVar) {
        this.f7934b = textServicesManager;
        this.f7933a = zVar;
        zVar.b(this);
    }

    @Override // v2.z.b
    public void a(String str, String str2, C1617j.d dVar) {
        if (this.f7936d != null) {
            dVar.b("error", "Previous spell check request still pending.", null);
        } else {
            this.f7936d = dVar;
            c(str, str2);
        }
    }

    public void b() {
        this.f7933a.b(null);
        SpellCheckerSession spellCheckerSession = this.f7935c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        Locale localeB = C1643d.b(str);
        if (this.f7935c == null) {
            this.f7935c = this.f7934b.newSpellCheckerSession(null, localeB, this, true);
        }
        this.f7935c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        if (sentenceSuggestionsInfoArr.length == 0) {
            this.f7936d.a(new ArrayList());
            this.f7936d = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
        if (sentenceSuggestionsInfo == null) {
            this.f7936d.a(new ArrayList());
            this.f7936d = null;
            return;
        }
        for (int i4 = 0; i4 < sentenceSuggestionsInfo.getSuggestionsCount(); i4++) {
            SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i4);
            int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
            if (suggestionsCount > 0) {
                HashMap map = new HashMap();
                int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i4);
                int lengthAt = sentenceSuggestionsInfo.getLengthAt(i4) + offsetAt;
                map.put("startIndex", Integer.valueOf(offsetAt));
                map.put("endIndex", Integer.valueOf(lengthAt));
                ArrayList arrayList2 = new ArrayList();
                boolean z3 = false;
                for (int i5 = 0; i5 < suggestionsCount; i5++) {
                    String suggestionAt = suggestionsInfoAt.getSuggestionAt(i5);
                    if (!suggestionAt.equals("")) {
                        arrayList2.add(suggestionAt);
                        z3 = true;
                    }
                }
                if (z3) {
                    map.put("suggestions", arrayList2);
                    arrayList.add(map);
                }
            }
        }
        this.f7936d.a(arrayList);
        this.f7936d = null;
    }

    @Override // android.view.textservice.SpellCheckerSession.SpellCheckerSessionListener
    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
