package C2;

import C2.o;
import android.content.Context;
import android.os.Looper;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.C1446m;
import n1.InterfaceC1439f;
import r1.C1509f;
import r1.n;
import s2.InterfaceC1536a;

/* JADX INFO: loaded from: classes.dex */
public class i implements InterfaceC1536a, o.b, o.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Map f720e = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f722d = false;

    public static /* synthetic */ void q(String str, Boolean bool, C1446m c1446m) {
        try {
            C1509f.p(str).D(bool);
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static /* synthetic */ void s(String str, Boolean bool, C1446m c1446m) {
        try {
            C1509f.p(str).C(bool.booleanValue());
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static /* synthetic */ void u(String str, C1446m c1446m) {
        try {
            try {
                C1509f.p(str).j();
            } catch (IllegalStateException unused) {
            }
            c1446m.c(null);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public static /* synthetic */ void y(o.f fVar, AbstractC1445l abstractC1445l) {
        if (abstractC1445l.m()) {
            fVar.a(abstractC1445l.j());
        } else {
            fVar.b(abstractC1445l.i());
        }
    }

    public final o.d A(r1.n nVar) {
        o.d.a aVar = new o.d.a();
        aVar.b(nVar.b());
        aVar.c(nVar.c());
        if (nVar.f() != null) {
            aVar.e(nVar.f());
        }
        if (nVar.g() != null) {
            aVar.f(nVar.g());
        }
        aVar.d(nVar.d());
        aVar.g(nVar.h());
        aVar.h(nVar.e());
        return aVar.a();
    }

    public final /* synthetic */ void B(C1509f c1509f, C1446m c1446m) {
        try {
            o.e.a aVar = new o.e.a();
            aVar.c(c1509f.q());
            aVar.d(A(c1509f.r()));
            aVar.b(Boolean.valueOf(c1509f.x()));
            aVar.e((Map) AbstractC1448o.a(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(c1509f)));
            c1446m.c(aVar.a());
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public final /* synthetic */ void C(o.d dVar, String str, C1446m c1446m) {
        try {
            r1.n nVarA = new n.b().b(dVar.b()).c(dVar.c()).d(dVar.e()).f(dVar.f()).g(dVar.g()).h(dVar.h()).e(dVar.i()).a();
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (dVar.d() != null) {
                f720e.put(str, dVar.d());
            }
            c1446m.c((o.e) AbstractC1448o.a(z(C1509f.w(this.f721c, nVarA, str))));
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public final /* synthetic */ void D(C1446m c1446m) {
        try {
            if (this.f722d) {
                AbstractC1448o.a(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.f722d = true;
            }
            List listN = C1509f.n(this.f721c);
            ArrayList arrayList = new ArrayList(listN.size());
            Iterator it = listN.iterator();
            while (it.hasNext()) {
                arrayList.add((o.e) AbstractC1448o.a(z((C1509f) it.next())));
            }
            c1446m.c(arrayList);
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public final /* synthetic */ void E(C1446m c1446m) {
        try {
            r1.n nVarA = r1.n.a(this.f721c);
            if (nVarA == null) {
                c1446m.b(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                c1446m.c(A(nVarA));
            }
        } catch (Exception e4) {
            c1446m.b(e4);
        }
    }

    public final void F(C1446m c1446m, final o.f fVar) {
        c1446m.a().c(new InterfaceC1439f() { // from class: C2.g
            @Override // n1.InterfaceC1439f
            public final void a(AbstractC1445l abstractC1445l) {
                i.y(fVar, abstractC1445l);
            }
        });
    }

    @Override // s2.InterfaceC1536a
    public void c(InterfaceC1536a.b bVar) {
        o.b.o(bVar.b(), this);
        o.a.i(bVar.b(), this);
        this.f721c = bVar.a();
    }

    @Override // C2.o.a
    public void e(final String str, final Boolean bool, o.f fVar) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: C2.e
            @Override // java.lang.Runnable
            public final void run() {
                i.s(str, bool, c1446m);
            }
        });
        F(c1446m, fVar);
    }

    @Override // C2.o.b
    public void f(o.f fVar) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: C2.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f702m.E(c1446m);
            }
        });
        F(c1446m, fVar);
    }

    @Override // C2.o.a
    public void g(final String str, o.f fVar) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: C2.a
            @Override // java.lang.Runnable
            public final void run() {
                i.u(str, c1446m);
            }
        });
        F(c1446m, fVar);
    }

    @Override // C2.o.a
    public void h(final String str, final Boolean bool, o.f fVar) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: C2.c
            @Override // java.lang.Runnable
            public final void run() {
                i.q(str, bool, c1446m);
            }
        });
        F(c1446m, fVar);
    }

    @Override // C2.o.b
    public void m(final String str, final o.d dVar, o.f fVar) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: C2.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f712m.C(dVar, str, c1446m);
            }
        });
        F(c1446m, fVar);
    }

    @Override // C2.o.b
    public void n(o.f fVar) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: C2.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f707m.D(c1446m);
            }
        });
        F(c1446m, fVar);
    }

    @Override // s2.InterfaceC1536a
    public void r(InterfaceC1536a.b bVar) {
        this.f721c = null;
        o.b.o(bVar.b(), null);
        o.a.i(bVar.b(), null);
    }

    public final AbstractC1445l z(final C1509f c1509f) {
        final C1446m c1446m = new C1446m();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: C2.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f717m.B(c1509f, c1446m);
            }
        });
        return c1446m.a();
    }
}
