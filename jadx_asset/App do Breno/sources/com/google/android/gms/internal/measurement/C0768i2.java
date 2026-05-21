package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0768i2 extends S4 implements InterfaceC0868u5 {
    public /* synthetic */ C0768i2(AbstractC0865u2 abstractC0865u2) {
        super(C0777j2.zzb);
    }

    public final List A() {
        return Collections.unmodifiableList(((C0777j2) this.f6583n).Q());
    }

    public final List B() {
        return Collections.unmodifiableList(((C0777j2) this.f6583n).R());
    }

    public final int u() {
        return ((C0777j2) this.f6583n).G();
    }

    public final C0759h2 v(int i4) {
        return ((C0777j2) this.f6583n).J(i4);
    }

    public final C0768i2 w() {
        s();
        ((C0777j2) this.f6583n).zzj = V4.u();
        return this;
    }

    public final C0768i2 x() {
        s();
        ((C0777j2) this.f6583n).zzm = V4.u();
        return this;
    }

    public final C0768i2 y(int i4, C0750g2 c0750g2) {
        s();
        C0777j2.W((C0777j2) this.f6583n, i4, (C0759h2) c0750g2.q());
        return this;
    }

    public final String z() {
        return ((C0777j2) this.f6583n).P();
    }
}
