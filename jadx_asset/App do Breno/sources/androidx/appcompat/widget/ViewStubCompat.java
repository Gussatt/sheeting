package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import c.AbstractC0645i;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakReference f4501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public LayoutInflater f4502e;

    public interface a {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        }
        if (this.f4499b == 0) {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        LayoutInflater layoutInflaterFrom = this.f4502e;
        if (layoutInflaterFrom == null) {
            layoutInflaterFrom = LayoutInflater.from(getContext());
        }
        View viewInflate = layoutInflaterFrom.inflate(this.f4499b, viewGroup, false);
        int i4 = this.f4500c;
        if (i4 != -1) {
            viewInflate.setId(i4);
        }
        int iIndexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(viewInflate, iIndexOfChild);
        }
        this.f4501d = new WeakReference(viewInflate);
        return viewInflate;
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f4500c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f4502e;
    }

    public int getLayoutResource() {
        return this.f4499b;
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.f4500c = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f4502e = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.f4499b = i4;
    }

    public void setOnInflateListener(a aVar) {
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference weakReference = this.f4501d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i4);
            return;
        }
        super.setVisibility(i4);
        if (i4 == 0 || i4 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4499b = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645i.f5830g3, i4, 0);
        this.f4500c = typedArrayObtainStyledAttributes.getResourceId(AbstractC0645i.f5845j3, -1);
        this.f4499b = typedArrayObtainStyledAttributes.getResourceId(AbstractC0645i.f5840i3, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(AbstractC0645i.f5835h3, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
