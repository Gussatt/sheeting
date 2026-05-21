package H2;

import H2.J5;
import H2.Y3;
import android.hardware.display.DisplayManager;
import android.view.View;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import io.flutter.plugin.platform.InterfaceC1079k;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class J5 extends AbstractC0386o3 {
    public J5(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0386o3
    public void A(WebView webView, Y3.b bVar) {
        webView.setWebChromeClient(bVar);
    }

    @Override // H2.AbstractC0386o3
    public void B(boolean z3) {
        WebView.setWebContentsDebuggingEnabled(z3);
    }

    @Override // H2.AbstractC0386o3
    public void C(WebView webView, WebViewClient webViewClient) {
        webView.setWebViewClient(webViewClient);
    }

    @Override // H2.AbstractC0386o3
    public WebSettings D(WebView webView) {
        return webView.getSettings();
    }

    @Override // H2.AbstractC0386o3
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public O3 i() {
        return (O3) super.i();
    }

    @Override // H2.AbstractC0386o3
    public void c(WebView webView, C0371m0 c0371m0) {
        webView.addJavascriptInterface(c0371m0, c0371m0.f2088a);
    }

    @Override // H2.AbstractC0386o3
    public boolean d(WebView webView) {
        return webView.canGoBack();
    }

    @Override // H2.AbstractC0386o3
    public boolean e(WebView webView) {
        return webView.canGoForward();
    }

    @Override // H2.AbstractC0386o3
    public void f(WebView webView, boolean z3) {
        webView.clearCache(z3);
    }

    @Override // H2.AbstractC0386o3
    public void g(WebView webView) {
        webView.destroy();
    }

    @Override // H2.AbstractC0386o3
    public void h(WebView webView, String str, final W2.l lVar) {
        webView.evaluateJavascript(str, new ValueCallback() { // from class: H2.G5
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                Q3.e((String) obj, lVar);
            }
        });
    }

    @Override // H2.AbstractC0386o3
    public String j(WebView webView) {
        return webView.getTitle();
    }

    @Override // H2.AbstractC0386o3
    public String k(WebView webView) {
        return webView.getUrl();
    }

    @Override // H2.AbstractC0386o3
    public void l(WebView webView) {
        webView.goBack();
    }

    @Override // H2.AbstractC0386o3
    public void m(WebView webView) {
        webView.goForward();
    }

    @Override // H2.AbstractC0386o3
    public void n(WebView webView, String str, String str2, String str3) {
        webView.loadData(str, str2, str3);
    }

    @Override // H2.AbstractC0386o3
    public void o(WebView webView, String str, String str2, String str3, String str4, String str5) {
        webView.loadDataWithBaseURL(str, str2, str3, str4, str5);
    }

    @Override // H2.AbstractC0386o3
    public void p(WebView webView, String str, Map map) {
        webView.loadUrl(str, map);
    }

    @Override // H2.AbstractC0386o3
    public WebView s() {
        Z z3 = new Z();
        DisplayManager displayManager = (DisplayManager) i().M().getSystemService("display");
        z3.b(displayManager);
        a aVar = new a(this);
        z3.a(displayManager);
        return aVar;
    }

    @Override // H2.AbstractC0386o3
    public void v(WebView webView, String str, byte[] bArr) {
        webView.postUrl(str, bArr);
    }

    @Override // H2.AbstractC0386o3
    public void w(WebView webView) {
        webView.reload();
    }

    @Override // H2.AbstractC0386o3
    public void x(WebView webView, String str) {
        webView.removeJavascriptInterface(str);
    }

    @Override // H2.AbstractC0386o3
    public void y(WebView webView, long j4) {
        webView.setBackgroundColor((int) j4);
    }

    @Override // H2.AbstractC0386o3
    public void z(WebView webView, DownloadListener downloadListener) {
        webView.setDownloadListener(downloadListener);
    }

    public static class a extends WebView implements InterfaceC1079k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J5 f1788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WebViewClient f1789c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Y3.a f1790d;

        public a(J5 j5) {
            super(j5.i().M());
            this.f1788b = j5;
            this.f1789c = new WebViewClient();
            this.f1790d = new Y3.a();
            setWebViewClient(this.f1789c);
            setWebChromeClient(this.f1790d);
        }

        public static /* synthetic */ K2.p g(K2.j jVar) {
            return null;
        }

        @Override // android.webkit.WebView
        public WebChromeClient getWebChromeClient() {
            return this.f1790d;
        }

        public final m2.B h() {
            ViewParent parent = this;
            while (parent.getParent() != null) {
                parent = parent.getParent();
                if (parent instanceof m2.B) {
                    return (m2.B) parent;
                }
            }
            return null;
        }

        @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
        public void onAttachedToWindow() {
            m2.B bH;
            super.onAttachedToWindow();
            if (!this.f1788b.i().Q(26) || (bH = h()) == null) {
                return;
            }
            bH.setImportantForAutofill(1);
        }

        @Override // android.webkit.WebView, android.view.View
        public void onScrollChanged(final int i4, final int i5, final int i6, final int i7) {
            super.onScrollChanged(i4, i5, i6, i7);
            this.f1788b.i().P(new Runnable() { // from class: H2.H5
                @Override // java.lang.Runnable
                public final void run() {
                    J5.a aVar = this.f1772m;
                    aVar.f1788b.q(aVar, i4, i5, i6, i7, new W2.l() { // from class: H2.I5
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return J5.a.g((K2.j) obj);
                        }
                    });
                }
            });
        }

        @Override // android.webkit.WebView
        public void setWebChromeClient(WebChromeClient webChromeClient) {
            super.setWebChromeClient(webChromeClient);
            if (!(webChromeClient instanceof Y3.a)) {
                throw new AssertionError("Client must be a SecureWebChromeClient.");
            }
            Y3.a aVar = (Y3.a) webChromeClient;
            this.f1790d = aVar;
            aVar.b(this.f1789c);
        }

        @Override // android.webkit.WebView
        public void setWebViewClient(WebViewClient webViewClient) {
            super.setWebViewClient(webViewClient);
            this.f1789c = webViewClient;
            this.f1790d.b(webViewClient);
        }

        @Override // io.flutter.plugin.platform.InterfaceC1079k
        public void a() {
        }

        @Override // io.flutter.plugin.platform.InterfaceC1079k
        public View getView() {
            return this;
        }
    }
}
