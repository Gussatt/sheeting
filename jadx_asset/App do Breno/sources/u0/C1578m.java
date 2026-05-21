package u0;

import android.view.DisplayCutout;

/* JADX INFO: renamed from: u0.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1578m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1578m f11462a = new C1578m();

    public final int a(DisplayCutout displayCutout) {
        X2.l.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(DisplayCutout displayCutout) {
        X2.l.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(DisplayCutout displayCutout) {
        X2.l.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(DisplayCutout displayCutout) {
        X2.l.e(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}
