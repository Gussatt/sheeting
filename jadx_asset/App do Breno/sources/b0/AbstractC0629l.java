package b0;

import W2.p;
import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import h3.C1018m;
import h3.I;
import h3.J;

/* JADX INFO: renamed from: b0.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0629l extends AbstractC0619b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MeasurementManager f5540b;

    /* JADX INFO: renamed from: b0.l$a */
    public static final class a extends P2.k implements p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f5541q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f5542r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ AbstractC0629l f5543s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0630m abstractC0630m, AbstractC0629l abstractC0629l, N2.e eVar) {
            super(2, eVar);
            this.f5543s = abstractC0629l;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            a aVar = new a(null, this.f5543s, eVar);
            aVar.f5542r = obj;
            return aVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            O2.c.c();
            if (this.f5541q != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            K2.k.b(obj);
            throw null;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(I i4, N2.e eVar) {
            return ((a) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public AbstractC0629l(MeasurementManager measurementManager) {
        X2.l.e(measurementManager, "mMeasurementManager");
        this.f5540b = measurementManager;
    }

    public static /* synthetic */ Object h(AbstractC0629l abstractC0629l, AbstractC0618a abstractC0618a, N2.e eVar) {
        new C1018m(O2.b.b(eVar), 1).A();
        abstractC0629l.i();
        throw null;
    }

    public static /* synthetic */ Object j(AbstractC0629l abstractC0629l, N2.e eVar) {
        C1018m c1018m = new C1018m(O2.b.b(eVar), 1);
        c1018m.A();
        abstractC0629l.i().getMeasurementApiStatus(new ExecutorC0628k(), y.i.a(c1018m));
        Object objX = c1018m.x();
        if (objX == O2.c.c()) {
            P2.h.c(eVar);
        }
        return objX;
    }

    public static /* synthetic */ Object k(AbstractC0629l abstractC0629l, Uri uri, InputEvent inputEvent, N2.e eVar) {
        C1018m c1018m = new C1018m(O2.b.b(eVar), 1);
        c1018m.A();
        abstractC0629l.i().registerSource(uri, inputEvent, new ExecutorC0628k(), y.i.a(c1018m));
        Object objX = c1018m.x();
        if (objX == O2.c.c()) {
            P2.h.c(eVar);
        }
        return objX == O2.c.c() ? objX : K2.p.f2516a;
    }

    public static /* synthetic */ Object l(AbstractC0629l abstractC0629l, AbstractC0630m abstractC0630m, N2.e eVar) {
        Object objB = J.b(new a(abstractC0630m, abstractC0629l, null), eVar);
        return objB == O2.c.c() ? objB : K2.p.f2516a;
    }

    public static /* synthetic */ Object m(AbstractC0629l abstractC0629l, Uri uri, N2.e eVar) {
        C1018m c1018m = new C1018m(O2.b.b(eVar), 1);
        c1018m.A();
        abstractC0629l.i().registerTrigger(uri, new ExecutorC0628k(), y.i.a(c1018m));
        Object objX = c1018m.x();
        if (objX == O2.c.c()) {
            P2.h.c(eVar);
        }
        return objX == O2.c.c() ? objX : K2.p.f2516a;
    }

    public static /* synthetic */ Object n(AbstractC0629l abstractC0629l, AbstractC0631n abstractC0631n, N2.e eVar) {
        new C1018m(O2.b.b(eVar), 1).A();
        abstractC0629l.i();
        throw null;
    }

    public static /* synthetic */ Object o(AbstractC0629l abstractC0629l, AbstractC0632o abstractC0632o, N2.e eVar) {
        new C1018m(O2.b.b(eVar), 1).A();
        abstractC0629l.i();
        throw null;
    }

    @Override // b0.AbstractC0619b
    public Object a(AbstractC0618a abstractC0618a, N2.e eVar) {
        return h(this, abstractC0618a, eVar);
    }

    @Override // b0.AbstractC0619b
    public Object b(N2.e eVar) {
        return j(this, eVar);
    }

    @Override // b0.AbstractC0619b
    public Object c(Uri uri, InputEvent inputEvent, N2.e eVar) {
        return k(this, uri, inputEvent, eVar);
    }

    @Override // b0.AbstractC0619b
    public Object d(AbstractC0630m abstractC0630m, N2.e eVar) {
        return l(this, abstractC0630m, eVar);
    }

    @Override // b0.AbstractC0619b
    public Object e(Uri uri, N2.e eVar) {
        return m(this, uri, eVar);
    }

    @Override // b0.AbstractC0619b
    public Object f(AbstractC0631n abstractC0631n, N2.e eVar) {
        return n(this, abstractC0631n, eVar);
    }

    @Override // b0.AbstractC0619b
    public Object g(AbstractC0632o abstractC0632o, N2.e eVar) {
        return o(this, abstractC0632o, eVar);
    }

    public final MeasurementManager i() {
        return this.f5540b;
    }
}
