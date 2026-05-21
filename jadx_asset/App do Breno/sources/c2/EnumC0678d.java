package c2;

/* JADX INFO: renamed from: c2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0678d implements Q1.f {
    COLLECTION_UNKNOWN(0),
    COLLECTION_SDK_NOT_INSTALLED(1),
    COLLECTION_ENABLED(2),
    COLLECTION_DISABLED(3),
    COLLECTION_DISABLED_REMOTE(4),
    COLLECTION_SAMPLED(5);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6062m;

    EnumC0678d(int i4) {
        this.f6062m = i4;
    }

    @Override // Q1.f
    public int a() {
        return this.f6062m;
    }
}
