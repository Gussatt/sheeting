package C1;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f582a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f583b = new AtomicInteger();

    public int a() {
        return this.f583b.get();
    }

    public int b() {
        return this.f582a.get();
    }

    public void c() {
        this.f583b.getAndIncrement();
    }

    public void d() {
        this.f582a.getAndIncrement();
    }

    public void e() {
        this.f583b.set(0);
    }
}
