package f;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import w.AbstractC1594a;

/* JADX INFO: renamed from: f.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0937a extends Drawable implements Drawable.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable f7192b;

    public AbstractC0937a(Drawable drawable) {
        b(drawable);
    }

    public Drawable a() {
        return this.f7192b;
    }

    public void b(Drawable drawable) {
        Drawable drawable2 = this.f7192b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f7192b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f7192b.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        return this.f7192b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f7192b.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f7192b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f7192b.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f7192b.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f7192b.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f7192b.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f7192b.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f7192b.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f7192b.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return AbstractC1594a.a(this.f7192b);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return this.f7192b.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        AbstractC1594a.b(this.f7192b);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f7192b.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i4) {
        return this.f7192b.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f7192b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z3) {
        AbstractC1594a.c(this.f7192b, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        this.f7192b.setChangingConfigurations(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7192b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z3) {
        this.f7192b.setDither(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z3) {
        this.f7192b.setFilterBitmap(z3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        AbstractC1594a.d(this.f7192b, f4, f5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        AbstractC1594a.e(this.f7192b, i4, i5, i6, i7);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return this.f7192b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i4) {
        AbstractC1594a.f(this.f7192b, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        AbstractC1594a.g(this.f7192b, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        AbstractC1594a.h(this.f7192b, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z3, boolean z4) {
        return super.setVisible(z3, z4) || this.f7192b.setVisible(z3, z4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
