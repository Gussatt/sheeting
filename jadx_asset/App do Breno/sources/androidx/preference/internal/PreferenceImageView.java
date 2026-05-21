package androidx.preference.internal;

import X.g;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class PreferenceImageView extends ImageView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5128c;

    public PreferenceImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.widget.ImageView
    public int getMaxHeight() {
        return this.f5128c;
    }

    @Override // android.widget.ImageView
    public int getMaxWidth() {
        return this.f5127b;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i4, int i5) {
        int mode = View.MeasureSpec.getMode(i4);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int size = View.MeasureSpec.getSize(i4);
            int maxWidth = getMaxWidth();
            if (maxWidth != Integer.MAX_VALUE && (maxWidth < size || mode == 0)) {
                i4 = View.MeasureSpec.makeMeasureSpec(maxWidth, Integer.MIN_VALUE);
            }
        }
        int mode2 = View.MeasureSpec.getMode(i5);
        if (mode2 == Integer.MIN_VALUE || mode2 == 0) {
            int size2 = View.MeasureSpec.getSize(i5);
            int maxHeight = getMaxHeight();
            if (maxHeight != Integer.MAX_VALUE && (maxHeight < size2 || mode2 == 0)) {
                i5 = View.MeasureSpec.makeMeasureSpec(maxHeight, Integer.MIN_VALUE);
            }
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i4) {
        this.f5128c = i4;
        super.setMaxHeight(i4);
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i4) {
        this.f5127b = i4;
        super.setMaxWidth(i4);
    }

    public PreferenceImageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f5127b = Integer.MAX_VALUE;
        this.f5128c = Integer.MAX_VALUE;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f3923y0, i4, 0);
        setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(g.f3818A0, Integer.MAX_VALUE));
        setMaxHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(g.f3925z0, Integer.MAX_VALUE));
        typedArrayObtainStyledAttributes.recycle();
    }
}
