package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import n.AbstractC1431a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4568c;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4567b = getResources().getDimensionPixelOffset(AbstractC1431a.f10578b);
        this.f4568c = getResources().getDimensionPixelOffset(AbstractC1431a.f10577a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f4567b * 2), this.f4568c), 1073741824), i5);
    }
}
