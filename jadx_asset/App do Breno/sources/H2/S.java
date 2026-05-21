package H2;

import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;

/* JADX INFO: loaded from: classes.dex */
public class S extends AbstractC0430w0 {
    public S(O3 o32) {
        super(o32);
    }

    @Override // H2.AbstractC0430w0
    public byte[] b(Certificate certificate) {
        try {
            return certificate.getEncoded();
        } catch (CertificateEncodingException e4) {
            throw new RuntimeException(e4);
        }
    }
}
