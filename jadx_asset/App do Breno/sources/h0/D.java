package h0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class D extends M {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f7324c = true;

    @Override // h0.M
    public float b(View view) {
        if (f7324c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                f7324c = false;
            }
        }
        return view.getAlpha();
    }

    @Override // h0.M
    public void e(View view, float f4) {
        if (f7324c) {
            try {
                view.setTransitionAlpha(f4);
                return;
            } catch (NoSuchMethodError unused) {
                f7324c = false;
            }
        }
        view.setAlpha(f4);
    }

    @Override // h0.M
    public void a(View view) {
    }

    @Override // h0.M
    public void c(View view) {
    }
}
