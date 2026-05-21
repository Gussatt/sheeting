package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f4329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f4330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f4331d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f4332e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f4333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TypedValue f4334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Rect f4335h;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a(Rect rect) {
        fitSystemWindows(rect);
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f4333f == null) {
            this.f4333f = new TypedValue();
        }
        return this.f4333f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f4334g == null) {
            this.f4334g = new TypedValue();
        }
        return this.f4334g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f4331d == null) {
            this.f4331d = new TypedValue();
        }
        return this.f4331d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f4332e == null) {
            this.f4332e = new TypedValue();
        }
        return this.f4332e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f4329b == null) {
            this.f4329b = new TypedValue();
        }
        return this.f4329b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f4330c == null) {
            this.f4330c = new TypedValue();
        }
        return this.f4330c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4335h = new Rect();
    }
}
