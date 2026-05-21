package h3;

import N2.i;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: h3.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1027q0 extends i.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f7558k = b.f7559m;

    /* JADX INFO: renamed from: h3.q0$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC1027q0 interfaceC1027q0, CancellationException cancellationException, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i4 & 1) != 0) {
                cancellationException = null;
            }
            interfaceC1027q0.e(cancellationException);
        }

        public static Object b(InterfaceC1027q0 interfaceC1027q0, Object obj, W2.p pVar) {
            return i.b.a.a(interfaceC1027q0, obj, pVar);
        }

        public static i.b c(InterfaceC1027q0 interfaceC1027q0, i.c cVar) {
            return i.b.a.b(interfaceC1027q0, cVar);
        }

        public static /* synthetic */ X d(InterfaceC1027q0 interfaceC1027q0, boolean z3, boolean z4, W2.l lVar, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
            }
            if ((i4 & 1) != 0) {
                z3 = false;
            }
            if ((i4 & 2) != 0) {
                z4 = true;
            }
            return interfaceC1027q0.x(z3, z4, lVar);
        }

        public static N2.i e(InterfaceC1027q0 interfaceC1027q0, i.c cVar) {
            return i.b.a.c(interfaceC1027q0, cVar);
        }

        public static N2.i f(InterfaceC1027q0 interfaceC1027q0, N2.i iVar) {
            return i.b.a.d(interfaceC1027q0, iVar);
        }
    }

    /* JADX INFO: renamed from: h3.q0$b */
    public static final class b implements i.c {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final /* synthetic */ b f7559m = new b();
    }

    CancellationException C();

    boolean G();

    X M(W2.l lVar);

    boolean a();

    boolean c();

    void e(CancellationException cancellationException);

    r f(InterfaceC1029t interfaceC1029t);

    InterfaceC1027q0 getParent();

    boolean isCancelled();

    X x(boolean z3, boolean z4, W2.l lVar);
}
