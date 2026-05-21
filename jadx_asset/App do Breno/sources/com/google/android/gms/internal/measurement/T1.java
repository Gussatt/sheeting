package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class T1 extends V4 implements InterfaceC0868u5 {
    private static final T1 zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        T1 t12 = new T1();
        zzb = t12;
        V4.A(T1.class, t12);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", Z1.f6634a, "zzf", X1.f6623a});
        }
        if (i5 == 3) {
            return new T1();
        }
        AbstractC0865u2 abstractC0865u2 = null;
        if (i5 == 4) {
            return new S1(abstractC0865u2);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int G() {
        int iA = Y1.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int H() {
        int iA = AbstractC0696a2.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
