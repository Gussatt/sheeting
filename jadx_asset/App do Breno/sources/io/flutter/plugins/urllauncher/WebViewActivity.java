package io.flutter.plugins.urllauncher;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t.AbstractC1537a;

/* JADX INFO: loaded from: classes.dex */
public class WebViewActivity extends Activity {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WebView f8078d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f8076b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WebViewClient f8077c = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IntentFilter f8079e = new IntentFilter("close action");

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("close action".equals(intent.getAction())) {
                WebViewActivity.this.finish();
            }
        }
    }

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            webView.loadUrl(webResourceRequest.getUrl().toString());
            return false;
        }
    }

    public class c extends WebChromeClient {

        public class a extends WebViewClient {
            public a() {
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                WebViewActivity.this.f8078d.loadUrl(webResourceRequest.getUrl().toString());
                return true;
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(WebView webView, String str) {
                WebViewActivity.this.f8078d.loadUrl(str);
                return true;
            }
        }

        public c() {
        }

        @Override // android.webkit.WebChromeClient
        public boolean onCreateWindow(WebView webView, boolean z3, boolean z4, Message message) {
            a aVar = new a();
            WebView webView2 = new WebView(WebViewActivity.this.f8078d.getContext());
            webView2.setWebViewClient(aVar);
            ((WebView.WebViewTransport) message.obj).setWebView(webView2);
            message.sendToTarget();
            return true;
        }
    }

    public static Intent a(Context context, String str, boolean z3, boolean z4, Bundle bundle) {
        return new Intent(context, (Class<?>) WebViewActivity.class).putExtra("url", str).putExtra("enableJavaScript", z3).putExtra("enableDomStorage", z4).putExtra("com.android.browser.headers", bundle);
    }

    public static Map b(Bundle bundle) {
        if (bundle == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap();
        for (String str : bundle.keySet()) {
            map.put(str, bundle.getString(str));
        }
        return map;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WebView webView = new WebView(this);
        this.f8078d = webView;
        setContentView(webView);
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("url");
        boolean booleanExtra = intent.getBooleanExtra("enableJavaScript", false);
        boolean booleanExtra2 = intent.getBooleanExtra("enableDomStorage", false);
        this.f8078d.loadUrl(stringExtra, b(intent.getBundleExtra("com.android.browser.headers")));
        this.f8078d.getSettings().setJavaScriptEnabled(booleanExtra);
        this.f8078d.getSettings().setDomStorageEnabled(booleanExtra2);
        this.f8078d.setWebViewClient(this.f8077c);
        this.f8078d.getSettings().setSupportMultipleWindows(true);
        this.f8078d.setWebChromeClient(new c());
        AbstractC1537a.e(this, this.f8076b, this.f8079e, 2);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.f8076b);
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (i4 != 4 || !this.f8078d.canGoBack()) {
            return super.onKeyDown(i4, keyEvent);
        }
        this.f8078d.goBack();
        return true;
    }
}
