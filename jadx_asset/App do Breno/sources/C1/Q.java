package C1;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f581a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String a(Context context) {
        try {
            if (this.f581a == null) {
                this.f581a = b(context);
            }
        } finally {
        }
        return "".equals(this.f581a) ? null : this.f581a;
    }
}
