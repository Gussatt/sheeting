package h0;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class L extends K {
    @Override // h0.D, h0.M
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    @Override // h0.I, h0.M
    public void d(View view, int i4, int i5, int i6, int i7) {
        view.setLeftTopRightBottom(i4, i5, i6, i7);
    }

    @Override // h0.D, h0.M
    public void e(View view, float f4) {
        view.setTransitionAlpha(f4);
    }

    @Override // h0.K, h0.M
    public void f(View view, int i4) {
        view.setTransitionVisibility(i4);
    }

    @Override // h0.G, h0.M
    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // h0.G, h0.M
    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
