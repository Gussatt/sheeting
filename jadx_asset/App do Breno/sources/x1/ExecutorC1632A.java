package x1;

import V0.AbstractC0549h;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: x1.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC1632A implements Executor {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f11912r = Logger.getLogger(ExecutorC1632A.class.getName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Executor f11913m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Deque f11914n = new ArrayDeque();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f11915o = c.IDLE;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f11916p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f11917q = new b(this, null);

    /* JADX INFO: renamed from: x1.A$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Runnable f11918m;

        public a(Runnable runnable) {
            this.f11918m = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11918m.run();
        }

        public String toString() {
            return this.f11918m.toString();
        }
    }

    /* JADX INFO: renamed from: x1.A$b */
    public final class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Runnable f11920m;

        public b() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            if (r1 == false) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
            r2 = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        
            r8.f11920m.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005c, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x005d, code lost:
        
            x1.ExecutorC1632A.f11912r.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r8.f11920m, (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x007a, code lost:
        
            r8.f11920m = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
        
            return;
         */
        /* JADX WARN: Removed duplicated region for block: B:46:0x003d A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                x1.A r2 = x1.ExecutorC1632A.this     // Catch: java.lang.Throwable -> L58
                java.util.Deque r2 = x1.ExecutorC1632A.a(r2)     // Catch: java.lang.Throwable -> L58
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L58
                if (r0 != 0) goto L2d
                x1.A r0 = x1.ExecutorC1632A.this     // Catch: java.lang.Throwable -> L20
                x1.A$c r0 = x1.ExecutorC1632A.b(r0)     // Catch: java.lang.Throwable -> L20
                x1.A$c r3 = x1.ExecutorC1632A.c.RUNNING     // Catch: java.lang.Throwable -> L20
                if (r0 != r3) goto L22
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
            L18:
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
                goto L48
            L20:
                r0 = move-exception
                goto L7d
            L22:
                x1.A r0 = x1.ExecutorC1632A.this     // Catch: java.lang.Throwable -> L20
                x1.ExecutorC1632A.d(r0)     // Catch: java.lang.Throwable -> L20
                x1.A r0 = x1.ExecutorC1632A.this     // Catch: java.lang.Throwable -> L20
                x1.ExecutorC1632A.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                r0 = 1
            L2d:
                x1.A r3 = x1.ExecutorC1632A.this     // Catch: java.lang.Throwable -> L20
                java.util.Deque r3 = x1.ExecutorC1632A.a(r3)     // Catch: java.lang.Throwable -> L20
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L20
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L20
                r8.f11920m = r3     // Catch: java.lang.Throwable -> L20
                if (r3 != 0) goto L49
                x1.A r0 = x1.ExecutorC1632A.this     // Catch: java.lang.Throwable -> L20
                x1.A$c r3 = x1.ExecutorC1632A.c.IDLE     // Catch: java.lang.Throwable -> L20
                x1.ExecutorC1632A.c(r0, r3)     // Catch: java.lang.Throwable -> L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                if (r1 == 0) goto L48
                goto L18
            L48:
                return
            L49:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L58
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r8.f11920m     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
                r3.run()     // Catch: java.lang.Throwable -> L5a java.lang.RuntimeException -> L5c
            L55:
                r8.f11920m = r2     // Catch: java.lang.Throwable -> L58
                goto L2
            L58:
                r0 = move-exception
                goto L7f
            L5a:
                r0 = move-exception
                goto L7a
            L5c:
                r3 = move-exception
                java.util.logging.Logger r4 = x1.ExecutorC1632A.e()     // Catch: java.lang.Throwable -> L5a
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5a
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5a
                r6.<init>()     // Catch: java.lang.Throwable -> L5a
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.Runnable r7 = r8.f11920m     // Catch: java.lang.Throwable -> L5a
                r6.append(r7)     // Catch: java.lang.Throwable -> L5a
                java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L5a
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5a
                goto L55
            L7a:
                r8.f11920m = r2     // Catch: java.lang.Throwable -> L58
                throw r0     // Catch: java.lang.Throwable -> L58
            L7d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L20
                throw r0     // Catch: java.lang.Throwable -> L58
            L7f:
                if (r1 == 0) goto L88
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L88:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: x1.ExecutorC1632A.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e4) {
                synchronized (ExecutorC1632A.this.f11914n) {
                    ExecutorC1632A.this.f11915o = c.IDLE;
                    throw e4;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f11920m;
            if (runnable != null) {
                return "SequentialExecutorWorker{running=" + runnable + "}";
            }
            return "SequentialExecutorWorker{state=" + ExecutorC1632A.this.f11915o + "}";
        }

        public /* synthetic */ b(ExecutorC1632A executorC1632A, a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: x1.A$c */
    public enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public ExecutorC1632A(Executor executor) {
        this.f11913m = (Executor) AbstractC0549h.j(executor);
    }

    public static /* synthetic */ long d(ExecutorC1632A executorC1632A) {
        long j4 = executorC1632A.f11916p;
        executorC1632A.f11916p = 1 + j4;
        return j4;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0061  */
    @Override // java.util.concurrent.Executor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            V0.AbstractC0549h.j(r8)
            java.util.Deque r0 = r7.f11914n
            monitor-enter(r0)
            x1.A$c r1 = r7.f11915o     // Catch: java.lang.Throwable -> L6d
            x1.A$c r2 = x1.ExecutorC1632A.c.RUNNING     // Catch: java.lang.Throwable -> L6d
            if (r1 == r2) goto L6f
            x1.A$c r2 = x1.ExecutorC1632A.c.QUEUED     // Catch: java.lang.Throwable -> L6d
            if (r1 != r2) goto L11
            goto L6f
        L11:
            long r3 = r7.f11916p     // Catch: java.lang.Throwable -> L6d
            x1.A$a r1 = new x1.A$a     // Catch: java.lang.Throwable -> L6d
            r1.<init>(r8)     // Catch: java.lang.Throwable -> L6d
            java.util.Deque r8 = r7.f11914n     // Catch: java.lang.Throwable -> L6d
            r8.add(r1)     // Catch: java.lang.Throwable -> L6d
            x1.A$c r8 = x1.ExecutorC1632A.c.QUEUING     // Catch: java.lang.Throwable -> L6d
            r7.f11915o = r8     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            java.util.concurrent.Executor r0 = r7.f11913m     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            x1.A$b r5 = r7.f11917q     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            r0.execute(r5)     // Catch: java.lang.Error -> L44 java.lang.RuntimeException -> L46
            x1.A$c r0 = r7.f11915o
            if (r0 == r8) goto L2e
            return
        L2e:
            java.util.Deque r0 = r7.f11914n
            monitor-enter(r0)
            long r5 = r7.f11916p     // Catch: java.lang.Throwable -> L3e
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L40
            x1.A$c r1 = r7.f11915o     // Catch: java.lang.Throwable -> L3e
            if (r1 != r8) goto L40
            r7.f11915o = r2     // Catch: java.lang.Throwable -> L3e
            goto L40
        L3e:
            r8 = move-exception
            goto L42
        L40:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            return
        L42:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3e
            throw r8
        L44:
            r8 = move-exception
            goto L47
        L46:
            r8 = move-exception
        L47:
            java.util.Deque r2 = r7.f11914n
            monitor-enter(r2)
            x1.A$c r0 = r7.f11915o     // Catch: java.lang.Throwable -> L55
            x1.A$c r3 = x1.ExecutorC1632A.c.IDLE     // Catch: java.lang.Throwable -> L55
            if (r0 == r3) goto L57
            x1.A$c r3 = x1.ExecutorC1632A.c.QUEUING     // Catch: java.lang.Throwable -> L55
            if (r0 != r3) goto L61
            goto L57
        L55:
            r8 = move-exception
            goto L6b
        L57:
            java.util.Deque r0 = r7.f11914n     // Catch: java.lang.Throwable -> L55
            boolean r0 = r0.removeLastOccurrence(r1)     // Catch: java.lang.Throwable -> L55
            if (r0 == 0) goto L61
            r0 = 1
            goto L62
        L61:
            r0 = 0
        L62:
            boolean r1 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch: java.lang.Throwable -> L55
            if (r1 == 0) goto L6a
            if (r0 != 0) goto L6a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            return
        L6a:
            throw r8     // Catch: java.lang.Throwable -> L55
        L6b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L55
            throw r8
        L6d:
            r8 = move-exception
            goto L76
        L6f:
            java.util.Deque r1 = r7.f11914n     // Catch: java.lang.Throwable -> L6d
            r1.add(r8)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            return
        L76:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6d
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.ExecutorC1632A.execute(java.lang.Runnable):void");
    }

    public String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f11913m + "}";
    }
}
