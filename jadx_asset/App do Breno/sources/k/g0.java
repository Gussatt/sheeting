package k;

import C.AbstractC0241y;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f8824a;

    static {
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f8824a = declaredMethod;
            if (declaredMethod.isAccessible()) {
                return;
            }
            f8824a.setAccessible(true);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static void a(View view, Rect rect, Rect rect2) {
        Method method = f8824a;
        if (method != null) {
            try {
                method.invoke(view, rect, rect2);
            } catch (Exception e4) {
                Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e4);
            }
        }
    }

    public static boolean b(View view) {
        return AbstractC0241y.l(view) == 1;
    }
}
