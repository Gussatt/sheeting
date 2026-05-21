package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0882w3 extends V4 implements InterfaceC0868u5 {
    private static final C0882w3 zzb;
    private int zzd;
    private int zze;
    private InterfaceC0708b5 zzf = V4.u();
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        C0882w3 c0882w3 = new C0882w3();
        zzb = c0882w3;
        V4.A(C0882w3.class, c0882w3);
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzd", "zze", C0866u3.f6975a, "zzf", C0882w3.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i5 == 3) {
            return new C0882w3();
        }
        AbstractC0898y3 abstractC0898y3 = null;
        if (i5 == 4) {
            return new C0858t3(abstractC0898y3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final double F() {
        return this.zzj;
    }

    public final String H() {
        return this.zzg;
    }

    public final String I() {
        return this.zzh;
    }

    public final List J() {
        return this.zzf;
    }

    public final boolean K() {
        return this.zzi;
    }

    public final boolean L() {
        return (this.zzd & 8) != 0;
    }

    public final boolean M() {
        return (this.zzd & 16) != 0;
    }

    public final boolean N() {
        return (this.zzd & 4) != 0;
    }

    public final int O() {
        int iA = AbstractC0874v3.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
