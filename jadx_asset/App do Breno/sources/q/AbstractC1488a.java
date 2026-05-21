package q;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import q1.InterfaceFutureC1495d;

/* JADX INFO: renamed from: q.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1488a implements InterfaceFutureC1495d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f10982p = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Logger f10983q = Logger.getLogger(AbstractC1488a.class.getName());

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f10984r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Object f10985s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile Object f10986m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile e f10987n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile h f10988o;

    /* JADX INFO: renamed from: q.a$b */
    public static abstract class b {
        public b() {
        }

        public abstract boolean a(AbstractC1488a abstractC1488a, e eVar, e eVar2);

        public abstract boolean b(AbstractC1488a abstractC1488a, Object obj, Object obj2);

        public abstract boolean c(AbstractC1488a abstractC1488a, h hVar, h hVar2);

        public abstract void d(h hVar, h hVar2);

        public abstract void e(h hVar, Thread thread);
    }

    /* JADX INFO: renamed from: q.a$c */
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f10989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f10990d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10991a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Throwable f10992b;

        static {
            if (AbstractC1488a.f10982p) {
                f10990d = null;
                f10989c = null;
            } else {
                f10990d = new c(false, null);
                f10989c = new c(true, null);
            }
        }

        public c(boolean z3, Throwable th) {
            this.f10991a = z3;
            this.f10992b = th;
        }
    }

    /* JADX INFO: renamed from: q.a$d */
    public static final class d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f10993b = new d(new C0156a("Failure occurred while trying to finish a future."));

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Throwable f10994a;

        /* JADX INFO: renamed from: q.a$d$a, reason: collision with other inner class name */
        public class C0156a extends Throwable {
            public C0156a(String str) {
                super(str);
            }

            @Override // java.lang.Throwable
            public synchronized Throwable fillInStackTrace() {
                return this;
            }
        }

        public d(Throwable th) {
            this.f10994a = (Throwable) AbstractC1488a.i(th);
        }
    }

    /* JADX INFO: renamed from: q.a$e */
    public static final class e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f10995d = new e(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Runnable f10996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f10997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e f10998c;

        public e(Runnable runnable, Executor executor) {
            this.f10996a = runnable;
            this.f10997b = executor;
        }
    }

    /* JADX INFO: renamed from: q.a$f */
    public static final class f extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f10999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f11000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f11001c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f11002d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AtomicReferenceFieldUpdater f11003e;

        public f(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
            super();
            this.f10999a = atomicReferenceFieldUpdater;
            this.f11000b = atomicReferenceFieldUpdater2;
            this.f11001c = atomicReferenceFieldUpdater3;
            this.f11002d = atomicReferenceFieldUpdater4;
            this.f11003e = atomicReferenceFieldUpdater5;
        }

        @Override // q.AbstractC1488a.b
        public boolean a(AbstractC1488a abstractC1488a, e eVar, e eVar2) {
            return AbstractC1489b.a(this.f11002d, abstractC1488a, eVar, eVar2);
        }

        @Override // q.AbstractC1488a.b
        public boolean b(AbstractC1488a abstractC1488a, Object obj, Object obj2) {
            return AbstractC1489b.a(this.f11003e, abstractC1488a, obj, obj2);
        }

        @Override // q.AbstractC1488a.b
        public boolean c(AbstractC1488a abstractC1488a, h hVar, h hVar2) {
            return AbstractC1489b.a(this.f11001c, abstractC1488a, hVar, hVar2);
        }

        @Override // q.AbstractC1488a.b
        public void d(h hVar, h hVar2) {
            this.f11000b.lazySet(hVar, hVar2);
        }

        @Override // q.AbstractC1488a.b
        public void e(h hVar, Thread thread) {
            this.f10999a.lazySet(hVar, thread);
        }
    }

    /* JADX INFO: renamed from: q.a$g */
    public static final class g extends b {
        public g() {
            super();
        }

        @Override // q.AbstractC1488a.b
        public boolean a(AbstractC1488a abstractC1488a, e eVar, e eVar2) {
            synchronized (abstractC1488a) {
                try {
                    if (abstractC1488a.f10987n != eVar) {
                        return false;
                    }
                    abstractC1488a.f10987n = eVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // q.AbstractC1488a.b
        public boolean b(AbstractC1488a abstractC1488a, Object obj, Object obj2) {
            synchronized (abstractC1488a) {
                try {
                    if (abstractC1488a.f10986m != obj) {
                        return false;
                    }
                    abstractC1488a.f10986m = obj2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // q.AbstractC1488a.b
        public boolean c(AbstractC1488a abstractC1488a, h hVar, h hVar2) {
            synchronized (abstractC1488a) {
                try {
                    if (abstractC1488a.f10988o != hVar) {
                        return false;
                    }
                    abstractC1488a.f10988o = hVar2;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // q.AbstractC1488a.b
        public void d(h hVar, h hVar2) {
            hVar.f11006b = hVar2;
        }

        @Override // q.AbstractC1488a.b
        public void e(h hVar, Thread thread) {
            hVar.f11005a = thread;
        }
    }

    /* JADX INFO: renamed from: q.a$h */
    public static final class h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f11004c = new h(false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile Thread f11005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile h f11006b;

        public h(boolean z3) {
        }

        public void a(h hVar) {
            AbstractC1488a.f10984r.d(this, hVar);
        }

        public void b() {
            Thread thread = this.f11005a;
            if (thread != null) {
                this.f11005a = null;
                LockSupport.unpark(thread);
            }
        }

        public h() {
            AbstractC1488a.f10984r.e(this, Thread.currentThread());
        }
    }

    static {
        b gVar;
        try {
            gVar = new f(AtomicReferenceFieldUpdater.newUpdater(h.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(h.class, h.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1488a.class, h.class, "o"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1488a.class, e.class, "n"), AtomicReferenceFieldUpdater.newUpdater(AbstractC1488a.class, Object.class, "m"));
            th = null;
        } catch (Throwable th) {
            th = th;
            gVar = new g();
        }
        f10984r = gVar;
        if (th != null) {
            f10983q.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f10985s = new Object();
    }

    public static CancellationException h(String str, Throwable th) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th);
        return cancellationException;
    }

    public static Object i(Object obj) {
        obj.getClass();
        return obj;
    }

    public static void k(AbstractC1488a abstractC1488a) {
        abstractC1488a.q();
        abstractC1488a.g();
        e eVarJ = abstractC1488a.j(null);
        while (eVarJ != null) {
            e eVar = eVarJ.f10998c;
            l(eVarJ.f10996a, eVarJ.f10997b);
            eVarJ = eVar;
        }
    }

    public static void l(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e4) {
            f10983q.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e4);
        }
    }

    public static Object n(Future future) {
        Object obj;
        boolean z3 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z3 = true;
            } catch (Throwable th) {
                if (z3) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z3) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        Object obj = this.f10986m;
        if (obj == null) {
            if (f10984r.b(this, obj, f10982p ? new c(z3, new CancellationException("Future.cancel() was called.")) : z3 ? c.f10989c : c.f10990d)) {
                if (z3) {
                    o();
                }
                k(this);
                return true;
            }
        }
        return false;
    }

    @Override // q1.InterfaceFutureC1495d
    public final void d(Runnable runnable, Executor executor) {
        i(runnable);
        i(executor);
        e eVar = this.f10987n;
        if (eVar != e.f10995d) {
            e eVar2 = new e(runnable, executor);
            do {
                eVar2.f10998c = eVar;
                if (f10984r.a(this, eVar, eVar2)) {
                    return;
                } else {
                    eVar = this.f10987n;
                }
            } while (eVar != e.f10995d);
        }
        l(runnable, executor);
    }

    public final void f(StringBuilder sb) {
        try {
            Object objN = n(this);
            sb.append("SUCCESS, result=[");
            sb.append(u(objN));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e4) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e4.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e5) {
            sb.append("FAILURE, cause=[");
            sb.append(e5.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j4, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j4);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f10986m;
        if (obj != null) {
            return m(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            h hVar = this.f10988o;
            if (hVar != h.f11004c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f10984r.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                r(hVar2);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f10986m;
                            if (obj2 != null) {
                                return m(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        r(hVar2);
                    } else {
                        hVar = this.f10988o;
                    }
                } while (hVar != h.f11004c);
            }
            return m(this.f10986m);
        }
        while (nanos > 0) {
            Object obj3 = this.f10986m;
            if (obj3 != null) {
                return m(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        String str = "Waited " + j4 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String str2 = str + " (plus ";
            long j5 = -nanos;
            long jConvert = timeUnit.convert(j5, TimeUnit.NANOSECONDS);
            long nanos2 = j5 - timeUnit.toNanos(jConvert);
            boolean z3 = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String str3 = str2 + jConvert + " " + lowerCase;
                if (z3) {
                    str3 = str3 + ",";
                }
                str2 = str3 + " ";
            }
            if (z3) {
                str2 = str2 + nanos2 + " nanoseconds ";
            }
            str = str2 + "delay)";
        }
        if (isDone()) {
            throw new TimeoutException(str + " but future completed as timeout expired");
        }
        throw new TimeoutException(str + " for " + string);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10986m instanceof c;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f10986m != null;
    }

    public final e j(e eVar) {
        e eVar2;
        do {
            eVar2 = this.f10987n;
        } while (!f10984r.a(this, eVar2, e.f10995d));
        e eVar3 = eVar;
        e eVar4 = eVar2;
        while (eVar4 != null) {
            e eVar5 = eVar4.f10998c;
            eVar4.f10998c = eVar3;
            eVar3 = eVar4;
            eVar4 = eVar5;
        }
        return eVar3;
    }

    public final Object m(Object obj) throws ExecutionException {
        if (obj instanceof c) {
            throw h("Task was cancelled.", ((c) obj).f10992b);
        }
        if (obj instanceof d) {
            throw new ExecutionException(((d) obj).f10994a);
        }
        if (obj == f10985s) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String p() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void q() {
        h hVar;
        do {
            hVar = this.f10988o;
        } while (!f10984r.c(this, hVar, h.f11004c));
        while (hVar != null) {
            hVar.b();
            hVar = hVar.f11006b;
        }
    }

    public final void r(h hVar) {
        hVar.f11005a = null;
        while (true) {
            h hVar2 = this.f10988o;
            if (hVar2 == h.f11004c) {
                return;
            }
            h hVar3 = null;
            while (hVar2 != null) {
                h hVar4 = hVar2.f11006b;
                if (hVar2.f11005a != null) {
                    hVar3 = hVar2;
                } else if (hVar3 != null) {
                    hVar3.f11006b = hVar4;
                    if (hVar3.f11005a == null) {
                        break;
                    }
                } else if (!f10984r.c(this, hVar2, hVar4)) {
                    break;
                }
                hVar2 = hVar4;
            }
            return;
        }
    }

    public boolean s(Object obj) {
        if (obj == null) {
            obj = f10985s;
        }
        if (!f10984r.b(this, null, obj)) {
            return false;
        }
        k(this);
        return true;
    }

    public boolean t(Throwable th) {
        if (!f10984r.b(this, null, new d((Throwable) i(th)))) {
            return false;
        }
        k(this);
        return true;
    }

    public String toString() {
        String strP;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            f(sb);
        } else {
            try {
                strP = p();
            } catch (RuntimeException e4) {
                strP = "Exception thrown from implementation: " + e4.getClass();
            }
            if (strP != null && !strP.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strP);
                sb.append("]");
            } else if (isDone()) {
                f(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final String u(Object obj) {
        return obj == this ? "this future" : String.valueOf(obj);
    }

    public final boolean v() {
        Object obj = this.f10986m;
        return (obj instanceof c) && ((c) obj).f10991a;
    }

    public void g() {
    }

    public void o() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f10986m;
            if (obj2 != null) {
                return m(obj2);
            }
            h hVar = this.f10988o;
            if (hVar != h.f11004c) {
                h hVar2 = new h();
                do {
                    hVar2.a(hVar);
                    if (f10984r.c(this, hVar, hVar2)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f10986m;
                            } else {
                                r(hVar2);
                                throw new InterruptedException();
                            }
                        } while (!(obj != null));
                        return m(obj);
                    }
                    hVar = this.f10988o;
                } while (hVar != h.f11004c);
            }
            return m(this.f10986m);
        }
        throw new InterruptedException();
    }
}
