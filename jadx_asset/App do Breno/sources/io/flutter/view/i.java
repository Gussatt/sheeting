package io.flutter.view;

import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.text.style.URLSpan;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f8270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f8271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f8272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f8273d;

    public static class a extends c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f8274d;
    }

    public static class b extends c {
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f8275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f8276b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public d f8277c;
    }

    public enum d {
        SPELLOUT,
        LOCALE
    }

    public i a(List list) {
        this.f8271b = list;
        return this;
    }

    public i b(String str) {
        this.f8272c = str;
        return this;
    }

    public i c(String str) {
        this.f8270a = str;
        return this;
    }

    public i d(String str) {
        this.f8273d = str;
        return this;
    }

    public CharSequence e() {
        if (this.f8270a == null) {
            return null;
        }
        SpannableString spannableString = new SpannableString(this.f8270a);
        List<c> list = this.f8271b;
        if (list != null) {
            for (c cVar : list) {
                int iOrdinal = cVar.f8277c.ordinal();
                if (iOrdinal == 0) {
                    spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), cVar.f8275a, cVar.f8276b, 0);
                } else if (iOrdinal == 1) {
                    spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((a) cVar).f8274d)), cVar.f8275a, cVar.f8276b, 0);
                }
            }
        }
        String str = this.f8273d;
        if (str != null && !str.isEmpty()) {
            spannableString.setSpan(new URLSpan(this.f8273d), 0, this.f8270a.length(), 0);
        }
        String str2 = this.f8272c;
        if (str2 != null && !str2.isEmpty()) {
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(this.f8272c)), 0, this.f8270a.length(), 0);
        }
        return spannableString;
    }
}
