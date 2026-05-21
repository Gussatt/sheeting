package a2;

/* JADX INFO: renamed from: a2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0576a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4045b;

    public C0576a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f4044a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f4045b = str2;
    }

    @Override // a2.f
    public String b() {
        return this.f4044a;
    }

    @Override // a2.f
    public String c() {
        return this.f4045b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f4044a.equals(fVar.b()) && this.f4045b.equals(fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f4044a.hashCode() ^ 1000003) * 1000003) ^ this.f4045b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4044a + ", version=" + this.f4045b + "}";
    }
}
