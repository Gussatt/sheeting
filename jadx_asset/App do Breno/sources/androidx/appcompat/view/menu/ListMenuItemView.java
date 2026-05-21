package androidx.appcompat.view.menu;

import C.AbstractC0241y;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.h;
import c.AbstractC0637a;
import c.AbstractC0641e;
import c.AbstractC0642f;
import c.AbstractC0645i;
import k.a0;

/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements h.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f4090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f4091c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public RadioButton f4092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f4093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CheckBox f4094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f4095g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f4096h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f4097i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f4098j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f4099k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4100l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Context f4101m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4102n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f4103o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4104p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4105q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LayoutInflater f4106r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4107s;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0637a.f5570o);
    }

    private LayoutInflater getInflater() {
        if (this.f4106r == null) {
            this.f4106r = LayoutInflater.from(getContext());
        }
        return this.f4106r;
    }

    private void setSubMenuArrowVisible(boolean z3) {
        ImageView imageView = this.f4096h;
        if (imageView != null) {
            imageView.setVisibility(z3 ? 0 : 8);
        }
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean a() {
        return false;
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f4097i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4097i.getLayoutParams();
        rect.top += this.f4097i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view) {
        c(view, -1);
    }

    public final void c(View view, int i4) {
        LinearLayout linearLayout = this.f4098j;
        if (linearLayout != null) {
            linearLayout.addView(view, i4);
        } else {
            addView(view, i4);
        }
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void d(e eVar, int i4) {
        this.f4090b = eVar;
        this.f4105q = i4;
        setVisibility(eVar.isVisible() ? 0 : 8);
        setTitle(eVar.h(this));
        setCheckable(eVar.isCheckable());
        h(eVar.z(), eVar.e());
        setIcon(eVar.getIcon());
        setEnabled(eVar.isEnabled());
        setSubMenuArrowVisible(eVar.hasSubMenu());
        setContentDescription(eVar.getContentDescription());
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(AbstractC0642f.f5671f, (ViewGroup) this, false);
        this.f4094f = checkBox;
        b(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(AbstractC0642f.f5672g, (ViewGroup) this, false);
        this.f4091c = imageView;
        c(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(AbstractC0642f.f5673h, (ViewGroup) this, false);
        this.f4092d = radioButton;
        b(radioButton);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public e getItemData() {
        return this.f4090b;
    }

    public void h(boolean z3, char c4) {
        int i4 = (z3 && this.f4090b.z()) ? 0 : 8;
        if (i4 == 0) {
            this.f4095g.setText(this.f4090b.f());
        }
        if (this.f4095g.getVisibility() != i4) {
            this.f4095g.setVisibility(i4);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        AbstractC0241y.G(this, this.f4099k);
        TextView textView = (TextView) findViewById(AbstractC0641e.f5638A);
        this.f4093e = textView;
        int i4 = this.f4100l;
        if (i4 != -1) {
            textView.setTextAppearance(this.f4101m, i4);
        }
        this.f4095g = (TextView) findViewById(AbstractC0641e.f5661v);
        ImageView imageView = (ImageView) findViewById(AbstractC0641e.f5664y);
        this.f4096h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f4103o);
        }
        this.f4097i = (ImageView) findViewById(AbstractC0641e.f5651l);
        this.f4098j = (LinearLayout) findViewById(AbstractC0641e.f5647h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        if (this.f4091c != null && this.f4102n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f4091c.getLayoutParams();
            int i6 = layoutParams.height;
            if (i6 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i6;
            }
        }
        super.onMeasure(i4, i5);
    }

    public void setCheckable(boolean z3) {
        CompoundButton compoundButton;
        View view;
        if (!z3 && this.f4092d == null && this.f4094f == null) {
            return;
        }
        if (this.f4090b.l()) {
            if (this.f4092d == null) {
                g();
            }
            compoundButton = this.f4092d;
            view = this.f4094f;
        } else {
            if (this.f4094f == null) {
                e();
            }
            compoundButton = this.f4094f;
            view = this.f4092d;
        }
        if (z3) {
            compoundButton.setChecked(this.f4090b.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f4094f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f4092d;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z3) {
        CompoundButton compoundButton;
        if (this.f4090b.l()) {
            if (this.f4092d == null) {
                g();
            }
            compoundButton = this.f4092d;
        } else {
            if (this.f4094f == null) {
                e();
            }
            compoundButton = this.f4094f;
        }
        compoundButton.setChecked(z3);
    }

    public void setForceShowIcon(boolean z3) {
        this.f4107s = z3;
        this.f4102n = z3;
    }

    public void setGroupDividerEnabled(boolean z3) {
        ImageView imageView = this.f4097i;
        if (imageView != null) {
            imageView.setVisibility((this.f4104p || !z3) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z3 = this.f4090b.y() || this.f4107s;
        if (z3 || this.f4102n) {
            ImageView imageView = this.f4091c;
            if (imageView == null && drawable == null && !this.f4102n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f4102n) {
                this.f4091c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f4091c;
            if (!z3) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f4091c.getVisibility() != 0) {
                this.f4091c.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f4093e.getVisibility() != 8) {
                this.f4093e.setVisibility(8);
            }
        } else {
            this.f4093e.setText(charSequence);
            if (this.f4093e.getVisibility() != 0) {
                this.f4093e.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet);
        a0 a0VarR = a0.r(getContext(), attributeSet, AbstractC0645i.f5872q1, i4, 0);
        this.f4099k = a0VarR.f(AbstractC0645i.f5880s1);
        this.f4100l = a0VarR.l(AbstractC0645i.f5876r1, -1);
        this.f4102n = a0VarR.a(AbstractC0645i.f5884t1, false);
        this.f4101m = context;
        this.f4103o = a0VarR.f(AbstractC0645i.f5888u1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, AbstractC0637a.f5569n, 0);
        this.f4104p = typedArrayObtainStyledAttributes.hasValue(0);
        a0VarR.s();
        typedArrayObtainStyledAttributes.recycle();
    }
}
