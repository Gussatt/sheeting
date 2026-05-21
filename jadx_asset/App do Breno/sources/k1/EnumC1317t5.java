package k1;

/* JADX INFO: renamed from: k1.t5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1317t5 {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9866m;

    EnumC1317t5(int i4) {
        this.f9866m = i4;
    }

    public static EnumC1317t5 f(int i4) {
        for (EnumC1317t5 enumC1317t5 : values()) {
            if (enumC1317t5.f9866m == i4) {
                return enumC1317t5;
            }
        }
        return UNKNOWN;
    }

    public final int d() {
        return this.f9866m;
    }
}
