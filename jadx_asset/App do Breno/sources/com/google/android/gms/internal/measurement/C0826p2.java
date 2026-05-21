package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0826p2 extends V4 implements InterfaceC0868u5 {
    private static final C0826p2 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        C0826p2 c0826p2 = new C0826p2();
        zzb = c0826p2;
        V4.A(C0826p2.class, c0826p2);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new C0826p2();
        }
        AbstractC0865u2 abstractC0865u2 = null;
        if (i5 == 4) {
            return new C0818o2(abstractC0865u2);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
