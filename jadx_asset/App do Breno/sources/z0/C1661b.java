package z0;

/* JADX INFO: renamed from: z0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1661b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12084a;

    public C1661b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f12084a = str;
    }

    public static C1661b b(String str) {
        return new C1661b(str);
    }

    public String a() {
        return this.f12084a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1661b) {
            return this.f12084a.equals(((C1661b) obj).f12084a);
        }
        return false;
    }

    public int hashCode() {
        return this.f12084a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f12084a + "\"}";
    }
}
