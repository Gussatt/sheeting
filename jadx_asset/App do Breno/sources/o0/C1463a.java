package o0;

import O2.c;
import P2.k;
import W2.p;
import X2.l;
import h3.AbstractC1010i;
import h3.AbstractC1011i0;
import h3.I;
import h3.InterfaceC1027q0;
import h3.J;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import k3.d;
import k3.e;

/* JADX INFO: renamed from: o0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1463a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f10731a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f10732b = new LinkedHashMap();

    /* JADX INFO: renamed from: o0.a$a, reason: collision with other inner class name */
    public static final class C0144a extends k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f10733q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d f10734r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ B.a f10735s;

        /* JADX INFO: renamed from: o0.a$a$a, reason: collision with other inner class name */
        public static final class C0145a implements e {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ B.a f10736m;

            public C0145a(B.a aVar) {
                this.f10736m = aVar;
            }

            @Override // k3.e
            public final Object a(Object obj, N2.e eVar) {
                this.f10736m.accept(obj);
                return K2.p.f2516a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0144a(d dVar, B.a aVar, N2.e eVar) {
            super(2, eVar);
            this.f10734r = dVar;
            this.f10735s = aVar;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            return new C0144a(this.f10734r, this.f10735s, eVar);
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = c.c();
            int i4 = this.f10733q;
            if (i4 == 0) {
                K2.k.b(obj);
                d dVar = this.f10734r;
                C0145a c0145a = new C0145a(this.f10735s);
                this.f10733q = 1;
                if (dVar.b(c0145a, this) == objC) {
                    return objC;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
            }
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(I i4, N2.e eVar) {
            return ((C0144a) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public final void a(Executor executor, B.a aVar, d dVar) {
        l.e(executor, "executor");
        l.e(aVar, "consumer");
        l.e(dVar, "flow");
        ReentrantLock reentrantLock = this.f10731a;
        reentrantLock.lock();
        try {
            if (this.f10732b.get(aVar) == null) {
                this.f10732b.put(aVar, AbstractC1010i.d(J.a(AbstractC1011i0.a(executor)), null, null, new C0144a(dVar, aVar, null), 3, null));
            }
            K2.p pVar = K2.p.f2516a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void b(B.a aVar) {
        l.e(aVar, "consumer");
        ReentrantLock reentrantLock = this.f10731a;
        reentrantLock.lock();
        try {
            InterfaceC1027q0 interfaceC1027q0 = (InterfaceC1027q0) this.f10732b.get(aVar);
            if (interfaceC1027q0 != null) {
                InterfaceC1027q0.a.a(interfaceC1027q0, null, 1, null);
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
