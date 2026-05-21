package x;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;

/* JADX INFO: renamed from: x.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceMenuItemC1625b extends MenuItem {
    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c4, int i4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1625b setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c4, int i4);

    @Override // android.view.MenuItem
    InterfaceMenuItemC1625b setTooltipText(CharSequence charSequence);
}
