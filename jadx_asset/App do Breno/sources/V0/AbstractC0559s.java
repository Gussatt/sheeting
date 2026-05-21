package V0;

import S0.AbstractC0515m;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import c1.C0663e;
import java.util.Locale;
import p.C1481g;
import y.AbstractC1645b;

/* JADX INFO: renamed from: V0.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0559s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1481g f3715a = new C1481g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f3716b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C0663e.a(context).c(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i4) {
        Resources resources = context.getResources();
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? resources.getString(R.string.ok) : resources.getString(R0.b.f3315a) : resources.getString(R0.b.f3324j) : resources.getString(R0.b.f3318d);
    }

    public static String c(Context context, int i4) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i4 == 1) {
            return resources.getString(R0.b.f3319e, strA);
        }
        if (i4 == 2) {
            return b1.h.d(context) ? resources.getString(R0.b.f3328n) : resources.getString(R0.b.f3325k, strA);
        }
        if (i4 == 3) {
            return resources.getString(R0.b.f3316b, strA);
        }
        if (i4 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i4 == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i4 == 9) {
            return resources.getString(R0.b.f3323i, strA);
        }
        if (i4 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i4) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case 17:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(R0.b.f3327m, strA);
            default:
                return resources.getString(S0.p.f3448a, strA);
        }
    }

    public static String d(Context context, int i4) {
        return (i4 == 6 || i4 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i4);
    }

    public static String e(Context context, int i4) {
        String strH = i4 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i4);
        return strH == null ? context.getResources().getString(R0.b.f3322h) : strH;
    }

    public static String f(Context context, int i4) {
        Resources resources = context.getResources();
        switch (i4) {
            case 1:
                return resources.getString(R0.b.f3320f);
            case 2:
                return resources.getString(R0.b.f3326l);
            case 3:
                return resources.getString(R0.b.f3317c);
            case O.h.LONG_FIELD_NUMBER /* 4 */:
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
            case 18:
                return null;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i4);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(S0.p.f3448a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    public static String h(Context context, String str) {
        C1481g c1481g = f3715a;
        synchronized (c1481g) {
            try {
                Locale localeB = AbstractC1645b.a(context.getResources().getConfiguration()).b(0);
                if (!localeB.equals(f3716b)) {
                    c1481g.clear();
                    f3716b = localeB;
                }
                String str2 = (String) c1481g.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesC = AbstractC0515m.c(context);
                if (resourcesC == null) {
                    return null;
                }
                int identifier = resourcesC.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resourcesC.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    c1481g.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
