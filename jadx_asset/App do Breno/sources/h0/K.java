package h0;

import android.os.Build;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class K extends I {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f7328g = true;

    @Override // h0.M
    public void f(View view, int i4) {
        if (Build.VERSION.SDK_INT == 28) {
            super.f(view, i4);
        } else if (f7328g) {
            try {
                view.setTransitionVisibility(i4);
            } catch (NoSuchMethodError unused) {
                f7328g = false;
            }
        }
    }
}
