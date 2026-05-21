package S0;

import V0.Y;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import c1.C0663e;
import s.AbstractC1521h;

/* JADX INFO: renamed from: S0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0513k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f3436a = AbstractC0516n.f3440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0513k f3437b = new C0513k();

    public static C0513k f() {
        return f3437b;
    }

    public int a(Context context) {
        return AbstractC0516n.a(context);
    }

    public Intent b(Context context, int i4, String str) {
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return null;
            }
            Uri uri = Y.f3657a;
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && b1.h.d(context)) {
            Uri uri2 = Y.f3657a;
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f3436a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(C0663e.a(context).d(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Uri uri3 = Y.f3657a;
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent c(Context context, int i4, int i5) {
        return d(context, i4, i5, null);
    }

    public PendingIntent d(Context context, int i4, int i5, String str) {
        Intent intentB = b(context, i4, str);
        if (intentB == null) {
            return null;
        }
        return AbstractC1521h.b(context, i5, intentB, 134217728, false);
    }

    public String e(int i4) {
        return AbstractC0516n.b(i4);
    }

    public int g(Context context) {
        return h(context, f3436a);
    }

    public int h(Context context, int i4) {
        int iE = AbstractC0516n.e(context, i4);
        if (AbstractC0516n.f(context, iE)) {
            return 18;
        }
        return iE;
    }

    public boolean i(Context context, String str) {
        return AbstractC0516n.j(context, str);
    }

    public boolean j(int i4) {
        return AbstractC0516n.h(i4);
    }
}
