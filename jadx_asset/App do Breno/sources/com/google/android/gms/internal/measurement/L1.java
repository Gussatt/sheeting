package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class L1 extends V4 implements InterfaceC0868u5 {
    private static final L1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private F1 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        L1 l12 = new L1();
        zzb = l12;
        V4.A(L1.class, l12);
    }

    public static K1 H() {
        return (K1) zzb.n();
    }

    public static /* synthetic */ void K(L1 l12, String str) {
        l12.zzd |= 2;
        l12.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i5 == 3) {
            return new L1();
        }
        Q1 q12 = null;
        if (i5 == 4) {
            return new K1(q12);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zze;
    }

    public final F1 G() {
        F1 f12 = this.zzg;
        return f12 == null ? F1.G() : f12;
    }

    public final String J() {
        return this.zzf;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return this.zzi;
    }

    public final boolean N() {
        return this.zzj;
    }

    public final boolean O() {
        return (this.zzd & 1) != 0;
    }

    public final boolean P() {
        return (this.zzd & 32) != 0;
    }
}
