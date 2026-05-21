package w;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: w.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1594a {

    /* JADX INFO: renamed from: w.a$a, reason: collision with other inner class name */
    public static class C0181a {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f4, float f5) {
            drawable.setHotspot(f4, f5);
        }

        public static void f(Drawable drawable, int i4, int i5, int i6, int i7) {
            drawable.setHotspotBounds(i4, i5, i6, i7);
        }

        public static void g(Drawable drawable, int i4) {
            drawable.setTint(i4);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    public static boolean a(Drawable drawable) {
        return drawable.isAutoMirrored();
    }

    public static void b(Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void c(Drawable drawable, boolean z3) {
        drawable.setAutoMirrored(z3);
    }

    public static void d(Drawable drawable, float f4, float f5) {
        C0181a.e(drawable, f4, f5);
    }

    public static void e(Drawable drawable, int i4, int i5, int i6, int i7) {
        C0181a.f(drawable, i4, i5, i6, i7);
    }

    public static void f(Drawable drawable, int i4) {
        C0181a.g(drawable, i4);
    }

    public static void g(Drawable drawable, ColorStateList colorStateList) {
        C0181a.h(drawable, colorStateList);
    }

    public static void h(Drawable drawable, PorterDuff.Mode mode) {
        C0181a.i(drawable, mode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Drawable i(Drawable drawable) {
        return drawable instanceof InterfaceC1595b ? ((InterfaceC1595b) drawable).a() : drawable;
    }

    public static Drawable j(Drawable drawable) {
        return drawable;
    }
}
