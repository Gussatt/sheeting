package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0835q3 extends V4 implements InterfaceC0868u5 {
    private static final C0835q3 zzb;
    private int zzd;
    private String zze = "";
    private InterfaceC0708b5 zzf = V4.u();

    static {
        C0835q3 c0835q3 = new C0835q3();
        zzb = c0835q3;
        V4.A(C0835q3.class, c0835q3);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzd", "zze", "zzf", C0882w3.class});
        }
        if (i5 == 3) {
            return new C0835q3();
        }
        AbstractC0898y3 abstractC0898y3 = null;
        if (i5 == 4) {
            return new C0827p3(abstractC0898y3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final String G() {
        return this.zze;
    }

    public final List H() {
        return this.zzf;
    }
}
