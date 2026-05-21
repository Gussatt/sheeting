package H2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: H2.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0310d0 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f2019n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final EnumC0310d0 f2020o = new EnumC0310d0("OPEN", 0, 0);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final EnumC0310d0 f2021p = new EnumC0310d0("OPEN_MULTIPLE", 1, 1);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final EnumC0310d0 f2022q = new EnumC0310d0("SAVE", 2, 2);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final EnumC0310d0 f2023r = new EnumC0310d0("UNKNOWN", 3, 3);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ EnumC0310d0[] f2024s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ Q2.a f2025t;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f2026m;

    /* JADX INFO: renamed from: H2.d0$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final EnumC0310d0 a(int i4) {
            for (EnumC0310d0 enumC0310d0 : EnumC0310d0.values()) {
                if (enumC0310d0.f() == i4) {
                    return enumC0310d0;
                }
            }
            return null;
        }

        public a() {
        }
    }

    static {
        EnumC0310d0[] enumC0310d0ArrD = d();
        f2024s = enumC0310d0ArrD;
        f2025t = Q2.b.a(enumC0310d0ArrD);
        f2019n = new a(null);
    }

    public EnumC0310d0(String str, int i4, int i5) {
        this.f2026m = i5;
    }

    public static final /* synthetic */ EnumC0310d0[] d() {
        return new EnumC0310d0[]{f2020o, f2021p, f2022q, f2023r};
    }

    public static EnumC0310d0 valueOf(String str) {
        return (EnumC0310d0) Enum.valueOf(EnumC0310d0.class, str);
    }

    public static EnumC0310d0[] values() {
        return (EnumC0310d0[]) f2024s.clone();
    }

    public final int f() {
        return this.f2026m;
    }
}
