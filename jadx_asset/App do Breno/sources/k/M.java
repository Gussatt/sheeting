package k;

import C.AbstractC0241y;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import c.AbstractC0645i;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class M implements j.c {

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static Method f8663I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public static Method f8664J;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Runnable f8667C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Handler f8668D;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public Rect f8670F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f8671G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public PopupWindow f8672H;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f8673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ListAdapter f8674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public H f8675d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f8678g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f8679h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8681j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f8683l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f8684m;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f8689r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public DataSetObserver f8691t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f8692u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f8693v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public AdapterView.OnItemClickListener f8694w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f8695x;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f8676e = -2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f8677f = -2;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8680i = 1002;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8682k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8685n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f8686o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f8687p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f8688q = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f8690s = 0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f8696y = new g();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final f f8697z = new f();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final e f8665A = new e();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f8666B = new c();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Rect f8669E = new Rect();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewH = M.this.h();
            if (viewH == null || viewH.getWindowToken() == null) {
                return;
            }
            M.this.a();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            M.this.f();
        }
    }

    public class d extends DataSetObserver {
        public d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (M.this.i()) {
                M.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            M.this.dismiss();
        }
    }

    public class f implements View.OnTouchListener {
        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = M.this.f8672H) != null && popupWindow.isShowing() && x3 >= 0 && x3 < M.this.f8672H.getWidth() && y3 >= 0 && y3 < M.this.f8672H.getHeight()) {
                M m4 = M.this;
                m4.f8668D.postDelayed(m4.f8696y, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            M m5 = M.this;
            m5.f8668D.removeCallbacks(m5.f8696y);
            return false;
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            H h4 = M.this.f8675d;
            if (h4 == null || !AbstractC0241y.u(h4) || M.this.f8675d.getCount() <= M.this.f8675d.getChildCount()) {
                return;
            }
            int childCount = M.this.f8675d.getChildCount();
            M m4 = M.this;
            if (childCount <= m4.f8688q) {
                m4.f8672H.setInputMethodMode(2);
                M.this.a();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f8663I = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f8664J = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public M(Context context, AttributeSet attributeSet, int i4, int i5) {
        this.f8673b = context;
        this.f8668D = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645i.f5725I0, i4, i5);
        this.f8678g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC0645i.f5729J0, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(AbstractC0645i.f5733K0, 0);
        this.f8679h = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f8681j = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C1121j c1121j = new C1121j(context, attributeSet, i4, i5);
        this.f8672H = c1121j;
        c1121j.setInputMethodMode(1);
    }

    public void A(boolean z3) {
        this.f8684m = true;
        this.f8683l = z3;
    }

    public final void B(boolean z3) {
        if (Build.VERSION.SDK_INT > 28) {
            this.f8672H.setIsClippedToScreen(z3);
            return;
        }
        Method method = f8663I;
        if (method != null) {
            try {
                method.invoke(this.f8672H, Boolean.valueOf(z3));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void C(int i4) {
        this.f8679h = i4;
        this.f8681j = true;
    }

    public void D(int i4) {
        this.f8677f = i4;
    }

    @Override // j.c
    public void a() {
        int iE = e();
        boolean zM = m();
        H.f.b(this.f8672H, this.f8680i);
        if (this.f8672H.isShowing()) {
            if (AbstractC0241y.u(h())) {
                int width = this.f8677f;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = h().getWidth();
                }
                int i4 = this.f8676e;
                if (i4 == -1) {
                    if (!zM) {
                        iE = -1;
                    }
                    if (zM) {
                        this.f8672H.setWidth(this.f8677f == -1 ? -1 : 0);
                        this.f8672H.setHeight(0);
                    } else {
                        this.f8672H.setWidth(this.f8677f == -1 ? -1 : 0);
                        this.f8672H.setHeight(-1);
                    }
                } else if (i4 != -2) {
                    iE = i4;
                }
                this.f8672H.setOutsideTouchable((this.f8687p || this.f8686o) ? false : true);
                this.f8672H.update(h(), this.f8678g, this.f8679h, width < 0 ? -1 : width, iE < 0 ? -1 : iE);
                return;
            }
            return;
        }
        int width2 = this.f8677f;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = h().getWidth();
        }
        int i5 = this.f8676e;
        if (i5 == -1) {
            iE = -1;
        } else if (i5 != -2) {
            iE = i5;
        }
        this.f8672H.setWidth(width2);
        this.f8672H.setHeight(iE);
        B(true);
        this.f8672H.setOutsideTouchable((this.f8687p || this.f8686o) ? false : true);
        this.f8672H.setTouchInterceptor(this.f8697z);
        if (this.f8684m) {
            H.f.a(this.f8672H, this.f8683l);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f8664J;
            if (method != null) {
                try {
                    method.invoke(this.f8672H, this.f8670F);
                } catch (Exception e4) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e4);
                }
            }
        } else {
            this.f8672H.setEpicenterBounds(this.f8670F);
        }
        H.f.c(this.f8672H, h(), this.f8678g, this.f8679h, this.f8685n);
        this.f8675d.setSelection(-1);
        if (!this.f8671G || this.f8675d.isInTouchMode()) {
            f();
        }
        if (this.f8671G) {
            return;
        }
        this.f8668D.post(this.f8666B);
    }

    @Override // j.c
    public ListView d() {
        return this.f8675d;
    }

    @Override // j.c
    public void dismiss() {
        this.f8672H.dismiss();
        o();
        this.f8672H.setContentView(null);
        this.f8675d = null;
        this.f8668D.removeCallbacks(this.f8696y);
    }

    public final int e() {
        int measuredHeight;
        int i4;
        int iMakeMeasureSpec;
        View view;
        int i5;
        if (this.f8675d == null) {
            Context context = this.f8673b;
            this.f8667C = new a();
            H hG = g(context, !this.f8671G);
            this.f8675d = hG;
            Drawable drawable = this.f8693v;
            if (drawable != null) {
                hG.setSelector(drawable);
            }
            this.f8675d.setAdapter(this.f8674c);
            this.f8675d.setOnItemClickListener(this.f8694w);
            this.f8675d.setFocusable(true);
            this.f8675d.setFocusableInTouchMode(true);
            this.f8675d.setOnItemSelectedListener(new b());
            this.f8675d.setOnScrollListener(this.f8665A);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f8695x;
            if (onItemSelectedListener != null) {
                this.f8675d.setOnItemSelectedListener(onItemSelectedListener);
            }
            H h4 = this.f8675d;
            View view2 = this.f8689r;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i6 = this.f8690s;
                if (i6 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(h4, layoutParams);
                } else if (i6 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f8690s);
                } else {
                    linearLayout.addView(h4, layoutParams);
                    linearLayout.addView(view2);
                }
                int i7 = this.f8677f;
                if (i7 >= 0) {
                    i5 = Integer.MIN_VALUE;
                } else {
                    i7 = 0;
                    i5 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i7, i5), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = h4;
            }
            this.f8672H.setContentView(view);
        } else {
            View view3 = this.f8689r;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f8672H.getBackground();
        if (background != null) {
            background.getPadding(this.f8669E);
            Rect rect = this.f8669E;
            int i8 = rect.top;
            i4 = rect.bottom + i8;
            if (!this.f8681j) {
                this.f8679h = -i8;
            }
        } else {
            this.f8669E.setEmpty();
            i4 = 0;
        }
        int iK = k(h(), this.f8679h, this.f8672H.getInputMethodMode() == 2);
        if (this.f8686o || this.f8676e == -1) {
            return iK + i4;
        }
        int i9 = this.f8677f;
        if (i9 == -2) {
            int i10 = this.f8673b.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f8669E;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i10 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i9 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
        } else {
            int i11 = this.f8673b.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f8669E;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f8675d.d(iMakeMeasureSpec, 0, -1, iK - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i4 + this.f8675d.getPaddingTop() + this.f8675d.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void f() {
        H h4 = this.f8675d;
        if (h4 != null) {
            h4.setListSelectionHidden(true);
            h4.requestLayout();
        }
    }

    public abstract H g(Context context, boolean z3);

    public View h() {
        return this.f8692u;
    }

    @Override // j.c
    public boolean i() {
        return this.f8672H.isShowing();
    }

    public int j() {
        return this.f8678g;
    }

    public final int k(View view, int i4, boolean z3) {
        return this.f8672H.getMaxAvailableHeight(view, i4, z3);
    }

    public int l() {
        if (this.f8681j) {
            return this.f8679h;
        }
        return 0;
    }

    public boolean m() {
        return this.f8672H.getInputMethodMode() == 2;
    }

    public boolean n() {
        return this.f8671G;
    }

    public final void o() {
        View view = this.f8689r;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f8689r);
            }
        }
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f8691t;
        if (dataSetObserver == null) {
            this.f8691t = new d();
        } else {
            ListAdapter listAdapter2 = this.f8674c;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f8674c = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f8691t);
        }
        H h4 = this.f8675d;
        if (h4 != null) {
            h4.setAdapter(this.f8674c);
        }
    }

    public void q(View view) {
        this.f8692u = view;
    }

    public void r(int i4) {
        this.f8672H.setAnimationStyle(i4);
    }

    public void s(int i4) {
        Drawable background = this.f8672H.getBackground();
        if (background == null) {
            D(i4);
            return;
        }
        background.getPadding(this.f8669E);
        Rect rect = this.f8669E;
        this.f8677f = rect.left + rect.right + i4;
    }

    public void t(int i4) {
        this.f8685n = i4;
    }

    public void u(Rect rect) {
        this.f8670F = rect != null ? new Rect(rect) : null;
    }

    public void v(int i4) {
        this.f8678g = i4;
    }

    public void w(int i4) {
        this.f8672H.setInputMethodMode(i4);
    }

    public void x(boolean z3) {
        this.f8671G = z3;
        this.f8672H.setFocusable(z3);
    }

    public void y(PopupWindow.OnDismissListener onDismissListener) {
        this.f8672H.setOnDismissListener(onDismissListener);
    }

    public void z(AdapterView.OnItemClickListener onItemClickListener) {
        this.f8694w = onItemClickListener;
    }

    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i4, long j4) {
            H h4;
            if (i4 == -1 || (h4 = M.this.f8675d) == null) {
                return;
            }
            h4.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public class e implements AbsListView.OnScrollListener {
        public e() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i4) {
            if (i4 != 1 || M.this.m() || M.this.f8672H.getContentView() == null) {
                return;
            }
            M m4 = M.this;
            m4.f8668D.removeCallbacks(m4.f8696y);
            M.this.f8696y.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i4, int i5, int i6) {
        }
    }
}
