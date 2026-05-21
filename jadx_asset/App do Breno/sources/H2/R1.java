package H2;

import H2.R1;
import K2.j;
import android.view.View;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class R1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1857b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1858a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void h(R1 r12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.Long");
            try {
                r12.g(view, jLongValue, ((Long) obj4).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void i(R1 r12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.OverScrollMode");
            try {
                r12.i(view, (EnumC0389p0) obj3);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void j(R1 r12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            long jLongValue = ((Long) obj3).longValue();
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.Long");
            try {
                r12.f(view, jLongValue, ((Long) obj4).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void k(R1 r12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.view.View");
            try {
                listB = L2.l.b(r12.c((View) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void l(R1 r12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                r12.j(view, ((Boolean) obj3).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void m(R1 r12, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.view.View");
            View view = (View) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                r12.h(view, ((Boolean) obj3).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void g(InterfaceC1609b interfaceC1609b, final R1 r12) {
            InterfaceC1615h c0295b;
            P pB;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (r12 == null || (pB = r12.b()) == null || (c0295b = pB.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.View.scrollTo", c0295b);
            if (r12 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.L1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        R1.a.h(r12, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.View.scrollBy", c0295b);
            if (r12 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.M1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        R1.a.j(r12, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.View.getScrollPosition", c0295b);
            if (r12 != null) {
                c1608a3.e(new C1608a.d() { // from class: H2.N1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        R1.a.k(r12, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.View.setVerticalScrollBarEnabled", c0295b);
            if (r12 != null) {
                c1608a4.e(new C1608a.d() { // from class: H2.O1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        R1.a.l(r12, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
            C1608a c1608a5 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.View.setHorizontalScrollBarEnabled", c0295b);
            if (r12 != null) {
                c1608a5.e(new C1608a.d() { // from class: H2.P1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        R1.a.m(r12, obj, eVar);
                    }
                });
            } else {
                c1608a5.e(null);
            }
            C1608a c1608a6 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.View.setOverScrollMode", c0295b);
            if (r12 != null) {
                c1608a6.e(new C1608a.d() { // from class: H2.Q1
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        R1.a.i(r12, obj, eVar);
                    }
                });
            } else {
                c1608a6.e(null);
            }
        }

        public a() {
        }
    }

    public R1(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1858a = p4;
    }

    public static final void e(W2.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(Q.f1841a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
            return;
        }
        j.a aVar3 = K2.j.f2509n;
        Object obj2 = list.get(0);
        X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    public P b() {
        return this.f1858a;
    }

    public abstract E5 c(View view);

    public final void d(View view, final W2.l lVar) {
        X2.l.e(view, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(view)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance";
            new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.View.pigeon_newInstance", b().b()).d(L2.l.b(Long.valueOf(b().d().c(view))), new C1608a.e() { // from class: H2.K1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    R1.e(lVar, str, obj);
                }
            });
        }
    }

    public abstract void f(View view, long j4, long j5);

    public abstract void g(View view, long j4, long j5);

    public abstract void h(View view, boolean z3);

    public abstract void i(View view, EnumC0389p0 enumC0389p0);

    public abstract void j(View view, boolean z3);
}
