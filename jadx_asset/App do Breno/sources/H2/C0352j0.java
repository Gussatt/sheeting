package H2;

import android.webkit.HttpAuthHandler;

/* JADX INFO: renamed from: H2.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0352j0 extends AbstractC0325f1 {
    public C0352j0(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0325f1
    public void b(HttpAuthHandler httpAuthHandler) {
        httpAuthHandler.cancel();
    }

    @Override // H2.AbstractC0325f1
    public void f(HttpAuthHandler httpAuthHandler, String str, String str2) {
        httpAuthHandler.proceed(str, str2);
    }

    @Override // H2.AbstractC0325f1
    public boolean g(HttpAuthHandler httpAuthHandler) {
        return httpAuthHandler.useHttpAuthUsernamePassword();
    }
}
