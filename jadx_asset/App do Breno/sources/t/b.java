package t;

import B.c;
import android.content.Context;
import android.os.Process;
import s.AbstractC1514a;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static int a(Context context, String str, int i4, int i5, String str2) {
        if (context.checkPermission(str, i4, i5) == -1) {
            return -1;
        }
        String strC = AbstractC1514a.c(str);
        if (strC == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i5);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i5 || !c.a(context.getPackageName(), str2)) ? AbstractC1514a.b(context, strC, str2) : AbstractC1514a.a(context, i5, strC, str2)) == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
