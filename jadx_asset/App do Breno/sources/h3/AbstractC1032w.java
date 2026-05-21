package h3;

/* JADX INFO: renamed from: h3.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1032w {
    public static final InterfaceC1030u a(InterfaceC1027q0 interfaceC1027q0) {
        return new C1031v(interfaceC1027q0);
    }

    public static /* synthetic */ InterfaceC1030u b(InterfaceC1027q0 interfaceC1027q0, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC1027q0 = null;
        }
        return a(interfaceC1027q0);
    }

    public static final boolean c(InterfaceC1030u interfaceC1030u, Object obj) {
        Throwable thD = K2.j.d(obj);
        return thD == null ? interfaceC1030u.u(obj) : interfaceC1030u.q(thD);
    }
}
