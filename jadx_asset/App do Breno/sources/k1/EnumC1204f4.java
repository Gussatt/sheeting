package k1;

/* JADX INFO: renamed from: k1.f4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC1204f4 {
    UNINITIALIZED("uninitialized"),
    POLICY("eu_consent_policy"),
    DENIED("denied"),
    GRANTED("granted");


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f9430m;

    EnumC1204f4(String str) {
        this.f9430m = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f9430m;
    }
}
