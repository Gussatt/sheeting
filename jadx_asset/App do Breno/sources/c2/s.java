package c2;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6102d;

    public s(String str, int i4, int i5, boolean z3) {
        X2.l.e(str, "processName");
        this.f6099a = str;
        this.f6100b = i4;
        this.f6101c = i5;
        this.f6102d = z3;
    }

    public final int a() {
        return this.f6101c;
    }

    public final int b() {
        return this.f6100b;
    }

    public final String c() {
        return this.f6099a;
    }

    public final boolean d() {
        return this.f6102d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return X2.l.a(this.f6099a, sVar.f6099a) && this.f6100b == sVar.f6100b && this.f6101c == sVar.f6101c && this.f6102d == sVar.f6102d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.f6099a.hashCode() * 31) + Integer.hashCode(this.f6100b)) * 31) + Integer.hashCode(this.f6101c)) * 31;
        boolean z3 = this.f6102d;
        ?? r12 = z3;
        if (z3) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f6099a + ", pid=" + this.f6100b + ", importance=" + this.f6101c + ", isDefaultProcess=" + this.f6102d + ')';
    }
}
