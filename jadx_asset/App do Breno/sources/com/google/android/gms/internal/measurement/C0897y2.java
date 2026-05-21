package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0897y2 extends V4 implements InterfaceC0868u5 {
    private static final C0897y2 zzb;
    private int zzd;
    private long zzh;
    private long zzl;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        C0897y2 c0897y2 = new C0897y2();
        zzb = c0897y2;
        V4.A(C0897y2.class, c0897y2);
    }

    public static C0889x2 P() {
        return (C0889x2) zzb.n();
    }

    public static C0897y2 R() {
        return zzb;
    }

    public static /* synthetic */ void Y(C0897y2 c0897y2) {
        c0897y2.zzd &= -5;
        c0897y2.zzg = zzb.zzg;
    }

    public static /* synthetic */ void Z(C0897y2 c0897y2) {
        c0897y2.zzd &= -3;
        c0897y2.zzf = zzb.zzf;
    }

    public static /* synthetic */ void a0(C0897y2 c0897y2) {
        c0897y2.zzd &= -2;
        c0897y2.zze = zzb.zze;
    }

    public static /* synthetic */ void b0(C0897y2 c0897y2) {
        c0897y2.zzd &= -65;
        c0897y2.zzk = zzb.zzk;
    }

    public static /* synthetic */ void c0(C0897y2 c0897y2) {
        c0897y2.zzd &= -33;
        c0897y2.zzj = zzb.zzj;
    }

    public static /* synthetic */ void d0(C0897y2 c0897y2) {
        c0897y2.zzd &= -17;
        c0897y2.zzi = zzb.zzi;
    }

    public static /* synthetic */ void e0(C0897y2 c0897y2, String str) {
        c0897y2.zzd |= 4;
        c0897y2.zzg = str;
    }

    public static /* synthetic */ void f0(C0897y2 c0897y2, String str) {
        c0897y2.zzd |= 2;
        c0897y2.zzf = str;
    }

    public static /* synthetic */ void g0(C0897y2 c0897y2, String str) {
        c0897y2.zzd |= 1;
        c0897y2.zze = str;
    }

    public static /* synthetic */ void h0(C0897y2 c0897y2, long j4) {
        c0897y2.zzd |= 8;
        c0897y2.zzh = j4;
    }

    public static /* synthetic */ void i0(C0897y2 c0897y2, long j4) {
        c0897y2.zzd |= 128;
        c0897y2.zzl = j4;
    }

    public static /* synthetic */ void j0(C0897y2 c0897y2, String str) {
        c0897y2.zzd |= 64;
        c0897y2.zzk = str;
    }

    public static /* synthetic */ void k0(C0897y2 c0897y2, String str) {
        c0897y2.zzd |= 32;
        c0897y2.zzj = str;
    }

    public static /* synthetic */ void l0(C0897y2 c0897y2, String str) {
        c0897y2.zzd |= 16;
        c0897y2.zzi = str;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i5 == 3) {
            return new C0897y2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new C0889x2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean F() {
        return (this.zzd & 4) != 0;
    }

    public final boolean G() {
        return (this.zzd & 2) != 0;
    }

    public final boolean H() {
        return (this.zzd & 1) != 0;
    }

    public final boolean I() {
        return (this.zzd & 8) != 0;
    }

    public final boolean J() {
        return (this.zzd & 128) != 0;
    }

    public final boolean K() {
        return (this.zzd & 64) != 0;
    }

    public final boolean L() {
        return (this.zzd & 32) != 0;
    }

    public final boolean M() {
        return (this.zzd & 16) != 0;
    }

    public final long N() {
        return this.zzh;
    }

    public final long O() {
        return this.zzl;
    }

    public final String S() {
        return this.zzg;
    }

    public final String T() {
        return this.zzf;
    }

    public final String U() {
        return this.zze;
    }

    public final String V() {
        return this.zzk;
    }

    public final String W() {
        return this.zzj;
    }

    public final String X() {
        return this.zzi;
    }
}
