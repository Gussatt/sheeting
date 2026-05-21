package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class H2 extends S4 implements InterfaceC0868u5 {
    public /* synthetic */ H2(AbstractC0803m3 abstractC0803m3) {
        super(I2.zzb);
    }

    public final H2 A() {
        s();
        ((I2) this.f6583n).zze = V4.u();
        return this;
    }

    public final H2 B(int i4) {
        s();
        I2.R((I2) this.f6583n, i4);
        return this;
    }

    public final H2 C(String str) {
        s();
        I2.S((I2) this.f6583n, str);
        return this;
    }

    public final H2 D(int i4, L2 l22) {
        s();
        I2.T((I2) this.f6583n, i4, (M2) l22.q());
        return this;
    }

    public final H2 E(int i4, M2 m22) {
        s();
        I2.T((I2) this.f6583n, i4, m22);
        return this;
    }

    public final H2 F(long j4) {
        s();
        I2.U((I2) this.f6583n, j4);
        return this;
    }

    public final H2 G(long j4) {
        s();
        I2.V((I2) this.f6583n, j4);
        return this;
    }

    public final M2 H(int i4) {
        return ((I2) this.f6583n).L(i4);
    }

    public final String I() {
        return ((I2) this.f6583n).M();
    }

    public final List J() {
        return Collections.unmodifiableList(((I2) this.f6583n).N());
    }

    public final boolean K() {
        return ((I2) this.f6583n).Y();
    }

    public final int u() {
        return ((I2) this.f6583n).G();
    }

    public final long v() {
        return ((I2) this.f6583n).H();
    }

    public final long w() {
        return ((I2) this.f6583n).I();
    }

    public final H2 x(Iterable iterable) {
        s();
        I2.O((I2) this.f6583n, iterable);
        return this;
    }

    public final H2 y(L2 l22) {
        s();
        I2.P((I2) this.f6583n, (M2) l22.q());
        return this;
    }

    public final H2 z(M2 m22) {
        s();
        I2.P((I2) this.f6583n, m22);
        return this;
    }
}
