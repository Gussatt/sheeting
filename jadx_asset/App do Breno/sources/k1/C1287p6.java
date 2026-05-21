package k1;

import O0.a;
import android.content.pm.PackageManager;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: k1.p6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1287p6 extends W6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f9654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final V2 f9655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final V2 f9656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final V2 f9657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final V2 f9658h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final V2 f9659i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final V2 f9660j;

    public C1287p6(l7 l7Var) {
        super(l7Var);
        this.f9654d = new HashMap();
        Z2 z2H = this.f9366a.H();
        Objects.requireNonNull(z2H);
        this.f9655e = new V2(z2H, "last_delete_stale", 0L);
        Z2 z2H2 = this.f9366a.H();
        Objects.requireNonNull(z2H2);
        this.f9656f = new V2(z2H2, "last_delete_stale_batch", 0L);
        Z2 z2H3 = this.f9366a.H();
        Objects.requireNonNull(z2H3);
        this.f9657g = new V2(z2H3, "backoff", 0L);
        Z2 z2H4 = this.f9366a.H();
        Objects.requireNonNull(z2H4);
        this.f9658h = new V2(z2H4, "last_upload", 0L);
        Z2 z2H5 = this.f9366a.H();
        Objects.requireNonNull(z2H5);
        this.f9659i = new V2(z2H5, "last_upload_attempt", 0L);
        Z2 z2H6 = this.f9366a.H();
        Objects.requireNonNull(z2H6);
        this.f9660j = new V2(z2H6, "midnight_offset", 0L);
    }

    @Override // k1.W6
    public final boolean l() {
        return false;
    }

    public final Pair m(String str) {
        C1271n6 c1271n6;
        a.C0064a c0064aA;
        h();
        C1363z3 c1363z3 = this.f9366a;
        long jB = c1363z3.f().b();
        C1271n6 c1271n62 = (C1271n6) this.f9654d.get(str);
        if (c1271n62 != null && jB < c1271n62.f9613c) {
            return new Pair(c1271n62.f9611a, Boolean.valueOf(c1271n62.f9612b));
        }
        O0.a.b(true);
        long jC = c1363z3.B().C(str, AbstractC1291q2.f9725b) + jB;
        try {
            try {
                c0064aA = O0.a.a(c1363z3.d());
            } catch (PackageManager.NameNotFoundException unused) {
                c0064aA = null;
                if (c1271n62 != null && jB < c1271n62.f9613c + this.f9366a.B().C(str, AbstractC1291q2.f9728c)) {
                    return new Pair(c1271n62.f9611a, Boolean.valueOf(c1271n62.f9612b));
                }
            }
        } catch (Exception e4) {
            this.f9366a.c().q().b("Unable to get advertising id", e4);
            c1271n6 = new C1271n6("", false, jC);
        }
        if (c0064aA == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String strA = c0064aA.a();
        c1271n6 = strA != null ? new C1271n6(strA, c0064aA.b(), jC) : new C1271n6("", c0064aA.b(), jC);
        this.f9654d.put(str, c1271n6);
        O0.a.b(false);
        return new Pair(c1271n6.f9611a, Boolean.valueOf(c1271n6.f9612b));
    }

    public final Pair n(String str, C1229i4 c1229i4) {
        return c1229i4.r(EnumC1221h4.AD_STORAGE) ? m(str) : new Pair("", Boolean.FALSE);
    }

    public final String o(String str, boolean z3) {
        h();
        String str2 = z3 ? (String) m(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest messageDigestW = w7.w();
        if (messageDigestW == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestW.digest(str2.getBytes())));
    }
}
