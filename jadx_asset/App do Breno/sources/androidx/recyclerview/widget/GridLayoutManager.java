package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f5153F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f5154G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final SparseIntArray f5155H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final SparseIntArray f5156I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public c f5157J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final Rect f5158K;

    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int b(int i4) {
            return 1;
        }
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SparseIntArray f5161a = new SparseIntArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5162b = false;

        public int a(int i4, int i5) {
            int iB = b(i4);
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i4; i8++) {
                int iB2 = b(i8);
                i6 += iB2;
                if (i6 == i5) {
                    i7++;
                    i6 = 0;
                } else if (i6 > i5) {
                    i7++;
                    i6 = iB2;
                }
            }
            return i6 + iB > i5 ? i7 + 1 : i7;
        }

        public abstract int b(int i4);

        public void c() {
            this.f5161a.clear();
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f5153F = false;
        this.f5154G = -1;
        this.f5155H = new SparseIntArray();
        this.f5156I = new SparseIntArray();
        this.f5157J = new a();
        this.f5158K = new Rect();
        V0(RecyclerView.n.J(context, attributeSet, i4, i5).f5301b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public boolean E0() {
        return this.f5164B == null && !this.f5153F;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int L(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.f5168q == 0) {
            return this.f5154G;
        }
        if (xVar.a() < 1) {
            return 0;
        }
        return U0(tVar, xVar, xVar.a() - 1) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void T0(boolean z3) {
        if (z3) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.T0(false);
    }

    public final int U0(RecyclerView.t tVar, RecyclerView.x xVar, int i4) {
        if (!xVar.b()) {
            return this.f5157J.a(i4, this.f5154G);
        }
        int iD = tVar.d(i4);
        if (iD != -1) {
            return this.f5157J.a(iD, this.f5154G);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i4);
        return 0;
    }

    public void V0(int i4) {
        if (i4 == this.f5154G) {
            return;
        }
        this.f5153F = true;
        if (i4 >= 1) {
            this.f5154G = i4;
            this.f5157J.c();
            A0();
        } else {
            throw new IllegalArgumentException("Span count should be at least 1. Provided " + i4);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean d(RecyclerView.o oVar) {
        return oVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void f0(RecyclerView recyclerView, int i4, int i5) {
        this.f5157J.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void g0(RecyclerView recyclerView) {
        this.f5157J.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void h0(RecyclerView recyclerView, int i4, int i5, int i6) {
        this.f5157J.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void i0(RecyclerView recyclerView, int i4, int i5) {
        this.f5157J.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k0(RecyclerView recyclerView, int i4, int i5, Object obj) {
        this.f5157J.c();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o n() {
        return this.f5168q == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o o(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public RecyclerView.o p(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public int v(RecyclerView.t tVar, RecyclerView.x xVar) {
        if (this.f5168q == 1) {
            return this.f5154G;
        }
        if (xVar.a() < 1) {
            return 0;
        }
        return U0(tVar, xVar, xVar.a() - 1) + 1;
    }

    public static class b extends RecyclerView.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5160e;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5159d = -1;
            this.f5160e = 0;
        }

        public b(int i4, int i5) {
            super(i4, i5);
            this.f5159d = -1;
            this.f5160e = 0;
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5159d = -1;
            this.f5160e = 0;
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5159d = -1;
            this.f5160e = 0;
        }
    }
}
