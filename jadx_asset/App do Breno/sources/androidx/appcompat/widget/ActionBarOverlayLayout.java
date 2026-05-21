package androidx.appcompat.widget;

import C.AbstractC0241y;
import C.C0234q;
import C.InterfaceC0232o;
import C.InterfaceC0233p;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.OverScroller;
import c.AbstractC0637a;
import c.AbstractC0641e;
import k.InterfaceC1111A;
import k.g0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements InterfaceC0232o, InterfaceC0233p {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int[] f4276B = {AbstractC0637a.f5557b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C0234q f4277A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ContentFrameLayout f4280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f4281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1111A f4282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f4283g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4284h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4285i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4286j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4287k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4288l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4289m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4290n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f4291o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f4292p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f4293q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f4294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f4295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f4296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f4297u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public OverScroller f4298v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewPropertyAnimator f4299w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AnimatorListenerAdapter f4300x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Runnable f4301y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Runnable f4302z;

    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4299w = null;
            actionBarOverlayLayout.f4288l = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4299w = null;
            actionBarOverlayLayout.f4288l = false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4299w = actionBarOverlayLayout.f4281e.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f4300x);
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.l();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f4299w = actionBarOverlayLayout.f4281e.animate().translationY(-ActionBarOverlayLayout.this.f4281e.getHeight()).setListener(ActionBarOverlayLayout.this.f4300x);
        }
    }

    public interface d {
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i4, int i5) {
            super(i4, i5);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4279c = 0;
        this.f4291o = new Rect();
        this.f4292p = new Rect();
        this.f4293q = new Rect();
        this.f4294r = new Rect();
        this.f4295s = new Rect();
        this.f4296t = new Rect();
        this.f4297u = new Rect();
        this.f4300x = new a();
        this.f4301y = new b();
        this.f4302z = new c();
        m(context);
        this.f4277A = new C0234q(this);
    }

    @Override // C.InterfaceC0232o
    public void a(View view, View view2, int i4, int i5) {
        if (i5 == 0) {
            onNestedScrollAccepted(view, view2, i4);
        }
    }

    @Override // C.InterfaceC0232o
    public void b(View view, int i4) {
        if (i4 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // C.InterfaceC0232o
    public void c(View view, int i4, int i5, int[] iArr, int i6) {
        if (i6 == 0) {
            onNestedPreScroll(view, i4, i5, iArr);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // C.InterfaceC0233p
    public void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        e(view, i4, i5, i6, i7, i8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f4283g == null || this.f4284h) {
            return;
        }
        int bottom = this.f4281e.getVisibility() == 0 ? (int) (this.f4281e.getBottom() + this.f4281e.getTranslationY() + 0.5f) : 0;
        this.f4283g.setBounds(0, bottom, getWidth(), this.f4283g.getIntrinsicHeight() + bottom);
        this.f4283g.draw(canvas);
    }

    @Override // C.InterfaceC0232o
    public void e(View view, int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i4, i5, i6, i7);
        }
    }

    @Override // C.InterfaceC0232o
    public boolean f(View view, View view2, int i4, int i5) {
        return i5 == 0 && onStartNestedScroll(view, view2, i4);
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        p();
        AbstractC0241y.r(this);
        boolean zH = h(this.f4281e, rect, true, true, false, true);
        this.f4294r.set(rect);
        g0.a(this, this.f4294r, this.f4291o);
        if (!this.f4295s.equals(this.f4294r)) {
            this.f4295s.set(this.f4294r);
            zH = true;
        }
        if (!this.f4292p.equals(this.f4291o)) {
            this.f4292p.set(this.f4291o);
            zH = true;
        }
        if (zH) {
            requestLayout();
        }
        return true;
    }

    public final void g() {
        l();
        this.f4302z.run();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f4281e;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4277A.a();
    }

    public CharSequence getTitle() {
        p();
        return this.f4282f.getTitle();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$e r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.e) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            return r0
        L35:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.h(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InterfaceC1111A k(View view) {
        if (view instanceof InterfaceC1111A) {
            return (InterfaceC1111A) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void l() {
        removeCallbacks(this.f4301y);
        removeCallbacks(this.f4302z);
        ViewPropertyAnimator viewPropertyAnimator = this.f4299w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void m(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f4276B);
        this.f4278b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f4283g = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f4284h = context.getApplicationInfo().targetSdkVersion < 19;
        this.f4298v = new OverScroller(context);
    }

    public final void n() {
        l();
        postDelayed(this.f4302z, 600L);
    }

    public final void o() {
        l();
        postDelayed(this.f4301y, 600L);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m(getContext());
        AbstractC0241y.D(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        p();
        measureChildWithMargins(this.f4281e, i4, 0, i5, 0);
        e eVar = (e) this.f4281e.getLayoutParams();
        int measuredHeight = 0;
        int iMax = Math.max(0, this.f4281e.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f4281e.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4281e.getMeasuredState());
        boolean z3 = (AbstractC0241y.r(this) & 256) != 0;
        if (z3) {
            measuredHeight = this.f4278b;
            if (this.f4286j && this.f4281e.getTabContainer() != null) {
                measuredHeight += this.f4278b;
            }
        } else if (this.f4281e.getVisibility() != 8) {
            measuredHeight = this.f4281e.getMeasuredHeight();
        }
        this.f4293q.set(this.f4291o);
        this.f4296t.set(this.f4294r);
        if (this.f4285i || z3) {
            Rect rect = this.f4296t;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
        } else {
            Rect rect2 = this.f4293q;
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
        }
        h(this.f4280d, this.f4293q, true, true, true, true);
        if (!this.f4297u.equals(this.f4296t)) {
            this.f4297u.set(this.f4296t);
            this.f4280d.a(this.f4296t);
        }
        measureChildWithMargins(this.f4280d, i4, 0, i5, 0);
        e eVar2 = (e) this.f4280d.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f4280d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f4280d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4280d.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        if (!this.f4287k || !z3) {
            return false;
        }
        if (r(f4, f5)) {
            g();
        } else {
            q();
        }
        this.f4288l = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        int i8 = this.f4289m + i5;
        this.f4289m = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        this.f4277A.b(view, view2, i4);
        this.f4289m = getActionBarHideOffset();
        l();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        if ((i4 & 2) == 0 || this.f4281e.getVisibility() != 0) {
            return false;
        }
        return this.f4287k;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (!this.f4287k || this.f4288l) {
            return;
        }
        if (this.f4289m <= this.f4281e.getHeight()) {
            o();
        } else {
            n();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i4) {
        super.onWindowSystemUiVisibilityChanged(i4);
        p();
        this.f4290n = i4;
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i4) {
        super.onWindowVisibilityChanged(i4);
        this.f4279c = i4;
    }

    public void p() {
        if (this.f4280d == null) {
            this.f4280d = (ContentFrameLayout) findViewById(AbstractC0641e.f5641b);
            this.f4281e = (ActionBarContainer) findViewById(AbstractC0641e.f5642c);
            this.f4282f = k(findViewById(AbstractC0641e.f5640a));
        }
    }

    public final void q() {
        l();
        this.f4301y.run();
    }

    public final boolean r(float f4, float f5) {
        this.f4298v.fling(0, 0, 0, (int) f5, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f4298v.getFinalY() > this.f4281e.getHeight();
    }

    public void setActionBarHideOffset(int i4) {
        l();
        this.f4281e.setTranslationY(-Math.max(0, Math.min(i4, this.f4281e.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        if (getWindowToken() != null) {
            throw null;
        }
    }

    public void setHasNonEmbeddedTabs(boolean z3) {
        this.f4286j = z3;
    }

    public void setHideOnContentScrollEnabled(boolean z3) {
        if (z3 != this.f4287k) {
            this.f4287k = z3;
            if (z3) {
                return;
            }
            l();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i4) {
        p();
        this.f4282f.setIcon(i4);
    }

    public void setLogo(int i4) {
        p();
        this.f4282f.c(i4);
    }

    public void setOverlayMode(boolean z3) {
        this.f4285i = z3;
        this.f4284h = z3 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z3) {
    }

    public void setUiOptions(int i4) {
    }

    public void setWindowCallback(Window.Callback callback) {
        p();
        this.f4282f.b(callback);
    }

    public void setWindowTitle(CharSequence charSequence) {
        p();
        this.f4282f.a(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        p();
        this.f4282f.setIcon(drawable);
    }
}
