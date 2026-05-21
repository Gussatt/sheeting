package x1;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q.AbstractC1488a;

/* JADX INFO: loaded from: classes.dex */
public class p extends AbstractC1488a implements ScheduledFuture {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ScheduledFuture f11977t;

    public class a implements b {
        public a() {
        }

        @Override // x1.p.b
        public void a(Throwable th) {
            p.this.t(th);
        }

        @Override // x1.p.b
        public void set(Object obj) {
            p.this.s(obj);
        }
    }

    public interface b {
        void a(Throwable th);

        void set(Object obj);
    }

    public interface c {
        ScheduledFuture a(b bVar);
    }

    public p(c cVar) {
        this.f11977t = cVar.a(new a());
    }

    @Override // q.AbstractC1488a
    public void g() {
        this.f11977t.cancel(v());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return this.f11977t.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public int compareTo(Delayed delayed) {
        return this.f11977t.compareTo(delayed);
    }
}
