package H2;

import android.net.http.SslCertificate;

/* JADX INFO: loaded from: classes.dex */
public class R3 extends B1 {
    public R3(O3 o32) {
        super(o32);
    }

    @Override // H2.B1
    public String b(SslCertificate.DName dName) {
        return dName.getCName();
    }

    @Override // H2.B1
    public String c(SslCertificate.DName dName) {
        return dName.getDName();
    }

    @Override // H2.B1
    public String d(SslCertificate.DName dName) {
        return dName.getOName();
    }

    @Override // H2.B1
    public String f(SslCertificate.DName dName) {
        return dName.getUName();
    }
}
