package n0;

import X2.z;
import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f10592a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f10593b = z.b(e.class).c();

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.f10584a.a() != j.LOG) {
                return 0;
            }
            Log.d(f10593b, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (c.f10584a.a() != j.LOG) {
                return 0;
            }
            Log.d(f10593b, "Stub Extension");
            return 0;
        }
    }
}
