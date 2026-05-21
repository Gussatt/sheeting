package k1;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1363z3 f8941a;

    public D7(C1363z3 c1363z3) {
        this.f8941a = c1363z3;
    }

    public final void a(String str, Bundle bundle) {
        String string;
        C1363z3 c1363z3 = this.f8941a;
        c1363z3.e().h();
        if (c1363z3.o()) {
            return;
        }
        if (bundle.isEmpty()) {
            string = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            string = builder.build().toString();
        }
        if (TextUtils.isEmpty(string)) {
            return;
        }
        c1363z3.H().f9333y.b(string);
        c1363z3.H().f9334z.b(c1363z3.f().a());
    }

    public final void b() {
        C1363z3 c1363z3 = this.f8941a;
        c1363z3.e().h();
        if (d()) {
            if (e()) {
                c1363z3.H().f9333y.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                c1363z3.K().F("auto", "_cmpx", bundle);
            } else {
                String strA = c1363z3.H().f9333y.a();
                if (TextUtils.isEmpty(strA)) {
                    c1363z3.c().t().a("Cache still valid but referrer not found");
                } else {
                    long jA = c1363z3.H().f9334z.a() / 3600000;
                    Uri uri = Uri.parse(strA);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(uri.getPath(), bundle2);
                    for (String str : uri.getQueryParameterNames()) {
                        bundle2.putString(str, uri.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (jA - 1) * 3600000);
                    Object obj = pair.first;
                    c1363z3.K().F(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                c1363z3.H().f9333y.b(null);
            }
            c1363z3.H().f9334z.b(0L);
        }
    }

    public final void c() {
        if (d() && e()) {
            this.f8941a.H().f9333y.b(null);
        }
    }

    public final boolean d() {
        return this.f8941a.H().f9334z.a() > 0;
    }

    public final boolean e() {
        if (!d()) {
            return false;
        }
        C1363z3 c1363z3 = this.f8941a;
        return c1363z3.f().a() - c1363z3.H().f9334z.a() > c1363z3.B().C(null, AbstractC1291q2.f9750j0);
    }
}
