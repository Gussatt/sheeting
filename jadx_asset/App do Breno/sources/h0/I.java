package h0;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class I extends G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f7327f = true;

    @Override // h0.M
    public void d(View view, int i4, int i5, int i6, int i7) {
        if (f7327f) {
            try {
                view.setLeftTopRightBottom(i4, i5, i6, i7);
            } catch (NoSuchMethodError unused) {
                f7327f = false;
            }
        }
    }
}
