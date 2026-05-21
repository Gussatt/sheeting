package j;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import t.AbstractC1537a;
import w.AbstractC1594a;
import x.InterfaceMenuItemC1625b;

/* JADX INFO: renamed from: j.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1105a implements InterfaceMenuItemC1625b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f8540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f8541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f8542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f8543h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f8545j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f8547l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Context f8549n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f8550o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f8551p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f8552q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8544i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8546k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8548m = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ColorStateList f8553r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public PorterDuff.Mode f8554s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8555t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f8556u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8557v = 16;

    public C1105a(Context context, int i4, int i5, int i6, int i7, CharSequence charSequence) {
        this.f8549n = context;
        this.f8536a = i5;
        this.f8537b = i4;
        this.f8538c = i6;
        this.f8539d = i7;
        this.f8540e = charSequence;
    }

    public final void a() {
        Drawable drawable = this.f8547l;
        if (drawable != null) {
            if (this.f8555t || this.f8556u) {
                Drawable drawableJ = AbstractC1594a.j(drawable);
                this.f8547l = drawableJ;
                Drawable drawableMutate = drawableJ.mutate();
                this.f8547l = drawableMutate;
                if (this.f8555t) {
                    AbstractC1594a.g(drawableMutate, this.f8553r);
                }
                if (this.f8556u) {
                    AbstractC1594a.h(this.f8547l, this.f8554s);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC1625b setActionView(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC1625b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC1625b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f8546k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f8545j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f8551p;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f8537b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f8547l;
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f8553r;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f8554s;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f8542g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f8536a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f8544i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f8543h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f8539d;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f8540e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8541f;
        return charSequence != null ? charSequence : this.f8540e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f8552q;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f8557v & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f8557v & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f8557v & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f8557v & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        this.f8545j = Character.toLowerCase(c4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        this.f8557v = (z3 ? 1 : 0) | (this.f8557v & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        this.f8557v = (z3 ? 2 : 0) | (this.f8557v & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        this.f8557v = (z3 ? 16 : 0) | (this.f8557v & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f8547l = drawable;
        this.f8548m = 0;
        a();
        return this;
    }

    @Override // x.InterfaceMenuItemC1625b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8553r = colorStateList;
        this.f8555t = true;
        a();
        return this;
    }

    @Override // x.InterfaceMenuItemC1625b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8554s = mode;
        this.f8556u = true;
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f8542g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        this.f8543h = c4;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8550o = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f8543h = c4;
        this.f8545j = Character.toLowerCase(c5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f8540e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8541f = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        this.f8557v = (this.f8557v & 8) | (z3 ? 0 : 8);
        return this;
    }

    @Override // x.InterfaceMenuItemC1625b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        this.f8545j = Character.toLowerCase(c4);
        this.f8546k = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC1625b setContentDescription(CharSequence charSequence) {
        this.f8551p = charSequence;
        return this;
    }

    @Override // x.InterfaceMenuItemC1625b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        this.f8543h = c4;
        this.f8544i = KeyEvent.normalizeMetaState(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        this.f8540e = this.f8549n.getResources().getString(i4);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC1625b setTooltipText(CharSequence charSequence) {
        this.f8552q = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f8543h = c4;
        this.f8544i = KeyEvent.normalizeMetaState(i4);
        this.f8545j = Character.toLowerCase(c5);
        this.f8546k = KeyEvent.normalizeMetaState(i5);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f8548m = i4;
        this.f8547l = AbstractC1537a.b(this.f8549n, i4);
        a();
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i4) {
    }
}
