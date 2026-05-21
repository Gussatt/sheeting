package y1;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static void a(Throwable th) {
        if (th == null) {
            z1.g.f().k("A null value was passed to recordFatalException. Ignoring.");
        } else {
            h.e().f12027a.w(th);
        }
    }

    public static void b(String str) {
        h.e().f12027a.D("com.crashlytics.flutter.build-id.0", str);
    }

    public static void c(List list) {
        Iterator it = list.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            String str = (String) it.next();
            i4++;
            h.e().f12027a.D("com.crashlytics.flutter.build-id." + i4, str);
        }
    }
}
