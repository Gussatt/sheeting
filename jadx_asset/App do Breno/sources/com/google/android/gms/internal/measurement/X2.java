package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class X2 extends V4 implements InterfaceC0868u5 {
    private static final X2 zzb;
    private int zzd;
    private int zze = 1;
    private InterfaceC0708b5 zzf = V4.u();

    static {
        X2 x22 = new X2();
        zzb = x22;
        V4.A(X2.class, x22);
    }

    public static U2 F() {
        return (U2) zzb.n();
    }

    public static /* synthetic */ void H(X2 x22, K2 k22) {
        k22.getClass();
        InterfaceC0708b5 interfaceC0708b5 = x22.zzf;
        if (!interfaceC0708b5.c()) {
            x22.zzf = V4.v(interfaceC0708b5);
        }
        x22.zzf.add(k22);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzd", "zze", V2.f6602a, "zzf", K2.class});
        }
        if (i5 == 3) {
            return new X2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new U2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
