package m2;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static N f10433c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LongSparseArray f10434a = new LongSparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue f10435b = new PriorityQueue();

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AtomicLong f10436b = new AtomicLong(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f10437a;

        public a(long j4) {
            this.f10437a = j4;
        }

        public static a b() {
            return c(f10436b.incrementAndGet());
        }

        public static a c(long j4) {
            return new a(j4);
        }

        public long d() {
            return this.f10437a;
        }
    }

    public static N a() {
        if (f10433c == null) {
            f10433c = new N();
        }
        return f10433c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f10435b.isEmpty() && ((Long) this.f10435b.peek()).longValue() < aVar.f10437a) {
            this.f10434a.remove(((Long) this.f10435b.poll()).longValue());
        }
        if (!this.f10435b.isEmpty() && ((Long) this.f10435b.peek()).longValue() == aVar.f10437a) {
            this.f10435b.poll();
        }
        MotionEvent motionEvent = (MotionEvent) this.f10434a.get(aVar.f10437a);
        this.f10434a.remove(aVar.f10437a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a aVarB = a.b();
        this.f10434a.put(aVarB.f10437a, MotionEvent.obtain(motionEvent));
        this.f10435b.add(Long.valueOf(aVarB.f10437a));
        return aVarB;
    }
}
