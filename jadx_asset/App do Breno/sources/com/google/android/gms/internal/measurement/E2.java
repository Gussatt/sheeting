package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class E2 extends V4 implements InterfaceC0868u5 {
    private static final E2 zzb;
    private int zzd;
    private int zze;
    private Z2 zzf;
    private Z2 zzg;
    private boolean zzh;

    static {
        E2 e22 = new E2();
        zzb = e22;
        V4.A(E2.class, e22);
    }

    public static D2 G() {
        return (D2) zzb.n();
    }

    public static /* synthetic */ void K(E2 e22, int i4) {
        e22.zzd |= 1;
        e22.zze = i4;
    }

    public static /* synthetic */ void L(E2 e22, Z2 z22) {
        z22.getClass();
        e22.zzf = z22;
        e22.zzd |= 2;
    }

    public static /* synthetic */ void M(E2 e22, boolean z3) {
        e22.zzd |= 8;
        e22.zzh = z3;
    }

    public static /* synthetic */ void N(E2 e22, Z2 z22) {
        e22.zzg = z22;
        e22.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new E2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new D2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zze;
    }

    public final Z2 I() {
        Z2 z22 = this.zzf;
        return z22 == null ? Z2.L() : z22;
    }

    public final Z2 J() {
        Z2 z22 = this.zzg;
        return z22 == null ? Z2.L() : z22;
    }

    public final boolean O() {
        return this.zzh;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }

    public final boolean Q() {
        return (this.zzd & 8) != 0;
    }

    public final boolean R() {
        return (this.zzd & 4) != 0;
    }
}
