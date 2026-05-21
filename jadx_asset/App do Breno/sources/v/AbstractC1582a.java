package v;

import android.graphics.Color;

/* JADX INFO: renamed from: v.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1582a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f11515a = new ThreadLocal();

    public static int a(int i4, int i5) {
        return 255 - (((255 - i5) * (255 - i4)) / 255);
    }

    public static int b(int i4, int i5) {
        int iAlpha = Color.alpha(i5);
        int iAlpha2 = Color.alpha(i4);
        int iA = a(iAlpha2, iAlpha);
        return Color.argb(iA, c(Color.red(i4), iAlpha2, Color.red(i5), iAlpha, iA), c(Color.green(i4), iAlpha2, Color.green(i5), iAlpha, iA), c(Color.blue(i4), iAlpha2, Color.blue(i5), iAlpha, iA));
    }

    public static int c(int i4, int i5, int i6, int i7, int i8) {
        if (i8 == 0) {
            return 0;
        }
        return (((i4 * 255) * i5) + ((i6 * i7) * (255 - i5))) / (i8 * 255);
    }

    public static int d(int i4, int i5) {
        if (i5 < 0 || i5 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i4 & 16777215) | (i5 << 24);
    }
}
