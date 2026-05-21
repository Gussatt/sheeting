package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class I2 extends V4 implements InterfaceC0868u5 {
    private static final I2 zzb;
    private int zzd;
    private InterfaceC0708b5 zze = V4.u();
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;

    static {
        I2 i22 = new I2();
        zzb = i22;
        V4.A(I2.class, i22);
    }

    public static H2 J() {
        return (H2) zzb.n();
    }

    public static /* synthetic */ void O(I2 i22, Iterable iterable) {
        i22.Z();
        AbstractC0804m4.h(iterable, i22.zze);
    }

    public static /* synthetic */ void P(I2 i22, M2 m22) {
        m22.getClass();
        i22.Z();
        i22.zze.add(m22);
    }

    public static /* synthetic */ void R(I2 i22, int i4) {
        i22.Z();
        i22.zze.remove(i4);
    }

    public static /* synthetic */ void S(I2 i22, String str) {
        str.getClass();
        i22.zzd |= 1;
        i22.zzf = str;
    }

    public static /* synthetic */ void T(I2 i22, int i4, M2 m22) {
        m22.getClass();
        i22.Z();
        i22.zze.set(i4, m22);
    }

    public static /* synthetic */ void U(I2 i22, long j4) {
        i22.zzd |= 4;
        i22.zzh = j4;
    }

    public static /* synthetic */ void V(I2 i22, long j4) {
        i22.zzd |= 2;
        i22.zzg = j4;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003", new Object[]{"zzd", "zze", M2.class, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i5 == 3) {
            return new I2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new H2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zzi;
    }

    public final int G() {
        return this.zze.size();
    }

    public final long H() {
        return this.zzh;
    }

    public final long I() {
        return this.zzg;
    }

    public final M2 L(int i4) {
        return (M2) this.zze.get(i4);
    }

    public final String M() {
        return this.zzf;
    }

    public final List N() {
        return this.zze;
    }

    public final boolean W() {
        return (this.zzd & 8) != 0;
    }

    public final boolean X() {
        return (this.zzd & 4) != 0;
    }

    public final boolean Y() {
        return (this.zzd & 2) != 0;
    }

    public final void Z() {
        InterfaceC0708b5 interfaceC0708b5 = this.zze;
        if (interfaceC0708b5.c()) {
            return;
        }
        this.zze = V4.v(interfaceC0708b5);
    }
}
