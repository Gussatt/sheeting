package H2;

import android.webkit.WebChromeClient;

/* JADX INFO: loaded from: classes.dex */
public class Y extends N0 {
    public Y(O3 o32) {
        super(o32);
    }

    @Override // H2.N0
    public void c(WebChromeClient.CustomViewCallback customViewCallback) {
        customViewCallback.onCustomViewHidden();
    }
}
