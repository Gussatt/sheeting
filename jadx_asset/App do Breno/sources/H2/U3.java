package H2;

import android.webkit.SslErrorHandler;

/* JADX INFO: loaded from: classes.dex */
public class U3 extends J1 {
    public U3(O3 o32) {
        super(o32);
    }

    @Override // H2.J1
    public void b(SslErrorHandler sslErrorHandler) {
        sslErrorHandler.cancel();
    }

    @Override // H2.J1
    public void f(SslErrorHandler sslErrorHandler) {
        sslErrorHandler.proceed();
    }
}
