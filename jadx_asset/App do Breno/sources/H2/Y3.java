package H2;

import H2.Y3;
import android.net.Uri;
import android.os.Message;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class Y3 extends AbstractC0354j2 {

    public static class a extends WebChromeClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WebViewClient f1943a;

        public boolean a(WebView webView, Message message, WebView webView2) {
            if (this.f1943a == null) {
                return false;
            }
            C0049a c0049a = new C0049a(webView);
            if (webView2 == null) {
                webView2 = new WebView(webView.getContext());
            }
            webView2.setWebViewClient(c0049a);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }

        public void b(WebViewClient webViewClient) {
            this.f1943a = webViewClient;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z3, boolean z4, Message message) {
            return a(webView, message, new WebView(webView.getContext()));
        }

        /* JADX INFO: renamed from: H2.Y3$a$a, reason: collision with other inner class name */
        public class C0049a extends WebViewClient {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ WebView f1944a;

            public C0049a(WebView webView) {
                this.f1944a = webView;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                if (a.this.f1943a.shouldOverrideUrlLoading(this.f1944a, webResourceRequest)) {
                    return true;
                }
                this.f1944a.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (a.this.f1943a.shouldOverrideUrlLoading(this.f1944a, str)) {
                    return true;
                }
                this.f1944a.loadUrl(str);
                return true;
            }
        }
    }

    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Y3 f1946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1947c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1948d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f1949e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1950f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f1951g = false;

        public b(Y3 y3) {
            this.f1946b = y3;
        }

        public static /* synthetic */ K2.p c(b bVar, JsPromptResult jsPromptResult, Q3 q32) {
            bVar.getClass();
            if (q32.d()) {
                O3 o3L = bVar.f1946b.l();
                Throwable thB = q32.b();
                Objects.requireNonNull(thB);
                o3L.O("WebChromeClientImpl", thB);
                return null;
            }
            String str = (String) q32.c();
            if (str != null) {
                jsPromptResult.confirm(str);
                return null;
            }
            jsPromptResult.cancel();
            return null;
        }

        public static /* synthetic */ K2.p d(b bVar, JsResult jsResult, Q3 q32) {
            bVar.getClass();
            if (!q32.d()) {
                jsResult.confirm();
                return null;
            }
            O3 o3L = bVar.f1946b.l();
            Throwable thB = q32.b();
            Objects.requireNonNull(thB);
            o3L.O("WebChromeClientImpl", thB);
            return null;
        }

        public static /* synthetic */ K2.p e(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p f(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p g(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p h(b bVar, JsResult jsResult, Q3 q32) {
            bVar.getClass();
            if (q32.d()) {
                O3 o3L = bVar.f1946b.l();
                Throwable thB = q32.b();
                Objects.requireNonNull(thB);
                o3L.O("WebChromeClientImpl", thB);
                return null;
            }
            if (Boolean.TRUE.equals(q32.c())) {
                jsResult.confirm();
                return null;
            }
            jsResult.cancel();
            return null;
        }

        public static /* synthetic */ K2.p i(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p j(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p k(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p l(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p m(b bVar, boolean z3, ValueCallback valueCallback, Q3 q32) {
            bVar.getClass();
            if (q32.d()) {
                O3 o3L = bVar.f1946b.l();
                Throwable thB = q32.b();
                Objects.requireNonNull(thB);
                o3L.O("WebChromeClientImpl", thB);
                return null;
            }
            List list = (List) q32.c();
            Objects.requireNonNull(list);
            if (z3) {
                Uri[] uriArr = new Uri[list.size()];
                for (int i4 = 0; i4 < list.size(); i4++) {
                    uriArr[i4] = Uri.parse((String) list.get(i4));
                }
                valueCallback.onReceiveValue(uriArr);
            }
            return null;
        }

        public void n(boolean z3) {
            this.f1948d = z3;
        }

        public void o(boolean z3) {
            this.f1949e = z3;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            this.f1946b.m(this, consoleMessage, new W2.l() { // from class: H2.c4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.f((K2.j) obj);
                }
            });
            return this.f1948d;
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsHidePrompt() {
            this.f1946b.o(this, new W2.l() { // from class: H2.a4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.k((K2.j) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
            this.f1946b.q(this, str, callback, new W2.l() { // from class: H2.e4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.l((K2.j) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            this.f1946b.s(this, new W2.l() { // from class: H2.j4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.j((K2.j) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.f1949e) {
                return false;
            }
            this.f1946b.u(this, webView, str, str2, Q3.a(new W2.l() { // from class: H2.f4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.d(this.f2045m, jsResult, (Q3) obj);
                }
            }));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView webView, String str, String str2, final JsResult jsResult) {
            if (!this.f1950f) {
                return false;
            }
            this.f1946b.w(this, webView, str, str2, Q3.a(new W2.l() { // from class: H2.Z3
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.h(this.f1963m, jsResult, (Q3) obj);
                }
            }));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsPrompt(WebView webView, String str, String str2, String str3, final JsPromptResult jsPromptResult) {
            if (!this.f1951g) {
                return false;
            }
            this.f1946b.y(this, webView, str, str2, str3, Q3.a(new W2.l() { // from class: H2.b4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.c(this.f1991m, jsPromptResult, (Q3) obj);
                }
            }));
            return true;
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(PermissionRequest permissionRequest) {
            this.f1946b.A(this, permissionRequest, new W2.l() { // from class: H2.h4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.i((K2.j) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i4) {
            this.f1946b.C(this, webView, i4, new W2.l() { // from class: H2.g4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.e((K2.j) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
            this.f1946b.E(this, view, customViewCallback, new W2.l() { // from class: H2.d4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.g((K2.j) obj);
                }
            });
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, final ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            final boolean z3 = this.f1947c;
            this.f1946b.G(this, webView, fileChooserParams, Q3.a(new W2.l() { // from class: H2.i4
                @Override // W2.l
                public final Object k(Object obj) {
                    return Y3.b.m(this.f2066m, z3, valueCallback, (Q3) obj);
                }
            }));
            return z3;
        }

        public void p(boolean z3) {
            this.f1950f = z3;
        }

        public void q(boolean z3) {
            this.f1951g = z3;
        }

        public void r(boolean z3) {
            this.f1947c = z3;
        }
    }

    public Y3(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0354j2
    public b I() {
        return new b(this);
    }

    @Override // H2.AbstractC0354j2
    public void K(b bVar, boolean z3) {
        bVar.n(z3);
    }

    @Override // H2.AbstractC0354j2
    public void L(b bVar, boolean z3) {
        bVar.o(z3);
    }

    @Override // H2.AbstractC0354j2
    public void M(b bVar, boolean z3) {
        bVar.p(z3);
    }

    @Override // H2.AbstractC0354j2
    public void N(b bVar, boolean z3) {
        bVar.q(z3);
    }

    @Override // H2.AbstractC0354j2
    public void O(b bVar, boolean z3) {
        bVar.r(z3);
    }

    @Override // H2.AbstractC0354j2
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public O3 l() {
        return (O3) super.l();
    }
}
