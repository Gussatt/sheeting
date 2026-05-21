package K1;

import C1.D;
import android.text.TextUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H1.b f2459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1.g f2460c;

    public c(String str, H1.b bVar) {
        this(str, bVar, z1.g.f());
    }

    @Override // K1.l
    public JSONObject a(k kVar, boolean z3) {
        D1.f.d();
        if (!z3) {
            throw new RuntimeException("An invalid data collection token was used.");
        }
        try {
            Map mapF = f(kVar);
            H1.a aVarB = b(d(mapF), kVar);
            this.f2460c.b("Requesting settings from " + this.f2458a);
            this.f2460c.i("Settings query params were: " + mapF);
            return g(aVarB.c());
        } catch (IOException e4) {
            this.f2460c.e("Settings request failed.", e4);
            return null;
        }
    }

    public final H1.a b(H1.a aVar, k kVar) {
        c(aVar, "X-CRASHLYTICS-GOOGLE-APP-ID", kVar.f2491a);
        c(aVar, "X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c(aVar, "X-CRASHLYTICS-API-CLIENT-VERSION", D.s());
        c(aVar, "Accept", "application/json");
        c(aVar, "X-CRASHLYTICS-DEVICE-MODEL", kVar.f2492b);
        c(aVar, "X-CRASHLYTICS-OS-BUILD-VERSION", kVar.f2493c);
        c(aVar, "X-CRASHLYTICS-OS-DISPLAY-VERSION", kVar.f2494d);
        c(aVar, "X-CRASHLYTICS-INSTALLATION-ID", kVar.f2495e.a().c());
        return aVar;
    }

    public final void c(H1.a aVar, String str, String str2) {
        if (str2 != null) {
            aVar.d(str, str2);
        }
    }

    public H1.a d(Map map) {
        return this.f2459b.a(this.f2458a, map).d("User-Agent", "Crashlytics Android SDK/" + D.s()).d("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public final JSONObject e(String str) {
        try {
            return new JSONObject(str);
        } catch (Exception e4) {
            this.f2460c.l("Failed to parse settings JSON from " + this.f2458a, e4);
            this.f2460c.k("Settings response " + str);
            return null;
        }
    }

    public final Map f(k kVar) {
        HashMap map = new HashMap();
        map.put("build_version", kVar.f2498h);
        map.put("display_version", kVar.f2497g);
        map.put("source", Integer.toString(kVar.f2499i));
        String str = kVar.f2496f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    public JSONObject g(H1.c cVar) {
        int iB = cVar.b();
        this.f2460c.i("Settings response code was: " + iB);
        if (h(iB)) {
            return e(cVar.a());
        }
        this.f2460c.d("Settings request failed; (status: " + iB + ") from " + this.f2458a);
        return null;
    }

    public boolean h(int i4) {
        return i4 == 200 || i4 == 201 || i4 == 202 || i4 == 203;
    }

    public c(String str, H1.b bVar, z1.g gVar) {
        if (str == null) {
            throw new IllegalArgumentException("url must not be null.");
        }
        this.f2460c = gVar;
        this.f2459b = bVar;
        this.f2458a = str;
    }
}
