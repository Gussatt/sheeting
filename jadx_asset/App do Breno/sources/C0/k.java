package C0;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class k implements E0.b {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final k f486a = new k();
    }

    public static k a() {
        return a.f486a;
    }

    public static Executor b() {
        return (Executor) E0.d.d(j.a());
    }

    @Override // J2.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
