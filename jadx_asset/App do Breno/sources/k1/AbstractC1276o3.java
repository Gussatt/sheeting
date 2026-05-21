package k1;

import android.content.Context;
import android.content.res.Resources;

/* JADX INFO: renamed from: k1.o3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1276o3 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(S0.p.f3448a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
