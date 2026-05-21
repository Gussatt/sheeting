package S0;

import V0.AbstractC0549h;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f3445c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f3446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile String f3447b;

    public o(Context context) {
        this.f3446a = context.getApplicationContext();
    }

    public static o a(Context context) {
        AbstractC0549h.j(context);
        synchronized (o.class) {
            try {
                if (f3445c == null) {
                    D.d(context);
                    f3445c = new o(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f3445c;
    }

    public static final z d(PackageInfo packageInfo, z... zVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            A a4 = new A(packageInfo.signatures[0].toByteArray());
            for (int i4 = 0; i4 < zVarArr.length; i4++) {
                if (zVarArr[i4].equals(a4)) {
                    return zVarArr[i4];
                }
            }
        }
        return null;
    }

    public static final boolean e(PackageInfo packageInfo, boolean z3) {
        PackageInfo packageInfo2;
        if (!z3) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z3 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z3 ? d(packageInfo2, C.f3391a) : d(packageInfo2, C.f3391a[0])) != null) {
                return true;
            }
        }
        return false;
    }

    public boolean b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (e(packageInfo, false)) {
            return true;
        }
        if (e(packageInfo, true)) {
            if (AbstractC0516n.d(this.f3446a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }

    public boolean c(int i4) {
        M mC;
        int length;
        String[] packagesForUid = this.f3446a.getPackageManager().getPackagesForUid(i4);
        if (packagesForUid != null && (length = packagesForUid.length) != 0) {
            mC = null;
            int i5 = 0;
            while (true) {
                if (i5 >= length) {
                    AbstractC0549h.j(mC);
                    break;
                }
                mC = f(packagesForUid[i5], false, false);
                if (mC.f3415a) {
                    break;
                }
                i5++;
            }
        } else {
            mC = M.c("no pkgs");
        }
        mC.e();
        return mC.f3415a;
    }

    public final M f(String str, boolean z3, boolean z4) {
        M mC;
        ApplicationInfo applicationInfo;
        if (str == null) {
            return M.c("null pkg");
        }
        if (str.equals(this.f3447b)) {
            return M.b();
        }
        if (D.e()) {
            mC = D.b(str, AbstractC0516n.d(this.f3446a), false, false);
        } else {
            try {
                PackageInfo packageInfo = this.f3446a.getPackageManager().getPackageInfo(str, 64);
                boolean zD = AbstractC0516n.d(this.f3446a);
                if (packageInfo == null) {
                    mC = M.c("null pkg");
                } else {
                    Signature[] signatureArr = packageInfo.signatures;
                    if (signatureArr == null || signatureArr.length != 1) {
                        mC = M.c("single cert required");
                    } else {
                        A a4 = new A(packageInfo.signatures[0].toByteArray());
                        String str2 = packageInfo.packageName;
                        M mA = D.a(str2, a4, zD, false);
                        mC = (!mA.f3415a || (applicationInfo = packageInfo.applicationInfo) == null || (applicationInfo.flags & 2) == 0 || !D.a(str2, a4, false, true).f3415a) ? mA : M.c("debuggable release cert app rejected");
                    }
                }
            } catch (PackageManager.NameNotFoundException e4) {
                return M.d("no pkg ".concat(str), e4);
            }
        }
        if (mC.f3415a) {
            this.f3447b = str;
        }
        return mC;
    }
}
