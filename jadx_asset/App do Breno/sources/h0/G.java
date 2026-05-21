package h0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class G extends D {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f7325d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f7326e = true;

    @Override // h0.M
    public void g(View view, Matrix matrix) {
        if (f7325d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f7325d = false;
            }
        }
    }

    @Override // h0.M
    public void h(View view, Matrix matrix) {
        if (f7326e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                f7326e = false;
            }
        }
    }
}
