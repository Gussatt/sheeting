package com.google.firebase.ktx;

import L2.m;
import X2.l;
import com.google.firebase.components.ComponentRegistrar;
import h3.AbstractC1011i0;
import h3.F;
import java.util.List;
import java.util.concurrent.Executor;
import v1.InterfaceC1586a;
import v1.InterfaceC1587b;
import v1.InterfaceC1588c;
import v1.InterfaceC1589d;
import w1.C1604c;
import w1.E;
import w1.InterfaceC1605d;
import w1.g;
import w1.q;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f7072a = new a();

        @Override // w1.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC1605d interfaceC1605d) {
            Object objF = interfaceC1605d.f(E.a(InterfaceC1586a.class, Executor.class));
            l.d(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1011i0.a((Executor) objF);
        }
    }

    public static final class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f7073a = new b();

        @Override // w1.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC1605d interfaceC1605d) {
            Object objF = interfaceC1605d.f(E.a(InterfaceC1588c.class, Executor.class));
            l.d(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1011i0.a((Executor) objF);
        }
    }

    public static final class c implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f7074a = new c();

        @Override // w1.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC1605d interfaceC1605d) {
            Object objF = interfaceC1605d.f(E.a(InterfaceC1587b.class, Executor.class));
            l.d(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1011i0.a((Executor) objF);
        }
    }

    public static final class d implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f7075a = new d();

        @Override // w1.g
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final F a(InterfaceC1605d interfaceC1605d) {
            Object objF = interfaceC1605d.f(E.a(InterfaceC1589d.class, Executor.class));
            l.d(objF, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return AbstractC1011i0.a((Executor) objF);
        }
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<C1604c> getComponents() {
        C1604c c1604cC = C1604c.e(E.a(InterfaceC1586a.class, F.class)).b(q.j(E.a(InterfaceC1586a.class, Executor.class))).e(a.f7072a).c();
        l.d(c1604cC, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1604c c1604cC2 = C1604c.e(E.a(InterfaceC1588c.class, F.class)).b(q.j(E.a(InterfaceC1588c.class, Executor.class))).e(b.f7073a).c();
        l.d(c1604cC2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1604c c1604cC3 = C1604c.e(E.a(InterfaceC1587b.class, F.class)).b(q.j(E.a(InterfaceC1587b.class, Executor.class))).e(c.f7074a).c();
        l.d(c1604cC3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        C1604c c1604cC4 = C1604c.e(E.a(InterfaceC1589d.class, F.class)).b(q.j(E.a(InterfaceC1589d.class, Executor.class))).e(d.f7075a).c();
        l.d(c1604cC4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return m.i(c1604cC, c1604cC2, c1604cC3, c1604cC4);
    }
}
