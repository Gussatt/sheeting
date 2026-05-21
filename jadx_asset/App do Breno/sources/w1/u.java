package w1;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class u implements S1.d, S1.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f11847a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue f11848b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f11849c;

    public u(Executor executor) {
        this.f11849c = executor;
    }

    @Override // S1.c
    public void a(final S1.a aVar) {
        AbstractC1601D.b(aVar);
        synchronized (this) {
            try {
                Queue queue = this.f11848b;
                if (queue != null) {
                    queue.add(aVar);
                    return;
                }
                for (final Map.Entry entry : e(aVar)) {
                    ((Executor) entry.getValue()).execute(new Runnable() { // from class: w1.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            ((S1.b) entry.getKey()).a(aVar);
                        }
                    });
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // S1.d
    public synchronized void b(Class cls, Executor executor, S1.b bVar) {
        try {
            AbstractC1601D.b(cls);
            AbstractC1601D.b(bVar);
            AbstractC1601D.b(executor);
            if (!this.f11847a.containsKey(cls)) {
                this.f11847a.put(cls, new ConcurrentHashMap());
            }
            ((ConcurrentHashMap) this.f11847a.get(cls)).put(bVar, executor);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void d() {
        Queue queue;
        synchronized (this) {
            try {
                queue = this.f11848b;
                if (queue != null) {
                    this.f11848b = null;
                } else {
                    queue = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (queue != null) {
            Iterator it = queue.iterator();
            while (it.hasNext()) {
                a((S1.a) it.next());
            }
        }
    }

    public final synchronized Set e(S1.a aVar) {
        Map map;
        try {
            map = (Map) this.f11847a.get(aVar.b());
        } catch (Throwable th) {
            throw th;
        }
        return map == null ? Collections.EMPTY_SET : map.entrySet();
    }
}
