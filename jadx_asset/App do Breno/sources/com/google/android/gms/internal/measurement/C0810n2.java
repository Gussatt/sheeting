package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0810n2 extends V4 implements InterfaceC0868u5 {
    private static final C0810n2 zzb;
    private int zzd;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;

    static {
        C0810n2 c0810n2 = new C0810n2();
        zzb = c0810n2;
        V4.A(C0810n2.class, c0810n2);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i5 == 3) {
            return new C0810n2();
        }
        AbstractC0865u2 abstractC0865u2 = null;
        if (i5 == 4) {
            return new C0802m2(abstractC0865u2);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
