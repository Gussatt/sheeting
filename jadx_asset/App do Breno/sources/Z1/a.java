package Z1;

import S1.c;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import r1.C1505b;
import t.AbstractC1537a;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SharedPreferences f4018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f4019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4020d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f4017a = contextA;
        this.f4018b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f4019c = cVar;
        this.f4020d = c();
    }

    public static Context a(Context context) {
        return AbstractC1537a.a(context);
    }

    public synchronized boolean b() {
        return this.f4020d;
    }

    public final boolean c() {
        return this.f4018b.contains("firebase_data_collection_default_enabled") ? this.f4018b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    public final boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f4017a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f4017a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f4018b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f4018b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                f(zEquals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void f(boolean z3) {
        if (this.f4020d != z3) {
            this.f4020d = z3;
            this.f4019c.a(new S1.a(C1505b.class, new C1505b(z3)));
        }
    }
}
