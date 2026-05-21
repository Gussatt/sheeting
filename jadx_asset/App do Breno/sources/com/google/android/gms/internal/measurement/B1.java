package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B1 extends V4 implements InterfaceC0868u5 {
    private static final B1 zzb;
    private int zzd;
    private int zze;
    private InterfaceC0708b5 zzf = V4.u();
    private InterfaceC0708b5 zzg = V4.u();
    private boolean zzh;
    private boolean zzi;

    static {
        B1 b12 = new B1();
        zzb = b12;
        V4.A(B1.class, b12);
    }

    public static /* synthetic */ void N(B1 b12, int i4, D1 d12) {
        d12.getClass();
        InterfaceC0708b5 interfaceC0708b5 = b12.zzg;
        if (!interfaceC0708b5.c()) {
            b12.zzg = V4.v(interfaceC0708b5);
        }
        b12.zzg.set(i4, d12);
    }

    public static /* synthetic */ void O(B1 b12, int i4, L1 l12) {
        l12.getClass();
        InterfaceC0708b5 interfaceC0708b5 = b12.zzf;
        if (!interfaceC0708b5.c()) {
            b12.zzf = V4.v(interfaceC0708b5);
        }
        b12.zzf.set(i4, l12);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzd", "zze", "zzf", L1.class, "zzg", D1.class, "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new B1();
        }
        Q1 q12 = null;
        if (i5 == 4) {
            return new A1(q12);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zze;
    }

    public final int G() {
        return this.zzg.size();
    }

    public final int H() {
        return this.zzf.size();
    }

    public final D1 J(int i4) {
        return (D1) this.zzg.get(i4);
    }

    public final L1 K(int i4) {
        return (L1) this.zzf.get(i4);
    }

    public final List L() {
        return this.zzg;
    }

    public final List M() {
        return this.zzf;
    }

    public final boolean P() {
        return (this.zzd & 1) != 0;
    }
}
