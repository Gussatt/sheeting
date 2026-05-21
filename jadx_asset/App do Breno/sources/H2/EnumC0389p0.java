package H2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H2.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0389p0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f2104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0389p0 f2105o = new EnumC0389p0("ALWAYS", 0, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0389p0 f2106p = new EnumC0389p0("IF_CONTENT_SCROLLS", 1, 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0389p0 f2107q = new EnumC0389p0("NEVER", 2, 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0389p0 f2108r = new EnumC0389p0("UNKNOWN", 3, 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC0389p0[] f2109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ Q2.a f2110t;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2111m;

    /* JADX INFO: renamed from: H2.p0$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final EnumC0389p0 a(int i4) {
            for (EnumC0389p0 enumC0389p0 : EnumC0389p0.values()) {
                if (enumC0389p0.f() == i4) {
                    return enumC0389p0;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        EnumC0389p0[] enumC0389p0ArrD = d();
        f2109s = enumC0389p0ArrD;
        f2110t = Q2.b.a(enumC0389p0ArrD);
        f2104n = new a(null);
    }

    public EnumC0389p0(String str, int i4, int i5) {
        this.f2111m = i5;
    }

    public static final /* synthetic */ EnumC0389p0[] d() {
        return new EnumC0389p0[]{f2105o, f2106p, f2107q, f2108r};
    }

    public static EnumC0389p0 valueOf(String str) {
        return (EnumC0389p0) Enum.valueOf(EnumC0389p0.class, str);
    }

    public static EnumC0389p0[] values() {
        return (EnumC0389p0[]) f2109s.clone();
    }

    public final int f() {
        return this.f2111m;
    }
}
