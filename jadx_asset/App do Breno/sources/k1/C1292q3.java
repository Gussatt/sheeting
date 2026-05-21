package k1;

import V0.AbstractC0549h;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: renamed from: k1.q3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1292q3 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f9793m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f9794n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f9795o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ C1307s3 f9796p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1292q3(C1307s3 c1307s3, Runnable runnable, boolean z3, String str) {
        super(runnable, null);
        this.f9796p = c1307s3;
        AbstractC0549h.j(str);
        long andIncrement = C1307s3.f9823l.getAndIncrement();
        this.f9793m = andIncrement;
        this.f9795o = str;
        this.f9794n = z3;
        if (andIncrement == Long.MAX_VALUE) {
            c1307s3.f9366a.c().r().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C1292q3 c1292q3 = (C1292q3) obj;
        boolean z3 = c1292q3.f9794n;
        boolean z4 = this.f9794n;
        if (z4 != z3) {
            return !z4 ? 1 : -1;
        }
        long j4 = this.f9793m;
        long j5 = c1292q3.f9793m;
        if (j4 < j5) {
            return -1;
        }
        if (j4 > j5) {
            return 1;
        }
        this.f9796p.f9366a.c().t().b("Two tasks share the same index. index", Long.valueOf(j4));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f9796p.f9366a.c().r().b(this.f9795o, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1292q3(C1307s3 c1307s3, Callable callable, boolean z3, String str) {
        super(callable);
        this.f9796p = c1307s3;
        AbstractC0549h.j("Task exception on worker thread");
        long andIncrement = C1307s3.f9823l.getAndIncrement();
        this.f9793m = andIncrement;
        this.f9795o = "Task exception on worker thread";
        this.f9794n = z3;
        if (andIncrement == Long.MAX_VALUE) {
            c1307s3.f9366a.c().r().a("Tasks index overflow");
        }
    }
}
