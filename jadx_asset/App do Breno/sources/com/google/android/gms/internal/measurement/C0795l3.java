package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0795l3 extends V4 implements InterfaceC0868u5 {
    private static final C0795l3 zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        C0795l3 c0795l3 = new C0795l3();
        zzb = c0795l3;
        V4.A(C0795l3.class, c0795l3);
    }

    public static C0787k3 J() {
        return (C0787k3) zzb.n();
    }

    public static /* synthetic */ void N(C0795l3 c0795l3) {
        c0795l3.zzd &= -33;
        c0795l3.zzj = 0.0d;
    }

    public static /* synthetic */ void O(C0795l3 c0795l3) {
        c0795l3.zzd &= -9;
        c0795l3.zzh = 0L;
    }

    public static /* synthetic */ void P(C0795l3 c0795l3) {
        c0795l3.zzd &= -5;
        c0795l3.zzg = zzb.zzg;
    }

    public static /* synthetic */ void Q(C0795l3 c0795l3, double d4) {
        c0795l3.zzd |= 32;
        c0795l3.zzj = d4;
    }

    public static /* synthetic */ void R(C0795l3 c0795l3, long j4) {
        c0795l3.zzd |= 8;
        c0795l3.zzh = j4;
    }

    public static /* synthetic */ void S(C0795l3 c0795l3, String str) {
        str.getClass();
        c0795l3.zzd |= 2;
        c0795l3.zzf = str;
    }

    public static /* synthetic */ void T(C0795l3 c0795l3, long j4) {
        c0795l3.zzd |= 1;
        c0795l3.zze = j4;
    }

    public static /* synthetic */ void U(C0795l3 c0795l3, String str) {
        str.getClass();
        c0795l3.zzd |= 4;
        c0795l3.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i5 == 3) {
            return new C0795l3();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new C0787k3(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final double F() {
        return this.zzj;
    }

    public final float G() {
        return this.zzi;
    }

    public final long H() {
        return this.zzh;
    }

    public final long I() {
        return this.zze;
    }

    public final String L() {
        return this.zzf;
    }

    public final String M() {
        return this.zzg;
    }

    public final boolean V() {
        return (this.zzd & 32) != 0;
    }

    public final boolean W() {
        return (this.zzd & 16) != 0;
    }

    public final boolean X() {
        return (this.zzd & 8) != 0;
    }

    public final boolean Y() {
        return (this.zzd & 1) != 0;
    }

    public final boolean Z() {
        return (this.zzd & 4) != 0;
    }
}
