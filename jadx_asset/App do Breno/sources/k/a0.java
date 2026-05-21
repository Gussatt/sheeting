package k;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import e.AbstractC0921a;
import u.d;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f8779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f8780c;

    public a0(Context context, TypedArray typedArray) {
        this.f8778a = context;
        this.f8779b = typedArray;
    }

    public static a0 p(Context context, int i4, int[] iArr) {
        return new a0(context, context.obtainStyledAttributes(i4, iArr));
    }

    public static a0 q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new a0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static a0 r(Context context, AttributeSet attributeSet, int[] iArr, int i4, int i5) {
        return new a0(context, context.obtainStyledAttributes(attributeSet, iArr, i4, i5));
    }

    public boolean a(int i4, boolean z3) {
        return this.f8779b.getBoolean(i4, z3);
    }

    public int b(int i4, int i5) {
        return this.f8779b.getColor(i4, i5);
    }

    public ColorStateList c(int i4) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f8779b.hasValue(i4) || (resourceId = this.f8779b.getResourceId(i4, 0)) == 0 || (colorStateListA = AbstractC0921a.a(this.f8778a, resourceId)) == null) ? this.f8779b.getColorStateList(i4) : colorStateListA;
    }

    public int d(int i4, int i5) {
        return this.f8779b.getDimensionPixelOffset(i4, i5);
    }

    public int e(int i4, int i5) {
        return this.f8779b.getDimensionPixelSize(i4, i5);
    }

    public Drawable f(int i4) {
        int resourceId;
        return (!this.f8779b.hasValue(i4) || (resourceId = this.f8779b.getResourceId(i4, 0)) == 0) ? this.f8779b.getDrawable(i4) : AbstractC0921a.b(this.f8778a, resourceId);
    }

    public float g(int i4, float f4) {
        return this.f8779b.getFloat(i4, f4);
    }

    public Typeface h(int i4, int i5, d.a aVar) {
        int resourceId = this.f8779b.getResourceId(i4, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f8780c == null) {
            this.f8780c = new TypedValue();
        }
        return u.d.a(this.f8778a, resourceId, this.f8780c, i5, aVar);
    }

    public int i(int i4, int i5) {
        return this.f8779b.getInt(i4, i5);
    }

    public int j(int i4, int i5) {
        return this.f8779b.getInteger(i4, i5);
    }

    public int k(int i4, int i5) {
        return this.f8779b.getLayoutDimension(i4, i5);
    }

    public int l(int i4, int i5) {
        return this.f8779b.getResourceId(i4, i5);
    }

    public String m(int i4) {
        return this.f8779b.getString(i4);
    }

    public CharSequence n(int i4) {
        return this.f8779b.getText(i4);
    }

    public boolean o(int i4) {
        return this.f8779b.hasValue(i4);
    }

    public void s() {
        this.f8779b.recycle();
    }
}
