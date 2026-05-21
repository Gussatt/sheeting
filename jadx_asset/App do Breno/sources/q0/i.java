package q0;

import W2.p;
import android.app.Activity;
import b0.ExecutorC0628k;
import h3.W;
import j3.r;
import q0.i;
import r0.InterfaceC1503a;

/* JADX INFO: loaded from: classes.dex */
public final class i implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f11046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1503a f11047c;

    public static final class a extends P2.k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f11048q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f11049r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Activity f11051t;

        /* JADX INFO: renamed from: q0.i$a$a, reason: collision with other inner class name */
        public static final class C0160a extends X2.m implements W2.a {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ i f11052n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ B.a f11053o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0160a(i iVar, B.a aVar) {
                super(0);
                this.f11052n = iVar;
                this.f11053o = aVar;
            }

            public final void a() {
                this.f11052n.f11047c.b(this.f11053o);
            }

            @Override // W2.a
            public /* bridge */ /* synthetic */ Object e() {
                a();
                return K2.p.f2516a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Activity activity, N2.e eVar) {
            super(2, eVar);
            this.f11051t = activity;
        }

        public static final void x(r rVar, j jVar) {
            rVar.B(jVar);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            a aVar = i.this.new a(this.f11051t, eVar);
            aVar.f11049r = obj;
            return aVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f11048q;
            if (i4 == 0) {
                K2.k.b(obj);
                final r rVar = (r) this.f11049r;
                B.a aVar = new B.a() { // from class: q0.h
                    @Override // B.a
                    public final void accept(Object obj2) {
                        i.a.x(rVar, (j) obj2);
                    }
                };
                i.this.f11047c.a(this.f11051t, new ExecutorC0628k(), aVar);
                C0160a c0160a = new C0160a(i.this, aVar);
                this.f11048q = 1;
                if (j3.p.a(rVar, c0160a, this) == objC) {
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
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object j(r rVar, N2.e eVar) {
            return ((a) m(rVar, eVar)).q(K2.p.f2516a);
        }
    }

    public i(l lVar, InterfaceC1503a interfaceC1503a) {
        X2.l.e(lVar, "windowMetricsCalculator");
        X2.l.e(interfaceC1503a, "windowBackend");
        this.f11046b = lVar;
        this.f11047c = interfaceC1503a;
    }

    @Override // q0.f
    public k3.d a(Activity activity) {
        X2.l.e(activity, "activity");
        return k3.f.n(k3.f.c(new a(activity, null)), W.c());
    }
}
