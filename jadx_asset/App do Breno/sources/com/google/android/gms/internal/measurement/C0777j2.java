package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0777j2 extends V4 implements InterfaceC0868u5 {
    private static final C0777j2 zzb;
    private int zzd;
    private long zze;
    private int zzg;
    private boolean zzl;
    private C0723d2 zzq;
    private C0810n2 zzr;
    private C0857t2 zzs;
    private C0826p2 zzt;
    private C0794l2 zzu;
    private String zzf = "";
    private InterfaceC0708b5 zzh = V4.u();
    private InterfaceC0708b5 zzi = V4.u();
    private InterfaceC0708b5 zzj = V4.u();
    private String zzk = "";
    private InterfaceC0708b5 zzm = V4.u();
    private InterfaceC0708b5 zzn = V4.u();
    private String zzo = "";
    private String zzp = "";

    static {
        C0777j2 c0777j2 = new C0777j2();
        zzb = c0777j2;
        V4.A(C0777j2.class, c0777j2);
    }

    public static C0768i2 K() {
        return (C0768i2) zzb.n();
    }

    public static C0777j2 M() {
        return zzb;
    }

    public static /* synthetic */ void W(C0777j2 c0777j2, int i4, C0759h2 c0759h2) {
        c0759h2.getClass();
        InterfaceC0708b5 interfaceC0708b5 = c0777j2.zzi;
        if (!interfaceC0708b5.c()) {
            c0777j2.zzi = V4.v(interfaceC0708b5);
        }
        c0777j2.zzi.set(i4, c0759h2);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0011\u0000\u0001\u0001\u0013\u0011\u0000\u0005\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", C0841r2.class, "zzi", C0759h2.class, "zzj", B1.class, "zzk", "zzl", "zzm", C0850s3.class, "zzn", C0741f2.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i5 == 3) {
            return new C0777j2();
        }
        AbstractC0865u2 abstractC0865u2 = null;
        if (i5 == 4) {
            return new C0768i2(abstractC0865u2);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zzm.size();
    }

    public final int G() {
        return this.zzi.size();
    }

    public final long H() {
        return this.zze;
    }

    public final C0723d2 I() {
        C0723d2 c0723d2 = this.zzq;
        return c0723d2 == null ? C0723d2.G() : c0723d2;
    }

    public final C0759h2 J(int i4) {
        return (C0759h2) this.zzi.get(i4);
    }

    public final C0857t2 N() {
        C0857t2 c0857t2 = this.zzs;
        return c0857t2 == null ? C0857t2.H() : c0857t2;
    }

    public final String O() {
        return this.zzf;
    }

    public final String P() {
        return this.zzo;
    }

    public final List Q() {
        return this.zzj;
    }

    public final List R() {
        return this.zzn;
    }

    public final List S() {
        return this.zzm;
    }

    public final List T() {
        return this.zzh;
    }

    public final boolean X() {
        return (this.zzd & 128) != 0;
    }

    public final boolean Y() {
        return (this.zzd & 2) != 0;
    }

    public final boolean Z() {
        return (this.zzd & 512) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 1) != 0;
    }
}
