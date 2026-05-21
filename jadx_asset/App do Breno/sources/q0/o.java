package q0;

import C.F;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import u0.C1566a;
import u0.C1567b;
import u0.C1572g;
import u0.C1573h;
import u0.C1578m;

/* JADX INFO: loaded from: classes.dex */
public final class o implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f11061b = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f11062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f11063d;

    static {
        String simpleName = o.class.getSimpleName();
        X2.l.d(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f11062c = simpleName;
        f11063d = L2.m.d(Integer.valueOf(F.m.g()), Integer.valueOf(F.m.f()), Integer.valueOf(F.m.a()), Integer.valueOf(F.m.c()), Integer.valueOf(F.m.h()), Integer.valueOf(F.m.e()), Integer.valueOf(F.m.i()), Integer.valueOf(F.m.b()));
    }

    @Override // q0.l
    public k a(Activity activity) {
        X2.l.e(activity, "activity");
        return e(activity);
    }

    public k c(Activity activity) throws Exception {
        F fA;
        X2.l.e(activity, "activity");
        int i4 = Build.VERSION.SDK_INT;
        Rect rectA = i4 >= 30 ? C1572g.f11460a.a(activity) : i4 >= 29 ? h(activity) : i4 >= 28 ? g(activity) : f(activity);
        if (i4 >= 30) {
            fA = i(activity);
        } else {
            fA = new F.b().a();
            X2.l.d(fA, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new n0.b(rectA), fA);
    }

    public k d(Context context) {
        X2.l.e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return C1572g.f11460a.c(context);
        }
        Context contextA = C1567b.f11459a.a(context);
        if (contextA instanceof Activity) {
            return c((Activity) context);
        }
        if (!(contextA instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        X2.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        X2.l.d(defaultDisplay, "wm.defaultDisplay");
        Point pointL = l(defaultDisplay);
        return new k(new Rect(0, 0, pointL.x, pointL.y), null, 2, null);
    }

    public k e(Context context) throws Exception {
        Rect rect;
        F fA;
        X2.l.e(context, "context");
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 30) {
            rect = C1572g.f11460a.d(context);
        } else {
            Object systemService = context.getSystemService("window");
            X2.l.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            X2.l.d(defaultDisplay, "display");
            Point pointL = l(defaultDisplay);
            rect = new Rect(0, 0, pointL.x, pointL.y);
        }
        if (i4 >= 30) {
            fA = i(context);
        } else {
            fA = new F.b().a();
            X2.l.d(fA, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new n0.b(rect), fA);
    }

    public final Rect f(Activity activity) {
        X2.l.e(activity, "activity");
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!C1566a.f11458a.a(activity)) {
            X2.l.d(defaultDisplay, "defaultDisplay");
            Point pointL = l(defaultDisplay);
            int iK = k(activity);
            int i4 = rect.bottom;
            if (i4 + iK == pointL.y) {
                rect.bottom = i4 + iK;
                return rect;
            }
            int i5 = rect.right;
            if (i5 + iK == pointL.x) {
                rect.right = i5 + iK;
            }
        }
        return rect;
    }

    public final Rect g(Activity activity) {
        DisplayCutout displayCutoutJ;
        X2.l.e(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (C1566a.f11458a.a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
                X2.l.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new Class[0]).invoke(obj, new Object[0]);
                X2.l.c(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e4) {
            Log.w(f11062c, e4);
            m(activity, rect);
        } catch (NoSuchFieldException e5) {
            Log.w(f11062c, e5);
            m(activity, rect);
        } catch (NoSuchMethodException e6) {
            Log.w(f11062c, e6);
            m(activity, rect);
        } catch (InvocationTargetException e7) {
            Log.w(f11062c, e7);
            m(activity, rect);
        }
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        C1573h c1573h = C1573h.f11461a;
        X2.l.d(defaultDisplay, "currentDisplay");
        c1573h.a(defaultDisplay, point);
        C1566a c1566a = C1566a.f11458a;
        if (!c1566a.a(activity)) {
            int iK = k(activity);
            int i4 = rect.bottom;
            if (i4 + iK == point.y) {
                rect.bottom = i4 + iK;
            } else {
                int i5 = rect.right;
                if (i5 + iK == point.x) {
                    rect.right = i5 + iK;
                } else if (rect.left == iK) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !c1566a.a(activity) && (displayCutoutJ = j(defaultDisplay)) != null) {
            int i6 = rect.left;
            C1578m c1578m = C1578m.f11462a;
            if (i6 == c1578m.b(displayCutoutJ)) {
                rect.left = 0;
            }
            if (point.x - rect.right == c1578m.c(displayCutoutJ)) {
                rect.right += c1578m.c(displayCutoutJ);
            }
            if (rect.top == c1578m.d(displayCutoutJ)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == c1578m.a(displayCutoutJ)) {
                rect.bottom += c1578m.a(displayCutoutJ);
            }
        }
        return rect;
    }

    public final Rect h(Activity activity) {
        X2.l.e(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new Class[0]).invoke(obj, new Object[0]);
            X2.l.c(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (IllegalAccessException e4) {
            Log.w(f11062c, e4);
            return g(activity);
        } catch (NoSuchFieldException e5) {
            Log.w(f11062c, e5);
            return g(activity);
        } catch (NoSuchMethodException e6) {
            Log.w(f11062c, e6);
            return g(activity);
        } catch (InvocationTargetException e7) {
            Log.w(f11062c, e7);
            return g(activity);
        }
    }

    public final F i(Context context) throws Exception {
        X2.l.e(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return C1572g.f11460a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final DisplayCutout j(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(new Class[0]);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(new Object[0]);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (m.a(obj)) {
                return n.a(obj);
            }
            return null;
        } catch (ClassNotFoundException e4) {
            Log.w(f11062c, e4);
            return null;
        } catch (IllegalAccessException e5) {
            Log.w(f11062c, e5);
            return null;
        } catch (InstantiationException e6) {
            Log.w(f11062c, e6);
            return null;
        } catch (NoSuchFieldException e7) {
            Log.w(f11062c, e7);
            return null;
        } catch (NoSuchMethodException e8) {
            Log.w(f11062c, e8);
            return null;
        } catch (InvocationTargetException e9) {
            Log.w(f11062c, e9);
            return null;
        }
    }

    public final int k(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final Point l(Display display) {
        X2.l.e(display, "display");
        Point point = new Point();
        C1573h.f11461a.a(display, point);
        return point;
    }

    public final void m(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
