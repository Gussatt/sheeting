package androidx.window.layout.adapter.sidecar;

import K2.p;
import L2.m;
import X2.g;
import X2.l;
import android.app.Activity;
import android.content.Context;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import n0.k;
import q0.j;
import r0.InterfaceC1503a;

/* JADX INFO: loaded from: classes.dex */
public final class b implements InterfaceC1503a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile b f5526d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public androidx.window.layout.adapter.sidecar.a f5528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f5529b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f5525c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ReentrantLock f5527e = new ReentrantLock();

    public static final class a {
        public /* synthetic */ a(g gVar) {
            this();
        }

        public final b a(Context context) {
            l.e(context, "context");
            if (b.f5526d == null) {
                ReentrantLock reentrantLock = b.f5527e;
                reentrantLock.lock();
                try {
                    if (b.f5526d == null) {
                        b.f5526d = new b(b.f5525c.b(context));
                    }
                    p pVar = p.f2516a;
                    reentrantLock.unlock();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            b bVar = b.f5526d;
            l.b(bVar);
            return bVar;
        }

        public final androidx.window.layout.adapter.sidecar.a b(Context context) {
            l.e(context, "context");
            try {
                if (c(SidecarCompat.f5513f.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.l()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final boolean c(k kVar) {
            return kVar != null && kVar.compareTo(k.f10610r.a()) >= 0;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    public final class C0106b implements a.InterfaceC0105a {
        public C0106b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0105a
        public void a(Activity activity, j jVar) {
            l.e(activity, "activity");
            l.e(jVar, "newLayout");
            for (c cVar : b.this.g()) {
                if (l.a(cVar.d(), activity)) {
                    cVar.b(jVar);
                }
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f5531a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f5532b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final B.a f5533c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j f5534d;

        public c(Activity activity, Executor executor, B.a aVar) {
            l.e(activity, "activity");
            l.e(executor, "executor");
            l.e(aVar, "callback");
            this.f5531a = activity;
            this.f5532b = executor;
            this.f5533c = aVar;
        }

        public static final void c(c cVar, j jVar) {
            l.e(cVar, "this$0");
            l.e(jVar, "$newLayoutInfo");
            cVar.f5533c.accept(jVar);
        }

        public final void b(final j jVar) {
            l.e(jVar, "newLayoutInfo");
            this.f5534d = jVar;
            this.f5532b.execute(new Runnable() { // from class: t0.b
                @Override // java.lang.Runnable
                public final void run() {
                    b.c.c(this.f11351m, jVar);
                }
            });
        }

        public final Activity d() {
            return this.f5531a;
        }

        public final B.a e() {
            return this.f5533c;
        }

        public final j f() {
            return this.f5534d;
        }
    }

    public b(androidx.window.layout.adapter.sidecar.a aVar) {
        this.f5528a = aVar;
        androidx.window.layout.adapter.sidecar.a aVar2 = this.f5528a;
        if (aVar2 != null) {
            aVar2.a(new C0106b());
        }
    }

    @Override // r0.InterfaceC1503a
    public void a(Context context, Executor executor, B.a aVar) {
        Object next;
        l.e(context, "context");
        l.e(executor, "executor");
        l.e(aVar, "callback");
        p pVar = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f5527e;
            reentrantLock.lock();
            try {
                androidx.window.layout.adapter.sidecar.a aVar2 = this.f5528a;
                if (aVar2 == null) {
                    aVar.accept(new j(m.f()));
                    return;
                }
                boolean zH = h(activity);
                c cVar = new c(activity, executor, aVar);
                this.f5529b.add(cVar);
                if (zH) {
                    Iterator it = this.f5529b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (l.a(activity, ((c) next).d())) {
                                break;
                            }
                        }
                    }
                    c cVar2 = (c) next;
                    j jVarF = cVar2 != null ? cVar2.f() : null;
                    if (jVarF != null) {
                        cVar.b(jVarF);
                    }
                } else {
                    aVar2.b(activity);
                }
                p pVar2 = p.f2516a;
                reentrantLock.unlock();
                pVar = p.f2516a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (pVar == null) {
            aVar.accept(new j(m.f()));
        }
    }

    @Override // r0.InterfaceC1503a
    public void b(B.a aVar) {
        l.e(aVar, "callback");
        synchronized (f5527e) {
            try {
                if (this.f5528a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (c cVar : this.f5529b) {
                    if (cVar.e() == aVar) {
                        l.d(cVar, "callbackWrapper");
                        arrayList.add(cVar);
                    }
                }
                this.f5529b.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f(((c) it.next()).d());
                }
                p pVar = p.f2516a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5529b;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (l.a(((c) it.next()).d(), activity)) {
                    return;
                }
            }
        }
        androidx.window.layout.adapter.sidecar.a aVar = this.f5528a;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    public final CopyOnWriteArrayList g() {
        return this.f5529b;
    }

    public final boolean h(Activity activity) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f5529b;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (l.a(((c) it.next()).d(), activity)) {
                return true;
            }
        }
        return false;
    }
}
