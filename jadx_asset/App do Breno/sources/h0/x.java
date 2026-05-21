package h0;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f7480a = true;

    public static v a(ViewGroup viewGroup) {
        return new u(viewGroup);
    }

    public static void b(ViewGroup viewGroup, boolean z3) {
        if (f7480a) {
            try {
                viewGroup.suppressLayout(z3);
            } catch (NoSuchMethodError unused) {
                f7480a = false;
            }
        }
    }

    public static void c(ViewGroup viewGroup, boolean z3) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z3);
        } else {
            b(viewGroup, z3);
        }
    }
}
