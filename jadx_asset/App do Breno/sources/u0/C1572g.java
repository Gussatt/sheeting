package u0;

import C.F;
import android.content.Context;
import android.graphics.Rect;
import android.view.WindowInsets;
import android.view.WindowManager;

/* JADX INFO: renamed from: u0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1572g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1572g f11460a = new C1572g();

    public final Rect a(Context context) {
        X2.l.e(context, "context");
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getBounds();
        X2.l.d(bounds, "wm.currentWindowMetrics.bounds");
        return bounds;
    }

    public final F b(Context context) {
        X2.l.e(context, "context");
        WindowInsets windowInsets = ((WindowManager) context.getSystemService(WindowManager.class)).getCurrentWindowMetrics().getWindowInsets();
        X2.l.d(windowInsets, "context.getSystemService…indowMetrics.windowInsets");
        F fO = F.o(windowInsets);
        X2.l.d(fO, "toWindowInsetsCompat(platformInsets)");
        return fO;
    }

    public final q0.k c(Context context) {
        X2.l.e(context, "context");
        WindowManager windowManager = (WindowManager) context.getSystemService(WindowManager.class);
        F fO = F.o(windowManager.getCurrentWindowMetrics().getWindowInsets());
        X2.l.d(fO, "toWindowInsetsCompat(wm.…ndowMetrics.windowInsets)");
        Rect bounds = windowManager.getCurrentWindowMetrics().getBounds();
        X2.l.d(bounds, "wm.currentWindowMetrics.bounds");
        return new q0.k(bounds, fO);
    }

    public final Rect d(Context context) {
        X2.l.e(context, "context");
        Rect bounds = ((WindowManager) context.getSystemService(WindowManager.class)).getMaximumWindowMetrics().getBounds();
        X2.l.d(bounds, "wm.maximumWindowMetrics.bounds");
        return bounds;
    }
}
