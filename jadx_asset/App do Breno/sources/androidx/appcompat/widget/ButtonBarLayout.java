package androidx.appcompat.widget;

import C.AbstractC0241y;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import c.AbstractC0641e;
import c.AbstractC0645i;

/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f4328d;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        ButtonBarLayout buttonBarLayout;
        super(context, attributeSet);
        this.f4327c = -1;
        this.f4328d = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645i.f5855m0);
        if (Build.VERSION.SDK_INT >= 29) {
            buttonBarLayout = this;
            buttonBarLayout.saveAttributeDataForStyleable(context, AbstractC0645i.f5855m0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        } else {
            buttonBarLayout = this;
        }
        buttonBarLayout.f4326b = typedArrayObtainStyledAttributes.getBoolean(AbstractC0645i.f5859n0, true);
        typedArrayObtainStyledAttributes.recycle();
    }

    private void setStacked(boolean z3) {
        setOrientation(z3 ? 1 : 0);
        setGravity(z3 ? 5 : 80);
        View viewFindViewById = findViewById(AbstractC0641e.f5662w);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(z3 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public final int a(int i4) {
        int childCount = getChildCount();
        while (i4 < childCount) {
            if (getChildAt(i4).getVisibility() == 0) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    public final boolean b() {
        return getOrientation() == 1;
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f4328d, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i4, int i5) {
        int iMakeMeasureSpec;
        boolean z3;
        int size = View.MeasureSpec.getSize(i4);
        int paddingBottom = 0;
        if (this.f4326b) {
            if (size > this.f4327c && b()) {
                setStacked(false);
            }
            this.f4327c = size;
        }
        if (b() || View.MeasureSpec.getMode(i4) != 1073741824) {
            iMakeMeasureSpec = i4;
            z3 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z3 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i5);
        if (this.f4326b && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z3 = true;
        }
        if (z3) {
            super.onMeasure(i4, i5);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (AbstractC0241y.m(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
        }
    }

    public void setAllowStacking(boolean z3) {
        if (this.f4326b != z3) {
            this.f4326b = z3;
            if (!z3 && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
