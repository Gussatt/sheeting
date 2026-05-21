package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class P1 extends V4 implements InterfaceC0868u5 {
    private static final P1 zzb;
    private int zzd;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private InterfaceC0708b5 zzh = V4.u();

    static {
        P1 p12 = new P1();
        zzb = p12;
        V4.A(P1.class, p12);
    }

    public static P1 H() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzd", "zze", N1.f6416a, "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new P1();
        }
        Q1 q12 = null;
        if (i5 == 4) {
            return new M1(q12);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zzh.size();
    }

    public final String I() {
        return this.zzf;
    }

    public final List J() {
        return this.zzh;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzd & 4) != 0;
    }

    public final boolean M() {
        return (this.zzd & 2) != 0;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }

    public final int O() {
        int iA = O1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
