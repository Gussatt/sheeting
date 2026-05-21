package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class R2 extends V4 implements InterfaceC0868u5 {
    private static final R2 zzb;
    private int zzd;
    private InterfaceC0708b5 zze = V4.u();
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        R2 r22 = new R2();
        zzb = r22;
        V4.A(R2.class, r22);
    }

    public static P2 G() {
        return (P2) zzb.n();
    }

    public static P2 H(R2 r22) {
        S4 s4N = zzb.n();
        s4N.o(r22);
        return (P2) s4N;
    }

    public static /* synthetic */ void N(R2 r22, Iterable iterable) {
        r22.V();
        AbstractC0804m4.h(iterable, r22.zze);
    }

    public static /* synthetic */ void O(R2 r22, T2 t22) {
        t22.getClass();
        r22.V();
        r22.zze.add(t22);
    }

    public static /* synthetic */ void Q(R2 r22, int i4, T2 t22) {
        t22.getClass();
        r22.V();
        r22.zze.set(i4, t22);
    }

    public static /* synthetic */ void R(R2 r22, String str) {
        str.getClass();
        r22.zzd |= 1;
        r22.zzf = str;
    }

    public static /* synthetic */ void S(R2 r22, String str) {
        str.getClass();
        r22.zzd |= 2;
        r22.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzd", "zze", T2.class, "zzf", "zzg", "zzh", Q2.f6557a});
        }
        if (i5 == 3) {
            return new R2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new P2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zze.size();
    }

    public final T2 J(int i4) {
        return (T2) this.zze.get(i4);
    }

    public final String K() {
        return this.zzf;
    }

    public final String L() {
        return this.zzg;
    }

    public final List M() {
        return this.zze;
    }

    public final boolean T() {
        return (this.zzd & 1) != 0;
    }

    public final boolean U() {
        return (this.zzd & 2) != 0;
    }

    public final void V() {
        InterfaceC0708b5 interfaceC0708b5 = this.zze;
        if (interfaceC0708b5.c()) {
            return;
        }
        this.zze = V4.v(interfaceC0708b5);
    }
}
