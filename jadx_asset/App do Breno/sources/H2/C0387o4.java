package H2;

import android.webkit.WebSettings;

/* JADX INFO: renamed from: H2.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0387o4 extends J2 {
    public C0387o4(O3 o32) {
        super(o32);
    }

    @Override // H2.J2
    public String c(WebSettings webSettings) {
        return webSettings.getUserAgentString();
    }

    @Override // H2.J2
    public void f(WebSettings webSettings, boolean z3) {
        webSettings.setAllowContentAccess(z3);
    }

    @Override // H2.J2
    public void g(WebSettings webSettings, boolean z3) {
        webSettings.setAllowFileAccess(z3);
    }

    @Override // H2.J2
    public void h(WebSettings webSettings, boolean z3) {
        webSettings.setBuiltInZoomControls(z3);
    }

    @Override // H2.J2
    public void i(WebSettings webSettings, boolean z3) {
        webSettings.setDisplayZoomControls(z3);
    }

    @Override // H2.J2
    public void j(WebSettings webSettings, boolean z3) {
        webSettings.setDomStorageEnabled(z3);
    }

    @Override // H2.J2
    public void k(WebSettings webSettings, boolean z3) {
        webSettings.setGeolocationEnabled(z3);
    }

    @Override // H2.J2
    public void l(WebSettings webSettings, boolean z3) {
        webSettings.setJavaScriptCanOpenWindowsAutomatically(z3);
    }

    @Override // H2.J2
    public void m(WebSettings webSettings, boolean z3) {
        webSettings.setJavaScriptEnabled(z3);
    }

    @Override // H2.J2
    public void n(WebSettings webSettings, boolean z3) {
        webSettings.setLoadWithOverviewMode(z3);
    }

    @Override // H2.J2
    public void o(WebSettings webSettings, boolean z3) {
        webSettings.setMediaPlaybackRequiresUserGesture(z3);
    }

    @Override // H2.J2
    public void p(WebSettings webSettings, boolean z3) {
        webSettings.setSupportMultipleWindows(z3);
    }

    @Override // H2.J2
    public void q(WebSettings webSettings, boolean z3) {
        webSettings.setSupportZoom(z3);
    }

    @Override // H2.J2
    public void r(WebSettings webSettings, long j4) {
        webSettings.setTextZoom((int) j4);
    }

    @Override // H2.J2
    public void s(WebSettings webSettings, boolean z3) {
        webSettings.setUseWideViewPort(z3);
    }

    @Override // H2.J2
    public void t(WebSettings webSettings, String str) {
        webSettings.setUserAgentString(str);
    }
}
