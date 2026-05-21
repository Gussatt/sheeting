package K2;

/* JADX INFO: loaded from: classes.dex */
public final class d implements Comparable {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f2500q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f2501r = e.a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2502m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f2503n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f2504o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f2505p;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public d(int i4, int i5, int i6) {
        this.f2502m = i4;
        this.f2503n = i5;
        this.f2504o = i6;
        this.f2505p = f(i4, i5, i6);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(d dVar) {
        X2.l.e(dVar, "other");
        return this.f2505p - dVar.f2505p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && this.f2505p == dVar.f2505p;
    }

    public final int f(int i4, int i5, int i6) {
        if (i4 >= 0 && i4 < 256 && i5 >= 0 && i5 < 256 && i6 >= 0 && i6 < 256) {
            return (i4 << 16) + (i5 << 8) + i6;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i4 + '.' + i5 + '.' + i6).toString());
    }

    public int hashCode() {
        return this.f2505p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2502m);
        sb.append('.');
        sb.append(this.f2503n);
        sb.append('.');
        sb.append(this.f2504o);
        return sb.toString();
    }
}
