package c2;

/* JADX INFO: renamed from: c2.r, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0692r implements Q1.f {
    LOG_ENVIRONMENT_UNKNOWN(0),
    LOG_ENVIRONMENT_AUTOPUSH(1),
    LOG_ENVIRONMENT_STAGING(2),
    LOG_ENVIRONMENT_PROD(3);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6098m;

    EnumC0692r(int i4) {
        this.f6098m = i4;
    }

    @Override // Q1.f
    public int a() {
        return this.f6098m;
    }
}
