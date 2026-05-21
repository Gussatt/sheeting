package E1;

import F1.F;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O1.a f969a = new Q1.d().j(a.f920a).i();

    public static j a(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return b(jSONObject.getString("rolloutId"), jSONObject.getString("parameterKey"), jSONObject.getString("parameterValue"), jSONObject.getString("variantId"), jSONObject.getLong("templateVersion"));
    }

    public static j b(String str, String str2, String str3, String str4, long j4) {
        return new b(str, str2, i(str3), str4, j4);
    }

    public static String i(String str) {
        return str.length() > 256 ? str.substring(0, 256) : str;
    }

    public abstract String c();

    public abstract String d();

    public abstract String e();

    public abstract long f();

    public abstract String g();

    public F.e.d.AbstractC0031e h() {
        return F.e.d.AbstractC0031e.a().d(F.e.d.AbstractC0031e.b.a().c(g()).b(e()).a()).b(c()).c(d()).e(f()).a();
    }
}
