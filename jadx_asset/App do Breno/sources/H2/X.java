package H2;

import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes.dex */
public class X extends K0 {
    public X(O3 o32) {
        super(o32);
    }

    @Override // H2.K0
    public CookieManager c() {
        return CookieManager.getInstance();
    }

    @Override // H2.K0
    public void f(CookieManager cookieManager, final W2.l lVar) {
        cookieManager.removeAllCookies(new ValueCallback() { // from class: H2.W
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                Q3.e((Boolean) obj, lVar);
            }
        });
    }

    @Override // H2.K0
    public void g(CookieManager cookieManager, WebView webView, boolean z3) {
        cookieManager.setAcceptThirdPartyCookies(webView, z3);
    }

    @Override // H2.K0
    public void h(CookieManager cookieManager, String str, String str2) {
        cookieManager.setCookie(str, str2);
    }

    @Override // H2.K0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public O3 b() {
        return (O3) super.b();
    }
}
