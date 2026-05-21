package C;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.InputDevice;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Method f323a;

    public static class a {
        public static float a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHorizontalScrollFactor();
        }

        public static float b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledVerticalScrollFactor();
        }
    }

    public static class b {
        public static int a(ViewConfiguration viewConfiguration) {
            return viewConfiguration.getScaledHoverSlop();
        }

        public static boolean b(ViewConfiguration viewConfiguration) {
            return viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
        }
    }

    public static class c {
        public static int a(ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
            return viewConfiguration.getScaledMaximumFlingVelocity(i4, i5, i6);
        }

        public static int b(ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
            return viewConfiguration.getScaledMinimumFlingVelocity(i4, i5, i6);
        }
    }

    static {
        if (Build.VERSION.SDK_INT == 25) {
            try {
                f323a = ViewConfiguration.class.getDeclaredMethod("getScaledScrollFactor", new Class[0]);
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
    }

    public static int a(Resources resources, int i4, B.g gVar, int i5) {
        int dimensionPixelSize;
        return i4 != -1 ? (i4 == 0 || (dimensionPixelSize = resources.getDimensionPixelSize(i4)) < 0) ? i5 : dimensionPixelSize : ((Integer) gVar.get()).intValue();
    }

    public static float b(ViewConfiguration viewConfiguration, Context context) {
        Method method;
        if (Build.VERSION.SDK_INT >= 25 && (method = f323a) != null) {
            try {
                return ((Integer) method.invoke(viewConfiguration, new Object[0])).intValue();
            } catch (Exception unused) {
                Log.i("ViewConfigCompat", "Could not find method getScaledScrollFactor() on ViewConfiguration");
            }
        }
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
            return typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static int c(Resources resources, String str, String str2) {
        return resources.getIdentifier(str, str2, "android");
    }

    public static int d(Resources resources, int i4, int i5) {
        if (i4 == 4194304 && i5 == 26) {
            return c(resources, "config_viewMaxRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static int e(Resources resources, int i4, int i5) {
        if (i4 == 4194304 && i5 == 26) {
            return c(resources, "config_viewMinRotaryEncoderFlingVelocity", "dimen");
        }
        return -1;
    }

    public static float f(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.a(viewConfiguration) : b(viewConfiguration, context);
    }

    public static int g(ViewConfiguration viewConfiguration) {
        return Build.VERSION.SDK_INT >= 28 ? b.a(viewConfiguration) : viewConfiguration.getScaledTouchSlop() / 2;
    }

    public static int h(Context context, final ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(viewConfiguration, i4, i5, i6);
        }
        if (!k(i4, i5, i6)) {
            return Integer.MIN_VALUE;
        }
        Resources resources = context.getResources();
        int iD = d(resources, i6, i5);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iD, new B.g() { // from class: C.A
            @Override // B.g
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMaximumFlingVelocity());
            }
        }, Integer.MIN_VALUE);
    }

    public static int i(Context context, final ViewConfiguration viewConfiguration, int i4, int i5, int i6) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.b(viewConfiguration, i4, i5, i6);
        }
        if (!k(i4, i5, i6)) {
            return Integer.MAX_VALUE;
        }
        Resources resources = context.getResources();
        int iE = e(resources, i6, i5);
        Objects.requireNonNull(viewConfiguration);
        return a(resources, iE, new B.g() { // from class: C.B
            @Override // B.g
            public final Object get() {
                return Integer.valueOf(viewConfiguration.getScaledMinimumFlingVelocity());
            }
        }, Integer.MAX_VALUE);
    }

    public static float j(ViewConfiguration viewConfiguration, Context context) {
        return Build.VERSION.SDK_INT >= 26 ? a.b(viewConfiguration) : b(viewConfiguration, context);
    }

    public static boolean k(int i4, int i5, int i6) {
        InputDevice device = InputDevice.getDevice(i4);
        return (device == null || device.getMotionRange(i5, i6) == null) ? false : true;
    }

    public static boolean l(ViewConfiguration viewConfiguration, Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return b.b(viewConfiguration);
        }
        Resources resources = context.getResources();
        int iC = c(resources, "config_showMenuShortcutsWhenKeyboardPresent", "bool");
        return iC != 0 && resources.getBoolean(iC);
    }
}
