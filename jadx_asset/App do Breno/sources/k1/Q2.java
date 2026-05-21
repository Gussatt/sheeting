package k1;

import V0.AbstractC0549h;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Q2 extends W6 {
    public Q2(l7 l7Var) {
        super(l7Var);
    }

    @Override // k1.W6
    public final boolean l() {
        return false;
    }

    public final void m(F2 f22, Map map, M2 m22) {
        Q2 q22;
        URL url;
        h();
        i();
        AbstractC0549h.j(f22);
        AbstractC0549h.j(m22);
        Y6 y6R0 = this.f9189b.R0();
        Uri.Builder builder = new Uri.Builder();
        String strH = f22.h();
        if (TextUtils.isEmpty(strH)) {
            strH = f22.a();
        }
        Uri.Builder builderAppendQueryParameter = builder.scheme((String) AbstractC1291q2.f9737f.a(null)).encodedAuthority((String) AbstractC1291q2.f9740g.a(null)).path("config/app/".concat(String.valueOf(strH))).appendQueryParameter("platform", "android");
        y6R0.f9366a.B().B();
        builderAppendQueryParameter.appendQueryParameter("gmp_version", String.valueOf(119002L)).appendQueryParameter("runtime_version", "0");
        String string = builder.build().toString();
        try {
            url = new URI(string).toURL();
            q22 = this;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            q22 = this;
        }
        try {
            this.f9366a.e().z(new O2(q22, f22.c(), url, null, map, m22));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            q22.f9366a.c().r().c("Failed to parse config URL. Not fetching. appId", K2.z(f22.c()), string);
        }
    }

    public final void n(String str, X6 x6, com.google.android.gms.internal.measurement.R2 r22, M2 m22) {
        Q2 q22;
        String str2;
        URL url;
        byte[] bArrI;
        h();
        i();
        try {
            url = new URI(x6.c()).toURL();
            this.f9189b.a();
            bArrI = r22.i();
            q22 = this;
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            q22 = this;
            str2 = str;
        }
        try {
            this.f9366a.e().z(new O2(q22, str2, url, bArrI, x6.d(), m22));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            q22.f9366a.c().r().c("Failed to parse URL. Not uploading MeasurementBatch. appId", K2.z(str2), x6.c());
        }
    }

    public final boolean o() {
        i();
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f9366a.d().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
