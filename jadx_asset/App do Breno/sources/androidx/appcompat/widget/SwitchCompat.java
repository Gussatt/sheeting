package androidx.appcompat.widget;

import C.AbstractC0241y;
import H.g;
import android.R;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import c.AbstractC0637a;
import c.AbstractC0645i;
import e.AbstractC0921a;
import h.C0971a;
import k.C1131u;
import k.G;
import k.a0;
import k.g0;
import w.AbstractC1594a;

/* JADX INFO: loaded from: classes.dex */
public class SwitchCompat extends CompoundButton {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final Property f4409O = new a(Float.class, "thumbPos");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public static final int[] f4410P = {R.attr.state_checked};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4411A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4412B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public int f4413C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4414D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f4415E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f4416F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final TextPaint f4417G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ColorStateList f4418H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public Layout f4419I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Layout f4420J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public TransformationMethod f4421K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public ObjectAnimator f4422L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final C1131u f4423M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final Rect f4424N;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f4425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f4426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f4427d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f4428e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f4430g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ColorStateList f4431h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f4432i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4433j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4434k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4436m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4437n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f4439p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f4440q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4441r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4442s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4443t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f4444u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public float f4445v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VelocityTracker f4446w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4447x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f4448y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4449z;

    public static class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(SwitchCompat switchCompat) {
            return Float.valueOf(switchCompat.f4448y);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(SwitchCompat switchCompat, Float f4) {
            switchCompat.setThumbPosition(f4.floatValue());
        }
    }

    public SwitchCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0637a.f5572q);
    }

    public static float f(float f4, float f5, float f6) {
        return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
    }

    private boolean getTargetCheckedState() {
        return this.f4448y > 0.5f;
    }

    private int getThumbOffset() {
        return (int) (((g0.b(this) ? 1.0f - this.f4448y : this.f4448y) * getThumbScrollRange()) + 0.5f);
    }

    private int getThumbScrollRange() {
        Drawable drawable = this.f4430g;
        if (drawable == null) {
            return 0;
        }
        Rect rect = this.f4424N;
        drawable.getPadding(rect);
        Drawable drawable2 = this.f4425b;
        Rect rectC = drawable2 != null ? G.c(drawable2) : G.f8635c;
        return ((((this.f4449z - this.f4412B) - rect.left) - rect.right) - rectC.left) - rectC.right;
    }

    public final void a(boolean z3) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<SwitchCompat, Float>) f4409O, z3 ? 1.0f : 0.0f);
        this.f4422L = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(250L);
        this.f4422L.setAutoCancel(true);
        this.f4422L.start();
    }

    public final void b() {
        Drawable drawable = this.f4425b;
        if (drawable != null) {
            if (this.f4428e || this.f4429f) {
                Drawable drawableMutate = AbstractC1594a.j(drawable).mutate();
                this.f4425b = drawableMutate;
                if (this.f4428e) {
                    AbstractC1594a.g(drawableMutate, this.f4426c);
                }
                if (this.f4429f) {
                    AbstractC1594a.h(this.f4425b, this.f4427d);
                }
                if (this.f4425b.isStateful()) {
                    this.f4425b.setState(getDrawableState());
                }
            }
        }
    }

    public final void c() {
        Drawable drawable = this.f4430g;
        if (drawable != null) {
            if (this.f4433j || this.f4434k) {
                Drawable drawableMutate = AbstractC1594a.j(drawable).mutate();
                this.f4430g = drawableMutate;
                if (this.f4433j) {
                    AbstractC1594a.g(drawableMutate, this.f4431h);
                }
                if (this.f4434k) {
                    AbstractC1594a.h(this.f4430g, this.f4432i);
                }
                if (this.f4430g.isStateful()) {
                    this.f4430g.setState(getDrawableState());
                }
            }
        }
    }

    public final void d() {
        ObjectAnimator objectAnimator = this.f4422L;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i4;
        int i5;
        Rect rect = this.f4424N;
        int i6 = this.f4413C;
        int i7 = this.f4414D;
        int i8 = this.f4415E;
        int i9 = this.f4416F;
        int thumbOffset = getThumbOffset() + i6;
        Drawable drawable = this.f4425b;
        Rect rectC = drawable != null ? G.c(drawable) : G.f8635c;
        Drawable drawable2 = this.f4430g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            int i10 = rect.left;
            thumbOffset += i10;
            if (rectC != null) {
                int i11 = rectC.left;
                if (i11 > i10) {
                    i6 += i11 - i10;
                }
                int i12 = rectC.top;
                int i13 = rect.top;
                i4 = i12 > i13 ? (i12 - i13) + i7 : i7;
                int i14 = rectC.right;
                int i15 = rect.right;
                if (i14 > i15) {
                    i8 -= i14 - i15;
                }
                int i16 = rectC.bottom;
                int i17 = rect.bottom;
                if (i16 > i17) {
                    i5 = i9 - (i16 - i17);
                }
                this.f4430g.setBounds(i6, i4, i8, i5);
            } else {
                i4 = i7;
            }
            i5 = i9;
            this.f4430g.setBounds(i6, i4, i8, i5);
        }
        Drawable drawable3 = this.f4425b;
        if (drawable3 != null) {
            drawable3.getPadding(rect);
            int i18 = thumbOffset - rect.left;
            int i19 = thumbOffset + this.f4412B + rect.right;
            this.f4425b.setBounds(i18, i7, i19, i9);
            Drawable background = getBackground();
            if (background != null) {
                AbstractC1594a.e(background, i18, i7, i19, i9);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableHotspotChanged(float f4, float f5) {
        super.drawableHotspotChanged(f4, f5);
        Drawable drawable = this.f4425b;
        if (drawable != null) {
            AbstractC1594a.d(drawable, f4, f5);
        }
        Drawable drawable2 = this.f4430g;
        if (drawable2 != null) {
            AbstractC1594a.d(drawable2, f4, f5);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f4425b;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.f4430g;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    public final void e(MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(3);
        super.onTouchEvent(motionEventObtain);
        motionEventObtain.recycle();
    }

    public final boolean g(float f4, float f5) {
        if (this.f4425b == null) {
            return false;
        }
        int thumbOffset = getThumbOffset();
        this.f4425b.getPadding(this.f4424N);
        int i4 = this.f4414D;
        int i5 = this.f4443t;
        int i6 = i4 - i5;
        int i7 = (this.f4413C + thumbOffset) - i5;
        int i8 = this.f4412B + i7;
        Rect rect = this.f4424N;
        return f4 > ((float) i7) && f4 < ((float) (((i8 + rect.left) + rect.right) + i5)) && f5 > ((float) i6) && f5 < ((float) (this.f4416F + i5));
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        if (!g0.b(this)) {
            return super.getCompoundPaddingLeft();
        }
        int compoundPaddingLeft = super.getCompoundPaddingLeft() + this.f4449z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingLeft + this.f4437n : compoundPaddingLeft;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingRight() {
        if (g0.b(this)) {
            return super.getCompoundPaddingRight();
        }
        int compoundPaddingRight = super.getCompoundPaddingRight() + this.f4449z;
        return !TextUtils.isEmpty(getText()) ? compoundPaddingRight + this.f4437n : compoundPaddingRight;
    }

    public boolean getShowText() {
        return this.f4441r;
    }

    public boolean getSplitTrack() {
        return this.f4438o;
    }

    public int getSwitchMinWidth() {
        return this.f4436m;
    }

    public int getSwitchPadding() {
        return this.f4437n;
    }

    public CharSequence getTextOff() {
        return this.f4440q;
    }

    public CharSequence getTextOn() {
        return this.f4439p;
    }

    public Drawable getThumbDrawable() {
        return this.f4425b;
    }

    public int getThumbTextPadding() {
        return this.f4435l;
    }

    public ColorStateList getThumbTintList() {
        return this.f4426c;
    }

    public PorterDuff.Mode getThumbTintMode() {
        return this.f4427d;
    }

    public Drawable getTrackDrawable() {
        return this.f4430g;
    }

    public ColorStateList getTrackTintList() {
        return this.f4431h;
    }

    public PorterDuff.Mode getTrackTintMode() {
        return this.f4432i;
    }

    public final Layout h(CharSequence charSequence) {
        TransformationMethod transformationMethod = this.f4421K;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, this);
        }
        CharSequence charSequence2 = charSequence;
        return new StaticLayout(charSequence2, this.f4417G, charSequence2 != null ? (int) Math.ceil(Layout.getDesiredWidth(charSequence2, r2)) : 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
    }

    public void i(Context context, int i4) {
        a0 a0VarP = a0.p(context, i4, AbstractC0645i.f5857m2);
        ColorStateList colorStateListC = a0VarP.c(AbstractC0645i.f5873q2);
        if (colorStateListC != null) {
            this.f4418H = colorStateListC;
        } else {
            this.f4418H = getTextColors();
        }
        int iE = a0VarP.e(AbstractC0645i.f5861n2, 0);
        if (iE != 0) {
            float f4 = iE;
            if (f4 != this.f4417G.getTextSize()) {
                this.f4417G.setTextSize(f4);
                requestLayout();
            }
        }
        k(a0VarP.i(AbstractC0645i.f5865o2, -1), a0VarP.i(AbstractC0645i.f5869p2, -1));
        if (a0VarP.a(AbstractC0645i.f5893v2, false)) {
            this.f4421K = new C0971a(getContext());
        } else {
            this.f4421K = null;
        }
        a0VarP.s();
    }

    public void j(Typeface typeface, int i4) {
        if (i4 <= 0) {
            this.f4417G.setFakeBoldText(false);
            this.f4417G.setTextSkewX(0.0f);
            setSwitchTypeface(typeface);
        } else {
            Typeface typefaceDefaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i4) : Typeface.create(typeface, i4);
            setSwitchTypeface(typefaceDefaultFromStyle);
            int i5 = (~(typefaceDefaultFromStyle != null ? typefaceDefaultFromStyle.getStyle() : 0)) & i4;
            this.f4417G.setFakeBoldText((i5 & 1) != 0);
            this.f4417G.setTextSkewX((i5 & 2) != 0 ? -0.25f : 0.0f);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f4425b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f4430g;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        ObjectAnimator objectAnimator = this.f4422L;
        if (objectAnimator == null || !objectAnimator.isStarted()) {
            return;
        }
        this.f4422L.end();
        this.f4422L = null;
    }

    public final void k(int i4, int i5) {
        j(i4 != 1 ? i4 != 2 ? i4 != 3 ? null : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF, i5);
    }

    public final void l(MotionEvent motionEvent) {
        this.f4442s = 0;
        boolean targetCheckedState = true;
        boolean z3 = motionEvent.getAction() == 1 && isEnabled();
        boolean zIsChecked = isChecked();
        if (z3) {
            this.f4446w.computeCurrentVelocity(1000);
            float xVelocity = this.f4446w.getXVelocity();
            if (Math.abs(xVelocity) <= this.f4447x) {
                targetCheckedState = getTargetCheckedState();
            } else if (!g0.b(this) ? xVelocity <= 0.0f : xVelocity >= 0.0f) {
                targetCheckedState = false;
            }
        } else {
            targetCheckedState = zIsChecked;
        }
        if (targetCheckedState != zIsChecked) {
            playSoundEffect(0);
        }
        setChecked(targetCheckedState);
        e(motionEvent);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i4) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i4 + 1);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f4410P);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int width;
        super.onDraw(canvas);
        Rect rect = this.f4424N;
        Drawable drawable = this.f4430g;
        if (drawable != null) {
            drawable.getPadding(rect);
        } else {
            rect.setEmpty();
        }
        int i4 = this.f4414D;
        int i5 = this.f4416F;
        int i6 = i4 + rect.top;
        int i7 = i5 - rect.bottom;
        Drawable drawable2 = this.f4425b;
        if (drawable != null) {
            if (!this.f4438o || drawable2 == null) {
                drawable.draw(canvas);
            } else {
                Rect rectC = G.c(drawable2);
                drawable2.copyBounds(rect);
                rect.left += rectC.left;
                rect.right -= rectC.right;
                int iSave = canvas.save();
                canvas.clipRect(rect, Region.Op.DIFFERENCE);
                drawable.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        int iSave2 = canvas.save();
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Layout layout = getTargetCheckedState() ? this.f4419I : this.f4420J;
        if (layout != null) {
            int[] drawableState = getDrawableState();
            ColorStateList colorStateList = this.f4418H;
            if (colorStateList != null) {
                this.f4417G.setColor(colorStateList.getColorForState(drawableState, 0));
            }
            this.f4417G.drawableState = drawableState;
            if (drawable2 != null) {
                Rect bounds = drawable2.getBounds();
                width = bounds.left + bounds.right;
            } else {
                width = getWidth();
            }
            canvas.translate((width / 2) - (layout.getWidth() / 2), ((i6 + i7) / 2) - (layout.getHeight() / 2));
            layout.draw(canvas);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("android.widget.Switch");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        CharSequence charSequence = isChecked() ? this.f4439p : this.f4440q;
        if (TextUtils.isEmpty(charSequence)) {
            return;
        }
        CharSequence text = accessibilityNodeInfo.getText();
        if (TextUtils.isEmpty(text)) {
            accessibilityNodeInfo.setText(charSequence);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(text);
        sb.append(' ');
        sb.append(charSequence);
        accessibilityNodeInfo.setText(sb);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int iMax;
        int width;
        int paddingLeft;
        int i8;
        int paddingTop;
        int height;
        super.onLayout(z3, i4, i5, i6, i7);
        int iMax2 = 0;
        if (this.f4425b != null) {
            Rect rect = this.f4424N;
            Drawable drawable = this.f4430g;
            if (drawable != null) {
                drawable.getPadding(rect);
            } else {
                rect.setEmpty();
            }
            Rect rectC = G.c(this.f4425b);
            iMax = Math.max(0, rectC.left - rect.left);
            iMax2 = Math.max(0, rectC.right - rect.right);
        } else {
            iMax = 0;
        }
        if (g0.b(this)) {
            paddingLeft = getPaddingLeft() + iMax;
            width = ((this.f4449z + paddingLeft) - iMax) - iMax2;
        } else {
            width = (getWidth() - getPaddingRight()) - iMax2;
            paddingLeft = (width - this.f4449z) + iMax + iMax2;
        }
        int gravity = getGravity() & 112;
        if (gravity == 16) {
            int paddingTop2 = ((getPaddingTop() + getHeight()) - getPaddingBottom()) / 2;
            i8 = this.f4411A;
            paddingTop = paddingTop2 - (i8 / 2);
        } else {
            if (gravity == 80) {
                height = getHeight() - getPaddingBottom();
                paddingTop = height - this.f4411A;
                this.f4413C = paddingLeft;
                this.f4414D = paddingTop;
                this.f4416F = height;
                this.f4415E = width;
            }
            paddingTop = getPaddingTop();
            i8 = this.f4411A;
        }
        height = i8 + paddingTop;
        this.f4413C = paddingLeft;
        this.f4414D = paddingTop;
        this.f4416F = height;
        this.f4415E = width;
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        int intrinsicWidth;
        int intrinsicHeight;
        if (this.f4441r) {
            if (this.f4419I == null) {
                this.f4419I = h(this.f4439p);
            }
            if (this.f4420J == null) {
                this.f4420J = h(this.f4440q);
            }
        }
        Rect rect = this.f4424N;
        Drawable drawable = this.f4425b;
        int intrinsicHeight2 = 0;
        if (drawable != null) {
            drawable.getPadding(rect);
            intrinsicWidth = (this.f4425b.getIntrinsicWidth() - rect.left) - rect.right;
            intrinsicHeight = this.f4425b.getIntrinsicHeight();
        } else {
            intrinsicWidth = 0;
            intrinsicHeight = 0;
        }
        this.f4412B = Math.max(this.f4441r ? Math.max(this.f4419I.getWidth(), this.f4420J.getWidth()) + (this.f4435l * 2) : 0, intrinsicWidth);
        Drawable drawable2 = this.f4430g;
        if (drawable2 != null) {
            drawable2.getPadding(rect);
            intrinsicHeight2 = this.f4430g.getIntrinsicHeight();
        } else {
            rect.setEmpty();
        }
        int iMax = rect.left;
        int iMax2 = rect.right;
        Drawable drawable3 = this.f4425b;
        if (drawable3 != null) {
            Rect rectC = G.c(drawable3);
            iMax = Math.max(iMax, rectC.left);
            iMax2 = Math.max(iMax2, rectC.right);
        }
        int iMax3 = Math.max(this.f4436m, (this.f4412B * 2) + iMax + iMax2);
        int iMax4 = Math.max(intrinsicHeight2, intrinsicHeight);
        this.f4449z = iMax3;
        this.f4411A = iMax4;
        super.onMeasure(i4, i5);
        if (getMeasuredHeight() < iMax4) {
            setMeasuredDimension(getMeasuredWidthAndState(), iMax4);
        }
    }

    @Override // android.view.View
    public void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        CharSequence charSequence = isChecked() ? this.f4439p : this.f4440q;
        if (charSequence != null) {
            accessibilityEvent.getText().add(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            android.view.VelocityTracker r0 = r6.f4446w
            r0.addMovement(r7)
            int r0 = r7.getActionMasked()
            r1 = 1
            if (r0 == 0) goto L9d
            r2 = 2
            if (r0 == r1) goto L89
            if (r0 == r2) goto L16
            r3 = 3
            if (r0 == r3) goto L89
            goto Lb7
        L16:
            int r0 = r6.f4442s
            if (r0 == r1) goto L55
            if (r0 == r2) goto L1e
            goto Lb7
        L1e:
            float r7 = r7.getX()
            int r0 = r6.getThumbScrollRange()
            float r2 = r6.f4444u
            float r2 = r7 - r2
            r3 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            if (r0 == 0) goto L32
            float r0 = (float) r0
            float r2 = r2 / r0
            goto L3b
        L32:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L38
            r2 = r3
            goto L3b
        L38:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = r0
        L3b:
            boolean r0 = k.g0.b(r6)
            if (r0 == 0) goto L42
            float r2 = -r2
        L42:
            float r0 = r6.f4448y
            float r0 = r0 + r2
            float r0 = f(r0, r4, r3)
            float r2 = r6.f4448y
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L54
            r6.f4444u = r7
            r6.setThumbPosition(r0)
        L54:
            return r1
        L55:
            float r0 = r7.getX()
            float r3 = r7.getY()
            float r4 = r6.f4444u
            float r4 = r0 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f4443t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L7b
            float r4 = r6.f4445v
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            int r5 = r6.f4443t
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Lb7
        L7b:
            r6.f4442s = r2
            android.view.ViewParent r7 = r6.getParent()
            r7.requestDisallowInterceptTouchEvent(r1)
            r6.f4444u = r0
            r6.f4445v = r3
            return r1
        L89:
            int r0 = r6.f4442s
            if (r0 != r2) goto L94
            r6.l(r7)
            super.onTouchEvent(r7)
            return r1
        L94:
            r0 = 0
            r6.f4442s = r0
            android.view.VelocityTracker r0 = r6.f4446w
            r0.clear()
            goto Lb7
        L9d:
            float r0 = r7.getX()
            float r2 = r7.getY()
            boolean r3 = r6.isEnabled()
            if (r3 == 0) goto Lb7
            boolean r3 = r6.g(r0, r2)
            if (r3 == 0) goto Lb7
            r6.f4442s = r1
            r6.f4444u = r0
            r6.f4445v = r2
        Lb7:
            boolean r7 = super.onTouchEvent(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SwitchCompat.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z3) {
        super.setChecked(z3);
        boolean zIsChecked = isChecked();
        if (getWindowToken() != null && AbstractC0241y.v(this)) {
            a(zIsChecked);
        } else {
            d();
            setThumbPosition(zIsChecked ? 1.0f : 0.0f);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(g.m(this, callback));
    }

    public void setShowText(boolean z3) {
        if (this.f4441r != z3) {
            this.f4441r = z3;
            requestLayout();
        }
    }

    public void setSplitTrack(boolean z3) {
        this.f4438o = z3;
        invalidate();
    }

    public void setSwitchMinWidth(int i4) {
        this.f4436m = i4;
        requestLayout();
    }

    public void setSwitchPadding(int i4) {
        this.f4437n = i4;
        requestLayout();
    }

    public void setSwitchTypeface(Typeface typeface) {
        if ((this.f4417G.getTypeface() == null || this.f4417G.getTypeface().equals(typeface)) && (this.f4417G.getTypeface() != null || typeface == null)) {
            return;
        }
        this.f4417G.setTypeface(typeface);
        requestLayout();
        invalidate();
    }

    public void setTextOff(CharSequence charSequence) {
        this.f4440q = charSequence;
        requestLayout();
    }

    public void setTextOn(CharSequence charSequence) {
        this.f4439p = charSequence;
        requestLayout();
    }

    public void setThumbDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4425b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4425b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setThumbPosition(float f4) {
        this.f4448y = f4;
        invalidate();
    }

    public void setThumbResource(int i4) {
        setThumbDrawable(AbstractC0921a.b(getContext(), i4));
    }

    public void setThumbTextPadding(int i4) {
        this.f4435l = i4;
        requestLayout();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        this.f4426c = colorStateList;
        this.f4428e = true;
        b();
    }

    public void setThumbTintMode(PorterDuff.Mode mode) {
        this.f4427d = mode;
        this.f4429f = true;
        b();
    }

    public void setTrackDrawable(Drawable drawable) {
        Drawable drawable2 = this.f4430g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4430g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        requestLayout();
    }

    public void setTrackResource(int i4) {
        setTrackDrawable(AbstractC0921a.b(getContext(), i4));
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        this.f4431h = colorStateList;
        this.f4433j = true;
        c();
    }

    public void setTrackTintMode(PorterDuff.Mode mode) {
        this.f4432i = mode;
        this.f4434k = true;
        c();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f4425b || drawable == this.f4430g;
    }

    public SwitchCompat(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4426c = null;
        this.f4427d = null;
        this.f4428e = false;
        this.f4429f = false;
        this.f4431h = null;
        this.f4432i = null;
        this.f4433j = false;
        this.f4434k = false;
        this.f4446w = VelocityTracker.obtain();
        this.f4424N = new Rect();
        TextPaint textPaint = new TextPaint(1);
        this.f4417G = textPaint;
        textPaint.density = getResources().getDisplayMetrics().density;
        a0 a0VarR = a0.r(context, attributeSet, AbstractC0645i.f5786X1, i4, 0);
        Drawable drawableF = a0VarR.f(AbstractC0645i.f5799a2);
        this.f4425b = drawableF;
        if (drawableF != null) {
            drawableF.setCallback(this);
        }
        Drawable drawableF2 = a0VarR.f(AbstractC0645i.f5844j2);
        this.f4430g = drawableF2;
        if (drawableF2 != null) {
            drawableF2.setCallback(this);
        }
        this.f4439p = a0VarR.n(AbstractC0645i.f5790Y1);
        this.f4440q = a0VarR.n(AbstractC0645i.f5794Z1);
        this.f4441r = a0VarR.a(AbstractC0645i.f5804b2, true);
        this.f4435l = a0VarR.e(AbstractC0645i.f5829g2, 0);
        this.f4436m = a0VarR.e(AbstractC0645i.f5814d2, 0);
        this.f4437n = a0VarR.e(AbstractC0645i.f5819e2, 0);
        this.f4438o = a0VarR.a(AbstractC0645i.f5809c2, false);
        ColorStateList colorStateListC = a0VarR.c(AbstractC0645i.f5834h2);
        if (colorStateListC != null) {
            this.f4426c = colorStateListC;
            this.f4428e = true;
        }
        PorterDuff.Mode modeD = G.d(a0VarR.i(AbstractC0645i.f5839i2, -1), null);
        if (this.f4427d != modeD) {
            this.f4427d = modeD;
            this.f4429f = true;
        }
        if (this.f4428e || this.f4429f) {
            b();
        }
        ColorStateList colorStateListC2 = a0VarR.c(AbstractC0645i.f5849k2);
        if (colorStateListC2 != null) {
            this.f4431h = colorStateListC2;
            this.f4433j = true;
        }
        PorterDuff.Mode modeD2 = G.d(a0VarR.i(AbstractC0645i.f5853l2, -1), null);
        if (this.f4432i != modeD2) {
            this.f4432i = modeD2;
            this.f4434k = true;
        }
        if (this.f4433j || this.f4434k) {
            c();
        }
        int iL = a0VarR.l(AbstractC0645i.f5824f2, 0);
        if (iL != 0) {
            i(context, iL);
        }
        C1131u c1131u = new C1131u(this);
        this.f4423M = c1131u;
        c1131u.m(attributeSet, i4);
        a0VarR.s();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f4443t = viewConfiguration.getScaledTouchSlop();
        this.f4447x = viewConfiguration.getScaledMinimumFlingVelocity();
        refreshDrawableState();
        setChecked(isChecked());
    }
}
