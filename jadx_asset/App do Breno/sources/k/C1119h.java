package k;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import c.AbstractC0645i;
import e.AbstractC0921a;

/* JADX INFO: renamed from: k.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1119h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f8825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Y f8826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Y f8827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Y f8828d;

    public C1119h(ImageView imageView) {
        this.f8825a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f8828d == null) {
            this.f8828d = new Y();
        }
        Y y3 = this.f8828d;
        y3.a();
        ColorStateList colorStateListA = H.d.a(this.f8825a);
        if (colorStateListA != null) {
            y3.f8767d = true;
            y3.f8764a = colorStateListA;
        }
        PorterDuff.Mode modeB = H.d.b(this.f8825a);
        if (modeB != null) {
            y3.f8766c = true;
            y3.f8765b = modeB;
        }
        if (!y3.f8767d && !y3.f8766c) {
            return false;
        }
        C1116e.g(drawable, y3, this.f8825a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable drawable = this.f8825a.getDrawable();
        if (drawable != null) {
            G.b(drawable);
        }
        if (drawable != null) {
            if (j() && a(drawable)) {
                return;
            }
            Y y3 = this.f8827c;
            if (y3 != null) {
                C1116e.g(drawable, y3, this.f8825a.getDrawableState());
                return;
            }
            Y y4 = this.f8826b;
            if (y4 != null) {
                C1116e.g(drawable, y4, this.f8825a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        Y y3 = this.f8827c;
        if (y3 != null) {
            return y3.f8764a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        Y y3 = this.f8827c;
        if (y3 != null) {
            return y3.f8765b;
        }
        return null;
    }

    public boolean e() {
        return !(this.f8825a.getBackground() instanceof RippleDrawable);
    }

    public void f(AttributeSet attributeSet, int i4) {
        int iL;
        a0 a0VarR = a0.r(this.f8825a.getContext(), attributeSet, AbstractC0645i.f5720H, i4, 0);
        try {
            Drawable drawable = this.f8825a.getDrawable();
            if (drawable == null && (iL = a0VarR.l(AbstractC0645i.f5724I, -1)) != -1 && (drawable = AbstractC0921a.b(this.f8825a.getContext(), iL)) != null) {
                this.f8825a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                G.b(drawable);
            }
            if (a0VarR.o(AbstractC0645i.f5728J)) {
                H.d.c(this.f8825a, a0VarR.c(AbstractC0645i.f5728J));
            }
            if (a0VarR.o(AbstractC0645i.f5732K)) {
                H.d.d(this.f8825a, G.d(a0VarR.i(AbstractC0645i.f5732K, -1), null));
            }
            a0VarR.s();
        } catch (Throwable th) {
            a0VarR.s();
            throw th;
        }
    }

    public void g(int i4) {
        if (i4 != 0) {
            Drawable drawableB = AbstractC0921a.b(this.f8825a.getContext(), i4);
            if (drawableB != null) {
                G.b(drawableB);
            }
            this.f8825a.setImageDrawable(drawableB);
        } else {
            this.f8825a.setImageDrawable(null);
        }
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (this.f8827c == null) {
            this.f8827c = new Y();
        }
        Y y3 = this.f8827c;
        y3.f8764a = colorStateList;
        y3.f8767d = true;
        b();
    }

    public void i(PorterDuff.Mode mode) {
        if (this.f8827c == null) {
            this.f8827c = new Y();
        }
        Y y3 = this.f8827c;
        y3.f8765b = mode;
        y3.f8766c = true;
        b();
    }

    public final boolean j() {
        return this.f8826b != null;
    }
}
