package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class P2 extends S4 implements InterfaceC0868u5 {
    public /* synthetic */ P2(AbstractC0803m3 abstractC0803m3) {
        super(R2.zzb);
    }

    public final P2 A(String str) {
        s();
        R2.S((R2) this.f6583n, str);
        return this;
    }

    public final T2 B(int i4) {
        return ((R2) this.f6583n).J(i4);
    }

    public final String C() {
        return ((R2) this.f6583n).K();
    }

    public final List D() {
        return Collections.unmodifiableList(((R2) this.f6583n).M());
    }

    public final int u() {
        return ((R2) this.f6583n).F();
    }

    public final P2 v(Iterable iterable) {
        s();
        R2.N((R2) this.f6583n, iterable);
        return this;
    }

    public final P2 w(S2 s22) {
        s();
        R2.O((R2) this.f6583n, (T2) s22.q());
        return this;
    }

    public final P2 x() {
        s();
        ((R2) this.f6583n).zze = V4.u();
        return this;
    }

    public final P2 y(int i4, S2 s22) {
        s();
        R2.Q((R2) this.f6583n, i4, (T2) s22.q());
        return this;
    }

    public final P2 z(String str) {
        s();
        R2.R((R2) this.f6583n, str);
        return this;
    }
}
