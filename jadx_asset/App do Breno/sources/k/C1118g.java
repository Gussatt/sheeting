package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: renamed from: k.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1118g extends ImageButton {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1115d f8822b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1119h f8823c;

    public C1118g(Context context, AttributeSet attributeSet, int i4) {
        super(X.b(context), attributeSet, i4);
        C1115d c1115d = new C1115d(this);
        this.f8822b = c1115d;
        c1115d.e(attributeSet, i4);
        C1119h c1119h = new C1119h(this);
        this.f8823c = c1119h;
        c1119h.f(attributeSet, i4);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1115d c1115d = this.f8822b;
        if (c1115d != null) {
            c1115d.b();
        }
        C1119h c1119h = this.f8823c;
        if (c1119h != null) {
            c1119h.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1115d c1115d = this.f8822b;
        if (c1115d != null) {
            return c1115d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1115d c1115d = this.f8822b;
        if (c1115d != null) {
            return c1115d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1119h c1119h = this.f8823c;
        if (c1119h != null) {
            return c1119h.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1119h c1119h = this.f8823c;
        if (c1119h != null) {
            return c1119h.d();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f8823c.e() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1115d c1115d = this.f8822b;
        if (c1115d != null) {
            c1115d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i4) {
        super.setBackgroundResource(i4);
        C1115d c1115d = this.f8822b;
        if (c1115d != null) {
            c1115d.g(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1119h c1119h = this.f8823c;
        if (c1119h != null) {
            c1119h.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        C1119h c1119h = this.f8823c;
        if (c1119h != null) {
            c1119h.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i4) {
        this.f8823c.g(i4);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1119h c1119h = this.f8823c;
        if (c1119h != null) {
            c1119h.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1115d c1115d = this.f8822b;
        if (c1115d != null) {
            c1115d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1115d c1115d = this.f8822b;
        if (c1115d != null) {
            c1115d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1119h c1119h = this.f8823c;
        if (c1119h != null) {
            c1119h.h(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1119h c1119h = this.f8823c;
        if (c1119h != null) {
            c1119h.i(mode);
        }
    }
}
