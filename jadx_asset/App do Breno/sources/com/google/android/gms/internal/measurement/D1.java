package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D1 extends V4 implements InterfaceC0868u5 {
    private static final D1 zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private InterfaceC0708b5 zzg = V4.u();
    private boolean zzh;
    private J1 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        D1 d12 = new D1();
        zzb = d12;
        V4.A(D1.class, d12);
    }

    public static C1 H() {
        return (C1) zzb.n();
    }

    public static /* synthetic */ void N(D1 d12, String str) {
        d12.zzd |= 2;
        d12.zzf = str;
    }

    public static /* synthetic */ void O(D1 d12, int i4, F1 f12) {
        f12.getClass();
        InterfaceC0708b5 interfaceC0708b5 = d12.zzg;
        if (!interfaceC0708b5.c()) {
            d12.zzg = V4.v(interfaceC0708b5);
        }
        d12.zzg.set(i4, f12);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzd", "zze", "zzf", "zzg", F1.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i5 == 3) {
            return new D1();
        }
        Q1 q12 = null;
        if (i5 == 4) {
            return new C1(q12);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zzg.size();
    }

    public final int G() {
        return this.zze;
    }

    public final F1 J(int i4) {
        return (F1) this.zzg.get(i4);
    }

    public final J1 K() {
        J1 j12 = this.zzi;
        return j12 == null ? J1.G() : j12;
    }

    public final String L() {
        return this.zzf;
    }

    public final List M() {
        return this.zzg;
    }

    public final boolean P() {
        return this.zzj;
    }

    public final boolean Q() {
        return this.zzk;
    }

    public final boolean R() {
        return this.zzl;
    }

    public final boolean S() {
        return (this.zzd & 8) != 0;
    }

    public final boolean T() {
        return (this.zzd & 1) != 0;
    }

    public final boolean U() {
        return (this.zzd & 64) != 0;
    }
}
