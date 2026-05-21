package k0;

import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import l0.n;
import l0.o;
import l0.p;

/* JADX INFO: renamed from: k0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1139c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Uri f8871a = Uri.parse("*");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Uri f8872b = Uri.parse("");

    public static PackageInfo a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return l0.d.a();
        }
        try {
            return c();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    public static p b() {
        return o.d();
    }

    public static PackageInfo c() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static boolean d() {
        if (n.f10186R.d()) {
            return b().getStatics().isMultiProcessEnabled();
        }
        throw n.a();
    }
}
