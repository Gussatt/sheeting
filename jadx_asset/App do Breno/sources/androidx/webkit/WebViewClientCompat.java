package androidx.webkit;

import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.lang.reflect.InvocationHandler;
import k0.AbstractC1137a;
import k0.AbstractC1138b;
import k0.AbstractC1140d;
import l0.k;
import l0.m;
import l0.n;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f5507a = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    public abstract void a(WebView webView, WebResourceRequest webResourceRequest, AbstractC1138b abstractC1138b);

    public void b(WebView webView, WebResourceRequest webResourceRequest, int i4, AbstractC1137a abstractC1137a) {
        if (!AbstractC1140d.a("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw n.a();
        }
        abstractC1137a.a(true);
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f5507a;
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        a(webView, webResourceRequest, new m(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i4, InvocationHandler invocationHandler) {
        b(webView, webResourceRequest, i4, new k(invocationHandler));
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        a(webView, webResourceRequest, new m(webResourceError));
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i4, SafeBrowsingResponse safeBrowsingResponse) {
        b(webView, webResourceRequest, i4, new k(safeBrowsingResponse));
    }
}
