package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class G2 extends V4 implements InterfaceC0868u5 {
    private static final G2 zzb;
    private int zzd;
    private int zze;
    private long zzf;

    static {
        G2 g22 = new G2();
        zzb = g22;
        V4.A(G2.class, g22);
    }

    public static F2 H() {
        return (F2) zzb.n();
    }

    public static /* synthetic */ void J(G2 g22, long j4) {
        g22.zzd |= 2;
        g22.zzf = j4;
    }

    public static /* synthetic */ void K(G2 g22, int i4) {
        g22.zzd |= 1;
        g22.zze = i4;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new G2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new F2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zze;
    }

    public final long G() {
        return this.zzf;
    }

    public final boolean L() {
        return (this.zzd & 2) != 0;
    }

    public final boolean M() {
        return (this.zzd & 1) != 0;
    }
}
