package androidx.appcompat.widget;

import C.AbstractC0241y;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import c.AbstractC0641e;
import c.AbstractC0645i;
import k.C1113b;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f4256c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f4257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f4258e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f4259f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f4260g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f4261h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4262i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4263j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4264k;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC0241y.G(this, new C1113b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645i.f5796a);
        this.f4259f = typedArrayObtainStyledAttributes.getDrawable(AbstractC0645i.f5801b);
        this.f4260g = typedArrayObtainStyledAttributes.getDrawable(AbstractC0645i.f5811d);
        this.f4264k = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0645i.f5836i, -1);
        boolean z3 = true;
        if (getId() == AbstractC0641e.f5663x) {
            this.f4262i = true;
            this.f4261h = typedArrayObtainStyledAttributes.getDrawable(AbstractC0645i.f5806c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f4262i ? this.f4259f != null || this.f4260g != null : this.f4261h != null) {
            z3 = false;
        }
        setWillNotDraw(z3);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f4259f;
        if (drawable != null && drawable.isStateful()) {
            this.f4259f.setState(getDrawableState());
        }
        Drawable drawable2 = this.f4260g;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f4260g.setState(getDrawableState());
        }
        Drawable drawable3 = this.f4261h;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f4261h.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f4256c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4259f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4260g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f4261h;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4257d = findViewById(AbstractC0641e.f5640a);
        this.f4258e = findViewById(AbstractC0641e.f5645f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f4255b || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r6, int r7, int r8, int r9, int r10) {
        /*
            r5 = this;
            super.onLayout(r6, r7, r8, r9, r10)
            r6 = r5
            android.view.View r8 = r6.f4256c
            r10 = 8
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L14
            int r2 = r8.getVisibility()
            if (r2 == r10) goto L14
            r2 = r0
            goto L15
        L14:
            r2 = r1
        L15:
            if (r8 == 0) goto L34
            int r3 = r8.getVisibility()
            if (r3 == r10) goto L34
            int r10 = r5.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r3 = r8.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r4 = r8.getMeasuredHeight()
            int r4 = r10 - r4
            int r3 = r3.bottomMargin
            int r4 = r4 - r3
            int r10 = r10 - r3
            r8.layout(r7, r4, r9, r10)
        L34:
            boolean r7 = r6.f4262i
            if (r7 == 0) goto L4c
            android.graphics.drawable.Drawable r7 = r6.f4261h
            if (r7 == 0) goto L49
            int r8 = r5.getMeasuredWidth()
            int r9 = r5.getMeasuredHeight()
            r7.setBounds(r1, r1, r8, r9)
            goto Lbf
        L49:
            r0 = r1
            goto Lbf
        L4c:
            android.graphics.drawable.Drawable r7 = r6.f4259f
            if (r7 == 0) goto La4
            android.view.View r7 = r6.f4257d
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L76
            android.graphics.drawable.Drawable r7 = r6.f4259f
            android.view.View r9 = r6.f4257d
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f4257d
            int r10 = r10.getTop()
            android.view.View r1 = r6.f4257d
            int r1 = r1.getRight()
            android.view.View r3 = r6.f4257d
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L76:
            android.view.View r7 = r6.f4258e
            if (r7 == 0) goto L9e
            int r7 = r7.getVisibility()
            if (r7 != 0) goto L9e
            android.graphics.drawable.Drawable r7 = r6.f4259f
            android.view.View r9 = r6.f4258e
            int r9 = r9.getLeft()
            android.view.View r10 = r6.f4258e
            int r10 = r10.getTop()
            android.view.View r1 = r6.f4258e
            int r1 = r1.getRight()
            android.view.View r3 = r6.f4258e
            int r3 = r3.getBottom()
            r7.setBounds(r9, r10, r1, r3)
            goto La3
        L9e:
            android.graphics.drawable.Drawable r7 = r6.f4259f
            r7.setBounds(r1, r1, r1, r1)
        La3:
            r1 = r0
        La4:
            r6.f4263j = r2
            if (r2 == 0) goto L49
            android.graphics.drawable.Drawable r7 = r6.f4260g
            if (r7 == 0) goto L49
            int r9 = r8.getLeft()
            int r10 = r8.getTop()
            int r1 = r8.getRight()
            int r8 = r8.getBottom()
            r7.setBounds(r9, r10, r1, r8)
        Lbf:
            if (r0 == 0) goto Lc4
            r5.invalidate()
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarContainer.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        if (this.f4257d == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i6 = this.f4264k) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i6, View.MeasureSpec.getSize(i5)), Integer.MIN_VALUE);
        }
        super.onMeasure(i4, i5);
        if (this.f4257d == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i5);
        View view = this.f4256c;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min((!b(this.f4257d) ? a(this.f4257d) : !b(this.f4258e) ? a(this.f4258e) : 0) + a(this.f4256c), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i5) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f4259f;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f4259f);
        }
        this.f4259f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f4257d;
            if (view != null) {
                this.f4259f.setBounds(view.getLeft(), this.f4257d.getTop(), this.f4257d.getRight(), this.f4257d.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f4262i ? !(this.f4259f != null || this.f4260g != null) : this.f4261h == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4261h;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4261h);
        }
        this.f4261h = drawable;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4262i && (drawable2 = this.f4261h) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f4262i ? !(this.f4259f != null || this.f4260g != null) : this.f4261h == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f4260g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f4260g);
        }
        this.f4260g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f4263j && (drawable2 = this.f4260g) != null) {
                drawable2.setBounds(this.f4256c.getLeft(), this.f4256c.getTop(), this.f4256c.getRight(), this.f4256c.getBottom());
            }
        }
        boolean z3 = false;
        if (!this.f4262i ? !(this.f4259f != null || this.f4260g != null) : this.f4261h == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(c cVar) {
        View view = this.f4256c;
        if (view != null) {
            removeView(view);
        }
        this.f4256c = cVar;
    }

    public void setTransitioning(boolean z3) {
        this.f4255b = z3;
        setDescendantFocusability(z3 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        boolean z3 = i4 == 0;
        Drawable drawable = this.f4259f;
        if (drawable != null) {
            drawable.setVisible(z3, false);
        }
        Drawable drawable2 = this.f4260g;
        if (drawable2 != null) {
            drawable2.setVisible(z3, false);
        }
        Drawable drawable3 = this.f4261h;
        if (drawable3 != null) {
            drawable3.setVisible(z3, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f4259f && !this.f4262i) {
            return true;
        }
        if (drawable == this.f4260g && this.f4263j) {
            return true;
        }
        return (drawable == this.f4261h && this.f4262i) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
