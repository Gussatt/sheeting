package h3;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f7515a = m3.G.f("kotlinx.coroutines.main.delay", false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final S f7516b = b();

    public static final S a() {
        return f7516b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final S b() {
        if (!f7515a) {
            return N.f7512u;
        }
        B0 b0C = W.c();
        return (m3.v.c(b0C) || !(b0C instanceof S)) ? N.f7512u : (S) b0C;
    }
}
