package n1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class r implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CountDownLatch f10662a = new CountDownLatch(1);

    public /* synthetic */ r(q qVar) {
    }

    @Override // n1.InterfaceC1438e
    public final void a() {
        this.f10662a.countDown();
    }

    @Override // n1.InterfaceC1441h
    public final void b(Object obj) {
        this.f10662a.countDown();
    }

    @Override // n1.InterfaceC1440g
    public final void c(Exception exc) {
        this.f10662a.countDown();
    }

    public final void d() throws InterruptedException {
        this.f10662a.await();
    }

    public final boolean e(long j4, TimeUnit timeUnit) {
        return this.f10662a.await(j4, timeUnit);
    }
}
