package J0;

import D0.g;
import F0.c;
import K0.AbstractC0463k;
import K0.InterfaceC0455c;
import K0.InterfaceC0456d;
import L0.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D0.e f2323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0456d f2324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f2325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f2326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L0.b f2327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M0.a f2328g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M0.a f2329h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC0455c f2330i;

    public r(Context context, D0.e eVar, InterfaceC0456d interfaceC0456d, x xVar, Executor executor, L0.b bVar, M0.a aVar, M0.a aVar2, InterfaceC0455c interfaceC0455c) {
        this.f2322a = context;
        this.f2323b = eVar;
        this.f2324c = interfaceC0456d;
        this.f2325d = xVar;
        this.f2326e = executor;
        this.f2327f = bVar;
        this.f2328g = aVar;
        this.f2329h = aVar2;
        this.f2330i = interfaceC0455c;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, C0.p pVar, long j4) {
        rVar.f2324c.J(iterable);
        rVar.f2324c.Q(pVar, rVar.f2328g.a() + j4);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f2330i.c();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f2324c.i(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, C0.p pVar, int i4) {
        rVar.f2325d.a(pVar, i4 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, C0.p pVar, long j4) {
        rVar.f2324c.Q(pVar, rVar.f2328g.a() + j4);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f2330i.e(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final C0.p pVar, final int i4, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                L0.b bVar = rVar.f2327f;
                final InterfaceC0456d interfaceC0456d = rVar.f2324c;
                Objects.requireNonNull(interfaceC0456d);
                bVar.d(new b.a() { // from class: J0.i
                    @Override // L0.b.a
                    public final Object a() {
                        return Integer.valueOf(interfaceC0456d.b());
                    }
                });
                if (rVar.k()) {
                    rVar.l(pVar, i4);
                } else {
                    rVar.f2327f.d(new b.a() { // from class: J0.j
                        @Override // L0.b.a
                        public final Object a() {
                            return r.f(this.f2303a, pVar, i4);
                        }
                    });
                }
                runnable.run();
            } catch (L0.a unused) {
                rVar.f2325d.a(pVar, i4 + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public C0.i j(D0.m mVar) {
        L0.b bVar = this.f2327f;
        final InterfaceC0455c interfaceC0455c = this.f2330i;
        Objects.requireNonNull(interfaceC0455c);
        return mVar.b(C0.i.a().i(this.f2328g.a()).o(this.f2329h.a()).n("GDT_CLIENT_METRICS").h(new C0.h(C1661b.b("proto"), ((F0.a) bVar.d(new b.a() { // from class: J0.h
            @Override // L0.b.a
            public final Object a() {
                return interfaceC0455c.a();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f2322a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public D0.g l(final C0.p pVar, int i4) {
        D0.g gVarA;
        D0.m mVarA = this.f2323b.a(pVar.b());
        D0.g gVarE = D0.g.e(0L);
        final long j4 = 0;
        while (((Boolean) this.f2327f.d(new b.a() { // from class: J0.k
            @Override // L0.b.a
            public final Object a() {
                return Boolean.valueOf(this.f2306a.f2324c.B(pVar));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f2327f.d(new b.a() { // from class: J0.l
                @Override // L0.b.a
                public final Object a() {
                    return this.f2308a.f2324c.y(pVar);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVarA == null) {
                G0.a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                gVarA = D0.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC0463k) it.next()).b());
                }
                if (pVar.e()) {
                    arrayList.add(j(mVarA));
                }
                gVarA = mVarA.a(D0.f.a().b(arrayList).c(pVar.c()).a());
            }
            gVarE = gVarA;
            if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                final C0.p pVar2 = pVar;
                this.f2327f.d(new b.a() { // from class: J0.m
                    @Override // L0.b.a
                    public final Object a() {
                        return r.b(this.f2310a, iterable, pVar2, j4);
                    }
                });
                this.f2325d.b(pVar2, i4 + 1, true);
                return gVarE;
            }
            C0.p pVar3 = pVar;
            this.f2327f.d(new b.a() { // from class: J0.n
                @Override // L0.b.a
                public final Object a() {
                    return r.e(this.f2314a, iterable);
                }
            });
            if (gVarE.c() == g.a.OK) {
                long jMax = Math.max(j4, gVarE.b());
                if (pVar3.e()) {
                    this.f2327f.d(new b.a() { // from class: J0.o
                        @Override // L0.b.a
                        public final Object a() {
                            return r.c(this.f2316a);
                        }
                    });
                }
                j4 = jMax;
            } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strN = ((AbstractC0463k) it2.next()).b().n();
                    if (map.containsKey(strN)) {
                        map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                    } else {
                        map.put(strN, 1);
                    }
                }
                this.f2327f.d(new b.a() { // from class: J0.p
                    @Override // L0.b.a
                    public final Object a() {
                        return r.h(this.f2317a, map);
                    }
                });
            }
            pVar = pVar3;
        }
        final C0.p pVar4 = pVar;
        this.f2327f.d(new b.a() { // from class: J0.q
            @Override // L0.b.a
            public final Object a() {
                return r.g(this.f2319a, pVar4, j4);
            }
        });
        return gVarE;
    }

    public void m(final C0.p pVar, final int i4, final Runnable runnable) {
        this.f2326e.execute(new Runnable() { // from class: J0.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f2297m, pVar, i4, runnable);
            }
        });
    }
}
