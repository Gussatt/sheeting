package H2;

import H2.J3;
import K2.j;
import android.net.http.SslError;
import android.os.Message;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import k0.AbstractC1138b;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class J3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f1786b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f1787a;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void d(J3 j32, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                j32.u().d().b(j32.X(), ((Long) obj2).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void e(J3 j32, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebViewClient");
            WebViewClient webViewClient = (WebViewClient) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                j32.c0(webViewClient, ((Boolean) obj3).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void c(InterfaceC1609b interfaceC1609b, final J3 j32) {
            InterfaceC1615h c0295b;
            P pU;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (j32 == null || (pU = j32.u()) == null || (c0295b = pU.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_defaultConstructor", c0295b);
            if (j32 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.H3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        J3.a.d(j32, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebViewClient.setSynchronousReturnValueForShouldOverrideUrlLoading", c0295b);
            if (j32 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.I3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        J3.a.e(j32, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
        }

        public a() {
        }
    }

    public J3(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f1787a = p4;
    }

    public static final void A(W2.l lVar, String str, Object obj) {
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

    public static final void C(W2.l lVar, String str, Object obj) {
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

    public static final void E(W2.l lVar, String str, Object obj) {
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

    public static final void G(W2.l lVar, String str, Object obj) {
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

    public static final void I(W2.l lVar, String str, Object obj) {
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

    public static final void K(W2.l lVar, String str, Object obj) {
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

    public static final void M(W2.l lVar, String str, Object obj) {
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

    public static final void O(W2.l lVar, String str, Object obj) {
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

    public static final void Q(W2.l lVar, String str, Object obj) {
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

    public static final void S(W2.l lVar, String str, Object obj) {
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

    public static final void U(W2.l lVar, String str, Object obj) {
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

    public static final void W(W2.l lVar, String str, Object obj) {
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

    public static final void Z(W2.l lVar, String str, Object obj) {
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

    public static final void b0(W2.l lVar, String str, Object obj) {
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

    public static final void e0(W2.l lVar, String str, Object obj) {
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

    public static final void w(W2.l lVar, String str, Object obj) {
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

    public static final void y(W2.l lVar, String str, Object obj) {
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

    public final void B(WebViewClient webViewClient, WebView webView, String str, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(str, "urlArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str2 = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageFinished", u().b()).d(L2.m.i(webViewClient, webView, str), new C1608a.e() { // from class: H2.C3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.C(lVar, str2, obj);
                }
            });
        }
    }

    public final void D(WebViewClient webViewClient, WebView webView, String str, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(str, "urlArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str2 = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageStarted", u().b()).d(L2.m.i(webViewClient, webView, str), new C1608a.e() { // from class: H2.w3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.E(lVar, str2, obj);
                }
            });
        }
    }

    public final void F(WebViewClient webViewClient, WebView webView, ClientCertRequest clientCertRequest, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "viewArg");
        X2.l.e(clientCertRequest, "requestArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedClientCertRequest", u().b()).d(L2.m.i(webViewClient, webView, clientCertRequest), new C1608a.e() { // from class: H2.x3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.G(lVar, str, obj);
                }
            });
        }
    }

    public final void H(WebViewClient webViewClient, WebView webView, long j4, String str, String str2, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(str, "descriptionArg");
        X2.l.e(str2, "failingUrlArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str3 = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedError", u().b()).d(L2.m.i(webViewClient, webView, Long.valueOf(j4), str, str2), new C1608a.e() { // from class: H2.D3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.I(lVar, str3, obj);
                }
            });
        }
    }

    public final void J(WebViewClient webViewClient, WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(httpAuthHandler, "handlerArg");
        X2.l.e(str, "hostArg");
        X2.l.e(str2, "realmArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str3 = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpAuthRequest", u().b()).d(L2.m.i(webViewClient, webView, httpAuthHandler, str, str2), new C1608a.e() { // from class: H2.E3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.K(lVar, str3, obj);
                }
            });
        }
    }

    public final void L(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(webResourceRequest, "requestArg");
        X2.l.e(webResourceResponse, "responseArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedHttpError", u().b()).d(L2.m.i(webViewClient, webView, webResourceRequest, webResourceResponse), new C1608a.e() { // from class: H2.t3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.M(lVar, str, obj);
                }
            });
        }
    }

    public final void N(WebViewClient webViewClient, WebView webView, String str, String str2, String str3, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "viewArg");
        X2.l.e(str, "realmArg");
        X2.l.e(str3, "argsArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str4 = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedLoginRequest", u().b()).d(L2.m.i(webViewClient, webView, str, str2, str3), new C1608a.e() { // from class: H2.v3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.O(lVar, str4, obj);
                }
            });
        }
    }

    public final void P(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(webResourceRequest, "requestArg");
        X2.l.e(webResourceError, "errorArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestError", u().b()).d(L2.m.i(webViewClient, webView, webResourceRequest, webResourceError), new C1608a.e() { // from class: H2.B3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.Q(lVar, str, obj);
                }
            });
        }
    }

    public final void R(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, AbstractC1138b abstractC1138b, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(webResourceRequest, "requestArg");
        X2.l.e(abstractC1138b, "errorArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedRequestErrorCompat", u().b()).d(L2.m.i(webViewClient, webView, webResourceRequest, abstractC1138b), new C1608a.e() { // from class: H2.y3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.S(lVar, str, obj);
                }
            });
        }
    }

    public final void T(WebViewClient webViewClient, WebView webView, SslErrorHandler sslErrorHandler, SslError sslError, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "viewArg");
        X2.l.e(sslErrorHandler, "handlerArg");
        X2.l.e(sslError, "errorArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onReceivedSslError", u().b()).d(L2.m.i(webViewClient, webView, sslErrorHandler, sslError), new C1608a.e() { // from class: H2.G3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.U(lVar, str, obj);
                }
            });
        }
    }

    public final void V(WebViewClient webViewClient, WebView webView, double d4, double d5, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "viewArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onScaleChanged", u().b()).d(L2.m.i(webViewClient, webView, Double.valueOf(d4), Double.valueOf(d5)), new C1608a.e() { // from class: H2.q3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.W(lVar, str, obj);
                }
            });
        }
    }

    public abstract WebViewClient X();

    public final void Y(WebViewClient webViewClient, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (u().d().f(webViewClient)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.pigeon_newInstance", u().b()).d(L2.l.b(Long.valueOf(u().d().c(webViewClient))), new C1608a.e() { // from class: H2.p3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.Z(lVar, str, obj);
                }
            });
        }
    }

    public final void a0(WebViewClient webViewClient, WebView webView, WebResourceRequest webResourceRequest, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(webResourceRequest, "requestArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.requestLoading", u().b()).d(L2.m.i(webViewClient, webView, webResourceRequest), new C1608a.e() { // from class: H2.z3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.b0(lVar, str, obj);
                }
            });
        }
    }

    public abstract void c0(WebViewClient webViewClient, boolean z3);

    public final void d0(WebViewClient webViewClient, WebView webView, String str, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(str, "urlArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str2 = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.urlLoading", u().b()).d(L2.m.i(webViewClient, webView, str), new C1608a.e() { // from class: H2.r3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.e0(lVar, str2, obj);
                }
            });
        }
    }

    public final void s(WebViewClient webViewClient, WebView webView, String str, boolean z3, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "webViewArg");
        X2.l.e(str, "urlArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str2 = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.doUpdateVisitedHistory", u().b()).d(L2.m.i(webViewClient, webView, str, Boolean.valueOf(z3)), new C1608a.e() { // from class: H2.s3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.t(lVar, str2, obj);
                }
            });
        }
    }

    public P u() {
        return this.f1787a;
    }

    public final void v(WebViewClient webViewClient, WebView webView, Message message, Message message2, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "viewArg");
        X2.l.e(message, "dontResendArg");
        X2.l.e(message2, "resendArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onFormResubmission", u().b()).d(L2.m.i(webViewClient, webView, message, message2), new C1608a.e() { // from class: H2.F3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.w(lVar, str, obj);
                }
            });
        }
    }

    public final void x(WebViewClient webViewClient, WebView webView, String str, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "viewArg");
        X2.l.e(str, "urlArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str2 = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onLoadResource", u().b()).d(L2.m.i(webViewClient, webView, str), new C1608a.e() { // from class: H2.u3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.y(lVar, str2, obj);
                }
            });
        }
    }

    public final void z(WebViewClient webViewClient, WebView webView, String str, final W2.l lVar) {
        X2.l.e(webViewClient, "pigeon_instanceArg");
        X2.l.e(webView, "viewArg");
        X2.l.e(str, "urlArg");
        X2.l.e(lVar, "callback");
        if (u().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str2 = "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible";
            new C1608a(u().a(), "dev.flutter.pigeon.webview_flutter_android.WebViewClient.onPageCommitVisible", u().b()).d(L2.m.i(webViewClient, webView, str), new C1608a.e() { // from class: H2.A3
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    J3.A(lVar, str2, obj);
                }
            });
        }
    }
}
