package y;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: renamed from: y.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1645b {

    /* JADX INFO: renamed from: y.b$a */
    public static class a {
        public static LocaleList a(Configuration configuration) {
            return configuration.getLocales();
        }

        public static void b(Configuration configuration, e eVar) {
            configuration.setLocales((LocaleList) eVar.c());
        }
    }

    public static e a(Configuration configuration) {
        return e.d(a.a(configuration));
    }
}
