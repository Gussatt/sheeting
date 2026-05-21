package H2;

import android.webkit.WebStorage;

/* JADX INFO: renamed from: H2.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0393p4 extends N2 {
    public C0393p4(O3 o32) {
        super(o32);
    }

    @Override // H2.N2
    public void b(WebStorage webStorage) {
        webStorage.deleteAllData();
    }

    @Override // H2.N2
    public WebStorage d() {
        return WebStorage.getInstance();
    }
}
