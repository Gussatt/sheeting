package h3;

import java.lang.reflect.InvocationTargetException;
import m3.AbstractC1423h;

/* JADX INFO: loaded from: classes.dex */
public abstract class H {
    public static final void a(N2.i iVar, Throwable th) {
        try {
            G g4 = (G) iVar.d(G.f7500j);
            if (g4 != null) {
                g4.l(iVar, th);
            } else {
                AbstractC1423h.a(iVar, th);
            }
        } catch (Throwable th2) {
            AbstractC1423h.a(iVar, b(th, th2));
        }
    }

    public static final Throwable b(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        K2.a.a(runtimeException, th);
        return runtimeException;
    }
}
