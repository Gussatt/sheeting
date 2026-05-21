package R;

import C.AbstractC0241y;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: R.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0500s extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f3302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f3303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f3304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3305e;

    /* JADX INFO: renamed from: R.s$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f3306a = new a();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
            X2.l.e(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            X2.l.e(view, "v");
            X2.l.e(windowInsets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            X2.l.d(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0500s(Context context, AttributeSet attributeSet, B b4) {
        String str;
        super(context, attributeSet);
        X2.l.e(context, "context");
        X2.l.e(attributeSet, "attrs");
        X2.l.e(b4, "fm");
        this.f3302b = new ArrayList();
        this.f3303c = new ArrayList();
        this.f3305e = true;
        String classAttribute = attributeSet.getClassAttribute();
        int[] iArr = Q.c.f2916e;
        X2.l.d(iArr, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(Q.c.f2917f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(Q.c.f2918g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oP = b4.P(id);
        if (classAttribute != null && abstractComponentCallbacksC0497oP == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497oA = b4.a0().a(context.getClassLoader(), classAttribute);
            X2.l.d(abstractComponentCallbacksC0497oA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            abstractComponentCallbacksC0497oA.f3270y = id;
            abstractComponentCallbacksC0497oA.f3271z = id;
            abstractComponentCallbacksC0497oA.f3219A = string;
            abstractComponentCallbacksC0497oA.f3267v = b4;
            b4.b0();
            abstractComponentCallbacksC0497oA.q0(context, attributeSet, null);
            b4.k().h(true).c(this, abstractComponentCallbacksC0497oA, string).e();
        }
        b4.v0(this);
    }

    public final void a(View view) {
        if (this.f3303c.contains(view)) {
            this.f3302b.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        X2.l.e(view, "child");
        if (B.h0(view) != null) {
            super.addView(view, i4, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        C.F fY;
        X2.l.e(windowInsets, "insets");
        C.F fO = C.F.o(windowInsets);
        X2.l.d(fO, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f3304d;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f3306a;
            X2.l.b(onApplyWindowInsetsListener);
            fY = C.F.o(aVar.a(onApplyWindowInsetsListener, this, windowInsets));
        } else {
            fY = AbstractC0241y.y(this, fO);
        }
        X2.l.d(fY, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!fY.h()) {
            int childCount = getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                AbstractC0241y.b(getChildAt(i4), fY);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        X2.l.e(canvas, "canvas");
        if (this.f3305e) {
            Iterator it = this.f3302b.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j4) {
        X2.l.e(canvas, "canvas");
        X2.l.e(view, "child");
        if (this.f3305e && !this.f3302b.isEmpty() && this.f3302b.contains(view)) {
            return false;
        }
        return super.drawChild(canvas, view, j4);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        X2.l.e(view, "view");
        this.f3303c.remove(view);
        if (this.f3302b.remove(view)) {
            this.f3305e = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends AbstractComponentCallbacksC0497o> F getFragment() {
        return (F) B.R(this).P(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        X2.l.e(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                X2.l.d(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        X2.l.e(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i4) {
        View childAt = getChildAt(i4);
        X2.l.d(childAt, "view");
        a(childAt);
        super.removeViewAt(i4);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        X2.l.e(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            X2.l.d(childAt, "view");
            a(childAt);
        }
        super.removeViews(i4, i5);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i4, int i5) {
        int i6 = i4 + i5;
        for (int i7 = i4; i7 < i6; i7++) {
            View childAt = getChildAt(i7);
            X2.l.d(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i4, i5);
    }

    public final void setDrawDisappearingViewsLast(boolean z3) {
        this.f3305e = z3;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        X2.l.e(onApplyWindowInsetsListener, "listener");
        this.f3304d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        X2.l.e(view, "view");
        if (view.getParent() == this) {
            this.f3303c.add(view);
        }
        super.startViewTransition(view);
    }
}
