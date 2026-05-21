package androidx.appcompat.widget;

import C.AbstractC0241y;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.AbstractC0637a;
import c.AbstractC0641e;
import c.AbstractC0642f;
import c.AbstractC0645i;
import k.AbstractC1112a;
import k.a0;
import k.g0;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC1112a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f4265i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f4266j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f4267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f4268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f4269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f4270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f4271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4275s;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0637a.f5559d);
    }

    public final void d() {
        if (this.f4269m == null) {
            LayoutInflater.from(getContext()).inflate(AbstractC0642f.f5666a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f4269m = linearLayout;
            this.f4270n = (TextView) linearLayout.findViewById(AbstractC0641e.f5644e);
            this.f4271o = (TextView) this.f4269m.findViewById(AbstractC0641e.f5643d);
            if (this.f4272p != 0) {
                this.f4270n.setTextAppearance(getContext(), this.f4272p);
            }
            if (this.f4273q != 0) {
                this.f4271o.setTextAppearance(getContext(), this.f4273q);
            }
        }
        this.f4270n.setText(this.f4265i);
        this.f4271o.setText(this.f4266j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f4265i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f4266j);
        this.f4271o.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f4269m.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f4269m.getParent() == null) {
            addView(this.f4269m);
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // k.AbstractC1112a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // k.AbstractC1112a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f4266j;
    }

    public CharSequence getTitle() {
        return this.f4265i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f8772e;
        if (aVar != null) {
            aVar.y();
            this.f8772e.z();
        }
    }

    @Override // k.AbstractC1112a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() != 32) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            return;
        }
        accessibilityEvent.setSource(this);
        accessibilityEvent.setClassName(getClass().getName());
        accessibilityEvent.setPackageName(getContext().getPackageName());
        accessibilityEvent.setContentDescription(this.f4265i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        boolean zB = g0.b(this);
        int paddingRight = zB ? (i6 - i4) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i7 - i5) - getPaddingTop()) - getPaddingBottom();
        View view = this.f4267k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4267k.getLayoutParams();
            int i8 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i9 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iB = AbstractC1112a.b(paddingRight, i8, zB);
            paddingRight = AbstractC1112a.b(iB + c(this.f4267k, iB, paddingTop, paddingTop2, zB), i9, zB);
        }
        int iC = paddingRight;
        LinearLayout linearLayout = this.f4269m;
        if (linearLayout != null && this.f4268l == null && linearLayout.getVisibility() != 8) {
            iC += c(this.f4269m, iC, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f4268l;
        if (view2 != null) {
            c(view2, iC, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i6 - i4) - getPaddingRight();
        ActionMenuView actionMenuView = this.f8771d;
        if (actionMenuView != null) {
            c(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        if (View.MeasureSpec.getMode(i4) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i5) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i4);
        int size2 = this.f8773f;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i5);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f4267k;
        if (view != null) {
            int iA = a(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4267k.getLayoutParams();
            paddingLeft = iA - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f8771d;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = a(this.f8771d, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f4269m;
        if (linearLayout != null && this.f4268l == null) {
            if (this.f4274r) {
                this.f4269m.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f4269m.getMeasuredWidth();
                boolean z3 = measuredWidth <= paddingLeft;
                if (z3) {
                    paddingLeft -= measuredWidth;
                }
                this.f4269m.setVisibility(z3 ? 0 : 8);
            } else {
                paddingLeft = a(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f4268l;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i6 = layoutParams.width;
            int i7 = i6 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i6 >= 0) {
                paddingLeft = Math.min(i6, paddingLeft);
            }
            int i8 = layoutParams.height;
            int i9 = i8 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i8 >= 0) {
                iMin = Math.min(i8, iMin);
            }
            this.f4268l.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i7), View.MeasureSpec.makeMeasureSpec(iMin, i9));
        }
        if (this.f8773f > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            int measuredHeight = getChildAt(i11).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i10) {
                i10 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i10);
    }

    @Override // k.AbstractC1112a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // k.AbstractC1112a
    public void setContentHeight(int i4) {
        this.f8773f = i4;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f4268l;
        if (view2 != null) {
            removeView(view2);
        }
        this.f4268l = view;
        if (view != null && (linearLayout = this.f4269m) != null) {
            removeView(linearLayout);
            this.f4269m = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f4266j = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f4265i = charSequence;
        d();
    }

    public void setTitleOptional(boolean z3) {
        if (z3 != this.f4274r) {
            requestLayout();
        }
        this.f4274r = z3;
    }

    @Override // k.AbstractC1112a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i4) {
        super.setVisibility(i4);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        a0 a0VarR = a0.r(context, attributeSet, AbstractC0645i.f5894w, i4, 0);
        AbstractC0241y.G(this, a0VarR.f(AbstractC0645i.f5898x));
        this.f4272p = a0VarR.l(AbstractC0645i.f5696B, 0);
        this.f4273q = a0VarR.l(AbstractC0645i.f5692A, 0);
        this.f8773f = a0VarR.k(AbstractC0645i.f5906z, 0);
        this.f4275s = a0VarR.l(AbstractC0645i.f5902y, AbstractC0642f.f5669d);
        a0VarR.s();
    }
}
