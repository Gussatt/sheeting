package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Z2 extends V4 implements InterfaceC0868u5 {
    private static final Z2 zzb;
    private InterfaceC0699a5 zzd = V4.s();
    private InterfaceC0699a5 zze = V4.s();
    private InterfaceC0708b5 zzf = V4.u();
    private InterfaceC0708b5 zzg = V4.u();

    static {
        Z2 z22 = new Z2();
        zzb = z22;
        V4.A(Z2.class, z22);
    }

    public static Y2 J() {
        return (Y2) zzb.n();
    }

    public static Z2 L() {
        return zzb;
    }

    public static /* synthetic */ void Q(Z2 z22, Iterable iterable) {
        InterfaceC0708b5 interfaceC0708b5 = z22.zzf;
        if (!interfaceC0708b5.c()) {
            z22.zzf = V4.v(interfaceC0708b5);
        }
        AbstractC0804m4.h(iterable, z22.zzf);
    }

    public static /* synthetic */ void R(Z2 z22, Iterable iterable) {
        InterfaceC0699a5 interfaceC0699a5 = z22.zze;
        if (!interfaceC0699a5.c()) {
            z22.zze = V4.t(interfaceC0699a5);
        }
        AbstractC0804m4.h(iterable, z22.zze);
    }

    public static /* synthetic */ void S(Z2 z22, Iterable iterable) {
        InterfaceC0708b5 interfaceC0708b5 = z22.zzg;
        if (!interfaceC0708b5.c()) {
            z22.zzg = V4.v(interfaceC0708b5);
        }
        AbstractC0804m4.h(iterable, z22.zzg);
    }

    public static /* synthetic */ void T(Z2 z22, Iterable iterable) {
        InterfaceC0699a5 interfaceC0699a5 = z22.zzd;
        if (!interfaceC0699a5.c()) {
            z22.zzd = V4.t(interfaceC0699a5);
        }
        AbstractC0804m4.h(iterable, z22.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzd", "zze", "zzf", G2.class, "zzg", C0706b3.class});
        }
        if (i5 == 3) {
            return new Z2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new Y2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zzf.size();
    }

    public final int G() {
        return this.zze.size();
    }

    public final int H() {
        return this.zzg.size();
    }

    public final int I() {
        return this.zzd.size();
    }

    public final List M() {
        return this.zzf;
    }

    public final List N() {
        return this.zze;
    }

    public final List O() {
        return this.zzg;
    }

    public final List P() {
        return this.zzd;
    }
}
