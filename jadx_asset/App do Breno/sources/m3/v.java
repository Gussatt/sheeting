package m3;

import h3.B0;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final w a(Throwable th, String str) throws Throwable {
        if (th != null) {
            throw th;
        }
        d();
        throw new K2.c();
    }

    public static /* synthetic */ w b(Throwable th, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            th = null;
        }
        if ((i4 & 2) != 0) {
            str = null;
        }
        return a(th, str);
    }

    public static final boolean c(B0 b02) {
        return b02.U() instanceof w;
    }

    public static final Void d() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }

    public static final B0 e(t tVar, List list) {
        try {
            return tVar.b(list);
        } catch (Throwable th) {
            return a(th, tVar.a());
        }
    }
}
