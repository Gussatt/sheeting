package h0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f7329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f7330b;

    public abstract void a(View view);

    public abstract float b(View view);

    public abstract void c(View view);

    public abstract void d(View view, int i4, int i5, int i6, int i7);

    public abstract void e(View view, float f4);

    public void f(View view, int i4) {
        if (!f7330b) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f7329a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f7330b = true;
        }
        Field field = f7329a;
        if (field != null) {
            try {
                f7329a.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);
}
