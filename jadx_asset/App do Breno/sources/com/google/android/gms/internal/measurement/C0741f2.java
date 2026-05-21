package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.f2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0741f2 extends V4 implements InterfaceC0868u5 {
    private static final C0741f2 zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC0708b5 zzf = V4.u();
    private boolean zzg;

    static {
        C0741f2 c0741f2 = new C0741f2();
        zzb = c0741f2;
        V4.A(C0741f2.class, c0741f2);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzd", "zze", "zzf", C0826p2.class, "zzg"});
        }
        if (i5 == 3) {
            return new C0741f2();
        }
        AbstractC0865u2 abstractC0865u2 = null;
        if (i5 == 4) {
            return new C0732e2(abstractC0865u2);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String G() {
        return this.zze;
    }
}
