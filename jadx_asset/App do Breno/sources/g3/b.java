package g3;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7308a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal[] f7309b;

    static {
        ThreadLocal[] threadLocalArr = new ThreadLocal[4];
        for (int i4 = 0; i4 < 4; i4++) {
            threadLocalArr[i4] = new ThreadLocal();
        }
        f7309b = threadLocalArr;
    }

    public static final boolean a() {
        return f7308a;
    }
}
