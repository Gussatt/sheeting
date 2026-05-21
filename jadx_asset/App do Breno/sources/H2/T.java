package H2;

import android.webkit.ClientCertRequest;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class T extends B0 {
    public T(O3 o32) {
        super(o32);
    }

    @Override // H2.B0
    public void b(ClientCertRequest clientCertRequest) {
        clientCertRequest.cancel();
    }

    @Override // H2.B0
    public void d(ClientCertRequest clientCertRequest) {
        clientCertRequest.ignore();
    }

    @Override // H2.B0
    public void g(ClientCertRequest clientCertRequest, PrivateKey privateKey, List list) {
        clientCertRequest.proceed(privateKey, (X509Certificate[]) list.toArray(new X509Certificate[0]));
    }
}
