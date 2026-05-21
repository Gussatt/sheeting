package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0759h2 extends V4 implements InterfaceC0868u5 {
    private static final C0759h2 zzb;
    private int zzd;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        C0759h2 c0759h2 = new C0759h2();
        zzb = c0759h2;
        V4.A(C0759h2.class, c0759h2);
    }

    public static /* synthetic */ void I(C0759h2 c0759h2, String str) {
        str.getClass();
        c0759h2.zzd |= 1;
        c0759h2.zze = str;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i5 == 3) {
            return new C0759h2();
        }
        AbstractC0865u2 abstractC0865u2 = null;
        if (i5 == 4) {
            return new C0750g2(abstractC0865u2);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zzh;
    }

    public final String H() {
        return this.zze;
    }

    public final boolean J() {
        return this.zzf;
    }

    public final boolean K() {
        return this.zzg;
    }

    public final boolean L() {
        return (this.zzd & 2) != 0;
    }

    public final boolean M() {
        return (this.zzd & 4) != 0;
    }

    public final boolean N() {
        return (this.zzd & 8) != 0;
    }
}
