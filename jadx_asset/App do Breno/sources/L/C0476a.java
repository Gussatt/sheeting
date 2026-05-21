package L;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: L.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0476a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f2522a;

    public C0476a(int i4) {
        this.f2522a = new AtomicInteger(i4);
    }

    public final int a() {
        return this.f2522a.decrementAndGet();
    }

    public final int b() {
        return this.f2522a.get();
    }

    public final int c() {
        return this.f2522a.getAndIncrement();
    }

    public final int d() {
        return this.f2522a.incrementAndGet();
    }
}
