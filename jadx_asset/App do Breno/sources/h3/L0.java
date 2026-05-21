package h3;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L0 f7509a = new L0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ThreadLocal f7510b = m3.K.a(new m3.F("ThreadLocalEventLoop"));

    public final AbstractC0995a0 a() {
        return (AbstractC0995a0) f7510b.get();
    }

    public final AbstractC0995a0 b() {
        ThreadLocal threadLocal = f7510b;
        AbstractC0995a0 abstractC0995a0 = (AbstractC0995a0) threadLocal.get();
        if (abstractC0995a0 != null) {
            return abstractC0995a0;
        }
        AbstractC0995a0 abstractC0995a0A = AbstractC1001d0.a();
        threadLocal.set(abstractC0995a0A);
        return abstractC0995a0A;
    }

    public final void c() {
        f7510b.set(null);
    }

    public final void d(AbstractC0995a0 abstractC0995a0) {
        f7510b.set(abstractC0995a0);
    }
}
