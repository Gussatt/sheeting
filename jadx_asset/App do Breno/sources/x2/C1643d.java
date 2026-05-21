package x2;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import v2.l;

/* JADX INFO: renamed from: x2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1643d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f11979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f11980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l.b f11981c;

    /* JADX INFO: renamed from: x2.d$a */
    public class a implements l.b {
        public a() {
        }

        @Override // v2.l.b
        public String a(String str, String str2) {
            Context contextCreateConfigurationContext = C1643d.this.f11980b;
            if (str2 != null) {
                Locale localeB = C1643d.b(str2);
                Configuration configuration = new Configuration(C1643d.this.f11980b.getResources().getConfiguration());
                configuration.setLocale(localeB);
                contextCreateConfigurationContext = C1643d.this.f11980b.createConfigurationContext(configuration);
            }
            int identifier = contextCreateConfigurationContext.getResources().getIdentifier(str, "string", C1643d.this.f11980b.getPackageName());
            if (identifier != 0) {
                return contextCreateConfigurationContext.getResources().getString(identifier);
            }
            return null;
        }
    }

    public C1643d(Context context, l lVar) {
        a aVar = new a();
        this.f11981c = aVar;
        this.f11980b = context;
        this.f11979a = lVar;
        lVar.c(aVar);
    }

    public static Locale b(String str) {
        Locale.Builder builder = new Locale.Builder();
        String[] strArrSplit = str.replace('_', '-').split("-");
        builder.setLanguage(strArrSplit[0]);
        int i4 = 1;
        if (strArrSplit.length > 1 && strArrSplit[1].length() == 4) {
            builder.setScript(strArrSplit[1]);
            i4 = 2;
        }
        if (strArrSplit.length > i4 && strArrSplit[i4].length() >= 2 && strArrSplit[i4].length() <= 3) {
            builder.setRegion(strArrSplit[i4]);
        }
        return builder.build();
    }

    public Locale c(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 26) {
            LocaleList locales = this.f11980b.getResources().getConfiguration().getLocales();
            for (int i4 = 0; i4 < locales.size(); i4++) {
                Locale locale = locales.get(i4);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    Locale locale2 = (Locale) it.next();
                    if (locale.equals(locale2)) {
                        return locale2;
                    }
                }
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Locale locale3 = (Locale) it2.next();
                    if (locale.getLanguage().equals(locale3.toLanguageTag())) {
                        return locale3;
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    Locale locale4 = (Locale) it3.next();
                    if (locale.getLanguage().equals(locale4.getLanguage())) {
                        return locale4;
                    }
                }
            }
            return (Locale) list.get(0);
        }
        ArrayList arrayList = new ArrayList();
        LocaleList locales2 = this.f11980b.getResources().getConfiguration().getLocales();
        int size = locales2.size();
        for (int i5 = 0; i5 < size; i5++) {
            Locale locale5 = locales2.get(i5);
            String language = locale5.getLanguage();
            if (!locale5.getScript().isEmpty()) {
                language = language + "-" + locale5.getScript();
            }
            if (!locale5.getCountry().isEmpty()) {
                language = language + "-" + locale5.getCountry();
            }
            arrayList.add(AbstractC1641b.a(language));
            AbstractC1642c.a();
            arrayList.add(AbstractC1641b.a(locale5.getLanguage()));
            AbstractC1642c.a();
            arrayList.add(AbstractC1641b.a(locale5.getLanguage() + "-*"));
        }
        Locale localeLookup = Locale.lookup(arrayList, list);
        return localeLookup != null ? localeLookup : (Locale) list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        LocaleList locales = configuration.getLocales();
        int size = locales.size();
        for (int i4 = 0; i4 < size; i4++) {
            arrayList.add(locales.get(i4));
        }
        this.f11979a.b(arrayList);
    }
}
