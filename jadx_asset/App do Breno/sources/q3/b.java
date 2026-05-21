package q3;

import K2.p;
import N2.i;
import P2.h;
import W2.l;
import W2.q;
import X2.m;
import h3.AbstractC1022o;
import h3.C1018m;
import h3.InterfaceC1016l;
import h3.M;
import h3.P0;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m3.C;
import q.AbstractC1489b;

/* JADX INFO: loaded from: classes.dex */
public class b extends d implements q3.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11091i = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "owner");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q f11092h;
    private volatile Object owner;

    public final class a implements InterfaceC1016l, P0 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final C1018m f11093m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f11094n;

        /* JADX INFO: renamed from: q3.b$a$a, reason: collision with other inner class name */
        public static final class C0163a extends m implements l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ b f11096n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ a f11097o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0163a(b bVar, a aVar) {
                super(1);
                this.f11096n = bVar;
                this.f11097o = aVar;
            }

            public final void a(Throwable th) {
                this.f11096n.a(this.f11097o.f11094n);
            }

            @Override // W2.l
            public /* bridge */ /* synthetic */ Object k(Object obj) {
                a((Throwable) obj);
                return p.f2516a;
            }
        }

        /* JADX INFO: renamed from: q3.b$a$b, reason: collision with other inner class name */
        public static final class C0164b extends m implements l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ b f11098n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ a f11099o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0164b(b bVar, a aVar) {
                super(1);
                this.f11098n = bVar;
                this.f11099o = aVar;
            }

            public final void a(Throwable th) {
                b.f11091i.set(this.f11098n, this.f11099o.f11094n);
                this.f11098n.a(this.f11099o.f11094n);
            }

            @Override // W2.l
            public /* bridge */ /* synthetic */ Object k(Object obj) {
                a((Throwable) obj);
                return p.f2516a;
            }
        }

        public a(C1018m c1018m, Object obj) {
            this.f11093m = c1018m;
            this.f11094n = obj;
        }

        @Override // h3.InterfaceC1016l
        public void J(l lVar) {
            this.f11093m.J(lVar);
        }

        @Override // h3.InterfaceC1016l
        public void K(Object obj) {
            this.f11093m.K(obj);
        }

        @Override // h3.InterfaceC1016l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void v(p pVar, l lVar) {
            b.f11091i.set(b.this, this.f11094n);
            this.f11093m.v(pVar, new C0163a(b.this, this));
        }

        @Override // N2.e
        public i b() {
            return this.f11093m.b();
        }

        @Override // h3.P0
        public void c(C c4, int i4) {
            this.f11093m.c(c4, i4);
        }

        @Override // h3.InterfaceC1016l
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Object h(p pVar, Object obj, l lVar) {
            Object objH = this.f11093m.h(pVar, obj, new C0164b(b.this, this));
            if (objH != null) {
                b.f11091i.set(b.this, this.f11094n);
            }
            return objH;
        }

        @Override // N2.e
        public void p(Object obj) {
            this.f11093m.p(obj);
        }

        @Override // h3.InterfaceC1016l
        public boolean t(Throwable th) {
            return this.f11093m.t(th);
        }
    }

    /* JADX INFO: renamed from: q3.b$b, reason: collision with other inner class name */
    public static final class C0165b extends m implements q {

        /* JADX INFO: renamed from: q3.b$b$a */
        public static final class a extends m implements l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ b f11101n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Object f11102o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Object obj) {
                super(1);
                this.f11101n = bVar;
                this.f11102o = obj;
            }

            public final void a(Throwable th) {
                this.f11101n.a(this.f11102o);
            }

            @Override // W2.l
            public /* bridge */ /* synthetic */ Object k(Object obj) {
                a((Throwable) obj);
                return p.f2516a;
            }
        }

        public C0165b() {
            super(3);
        }

        public final l a(p3.a aVar, Object obj, Object obj2) {
            return new a(b.this, obj);
        }

        @Override // W2.q
        public /* bridge */ /* synthetic */ Object g(Object obj, Object obj2, Object obj3) {
            i.d.a(obj);
            return a(null, obj2, obj3);
        }
    }

    public b(boolean z3) {
        super(1, z3 ? 1 : 0);
        this.owner = z3 ? null : c.f11103a;
        this.f11092h = new C0165b();
    }

    public static /* synthetic */ Object p(b bVar, Object obj, N2.e eVar) {
        if (bVar.b(obj)) {
            return p.f2516a;
        }
        Object objQ = bVar.q(obj, eVar);
        return objQ == O2.c.c() ? objQ : p.f2516a;
    }

    @Override // q3.a
    public void a(Object obj) {
        while (d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11091i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != c.f11103a) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                if (AbstractC1489b.a(atomicReferenceFieldUpdater, this, obj2, c.f11103a)) {
                    j();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    @Override // q3.a
    public boolean b(Object obj) {
        int iR = r(obj);
        if (iR == 0) {
            return true;
        }
        if (iR == 1) {
            return false;
        }
        if (iR != 2) {
            throw new IllegalStateException("unexpected");
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    @Override // q3.a
    public Object c(Object obj, N2.e eVar) {
        return p(this, obj, eVar);
    }

    @Override // q3.a
    public boolean d() {
        return i() == 0;
    }

    public final int o(Object obj) {
        while (d()) {
            Object obj2 = f11091i.get(this);
            if (obj2 != c.f11103a) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public final Object q(Object obj, N2.e eVar) {
        C1018m c1018mB = AbstractC1022o.b(O2.b.b(eVar));
        try {
            e(new a(c1018mB, obj));
            Object objX = c1018mB.x();
            if (objX == O2.c.c()) {
                h.c(eVar);
            }
            return objX == O2.c.c() ? objX : p.f2516a;
        } catch (Throwable th) {
            c1018mB.L();
            throw th;
        }
    }

    public final int r(Object obj) {
        while (!k()) {
            if (obj == null) {
                return 1;
            }
            int iO = o(obj);
            if (iO == 1) {
                return 2;
            }
            if (iO == 2) {
                return 1;
            }
        }
        f11091i.set(this, obj);
        return 0;
    }

    public String toString() {
        return "Mutex@" + M.b(this) + "[isLocked=" + d() + ",owner=" + f11091i.get(this) + ']';
    }
}
