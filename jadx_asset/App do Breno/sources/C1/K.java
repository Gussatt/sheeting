package C1;

/* JADX INFO: loaded from: classes.dex */
public enum K {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f559m;

    K(int i4) {
        this.f559m = i4;
    }

    public static K f(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int g() {
        return this.f559m;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f559m);
    }
}
