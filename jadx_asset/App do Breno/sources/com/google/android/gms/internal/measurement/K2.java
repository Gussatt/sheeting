package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class K2 extends V4 implements InterfaceC0868u5 {
    private static final K2 zzb;
    private int zzd;
    private String zze = "";
    private long zzf;

    static {
        K2 k22 = new K2();
        zzb = k22;
        V4.A(K2.class, k22);
    }

    public static J2 F() {
        return (J2) zzb.n();
    }

    public static /* synthetic */ void H(K2 k22, long j4) {
        k22.zzd |= 2;
        k22.zzf = j4;
    }

    public static /* synthetic */ void I(K2 k22, String str) {
        str.getClass();
        k22.zzd |= 1;
        k22.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new K2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new J2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
