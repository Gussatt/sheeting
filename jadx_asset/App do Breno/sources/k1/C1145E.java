package k1;

import V0.AbstractC0549h;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: renamed from: k1.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1145E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f8946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1148H f8947f;

    public C1145E(C1363z3 c1363z3, String str, String str2, String str3, long j4, long j5, Bundle bundle) {
        C1148H c1148h;
        AbstractC0549h.d(str2);
        AbstractC0549h.d(str3);
        this.f8942a = str2;
        this.f8943b = str3;
        this.f8944c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8945d = j4;
        this.f8946e = j5;
        if (j5 != 0 && j5 > j4) {
            c1363z3.c().w().b("Event created with reverse previous/current timestamps. appId", K2.z(str2));
        }
        if (bundle == null || bundle.isEmpty()) {
            c1148h = new C1148H(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    c1363z3.c().r().a("Param name can't be null");
                    it.remove();
                } else {
                    Object objR = c1363z3.Q().r(next, bundle2.get(next));
                    if (objR == null) {
                        c1363z3.c().w().b("Param value can't be null", c1363z3.F().e(next));
                        it.remove();
                    } else {
                        c1363z3.Q().G(bundle2, next, objR);
                    }
                }
            }
            c1148h = new C1148H(bundle2);
        }
        this.f8947f = c1148h;
    }

    public final C1145E a(C1363z3 c1363z3, long j4) {
        return new C1145E(c1363z3, this.f8944c, this.f8942a, this.f8943b, this.f8945d, j4, this.f8947f);
    }

    public final String toString() {
        return "Event{appId='" + this.f8942a + "', name='" + this.f8943b + "', params=" + this.f8947f.toString() + "}";
    }

    public C1145E(C1363z3 c1363z3, String str, String str2, String str3, long j4, long j5, C1148H c1148h) {
        AbstractC0549h.d(str2);
        AbstractC0549h.d(str3);
        AbstractC0549h.j(c1148h);
        this.f8942a = str2;
        this.f8943b = str3;
        this.f8944c = true == TextUtils.isEmpty(str) ? null : str;
        this.f8945d = j4;
        this.f8946e = j5;
        if (j5 != 0 && j5 > j4) {
            c1363z3.c().w().c("Event created with reverse previous/current timestamps. appId, name", K2.z(str2), K2.z(str3));
        }
        this.f8947f = c1148h;
    }
}
