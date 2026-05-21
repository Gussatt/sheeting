package i;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: renamed from: i.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1036a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f7592a;

    public C1036a(Context context) {
        this.f7592a = context;
    }

    public static C1036a a(Context context) {
        return new C1036a(context);
    }

    public int b() {
        return this.f7592a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int c() {
        Configuration configuration = this.f7592a.getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i4 > 600) {
            return 5;
        }
        if (i4 > 960 && i5 > 720) {
            return 5;
        }
        if (i4 > 720 && i5 > 960) {
            return 5;
        }
        if (i4 >= 500) {
            return 4;
        }
        if (i4 > 640 && i5 > 480) {
            return 4;
        }
        if (i4 <= 480 || i5 <= 640) {
            return i4 >= 360 ? 3 : 2;
        }
        return 4;
    }

    public boolean d() {
        return true;
    }
}
