package C1;

import C1.P;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Locale;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import n1.AbstractC1448o;

/* JADX INFO: loaded from: classes.dex */
public class O implements P {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f573g = Pattern.compile("[^\\p{Alnum}]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f574h = Pattern.quote("/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final V1.h f578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public P.a f580f;

    public O(Context context, String str, V1.h hVar, J j4) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.f576b = context;
        this.f577c = str;
        this.f578d = hVar;
        this.f579e = j4;
        this.f575a = new Q();
    }

    public static String c() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    public static String e(String str) {
        return f573g.matcher(str).replaceAll("").toLowerCase(Locale.US);
    }

    public static boolean k(String str) {
        return str != null && str.startsWith("SYN_");
    }

    @Override // C1.P
    public synchronized P.a a() {
        if (!n()) {
            return this.f580f;
        }
        z1.g.f().i("Determining Crashlytics installation ID...");
        SharedPreferences sharedPreferencesQ = AbstractC0252j.q(this.f576b);
        String string = sharedPreferencesQ.getString("firebase.installation.id", null);
        z1.g.f().i("Cached Firebase Installation ID: " + string);
        if (this.f579e.d()) {
            N nD = d(false);
            z1.g.f().i("Fetched Firebase Installation ID: " + nD.b());
            if (nD.b() == null) {
                nD = new N(string == null ? c() : string, null);
            }
            if (Objects.equals(nD.b(), string)) {
                this.f580f = P.a.a(l(sharedPreferencesQ), nD);
            } else {
                this.f580f = P.a.a(b(nD.b(), sharedPreferencesQ), nD);
            }
        } else if (k(string)) {
            this.f580f = P.a.b(l(sharedPreferencesQ));
        } else {
            this.f580f = P.a.b(b(c(), sharedPreferencesQ));
        }
        z1.g.f().i("Install IDs: " + this.f580f);
        return this.f580f;
    }

    public final synchronized String b(String str, SharedPreferences sharedPreferences) {
        String strE;
        strE = e(UUID.randomUUID().toString());
        z1.g.f().i("Created new Crashlytics installation ID: " + strE + " for FID: " + str);
        sharedPreferences.edit().putString("crashlytics.installation.id", strE).putString("firebase.installation.id", str).apply();
        return strE;
    }

    public N d(boolean z3) {
        String strB;
        D1.f.e();
        String str = null;
        if (z3) {
            try {
                strB = ((V1.m) AbstractC1448o.b(this.f578d.b(false), 10000L, TimeUnit.MILLISECONDS)).b();
            } catch (Exception e4) {
                z1.g.f().l("Error getting Firebase authentication token.", e4);
                strB = null;
            }
        } else {
            strB = null;
        }
        try {
            str = (String) AbstractC1448o.b(this.f578d.a(), 10000L, TimeUnit.MILLISECONDS);
        } catch (Exception e5) {
            z1.g.f().l("Error getting Firebase installation id.", e5);
        }
        return new N(str, strB);
    }

    public String f() {
        return this.f577c;
    }

    public String g() {
        return this.f575a.a(this.f576b);
    }

    public String h() {
        return String.format(Locale.US, "%s/%s", m(Build.MANUFACTURER), m(Build.MODEL));
    }

    public String i() {
        return m(Build.VERSION.INCREMENTAL);
    }

    public String j() {
        return m(Build.VERSION.RELEASE);
    }

    public final String l(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("crashlytics.installation.id", null);
    }

    public final String m(String str) {
        return str.replaceAll(f574h, "");
    }

    public final boolean n() {
        P.a aVar = this.f580f;
        if (aVar != null) {
            return aVar.e() == null && this.f579e.d();
        }
        return true;
    }
}
