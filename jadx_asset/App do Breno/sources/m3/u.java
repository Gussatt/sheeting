package m3;

import h3.B0;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f10571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f10572b;

    static {
        u uVar = new u();
        f10571a = uVar;
        G.f("kotlinx.coroutines.fast.service.loader", true);
        f10572b = uVar.a();
    }

    public final B0 a() {
        Object next;
        B0 b0E;
        try {
            List listC = e3.g.c(e3.e.a(ServiceLoader.load(t.class, t.class.getClassLoader()).iterator()));
            Iterator it = listC.iterator();
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int iC = ((t) next).c();
                    do {
                        Object next2 = it.next();
                        int iC2 = ((t) next2).c();
                        if (iC < iC2) {
                            next = next2;
                            iC = iC2;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            t tVar = (t) next;
            if (tVar != null && (b0E = v.e(tVar, listC)) != null) {
                return b0E;
            }
            return v.b(null, null, 3, null);
        } catch (Throwable th) {
            return v.b(th, null, 2, null);
        }
    }
}
