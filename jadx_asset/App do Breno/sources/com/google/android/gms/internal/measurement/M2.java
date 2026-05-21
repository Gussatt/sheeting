package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class M2 extends V4 implements InterfaceC0868u5 {
    private static final M2 zzb;
    private int zzd;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private InterfaceC0708b5 zzj = V4.u();

    static {
        M2 m22 = new M2();
        zzb = m22;
        V4.A(M2.class, m22);
    }

    public static L2 J() {
        return (L2) zzb.n();
    }

    public static /* synthetic */ void O(M2 m22, Iterable iterable) {
        m22.d0();
        AbstractC0804m4.h(iterable, m22.zzj);
    }

    public static /* synthetic */ void P(M2 m22, M2 m23) {
        m23.getClass();
        m22.d0();
        m22.zzj.add(m23);
    }

    public static /* synthetic */ void Q(M2 m22) {
        m22.zzd &= -17;
        m22.zzi = 0.0d;
    }

    public static /* synthetic */ void R(M2 m22) {
        m22.zzd &= -5;
        m22.zzg = 0L;
    }

    public static /* synthetic */ void T(M2 m22) {
        m22.zzd &= -3;
        m22.zzf = zzb.zzf;
    }

    public static /* synthetic */ void U(M2 m22, double d4) {
        m22.zzd |= 16;
        m22.zzi = d4;
    }

    public static /* synthetic */ void V(M2 m22, long j4) {
        m22.zzd |= 4;
        m22.zzg = j4;
    }

    public static /* synthetic */ void W(M2 m22, String str) {
        str.getClass();
        m22.zzd |= 1;
        m22.zze = str;
    }

    public static /* synthetic */ void X(M2 m22, String str) {
        str.getClass();
        m22.zzd |= 2;
        m22.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", M2.class});
        }
        if (i5 == 3) {
            return new M2();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new L2(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final double F() {
        return this.zzi;
    }

    public final float G() {
        return this.zzh;
    }

    public final int H() {
        return this.zzj.size();
    }

    public final long I() {
        return this.zzg;
    }

    public final String L() {
        return this.zze;
    }

    public final String M() {
        return this.zzf;
    }

    public final List N() {
        return this.zzj;
    }

    public final boolean Y() {
        return (this.zzd & 16) != 0;
    }

    public final boolean Z() {
        return (this.zzd & 8) != 0;
    }

    public final boolean a0() {
        return (this.zzd & 4) != 0;
    }

    public final boolean b0() {
        return (this.zzd & 1) != 0;
    }

    public final boolean c0() {
        return (this.zzd & 2) != 0;
    }

    public final void d0() {
        InterfaceC0708b5 interfaceC0708b5 = this.zzj;
        if (interfaceC0708b5.c()) {
            return;
        }
        this.zzj = V4.v(interfaceC0708b5);
    }
}
