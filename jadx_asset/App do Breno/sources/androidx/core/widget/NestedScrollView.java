package androidx.core.widget;

import C.AbstractC0230m;
import C.AbstractC0241y;
import C.C0218a;
import C.C0222e;
import C.C0231n;
import C.C0234q;
import C.InterfaceC0223f;
import C.InterfaceC0233p;
import D.t;
import D.x;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import r.AbstractC1500a;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC0233p {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final float f4590D = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final a f4591E = new a();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f4592F = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public float f4593A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f4594B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C0222e f4595C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f4596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f4598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OverScroller f4599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f4600f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public EdgeEffect f4601g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f4602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4603i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4604j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f4605k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4606l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public VelocityTracker f4607m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4608n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4609o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4610p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4611q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4612r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4613s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f4614t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int[] f4615u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f4618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C0234q f4619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C0231n f4620z;

    public static class a extends C0218a {
        @Override // C.C0218a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            x.a(accessibilityEvent, nestedScrollView.getScrollX());
            x.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // C.C0218a
        public void g(View view, t tVar) {
            int scrollRange;
            super.g(view, tVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            tVar.W(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            tVar.b0(true);
            if (nestedScrollView.getScrollY() > 0) {
                tVar.b(t.a.f822q);
                tVar.b(t.a.f789B);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                tVar.b(t.a.f821p);
                tVar.b(t.a.f791D);
            }
        }

        @Override // C.C0218a
        public boolean j(View view, int i4, Bundle bundle) {
            if (super.j(view, i4, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i4 != 4096) {
                if (i4 == 8192 || i4 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, iMax, true);
                    return true;
                }
                if (i4 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, iMin, true);
            return true;
        }
    }

    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public class c implements InterfaceC0223f {
        public c() {
        }

        @Override // C.InterfaceC0223f
        public boolean a(float f4) {
            if (f4 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f4);
            return true;
        }

        @Override // C.InterfaceC0223f
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // C.InterfaceC0223f
        public void c() {
            NestedScrollView.this.f4599e.abortAnimation();
        }
    }

    public interface d {
    }

    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4622m;

        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i4) {
                return new e[i4];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f4622m + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f4622m);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f4622m = parcel.readInt();
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC1500a.f11122a);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    public static int l(int i4, int i5, int i6) {
        if (i5 >= i6 || i4 < 0) {
            return 0;
        }
        return i5 + i4 > i6 ? i6 - i5 : i4;
    }

    public final void A() {
        VelocityTracker velocityTracker = this.f4607m;
        if (velocityTracker == null) {
            this.f4607m = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void B() {
        this.f4599e = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4610p = viewConfiguration.getScaledTouchSlop();
        this.f4611q = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4612r = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void C() {
        if (this.f4607m == null) {
            this.f4607m = VelocityTracker.obtain();
        }
    }

    public final void D(int i4, int i5) {
        this.f4602h = i4;
        this.f4613s = i5;
        X(2, 0);
    }

    public final boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    public final boolean G(View view, int i4, int i5) {
        view.getDrawingRect(this.f4598d);
        offsetDescendantRectToMyCoords(view, this.f4598d);
        return this.f4598d.bottom + i4 >= getScrollY() && this.f4598d.top - i4 <= getScrollY() + i5;
    }

    public final void H(int i4, int i5, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i4);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f4620z.e(0, scrollY2, 0, i4 - scrollY2, null, i5, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4613s) {
            int i4 = actionIndex == 0 ? 1 : 0;
            this.f4602h = (int) motionEvent.getY(i4);
            this.f4613s = motionEvent.getPointerId(i4);
            VelocityTracker velocityTracker = this.f4607m;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean J(int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z3) {
        boolean z4;
        boolean z5;
        int i12;
        int overScrollMode = getOverScrollMode();
        boolean z6 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z7 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        boolean z9 = overScrollMode == 0 || (overScrollMode == 1 && z7);
        int i13 = i6 + i4;
        int i14 = !z8 ? 0 : i10;
        int i15 = i7 + i5;
        int i16 = !z9 ? 0 : i11;
        int i17 = -i14;
        int i18 = i14 + i8;
        int i19 = -i16;
        int i20 = i16 + i9;
        if (i13 > i18) {
            i13 = i18;
            z4 = true;
        } else if (i13 < i17) {
            z4 = true;
            i13 = i17;
        } else {
            z4 = false;
        }
        if (i15 > i20) {
            i15 = i20;
            z5 = true;
        } else if (i15 < i19) {
            z5 = true;
            i15 = i19;
        } else {
            z5 = false;
        }
        if (!z5 || y(1)) {
            i12 = i13;
        } else {
            int i21 = i13;
            this.f4599e.springBack(i21, i15, 0, 0, 0, getScrollRange());
            i12 = i21;
        }
        onOverScrolled(i12, i15, z4, z5);
        return z4 || z5;
    }

    public boolean K(int i4) {
        boolean z3 = i4 == 130;
        int height = getHeight();
        if (z3) {
            this.f4598d.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f4598d;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f4598d.top = getScrollY() - height;
            Rect rect2 = this.f4598d;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f4598d;
        int i5 = rect3.top;
        int i6 = height + i5;
        rect3.bottom = i6;
        return O(i4, i5, i6);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.f4607m;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4607m = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int M(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f4600f
            float r0 = H.c.b(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f4600f
            float r4 = -r4
            float r4 = H.c.d(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f4600f
            float r5 = H.c.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f4600f
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f4601g
            float r0 = H.c.b(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f4601g
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = H.c.d(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f4601g
            float r5 = H.c.b(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f4601g
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.M(int, float):int");
    }

    public final void N(boolean z3) {
        if (z3) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f4617w = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean O(int i4, int i5, int i6) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = height + scrollY;
        boolean z3 = false;
        boolean z4 = i4 == 33;
        View viewU = u(z4, i5, i6);
        if (viewU == null) {
            viewU = this;
        }
        if (i5 < scrollY || i6 > i7) {
            P(z4 ? i5 - scrollY : i6 - i7, 0, 1, true);
            z3 = true;
        }
        if (viewU != findFocus()) {
            viewU.requestFocus(i4);
        }
        return z3;
    }

    public final int P(int i4, int i5, int i6, boolean z3) {
        int i7;
        int i8;
        VelocityTracker velocityTracker;
        if (i6 == 1) {
            X(2, i6);
        }
        boolean z4 = false;
        if (o(0, i4, this.f4615u, this.f4614t, i6)) {
            int i9 = i4 - this.f4615u[1];
            i8 = this.f4614t[1];
            i7 = i9;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z5 = j() && !z3;
        int i10 = i7;
        boolean z6 = J(0, i7, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i6);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f4615u;
        iArr[1] = 0;
        p(0, scrollY2, 0, i10 - scrollY2, this.f4614t, i6, iArr);
        int i11 = i8 + this.f4614t[1];
        int i12 = i10 - this.f4615u[1];
        int i13 = scrollY + i12;
        if (i13 < 0) {
            if (z5) {
                H.c.d(this.f4600f, (-i12) / getHeight(), i5 / getWidth());
                if (!this.f4601g.isFinished()) {
                    this.f4601g.onRelease();
                }
            }
        } else if (i13 > scrollRange && z5) {
            H.c.d(this.f4601g, i12 / getHeight(), 1.0f - (i5 / getWidth()));
            if (!this.f4600f.isFinished()) {
                this.f4600f.onRelease();
            }
        }
        if (this.f4600f.isFinished() && this.f4601g.isFinished()) {
            z4 = z6;
        } else {
            postInvalidateOnAnimation();
        }
        if (z4 && i6 == 0 && (velocityTracker = this.f4607m) != null) {
            velocityTracker.clear();
        }
        if (i6 == 1) {
            Z(i6);
            this.f4600f.onRelease();
            this.f4601g.onRelease();
        }
        return i11;
    }

    public final void Q(View view) {
        view.getDrawingRect(this.f4598d);
        offsetDescendantRectToMyCoords(view, this.f4598d);
        int iM = m(this.f4598d);
        if (iM != 0) {
            scrollBy(0, iM);
        }
    }

    public final boolean R(Rect rect, boolean z3) {
        int iM = m(rect);
        boolean z4 = iM != 0;
        if (z4) {
            if (z3) {
                scrollBy(0, iM);
                return z4;
            }
            T(0, iM);
        }
        return z4;
    }

    public final boolean S(EdgeEffect edgeEffect, int i4) {
        if (i4 > 0) {
            return true;
        }
        return x(-i4) < H.c.b(edgeEffect) * ((float) getHeight());
    }

    public final void T(int i4, int i5) {
        U(i4, i5, 250, false);
    }

    public final void U(int i4, int i5, int i6, boolean z3) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4597c > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4599e.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i5 + scrollY, Math.max(0, height - height2))) - scrollY, i6);
            N(z3);
        } else {
            if (!this.f4599e.isFinished()) {
                g();
            }
            scrollBy(i4, i5);
        }
        this.f4597c = AnimationUtils.currentAnimationTimeMillis();
    }

    public void V(int i4, int i5, int i6, boolean z3) {
        U(i4 - getScrollX(), i5 - getScrollY(), i6, z3);
    }

    public void W(int i4, int i5, boolean z3) {
        V(i4, i5, 250, z3);
    }

    public boolean X(int i4, int i5) {
        return this.f4620z.q(i4, i5);
    }

    public final boolean Y(MotionEvent motionEvent) {
        boolean z3;
        if (H.c.b(this.f4600f) != 0.0f) {
            H.c.d(this.f4600f, 0.0f, motionEvent.getX() / getWidth());
            z3 = true;
        } else {
            z3 = false;
        }
        if (H.c.b(this.f4601g) == 0.0f) {
            return z3;
        }
        H.c.d(this.f4601g, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void Z(int i4) {
        this.f4620z.s(i4);
    }

    @Override // C.InterfaceC0232o
    public void a(View view, View view2, int i4, int i5) {
        this.f4619y.c(view, view2, i4, i5);
        X(2, i5);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // C.InterfaceC0232o
    public void b(View view, int i4) {
        this.f4619y.d(view, i4);
        Z(i4);
    }

    @Override // C.InterfaceC0232o
    public void c(View view, int i4, int i5, int[] iArr, int i6) {
        o(i4, i5, iArr, null, i6);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        int i4;
        if (this.f4599e.isFinished()) {
            return;
        }
        this.f4599e.computeScrollOffset();
        int currY = this.f4599e.getCurrY();
        int iN = n(currY - this.f4617w);
        this.f4617w = currY;
        int[] iArr = this.f4615u;
        iArr[1] = 0;
        o(0, iN, iArr, null, 1);
        int i5 = iN - this.f4615u[1];
        int scrollRange = getScrollRange();
        if (i5 != 0) {
            int scrollY = getScrollY();
            J(0, i5, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i4 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i6 = i5 - scrollY2;
            int[] iArr2 = this.f4615u;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i6, this.f4614t, 1, iArr2);
            i5 = i6 - this.f4615u[1];
        } else {
            i4 = scrollRange;
        }
        if (i5 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i4 > 0)) {
                if (i5 < 0) {
                    if (this.f4600f.isFinished()) {
                        this.f4600f.onAbsorb((int) this.f4599e.getCurrVelocity());
                    }
                } else if (this.f4601g.isFinished()) {
                    this.f4601g.onAbsorb((int) this.f4599e.getCurrVelocity());
                }
            }
            g();
        }
        if (this.f4599e.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // C.InterfaceC0233p
    public void d(View view, int i4, int i5, int i6, int i7, int i8, int[] iArr) {
        H(i7, i8, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f4, float f5, boolean z3) {
        return this.f4620z.a(f4, f5, z3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f4, float f5) {
        return this.f4620z.b(f4, f5);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i4, int i5, int[] iArr, int[] iArr2) {
        return o(i4, i5, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i4, int i5, int i6, int i7, int[] iArr) {
        return this.f4620z.f(i4, i5, i6, i7, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f4600f.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f4600f.setSize(width, height);
            if (this.f4600f.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f4601g.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f4601g.setSize(width2, height2);
        if (this.f4601g.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // C.InterfaceC0232o
    public void e(View view, int i4, int i5, int i6, int i7, int i8) {
        H(i7, i8, null);
    }

    @Override // C.InterfaceC0232o
    public boolean f(View view, View view2, int i4, int i5) {
        return (i4 & 2) != 0;
    }

    public final void g() {
        this.f4599e.abortAnimation();
        Z(1);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f4619y.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f4593A == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4593A = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4593A;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public boolean i(int i4) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i4);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i4 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i4 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i4 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f4598d);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f4598d);
            P(m(this.f4598d), 0, 1, true);
            viewFindNextFocus.requestFocus(i4);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f4620z.m();
    }

    public final boolean j() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    public final boolean k() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public int m(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i5 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i4 - verticalFadingEdgeLength : i4;
        int i6 = rect.bottom;
        if (i6 > i5 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i5, (childAt.getBottom() + layoutParams.bottomMargin) - i4);
        }
        if (rect.top >= scrollY || i6 >= i5) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i5 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i4, int i5) {
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i4, int i5, int i6, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public int n(int i4) {
        int height = getHeight();
        if (i4 > 0 && H.c.b(this.f4600f) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * H.c.d(this.f4600f, ((-i4) * 4.0f) / height, 0.5f));
            if (iRound != i4) {
                this.f4600f.finish();
            }
            return i4 - iRound;
        }
        if (i4 >= 0 || H.c.b(this.f4601g) == 0.0f) {
            return i4;
        }
        float f4 = height;
        int iRound2 = Math.round((f4 / 4.0f) * H.c.d(this.f4601g, (i4 * 4.0f) / f4, 0.5f));
        if (iRound2 != i4) {
            this.f4601g.finish();
        }
        return i4 - iRound2;
    }

    public boolean o(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        return this.f4620z.d(i4, i5, iArr, iArr2, i6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4604j = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i4;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f4606l) {
            if (AbstractC0230m.a(motionEvent, 2)) {
                i4 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (AbstractC0230m.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i4 = 26;
                axisValue = axisValue2;
            } else {
                i4 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                P(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, AbstractC0230m.a(motionEvent, 8194));
                if (i4 != 0) {
                    this.f4595C.g(motionEvent, i4);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        int measuredHeight = 0;
        this.f4603i = false;
        View view = this.f4605k;
        if (view != null && F(view, this)) {
            Q(this.f4605k);
        }
        this.f4605k = null;
        if (!this.f4604j) {
            if (this.f4618x != null) {
                scrollTo(getScrollX(), this.f4618x.f4622m);
                this.f4618x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iL = l(scrollY, paddingTop, measuredHeight);
            if (iL != scrollY) {
                scrollTo(getScrollX(), iL);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4604j = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f4608n && View.MeasureSpec.getMode(i5) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f4, float f5, boolean z3) {
        if (z3) {
            return false;
        }
        dispatchNestedFling(0.0f, f5, true);
        v((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f4, float f5) {
        return dispatchNestedPreFling(f4, f5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        c(view, i4, i5, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
        H(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i4) {
        a(view, view2, i4, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i4, int i5, boolean z3, boolean z4) {
        super.scrollTo(i4, i5);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i4, Rect rect) {
        if (i4 == 2) {
            i4 = 130;
        } else if (i4 == 1) {
            i4 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i4) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i4);
        if (viewFindNextFocus == null || E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i4, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f4618x = eVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f4622m = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
    }

    @Override // android.view.View
    public void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, i7)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f4598d);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f4598d);
        q(m(this.f4598d));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        return f(view, view2, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        b(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4616v = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f4616v);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f4607m;
                velocityTracker.computeCurrentVelocity(1000, this.f4612r);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f4613s);
                if (Math.abs(yVelocity) >= this.f4611q) {
                    if (!r(yVelocity)) {
                        int i4 = -yVelocity;
                        float f4 = i4;
                        if (!dispatchNestedPreFling(0.0f, f4)) {
                            dispatchNestedFling(0.0f, f4, true);
                            v(i4);
                        }
                    }
                } else if (this.f4599e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f4613s);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f4613s + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    int i5 = this.f4602h - y3;
                    int iM = i5 - M(i5, motionEvent.getX(iFindPointerIndex));
                    if (!this.f4606l && Math.abs(iM) > this.f4610p) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f4606l = true;
                        iM = iM > 0 ? iM - this.f4610p : iM + this.f4610p;
                    }
                    if (this.f4606l) {
                        int iP = P(iM, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f4602h = y3 - iP;
                        this.f4616v += iP;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f4606l && getChildCount() > 0 && this.f4599e.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f4602h = (int) motionEvent.getY(actionIndex);
                this.f4613s = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f4602h = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f4613s));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f4606l && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f4599e.isFinished()) {
                g();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f4607m;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        this.f4620z.e(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public final void q(int i4) {
        if (i4 != 0) {
            if (this.f4609o) {
                T(0, i4);
            } else {
                scrollBy(0, i4);
            }
        }
    }

    public final boolean r(int i4) {
        if (H.c.b(this.f4600f) != 0.0f) {
            if (S(this.f4600f, i4)) {
                this.f4600f.onAbsorb(i4);
                return true;
            }
            v(-i4);
            return true;
        }
        if (H.c.b(this.f4601g) == 0.0f) {
            return false;
        }
        int i5 = -i4;
        if (S(this.f4601g, i5)) {
            this.f4601g.onAbsorb(i5);
            return true;
        }
        v(i5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f4603i) {
            this.f4605k = view2;
        } else {
            Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z3) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z3) {
        if (z3) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z3);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f4603i = true;
        super.requestLayout();
    }

    public final void s() {
        this.f4613s = -1;
        this.f4606l = false;
        L();
        Z(0);
        this.f4600f.onRelease();
        this.f4601g.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iL = l(i4, width, width2);
            int iL2 = l(i5, height, height2);
            if (iL == getScrollX() && iL2 == getScrollY()) {
                return;
            }
            super.scrollTo(iL, iL2);
        }
    }

    public void setFillViewport(boolean z3) {
        if (z3 != this.f4608n) {
            this.f4608n = z3;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z3) {
        this.f4620z.n(z3);
    }

    public void setOnScrollChangeListener(d dVar) {
    }

    public void setSmoothScrollingEnabled(boolean z3) {
        this.f4609o = z3;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i4) {
        return X(i4, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f4598d.setEmpty();
        if (!k()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : i(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : i(130);
            }
            if (keyCode == 62) {
                K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return w(33);
            }
            if (keyCode == 93) {
                return w(130);
            }
            if (keyCode == 122) {
                K(33);
                return false;
            }
            if (keyCode == 123) {
                K(130);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View u(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.u(boolean, int, int):android.view.View");
    }

    public void v(int i4) {
        if (getChildCount() > 0) {
            this.f4599e.fling(getScrollX(), getScrollY(), 0, i4, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
        }
    }

    public boolean w(int i4) {
        int childCount;
        boolean z3 = i4 == 130;
        int height = getHeight();
        Rect rect = this.f4598d;
        rect.top = 0;
        rect.bottom = height;
        if (z3 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f4598d.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f4598d;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f4598d;
        return O(i4, rect3.top, rect3.bottom);
    }

    public final float x(int i4) {
        double dLog = Math.log((Math.abs(i4) * 0.35f) / (this.f4596b * 0.015f));
        float f4 = f4590D;
        return (float) (((double) (this.f4596b * 0.015f)) * Math.exp((((double) f4) / (((double) f4) - 1.0d)) * dLog));
    }

    public boolean y(int i4) {
        return this.f4620z.l(i4);
    }

    public final boolean z(int i4, int i5) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i5 >= childAt.getTop() - scrollY && i5 < childAt.getBottom() - scrollY && i4 >= childAt.getLeft() && i4 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4598d = new Rect();
        this.f4603i = true;
        this.f4604j = false;
        this.f4605k = null;
        this.f4606l = false;
        this.f4609o = true;
        this.f4613s = -1;
        this.f4614t = new int[2];
        this.f4615u = new int[2];
        c cVar = new c();
        this.f4594B = cVar;
        this.f4595C = new C0222e(getContext(), cVar);
        this.f4600f = H.c.a(context, attributeSet);
        this.f4601g = H.c.a(context, attributeSet);
        this.f4596b = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4592F, i4, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f4619y = new C0234q(this);
        this.f4620z = new C0231n(this);
        setNestedScrollingEnabled(true);
        AbstractC0241y.F(this, f4591E);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4) {
        if (getChildCount() <= 0) {
            super.addView(view, i4);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
