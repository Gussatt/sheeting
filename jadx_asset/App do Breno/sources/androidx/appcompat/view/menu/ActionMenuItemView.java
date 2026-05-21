package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionMenuView;
import c.AbstractC0645i;
import k.C1132v;
import k.J;
import k.c0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C1132v implements h.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f4075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f4076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable f4077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d.b f4078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public J f4079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f4080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4085p;

    public class a extends J {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // k.J
        public j.c b() {
            b bVar = ActionMenuItemView.this.f4080k;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // k.J
        public boolean c() {
            j.c cVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            d.b bVar = actionMenuItemView.f4078i;
            return bVar != null && bVar.a(actionMenuItemView.f4075f) && (cVarB = b()) != null && cVarB.i();
        }
    }

    public static abstract class b {
        public abstract j.c a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean a() {
        return true;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean c() {
        return f() && this.f4075f.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void d(e eVar, int i4) {
        this.f4075f = eVar;
        setIcon(eVar.getIcon());
        setTitle(eVar.h(this));
        setId(eVar.getItemId());
        setVisibility(eVar.isVisible() ? 0 : 8);
        setEnabled(eVar.isEnabled());
        if (eVar.hasSubMenu() && this.f4079j == null) {
            this.f4079j = new a();
        }
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i4 = configuration.screenWidthDp;
        int i5 = configuration.screenHeightDp;
        if (i4 < 480) {
            return (i4 >= 640 && i5 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public e getItemData() {
        return this.f4075f;
    }

    public final void h() {
        boolean z3 = true;
        boolean z4 = !TextUtils.isEmpty(this.f4076g);
        if (this.f4077h != null && (!this.f4075f.A() || (!this.f4081l && !this.f4082m))) {
            z3 = false;
        }
        boolean z5 = z4 & z3;
        setText(z5 ? this.f4076g : null);
        CharSequence contentDescription = this.f4075f.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z5 ? null : this.f4075f.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f4075f.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            c0.a(this, z5 ? null : this.f4075f.getTitle());
        } else {
            c0.a(this, tooltipText);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        d.b bVar = this.f4078i;
        if (bVar != null) {
            bVar.a(this.f4075f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4081l = g();
        h();
    }

    @Override // k.C1132v, android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        int i6;
        boolean zF = f();
        if (zF && (i6 = this.f4084o) >= 0) {
            super.setPadding(i6, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i4, i5);
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f4083n) : this.f4083n;
        if (mode != 1073741824 && this.f4083n > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i5);
        }
        if (zF || this.f4077h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f4077h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        J j4;
        if (this.f4075f.hasSubMenu() && (j4 = this.f4079j) != null && j4.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z3) {
    }

    public void setChecked(boolean z3) {
    }

    public void setExpandedFormat(boolean z3) {
        if (this.f4082m != z3) {
            this.f4082m = z3;
            e eVar = this.f4075f;
            if (eVar != null) {
                eVar.a();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f4077h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i4 = this.f4085p;
            if (intrinsicWidth > i4) {
                intrinsicHeight = (int) (intrinsicHeight * (i4 / intrinsicWidth));
                intrinsicWidth = i4;
            }
            if (intrinsicHeight > i4) {
                intrinsicWidth = (int) (intrinsicWidth * (i4 / intrinsicHeight));
            } else {
                i4 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i4);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(d.b bVar) {
        this.f4078i = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i4, int i5, int i6, int i7) {
        this.f4084o = i4;
        super.setPadding(i4, i5, i6, i7);
    }

    public void setPopupCallback(b bVar) {
        this.f4080k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f4076g = charSequence;
        h();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        Resources resources = context.getResources();
        this.f4081l = g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645i.f5882t, i4, 0);
        this.f4083n = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC0645i.f5886u, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f4085p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f4084o = -1;
        setSaveEnabled(false);
    }
}
