package X2;

/* JADX INFO: loaded from: classes.dex */
public final class n implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f3986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3987b;

    public n(Class cls, String str) {
        l.e(cls, "jClass");
        l.e(str, "moduleName");
        this.f3986a = cls;
        this.f3987b = str;
    }

    @Override // X2.d
    public Class d() {
        return this.f3986a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && l.a(d(), ((n) obj).d());
    }

    public int hashCode() {
        return d().hashCode();
    }

    public String toString() {
        return d() + " (Kotlin reflection is not available)";
    }
}
