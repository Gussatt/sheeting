package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class C2 extends V4 implements InterfaceC0868u5 {
    private static final C2 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        C2 c22 = new C2();
        zzb = c22;
        V4.A(C2.class, c22);
    }

    public static B2 F() {
        return (B2) zzb.n();
    }

    public static C2 H() {
        return zzb;
    }

    public static /* synthetic */ void I(C2 c22, boolean z3) {
        c22.zzd |= 32;
        c22.zzj = z3;
    }

    public static /* synthetic */ void J(C2 c22, boolean z3) {
        c22.zzd |= 16;
        c22.zzi = z3;
    }

    public static /* synthetic */ void K(C2 c22, boolean z3) {
        c22.zzd |= 1;
        c22.zze = z3;
    }

    public static /* synthetic */ void L(C2 c22, boolean z3) {
        c22.zzd |= 64;
        c22.zzk = z3;
    }

    public static /* synthetic */ void M(C2 c22, boolean z3) {
        c22.zzd |= 2;
        c22.zzf = z3;
    }

    public static /* synthetic */ void N(C2 c22, boolean z3) {
        c22.zzd |= 4;
        c22.zzg = z3;
    }

    public static /* synthetic */ void O(C2 c22, boolean z3) {
        c22.zzd |= 8;
        c22.zzh = z3;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i5 == 3) {
            return new C2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new B2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean Q() {
        return this.zzi;
    }

    public final boolean R() {
        return this.zze;
    }

    public final boolean S() {
        return this.zzk;
    }

    public final boolean T() {
        return this.zzf;
    }

    public final boolean U() {
        return this.zzg;
    }

    public final boolean V() {
        return this.zzh;
    }
}
