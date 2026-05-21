package E1;

import C1.AbstractC0252j;
import E1.o;
import U0.X;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D1.f f979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f981d = new a(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f982e = new a(true);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k f983f = new k(128);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicMarkableReference f984g = new AtomicMarkableReference(null, false);

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicMarkableReference f985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicReference f986b = new AtomicReference(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f987c;

        public a(boolean z3) {
            this.f987c = z3;
            this.f985a = new AtomicMarkableReference(new e(64, z3 ? 8192 : 1024), false);
        }

        public static /* synthetic */ void a(a aVar) throws Throwable {
            aVar.f986b.set(null);
            aVar.d();
        }

        public Map b() {
            return ((e) this.f985a.getReference()).a();
        }

        public final void c() {
            Runnable runnable = new Runnable() { // from class: E1.n
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    o.a.a(this.f977m);
                }
            };
            if (X.a(this.f986b, null, runnable)) {
                o.this.f979b.f878b.d(runnable);
            }
        }

        public final void d() throws Throwable {
            Map mapA;
            synchronized (this) {
                try {
                    if (this.f985a.isMarked()) {
                        mapA = ((e) this.f985a.getReference()).a();
                        AtomicMarkableReference atomicMarkableReference = this.f985a;
                        atomicMarkableReference.set((e) atomicMarkableReference.getReference(), false);
                    } else {
                        mapA = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (mapA != null) {
                o.this.f978a.r(o.this.f980c, mapA, this.f987c);
            }
        }

        public boolean e(String str, String str2) {
            synchronized (this) {
                try {
                    if (!((e) this.f985a.getReference()).d(str, str2)) {
                        return false;
                    }
                    AtomicMarkableReference atomicMarkableReference = this.f985a;
                    atomicMarkableReference.set((e) atomicMarkableReference.getReference(), true);
                    c();
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public o(String str, I1.g gVar, D1.f fVar) {
        this.f980c = str;
        this.f978a = new g(gVar);
        this.f979b = fVar;
    }

    public static /* synthetic */ void b(o oVar, String str, Map map, List list) throws Throwable {
        if (oVar.i() != null) {
            oVar.f978a.t(str, oVar.i());
        }
        if (!map.isEmpty()) {
            oVar.f978a.q(str, map);
        }
        if (list.isEmpty()) {
            return;
        }
        oVar.f978a.s(str, list);
    }

    public static o j(String str, I1.g gVar, D1.f fVar) {
        g gVar2 = new g(gVar);
        o oVar = new o(str, gVar, fVar);
        ((e) oVar.f981d.f985a.getReference()).e(gVar2.i(str, false));
        ((e) oVar.f982e.f985a.getReference()).e(gVar2.i(str, true));
        oVar.f984g.set(gVar2.k(str), false);
        oVar.f983f.c(gVar2.j(str));
        return oVar;
    }

    public static String k(String str, I1.g gVar) {
        return new g(gVar).k(str);
    }

    public Map f(Map map) {
        if (map.isEmpty()) {
            return this.f981d.b();
        }
        HashMap map2 = new HashMap(this.f981d.b());
        int i4 = 0;
        for (Map.Entry entry : map.entrySet()) {
            String strC = e.c((String) entry.getKey(), 1024);
            if (map2.size() < 64 || map2.containsKey(strC)) {
                map2.put(strC, e.c((String) entry.getValue(), 1024));
            } else {
                i4++;
            }
        }
        if (i4 > 0) {
            z1.g.f().k("Ignored " + i4 + " keys when adding event specific keys. Maximum allowable: 1024");
        }
        return Collections.unmodifiableMap(map2);
    }

    public Map g() {
        return this.f982e.b();
    }

    public List h() {
        return this.f983f.a();
    }

    public String i() {
        return (String) this.f984g.getReference();
    }

    public final void l() throws Throwable {
        boolean z3;
        String strI;
        synchronized (this.f984g) {
            try {
                z3 = false;
                if (this.f984g.isMarked()) {
                    strI = i();
                    this.f984g.set(strI, false);
                    z3 = true;
                } else {
                    strI = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            this.f978a.t(this.f980c, strI);
        }
    }

    public boolean m(String str, String str2) {
        return this.f981d.e(str, str2);
    }

    public boolean n(String str, String str2) {
        return this.f982e.e(str, str2);
    }

    public void o(final String str) {
        synchronized (this.f980c) {
            this.f980c = str;
            final Map mapB = this.f981d.b();
            final List listB = this.f983f.b();
            this.f979b.f878b.d(new Runnable() { // from class: E1.l
                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    o.b(this.f972m, str, mapB, listB);
                }
            });
        }
    }

    public void p(String str) {
        String strC = e.c(str, 1024);
        synchronized (this.f984g) {
            try {
                if (AbstractC0252j.z(strC, (String) this.f984g.getReference())) {
                    return;
                }
                this.f984g.set(strC, true);
                this.f979b.f878b.d(new Runnable() { // from class: E1.m
                    @Override // java.lang.Runnable
                    public final void run() throws Throwable {
                        this.f976m.l();
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
