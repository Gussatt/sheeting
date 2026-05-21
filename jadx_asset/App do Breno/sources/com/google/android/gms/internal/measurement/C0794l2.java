package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0794l2 extends V4 implements InterfaceC0868u5 {
    private static final C0794l2 zzb;
    private InterfaceC0708b5 zzd = V4.u();

    static {
        C0794l2 c0794l2 = new C0794l2();
        zzb = c0794l2;
        V4.A(C0794l2.class, c0794l2);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzd"});
        }
        if (i5 == 3) {
            return new C0794l2();
        }
        AbstractC0865u2 abstractC0865u2 = null;
        if (i5 == 4) {
            return new C0786k2(abstractC0865u2);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }
}
