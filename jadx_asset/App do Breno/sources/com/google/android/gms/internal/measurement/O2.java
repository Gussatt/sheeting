package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class O2 extends V4 implements InterfaceC0868u5 {
    private static final O2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private A2 zzg;

    static {
        O2 o22 = new O2();
        zzb = o22;
        V4.A(O2.class, o22);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new O2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new N2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
