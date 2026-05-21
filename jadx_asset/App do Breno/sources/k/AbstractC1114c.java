package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import e.AbstractC0921a;

/* JADX INFO: renamed from: k.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1114c extends AutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f8782d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1115d f8783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1131u f8784c;

    public AbstractC1114c(Context context, AttributeSet attributeSet, int i4) {
        super(X.b(context), attributeSet, i4);
        a0 a0VarR = a0.r(getContext(), attributeSet, f8782d, i4, 0);
        if (a0VarR.o(0)) {
            setDropDownBackgroundDrawable(a0VarR.f(0));
        }
        a0VarR.s();
        C1115d c1115d = new C1115d(this);
        this.f8783b = c1115d;
        c1115d.e(attributeSet, i4);
        C1131u c1131u = new C1131u(this);
        this.f8784c = c1131u;
        c1131u.m(attributeSet, i4);
        c1131u.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1115d c1115d = this.f8783b;
        if (c1115d != null) {
            c1115d.b();
        }
        C1131u c1131u = this.f8784c;
        if (c1131u != null) {
            c1131u.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1115d c1115d = this.f8783b;
        if (c1115d != null) {
            return c1115d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1115d c1115d = this.f8783b;
        if (c1115d != null) {
            return c1115d.d();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC1117f.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1115d c1115d = this.f8783b;
        if (c1115d != null) {
            c1115d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1115d c1115d = this.f8783b;
        if (c1115d != null) {
            c1115d.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(H.g.m(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i4) {
        setDropDownBackgroundDrawable(AbstractC0921a.b(getContext(), i4));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1115d c1115d = this.f8783b;
        if (c1115d != null) {
            c1115d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1115d c1115d = this.f8783b;
        if (c1115d != null) {
            c1115d.j(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        C1131u c1131u = this.f8784c;
        if (c1131u != null) {
            c1131u.p(context, i4);
        }
    }
}
