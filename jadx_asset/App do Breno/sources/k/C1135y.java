package k;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import c.AbstractC0645i;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: k.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1135y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final RectF f8858k = new RectF();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static ConcurrentHashMap f8859l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap f8860m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8861a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8862b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8863c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f8864d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f8865e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f8866f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8867g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f8868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f8869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f8870j;

    public C1135y(TextView textView) {
        this.f8869i = textView;
        this.f8870j = textView.getContext();
    }

    public static Method l(String str) {
        try {
            Method declaredMethod = (Method) f8859l.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f8859l.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e4);
            return null;
        }
    }

    public static Object n(Object obj, String str, Object obj2) {
        try {
            return l(str).invoke(obj, new Object[0]);
        } catch (Exception e4) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e4);
            return obj2;
        }
    }

    public final void A(float f4, float f5, float f6) {
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f4 + "px) is less or equal to (0px)");
        }
        if (f5 <= f4) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f4 + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f8861a = 1;
        this.f8864d = f4;
        this.f8865e = f5;
        this.f8863c = f6;
        this.f8867g = false;
    }

    public void a() {
        if (o()) {
            if (this.f8862b) {
                if (this.f8869i.getMeasuredHeight() <= 0 || this.f8869i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f8869i.isHorizontallyScrollable() : ((Boolean) n(this.f8869i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f8869i.getMeasuredWidth() - this.f8869i.getTotalPaddingLeft()) - this.f8869i.getTotalPaddingRight();
                int height = (this.f8869i.getHeight() - this.f8869i.getCompoundPaddingBottom()) - this.f8869i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f8858k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float f4 = f(rectF);
                        if (f4 != this.f8869i.getTextSize()) {
                            u(0, f4);
                        }
                    } finally {
                    }
                }
            }
            this.f8862b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i4 : iArr) {
                if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                    arrayList.add(Integer.valueOf(i4));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void c() {
        this.f8861a = 0;
        this.f8864d = -1.0f;
        this.f8865e = -1.0f;
        this.f8863c = -1.0f;
        this.f8866f = new int[0];
        this.f8862b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5) {
        return e(charSequence, alignment, i4, i5);
    }

    public final StaticLayout e(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.f8868h, i4);
        StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(this.f8869i.getLineSpacingExtra(), this.f8869i.getLineSpacingMultiplier()).setIncludePad(this.f8869i.getIncludeFontPadding()).setBreakStrategy(this.f8869i.getBreakStrategy()).setHyphenationFrequency(this.f8869i.getHyphenationFrequency());
        if (i5 == -1) {
            i5 = Integer.MAX_VALUE;
        }
        hyphenationFrequency.setMaxLines(i5);
        try {
            builderObtain.setTextDirection(Build.VERSION.SDK_INT >= 29 ? this.f8869i.getTextDirectionHeuristic() : (TextDirectionHeuristic) n(this.f8869i, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return builderObtain.build();
    }

    public final int f(RectF rectF) {
        int length = this.f8866f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i4 = 1;
        int i5 = length - 1;
        int i6 = 0;
        while (i4 <= i5) {
            int i7 = (i4 + i5) / 2;
            if (y(this.f8866f[i7], rectF)) {
                int i8 = i7 + 1;
                i6 = i4;
                i4 = i8;
            } else {
                i6 = i7 - 1;
                i5 = i6;
            }
        }
        return this.f8866f[i6];
    }

    public int g() {
        return Math.round(this.f8865e);
    }

    public int h() {
        return Math.round(this.f8864d);
    }

    public int i() {
        return Math.round(this.f8863c);
    }

    public int[] j() {
        return this.f8866f;
    }

    public int k() {
        return this.f8861a;
    }

    public void m(int i4) {
        TextPaint textPaint = this.f8868h;
        if (textPaint == null) {
            this.f8868h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f8868h.set(this.f8869i.getPaint());
        this.f8868h.setTextSize(i4);
    }

    public boolean o() {
        return z() && this.f8861a != 0;
    }

    public void p(AttributeSet attributeSet, int i4) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f8870j.obtainStyledAttributes(attributeSet, AbstractC0645i.f5772U, i4, 0);
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC0645i.f5792Z)) {
            this.f8861a = typedArrayObtainStyledAttributes.getInt(AbstractC0645i.f5792Z, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(AbstractC0645i.f5788Y) ? typedArrayObtainStyledAttributes.getDimension(AbstractC0645i.f5788Y, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(AbstractC0645i.f5780W) ? typedArrayObtainStyledAttributes.getDimension(AbstractC0645i.f5780W, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(AbstractC0645i.f5776V) ? typedArrayObtainStyledAttributes.getDimension(AbstractC0645i.f5776V, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC0645i.f5784X) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(AbstractC0645i.f5784X, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            w(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!z()) {
            this.f8861a = 0;
            return;
        }
        if (this.f8861a == 1) {
            if (!this.f8867g) {
                DisplayMetrics displayMetrics = this.f8870j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                A(dimension2, dimension3, dimension);
            }
            v();
        }
    }

    public void q(int i4, int i5, int i6, int i7) {
        if (z()) {
            DisplayMetrics displayMetrics = this.f8870j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(i7, i4, displayMetrics), TypedValue.applyDimension(i7, i5, displayMetrics), TypedValue.applyDimension(i7, i6, displayMetrics));
            if (v()) {
                a();
            }
        }
    }

    public void r(int[] iArr, int i4) {
        if (z()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i4 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f8870j.getResources().getDisplayMetrics();
                    for (int i5 = 0; i5 < length; i5++) {
                        iArrCopyOf[i5] = Math.round(TypedValue.applyDimension(i4, iArr[i5], displayMetrics));
                    }
                }
                this.f8866f = b(iArrCopyOf);
                if (!x()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f8867g = false;
            }
            if (v()) {
                a();
            }
        }
    }

    public void s(int i4) {
        if (z()) {
            if (i4 == 0) {
                c();
                return;
            }
            if (i4 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i4);
            }
            DisplayMetrics displayMetrics = this.f8870j.getResources().getDisplayMetrics();
            A(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (v()) {
                a();
            }
        }
    }

    public final void t(float f4) {
        if (f4 != this.f8869i.getPaint().getTextSize()) {
            this.f8869i.getPaint().setTextSize(f4);
            boolean zIsInLayout = this.f8869i.isInLayout();
            if (this.f8869i.getLayout() != null) {
                this.f8862b = false;
                try {
                    Method methodL = l("nullLayouts");
                    if (methodL != null) {
                        methodL.invoke(this.f8869i, new Object[0]);
                    }
                } catch (Exception e4) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e4);
                }
                if (zIsInLayout) {
                    this.f8869i.forceLayout();
                } else {
                    this.f8869i.requestLayout();
                }
                this.f8869i.invalidate();
            }
        }
    }

    public void u(int i4, float f4) {
        Context context = this.f8870j;
        t(TypedValue.applyDimension(i4, f4, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean v() {
        if (z() && this.f8861a == 1) {
            if (!this.f8867g || this.f8866f.length == 0) {
                int iFloor = ((int) Math.floor((this.f8865e - this.f8864d) / this.f8863c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i4 = 0; i4 < iFloor; i4++) {
                    iArr[i4] = Math.round(this.f8864d + (i4 * this.f8863c));
                }
                this.f8866f = b(iArr);
            }
            this.f8862b = true;
        } else {
            this.f8862b = false;
        }
        return this.f8862b;
    }

    public final void w(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i4 = 0; i4 < length; i4++) {
                iArr[i4] = typedArray.getDimensionPixelSize(i4, -1);
            }
            this.f8866f = b(iArr);
            x();
        }
    }

    public final boolean x() {
        boolean z3 = this.f8866f.length > 0;
        this.f8867g = z3;
        if (z3) {
            this.f8861a = 1;
            this.f8864d = r0[0];
            this.f8865e = r0[r1 - 1];
            this.f8863c = -1.0f;
        }
        return z3;
    }

    public final boolean y(int i4, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f8869i.getText();
        TransformationMethod transformationMethod = this.f8869i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f8869i)) != null) {
            text = transformation;
        }
        int maxLines = this.f8869i.getMaxLines();
        m(i4);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) n(this.f8869i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    public final boolean z() {
        return true;
    }
}
