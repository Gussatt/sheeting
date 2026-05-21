package O2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f2865m = new a("COROUTINE_SUSPENDED", 0);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f2866n = new a("UNDECIDED", 1);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f2867o = new a("RESUMED", 2);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a[] f2868p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ Q2.a f2869q;

    static {
        a[] aVarArrD = d();
        f2868p = aVarArrD;
        f2869q = Q2.b.a(aVarArrD);
    }

    public a(String str, int i4) {
    }

    public static final /* synthetic */ a[] d() {
        return new a[]{f2865m, f2866n, f2867o};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f2868p.clone();
    }
}
