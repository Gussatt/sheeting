package B2;

/* JADX INFO: renamed from: B2.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0217z extends Throwable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f318m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f319n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f320o;

    public C0217z(String str, String str2, Object obj) {
        X2.l.e(str, "code");
        this.f318m = str;
        this.f319n = str2;
        this.f320o = obj;
    }

    public final String a() {
        return this.f318m;
    }

    public final Object b() {
        return this.f320o;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f319n;
    }
}
