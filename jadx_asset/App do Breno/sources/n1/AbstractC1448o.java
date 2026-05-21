package n1;

import V0.AbstractC0549h;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: n1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1448o {
    public static Object a(AbstractC1445l abstractC1445l) throws InterruptedException {
        AbstractC0549h.h();
        AbstractC0549h.f();
        AbstractC0549h.k(abstractC1445l, "Task must not be null");
        if (abstractC1445l.l()) {
            return h(abstractC1445l);
        }
        r rVar = new r(null);
        i(abstractC1445l, rVar);
        rVar.d();
        return h(abstractC1445l);
    }

    public static Object b(AbstractC1445l abstractC1445l, long j4, TimeUnit timeUnit) throws TimeoutException {
        AbstractC0549h.h();
        AbstractC0549h.f();
        AbstractC0549h.k(abstractC1445l, "Task must not be null");
        AbstractC0549h.k(timeUnit, "TimeUnit must not be null");
        if (abstractC1445l.l()) {
            return h(abstractC1445l);
        }
        r rVar = new r(null);
        i(abstractC1445l, rVar);
        if (rVar.e(j4, timeUnit)) {
            return h(abstractC1445l);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static AbstractC1445l c(Executor executor, Callable callable) {
        AbstractC0549h.k(executor, "Executor must not be null");
        AbstractC0549h.k(callable, "Callback must not be null");
        O o4 = new O();
        executor.execute(new P(o4, callable));
        return o4;
    }

    public static AbstractC1445l d(Exception exc) {
        O o4 = new O();
        o4.p(exc);
        return o4;
    }

    public static AbstractC1445l e(Object obj) {
        O o4 = new O();
        o4.q(obj);
        return o4;
    }

    public static AbstractC1445l f(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return e(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((AbstractC1445l) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        O o4 = new O();
        t tVar = new t(collection.size(), o4);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            i((AbstractC1445l) it2.next(), tVar);
        }
        return o4;
    }

    public static AbstractC1445l g(AbstractC1445l... abstractC1445lArr) {
        return (abstractC1445lArr == null || abstractC1445lArr.length == 0) ? e(null) : f(Arrays.asList(abstractC1445lArr));
    }

    public static Object h(AbstractC1445l abstractC1445l) throws ExecutionException {
        if (abstractC1445l.m()) {
            return abstractC1445l.j();
        }
        if (abstractC1445l.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(abstractC1445l.i());
    }

    public static void i(AbstractC1445l abstractC1445l, s sVar) {
        Executor executor = AbstractC1447n.f10660b;
        abstractC1445l.f(executor, sVar);
        abstractC1445l.d(executor, sVar);
        abstractC1445l.a(executor, sVar);
    }
}
