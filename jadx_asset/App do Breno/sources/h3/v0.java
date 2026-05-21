package h3;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class v0 {
    public static final InterfaceC1033x a(InterfaceC1027q0 interfaceC1027q0) {
        return new t0(interfaceC1027q0);
    }

    public static /* synthetic */ InterfaceC1033x b(InterfaceC1027q0 interfaceC1027q0, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            interfaceC1027q0 = null;
        }
        return u0.a(interfaceC1027q0);
    }

    public static final void c(N2.i iVar, CancellationException cancellationException) {
        InterfaceC1027q0 interfaceC1027q0 = (InterfaceC1027q0) iVar.d(InterfaceC1027q0.f7558k);
        if (interfaceC1027q0 != null) {
            interfaceC1027q0.e(cancellationException);
        }
    }

    public static final void d(N2.i iVar) {
        InterfaceC1027q0 interfaceC1027q0 = (InterfaceC1027q0) iVar.d(InterfaceC1027q0.f7558k);
        if (interfaceC1027q0 != null) {
            u0.e(interfaceC1027q0);
        }
    }

    public static final void e(InterfaceC1027q0 interfaceC1027q0) {
        if (!interfaceC1027q0.c()) {
            throw interfaceC1027q0.C();
        }
    }
}
