package g3;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f7310n = new d("NANOSECONDS", 0, TimeUnit.NANOSECONDS);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f7311o = new d("MICROSECONDS", 1, TimeUnit.MICROSECONDS);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f7312p = new d("MILLISECONDS", 2, TimeUnit.MILLISECONDS);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final d f7313q = new d("SECONDS", 3, TimeUnit.SECONDS);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f7314r = new d("MINUTES", 4, TimeUnit.MINUTES);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f7315s = new d("HOURS", 5, TimeUnit.HOURS);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f7316t = new d("DAYS", 6, TimeUnit.DAYS);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ d[] f7317u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ Q2.a f7318v;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final TimeUnit f7319m;

    static {
        d[] dVarArrD = d();
        f7317u = dVarArrD;
        f7318v = Q2.b.a(dVarArrD);
    }

    public d(String str, int i4, TimeUnit timeUnit) {
        this.f7319m = timeUnit;
    }

    public static final /* synthetic */ d[] d() {
        return new d[]{f7310n, f7311o, f7312p, f7313q, f7314r, f7315s, f7316t};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) f7317u.clone();
    }

    public final TimeUnit f() {
        return this.f7319m;
    }
}
