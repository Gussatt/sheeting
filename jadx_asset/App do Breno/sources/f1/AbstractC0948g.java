package f1;

import android.os.Build;

/* JADX INFO: renamed from: f1.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0948g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f7204a;

    static {
        f7204a = Build.VERSION.SDK_INT >= 31 ? 33554432 : 0;
    }
}
