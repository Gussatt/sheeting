package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class J1 extends V4 implements InterfaceC0868u5 {
    private static final J1 zzb;
    private int zzd;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        J1 j12 = new J1();
        zzb = j12;
        V4.A(J1.class, j12);
    }

    public static J1 G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzd", "zze", H1.f6359a, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new J1();
        }
        Q1 q12 = null;
        if (i5 == 4) {
            return new G1(q12);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String H() {
        return this.zzg;
    }

    public final String I() {
        return this.zzi;
    }

    public final String J() {
        return this.zzh;
    }

    public final boolean K() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzd & 1) != 0;
    }

    public final boolean M() {
        return (this.zzd & 4) != 0;
    }

    public final boolean N() {
        return (this.zzd & 2) != 0;
    }

    public final boolean O() {
        return (this.zzd & 16) != 0;
    }

    public final boolean P() {
        return (this.zzd & 8) != 0;
    }

    public final int Q() {
        int iA = I1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
