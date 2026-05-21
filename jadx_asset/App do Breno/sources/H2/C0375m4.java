package H2;

import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: H2.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0375m4 extends AbstractC0391p2 {
    public C0375m4(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0391p2
    public boolean c(WebResourceRequest webResourceRequest) {
        return webResourceRequest.hasGesture();
    }

    @Override // H2.AbstractC0391p2
    public boolean d(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }

    @Override // H2.AbstractC0391p2
    public Boolean e(WebResourceRequest webResourceRequest) {
        if (b().Q(24)) {
            return Boolean.valueOf(webResourceRequest.isRedirect());
        }
        return null;
    }

    @Override // H2.AbstractC0391p2
    public String f(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getMethod();
    }

    @Override // H2.AbstractC0391p2
    public Map i(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getRequestHeaders() == null ? Collections.EMPTY_MAP : webResourceRequest.getRequestHeaders();
    }

    @Override // H2.AbstractC0391p2
    public String j(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl().toString();
    }

    @Override // H2.AbstractC0391p2
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public O3 b() {
        return (O3) super.b();
    }
}
