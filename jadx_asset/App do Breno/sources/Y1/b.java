package Y1;

/* JADX INFO: loaded from: classes.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f4012a;

    public static b b() {
        if (f4012a == null) {
            f4012a = new b();
        }
        return f4012a;
    }

    @Override // Y1.a
    public long a() {
        return System.currentTimeMillis();
    }
}
