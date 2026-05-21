package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0819o3 extends V4 implements InterfaceC0868u5 {
    private static final C0819o3 zzb;
    private InterfaceC0708b5 zzd = V4.u();

    static {
        C0819o3 c0819o3 = new C0819o3();
        zzb = c0819o3;
        V4.A(C0819o3.class, c0819o3);
    }

    public static C0819o3 H() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", C0835q3.class});
        }
        if (i5 == 3) {
            return new C0819o3();
        }
        AbstractC0898y3 abstractC0898y3 = null;
        if (i5 == 4) {
            return new C0811n3(abstractC0898y3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zzd.size();
    }

    public final List I() {
        return this.zzd;
    }
}
