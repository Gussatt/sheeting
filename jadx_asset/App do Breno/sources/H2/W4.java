package H2;

import H2.W4;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.webkit.WebViewClientCompat;
import k0.AbstractC1138b;

/* JADX INFO: loaded from: classes.dex */
public class W4 extends J3 {
    public W4(O3 o32) {
        super(o32);
    }

    @Override // H2.J3
    public WebViewClient X() {
        return u().Q(24) ? new b(this) : new a(this);
    }

    @Override // H2.J3
    public void c0(WebViewClient webViewClient, boolean z3) {
        if (webViewClient instanceof a) {
            ((a) webViewClient).I(z3);
        } else {
            if (!u().Q(24) || !(webViewClient instanceof b)) {
                throw new IllegalStateException("This WebViewClient doesn't support setting the returnValueForShouldOverrideUrlLoading.");
            }
            ((b) webViewClient).G(z3);
        }
    }

    @Override // H2.J3
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public O3 u() {
        return (O3) super.u();
    }

    public static class b extends WebViewClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final W4 f1927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1928b = false;

        public b(W4 w4) {
            this.f1927a = w4;
        }

        public static /* synthetic */ K2.p A(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p B(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p C(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p E(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p F(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p b(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p e(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p f(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p h(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p i(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p k(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p t(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p u(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p v(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p y(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p z(K2.j jVar) {
            return null;
        }

        public void G(boolean z3) {
            this.f1928b = z3;
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(final WebView webView, final String str, final boolean z3) {
            this.f1927a.u().P(new Runnable() { // from class: H2.B5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f1725m;
                    bVar.f1927a.s(bVar, webView, str, z3, new W2.l() { // from class: H2.n5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.v((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
            this.f1927a.u().P(new Runnable() { // from class: H2.a5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f1982m;
                    bVar.f1927a.v(bVar, webView, message, message2, new W2.l() { // from class: H2.m5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.A((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(final WebView webView, final String str) {
            this.f1927a.u().P(new Runnable() { // from class: H2.c5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f2004m;
                    bVar.f1927a.x(bVar, webView, str, new W2.l() { // from class: H2.l5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.u((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageCommitVisible(final WebView webView, final String str) {
            this.f1927a.u().P(new Runnable() { // from class: H2.A5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f1712m;
                    bVar.f1927a.z(bVar, webView, str, new W2.l() { // from class: H2.e5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.i((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(final WebView webView, final String str) {
            this.f1927a.u().P(new Runnable() { // from class: H2.y5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f2210m;
                    bVar.f1927a.B(bVar, webView, str, new W2.l() { // from class: H2.j5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.B((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(final WebView webView, final String str, Bitmap bitmap) {
            this.f1927a.u().P(new Runnable() { // from class: H2.X4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f1935m;
                    bVar.f1927a.D(bVar, webView, str, new W2.l() { // from class: H2.o5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.y((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
            this.f1927a.u().P(new Runnable() { // from class: H2.Z4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f1965m;
                    bVar.f1927a.F(bVar, webView, clientCertRequest, new W2.l() { // from class: H2.v5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.f((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceError webResourceError) {
            this.f1927a.u().P(new Runnable() { // from class: H2.t5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f2157m;
                    bVar.f1927a.P(bVar, webView, webResourceRequest, webResourceError, new W2.l() { // from class: H2.p5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.z((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
            this.f1927a.u().P(new Runnable() { // from class: H2.w5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f2190m;
                    bVar.f1927a.J(bVar, webView, httpAuthHandler, str, str2, new W2.l() { // from class: H2.f5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.e((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceResponse webResourceResponse) {
            this.f1927a.u().P(new Runnable() { // from class: H2.x5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f2201m;
                    bVar.f1927a.L(bVar, webView, webResourceRequest, webResourceResponse, new W2.l() { // from class: H2.g5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.C((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(final WebView webView, final String str, final String str2, final String str3) {
            this.f1927a.u().P(new Runnable() { // from class: H2.i5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f2069m;
                    bVar.f1927a.N(bVar, webView, str, str2, str3, new W2.l() { // from class: H2.s5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.h((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
            this.f1927a.u().P(new Runnable() { // from class: H2.d5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f2030m;
                    bVar.f1927a.T(bVar, webView, sslErrorHandler, sslError, new W2.l() { // from class: H2.q5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.E((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(final WebView webView, final float f4, final float f5) {
            this.f1927a.u().P(new Runnable() { // from class: H2.C5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f1736m;
                    bVar.f1927a.V(bVar, webView, f4, f5, new W2.l() { // from class: H2.h5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.k((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
            this.f1927a.u().P(new Runnable() { // from class: H2.z5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f2218m;
                    bVar.f1927a.a0(bVar, webView, webResourceRequest, new W2.l() { // from class: H2.u5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.t((K2.j) obj);
                        }
                    });
                }
            });
            return webResourceRequest.isForMainFrame() && this.f1928b;
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(final WebView webView, final int i4, final String str, final String str2) {
            this.f1927a.u().P(new Runnable() { // from class: H2.b5
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f1993m;
                    bVar.f1927a.H(bVar, webView, i4, str, str2, new W2.l() { // from class: H2.k5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.F((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(final WebView webView, final String str) {
            this.f1927a.u().P(new Runnable() { // from class: H2.Y4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.b bVar = this.f1952m;
                    bVar.f1927a.d0(bVar, webView, str, new W2.l() { // from class: H2.r5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.b.b((K2.j) obj);
                        }
                    });
                }
            });
            return this.f1928b;
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }
    }

    public static class a extends WebViewClientCompat {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final W4 f1925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1926c = false;

        public a(W4 w4) {
            this.f1925b = w4;
        }

        public static /* synthetic */ K2.p D(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p E(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p F(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p G(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p H(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p c(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p h(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p i(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p k(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p p(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p q(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p s(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p u(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p x(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p y(K2.j jVar) {
            return null;
        }

        public static /* synthetic */ K2.p z(K2.j jVar) {
            return null;
        }

        public void I(boolean z3) {
            this.f1926c = z3;
        }

        @Override // androidx.webkit.WebViewClientCompat
        public void a(final WebView webView, final WebResourceRequest webResourceRequest, final AbstractC1138b abstractC1138b) {
            this.f1925b.u().P(new Runnable() { // from class: H2.s4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f2142m;
                    aVar.f1925b.R(aVar, webView, webResourceRequest, abstractC1138b, new W2.l() { // from class: H2.C4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.G((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(final WebView webView, final String str, final boolean z3) {
            this.f1925b.u().P(new Runnable() { // from class: H2.P4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f1837m;
                    aVar.f1925b.s(aVar, webView, str, z3, new W2.l() { // from class: H2.L4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.c((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onFormResubmission(final WebView webView, final Message message, final Message message2) {
            this.f1925b.u().P(new Runnable() { // from class: H2.R4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f1860m;
                    aVar.f1925b.v(aVar, webView, message, message2, new W2.l() { // from class: H2.z4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.E((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onLoadResource(final WebView webView, final String str) {
            this.f1925b.u().P(new Runnable() { // from class: H2.M4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f1809m;
                    aVar.f1925b.x(aVar, webView, str, new W2.l() { // from class: H2.N4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.q((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public void onPageCommitVisible(final WebView webView, final String str) {
            this.f1925b.u().P(new Runnable() { // from class: H2.w4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f2187m;
                    aVar.f1925b.z(aVar, webView, str, new W2.l() { // from class: H2.y4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.p((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(final WebView webView, final String str) {
            this.f1925b.u().P(new Runnable() { // from class: H2.Q4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f1852m;
                    aVar.f1925b.B(aVar, webView, str, new W2.l() { // from class: H2.x4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.H((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(final WebView webView, final String str, Bitmap bitmap) {
            this.f1925b.u().P(new Runnable() { // from class: H2.T4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f1877m;
                    aVar.f1925b.D(aVar, webView, str, new W2.l() { // from class: H2.J4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.k((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedClientCertRequest(final WebView webView, final ClientCertRequest clientCertRequest) {
            this.f1925b.u().P(new Runnable() { // from class: H2.r4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f2133m;
                    aVar.f1925b.F(aVar, webView, clientCertRequest, new W2.l() { // from class: H2.I4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.h((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(final WebView webView, final int i4, final String str, final String str2) {
            this.f1925b.u().P(new Runnable() { // from class: H2.q4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f2122m;
                    aVar.f1925b.H(aVar, webView, i4, str, str2, new W2.l() { // from class: H2.D4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.i((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedHttpAuthRequest(final WebView webView, final HttpAuthHandler httpAuthHandler, final String str, final String str2) {
            this.f1925b.u().P(new Runnable() { // from class: H2.V4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f1904m;
                    aVar.f1925b.J(aVar, webView, httpAuthHandler, str, str2, new W2.l() { // from class: H2.A4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.z((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public void onReceivedHttpError(final WebView webView, final WebResourceRequest webResourceRequest, final WebResourceResponse webResourceResponse) {
            this.f1925b.u().P(new Runnable() { // from class: H2.u4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f2167m;
                    aVar.f1925b.L(aVar, webView, webResourceRequest, webResourceResponse, new W2.l() { // from class: H2.H4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.D((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedLoginRequest(final WebView webView, final String str, final String str2, final String str3) {
            this.f1925b.u().P(new Runnable() { // from class: H2.t4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f2152m;
                    aVar.f1925b.N(aVar, webView, str, str2, str3, new W2.l() { // from class: H2.K4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.x((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(final WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
            this.f1925b.u().P(new Runnable() { // from class: H2.U4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f1894m;
                    aVar.f1925b.T(aVar, webView, sslErrorHandler, sslError, new W2.l() { // from class: H2.G4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.F((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public void onScaleChanged(final WebView webView, final float f4, final float f5) {
            this.f1925b.u().P(new Runnable() { // from class: H2.S4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f1868m;
                    aVar.f1925b.V(aVar, webView, f4, f5, new W2.l() { // from class: H2.E4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.u((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
        public boolean shouldOverrideUrlLoading(final WebView webView, final WebResourceRequest webResourceRequest) {
            this.f1925b.u().P(new Runnable() { // from class: H2.B4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f1722m;
                    aVar.f1925b.a0(aVar, webView, webResourceRequest, new W2.l() { // from class: H2.F4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.s((K2.j) obj);
                        }
                    });
                }
            });
            return webResourceRequest.isForMainFrame() && this.f1926c;
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(final WebView webView, final String str) {
            this.f1925b.u().P(new Runnable() { // from class: H2.v4
                @Override // java.lang.Runnable
                public final void run() {
                    W4.a aVar = this.f2177m;
                    aVar.f1925b.d0(aVar, webView, str, new W2.l() { // from class: H2.O4
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return W4.a.y((K2.j) obj);
                        }
                    });
                }
            });
            return this.f1926c;
        }

        @Override // android.webkit.WebViewClient
        public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        }
    }
}
