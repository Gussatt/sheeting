package F1;

import F1.G;

/* JADX INFO: loaded from: classes.dex */
public final class E extends G.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1074c;

    public E(String str, String str2, boolean z3) {
        if (str == null) {
            throw new NullPointerException("Null osRelease");
        }
        this.f1072a = str;
        if (str2 == null) {
            throw new NullPointerException("Null osCodeName");
        }
        this.f1073b = str2;
        this.f1074c = z3;
    }

    @Override // F1.G.c
    public boolean b() {
        return this.f1074c;
    }

    @Override // F1.G.c
    public String c() {
        return this.f1073b;
    }

    @Override // F1.G.c
    public String d() {
        return this.f1072a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.c) {
            G.c cVar = (G.c) obj;
            if (this.f1072a.equals(cVar.d()) && this.f1073b.equals(cVar.c()) && this.f1074c == cVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f1072a.hashCode() ^ 1000003) * 1000003) ^ this.f1073b.hashCode()) * 1000003) ^ (this.f1074c ? 1231 : 1237);
    }

    public String toString() {
        return "OsData{osRelease=" + this.f1072a + ", osCodeName=" + this.f1073b + ", isRooted=" + this.f1074c + "}";
    }
}
