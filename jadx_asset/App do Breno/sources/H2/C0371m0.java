package H2;

import android.webkit.JavascriptInterface;

/* JADX INFO: renamed from: H2.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0371m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0377n0 f2089b;

    public C0371m0(String str, C0377n0 c0377n0) {
        this.f2088a = str;
        this.f2089b = c0377n0;
    }

    public static /* synthetic */ K2.p b(K2.j jVar) {
        return null;
    }

    @JavascriptInterface
    public void postMessage(final String str) {
        this.f2089b.b().P(new Runnable() { // from class: H2.k0
            @Override // java.lang.Runnable
            public final void run() {
                C0371m0 c0371m0 = this.f2079m;
                c0371m0.f2089b.e(c0371m0, str, new W2.l() { // from class: H2.l0
                    @Override // W2.l
                    public final Object k(Object obj) {
                        return C0371m0.b((K2.j) obj);
                    }
                });
            }
        });
    }
}
