package u0;

import android.graphics.Point;
import android.view.Display;

/* JADX INFO: renamed from: u0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1573h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1573h f11461a = new C1573h();

    public final void a(Display display, Point point) {
        X2.l.e(display, "display");
        X2.l.e(point, "point");
        display.getRealSize(point);
    }
}
