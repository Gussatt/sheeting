package v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l2.AbstractC1388b;
import o2.C1472a;
import org.json.JSONException;
import org.json.JSONObject;
import w2.C1613f;
import w2.C1616i;
import w2.C1617j;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1617j f11625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f11626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1617j.c f11627c;

    public class a implements C1617j.c {
        public a() {
        }

        @Override // w2.C1617j.c
        public void g(C1616i c1616i, C1617j.d dVar) {
            if (l.this.f11626b == null) {
                return;
            }
            String str = c1616i.f11879a;
            str.getClass();
            if (!str.equals("Localization.getStringResource")) {
                dVar.c();
                return;
            }
            JSONObject jSONObject = (JSONObject) c1616i.b();
            try {
                dVar.a(l.this.f11626b.a(jSONObject.getString("key"), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e4) {
                dVar.b("error", e4.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public l(C1472a c1472a) {
        a aVar = new a();
        this.f11627c = aVar;
        C1617j c1617j = new C1617j(c1472a, "flutter/localization", C1613f.f11878a);
        this.f11625a = c1617j;
        c1617j.e(aVar);
    }

    public void b(List list) {
        AbstractC1388b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            AbstractC1388b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f11625a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f11626b = bVar;
    }
}
