package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import v.AbstractC1582a;

/* JADX INFO: loaded from: classes.dex */
public abstract class W {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8750a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f8751b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f8752c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f8753d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f8754e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f8755f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f8756g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f8757h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f8758i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f8759j = new int[1];

    public static int a(Context context, int i4) {
        ColorStateList colorStateListD = d(context, i4);
        if (colorStateListD != null && colorStateListD.isStateful()) {
            return colorStateListD.getColorForState(f8751b, colorStateListD.getDefaultColor());
        }
        TypedValue typedValueE = e();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueE, true);
        return c(context, i4, typedValueE.getFloat());
    }

    public static int b(Context context, int i4) {
        int[] iArr = f8759j;
        iArr[0] = i4;
        a0 a0VarQ = a0.q(context, null, iArr);
        try {
            return a0VarQ.b(0, 0);
        } finally {
            a0VarQ.s();
        }
    }

    public static int c(Context context, int i4, float f4) {
        return AbstractC1582a.d(b(context, i4), Math.round(Color.alpha(r0) * f4));
    }

    public static ColorStateList d(Context context, int i4) {
        int[] iArr = f8759j;
        iArr[0] = i4;
        a0 a0VarQ = a0.q(context, null, iArr);
        try {
            return a0VarQ.c(0);
        } finally {
            a0VarQ.s();
        }
    }

    public static TypedValue e() {
        ThreadLocal threadLocal = f8750a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
