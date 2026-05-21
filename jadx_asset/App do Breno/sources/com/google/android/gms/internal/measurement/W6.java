package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class W6 implements V6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AbstractC0752g4 f6615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AbstractC0752g4 f6616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC0752g4 f6617c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC0752g4 f6618d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC0752g4 f6619e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC0752g4 f6620f;

    static {
        C0725d4 c0725d4A = new C0725d4(U3.a("com.google.android.gms.measurement")).b().a();
        f6615a = c0725d4A.f("measurement.test.boolean_flag", false);
        f6616b = c0725d4A.d("measurement.test.cached_long_flag", -1L);
        f6617c = c0725d4A.c("measurement.test.double_flag", -3.0d);
        f6618d = c0725d4A.d("measurement.test.int_flag", -2L);
        f6619e = c0725d4A.d("measurement.test.long_flag", -1L);
        f6620f = c0725d4A.e("measurement.test.string_flag", "---");
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final double a() {
        return ((Double) f6617c.b()).doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final long b() {
        return ((Long) f6616b.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final long c() {
        return ((Long) f6618d.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final long d() {
        return ((Long) f6619e.b()).longValue();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final String e() {
        return (String) f6620f.b();
    }

    @Override // com.google.android.gms.internal.measurement.V6
    public final boolean h() {
        return ((Boolean) f6615a.b()).booleanValue();
    }
}
