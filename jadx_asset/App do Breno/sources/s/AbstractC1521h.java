package s;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* JADX INFO: renamed from: s.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1521h {
    public static int a(boolean z3, int i4) {
        int i5;
        if (!z3) {
            i5 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i4;
            }
            i5 = 33554432;
        }
        return i5 | i4;
    }

    public static PendingIntent b(Context context, int i4, Intent intent, int i5, boolean z3) {
        return PendingIntent.getActivity(context, i4, intent, a(z3, i5));
    }
}
