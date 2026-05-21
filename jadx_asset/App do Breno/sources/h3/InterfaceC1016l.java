package h3;

/* JADX INFO: renamed from: h3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1016l extends N2.e {

    /* JADX INFO: renamed from: h3.l$a */
    public static final class a {
        public static /* synthetic */ boolean a(InterfaceC1016l interfaceC1016l, Throwable th, int i4, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
            }
            if ((i4 & 1) != 0) {
                th = null;
            }
            return interfaceC1016l.t(th);
        }
    }

    void J(W2.l lVar);

    void K(Object obj);

    Object h(Object obj, Object obj2, W2.l lVar);

    boolean t(Throwable th);

    void v(Object obj, W2.l lVar);
}
