package k1;

import V0.AbstractC0549h;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: renamed from: k1.u5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1325u5 {
    public static String a(String str, String[] strArr, String[] strArr2) {
        AbstractC0549h.j(strArr);
        AbstractC0549h.j(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i4 = 0; i4 < iMin; i4++) {
            String str2 = strArr[i4];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i4];
            }
        }
        return null;
    }

    public static String b(Context context, String str, String str2) {
        AbstractC0549h.j(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC1276o3.a(context);
        }
        return AbstractC1276o3.b("google_app_id", resources, str2);
    }
}
