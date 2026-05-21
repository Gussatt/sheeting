package d;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import c.AbstractC0645i;

/* JADX INFO: renamed from: d.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0910a extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7120a;

    public AbstractC0910a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7120a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0645i.f5874r);
        this.f7120a = typedArrayObtainStyledAttributes.getInt(AbstractC0645i.f5878s, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public AbstractC0910a(int i4, int i5) {
        super(i4, i5);
        this.f7120a = 8388627;
    }

    public AbstractC0910a(AbstractC0910a abstractC0910a) {
        super((ViewGroup.MarginLayoutParams) abstractC0910a);
        this.f7120a = 0;
        this.f7120a = abstractC0910a.f7120a;
    }

    public AbstractC0910a(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f7120a = 0;
    }
}
