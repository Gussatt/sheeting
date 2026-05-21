package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0723d2 extends V4 implements InterfaceC0868u5 {
    private static final C0723d2 zzb;
    private int zzd;
    private boolean zzh;
    private InterfaceC0708b5 zze = V4.u();
    private InterfaceC0708b5 zzf = V4.u();
    private InterfaceC0708b5 zzg = V4.u();
    private InterfaceC0708b5 zzi = V4.u();

    static {
        C0723d2 c0723d2 = new C0723d2();
        zzb = c0723d2;
        V4.A(C0723d2.class, c0723d2);
    }

    public static C0723d2 G() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzd", "zze", T1.class, "zzf", W1.class, "zzg", C0714c2.class, "zzh", "zzi", T1.class});
        }
        if (i5 == 3) {
            return new C0723d2();
        }
        AbstractC0865u2 abstractC0865u2 = null;
        if (i5 == 4) {
            return new R1(abstractC0865u2);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final List H() {
        return this.zzg;
    }

    public final List I() {
        return this.zze;
    }

    public final List J() {
        return this.zzf;
    }

    public final List K() {
        return this.zzi;
    }

    public final boolean L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zzd & 1) != 0;
    }
}
