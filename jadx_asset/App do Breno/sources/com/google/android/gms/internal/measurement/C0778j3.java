package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0778j3 extends V4 implements InterfaceC0868u5 {
    private static final C0778j3 zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        C0778j3 c0778j3 = new C0778j3();
        zzb = c0778j3;
        V4.A(C0778j3.class, c0778j3);
    }

    public static C0715c3 F() {
        return (C0715c3) zzb.n();
    }

    public static C0778j3 I() {
        return zzb;
    }

    public static /* synthetic */ void J(C0778j3 c0778j3, EnumC0733e3 enumC0733e3) {
        c0778j3.zzf = enumC0733e3.d();
        c0778j3.zzd |= 2;
    }

    public static /* synthetic */ void M(C0778j3 c0778j3, int i4) {
        c0778j3.zzg = i4 - 1;
        c0778j3.zzd |= 4;
    }

    public static /* synthetic */ void N(C0778j3 c0778j3, int i4) {
        c0778j3.zze = i4 - 1;
        c0778j3.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.measurement.V4
    public final Object E(int i4, Object obj, Object obj2) {
        int i5 = i4 - 1;
        if (i5 == 0) {
            return (byte) 1;
        }
        if (i5 == 2) {
            return V4.x(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzd", "zze", C0760h3.f6749a, "zzf", C0724d3.f6676a, "zzg", C0742f3.f6709a});
        }
        if (i5 == 3) {
            return new C0778j3();
        }
        AbstractC0803m3 abstractC0803m3 = null;
        if (i5 == 4) {
            return new C0715c3(abstractC0803m3);
        }
        if (i5 == 5) {
            return zzb;
        }
        throw null;
    }

    public final EnumC0733e3 G() {
        EnumC0733e3 enumC0733e3F = EnumC0733e3.f(this.zzf);
        return enumC0733e3F == null ? EnumC0733e3.CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN : enumC0733e3F;
    }

    public final int K() {
        int iA = AbstractC0751g3.a(this.zzg);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int L() {
        int iA = AbstractC0769i3.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
