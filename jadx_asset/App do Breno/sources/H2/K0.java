package H2;

import H2.K0;
import K2.j;
import android.webkit.CookieManager;
import android.webkit.WebView;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class K0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1791b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1792a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void g(K0 k02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                k02.b().d().b(k02.c(), ((Long) obj2).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void h(K0 k02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            CookieManager cookieManager = (CookieManager) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.String");
            try {
                k02.h(cookieManager, str, (String) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void i(K0 k02, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            k02.f((CookieManager) obj2, new W2.l() { // from class: H2.J0
                @Override // W2.l
                public final Object k(Object obj3) {
                    return K0.a.j(eVar, (K2.j) obj3);
                }
            });
        }

        public static final K2.p j(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Q.f1841a.b(thD));
            } else {
                Object objI = jVar.i();
                if (K2.j.f(objI)) {
                    objI = null;
                }
                eVar.a(Q.f1841a.c((Boolean) objI));
            }
            return K2.p.f2516a;
        }

        public static final void k(K0 k02, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.CookieManager");
            CookieManager cookieManager = (CookieManager) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                k02.g(cookieManager, webView, ((Boolean) obj4).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void f(InterfaceC1609b interfaceC1609b, final K0 k02) {
            InterfaceC1615h c0295b;
            P pB;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (k02 == null || (pB = k02.b()) == null || (c0295b = pB.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.CookieManager.instance", c0295b);
            if (k02 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.F0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        K0.a.g(k02, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setCookie", c0295b);
            if (k02 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.G0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        K0.a.h(k02, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.CookieManager.removeAllCookies", c0295b);
            if (k02 != null) {
                c1608a3.e(new C1608a.d() { // from class: H2.H0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        K0.a.i(k02, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.CookieManager.setAcceptThirdPartyCookies", c0295b);
            if (k02 != null) {
                c1608a4.e(new C1608a.d() { // from class: H2.I0
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        K0.a.k(k02, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
        }

        public a() {
        }
    }

    public K0(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1792a = p4;
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
        return this.f1792a;
    }

    public abstract CookieManager c();

    public final void d(CookieManager cookieManager, final W2.l lVar) {
        X2.l.e(cookieManager, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (b().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (b().d().f(cookieManager)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance";
            new C1608a(b().a(), "dev.flutter.pigeon.webview_flutter_android.CookieManager.pigeon_newInstance", b().b()).d(L2.l.b(Long.valueOf(b().d().c(cookieManager))), new C1608a.e() { // from class: H2.E0
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    K0.e(lVar, str, obj);
                }
            });
        }
    }

    public abstract void f(CookieManager cookieManager, W2.l lVar);

    public abstract void g(CookieManager cookieManager, WebView webView, boolean z3);

    public abstract void h(CookieManager cookieManager, String str, String str2);
}
