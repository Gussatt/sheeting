package k1;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.C0777j2;
import com.google.android.gms.internal.measurement.EnumC0733e3;

/* JADX INFO: loaded from: classes.dex */
public final class Y6 extends O6 {
    public Y6(l7 l7Var) {
        super(l7Var);
    }

    public static final boolean m(String str) {
        String str2 = (String) AbstractC1291q2.f9779t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final k1.X6 i(java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.Y6.i(java.lang.String):k1.X6");
    }

    public final boolean j(String str, EnumC0733e3 enumC0733e3) {
        C0777j2 c0777j2E;
        h();
        return this.f9366a.B().P(null, AbstractC1291q2.f9703Q0) && enumC0733e3 == EnumC0733e3.CLIENT_UPLOAD_ELIGIBLE && !m(str) && (c0777j2E = this.f9189b.K0().E(str)) != null && c0777j2E.Z() && !c0777j2E.N().J().isEmpty();
    }

    public final String k(String str) {
        String strH = this.f9189b.K0().H(str);
        if (TextUtils.isEmpty(strH)) {
            return (String) AbstractC1291q2.f9773r.a(null);
        }
        Uri uri = Uri.parse((String) AbstractC1291q2.f9773r.a(null));
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.authority(strH + "." + uri.getAuthority());
        return builderBuildUpon.build().toString();
    }

    public final boolean l(String str, String str2) {
        F2 f2A0;
        l7 l7Var = this.f9189b;
        C0777j2 c0777j2E = l7Var.K0().E(str);
        if (c0777j2E == null || (f2A0 = l7Var.E0().A0(str)) == null) {
            return false;
        }
        if ((c0777j2E.Z() && c0777j2E.N().F() == 100) || this.f9366a.Q().c0(str, f2A0.m())) {
            return true;
        }
        return !TextUtils.isEmpty(str2) && Math.abs(str2.hashCode() % 100) < c0777j2E.N().F();
    }
}
