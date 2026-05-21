package H2;

import H2.AbstractC0386o3;
import H2.Y3;
import K2.j;
import android.webkit.DownloadListener;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.Map;
import w2.C1608a;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: renamed from: H2.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0386o3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f2102b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f2103a;

    /* JADX INFO: renamed from: H2.o3$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static final void A(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.ByteArray");
            try {
                abstractC0386o3.v(webView, str, (byte[]) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void B(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                listB = L2.l.b(abstractC0386o3.k((WebView) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void C(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                listB = L2.l.b(Boolean.valueOf(abstractC0386o3.d((WebView) obj2)));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void D(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                listB = L2.l.b(Boolean.valueOf(abstractC0386o3.e((WebView) obj2)));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void E(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                abstractC0386o3.l((WebView) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void F(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                abstractC0386o3.m((WebView) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void G(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                abstractC0386o3.w((WebView) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void H(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                abstractC0386o3.f(webView, ((Boolean) obj3).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void I(AbstractC0386o3 abstractC0386o3, Object obj, final C1608a.e eVar) {
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            abstractC0386o3.h((WebView) obj2, (String) obj3, new W2.l() { // from class: H2.f3
                @Override // W2.l
                public final Object k(Object obj4) {
                    return AbstractC0386o3.a.J(eVar, (K2.j) obj4);
                }
            });
        }

        public static final K2.p J(C1608a.e eVar, K2.j jVar) {
            Throwable thD = K2.j.d(jVar.i());
            if (thD != null) {
                eVar.a(Q.f1841a.b(thD));
            } else {
                Object objI = jVar.i();
                if (K2.j.f(objI)) {
                    objI = null;
                }
                eVar.a(Q.f1841a.c((String) objI));
            }
            return K2.p.f2516a;
        }

        public static final void K(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                abstractC0386o3.i().d().b(abstractC0386o3.D(webView), ((Long) obj3).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void L(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                listB = L2.l.b(abstractC0386o3.j((WebView) obj2));
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void M(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Boolean");
            try {
                abstractC0386o3.B(((Boolean) obj2).booleanValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void N(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                abstractC0386o3.C((WebView) obj2, (WebViewClient) list.get(1));
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void O(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type io.flutter.plugins.webviewflutter.JavaScriptChannel");
            try {
                abstractC0386o3.c(webView, (C0371m0) obj3);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void P(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                abstractC0386o3.x(webView, (String) obj3);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void Q(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                abstractC0386o3.z((WebView) obj2, (DownloadListener) list.get(1));
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void R(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                abstractC0386o3.A((WebView) obj2, (Y3.b) list.get(1));
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void S(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.Long");
            try {
                abstractC0386o3.y(webView, ((Long) obj3).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void T(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            try {
                abstractC0386o3.g((WebView) obj2);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void U(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                abstractC0386o3.n(webView, (String) obj3, (String) list.get(2), (String) list.get(3));
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void V(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            String str = (String) list.get(1);
            Object obj3 = list.get(2);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            try {
                abstractC0386o3.o(webView, str, (String) obj3, (String) list.get(3), (String) list.get(4), (String) list.get(5));
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void W(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            List list = (List) obj;
            Object obj2 = list.get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type android.webkit.WebView");
            WebView webView = (WebView) obj2;
            Object obj3 = list.get(1);
            X2.l.c(obj3, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj3;
            Object obj4 = list.get(2);
            X2.l.c(obj4, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.String>");
            try {
                abstractC0386o3.p(webView, str, (Map) obj4);
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public static final void z(AbstractC0386o3 abstractC0386o3, Object obj, C1608a.e eVar) {
            List listB;
            X2.l.e(eVar, "reply");
            X2.l.c(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
            Object obj2 = ((List) obj).get(0);
            X2.l.c(obj2, "null cannot be cast to non-null type kotlin.Long");
            try {
                abstractC0386o3.i().d().b(abstractC0386o3.s(), ((Long) obj2).longValue());
                listB = L2.l.b(null);
            } catch (Throwable th) {
                listB = Q.f1841a.b(th);
            }
            eVar.a(listB);
        }

        public final void y(InterfaceC1609b interfaceC1609b, final AbstractC0386o3 abstractC0386o3) {
            InterfaceC1615h c0295b;
            P pI;
            X2.l.e(interfaceC1609b, "binaryMessenger");
            if (abstractC0386o3 == null || (pI = abstractC0386o3.i()) == null || (c0295b = pI.b()) == null) {
                c0295b = new C0295b();
            }
            C1608a c1608a = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_defaultConstructor", c0295b);
            if (abstractC0386o3 != null) {
                c1608a.e(new C1608a.d() { // from class: H2.Q2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.z(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a.e(null);
            }
            C1608a c1608a2 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.settings", c0295b);
            if (abstractC0386o3 != null) {
                c1608a2.e(new C1608a.d() { // from class: H2.S2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.K(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a2.e(null);
            }
            C1608a c1608a3 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.loadData", c0295b);
            if (abstractC0386o3 != null) {
                c1608a3.e(new C1608a.d() { // from class: H2.W2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.U(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a3.e(null);
            }
            C1608a c1608a4 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.loadDataWithBaseUrl", c0295b);
            if (abstractC0386o3 != null) {
                c1608a4.e(new C1608a.d() { // from class: H2.X2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.V(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a4.e(null);
            }
            C1608a c1608a5 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.loadUrl", c0295b);
            if (abstractC0386o3 != null) {
                c1608a5.e(new C1608a.d() { // from class: H2.Y2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.W(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a5.e(null);
            }
            C1608a c1608a6 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.postUrl", c0295b);
            if (abstractC0386o3 != null) {
                c1608a6.e(new C1608a.d() { // from class: H2.Z2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.A(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a6.e(null);
            }
            C1608a c1608a7 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.getUrl", c0295b);
            if (abstractC0386o3 != null) {
                c1608a7.e(new C1608a.d() { // from class: H2.a3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.B(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a7.e(null);
            }
            C1608a c1608a8 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoBack", c0295b);
            if (abstractC0386o3 != null) {
                c1608a8.e(new C1608a.d() { // from class: H2.c3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.C(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a8.e(null);
            }
            C1608a c1608a9 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.canGoForward", c0295b);
            if (abstractC0386o3 != null) {
                c1608a9.e(new C1608a.d() { // from class: H2.d3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.D(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a9.e(null);
            }
            C1608a c1608a10 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.goBack", c0295b);
            if (abstractC0386o3 != null) {
                c1608a10.e(new C1608a.d() { // from class: H2.e3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.E(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a10.e(null);
            }
            C1608a c1608a11 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.goForward", c0295b);
            if (abstractC0386o3 != null) {
                c1608a11.e(new C1608a.d() { // from class: H2.b3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.F(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a11.e(null);
            }
            C1608a c1608a12 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.reload", c0295b);
            if (abstractC0386o3 != null) {
                c1608a12.e(new C1608a.d() { // from class: H2.g3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.G(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a12.e(null);
            }
            C1608a c1608a13 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.clearCache", c0295b);
            if (abstractC0386o3 != null) {
                c1608a13.e(new C1608a.d() { // from class: H2.h3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.H(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a13.e(null);
            }
            C1608a c1608a14 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.evaluateJavascript", c0295b);
            if (abstractC0386o3 != null) {
                c1608a14.e(new C1608a.d() { // from class: H2.i3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.I(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a14.e(null);
            }
            C1608a c1608a15 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.getTitle", c0295b);
            if (abstractC0386o3 != null) {
                c1608a15.e(new C1608a.d() { // from class: H2.j3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.L(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a15.e(null);
            }
            C1608a c1608a16 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebContentsDebuggingEnabled", c0295b);
            if (abstractC0386o3 != null) {
                c1608a16.e(new C1608a.d() { // from class: H2.k3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.M(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a16.e(null);
            }
            C1608a c1608a17 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebViewClient", c0295b);
            if (abstractC0386o3 != null) {
                c1608a17.e(new C1608a.d() { // from class: H2.l3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.N(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a17.e(null);
            }
            C1608a c1608a18 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.addJavaScriptChannel", c0295b);
            if (abstractC0386o3 != null) {
                c1608a18.e(new C1608a.d() { // from class: H2.m3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.O(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a18.e(null);
            }
            C1608a c1608a19 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.removeJavaScriptChannel", c0295b);
            if (abstractC0386o3 != null) {
                c1608a19.e(new C1608a.d() { // from class: H2.n3
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.P(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a19.e(null);
            }
            C1608a c1608a20 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.setDownloadListener", c0295b);
            if (abstractC0386o3 != null) {
                c1608a20.e(new C1608a.d() { // from class: H2.R2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.Q(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a20.e(null);
            }
            C1608a c1608a21 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.setWebChromeClient", c0295b);
            if (abstractC0386o3 != null) {
                c1608a21.e(new C1608a.d() { // from class: H2.T2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.R(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a21.e(null);
            }
            C1608a c1608a22 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.setBackgroundColor", c0295b);
            if (abstractC0386o3 != null) {
                c1608a22.e(new C1608a.d() { // from class: H2.U2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.S(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a22.e(null);
            }
            C1608a c1608a23 = new C1608a(interfaceC1609b, "dev.flutter.pigeon.webview_flutter_android.WebView.destroy", c0295b);
            if (abstractC0386o3 != null) {
                c1608a23.e(new C1608a.d() { // from class: H2.V2
                    @Override // w2.C1608a.d
                    public final void a(Object obj, C1608a.e eVar) {
                        AbstractC0386o3.a.T(abstractC0386o3, obj, eVar);
                    }
                });
            } else {
                c1608a23.e(null);
            }
        }

        public a() {
        }
    }

    public AbstractC0386o3(P p4) {
        X2.l.e(p4, "pigeonRegistrar");
        this.f2103a = p4;
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

    public static final void u(W2.l lVar, String str, Object obj) {
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

    public abstract void A(WebView webView, Y3.b bVar);

    public abstract void B(boolean z3);

    public abstract void C(WebView webView, WebViewClient webViewClient);

    public abstract WebSettings D(WebView webView);

    public abstract void c(WebView webView, C0371m0 c0371m0);

    public abstract boolean d(WebView webView);

    public abstract boolean e(WebView webView);

    public abstract void f(WebView webView, boolean z3);

    public abstract void g(WebView webView);

    public abstract void h(WebView webView, String str, W2.l lVar);

    public P i() {
        return this.f2103a;
    }

    public abstract String j(WebView webView);

    public abstract String k(WebView webView);

    public abstract void l(WebView webView);

    public abstract void m(WebView webView);

    public abstract void n(WebView webView, String str, String str2, String str3);

    public abstract void o(WebView webView, String str, String str2, String str3, String str4, String str5);

    public abstract void p(WebView webView, String str, Map map);

    public final void q(WebView webView, long j4, long j5, long j6, long j7, final W2.l lVar) {
        X2.l.e(webView, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (i().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged";
            new C1608a(i().a(), "dev.flutter.pigeon.webview_flutter_android.WebView.onScrollChanged", i().b()).d(L2.m.i(webView, Long.valueOf(j4), Long.valueOf(j5), Long.valueOf(j6), Long.valueOf(j7)), new C1608a.e() { // from class: H2.P2
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0386o3.r(lVar, str, obj);
                }
            });
        }
    }

    public abstract WebView s();

    public final void t(WebView webView, final W2.l lVar) {
        X2.l.e(webView, "pigeon_instanceArg");
        X2.l.e(lVar, "callback");
        if (i().c()) {
            j.a aVar = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.k.a(new C0288a("ignore-calls-error", "Calls to Dart are being ignored.", "")))));
        } else if (i().d().f(webView)) {
            j.a aVar2 = K2.j.f2509n;
            lVar.k(K2.j.a(K2.j.b(K2.p.f2516a)));
        } else {
            final String str = "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance";
            new C1608a(i().a(), "dev.flutter.pigeon.webview_flutter_android.WebView.pigeon_newInstance", i().b()).d(L2.l.b(Long.valueOf(i().d().c(webView))), new C1608a.e() { // from class: H2.O2
                @Override // w2.C1608a.e
                public final void a(Object obj) {
                    AbstractC0386o3.u(lVar, str, obj);
                }
            });
        }
    }

    public abstract void v(WebView webView, String str, byte[] bArr);

    public abstract void w(WebView webView);

    public abstract void x(WebView webView, String str);

    public abstract void y(WebView webView, long j4);

    public abstract void z(WebView webView, DownloadListener downloadListener);
}
