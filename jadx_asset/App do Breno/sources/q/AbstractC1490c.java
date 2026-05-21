package q;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import q1.InterfaceFutureC1495d;

/* JADX INFO: renamed from: q.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1490c {

    /* JADX INFO: renamed from: q.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f11007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public d f11008b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public q.d f11009c = q.d.w();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f11010d;

        public void a() {
            this.f11007a = null;
            this.f11008b = null;
            this.f11009c.s(null);
        }

        public boolean b(Object obj) {
            this.f11010d = true;
            d dVar = this.f11008b;
            boolean z3 = dVar != null && dVar.b(obj);
            if (z3) {
                d();
            }
            return z3;
        }

        public boolean c() {
            this.f11010d = true;
            d dVar = this.f11008b;
            boolean z3 = dVar != null && dVar.a(true);
            if (z3) {
                d();
            }
            return z3;
        }

        public final void d() {
            this.f11007a = null;
            this.f11008b = null;
            this.f11009c = null;
        }

        public boolean e(Throwable th) {
            this.f11010d = true;
            d dVar = this.f11008b;
            boolean z3 = dVar != null && dVar.c(th);
            if (z3) {
                d();
            }
            return z3;
        }

        public void finalize() {
            q.d dVar;
            d dVar2 = this.f11008b;
            if (dVar2 != null && !dVar2.isDone()) {
                dVar2.c(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f11007a));
            }
            if (this.f11010d || (dVar = this.f11009c) == null) {
                return;
            }
            dVar.s(null);
        }
    }

    /* JADX INFO: renamed from: q.c$b */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: q.c$c, reason: collision with other inner class name */
    public interface InterfaceC0157c {
        Object a(a aVar);
    }

    /* JADX INFO: renamed from: q.c$d */
    public static final class d implements InterfaceFutureC1495d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final WeakReference f11011m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AbstractC1488a f11012n = new a();

        /* JADX INFO: renamed from: q.c$d$a */
        public class a extends AbstractC1488a {
            public a() {
            }

            @Override // q.AbstractC1488a
            public String p() {
                a aVar = (a) d.this.f11011m.get();
                if (aVar == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + aVar.f11007a + "]";
            }
        }

        public d(a aVar) {
            this.f11011m = new WeakReference(aVar);
        }

        public boolean a(boolean z3) {
            return this.f11012n.cancel(z3);
        }

        public boolean b(Object obj) {
            return this.f11012n.s(obj);
        }

        public boolean c(Throwable th) {
            return this.f11012n.t(th);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z3) {
            a aVar = (a) this.f11011m.get();
            boolean zCancel = this.f11012n.cancel(z3);
            if (zCancel && aVar != null) {
                aVar.a();
            }
            return zCancel;
        }

        @Override // q1.InterfaceFutureC1495d
        public void d(Runnable runnable, Executor executor) {
            this.f11012n.d(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            return this.f11012n.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f11012n.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f11012n.isDone();
        }

        public String toString() {
            return this.f11012n.toString();
        }

        @Override // java.util.concurrent.Future
        public Object get(long j4, TimeUnit timeUnit) {
            return this.f11012n.get(j4, timeUnit);
        }
    }

    public static InterfaceFutureC1495d a(InterfaceC0157c interfaceC0157c) {
        a aVar = new a();
        d dVar = new d(aVar);
        aVar.f11008b = dVar;
        aVar.f11007a = interfaceC0157c.getClass();
        try {
            Object objA = interfaceC0157c.a(aVar);
            if (objA != null) {
                aVar.f11007a = objA;
                return dVar;
            }
        } catch (Exception e4) {
            dVar.c(e4);
        }
        return dVar;
    }
}
