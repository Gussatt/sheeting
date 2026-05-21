package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0706b3 extends V4 implements InterfaceC0868u5 {
    private static final C0706b3 zzb;
    private int zzd;
    private int zze;
    private InterfaceC0699a5 zzf = V4.s();

    static {
        C0706b3 c0706b3 = new C0706b3();
        zzb = c0706b3;
        V4.A(C0706b3.class, c0706b3);
    }

    public static C0697a3 I() {
        return (C0697a3) zzb.n();
    }

    public static /* synthetic */ void L(C0706b3 c0706b3, Iterable iterable) {
        InterfaceC0699a5 interfaceC0699a5 = c0706b3.zzf;
        if (!interfaceC0699a5.c()) {
            c0706b3.zzf = V4.t(interfaceC0699a5);
        }
        AbstractC0804m4.h(iterable, c0706b3.zzf);
    }

    public static /* synthetic */ void M(C0706b3 c0706b3, int i4) {
        c0706b3.zzd |= 1;
        c0706b3.zze = i4;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i5 == 3) {
            return new C0706b3();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new C0697a3(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final int F() {
        return this.zzf.size();
    }

    public final int G() {
        return this.zze;
    }

    public final long H(int i4) {
        return this.zzf.a(i4);
    }

    public final List K() {
        return this.zzf;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }
}
