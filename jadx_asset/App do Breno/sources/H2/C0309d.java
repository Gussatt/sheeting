package H2;

import H2.J5;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: H2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0309d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f2007l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f2008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakHashMap f2009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f2011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReferenceQueue f2012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f2013f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f2014g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f2015h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f2016i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f2017j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f2018k;

    /* JADX INFO: renamed from: H2.d$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final C0309d a(b bVar) {
            X2.l.e(bVar, "finalizationListener");
            return new C0309d(bVar);
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: H2.d$b */
    public interface b {
        void a(long j4);
    }

    public C0309d(b bVar) {
        X2.l.e(bVar, "finalizationListener");
        this.f2008a = bVar;
        this.f2009b = new WeakHashMap();
        this.f2010c = new HashMap();
        this.f2011d = new HashMap();
        this.f2012e = new ReferenceQueue();
        this.f2013f = new HashMap();
        Handler handler = new Handler(Looper.getMainLooper());
        this.f2014g = handler;
        Runnable runnable = new Runnable() { // from class: H2.c
            @Override // java.lang.Runnable
            public final void run() {
                C0309d.l(this.f1998m);
            }
        };
        this.f2015h = runnable;
        this.f2016i = 65536L;
        this.f2018k = 3000L;
        handler.postDelayed(runnable, 3000L);
    }

    public static final void l(C0309d c0309d) {
        c0309d.k();
    }

    public final void b(Object obj, long j4) {
        X2.l.e(obj, "instance");
        j();
        d(obj, j4);
    }

    public final long c(Object obj) {
        X2.l.e(obj, "instance");
        j();
        if (!f(obj)) {
            long j4 = this.f2016i;
            this.f2016i = 1 + j4;
            d(obj, j4);
            return j4;
        }
        throw new IllegalArgumentException(("Instance of " + obj.getClass() + " has already been added.").toString());
    }

    public final void d(Object obj, long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("Identifier must be >= 0: " + j4).toString());
        }
        if (this.f2010c.containsKey(Long.valueOf(j4))) {
            throw new IllegalArgumentException(("Identifier has already been added: " + j4).toString());
        }
        WeakReference weakReference = new WeakReference(obj, this.f2012e);
        this.f2009b.put(obj, Long.valueOf(j4));
        this.f2010c.put(Long.valueOf(j4), weakReference);
        this.f2013f.put(weakReference, Long.valueOf(j4));
        this.f2011d.put(Long.valueOf(j4), obj);
    }

    public final void e() {
        this.f2009b.clear();
        this.f2010c.clear();
        this.f2011d.clear();
        this.f2013f.clear();
    }

    public final boolean f(Object obj) {
        j();
        return this.f2009b.containsKey(obj);
    }

    public final Long g(Object obj) {
        j();
        Long l4 = (Long) this.f2009b.get(obj);
        if (l4 != null) {
            HashMap map = this.f2011d;
            X2.l.b(obj);
            map.put(l4, obj);
        }
        return l4;
    }

    public final Object h(long j4) {
        j();
        WeakReference weakReference = (WeakReference) this.f2010c.get(Long.valueOf(j4));
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final boolean i() {
        return this.f2017j;
    }

    public final void j() {
        if (i()) {
            Log.w("PigeonInstanceManager", "The manager was used after calls to the PigeonFinalizationListener has been stopped.");
        }
    }

    public final void k() {
        if (i()) {
            return;
        }
        while (true) {
            WeakReference weakReference = (WeakReference) this.f2012e.poll();
            if (weakReference == null) {
                this.f2014g.postDelayed(this.f2015h, this.f2018k);
                return;
            }
            Long l4 = (Long) X2.C.a(this.f2013f).remove(weakReference);
            if (l4 != null) {
                this.f2010c.remove(l4);
                this.f2011d.remove(l4);
                this.f2008a.a(l4.longValue());
            }
        }
    }

    public final Object m(long j4) {
        j();
        Object objH = h(j4);
        if (objH instanceof J5.a) {
            ((J5.a) objH).destroy();
        }
        return this.f2011d.remove(Long.valueOf(j4));
    }

    public final void n() {
        this.f2014g.removeCallbacks(this.f2015h);
        this.f2017j = true;
    }
}
