package k;

import C.AbstractC0241y;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import c.AbstractC0645i;

/* JADX INFO: renamed from: k.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1115d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f8785a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y f8788d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Y f8789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Y f8790f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8787c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1116e f8786b = C1116e.b();

    public C1115d(View view) {
        this.f8785a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f8790f == null) {
            this.f8790f = new Y();
        }
        Y y3 = this.f8790f;
        y3.a();
        ColorStateList colorStateListF = AbstractC0241y.f(this.f8785a);
        if (colorStateListF != null) {
            y3.f8767d = true;
            y3.f8764a = colorStateListF;
        }
        PorterDuff.Mode modeG = AbstractC0241y.g(this.f8785a);
        if (modeG != null) {
            y3.f8766c = true;
            y3.f8765b = modeG;
        }
        if (!y3.f8767d && !y3.f8766c) {
            return false;
        }
        C1116e.g(drawable, y3, this.f8785a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f8785a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            Y y3 = this.f8789e;
            if (y3 != null) {
                C1116e.g(background, y3, this.f8785a.getDrawableState());
                return;
            }
            Y y4 = this.f8788d;
            if (y4 != null) {
                C1116e.g(background, y4, this.f8785a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        Y y3 = this.f8789e;
        if (y3 != null) {
            return y3.f8764a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        Y y3 = this.f8789e;
        if (y3 != null) {
            return y3.f8765b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i4) {
        a0 a0VarR = a0.r(this.f8785a.getContext(), attributeSet, AbstractC0645i.f5810c3, i4, 0);
        try {
            if (a0VarR.o(AbstractC0645i.f5815d3)) {
                this.f8787c = a0VarR.l(AbstractC0645i.f5815d3, -1);
                ColorStateList colorStateListE = this.f8786b.e(this.f8785a.getContext(), this.f8787c);
                if (colorStateListE != null) {
                    h(colorStateListE);
                }
            }
            if (a0VarR.o(AbstractC0645i.f5820e3)) {
                AbstractC0241y.H(this.f8785a, a0VarR.c(AbstractC0645i.f5820e3));
            }
            if (a0VarR.o(AbstractC0645i.f5825f3)) {
                AbstractC0241y.I(this.f8785a, G.d(a0VarR.i(AbstractC0645i.f5825f3, -1), null));
            }
            a0VarR.s();
        } catch (Throwable th) {
            a0VarR.s();
            throw th;
        }
    }

    public void f(Drawable drawable) {
        this.f8787c = -1;
        h(null);
        b();
    }

    public void g(int i4) {
        this.f8787c = i4;
        C1116e c1116e = this.f8786b;
        h(c1116e != null ? c1116e.e(this.f8785a.getContext(), i4) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f8788d == null) {
                this.f8788d = new Y();
            }
            Y y3 = this.f8788d;
            y3.f8764a = colorStateList;
            y3.f8767d = true;
        } else {
            this.f8788d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f8789e == null) {
            this.f8789e = new Y();
        }
        Y y3 = this.f8789e;
        y3.f8764a = colorStateList;
        y3.f8767d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f8789e == null) {
            this.f8789e = new Y();
        }
        Y y3 = this.f8789e;
        y3.f8765b = mode;
        y3.f8766c = true;
        b();
    }

    public final boolean k() {
        return this.f8788d != null;
    }
}
