package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0857t2 extends V4 implements InterfaceC0868u5 {
    private static final C0857t2 zzb;
    private int zzd;
    private int zzh;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzi = "";

    static {
        C0857t2 c0857t2 = new C0857t2();
        zzb = c0857t2;
        V4.A(C0857t2.class, c0857t2);
    }

    public static C0857t2 H() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new C0857t2();
        }
        AbstractC0865u2 abstractC0865u2 = null;
        if (i5 == 4) {
            return new C0849s2(abstractC0865u2);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zzh;
    }

    public final String I() {
        return this.zzf;
    }

    public final String J() {
        return this.zzi;
    }

    public final String K() {
        return this.zze;
    }
}
