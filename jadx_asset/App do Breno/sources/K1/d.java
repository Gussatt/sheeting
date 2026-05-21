package K1;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f2462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f2463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f2466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f2467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f2468h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2470b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f2471c;

        public a(boolean z3, boolean z4, boolean z5) {
            this.f2469a = z3;
            this.f2470b = z4;
            this.f2471c = z5;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f2473b;

        public b(int i4, int i5) {
            this.f2472a = i4;
            this.f2473b = i5;
        }
    }

    public d(long j4, b bVar, a aVar, int i4, int i5, double d4, double d5, int i6) {
        this.f2463c = j4;
        this.f2461a = bVar;
        this.f2462b = aVar;
        this.f2464d = i4;
        this.f2465e = i5;
        this.f2466f = d4;
        this.f2467g = d5;
        this.f2468h = i6;
    }

    public boolean a(long j4) {
        return this.f2463c < j4;
    }
}
