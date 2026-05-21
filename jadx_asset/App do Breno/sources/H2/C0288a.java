package H2;

/* JADX INFO: renamed from: H2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0288a extends Throwable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f1968m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f1969n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f1970o;

    public C0288a(String str, String str2, Object obj) {
        X2.l.e(str, "code");
        this.f1968m = str;
        this.f1969n = str2;
        this.f1970o = obj;
    }

    public final String a() {
        return this.f1968m;
    }

    public final Object b() {
        return this.f1970o;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f1969n;
    }
}
