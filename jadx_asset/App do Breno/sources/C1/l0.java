package C1;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import n1.AbstractC1445l;
import n1.InterfaceC1436c;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ExecutorService f635a = L.c("awaitEvenIfOnMainThread task continuation executor");

    public static /* synthetic */ Object a(CountDownLatch countDownLatch, AbstractC1445l abstractC1445l) {
        countDownLatch.countDown();
        return null;
    }

    public static Object b(AbstractC1445l abstractC1445l) throws InterruptedException, TimeoutException {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        abstractC1445l.g(f635a, new InterfaceC1436c() { // from class: C1.k0
            @Override // n1.InterfaceC1436c
            public final Object a(AbstractC1445l abstractC1445l2) {
                return l0.a(countDownLatch, abstractC1445l2);
            }
        });
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3000L, TimeUnit.MILLISECONDS);
        } else {
            countDownLatch.await(4000L, TimeUnit.MILLISECONDS);
        }
        if (abstractC1445l.m()) {
            return abstractC1445l.j();
        }
        if (abstractC1445l.k()) {
            throw new CancellationException("Task is already canceled");
        }
        if (abstractC1445l.l()) {
            throw new IllegalStateException(abstractC1445l.i());
        }
        throw new TimeoutException();
    }

    public static boolean c(CountDownLatch countDownLatch, long j4, TimeUnit timeUnit) {
        boolean z3 = false;
        try {
            long nanos = timeUnit.toNanos(j4);
            while (true) {
                try {
                    break;
                } catch (InterruptedException unused) {
                    z3 = true;
                    nanos = (System.nanoTime() + nanos) - System.nanoTime();
                }
            }
            return countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
        } finally {
            if (z3) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
