package Z;

import K2.p;
import W2.l;
import X2.m;
import h3.P;
import java.util.concurrent.CancellationException;
import q.AbstractC1490c;
import q1.InterfaceFutureC1495d;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a extends m implements l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ AbstractC1490c.a f4015n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final /* synthetic */ P f4016o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC1490c.a aVar, P p4) {
            super(1);
            this.f4015n = aVar;
            this.f4016o = p4;
        }

        public final void a(Throwable th) {
            if (th == null) {
                this.f4015n.b(this.f4016o.k());
            } else if (th instanceof CancellationException) {
                this.f4015n.c();
            } else {
                this.f4015n.e(th);
            }
        }

        @Override // W2.l
        public /* bridge */ /* synthetic */ Object k(Object obj) {
            a((Throwable) obj);
            return p.f2516a;
        }
    }

    public static final InterfaceFutureC1495d b(final P p4, final Object obj) {
        X2.l.e(p4, "<this>");
        InterfaceFutureC1495d interfaceFutureC1495dA = AbstractC1490c.a(new AbstractC1490c.InterfaceC0157c() { // from class: Z.a
            @Override // q.AbstractC1490c.InterfaceC0157c
            public final Object a(AbstractC1490c.a aVar) {
                return b.d(p4, obj, aVar);
            }
        });
        X2.l.d(interfaceFutureC1495dA, "getFuture { completer ->…      }\n        tag\n    }");
        return interfaceFutureC1495dA;
    }

    public static /* synthetic */ InterfaceFutureC1495d c(P p4, Object obj, int i4, Object obj2) {
        if ((i4 & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return b(p4, obj);
    }

    public static final Object d(P p4, Object obj, AbstractC1490c.a aVar) {
        X2.l.e(p4, "$this_asListenableFuture");
        X2.l.e(aVar, "completer");
        p4.M(new a(aVar, p4));
        return obj;
    }
}
