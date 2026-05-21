package io.flutter.plugin.platform;

import android.content.Context;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes.dex */
public class S extends ViewGroup {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect f7966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f7967c;

    public S(Context context) {
        super(context);
        this.f7966b = new Rect();
        this.f7967c = new Rect();
    }

    public static int a(int i4) {
        return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i4), Integer.MIN_VALUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) childAt.getLayoutParams();
            this.f7966b.set(i4, i5, i6, i7);
            Gravity.apply(layoutParams.gravity, childAt.getMeasuredWidth(), childAt.getMeasuredHeight(), this.f7966b, layoutParams.x, layoutParams.y, this.f7967c);
            Rect rect = this.f7967c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            getChildAt(i6).measure(a(i4), a(i5));
        }
        super.onMeasure(i4, i5);
    }
}
