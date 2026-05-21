package k1;

import V0.AbstractC0549h;

/* JADX INFO: renamed from: k1.F, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1146F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f8972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f8975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f8976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Long f8977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f8978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Long f8979j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Boolean f8980k;

    public C1146F(String str, String str2, long j4, long j5, long j6, long j7, long j8, Long l4, Long l5, Long l6, Boolean bool) {
        AbstractC0549h.d(str);
        AbstractC0549h.d(str2);
        AbstractC0549h.a(j4 >= 0);
        AbstractC0549h.a(j5 >= 0);
        AbstractC0549h.a(j6 >= 0);
        AbstractC0549h.a(j8 >= 0);
        this.f8970a = str;
        this.f8971b = str2;
        this.f8972c = j4;
        this.f8973d = j5;
        this.f8974e = j6;
        this.f8975f = j7;
        this.f8976g = j8;
        this.f8977h = l4;
        this.f8978i = l5;
        this.f8979j = l6;
        this.f8980k = bool;
    }

    public final C1146F a(Long l4, Long l5, Boolean bool) {
        return new C1146F(this.f8970a, this.f8971b, this.f8972c, this.f8973d, this.f8974e, this.f8975f, this.f8976g, this.f8977h, l4, l5, bool);
    }

    public final C1146F b(long j4, long j5) {
        return new C1146F(this.f8970a, this.f8971b, this.f8972c, this.f8973d, this.f8974e, this.f8975f, j4, Long.valueOf(j5), this.f8978i, this.f8979j, this.f8980k);
    }

    public final C1146F c(long j4) {
        return new C1146F(this.f8970a, this.f8971b, this.f8972c, this.f8973d, this.f8974e, j4, this.f8976g, this.f8977h, this.f8978i, this.f8979j, this.f8980k);
    }
}
