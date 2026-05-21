package androidx.recyclerview.widget;

import C.AbstractC0230m;
import C.AbstractC0241y;
import C.C;
import C.C0231n;
import D.t;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.m;
import d0.AbstractC0911a;
import d0.AbstractC0912b;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public static final Class[] f5194E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public static final Interpolator f5195F0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AccessibilityManager f5200A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public List f5201B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f5202C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f5203D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f5204E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f5205F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public j f5206G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public EdgeEffect f5207H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public EdgeEffect f5208I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public EdgeEffect f5209J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public EdgeEffect f5210K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public k f5211L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f5212M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public int f5213N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public VelocityTracker f5214O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public int f5215P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public int f5216Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f5217R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public int f5218S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public int f5219T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public final int f5220U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final int f5221V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public float f5222W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f5223a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5224b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f5225b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f5226c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final z f5227c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w f5228d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public androidx.recyclerview.widget.e f5229d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f5230e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public e.b f5231e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.recyclerview.widget.b f5232f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final x f5233f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.recyclerview.widget.m f5234g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public r f5235g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5236h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public List f5237h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f5238i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f5239i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Rect f5240j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public boolean f5241j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f5242k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public k.a f5243k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RectF f5244l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f5245l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n f5246m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public androidx.recyclerview.widget.i f5247m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f5248n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final int[] f5249n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f5250o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public C0231n f5251o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public q f5252p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int[] f5253p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f5254q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int[] f5255q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f5256r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int[] f5257r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f5258s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final int[] f5259s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f5260t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final List f5261t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f5262u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Runnable f5263u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f5264v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final m.b f5265v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f5266w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f5267x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f5268y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f5269z;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final int[] f5196w0 = {R.attr.nestedScrollingEnabled};

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int[] f5197x0 = {R.attr.clipToPadding};

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final boolean f5198y0 = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final boolean f5199z0 = true;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public static final boolean f5190A0 = true;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public static final boolean f5191B0 = true;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public static final boolean f5192C0 = false;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public static final boolean f5193D0 = false;

    public static abstract class A {
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.RecyclerView$a, reason: case insensitive filesystem */
    public class RunnableC0612a implements Runnable {
        public RunnableC0612a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.f5260t || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.f5254q) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.f5266w) {
                recyclerView2.f5264v = true;
            } else {
                recyclerView2.k();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = RecyclerView.this.f5211L;
            if (kVar != null) {
                kVar.i();
            }
            RecyclerView.this.f5245l0 = false;
        }
    }

    public static class c implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (f5 * f5 * f5 * f5 * f5) + 1.0f;
        }
    }

    public class d implements m.b {
        public d() {
        }
    }

    public class e implements b.InterfaceC0102b {
        public e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0102b
        public View a(int i4) {
            return RecyclerView.this.getChildAt(i4);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0102b
        public A b(View view) {
            RecyclerView.E(view);
            return null;
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0102b
        public void c(int i4) {
            View viewA = a(i4);
            if (viewA != null) {
                RecyclerView.E(viewA);
            }
            RecyclerView.this.detachViewFromParent(i4);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0102b
        public void d(View view) {
            RecyclerView.E(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0102b
        public int e() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0102b
        public void f() {
            int iE = e();
            for (int i4 = 0; i4 < iE; i4++) {
                View viewA = a(i4);
                RecyclerView.this.n(viewA);
                viewA.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0102b
        public int g(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    public class f implements a.InterfaceC0101a {
        public f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0101a
        public void a(int i4, int i5) {
            RecyclerView.this.V(i4, i5);
            RecyclerView.this.f5239i0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0101a
        public void b(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0101a
        public A c(int i4) {
            RecyclerView.this.C(i4, true);
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0101a
        public void d(int i4, int i5) {
            RecyclerView.this.W(i4, i5, false);
            RecyclerView.this.f5239i0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0101a
        public void e(int i4, int i5) {
            RecyclerView.this.U(i4, i5);
            RecyclerView.this.f5239i0 = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0101a
        public void f(int i4, int i5) {
            RecyclerView.this.W(i4, i5, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.f5239i0 = true;
            recyclerView.f5233f0.f5323d += i5;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0101a
        public void g(a.b bVar) {
            i(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0101a
        public void h(int i4, int i5, Object obj) {
            RecyclerView.this.z0(i4, i5, obj);
            RecyclerView.this.f5241j0 = true;
        }

        public void i(a.b bVar) {
            int i4 = bVar.f5400a;
            if (i4 == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.f5246m.f0(recyclerView, bVar.f5401b, bVar.f5403d);
                return;
            }
            if (i4 == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.f5246m.i0(recyclerView2, bVar.f5401b, bVar.f5403d);
            } else if (i4 == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.f5246m.k0(recyclerView3, bVar.f5401b, bVar.f5403d, bVar.f5402c);
            } else {
                if (i4 != 8) {
                    return;
                }
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.f5246m.h0(recyclerView4, bVar.f5401b, bVar.f5403d, 1);
            }
        }
    }

    public static abstract class g {
    }

    public static abstract class h {
    }

    public interface i {
    }

    public static class j {
        public EdgeEffect a(RecyclerView recyclerView, int i4) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f5275a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f5276b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f5277c = 120;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f5278d = 120;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f5279e = 250;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f5280f = 250;

        public interface a {
            void a(A a4);
        }

        public final void a(A a4) {
            h(a4);
            a aVar = this.f5275a;
            if (aVar != null) {
                aVar.a(a4);
            }
        }

        public final void b() {
            if (this.f5276b.size() <= 0) {
                this.f5276b.clear();
            } else {
                i.d.a(this.f5276b.get(0));
                throw null;
            }
        }

        public abstract void c();

        public long d() {
            return this.f5280f;
        }

        public long e() {
            return this.f5279e;
        }

        public long f() {
            return this.f5278d;
        }

        public abstract boolean g();

        public void h(A a4) {
        }

        public abstract void i();

        public void j(a aVar) {
            this.f5275a = aVar;
        }
    }

    public class l implements k.a {
        public l() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.k.a
        public void a(A a4) {
            throw null;
        }
    }

    public static abstract class m {
        public void d(Canvas canvas, RecyclerView recyclerView) {
        }

        public void e(Canvas canvas, RecyclerView recyclerView, x xVar) {
            d(canvas, recyclerView);
        }

        public abstract void f(Canvas canvas, RecyclerView recyclerView, x xVar);
    }

    public static abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.recyclerview.widget.b f5282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public RecyclerView f5283b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l.b f5284c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final l.b f5285d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public androidx.recyclerview.widget.l f5286e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public androidx.recyclerview.widget.l f5287f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f5288g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f5289h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f5290i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f5291j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f5292k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f5293l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f5294m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5295n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f5296o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f5297p;

        public class a implements l.b {
            public a() {
            }

            @Override // androidx.recyclerview.widget.l.b
            public View a(int i4) {
                return n.this.s(i4);
            }

            @Override // androidx.recyclerview.widget.l.b
            public int b() {
                return n.this.O() - n.this.G();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int c(View view) {
                return n.this.y(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.l.b
            public int d() {
                return n.this.F();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int e(View view) {
                return n.this.z(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).rightMargin;
            }
        }

        public class b implements l.b {
            public b() {
            }

            @Override // androidx.recyclerview.widget.l.b
            public View a(int i4) {
                return n.this.s(i4);
            }

            @Override // androidx.recyclerview.widget.l.b
            public int b() {
                return n.this.B() - n.this.E();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int c(View view) {
                return n.this.A(view) - ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.l.b
            public int d() {
                return n.this.H();
            }

            @Override // androidx.recyclerview.widget.l.b
            public int e(View view) {
                return n.this.w(view) + ((ViewGroup.MarginLayoutParams) ((o) view.getLayoutParams())).bottomMargin;
            }
        }

        public static class c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5300a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f5301b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f5302c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f5303d;
        }

        public n() {
            a aVar = new a();
            this.f5284c = aVar;
            b bVar = new b();
            this.f5285d = bVar;
            this.f5286e = new androidx.recyclerview.widget.l(aVar);
            this.f5287f = new androidx.recyclerview.widget.l(bVar);
            this.f5288g = false;
            this.f5289h = false;
            this.f5290i = false;
            this.f5291j = true;
            this.f5292k = true;
        }

        public static c J(Context context, AttributeSet attributeSet, int i4, int i5) {
            c cVar = new c();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0912b.f7131h, i4, i5);
            cVar.f5300a = typedArrayObtainStyledAttributes.getInt(AbstractC0912b.f7132i, 1);
            cVar.f5301b = typedArrayObtainStyledAttributes.getInt(AbstractC0912b.f7141r, 1);
            cVar.f5302c = typedArrayObtainStyledAttributes.getBoolean(AbstractC0912b.f7140q, false);
            cVar.f5303d = typedArrayObtainStyledAttributes.getBoolean(AbstractC0912b.f7142s, false);
            typedArrayObtainStyledAttributes.recycle();
            return cVar;
        }

        public static int e(int i4, int i5, int i6) {
            int mode = View.MeasureSpec.getMode(i4);
            int size = View.MeasureSpec.getSize(i4);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i5, i6) : size : Math.min(size, Math.max(i5, i6));
        }

        public int A(View view) {
            return view.getTop() - N(view);
        }

        public void A0() {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int B() {
            return this.f5297p;
        }

        public void B0() {
            this.f5288g = true;
        }

        public int C() {
            return AbstractC0241y.l(this.f5283b);
        }

        public void C0(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.f5283b = null;
                this.f5282a = null;
                this.f5296o = 0;
                this.f5297p = 0;
            } else {
                this.f5283b = recyclerView;
                this.f5282a = recyclerView.f5232f;
                this.f5296o = recyclerView.getWidth();
                this.f5297p = recyclerView.getHeight();
            }
            this.f5294m = 1073741824;
            this.f5295n = 1073741824;
        }

        public int D(View view) {
            return ((o) view.getLayoutParams()).f5304a.left;
        }

        public void D0() {
        }

        public int E() {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public abstract boolean E0();

        public int F() {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int G() {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int H() {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int I(View view) {
            return ((o) view.getLayoutParams()).a();
        }

        public int K(View view) {
            return ((o) view.getLayoutParams()).f5304a.right;
        }

        public int L(t tVar, x xVar) {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView == null) {
                return 1;
            }
            recyclerView.getClass();
            return 1;
        }

        public int M(t tVar, x xVar) {
            return 0;
        }

        public int N(View view) {
            return ((o) view.getLayoutParams()).f5304a.top;
        }

        public int O() {
            return this.f5296o;
        }

        public boolean P() {
            return this.f5289h;
        }

        public abstract boolean Q();

        public final boolean R(RecyclerView recyclerView, int i4, int i5) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int iF = F();
            int iH = H();
            int iO = O() - G();
            int iB = B() - E();
            Rect rect = this.f5283b.f5240j;
            x(focusedChild, rect);
            return rect.left - i4 < iO && rect.right - i4 > iF && rect.top - i5 < iB && rect.bottom - i5 > iH;
        }

        public boolean S(t tVar, x xVar) {
            return false;
        }

        public boolean T() {
            return false;
        }

        public void U(g gVar, g gVar2) {
        }

        public boolean V(RecyclerView recyclerView, ArrayList arrayList, int i4, int i5) {
            return false;
        }

        public void W(RecyclerView recyclerView) {
        }

        public void X(RecyclerView recyclerView) {
        }

        public void Y(RecyclerView recyclerView, t tVar) {
            X(recyclerView);
        }

        public void Z(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5283b;
            a0(recyclerView.f5226c, recyclerView.f5233f0, accessibilityEvent);
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView != null) {
                recyclerView.g(str);
            }
        }

        public void a0(t tVar, x xVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z3 = true;
            if (!recyclerView.canScrollVertically(1) && !this.f5283b.canScrollVertically(-1) && !this.f5283b.canScrollHorizontally(-1) && !this.f5283b.canScrollHorizontally(1)) {
                z3 = false;
            }
            accessibilityEvent.setScrollable(z3);
            this.f5283b.getClass();
        }

        public abstract boolean b();

        public void b0(D.t tVar) {
            RecyclerView recyclerView = this.f5283b;
            c0(recyclerView.f5226c, recyclerView.f5233f0, tVar);
        }

        public abstract boolean c();

        public void c0(t tVar, x xVar, D.t tVar2) {
            if (this.f5283b.canScrollVertically(-1) || this.f5283b.canScrollHorizontally(-1)) {
                tVar2.a(8192);
                tVar2.b0(true);
            }
            if (this.f5283b.canScrollVertically(1) || this.f5283b.canScrollHorizontally(1)) {
                tVar2.a(4096);
                tVar2.b0(true);
            }
            tVar2.X(t.e.a(L(tVar, xVar), v(tVar, xVar), S(tVar, xVar), M(tVar, xVar)));
        }

        public boolean d(o oVar) {
            return oVar != null;
        }

        public void d0(View view, D.t tVar) {
            RecyclerView.E(view);
        }

        public View e0(View view, int i4) {
            return null;
        }

        public abstract int f(x xVar);

        public void f0(RecyclerView recyclerView, int i4, int i5) {
        }

        public abstract int g(x xVar);

        public void g0(RecyclerView recyclerView) {
        }

        public abstract int h(x xVar);

        public void h0(RecyclerView recyclerView, int i4, int i5, int i6) {
        }

        public abstract int i(x xVar);

        public void i0(RecyclerView recyclerView, int i4, int i5) {
        }

        public abstract int j(x xVar);

        public void j0(RecyclerView recyclerView, int i4, int i5) {
        }

        public abstract int k(x xVar);

        public void k0(RecyclerView recyclerView, int i4, int i5, Object obj) {
            j0(recyclerView, i4, i5);
        }

        public void l(RecyclerView recyclerView) {
            this.f5289h = true;
            W(recyclerView);
        }

        public void l0(t tVar, x xVar, int i4, int i5) {
            this.f5283b.m(i4, i5);
        }

        public void m(RecyclerView recyclerView, t tVar) {
            this.f5289h = false;
            Y(recyclerView, tVar);
        }

        public boolean m0(RecyclerView recyclerView, View view, View view2) {
            return T() || recyclerView.Q();
        }

        public abstract o n();

        public boolean n0(RecyclerView recyclerView, x xVar, View view, View view2) {
            return m0(recyclerView, view, view2);
        }

        public o o(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public abstract void o0(Parcelable parcelable);

        public o p(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof o ? new o((o) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new o((ViewGroup.MarginLayoutParams) layoutParams) : new o(layoutParams);
        }

        public abstract Parcelable p0();

        public int q() {
            return -1;
        }

        public void q0(int i4) {
        }

        public int r(View view) {
            return ((o) view.getLayoutParams()).f5304a.bottom;
        }

        public boolean r0(int i4, Bundle bundle) {
            RecyclerView recyclerView = this.f5283b;
            return s0(recyclerView.f5226c, recyclerView.f5233f0, i4, bundle);
        }

        public View s(int i4) {
            androidx.recyclerview.widget.b bVar = this.f5282a;
            if (bVar != null) {
                return bVar.c(i4);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0042 A[PHI: r2
          0x0042: PHI (r2v8 int) = (r2v4 int), (r2v12 int) binds: [B:23:0x0060, B:15:0x0030] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean s0(androidx.recyclerview.widget.RecyclerView.t r2, androidx.recyclerview.widget.RecyclerView.x r3, int r4, android.os.Bundle r5) {
            /*
                r1 = this;
                androidx.recyclerview.widget.RecyclerView r2 = r1.f5283b
                r3 = 0
                if (r2 != 0) goto L6
                return r3
            L6:
                r5 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r4 == r5) goto L44
                r5 = 8192(0x2000, float:1.148E-41)
                if (r4 == r5) goto L12
                r2 = r3
                r4 = r2
                goto L70
            L12:
                r4 = -1
                boolean r2 = r2.canScrollVertically(r4)
                if (r2 == 0) goto L29
                int r2 = r1.B()
                int r5 = r1.H()
                int r2 = r2 - r5
                int r5 = r1.E()
                int r2 = r2 - r5
                int r2 = -r2
                goto L2a
            L29:
                r2 = r3
            L2a:
                androidx.recyclerview.widget.RecyclerView r5 = r1.f5283b
                boolean r4 = r5.canScrollHorizontally(r4)
                if (r4 == 0) goto L42
                int r4 = r1.O()
                int r5 = r1.F()
                int r4 = r4 - r5
                int r5 = r1.G()
                int r4 = r4 - r5
                int r4 = -r4
                goto L70
            L42:
                r4 = r3
                goto L70
            L44:
                boolean r2 = r2.canScrollVertically(r0)
                if (r2 == 0) goto L59
                int r2 = r1.B()
                int r4 = r1.H()
                int r2 = r2 - r4
                int r4 = r1.E()
                int r2 = r2 - r4
                goto L5a
            L59:
                r2 = r3
            L5a:
                androidx.recyclerview.widget.RecyclerView r4 = r1.f5283b
                boolean r4 = r4.canScrollHorizontally(r0)
                if (r4 == 0) goto L42
                int r4 = r1.O()
                int r5 = r1.F()
                int r4 = r4 - r5
                int r5 = r1.G()
                int r4 = r4 - r5
            L70:
                if (r2 != 0) goto L75
                if (r4 != 0) goto L75
                return r3
            L75:
                androidx.recyclerview.widget.RecyclerView r3 = r1.f5283b
                r3.r0(r4, r2)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.s0(androidx.recyclerview.widget.RecyclerView$t, androidx.recyclerview.widget.RecyclerView$x, int, android.os.Bundle):boolean");
        }

        public int t() {
            androidx.recyclerview.widget.b bVar = this.f5282a;
            if (bVar != null) {
                return bVar.d();
            }
            return 0;
        }

        public boolean t0(View view, int i4, Bundle bundle) {
            RecyclerView recyclerView = this.f5283b;
            return u0(recyclerView.f5226c, recyclerView.f5233f0, view, i4, bundle);
        }

        public final int[] u(RecyclerView recyclerView, View view, Rect rect, boolean z3) {
            int iF = F();
            int iH = H();
            int iO = O() - G();
            int iB = B() - E();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int iWidth = rect.width() + left;
            int iHeight = rect.height() + top;
            int i4 = left - iF;
            int iMin = Math.min(0, i4);
            int i5 = top - iH;
            int iMin2 = Math.min(0, i5);
            int i6 = iWidth - iO;
            int iMax = Math.max(0, i6);
            int iMax2 = Math.max(0, iHeight - iB);
            if (C() != 1) {
                if (iMin == 0) {
                    iMin = Math.min(i4, iMax);
                }
                iMax = iMin;
            } else if (iMax == 0) {
                iMax = Math.max(iMin, i6);
            }
            if (iMin2 == 0) {
                iMin2 = Math.min(i5, iMax2);
            }
            return new int[]{iMax, iMin2};
        }

        public boolean u0(t tVar, x xVar, View view, int i4, Bundle bundle) {
            return false;
        }

        public int v(t tVar, x xVar) {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView == null) {
                return 1;
            }
            recyclerView.getClass();
            return 1;
        }

        public void v0(t tVar) {
            int iT = t() - 1;
            if (iT < 0) {
                return;
            }
            RecyclerView.E(s(iT));
            throw null;
        }

        public int w(View view) {
            return view.getBottom() + r(view);
        }

        public void w0(t tVar) {
            int iG = tVar.g();
            int i4 = iG - 1;
            if (i4 >= 0) {
                RecyclerView.E(tVar.i(i4));
                throw null;
            }
            tVar.c();
            if (iG > 0) {
                this.f5283b.invalidate();
            }
        }

        public void x(View view, Rect rect) {
            RecyclerView.F(view, rect);
        }

        public boolean x0(Runnable runnable) {
            RecyclerView recyclerView = this.f5283b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int y(View view) {
            return view.getLeft() - D(view);
        }

        public boolean y0(RecyclerView recyclerView, View view, Rect rect, boolean z3) {
            return z0(recyclerView, view, rect, z3, false);
        }

        public int z(View view) {
            return view.getRight() + K(view);
        }

        public boolean z0(RecyclerView recyclerView, View view, Rect rect, boolean z3, boolean z4) {
            int[] iArrU = u(recyclerView, view, rect, z3);
            int i4 = iArrU[0];
            int i5 = iArrU[1];
            if ((z4 && !R(recyclerView, i4, i5)) || (i4 == 0 && i5 == 0)) {
                return false;
            }
            if (z3) {
                recyclerView.scrollBy(i4, i5);
            } else {
                recyclerView.r0(i4, i5);
            }
            return true;
        }
    }

    public static abstract class p {
    }

    public interface q {
        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);

        void c(boolean z3);
    }

    public static abstract class r {
        public void a(RecyclerView recyclerView, int i4) {
        }
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SparseArray f5307a = new SparseArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5308b = 0;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ArrayList f5309a;
        }

        public void a() {
            for (int i4 = 0; i4 < this.f5307a.size(); i4++) {
                ((a) this.f5307a.valueAt(i4)).f5309a.clear();
            }
        }

        public void b() {
            this.f5308b--;
        }

        public void c(g gVar, g gVar2, boolean z3) {
            if (z3 || this.f5308b != 0) {
                return;
            }
            a();
        }
    }

    public final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f5310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ArrayList f5311b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f5312c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f5313d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5315f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public s f5316g;

        public t() {
            ArrayList arrayList = new ArrayList();
            this.f5310a = arrayList;
            this.f5311b = null;
            this.f5312c = new ArrayList();
            this.f5313d = Collections.unmodifiableList(arrayList);
            this.f5314e = 2;
            this.f5315f = 2;
        }

        public void a(A a4, boolean z3) {
            RecyclerView.i(a4);
            throw null;
        }

        public void b() {
            this.f5310a.clear();
            p();
        }

        public void c() {
            this.f5310a.clear();
            ArrayList arrayList = this.f5311b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        public int d(int i4) {
            if (i4 >= 0 && i4 < RecyclerView.this.f5233f0.a()) {
                return !RecyclerView.this.f5233f0.b() ? i4 : RecyclerView.this.f5230e.l(i4);
            }
            throw new IndexOutOfBoundsException("invalid position " + i4 + ". State item count is " + RecyclerView.this.f5233f0.a() + RecyclerView.this.A());
        }

        public A e(int i4) {
            int size;
            ArrayList arrayList = this.f5311b;
            if (arrayList == null || (size = arrayList.size()) == 0) {
                return null;
            }
            if (size > 0) {
                i.d.a(this.f5311b.get(0));
                throw null;
            }
            RecyclerView.this.getClass();
            throw null;
        }

        public s f() {
            if (this.f5316g == null) {
                this.f5316g = new s();
            }
            return this.f5316g;
        }

        public int g() {
            return this.f5310a.size();
        }

        public A h(int i4, boolean z3) {
            View viewB;
            if (this.f5310a.size() > 0) {
                i.d.a(this.f5310a.get(0));
                throw null;
            }
            if (z3 || (viewB = RecyclerView.this.f5232f.b(i4)) == null) {
                if (this.f5312c.size() <= 0) {
                    return null;
                }
                i.d.a(this.f5312c.get(0));
                throw null;
            }
            RecyclerView.E(viewB);
            RecyclerView.this.f5232f.j(viewB);
            int iH = RecyclerView.this.f5232f.h(viewB);
            if (iH != -1) {
                RecyclerView.this.f5232f.a(iH);
                r(viewB);
                throw null;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + ((Object) null) + RecyclerView.this.A());
        }

        public View i(int i4) {
            i.d.a(this.f5310a.get(i4));
            throw null;
        }

        public void j() {
            if (this.f5312c.size() <= 0) {
                return;
            }
            i.d.a(this.f5312c.get(0));
            throw null;
        }

        public void k() {
            int size = this.f5312c.size();
            for (int i4 = 0; i4 < size; i4++) {
                i.d.a(this.f5312c.get(i4));
            }
            RecyclerView.this.getClass();
            p();
        }

        public void l(int i4, int i5) {
            int size = this.f5312c.size();
            for (int i6 = 0; i6 < size; i6++) {
                i.d.a(this.f5312c.get(i6));
            }
        }

        public void m(int i4, int i5) {
            int size = this.f5312c.size();
            for (int i6 = 0; i6 < size; i6++) {
                i.d.a(this.f5312c.get(i6));
            }
        }

        public void n(int i4, int i5, boolean z3) {
            for (int size = this.f5312c.size() - 1; size >= 0; size--) {
                i.d.a(this.f5312c.get(size));
            }
        }

        public void o(g gVar, g gVar2, boolean z3) {
            b();
            f().c(gVar, gVar2, z3);
        }

        public void p() {
            for (int size = this.f5312c.size() - 1; size >= 0; size--) {
                q(size);
            }
            this.f5312c.clear();
            if (RecyclerView.f5191B0) {
                RecyclerView.this.f5231e0.a();
            }
        }

        public void q(int i4) {
            i.d.a(this.f5312c.get(i4));
            a(null, true);
            this.f5312c.remove(i4);
        }

        public void r(View view) {
            RecyclerView.E(view);
            throw null;
        }

        public void s(s sVar) {
            s sVar2 = this.f5316g;
            if (sVar2 != null) {
                sVar2.b();
            }
            this.f5316g = sVar;
            if (sVar != null) {
                RecyclerView.this.getAdapter();
            }
        }

        public void t(y yVar) {
        }

        public void u(int i4) {
            this.f5314e = i4;
            w();
        }

        public A v(int i4, boolean z3, long j4) {
            if (i4 < 0 || i4 >= RecyclerView.this.f5233f0.a()) {
                throw new IndexOutOfBoundsException("Invalid item position " + i4 + "(" + i4 + "). Item count:" + RecyclerView.this.f5233f0.a() + RecyclerView.this.A());
            }
            if (RecyclerView.this.f5233f0.b()) {
                e(i4);
            }
            h(i4, z3);
            int iL = RecyclerView.this.f5230e.l(i4);
            if (iL >= 0) {
                RecyclerView.this.getClass();
                throw null;
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i4 + "(offset:" + iL + ").state:" + RecyclerView.this.f5233f0.a() + RecyclerView.this.A());
        }

        public void w() {
            n nVar = RecyclerView.this.f5246m;
            this.f5315f = this.f5314e + (nVar != null ? nVar.f5293l : 0);
            for (int size = this.f5312c.size() - 1; size >= 0 && this.f5312c.size() > this.f5315f; size--) {
                q(size);
            }
        }

        public void x(int i4, int i5) {
            for (int size = this.f5312c.size() - 1; size >= 0; size--) {
                i.d.a(this.f5312c.get(size));
            }
        }
    }

    public interface u {
    }

    public class v extends h {
        public v() {
        }
    }

    public static class x {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseArray f5321b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5320a = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5322c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5323d = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5324e = 1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5325f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f5326g = false;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f5327h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f5328i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f5329j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f5330k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f5331l = false;

        public int a() {
            return this.f5327h ? this.f5322c - this.f5323d : this.f5325f;
        }

        public boolean b() {
            return this.f5327h;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f5320a + ", mData=" + this.f5321b + ", mItemCount=" + this.f5325f + ", mIsMeasuring=" + this.f5329j + ", mPreviousLayoutItemCount=" + this.f5322c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f5323d + ", mStructureChanged=" + this.f5326g + ", mInPreLayout=" + this.f5327h + ", mRunSimpleAnimations=" + this.f5330k + ", mRunPredictiveAnimations=" + this.f5331l + '}';
        }
    }

    public static abstract class y {
    }

    public class z implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f5332m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f5333n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public OverScroller f5334o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Interpolator f5335p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f5336q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f5337r;

        public z() {
            Interpolator interpolator = RecyclerView.f5195F0;
            this.f5335p = interpolator;
            this.f5336q = false;
            this.f5337r = false;
            this.f5334o = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public final int a(int i4, int i5, int i6, int i7) {
            int iRound;
            int iAbs = Math.abs(i4);
            int iAbs2 = Math.abs(i5);
            boolean z3 = iAbs > iAbs2;
            int iSqrt = (int) Math.sqrt((i6 * i6) + (i7 * i7));
            int iSqrt2 = (int) Math.sqrt((i4 * i4) + (i5 * i5));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z3 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i8 = width / 2;
            float f4 = width;
            float f5 = i8;
            float fC = f5 + (c(Math.min(1.0f, (iSqrt2 * 1.0f) / f4)) * f5);
            if (iSqrt > 0) {
                iRound = Math.round(Math.abs(fC / iSqrt) * 1000.0f) * 4;
            } else {
                if (!z3) {
                    iAbs = iAbs2;
                }
                iRound = (int) (((iAbs / f4) + 1.0f) * 300.0f);
            }
            return Math.min(iRound, 2000);
        }

        public final void b() {
            this.f5337r = false;
            this.f5336q = true;
        }

        public final float c(float f4) {
            return (float) Math.sin((f4 - 0.5f) * 0.47123894f);
        }

        public final void d() {
            this.f5336q = false;
            if (this.f5337r) {
                f();
            }
        }

        public void e(int i4, int i5) {
            RecyclerView.this.setScrollState(2);
            this.f5333n = 0;
            this.f5332m = 0;
            this.f5334o.fling(0, 0, i4, i5, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
            f();
        }

        public void f() {
            if (this.f5336q) {
                this.f5337r = true;
            } else {
                RecyclerView.this.removeCallbacks(this);
                AbstractC0241y.B(RecyclerView.this, this);
            }
        }

        public void g(int i4, int i5, int i6, Interpolator interpolator) {
            if (this.f5335p != interpolator) {
                this.f5335p = interpolator;
                this.f5334o = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.f5333n = 0;
            this.f5332m = 0;
            this.f5334o.startScroll(0, 0, i4, i5, i6);
            f();
        }

        public void h(int i4, int i5, Interpolator interpolator) {
            int iA = a(i4, i5, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.f5195F0;
            }
            g(i4, i5, iA, interpolator);
        }

        public void i() {
            RecyclerView.this.removeCallbacks(this);
            this.f5334o.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (RecyclerView.this.f5246m == null) {
                i();
                return;
            }
            b();
            RecyclerView.this.k();
            OverScroller overScroller = this.f5334o;
            RecyclerView.this.f5246m.getClass();
            if (overScroller.computeScrollOffset()) {
                int[] iArr = RecyclerView.this.f5255q0;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i4 = currX - this.f5332m;
                int i5 = currY - this.f5333n;
                this.f5332m = currX;
                this.f5333n = currY;
                if (RecyclerView.this.q(i4, i5, iArr, null, 1)) {
                    i4 -= iArr[0];
                    i5 -= iArr[1];
                }
                RecyclerView.this.getClass();
                if (!RecyclerView.this.f5248n.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.j(i4, i5);
                }
                RecyclerView.this.r(0, 0, 0, 0, null, 1);
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z3 = (i4 == 0 && i5 == 0) || (i4 != 0 && RecyclerView.this.f5246m.b() && i4 == 0) || (i5 != 0 && RecyclerView.this.f5246m.c() && i5 == 0);
                if (overScroller.isFinished() || !(z3 || RecyclerView.this.H(1))) {
                    RecyclerView.this.setScrollState(0);
                    if (RecyclerView.f5191B0) {
                        RecyclerView.this.f5231e0.a();
                    }
                    RecyclerView.this.w0(1);
                } else {
                    f();
                    RecyclerView recyclerView = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView.f5229d0;
                    if (eVar != null) {
                        eVar.f(recyclerView, i4, i5);
                    }
                }
            }
            d();
        }
    }

    static {
        Class cls = Integer.TYPE;
        f5194E0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        f5195F0 = new c();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static A E(View view) {
        if (view == null) {
            return null;
        }
        ((o) view.getLayoutParams()).getClass();
        return null;
    }

    public static void F(View view, Rect rect) {
        o oVar = (o) view.getLayoutParams();
        Rect rect2 = oVar.f5304a;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) oVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) oVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) oVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) oVar).bottomMargin);
    }

    private C0231n getScrollingChildHelper() {
        if (this.f5251o0 == null) {
            this.f5251o0 = new C0231n(this);
        }
        return this.f5251o0;
    }

    public static void i(A a4) {
        throw null;
    }

    public String A() {
        return " " + super.toString() + ", adapter:" + ((Object) null) + ", layout:" + this.f5246m + ", context:" + getContext();
    }

    public View B(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public A C(int i4, boolean z3) {
        int iG = this.f5232f.g();
        for (int i5 = 0; i5 < iG; i5++) {
            E(this.f5232f.f(i5));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean D(int i4, int i5) {
        n nVar = this.f5246m;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        }
        if (this.f5266w) {
            return false;
        }
        boolean zB = nVar.b();
        boolean zC = this.f5246m.c();
        if (!zB || Math.abs(i4) < this.f5220U) {
            i4 = 0;
        }
        if (!zC || Math.abs(i5) < this.f5220U) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return false;
        }
        float f4 = i4;
        float f5 = i5;
        if (!dispatchNestedPreFling(f4, f5)) {
            boolean z3 = zB || zC;
            dispatchNestedFling(f4, f5, z3);
            int i6 = zB;
            if (z3) {
                if (zC) {
                    i6 = (zB ? 1 : 0) | 2;
                }
                u0(i6, 1);
                int i7 = this.f5221V;
                int iMax = Math.max(-i7, Math.min(i4, i7));
                int i8 = this.f5221V;
                this.f5227c0.e(iMax, Math.max(-i8, Math.min(i5, i8)));
                return true;
            }
        }
        return false;
    }

    public final String G(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    public boolean H(int i4) {
        return getScrollingChildHelper().l(i4);
    }

    public boolean I() {
        return !this.f5260t || this.f5202C || this.f5230e.o();
    }

    public final boolean J() {
        int iD = this.f5232f.d();
        for (int i4 = 0; i4 < iD; i4++) {
            E(this.f5232f.c(i4));
        }
        return false;
    }

    public void K() {
        this.f5230e = new a(new f());
    }

    public final void L() {
        if (AbstractC0241y.k(this) == 0) {
            AbstractC0241y.N(this, 8);
        }
    }

    public final void M() {
        this.f5232f = new androidx.recyclerview.widget.b(new e());
    }

    public void N(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(AbstractC0911a.f7121a), resources.getDimensionPixelSize(AbstractC0911a.f7123c), resources.getDimensionPixelOffset(AbstractC0911a.f7122b));
        } else {
            throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + A());
        }
    }

    public void O() {
        this.f5210K = null;
        this.f5208I = null;
        this.f5209J = null;
        this.f5207H = null;
    }

    public boolean P() {
        AccessibilityManager accessibilityManager = this.f5200A;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean Q() {
        return this.f5204E > 0;
    }

    public final boolean R(View view, View view2, int i4) {
        int i5;
        if (view2 == null || view2 == this || B(view2) == null) {
            return false;
        }
        if (view == null || B(view) == null) {
            return true;
        }
        this.f5240j.set(0, 0, view.getWidth(), view.getHeight());
        this.f5242k.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.f5240j);
        offsetDescendantRectToMyCoords(view2, this.f5242k);
        byte b4 = -1;
        int i6 = this.f5246m.C() == 1 ? -1 : 1;
        Rect rect = this.f5240j;
        int i7 = rect.left;
        Rect rect2 = this.f5242k;
        int i8 = rect2.left;
        if ((i7 < i8 || rect.right <= i8) && rect.right < rect2.right) {
            i5 = 1;
        } else {
            int i9 = rect.right;
            int i10 = rect2.right;
            i5 = ((i9 > i10 || i7 >= i10) && i7 > i8) ? -1 : 0;
        }
        int i11 = rect.top;
        int i12 = rect2.top;
        if ((i11 < i12 || rect.bottom <= i12) && rect.bottom < rect2.bottom) {
            b4 = 1;
        } else {
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if ((i13 <= i14 && i11 < i14) || i11 <= i12) {
                b4 = 0;
            }
        }
        if (i4 == 1) {
            return b4 < 0 || (b4 == 0 && i5 * i6 <= 0);
        }
        if (i4 == 2) {
            return b4 > 0 || (b4 == 0 && i5 * i6 >= 0);
        }
        if (i4 == 17) {
            return i5 < 0;
        }
        if (i4 == 33) {
            return b4 < 0;
        }
        if (i4 == 66) {
            return i5 > 0;
        }
        if (i4 == 130) {
            return b4 > 0;
        }
        throw new IllegalArgumentException("Invalid direction: " + i4 + A());
    }

    public void S() {
        int iG = this.f5232f.g();
        for (int i4 = 0; i4 < iG; i4++) {
            ((o) this.f5232f.f(i4).getLayoutParams()).f5305b = true;
        }
        this.f5226c.j();
    }

    public void T() {
        int iG = this.f5232f.g();
        for (int i4 = 0; i4 < iG; i4++) {
            E(this.f5232f.f(i4));
        }
        S();
        this.f5226c.k();
    }

    public void U(int i4, int i5) {
        int iG = this.f5232f.g();
        for (int i6 = 0; i6 < iG; i6++) {
            E(this.f5232f.f(i6));
        }
        this.f5226c.l(i4, i5);
        requestLayout();
    }

    public void V(int i4, int i5) {
        int iG = this.f5232f.g();
        for (int i6 = 0; i6 < iG; i6++) {
            E(this.f5232f.f(i6));
        }
        this.f5226c.m(i4, i5);
        requestLayout();
    }

    public void W(int i4, int i5, boolean z3) {
        int iG = this.f5232f.g();
        for (int i6 = 0; i6 < iG; i6++) {
            E(this.f5232f.f(i6));
        }
        this.f5226c.n(i4, i5, z3);
        requestLayout();
    }

    public void X(View view) {
    }

    public void Y() {
        this.f5204E++;
    }

    public void Z() {
        a0(true);
    }

    public void a0(boolean z3) {
        int i4 = this.f5204E - 1;
        this.f5204E = i4;
        if (i4 < 1) {
            this.f5204E = 0;
            if (z3) {
                o();
                v();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i4, int i5) {
        n nVar = this.f5246m;
        if (nVar == null || !nVar.V(this, arrayList, i4, i5)) {
            super.addFocusables(arrayList, i4, i5);
        }
    }

    public final void b0(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f5213N) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f5213N = motionEvent.getPointerId(i4);
            int x3 = (int) (motionEvent.getX(i4) + 0.5f);
            this.f5217R = x3;
            this.f5215P = x3;
            int y3 = (int) (motionEvent.getY(i4) + 0.5f);
            this.f5218S = y3;
            this.f5216Q = y3;
        }
    }

    public void c(m mVar) {
        d(mVar, -1);
    }

    public void c0(int i4) {
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.f5246m.d((o) layoutParams);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        n nVar = this.f5246m;
        if (nVar != null && nVar.b()) {
            return this.f5246m.f(this.f5233f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        n nVar = this.f5246m;
        if (nVar != null && nVar.b()) {
            return this.f5246m.g(this.f5233f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        n nVar = this.f5246m;
        if (nVar != null && nVar.b()) {
            return this.f5246m.h(this.f5233f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        n nVar = this.f5246m;
        if (nVar != null && nVar.c()) {
            return this.f5246m.i(this.f5233f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        n nVar = this.f5246m;
        if (nVar != null && nVar.c()) {
            return this.f5246m.j(this.f5233f0);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        n nVar = this.f5246m;
        if (nVar != null && nVar.c()) {
            return this.f5246m.k(this.f5233f0);
        }
        return 0;
    }

    public void d(m mVar, int i4) {
        n nVar = this.f5246m;
        if (nVar != null) {
            nVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.f5248n.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i4 < 0) {
            this.f5248n.add(mVar);
        } else {
            this.f5248n.add(i4, mVar);
        }
        S();
        requestLayout();
    }

    public final boolean d0() {
        return this.f5211L != null && this.f5246m.E0();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return getScrollingChildHelper().a(f4, f5, z3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return getScrollingChildHelper().b(f4, f5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i4, i5, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return getScrollingChildHelper().f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z3;
        super.draw(canvas);
        int size = this.f5248n.size();
        boolean z4 = false;
        for (int i4 = 0; i4 < size; i4++) {
            ((m) this.f5248n.get(i4)).f(canvas, this, this.f5233f0);
        }
        EdgeEffect edgeEffect = this.f5207H;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z3 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f5236h ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.f5207H;
            z3 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.f5208I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f5236h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.f5208I;
            z3 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.f5209J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f5236h ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.f5209J;
            z3 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.f5210K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f5236h) {
                canvas.translate((-getWidth()) + getPaddingRight(), (-getHeight()) + getPaddingBottom());
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.f5210K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 |= z4;
            canvas.restoreToCount(iSave4);
        }
        if ((z3 || this.f5211L == null || this.f5248n.size() <= 0 || !this.f5211L.g()) ? z3 : true) {
            AbstractC0241y.A(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    public void e(q qVar) {
        this.f5250o.add(qVar);
    }

    public final void e0() {
        boolean z3;
        boolean z4;
        if (this.f5202C) {
            this.f5230e.s();
            if (this.f5203D) {
                this.f5246m.g0(this);
            }
        }
        if (d0()) {
            this.f5230e.q();
        } else {
            this.f5230e.i();
        }
        boolean z5 = this.f5239i0 || this.f5241j0;
        x xVar = this.f5233f0;
        if (!this.f5260t || this.f5211L == null || (!(z4 = this.f5202C) && !z5 && !this.f5246m.f5288g)) {
            z3 = false;
        } else {
            if (z4) {
                throw null;
            }
            z3 = true;
        }
        xVar.f5330k = z3;
        xVar.f5331l = z3 && z5 && !this.f5202C && d0();
    }

    public void f(r rVar) {
        if (this.f5237h0 == null) {
            this.f5237h0 = new ArrayList();
        }
        this.f5237h0.add(rVar);
    }

    public void f0(boolean z3) {
        this.f5203D = z3 | this.f5203D;
        this.f5202C = true;
        T();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i4) {
        View viewE0 = this.f5246m.e0(view, i4);
        if (viewE0 != null) {
            return viewE0;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, view, i4);
        if (viewFindNextFocus == null || viewFindNextFocus.hasFocusable()) {
            return R(view, viewFindNextFocus, i4) ? viewFindNextFocus : super.focusSearch(view, i4);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i4);
        }
        m0(viewFindNextFocus, null);
        return view;
    }

    public void g(String str) {
        if (Q()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + A());
        }
        if (this.f5205F > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + A()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.x()
            android.widget.EdgeEffect r1 = r6.f5207H
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            H.c.c(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.y()
            android.widget.EdgeEffect r1 = r6.f5209J
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            H.c.c(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.z()
            android.widget.EdgeEffect r9 = r6.f5208I
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            H.c.c(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.w()
            android.widget.EdgeEffect r9 = r6.f5210K
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            H.c.c(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7e
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7e
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7d
            goto L7e
        L7d:
            return
        L7e:
            C.AbstractC0241y.A(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.g0(float, float, float, float):void");
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.f5246m;
        if (nVar != null) {
            return nVar.n();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.f5246m;
        if (nVar != null) {
            return nVar.o(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }

    public g getAdapter() {
        return null;
    }

    @Override // android.view.View
    public int getBaseline() {
        n nVar = this.f5246m;
        return nVar != null ? nVar.q() : super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i4, int i5) {
        return super.getChildDrawingOrder(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f5236h;
    }

    public androidx.recyclerview.widget.i getCompatAccessibilityDelegate() {
        return this.f5247m0;
    }

    public j getEdgeEffectFactory() {
        return this.f5206G;
    }

    public k getItemAnimator() {
        return this.f5211L;
    }

    public int getItemDecorationCount() {
        return this.f5248n.size();
    }

    public n getLayoutManager() {
        return this.f5246m;
    }

    public int getMaxFlingVelocity() {
        return this.f5221V;
    }

    public int getMinFlingVelocity() {
        return this.f5220U;
    }

    public long getNanoTime() {
        if (f5191B0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public p getOnFlingListener() {
        return null;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f5225b0;
    }

    public s getRecycledViewPool() {
        return this.f5226c.f();
    }

    public int getScrollState() {
        return this.f5212M;
    }

    public final void h() {
        n0();
        setScrollState(0);
    }

    public final void h0() {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f5207H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.f5207H.isFinished();
        } else {
            zIsFinished = false;
        }
        EdgeEffect edgeEffect2 = this.f5208I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.f5208I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5209J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.f5209J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5210K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.f5210K.isFinished();
        }
        if (zIsFinished) {
            AbstractC0241y.A(this);
        }
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().k();
    }

    public void i0() {
        k kVar = this.f5211L;
        if (kVar != null) {
            kVar.c();
        }
        n nVar = this.f5246m;
        if (nVar != null) {
            nVar.v0(this.f5226c);
            this.f5246m.w0(this.f5226c);
        }
        this.f5226c.b();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.f5254q;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().m();
    }

    public void j(int i4, int i5) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.f5207H;
        if (edgeEffect == null || edgeEffect.isFinished() || i4 <= 0) {
            zIsFinished = false;
        } else {
            this.f5207H.onRelease();
            zIsFinished = this.f5207H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.f5209J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i4 < 0) {
            this.f5209J.onRelease();
            zIsFinished |= this.f5209J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.f5208I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i5 > 0) {
            this.f5208I.onRelease();
            zIsFinished |= this.f5208I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.f5210K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i5 < 0) {
            this.f5210K.onRelease();
            zIsFinished |= this.f5210K.isFinished();
        }
        if (zIsFinished) {
            AbstractC0241y.A(this);
        }
    }

    public void j0(m mVar) {
        n nVar = this.f5246m;
        if (nVar != null) {
            nVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.f5248n.remove(mVar);
        if (this.f5248n.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        S();
        requestLayout();
    }

    public void k() {
        if (!this.f5260t || this.f5202C) {
            y.j.a("RV FullInvalidate");
            p();
            y.j.b();
            return;
        }
        if (this.f5230e.o()) {
            if (!this.f5230e.n(4) || this.f5230e.n(11)) {
                if (this.f5230e.o()) {
                    y.j.a("RV FullInvalidate");
                    p();
                    y.j.b();
                    return;
                }
                return;
            }
            y.j.a("RV PartialInvalidate");
            t0();
            Y();
            this.f5230e.q();
            if (!this.f5264v) {
                if (J()) {
                    p();
                } else {
                    this.f5230e.h();
                }
            }
            v0(true);
            Z();
            y.j.b();
        }
    }

    public void k0(q qVar) {
        this.f5250o.remove(qVar);
        if (this.f5252p == qVar) {
            this.f5252p = null;
        }
    }

    public final void l(Context context, String str, AttributeSet attributeSet, int i4, int i5) {
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            String strG = G(context, strTrim);
            try {
                Class<? extends U> clsAsSubclass = (isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).loadClass(strG).asSubclass(n.class);
                try {
                    constructor = clsAsSubclass.getConstructor(f5194E0);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i4), Integer.valueOf(i5)};
                } catch (NoSuchMethodException e4) {
                    try {
                        constructor = clsAsSubclass.getConstructor(new Class[0]);
                        objArr = null;
                    } catch (NoSuchMethodException e5) {
                        e5.initCause(e4);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + strG, e5);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((n) constructor.newInstance(objArr));
            } catch (ClassCastException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + strG, e6);
            } catch (ClassNotFoundException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + strG, e7);
            } catch (IllegalAccessException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + strG, e8);
            } catch (InstantiationException e9) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strG, e9);
            } catch (InvocationTargetException e10) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + strG, e10);
            }
        }
    }

    public void l0(r rVar) {
        List list = this.f5237h0;
        if (list != null) {
            list.remove(rVar);
        }
    }

    public void m(int i4, int i5) {
        setMeasuredDimension(n.e(i4, getPaddingLeft() + getPaddingRight(), AbstractC0241y.n(this)), n.e(i5, getPaddingTop() + getPaddingBottom(), AbstractC0241y.m(this)));
    }

    public final void m0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.f5240j.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.f5305b) {
                Rect rect = oVar.f5304a;
                Rect rect2 = this.f5240j;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.f5240j);
            offsetRectIntoDescendantCoords(view, this.f5240j);
        }
        this.f5246m.z0(this, view, this.f5240j, !this.f5260t, view2 == null);
    }

    public void n(View view) {
        int size;
        E(view);
        X(view);
        if (this.f5201B == null || r2.size() - 1 < 0) {
            return;
        }
        i.d.a(this.f5201B.get(size));
        throw null;
    }

    public final void n0() {
        VelocityTracker velocityTracker = this.f5214O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        w0(0);
        h0();
    }

    public final void o() {
        int i4 = this.f5268y;
        this.f5268y = 0;
        if (i4 == 0 || !P()) {
            return;
        }
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        accessibilityEventObtain.setEventType(2048);
        D.b.b(accessibilityEventObtain, i4);
        sendAccessibilityEventUnchecked(accessibilityEventObtain);
    }

    public boolean o0(int i4, int i5, MotionEvent motionEvent) {
        k();
        if (!this.f5248n.isEmpty()) {
            invalidate();
        }
        if (r(0, 0, 0, 0, this.f5253p0, 0)) {
            int i6 = this.f5217R;
            int[] iArr = this.f5253p0;
            int i7 = iArr[0];
            this.f5217R = i6 - i7;
            int i8 = this.f5218S;
            int i9 = iArr[1];
            this.f5218S = i8 - i9;
            if (motionEvent != null) {
                motionEvent.offsetLocation(i7, i9);
            }
            int[] iArr2 = this.f5257r0;
            int i10 = iArr2[0];
            int[] iArr3 = this.f5253p0;
            iArr2[0] = i10 + iArr3[0];
            iArr2[1] = iArr2[1] + iArr3[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent != null && !AbstractC0230m.a(motionEvent, 8194)) {
                g0(motionEvent.getX(), 0, motionEvent.getY(), 0);
            }
            j(i4, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.f5204E = r0
            r1 = 1
            r5.f5254q = r1
            boolean r2 = r5.f5260t
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.f5260t = r1
            androidx.recyclerview.widget.RecyclerView$n r1 = r5.f5246m
            if (r1 == 0) goto L1e
            r1.l(r5)
        L1e:
            r5.f5245l0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.f5191B0
            if (r0 == 0) goto L61
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.e.f5466q
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.e r1 = (androidx.recyclerview.widget.e) r1
            r5.f5229d0 = r1
            if (r1 != 0) goto L5c
            androidx.recyclerview.widget.e r1 = new androidx.recyclerview.widget.e
            r1.<init>()
            r5.f5229d0 = r1
            android.view.Display r1 = C.AbstractC0241y.i(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L4e
            if (r1 == 0) goto L4e
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L4e
            goto L50
        L4e:
            r1 = 1114636288(0x42700000, float:60.0)
        L50:
            androidx.recyclerview.widget.e r2 = r5.f5229d0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5470o = r3
            r0.set(r2)
        L5c:
            androidx.recyclerview.widget.e r0 = r5.f5229d0
            r0.a(r5)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        k kVar = this.f5211L;
        if (kVar != null) {
            kVar.c();
        }
        x0();
        this.f5254q = false;
        n nVar = this.f5246m;
        if (nVar != null) {
            nVar.m(this, this.f5226c);
        }
        this.f5261t0.clear();
        removeCallbacks(this.f5263u0);
        this.f5234g.a();
        if (!f5191B0 || (eVar = this.f5229d0) == null) {
            return;
        }
        eVar.i(this);
        this.f5229d0 = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.f5248n.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((m) this.f5248n.get(i4)).e(canvas, this, this.f5233f0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.f5246m
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.f5266w
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.RecyclerView$n r0 = r5.f5246m
            boolean r0 = r0.c()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f5246m
            boolean r3 = r3.b()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f5246m
            boolean r3 = r3.c()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.RecyclerView$n r3 = r5.f5246m
            boolean r3 = r3.b()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6c:
            float r2 = r5.f5222W
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.f5223a0
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.o0(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z3;
        if (this.f5266w) {
            return false;
        }
        if (t(motionEvent)) {
            h();
            return true;
        }
        n nVar = this.f5246m;
        if (nVar == null) {
            return false;
        }
        boolean zB = nVar.b();
        boolean zC = this.f5246m.c();
        if (this.f5214O == null) {
            this.f5214O = VelocityTracker.obtain();
        }
        this.f5214O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.f5267x) {
                this.f5267x = false;
            }
            this.f5213N = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.f5217R = x3;
            this.f5215P = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.f5218S = y3;
            this.f5216Q = y3;
            if (this.f5212M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.f5257r0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i4 = zB;
            if (zC) {
                i4 = (zB ? 1 : 0) | 2;
            }
            u0(i4, 0);
        } else if (actionMasked == 1) {
            this.f5214O.clear();
            w0(0);
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f5213N);
            if (iFindPointerIndex < 0) {
                Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f5213N + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x4 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
            int y4 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
            if (this.f5212M != 1) {
                int i5 = x4 - this.f5215P;
                int i6 = y4 - this.f5216Q;
                if (!zB || Math.abs(i5) <= this.f5219T) {
                    z3 = false;
                } else {
                    this.f5217R = x4;
                    z3 = true;
                }
                if (zC && Math.abs(i6) > this.f5219T) {
                    this.f5218S = y4;
                    z3 = true;
                }
                if (z3) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            h();
        } else if (actionMasked == 5) {
            this.f5213N = motionEvent.getPointerId(actionIndex);
            int x5 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f5217R = x5;
            this.f5215P = x5;
            int y5 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.f5218S = y5;
            this.f5216Q = y5;
        } else if (actionMasked == 6) {
            b0(motionEvent);
        }
        return this.f5212M == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        y.j.a("RV OnLayout");
        p();
        y.j.b();
        this.f5260t = true;
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        n nVar = this.f5246m;
        if (nVar == null) {
            m(i4, i5);
            return;
        }
        if (nVar.Q()) {
            View.MeasureSpec.getMode(i4);
            View.MeasureSpec.getMode(i5);
            this.f5246m.l0(this.f5226c, this.f5233f0, i4, i5);
            return;
        }
        if (this.f5256r) {
            this.f5246m.l0(this.f5226c, this.f5233f0, i4, i5);
            return;
        }
        if (this.f5269z) {
            t0();
            Y();
            e0();
            Z();
            x xVar = this.f5233f0;
            if (xVar.f5331l) {
                xVar.f5327h = true;
            } else {
                this.f5230e.i();
                this.f5233f0.f5327h = false;
            }
            this.f5269z = false;
            v0(false);
        } else if (this.f5233f0.f5331l) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        this.f5233f0.f5325f = 0;
        t0();
        this.f5246m.l0(this.f5226c, this.f5233f0, i4, i5);
        v0(false);
        this.f5233f0.f5327h = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (Q()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i4, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof w)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w wVar = (w) parcelable;
        this.f5228d = wVar;
        super.onRestoreInstanceState(wVar.a());
        n nVar = this.f5246m;
        if (nVar == null || (parcelable2 = this.f5228d.f5319o) == null) {
            return;
        }
        nVar.o0(parcelable2);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        w wVar = new w(super.onSaveInstanceState());
        w wVar2 = this.f5228d;
        if (wVar2 != null) {
            wVar.b(wVar2);
            return wVar;
        }
        n nVar = this.f5246m;
        if (nVar != null) {
            wVar.f5319o = nVar.p0();
            return wVar;
        }
        wVar.f5319o = null;
        return wVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        if (i4 == i6 && i5 == i7) {
            return;
        }
        O();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void p() {
        Log.e("RecyclerView", "No adapter attached; skipping layout");
    }

    public final void p0(g gVar, boolean z3, boolean z4) {
        if (!z3 || z4) {
            i0();
        }
        this.f5230e.s();
        n nVar = this.f5246m;
        if (nVar != null) {
            nVar.U(null, null);
        }
        this.f5226c.o(null, null, z3);
        this.f5233f0.f5326g = true;
    }

    public boolean q(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return getScrollingChildHelper().d(i4, i5, iArr, iArr2, i6);
    }

    public boolean q0(AccessibilityEvent accessibilityEvent) {
        if (!Q()) {
            return false;
        }
        int iA = accessibilityEvent != null ? D.b.a(accessibilityEvent) : 0;
        this.f5268y |= iA != 0 ? iA : 0;
        return true;
    }

    public boolean r(int i4, int i5, int i6, int i7, int[] iArr, int i8) {
        return getScrollingChildHelper().g(i4, i5, i6, i7, iArr, i8);
    }

    public void r0(int i4, int i5) {
        s0(i4, i5, null);
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z3) {
        E(view);
        view.clearAnimation();
        n(view);
        super.removeDetachedView(view, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.f5246m.n0(this, this.f5233f0, view, view2) && view2 != null) {
            m0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        return this.f5246m.y0(this, view, rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        int size = this.f5250o.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((q) this.f5250o.get(i4)).c(z3);
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f5262u != 0 || this.f5266w) {
            this.f5264v = true;
        } else {
            super.requestLayout();
        }
    }

    public final boolean s(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        q qVar = this.f5252p;
        if (qVar != null) {
            if (action != 0) {
                qVar.b(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.f5252p = null;
                }
                return true;
            }
            this.f5252p = null;
        }
        if (action != 0) {
            int size = this.f5250o.size();
            for (int i4 = 0; i4 < size; i4++) {
                q qVar2 = (q) this.f5250o.get(i4);
                if (qVar2.a(this, motionEvent)) {
                    this.f5252p = qVar2;
                    return true;
                }
            }
        }
        return false;
    }

    public void s0(int i4, int i5, Interpolator interpolator) {
        n nVar = this.f5246m;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5266w) {
            return;
        }
        if (!nVar.b()) {
            i4 = 0;
        }
        if (!this.f5246m.c()) {
            i5 = 0;
        }
        if (i4 == 0 && i5 == 0) {
            return;
        }
        this.f5227c0.h(i4, i5, interpolator);
    }

    @Override // android.view.View
    public void scrollBy(int i4, int i5) {
        n nVar = this.f5246m;
        if (nVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.f5266w) {
            return;
        }
        boolean zB = nVar.b();
        boolean zC = this.f5246m.c();
        if (zB || zC) {
            if (!zB) {
                i4 = 0;
            }
            if (!zC) {
                i5 = 0;
            }
            o0(i4, i5, null);
        }
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (q0(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.i iVar) {
        this.f5247m0 = iVar;
        AbstractC0241y.F(this, iVar);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        p0(gVar, false, true);
        f0(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i iVar) {
        if (iVar == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z3) {
        if (z3 != this.f5236h) {
            O();
        }
        this.f5236h = z3;
        super.setClipToPadding(z3);
        if (this.f5260t) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j jVar) {
        B.f.b(jVar);
        this.f5206G = jVar;
        O();
    }

    public void setHasFixedSize(boolean z3) {
        this.f5256r = z3;
    }

    public void setItemAnimator(k kVar) {
        k kVar2 = this.f5211L;
        if (kVar2 != null) {
            kVar2.c();
            this.f5211L.j(null);
        }
        this.f5211L = kVar;
        if (kVar != null) {
            kVar.j(this.f5243k0);
        }
    }

    public void setItemViewCacheSize(int i4) {
        this.f5226c.u(i4);
    }

    public void setLayoutFrozen(boolean z3) {
        if (z3 != this.f5266w) {
            g("Do not setLayoutFrozen in layout or scroll");
            if (!z3) {
                this.f5266w = false;
                this.f5264v = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.f5266w = true;
            this.f5267x = true;
            x0();
        }
    }

    public void setLayoutManager(n nVar) {
        if (nVar == this.f5246m) {
            return;
        }
        x0();
        if (this.f5246m != null) {
            k kVar = this.f5211L;
            if (kVar != null) {
                kVar.c();
            }
            this.f5246m.v0(this.f5226c);
            this.f5246m.w0(this.f5226c);
            this.f5226c.b();
            if (this.f5254q) {
                this.f5246m.m(this, this.f5226c);
            }
            this.f5246m.C0(null);
            this.f5246m = null;
        } else {
            this.f5226c.b();
        }
        this.f5232f.i();
        this.f5246m = nVar;
        if (nVar != null) {
            if (nVar.f5283b != null) {
                throw new IllegalArgumentException("LayoutManager " + nVar + " is already attached to a RecyclerView:" + nVar.f5283b.A());
            }
            nVar.C0(this);
            if (this.f5254q) {
                this.f5246m.l(this);
            }
        }
        this.f5226c.w();
        requestLayout();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        getScrollingChildHelper().n(z3);
    }

    public void setOnFlingListener(p pVar) {
    }

    @Deprecated
    public void setOnScrollListener(r rVar) {
        this.f5235g0 = rVar;
    }

    public void setPreserveFocusAfterLayout(boolean z3) {
        this.f5225b0 = z3;
    }

    public void setRecycledViewPool(s sVar) {
        this.f5226c.s(sVar);
    }

    public void setRecyclerListener(u uVar) {
    }

    public void setScrollState(int i4) {
        if (i4 == this.f5212M) {
            return;
        }
        this.f5212M = i4;
        if (i4 != 2) {
            y0();
        }
        u(i4);
    }

    public void setScrollingTouchSlop(int i4) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i4 != 0) {
            if (i4 == 1) {
                this.f5219T = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i4 + "; using default value");
        }
        this.f5219T = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(y yVar) {
        this.f5226c.t(yVar);
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i4) {
        return getScrollingChildHelper().p(i4);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().r();
    }

    public final boolean t(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.f5252p = null;
        }
        int size = this.f5250o.size();
        for (int i4 = 0; i4 < size; i4++) {
            q qVar = (q) this.f5250o.get(i4);
            if (qVar.a(this, motionEvent) && action != 3) {
                this.f5252p = qVar;
                return true;
            }
        }
        return false;
    }

    public void t0() {
        int i4 = this.f5262u + 1;
        this.f5262u = i4;
        if (i4 != 1 || this.f5266w) {
            return;
        }
        this.f5264v = false;
    }

    public void u(int i4) {
        n nVar = this.f5246m;
        if (nVar != null) {
            nVar.q0(i4);
        }
        c0(i4);
        r rVar = this.f5235g0;
        if (rVar != null) {
            rVar.a(this, i4);
        }
        List list = this.f5237h0;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((r) this.f5237h0.get(size)).a(this, i4);
            }
        }
    }

    public boolean u0(int i4, int i5) {
        return getScrollingChildHelper().q(i4, i5);
    }

    public void v() {
        int size = this.f5261t0.size() - 1;
        if (size < 0) {
            this.f5261t0.clear();
        } else {
            i.d.a(this.f5261t0.get(size));
            throw null;
        }
    }

    public void v0(boolean z3) {
        if (this.f5262u < 1) {
            this.f5262u = 1;
        }
        if (!z3 && !this.f5266w) {
            this.f5264v = false;
        }
        int i4 = this.f5262u;
        if (i4 == 1) {
            if (z3) {
                boolean z4 = this.f5264v;
            }
            if (!this.f5266w) {
                this.f5264v = false;
            }
        }
        this.f5262u = i4 - 1;
    }

    public void w() {
        if (this.f5210K != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f5206G.a(this, 3);
        this.f5210K = edgeEffectA;
        if (this.f5236h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void w0(int i4) {
        getScrollingChildHelper().s(i4);
    }

    public void x() {
        if (this.f5207H != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f5206G.a(this, 0);
        this.f5207H = edgeEffectA;
        if (this.f5236h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void x0() {
        setScrollState(0);
        y0();
    }

    public void y() {
        if (this.f5209J != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f5206G.a(this, 2);
        this.f5209J = edgeEffectA;
        if (this.f5236h) {
            edgeEffectA.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffectA.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void y0() {
        this.f5227c0.i();
        n nVar = this.f5246m;
        if (nVar != null) {
            nVar.D0();
        }
    }

    public void z() {
        if (this.f5208I != null) {
            return;
        }
        EdgeEffect edgeEffectA = this.f5206G.a(this, 1);
        this.f5208I = edgeEffectA;
        if (this.f5236h) {
            edgeEffectA.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffectA.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void z0(int i4, int i5, Object obj) {
        int iG = this.f5232f.g();
        for (int i6 = 0; i6 < iG; i6++) {
            E(this.f5232f.f(i6));
        }
        this.f5226c.x(i4, i5);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5224b = new v();
        this.f5226c = new t();
        this.f5234g = new androidx.recyclerview.widget.m();
        this.f5238i = new RunnableC0612a();
        this.f5240j = new Rect();
        this.f5242k = new Rect();
        this.f5244l = new RectF();
        this.f5248n = new ArrayList();
        this.f5250o = new ArrayList();
        this.f5262u = 0;
        this.f5202C = false;
        this.f5203D = false;
        this.f5204E = 0;
        this.f5205F = 0;
        this.f5206G = new j();
        this.f5211L = new androidx.recyclerview.widget.c();
        this.f5212M = 0;
        this.f5213N = -1;
        this.f5222W = Float.MIN_VALUE;
        this.f5223a0 = Float.MIN_VALUE;
        boolean z3 = true;
        this.f5225b0 = true;
        this.f5227c0 = new z();
        this.f5231e0 = f5191B0 ? new e.b() : null;
        this.f5233f0 = new x();
        this.f5239i0 = false;
        this.f5241j0 = false;
        this.f5243k0 = new l();
        this.f5245l0 = false;
        this.f5249n0 = new int[2];
        this.f5253p0 = new int[2];
        this.f5255q0 = new int[2];
        this.f5257r0 = new int[2];
        this.f5259s0 = new int[2];
        this.f5261t0 = new ArrayList();
        this.f5263u0 = new b();
        this.f5265v0 = new d();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f5197x0, i4, 0);
            this.f5236h = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f5236h = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f5219T = viewConfiguration.getScaledTouchSlop();
        this.f5222W = C.f(viewConfiguration, context);
        this.f5223a0 = C.j(viewConfiguration, context);
        this.f5220U = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f5221V = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.f5211L.j(this.f5243k0);
        K();
        M();
        L();
        if (AbstractC0241y.j(this) == 0) {
            AbstractC0241y.L(this, 1);
        }
        this.f5200A = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.i(this));
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC0912b.f7131h, i4, 0);
            String string = typedArrayObtainStyledAttributes2.getString(AbstractC0912b.f7139p);
            if (typedArrayObtainStyledAttributes2.getInt(AbstractC0912b.f7133j, -1) == -1) {
                setDescendantFocusability(262144);
            }
            boolean z4 = typedArrayObtainStyledAttributes2.getBoolean(AbstractC0912b.f7134k, false);
            this.f5258s = z4;
            if (z4) {
                N((StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(AbstractC0912b.f7137n), typedArrayObtainStyledAttributes2.getDrawable(AbstractC0912b.f7138o), (StateListDrawable) typedArrayObtainStyledAttributes2.getDrawable(AbstractC0912b.f7135l), typedArrayObtainStyledAttributes2.getDrawable(AbstractC0912b.f7136m));
            }
            typedArrayObtainStyledAttributes2.recycle();
            l(context, string, attributeSet, i4, 0);
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, f5196w0, i4, 0);
            z3 = typedArrayObtainStyledAttributes3.getBoolean(0, true);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z3);
    }

    public static class o extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f5304a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5306c;

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f5304a = new Rect();
            this.f5305b = true;
            this.f5306c = false;
        }

        public int a() {
            throw null;
        }

        public o(int i4, int i5) {
            super(i4, i5);
            this.f5304a = new Rect();
            this.f5305b = true;
            this.f5306c = false;
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f5304a = new Rect();
            this.f5305b = true;
            this.f5306c = false;
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f5304a = new Rect();
            this.f5305b = true;
            this.f5306c = false;
        }

        public o(o oVar) {
            super((ViewGroup.LayoutParams) oVar);
            this.f5304a = new Rect();
            this.f5305b = true;
            this.f5306c = false;
        }
    }

    public static class w extends J.a {
        public static final Parcelable.Creator<w> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Parcelable f5319o;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public w createFromParcel(Parcel parcel) {
                return new w(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public w createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new w(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public w[] newArray(int i4) {
                return new w[i4];
            }
        }

        public w(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5319o = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        public void b(w wVar) {
            this.f5319o = wVar.f5319o;
        }

        @Override // J.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeParcelable(this.f5319o, 0);
        }

        public w(Parcelable parcelable) {
            super(parcelable);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.f5246m;
        if (nVar != null) {
            return nVar.p(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + A());
    }
}
