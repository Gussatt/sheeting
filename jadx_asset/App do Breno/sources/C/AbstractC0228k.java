package C;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.MenuItem;
import x.InterfaceMenuItemC1625b;

/* JADX INFO: renamed from: C.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0228k {

    /* JADX INFO: renamed from: C.k$a */
    public static class a {
        public static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        public static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        public static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        public static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        public static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        public static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        public static MenuItem g(MenuItem menuItem, char c4, int i4) {
            return menuItem.setAlphabeticShortcut(c4, i4);
        }

        public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        public static MenuItem k(MenuItem menuItem, char c4, int i4) {
            return menuItem.setNumericShortcut(c4, i4);
        }

        public static MenuItem l(MenuItem menuItem, char c4, char c5, int i4, int i5) {
            return menuItem.setShortcut(c4, c5, i4, i5);
        }

        public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static void a(MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof InterfaceMenuItemC1625b) {
            ((InterfaceMenuItemC1625b) menuItem).setAlphabeticShortcut(c4, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.g(menuItem, c4, i4);
        }
    }

    public static void b(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC1625b) {
            ((InterfaceMenuItemC1625b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.h(menuItem, charSequence);
        }
    }

    public static void c(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC1625b) {
            ((InterfaceMenuItemC1625b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.i(menuItem, colorStateList);
        }
    }

    public static void d(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC1625b) {
            ((InterfaceMenuItemC1625b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.j(menuItem, mode);
        }
    }

    public static void e(MenuItem menuItem, char c4, int i4) {
        if (menuItem instanceof InterfaceMenuItemC1625b) {
            ((InterfaceMenuItemC1625b) menuItem).setNumericShortcut(c4, i4);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.k(menuItem, c4, i4);
        }
    }

    public static void f(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC1625b) {
            ((InterfaceMenuItemC1625b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m(menuItem, charSequence);
        }
    }
}
