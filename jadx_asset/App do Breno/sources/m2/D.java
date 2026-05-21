package m2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.Window;
import android.view.WindowInsets;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class D {
    public List a(Context context) {
        WindowInsets windowInsetsB = b(context);
        return windowInsetsB == null ? Collections.EMPTY_LIST : windowInsetsB.getBoundingRects(WindowInsets.Type.captionBar());
    }

    public WindowInsets b(Context context) {
        Window window;
        Activity activityE = I2.h.e(context);
        if (activityE == null || (window = activityE.getWindow()) == null) {
            return null;
        }
        return window.getDecorView().getRootWindowInsets();
    }

    public void c(Context context, FlutterRenderer.g gVar) {
        List listA = a(context);
        int iMax = gVar.f7842d;
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((Rect) it.next()).bottom);
        }
        gVar.f7842d = iMax;
    }
}
