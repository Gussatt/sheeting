package H2;

import android.webkit.WebResourceResponse;

/* JADX INFO: renamed from: H2.n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0381n4 extends AbstractC0402r2 {
    public C0381n4(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0402r2
    public long e(WebResourceResponse webResourceResponse) {
        return webResourceResponse.getStatusCode();
    }
}
