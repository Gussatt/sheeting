package H2;

import android.net.http.SslCertificate;
import android.util.Log;
import java.security.cert.X509Certificate;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public class T3 extends AbstractC0425v1 {
    public T3(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0425v1
    public SslCertificate.DName b(SslCertificate sslCertificate) {
        return sslCertificate.getIssuedBy();
    }

    @Override // H2.AbstractC0425v1
    public SslCertificate.DName c(SslCertificate sslCertificate) {
        return sslCertificate.getIssuedTo();
    }

    @Override // H2.AbstractC0425v1
    public Long e(SslCertificate sslCertificate) {
        Date validNotAfterDate = sslCertificate.getValidNotAfterDate();
        if (validNotAfterDate != null) {
            return Long.valueOf(validNotAfterDate.getTime());
        }
        return null;
    }

    @Override // H2.AbstractC0425v1
    public Long f(SslCertificate sslCertificate) {
        Date validNotBeforeDate = sslCertificate.getValidNotBeforeDate();
        if (validNotBeforeDate != null) {
            return Long.valueOf(validNotBeforeDate.getTime());
        }
        return null;
    }

    @Override // H2.AbstractC0425v1
    public X509Certificate g(SslCertificate sslCertificate) {
        if (d().Q(29)) {
            return sslCertificate.getX509Certificate();
        }
        Log.d("SslCertificateProxyApi", d().L("SslCertificate.getX509Certificate", "Build.VERSION_CODES.Q"));
        return null;
    }

    @Override // H2.AbstractC0425v1
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public O3 d() {
        return (O3) super.d();
    }
}
