package F1;

import F1.G;

/* JADX INFO: loaded from: classes.dex */
public final class D extends G.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f1068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f1069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f1070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f1071i;

    public D(int i4, String str, int i5, long j4, long j5, boolean z3, int i6, String str2, String str3) {
        this.f1063a = i4;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f1064b = str;
        this.f1065c = i5;
        this.f1066d = j4;
        this.f1067e = j5;
        this.f1068f = z3;
        this.f1069g = i6;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        this.f1070h = str2;
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
        this.f1071i = str3;
    }

    @Override // F1.G.b
    public int a() {
        return this.f1063a;
    }

    @Override // F1.G.b
    public int b() {
        return this.f1065c;
    }

    @Override // F1.G.b
    public long d() {
        return this.f1067e;
    }

    @Override // F1.G.b
    public boolean e() {
        return this.f1068f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G.b) {
            G.b bVar = (G.b) obj;
            if (this.f1063a == bVar.a() && this.f1064b.equals(bVar.g()) && this.f1065c == bVar.b() && this.f1066d == bVar.j() && this.f1067e == bVar.d() && this.f1068f == bVar.e() && this.f1069g == bVar.i() && this.f1070h.equals(bVar.f()) && this.f1071i.equals(bVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // F1.G.b
    public String f() {
        return this.f1070h;
    }

    @Override // F1.G.b
    public String g() {
        return this.f1064b;
    }

    @Override // F1.G.b
    public String h() {
        return this.f1071i;
    }

    public int hashCode() {
        int iHashCode = (((((this.f1063a ^ 1000003) * 1000003) ^ this.f1064b.hashCode()) * 1000003) ^ this.f1065c) * 1000003;
        long j4 = this.f1066d;
        int i4 = (iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j5 = this.f1067e;
        return ((((((((i4 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003) ^ (this.f1068f ? 1231 : 1237)) * 1000003) ^ this.f1069g) * 1000003) ^ this.f1070h.hashCode()) * 1000003) ^ this.f1071i.hashCode();
    }

    @Override // F1.G.b
    public int i() {
        return this.f1069g;
    }

    @Override // F1.G.b
    public long j() {
        return this.f1066d;
    }

    public String toString() {
        return "DeviceData{arch=" + this.f1063a + ", model=" + this.f1064b + ", availableProcessors=" + this.f1065c + ", totalRam=" + this.f1066d + ", diskSpace=" + this.f1067e + ", isEmulator=" + this.f1068f + ", state=" + this.f1069g + ", manufacturer=" + this.f1070h + ", modelClass=" + this.f1071i + "}";
    }
}
