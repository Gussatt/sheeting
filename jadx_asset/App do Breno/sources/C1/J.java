package C1;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import n1.AbstractC1445l;
import n1.C1446m;
import r1.C1509f;

/* JADX INFO: loaded from: classes.dex */
public class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1509f f547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1446m f549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f550e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f551f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Boolean f552g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C1446m f553h;

    public J(C1509f c1509f) {
        Object obj = new Object();
        this.f548c = obj;
        this.f549d = new C1446m();
        this.f550e = false;
        this.f551f = false;
        this.f553h = new C1446m();
        Context contextM = c1509f.m();
        this.f547b = c1509f;
        this.f546a = AbstractC0252j.q(contextM);
        Boolean boolB = b();
        this.f552g = boolB == null ? a(contextM) : boolB;
        synchronized (obj) {
            try {
                if (d()) {
                    this.f549d.e(null);
                    this.f550e = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Boolean g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) {
                return null;
            }
            return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
        } catch (PackageManager.NameNotFoundException e4) {
            z1.g.f().e("Could not read data collection permission from manifest", e4);
            return null;
        }
    }

    public static void i(SharedPreferences sharedPreferences, Boolean bool) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        if (bool != null) {
            editorEdit.putBoolean("firebase_crashlytics_collection_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("firebase_crashlytics_collection_enabled");
        }
        editorEdit.apply();
    }

    public final Boolean a(Context context) {
        Boolean boolG = g(context);
        if (boolG == null) {
            this.f551f = false;
            return null;
        }
        this.f551f = true;
        return Boolean.valueOf(Boolean.TRUE.equals(boolG));
    }

    public final Boolean b() {
        if (!this.f546a.contains("firebase_crashlytics_collection_enabled")) {
            return null;
        }
        this.f551f = false;
        return Boolean.valueOf(this.f546a.getBoolean("firebase_crashlytics_collection_enabled", true));
    }

    public void c(boolean z3) {
        if (!z3) {
            throw new IllegalStateException("An invalid data collection token was used.");
        }
        this.f553h.e(null);
    }

    public synchronized boolean d() {
        boolean zBooleanValue;
        try {
            Boolean bool = this.f552g;
            zBooleanValue = bool != null ? bool.booleanValue() : e();
            f(zBooleanValue);
        } catch (Throwable th) {
            throw th;
        }
        return zBooleanValue;
    }

    public final boolean e() {
        try {
            return this.f547b.x();
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public final void f(boolean z3) {
        z1.g.f().b(String.format("Crashlytics automatic data collection %s by %s.", z3 ? "ENABLED" : "DISABLED", this.f552g == null ? "global Firebase setting" : this.f551f ? "firebase_crashlytics_collection_enabled manifest flag" : "API"));
    }

    public synchronized void h(Boolean bool) {
        if (bool != null) {
            try {
                this.f551f = false;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f552g = bool != null ? bool : a(this.f547b.m());
        i(this.f546a, bool);
        synchronized (this.f548c) {
            try {
                if (d()) {
                    if (!this.f550e) {
                        this.f549d.e(null);
                        this.f550e = true;
                    }
                } else if (this.f550e) {
                    this.f549d = new C1446m();
                    this.f550e = false;
                }
            } finally {
            }
        }
    }

    public AbstractC1445l j() {
        AbstractC1445l abstractC1445lA;
        synchronized (this.f548c) {
            abstractC1445lA = this.f549d.a();
        }
        return abstractC1445lA;
    }

    public AbstractC1445l k() {
        return D1.b.b(this.f553h.a(), j());
    }
}
