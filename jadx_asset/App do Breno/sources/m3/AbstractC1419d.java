package m3;

/* JADX INFO: renamed from: m3.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1419d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final F f10534a = new F("CLOSED");

    public static final AbstractC1420e b(AbstractC1420e abstractC1420e) {
        while (true) {
            Object objF = abstractC1420e.f();
            if (objF == f10534a) {
                return abstractC1420e;
            }
            AbstractC1420e abstractC1420e2 = (AbstractC1420e) objF;
            if (abstractC1420e2 != null) {
                abstractC1420e = abstractC1420e2;
            } else if (abstractC1420e.j()) {
                return abstractC1420e;
            }
        }
    }

    public static final Object c(C c4, long j4, W2.p pVar) {
        while (true) {
            if (c4.f10514o >= j4 && !c4.h()) {
                return D.a(c4);
            }
            Object objF = c4.f();
            if (objF == f10534a) {
                return D.a(f10534a);
            }
            C c5 = (C) ((AbstractC1420e) objF);
            if (c5 == null) {
                c5 = (C) pVar.j(Long.valueOf(c4.f10514o + 1), c4);
                if (c4.l(c5)) {
                    if (c4.h()) {
                        c4.k();
                    }
                }
            }
            c4 = c5;
        }
    }
}
