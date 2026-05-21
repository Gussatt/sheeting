package k;

import A.k;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import e.AbstractC0921a;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import v.AbstractC1584c;

/* JADX INFO: renamed from: k.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1132v extends TextView implements H.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1115d f8854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1131u f8855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1126o f8856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Future f8857e;

    public C1132v(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1115d c1115d = this.f8854b;
        if (c1115d != null) {
            c1115d.b();
        }
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.b();
        }
    }

    public final void e() {
        Future future = this.f8857e;
        if (future != null) {
            try {
                this.f8857e = null;
                i.d.a(future.get());
                H.g.k(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (H.b.f1694a) {
            return super.getAutoSizeMaxTextSize();
        }
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            return c1131u.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (H.b.f1694a) {
            return super.getAutoSizeMinTextSize();
        }
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            return c1131u.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (H.b.f1694a) {
            return super.getAutoSizeStepGranularity();
        }
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            return c1131u.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (H.b.f1694a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C1131u c1131u = this.f8855c;
        return c1131u != null ? c1131u.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (H.b.f1694a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            return c1131u.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return H.g.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return H.g.b(this);
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1115d c1115d = this.f8854b;
        if (c1115d != null) {
            return c1115d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1115d c1115d = this.f8854b;
        if (c1115d != null) {
            return c1115d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f8855c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f8855c.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        e();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C1126o c1126o;
        return (Build.VERSION.SDK_INT >= 28 || (c1126o = this.f8856d) == null) ? super.getTextClassifier() : c1126o.a();
    }

    public k.a getTextMetricsParamsCompat() {
        return H.g.e(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1117f.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        super.onLayout(z3, i4, i5, i6, i7);
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.n(z3, i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i4, int i5) {
        e();
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        C1131u c1131u = this.f8855c;
        if (c1131u == null || H.b.f1694a || !c1131u.l()) {
            return;
        }
        this.f8855c.c();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
        if (H.b.f1694a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.s(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
        if (H.b.f1694a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.t(iArr, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (H.b.f1694a) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.u(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1115d c1115d = this.f8854b;
        if (c1115d != null) {
            c1115d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1115d c1115d = this.f8854b;
        if (c1115d != null) {
            c1115d.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.o();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H.g.m(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i4);
        } else {
            H.g.h(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i4);
        } else {
            H.g.i(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i4) {
        H.g.j(this, i4);
    }

    public void setPrecomputedText(A.k kVar) {
        H.g.k(this, kVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1115d c1115d = this.f8854b;
        if (c1115d != null) {
            c1115d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1115d c1115d = this.f8854b;
        if (c1115d != null) {
            c1115d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f8855c.v(colorStateList);
        this.f8855c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f8855c.w(mode);
        this.f8855c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.p(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C1126o c1126o;
        if (Build.VERSION.SDK_INT >= 28 || (c1126o = this.f8856d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c1126o.b(textClassifier);
        }
    }

    public void setTextFuture(Future<A.k> future) {
        this.f8857e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(k.a aVar) {
        H.g.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        if (H.b.f1694a) {
            super.setTextSize(i4, f4);
            return;
        }
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.z(i4, f4);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i4) {
        Typeface typefaceA = (typeface == null || i4 <= 0) ? null : AbstractC1584c.a(getContext(), typeface, i4);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        super.setTypeface(typeface, i4);
    }

    public C1132v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public C1132v(Context context, AttributeSet attributeSet, int i4) {
        super(X.b(context), attributeSet, i4);
        C1115d c1115d = new C1115d(this);
        this.f8854b = c1115d;
        c1115d.e(attributeSet, i4);
        C1131u c1131u = new C1131u(this);
        this.f8855c = c1131u;
        c1131u.m(attributeSet, i4);
        c1131u.b();
        this.f8856d = new C1126o(this);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? AbstractC0921a.b(context, i4) : null, i5 != 0 ? AbstractC0921a.b(context, i5) : null, i6 != 0 ? AbstractC0921a.b(context, i6) : null, i7 != 0 ? AbstractC0921a.b(context, i7) : null);
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.o();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? AbstractC0921a.b(context, i4) : null, i5 != 0 ? AbstractC0921a.b(context, i5) : null, i6 != 0 ? AbstractC0921a.b(context, i6) : null, i7 != 0 ? AbstractC0921a.b(context, i7) : null);
        C1131u c1131u = this.f8855c;
        if (c1131u != null) {
            c1131u.o();
        }
    }
}
