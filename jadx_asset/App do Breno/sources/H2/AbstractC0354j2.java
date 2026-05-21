package H2;

import H2.AbstractC0354j2;
import H2.Y3;
import K2.j;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: H2.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0354j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2076b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2077a;

    /* JADX INFO: renamed from: H2.j2$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void h(AbstractC0354j2 abstractC0354j2, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                abstractC0354j2.l().d().b(abstractC0354j2.I(), ((Long) obj2).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void i(AbstractC0354j2 abstractC0354j2, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            Y3.b bVar = (Y3.b) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                abstractC0354j2.N(bVar, ((Boolean) obj3).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void j(AbstractC0354j2 abstractC0354j2, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            Y3.b bVar = (Y3.b) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                abstractC0354j2.O(bVar, ((Boolean) obj3).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void k(AbstractC0354j2 abstractC0354j2, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            Y3.b bVar = (Y3.b) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                abstractC0354j2.K(bVar, ((Boolean) obj3).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void l(AbstractC0354j2 abstractC0354j2, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            Y3.b bVar = (Y3.b) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                abstractC0354j2.L(bVar, ((Boolean) obj3).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void m(AbstractC0354j2 abstractC0354j2, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.WebChromeClientProxyApi.WebChromeClientImpl");
            Y3.b bVar = (Y3.b) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                abstractC0354j2.M(bVar, ((Boolean) obj3).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void g(InterfaceC1609b interfaceC1609b, final AbstractC0354j2 abstractC0354j2) {
            InterfaceC1615h c0295b;
            P pL;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (abstractC0354j2 == null || (pL = abstractC0354j2.l()) == null || (c0295b = pL.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.pigeon_defaultConstructor", c0295b);
            if (abstractC0354j2 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.d2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0354j2.a.h(abstractC0354j2, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnShowFileChooser", c0295b);
            if (abstractC0354j2 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.e2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0354j2.a.j(abstractC0354j2, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnConsoleMessage", c0295b);
            if (abstractC0354j2 != null) {
                c1608a3.e(new C1608a.d() { // from class: H2.f2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0354j2.a.k(abstractC0354j2, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsAlert", c0295b);
            if (abstractC0354j2 != null) {
                c1608a4.e(new C1608a.d() { // from class: H2.g2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0354j2.a.l(abstractC0354j2, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
            C1608a c1608a5 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsConfirm", c0295b);
            if (abstractC0354j2 != null) {
                c1608a5.e(new C1608a.d() { // from class: H2.h2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0354j2.a.m(abstractC0354j2, obj, eVar);
                    }
                });
            } else {
                c1608a5.e(null);
            }
            C1608a c1608a6 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.setSynchronousReturnValueForOnJsPrompt", c0295b);
            if (abstractC0354j2 != null) {
                c1608a6.e(new C1608a.d() { // from class: H2.i2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0354j2.a.i(abstractC0354j2, obj, eVar);
                    }
                });
            } else {
                c1608a6.e(null);
            }
        }

        public a() {
        }
    }

    public AbstractC0354j2(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2077a = p4;
    }

    public static final void B(W2.l lVar, String str, Object obj) {
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

    public static final void D(W2.l lVar, String str, Object obj) {
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

    public static final void F(W2.l lVar, String str, Object obj) {
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

    public static final void H(W2.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(Q.f1841a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            j.a aVar2 = K2.j.f2509n;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a((String) obj2, (String) obj3, (String) list.get(2))))));
            return;
        }
        if (list.get(0) == null) {
            j.a aVar3 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("null-error", "Flutter api returned null value for non-null return value.", "")))));
        } else {
            Object obj4 = list.get(0);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
            lVar.k(K2.j.a(K2.j.b((List) obj4)));
        }
    }

    public static final void n(W2.l lVar, String str, Object obj) {
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

    public static final void p(W2.l lVar, String str, Object obj) {
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

    public static final void r(W2.l lVar, String str, Object obj) {
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

    public static final void t(W2.l lVar, String str, Object obj) {
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

    public static final void v(W2.l lVar, String str, Object obj) {
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

    public static final void x(W2.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(Q.f1841a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() > 1) {
            j.a aVar2 = K2.j.f2509n;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a((String) obj2, (String) obj3, (String) list.get(2))))));
            return;
        }
        if (list.get(0) == null) {
            j.a aVar3 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("null-error", "Flutter api returned null value for non-null return value.", "")))));
            return;
        }
        Object obj4 = list.get(0);
        X2.l.c(obj4, "null cannot be cast to non-null type kotlin.Boolean");
        Boolean bool = (Boolean) obj4;
        bool.booleanValue();
        lVar.k(K2.j.a(K2.j.b(bool)));
    }

    public static final void z(W2.l lVar, String str, Object obj) {
        if (!(obj instanceof List)) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(Q.f1841a.a(str)))));
            return;
        }
        List list = (List) obj;
        if (list.size() <= 1) {
            lVar.k(K2.j.a(K2.j.b((String) list.get(0))));
            return;
        }
        j.a aVar2 = K2.j.f2509n;
        Object obj2 = list.get(0);
        X2.l.c(obj2, "null cannot be cast to non-null type kotlin.String");
        Object obj3 = list.get(1);
        X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
        lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a((String) obj2, (String) obj3, (String) list.get(2))))));
    }

    public final void A(Y3.b bVar, PermissionRequest permissionRequest, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(permissionRequest, "requestArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onPermissionRequest", l().b()).d(L2.m.i(bVar, permissionRequest), new C1608a.e() { // from class: H2.X1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.B(lVar, str, obj);
                }
            });
        }
    }

    public final void C(Y3.b bVar, WebView webView, long j4, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onProgressChanged", l().b()).d(L2.m.i(bVar, webView, Long.valueOf(j4)), new C1608a.e() { // from class: H2.T1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.D(lVar, str, obj);
                }
            });
        }
    }

    public final void E(Y3.b bVar, View view, WebChromeClient.CustomViewCallback customViewCallback, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(view, "viewArg");
        X2.l.e(customViewCallback, "callbackArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowCustomView", l().b()).d(L2.m.i(bVar, view, customViewCallback), new C1608a.e() { // from class: H2.Y1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.F(lVar, str, obj);
                }
            });
        }
    }

    public final void G(Y3.b bVar, WebView webView, WebChromeClient.FileChooserParams fileChooserParams, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(fileChooserParams, "paramsArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onShowFileChooser", l().b()).d(L2.m.i(bVar, webView, fileChooserParams), new C1608a.e() { // from class: H2.W1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.H(lVar, str, obj);
                }
            });
        }
    }

    public abstract Y3.b I();

    public final void J(Y3.b bVar, W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (l().d().f(bVar)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            j.a aVar3 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("new-instance-error", "Attempting to create a new Dart instance of WebChromeClient, but the class has a nonnull callback method.", "")))));
        }
    }

    public abstract void K(Y3.b bVar, boolean z3);

    public abstract void L(Y3.b bVar, boolean z3);

    public abstract void M(Y3.b bVar, boolean z3);

    public abstract void N(Y3.b bVar, boolean z3);

    public abstract void O(Y3.b bVar, boolean z3);

    public P l() {
        return this.f2077a;
    }

    public final void m(Y3.b bVar, ConsoleMessage consoleMessage, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(consoleMessage, "messageArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onConsoleMessage", l().b()).d(L2.m.i(bVar, consoleMessage), new C1608a.e() { // from class: H2.Z1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.n(lVar, str, obj);
                }
            });
        }
    }

    public final void o(Y3.b bVar, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsHidePrompt", l().b()).d(L2.l.b(bVar), new C1608a.e() { // from class: H2.c2
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.p(lVar, str, obj);
                }
            });
        }
    }

    public final void q(Y3.b bVar, String str, GeolocationPermissions.Callback callback, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(str, "originArg");
        X2.l.e(callback, "callbackArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str2 = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onGeolocationPermissionsShowPrompt", l().b()).d(L2.m.i(bVar, str, callback), new C1608a.e() { // from class: H2.a2
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.r(lVar, str2, obj);
                }
            });
        }
    }

    public final void s(Y3.b bVar, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onHideCustomView", l().b()).d(L2.l.b(bVar), new C1608a.e() { // from class: H2.S1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.t(lVar, str, obj);
                }
            });
        }
    }

    public final void u(Y3.b bVar, WebView webView, String str, String str2, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(str, "urlArg");
        X2.l.e(str2, "messageArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str3 = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsAlert", l().b()).d(L2.m.i(bVar, webView, str, str2), new C1608a.e() { // from class: H2.V1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.v(lVar, str3, obj);
                }
            });
        }
    }

    public final void w(Y3.b bVar, WebView webView, String str, String str2, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(str, "urlArg");
        X2.l.e(str2, "messageArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str3 = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsConfirm", l().b()).d(L2.m.i(bVar, webView, str, str2), new C1608a.e() { // from class: H2.b2
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.x(lVar, str3, obj);
                }
            });
        }
    }

    public final void y(Y3.b bVar, WebView webView, String str, String str2, String str3, final W2.l lVar) {
        X2.l.e(bVar, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(str, "urlArg");
        X2.l.e(str2, "messageArg");
        X2.l.e(str3, "defaultValueArg");
        X2.l.e(lVar, "callback");
        if (l().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str4 = "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt";
            new C1608a(l().a(), "dev.flutter.pigeon.webview_flutter_android.WebChromeClient.onJsPrompt", l().b()).d(L2.m.i(bVar, webView, str, str2, str3), new C1608a.e() { // from class: H2.U1
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0354j2.z(lVar, str4, obj);
                }
            });
        }
    }
}
