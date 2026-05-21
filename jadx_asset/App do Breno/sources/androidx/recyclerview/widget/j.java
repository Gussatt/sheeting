package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static int a(RecyclerView.x xVar, h hVar, View view, View view2, RecyclerView.n nVar, boolean z3) {
        if (nVar.t() == 0 || xVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return Math.abs(nVar.I(view) - nVar.I(view2)) + 1;
        }
        return Math.min(hVar.h(), hVar.d(view2) - hVar.e(view));
    }

    public static int b(RecyclerView.x xVar, h hVar, View view, View view2, RecyclerView.n nVar, boolean z3, boolean z4) {
        if (nVar.t() == 0 || xVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        int iMax = z4 ? Math.max(0, (xVar.a() - Math.max(nVar.I(view), nVar.I(view2))) - 1) : Math.max(0, Math.min(nVar.I(view), nVar.I(view2)));
        if (z3) {
            return Math.round((iMax * (Math.abs(hVar.d(view2) - hVar.e(view)) / (Math.abs(nVar.I(view) - nVar.I(view2)) + 1))) + (hVar.g() - hVar.e(view)));
        }
        return iMax;
    }

    public static int c(RecyclerView.x xVar, h hVar, View view, View view2, RecyclerView.n nVar, boolean z3) {
        if (nVar.t() == 0 || xVar.a() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z3) {
            return xVar.a();
        }
        return (int) (((hVar.d(view2) - hVar.e(view)) / (Math.abs(nVar.I(view) - nVar.I(view2)) + 1)) * xVar.a());
    }
}
