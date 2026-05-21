package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class T2 extends V4 implements InterfaceC0868u5 {
    private static final T2 zzb;
    private long zzA;
    private int zzB;
    private boolean zzE;
    private int zzH;
    private int zzI;
    private int zzJ;
    private long zzL;
    private long zzM;
    private int zzP;
    private X2 zzR;
    private long zzT;
    private long zzU;
    private int zzX;
    private boolean zzY;
    private boolean zzaa;
    private O2 zzab;
    private long zzaf;
    private boolean zzag;
    private boolean zzai;
    private int zzak;
    private C2 zzam;
    private int zzan;
    private C0897y2 zzao;
    private C0778j3 zzaq;
    private long zzar;
    private int zzd;
    private int zze;
    private int zzf;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzr;
    private long zzv;
    private long zzw;
    private boolean zzy;
    private InterfaceC0708b5 zzg = V4.u();
    private InterfaceC0708b5 zzh = V4.u();
    private String zzn = "";
    private String zzo = "";
    private String zzp = "";
    private String zzq = "";
    private String zzs = "";
    private String zzt = "";
    private String zzu = "";
    private String zzx = "";
    private String zzz = "";
    private String zzC = "";
    private String zzD = "";
    private InterfaceC0708b5 zzF = V4.u();
    private String zzG = "";
    private String zzK = "";
    private String zzN = "";
    private String zzO = "";
    private String zzQ = "";
    private Z4 zzS = V4.r();
    private String zzV = "";
    private String zzW = "";
    private String zzZ = "";
    private String zzac = "";
    private InterfaceC0708b5 zzad = V4.u();
    private String zzae = "";
    private String zzah = "";
    private String zzaj = "";
    private String zzal = "";
    private String zzap = "";
    private String zzas = "";

    static {
        T2 t22 = new T2();
        zzb = t22;
        V4.A(T2.class, t22);
    }

    public static /* synthetic */ void A0(T2 t22, String str) {
        t22.zze |= 268435456;
        t22.zzas = "";
    }

    public static /* synthetic */ void B0(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 16777216;
        t22.zzG = str;
    }

    public static /* synthetic */ void C0(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 4194304;
        t22.zzD = str;
    }

    public static /* synthetic */ void D0(T2 t22, long j4) {
        t22.zzd |= 16384;
        t22.zzv = j4;
    }

    public static /* synthetic */ void E0(T2 t22, String str) {
        t22.zzd |= 2097152;
        t22.zzC = str;
    }

    public static S2 F(T2 t22) {
        S4 s4N = zzb.n();
        s4N.o(t22);
        return (S2) s4N;
    }

    public static /* synthetic */ void F0(T2 t22, boolean z3) {
        t22.zze |= 262144;
        t22.zzai = z3;
    }

    public static S2 F2() {
        return (S2) zzb.n();
    }

    public static /* synthetic */ void G0(T2 t22, Iterable iterable) {
        t22.i2();
        AbstractC0804m4.h(iterable, t22.zzg);
    }

    public static /* synthetic */ void H0(T2 t22, Iterable iterable) {
        Z4 z4 = t22.zzS;
        if (!z4.c()) {
            int size = z4.size();
            t22.zzS = z4.e(size + size);
        }
        AbstractC0804m4.h(iterable, t22.zzS);
    }

    public static /* synthetic */ void H1(T2 t22, boolean z3) {
        t22.zzd |= 131072;
        t22.zzy = z3;
    }

    public static /* synthetic */ void I0(T2 t22, Iterable iterable) {
        InterfaceC0708b5 interfaceC0708b5 = t22.zzad;
        if (!interfaceC0708b5.c()) {
            t22.zzad = V4.v(interfaceC0708b5);
        }
        AbstractC0804m4.h(iterable, t22.zzad);
    }

    public static /* synthetic */ void I1(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 128;
        t22.zzo = str;
    }

    public static /* synthetic */ void J0(T2 t22, Iterable iterable) {
        t22.j2();
        AbstractC0804m4.h(iterable, t22.zzh);
    }

    public static /* synthetic */ void J1(T2 t22, String str) {
        t22.zzd |= 64;
        t22.zzn = "android";
    }

    public static /* synthetic */ void K0(T2 t22, I2 i22) {
        i22.getClass();
        t22.i2();
        t22.zzg.add(i22);
    }

    public static /* synthetic */ void K1(T2 t22, X2 x22) {
        x22.getClass();
        t22.zzR = x22;
        t22.zze |= 8;
    }

    public static /* synthetic */ void L0(T2 t22, C0795l3 c0795l3) {
        c0795l3.getClass();
        t22.j2();
        t22.zzh.add(c0795l3);
    }

    public static /* synthetic */ void L1(T2 t22, long j4) {
        t22.zzd |= 32;
        t22.zzm = j4;
    }

    public static /* synthetic */ void M0(T2 t22) {
        t22.zzd &= -262145;
        t22.zzz = zzb.zzz;
    }

    public static /* synthetic */ void M1(T2 t22, long j4) {
        t22.zzd |= 16;
        t22.zzl = j4;
    }

    public static /* synthetic */ void N1(T2 t22, int i4) {
        t22.zzd |= 1;
        t22.zzf = 1;
    }

    public static /* synthetic */ void O0(T2 t22) {
        t22.zzd &= -257;
        t22.zzp = zzb.zzp;
    }

    public static /* synthetic */ void O1(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 65536;
        t22.zzx = str;
    }

    public static /* synthetic */ void P0(T2 t22) {
        t22.zzd &= Integer.MAX_VALUE;
        t22.zzN = zzb.zzN;
    }

    public static /* synthetic */ void P1(T2 t22, int i4) {
        t22.zze |= 2;
        t22.zzP = i4;
    }

    public static /* synthetic */ void Q1(T2 t22, boolean z3) {
        t22.zzd |= 8388608;
        t22.zzE = z3;
    }

    public static /* synthetic */ void R0(T2 t22) {
        t22.zzd &= -2097153;
        t22.zzC = zzb.zzC;
    }

    public static /* synthetic */ void R1(T2 t22, String str) {
        str.getClass();
        t22.zze |= 8192;
        t22.zzac = str;
    }

    public static /* synthetic */ void S0(T2 t22) {
        t22.zzd &= -131073;
        t22.zzy = false;
    }

    public static /* synthetic */ void S1(T2 t22, C0778j3 c0778j3) {
        t22.zzaq = c0778j3;
        t22.zze |= 67108864;
    }

    public static /* synthetic */ void T0(T2 t22) {
        t22.zzd &= -33;
        t22.zzm = 0L;
    }

    public static /* synthetic */ void T1(T2 t22, long j4) {
        t22.zzd |= 4;
        t22.zzj = j4;
    }

    public static /* synthetic */ void U0(T2 t22) {
        t22.zzd &= -17;
        t22.zzl = 0L;
    }

    public static /* synthetic */ void U1(T2 t22, long j4) {
        t22.zze |= 32768;
        t22.zzaf = j4;
    }

    public static /* synthetic */ void V0(T2 t22) {
        t22.zzd &= -65537;
        t22.zzx = zzb.zzx;
    }

    public static /* synthetic */ void V1(T2 t22, int i4) {
        t22.zzd |= 1024;
        t22.zzr = i4;
    }

    public static /* synthetic */ void W0(T2 t22) {
        t22.zze &= -8193;
        t22.zzac = zzb.zzac;
    }

    public static /* synthetic */ void W1(T2 t22, long j4) {
        t22.zzd |= 2;
        t22.zzi = j4;
    }

    public static /* synthetic */ void X0(T2 t22) {
        t22.zzd &= -268435457;
        t22.zzK = zzb.zzK;
    }

    public static /* synthetic */ void X1(T2 t22, long j4) {
        t22.zzd |= 32768;
        t22.zzw = 119002L;
    }

    public static /* synthetic */ void Y0(T2 t22) {
        t22.zzd &= -3;
        t22.zzi = 0L;
    }

    public static /* synthetic */ void Y1(T2 t22, int i4, C0795l3 c0795l3) {
        c0795l3.getClass();
        t22.j2();
        t22.zzh.set(i4, c0795l3);
    }

    public static /* synthetic */ void Z0(T2 t22, int i4) {
        t22.i2();
        t22.zzg.remove(i4);
    }

    public static /* synthetic */ void Z1(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 512;
        t22.zzq = str;
    }

    public static /* synthetic */ void a1(T2 t22, int i4) {
        t22.j2();
        t22.zzh.remove(i4);
    }

    public static /* synthetic */ void b1(T2 t22, C0897y2 c0897y2) {
        c0897y2.getClass();
        t22.zzao = c0897y2;
        t22.zze |= 16777216;
    }

    public static /* synthetic */ void c1(T2 t22, int i4) {
        t22.zze |= 1048576;
        t22.zzak = i4;
    }

    public static /* synthetic */ void d1(T2 t22, String str) {
        str.getClass();
        t22.zze |= 4;
        t22.zzQ = str;
    }

    public static /* synthetic */ void e0(T2 t22, Iterable iterable) {
        InterfaceC0708b5 interfaceC0708b5 = t22.zzF;
        if (!interfaceC0708b5.c()) {
            t22.zzF = V4.v(interfaceC0708b5);
        }
        AbstractC0804m4.h(iterable, t22.zzF);
    }

    public static /* synthetic */ void e1(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 4096;
        t22.zzt = str;
    }

    public static /* synthetic */ void f1(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 262144;
        t22.zzz = str;
    }

    public static /* synthetic */ void g0(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 2048;
        t22.zzs = str;
    }

    public static /* synthetic */ void h0(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 8192;
        t22.zzu = str;
    }

    public static /* synthetic */ void i0(T2 t22, int i4) {
        t22.zzd |= 33554432;
        t22.zzH = i4;
    }

    public static /* synthetic */ void j0(T2 t22, C2 c22) {
        c22.getClass();
        t22.zzam = c22;
        t22.zze |= 4194304;
    }

    public static /* synthetic */ void k0(T2 t22, long j4) {
        t22.zze |= 134217728;
        t22.zzar = j4;
    }

    public static /* synthetic */ void l0(T2 t22, int i4) {
        t22.zzd |= 1048576;
        t22.zzB = i4;
    }

    public static /* synthetic */ void m0(T2 t22, long j4) {
        t22.zze |= 32;
        t22.zzU = j4;
    }

    public static /* synthetic */ void n0(T2 t22, long j4) {
        t22.zzd |= 536870912;
        t22.zzL = j4;
    }

    public static /* synthetic */ void o0(T2 t22, String str) {
        t22.zze |= 131072;
        t22.zzah = str;
    }

    public static /* synthetic */ void p0(T2 t22, String str) {
        t22.zze |= 128;
        t22.zzW = str;
    }

    public static /* synthetic */ void q0(T2 t22, String str) {
        str.getClass();
        t22.zze |= 524288;
        t22.zzaj = str;
    }

    public static /* synthetic */ void r0(T2 t22, int i4) {
        t22.zze |= 8388608;
        t22.zzan = i4;
    }

    public static /* synthetic */ void s0(T2 t22, long j4) {
        t22.zzd |= 524288;
        t22.zzA = j4;
    }

    public static /* synthetic */ void t0(T2 t22, String str) {
        str.getClass();
        t22.zzd |= 256;
        t22.zzp = str;
    }

    public static /* synthetic */ void u0(T2 t22, String str) {
        str.getClass();
        t22.zzd |= Integer.MIN_VALUE;
        t22.zzN = str;
    }

    public static /* synthetic */ void v0(T2 t22, long j4) {
        t22.zze |= 16;
        t22.zzT = j4;
    }

    public static /* synthetic */ void w0(T2 t22, boolean z3) {
        t22.zze |= 65536;
        t22.zzag = z3;
    }

    public static /* synthetic */ void x0(T2 t22, long j4) {
        t22.zzd |= 8;
        t22.zzk = j4;
    }

    public static /* synthetic */ void y0(T2 t22, String str) {
        str.getClass();
        t22.zze |= 16384;
        t22.zzae = str;
    }

    public static /* synthetic */ void z0(T2 t22, int i4, I2 i22) {
        i22.getClass();
        t22.i2();
        t22.zzg.set(i4, i22);
    }

    public final boolean A1() {
        return (this.zze & 8192) != 0;
    }

    public final long A2() {
        return this.zzi;
    }

    public final boolean B1() {
        return (this.zze & 67108864) != 0;
    }

    public final long B2() {
        return this.zzw;
    }

    public final boolean C1() {
        return (this.zzd & 4) != 0;
    }

    public final C0897y2 C2() {
        C0897y2 c0897y2 = this.zzao;
        return c0897y2 == null ? C0897y2.R() : c0897y2;
    }

    public final boolean D1() {
        return (this.zze & 32768) != 0;
    }

    public final C2 D2() {
        C2 c22 = this.zzam;
        return c22 == null ? C2.H() : c22;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004B\u0000\u0002\u0001SB\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<", new Object[]{"zzd", "zze", "zzf", "zzg", I2.class, "zzh", C0795l3.class, "zzi", "zzj", "zzk", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzl", "zzE", "zzF", E2.class, "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", C0881w2.f6989a, "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
        }
        if (i5 == 3) {
            return new T2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new S2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final boolean E1() {
        return (this.zzd & 1024) != 0;
    }

    public final I2 E2(int i4) {
        return (I2) this.zzg.get(i4);
    }

    public final boolean F1() {
        return (this.zzd & 2) != 0;
    }

    public final boolean G1() {
        return (this.zzd & 32768) != 0;
    }

    public final C0778j3 H() {
        C0778j3 c0778j3 = this.zzaq;
        return c0778j3 == null ? C0778j3.I() : c0778j3;
    }

    public final C0795l3 I(int i4) {
        return (C0795l3) this.zzh.get(i4);
    }

    public final String J() {
        return this.zzQ;
    }

    public final String K() {
        return this.zzt;
    }

    public final String L() {
        return this.zzz;
    }

    public final String M() {
        return this.zzs;
    }

    public final String N() {
        return this.zzu;
    }

    public final String O() {
        return this.zzah;
    }

    public final String P() {
        return this.zzW;
    }

    public final String Q() {
        return this.zzaj;
    }

    public final String R() {
        return this.zzp;
    }

    public final String S() {
        return this.zzN;
    }

    public final String T() {
        return this.zzG;
    }

    public final String U() {
        return this.zzD;
    }

    public final String V() {
        return this.zzC;
    }

    public final String W() {
        return this.zzo;
    }

    public final String X() {
        return this.zzn;
    }

    public final String Y() {
        return this.zzx;
    }

    public final String Z() {
        return this.zzac;
    }

    public final String a0() {
        return this.zzq;
    }

    public final boolean a2() {
        return this.zzag;
    }

    public final List b0() {
        return this.zzF;
    }

    public final boolean b2() {
        return this.zzai;
    }

    public final List c0() {
        return this.zzg;
    }

    public final boolean c2() {
        return this.zzy;
    }

    public final List d0() {
        return this.zzh;
    }

    public final boolean d2() {
        return this.zzE;
    }

    public final boolean e2() {
        return (this.zze & 16777216) != 0;
    }

    public final int f0() {
        return this.zzak;
    }

    public final boolean f2() {
        return (this.zzd & 33554432) != 0;
    }

    public final int g1() {
        return this.zzH;
    }

    public final boolean g2() {
        return (this.zze & 4194304) != 0;
    }

    public final boolean h1() {
        return (this.zze & 134217728) != 0;
    }

    public final int h2() {
        return this.zzB;
    }

    public final boolean i1() {
        return (this.zzd & 1048576) != 0;
    }

    public final void i2() {
        InterfaceC0708b5 interfaceC0708b5 = this.zzg;
        if (interfaceC0708b5.c()) {
            return;
        }
        this.zzg = V4.v(interfaceC0708b5);
    }

    public final boolean j1() {
        return (this.zzd & 536870912) != 0;
    }

    public final void j2() {
        InterfaceC0708b5 interfaceC0708b5 = this.zzh;
        if (interfaceC0708b5.c()) {
            return;
        }
        this.zzh = V4.v(interfaceC0708b5);
    }

    public final boolean k1() {
        return (this.zze & 131072) != 0;
    }

    public final int k2() {
        return this.zzan;
    }

    public final boolean l1() {
        return (this.zze & 128) != 0;
    }

    public final int l2() {
        return this.zzg.size();
    }

    public final boolean m1() {
        return (this.zze & 524288) != 0;
    }

    public final int m2() {
        return this.zzf;
    }

    public final boolean n1() {
        return (this.zze & 8388608) != 0;
    }

    public final int n2() {
        return this.zzP;
    }

    public final boolean o1() {
        return (this.zzd & 524288) != 0;
    }

    public final int o2() {
        return this.zzr;
    }

    public final boolean p1() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int p2() {
        return this.zzh.size();
    }

    public final boolean q1() {
        return (this.zze & 16) != 0;
    }

    public final long q2() {
        return this.zzar;
    }

    public final boolean r1() {
        return (this.zzd & 8) != 0;
    }

    public final long r2() {
        return this.zzL;
    }

    public final boolean s1() {
        return (this.zzd & 16384) != 0;
    }

    public final long s2() {
        return this.zzA;
    }

    public final boolean t1() {
        return (this.zze & 262144) != 0;
    }

    public final long t2() {
        return this.zzT;
    }

    public final boolean u1() {
        return (this.zzd & 131072) != 0;
    }

    public final long u2() {
        return this.zzk;
    }

    public final boolean v1() {
        return (this.zzd & 32) != 0;
    }

    public final long v2() {
        return this.zzv;
    }

    public final boolean w1() {
        return (this.zzd & 16) != 0;
    }

    public final long w2() {
        return this.zzm;
    }

    public final boolean x1() {
        return (this.zzd & 1) != 0;
    }

    public final long x2() {
        return this.zzl;
    }

    public final boolean y1() {
        return (this.zze & 2) != 0;
    }

    public final long y2() {
        return this.zzj;
    }

    public final boolean z1() {
        return (this.zzd & 8388608) != 0;
    }

    public final long z2() {
        return this.zzaf;
    }
}
