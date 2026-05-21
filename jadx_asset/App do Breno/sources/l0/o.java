package l0;

import android.os.Build;
import android.webkit.WebView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f10231a = new s(o.d().getWebkitToCompatConverter());
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final p f10232a = o.a();
    }

    public static p a() {
        try {
            return new q((WebViewProviderFactoryBoundaryInterface) v3.a.a(WebViewProviderFactoryBoundaryInterface.class, b()));
        } catch (ClassNotFoundException unused) {
            return new j();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }

    public static InvocationHandler b() {
        return (InvocationHandler) Class.forName("org.chromium.support_lib_glue.SupportLibReflectionUtil", false, e()).getDeclaredMethod("createWebViewProviderFactory", new Class[0]).invoke(null, new Object[0]);
    }

    public static s c() {
        return a.f10231a;
    }

    public static p d() {
        return b.f10232a;
    }

    public static ClassLoader e() {
        return Build.VERSION.SDK_INT >= 28 ? h.a() : f().getClass().getClassLoader();
    }

    public static Object f() {
        try {
            Method declaredMethod = WebView.class.getDeclaredMethod("getFactory", new Class[0]);
            declaredMethod.setAccessible(true);
            return declaredMethod.invoke(null, new Object[0]);
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
