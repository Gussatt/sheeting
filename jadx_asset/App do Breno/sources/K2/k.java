package K2;

import K2.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final Object a(Throwable th) {
        X2.l.e(th, "exception");
        return new j.b(th);
    }

    public static final void b(Object obj) throws Throwable {
        if (obj instanceof j.b) {
            throw ((j.b) obj).f2511m;
        }
    }
}
