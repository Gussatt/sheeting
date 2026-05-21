package k1;

import c1.C0662d;
import c1.C0663e;

/* JADX INFO: renamed from: k1.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1176c3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1363z3 f9383a;

    public C1176c3(l7 l7Var) {
        this.f9383a = l7Var.M0();
    }

    public final boolean a() {
        try {
            C1363z3 c1363z3 = this.f9383a;
            C0662d c0662dA = C0663e.a(c1363z3.d());
            if (c0662dA != null) {
                return c0662dA.d("com.android.vending", 128).versionCode >= 80837300;
            }
            c1363z3.c().v().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
            return false;
        } catch (Exception e4) {
            this.f9383a.c().v().b("Failed to retrieve Play Store version for Install Referrer", e4);
            return false;
        }
    }
}
