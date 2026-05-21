package m3;

import java.util.Iterator;

/* JADX INFO: renamed from: m3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1423h {
    public static final void a(N2.i iVar, Throwable th) {
        Iterator it = AbstractC1422g.a().iterator();
        while (it.hasNext()) {
            try {
                ((h3.G) it.next()).l(iVar, th);
            } catch (Throwable th2) {
                AbstractC1422g.b(h3.H.b(th, th2));
            }
        }
        try {
            K2.a.a(th, new C1424i(iVar));
        } catch (Throwable unused) {
        }
        AbstractC1422g.b(th);
    }
}
