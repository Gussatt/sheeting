package H2;

import android.webkit.WebResourceError;

/* JADX INFO: renamed from: H2.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0369l4 extends AbstractC0367l2 {
    public C0369l4(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0367l2
    public String b(WebResourceError webResourceError) {
        return webResourceError.getDescription().toString();
    }

    @Override // H2.AbstractC0367l2
    public long c(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }
}
