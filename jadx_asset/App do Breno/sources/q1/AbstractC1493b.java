package q1;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import o1.AbstractC1467d;
import o1.AbstractC1471h;

/* JADX INFO: renamed from: q1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1493b extends AbstractC1494c {

    /* JADX INFO: renamed from: q1.b$a */
    public static final class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Future f11064m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final InterfaceC1492a f11065n;

        public a(Future future, InterfaceC1492a interfaceC1492a) {
            this.f11064m = future;
            this.f11065n = interfaceC1492a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f11065n.b(AbstractC1493b.b(this.f11064m));
            } catch (Error e4) {
                e = e4;
                this.f11065n.a(e);
            } catch (RuntimeException e5) {
                e = e5;
                this.f11065n.a(e);
            } catch (ExecutionException e6) {
                this.f11065n.a(e6.getCause());
            }
        }

        public String toString() {
            return AbstractC1467d.a(this).c(this.f11065n).toString();
        }
    }

    public static void a(InterfaceFutureC1495d interfaceFutureC1495d, InterfaceC1492a interfaceC1492a, Executor executor) {
        AbstractC1471h.h(interfaceC1492a);
        interfaceFutureC1495d.d(new a(interfaceFutureC1495d, interfaceC1492a), executor);
    }

    public static Object b(Future future) {
        AbstractC1471h.o(future.isDone(), "Future was expected to be done: %s", future);
        return AbstractC1496e.a(future);
    }
}
