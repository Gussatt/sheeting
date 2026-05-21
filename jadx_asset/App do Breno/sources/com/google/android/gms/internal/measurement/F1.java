package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class F1 extends V4 implements InterfaceC0868u5 {
    private static final F1 zzb;
    private int zzd;
    private P1 zze;
    private J1 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        F1 f12 = new F1();
        zzb = f12;
        V4.A(F1.class, f12);
    }

    public static F1 G() {
        return zzb;
    }

    public static /* synthetic */ void K(F1 f12, String str) {
        f12.zzd |= 8;
        f12.zzh = str;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new F1();
        }
        Q1 q12 = null;
        if (i5 == 4) {
            return new E1(q12);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final J1 H() {
        J1 j12 = this.zzf;
        return j12 == null ? J1.G() : j12;
    }

    public final P1 I() {
        P1 p12 = this.zze;
        return p12 == null ? P1.H() : p12;
    }

    public final String J() {
        return this.zzh;
    }

    public final boolean L() {
        return this.zzg;
    }

    public final boolean M() {
        return (this.zzd & 4) != 0;
    }

    public final boolean N() {
        return (this.zzd & 2) != 0;
    }

    public final boolean O() {
        return (this.zzd & 8) != 0;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }
}
