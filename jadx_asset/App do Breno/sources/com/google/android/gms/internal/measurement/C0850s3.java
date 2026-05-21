package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0850s3 extends V4 implements InterfaceC0868u5 {
    private static final C0850s3 zzb;
    private int zzd;
    private InterfaceC0708b5 zze = V4.u();
    private C0819o3 zzf;

    static {
        C0850s3 c0850s3 = new C0850s3();
        zzb = c0850s3;
        V4.A(C0850s3.class, c0850s3);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzd", "zze", C0882w3.class, "zzf"});
        }
        if (i5 == 3) {
            return new C0850s3();
        }
        AbstractC0898y3 abstractC0898y3 = null;
        if (i5 == 4) {
            return new C0842r3(abstractC0898y3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final C0819o3 F() {
        C0819o3 c0819o3 = this.zzf;
        return c0819o3 == null ? C0819o3.H() : c0819o3;
    }

    public final List H() {
        return this.zze;
    }
}
