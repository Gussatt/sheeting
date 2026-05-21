package c1;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import b1.k;

/* JADX INFO: renamed from: c1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0662d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5952a;

    public C0662d(Context context) {
        this.f5952a = context;
    }

    public int a(String str) {
        return this.f5952a.checkCallingOrSelfPermission(str);
    }

    public ApplicationInfo b(String str, int i4) {
        return this.f5952a.getPackageManager().getApplicationInfo(str, i4);
    }

    public CharSequence c(String str) {
        Context context = this.f5952a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo d(String str, int i4) {
        return this.f5952a.getPackageManager().getPackageInfo(str, i4);
    }

    public boolean e() {
        String nameForUid;
        if (Binder.getCallingUid() == Process.myUid()) {
            return AbstractC0660b.a(this.f5952a);
        }
        if (!k.d() || (nameForUid = this.f5952a.getPackageManager().getNameForUid(Binder.getCallingUid())) == null) {
            return false;
        }
        return this.f5952a.getPackageManager().isInstantApp(nameForUid);
    }

    public final boolean f(int i4, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) this.f5952a.getSystemService("appops");
            if (appOpsManager == null) {
                throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
            }
            appOpsManager.checkPackage(i4, str);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
