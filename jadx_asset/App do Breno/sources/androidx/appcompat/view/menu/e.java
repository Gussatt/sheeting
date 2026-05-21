package androidx.appcompat.view.menu;

import C.AbstractC0219b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.h;
import c.AbstractC0643g;
import e.AbstractC0921a;
import w.AbstractC1594a;
import x.InterfaceMenuItemC1625b;

/* JADX INFO: loaded from: classes.dex */
public final class e implements InterfaceMenuItemC1625b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f4187A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f4188B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f4190D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f4195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f4196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f4197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f4198h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f4200j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f4202l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public d f4204n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public j f4205o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f4206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f4207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f4208r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f4209s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4216z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f4199i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f4201k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4203m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f4210t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f4211u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4212v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4213w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4214x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4215y = 16;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f4189C = false;

    public e(d dVar, int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        this.f4204n = dVar;
        this.f4191a = i5;
        this.f4192b = i4;
        this.f4193c = i6;
        this.f4194d = i7;
        this.f4195e = charSequence;
        this.f4216z = i8;
    }

    public static void b(StringBuilder sb, int i4, int i5, String str) {
        if ((i4 & i5) == i5) {
            sb.append(str);
        }
    }

    public boolean A() {
        return (this.f4216z & 4) == 4;
    }

    public void a() {
        this.f4204n.E(this);
    }

    public final Drawable c(Drawable drawable) {
        if (drawable != null && this.f4214x && (this.f4212v || this.f4213w)) {
            drawable = AbstractC1594a.j(drawable).mutate();
            if (this.f4212v) {
                AbstractC1594a.g(drawable, this.f4210t);
            }
            if (this.f4213w) {
                AbstractC1594a.h(drawable, this.f4211u);
            }
            this.f4214x = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f4216z & 8) == 0) {
            return false;
        }
        if (this.f4187A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4188B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f4204n.e(this);
        }
        return false;
    }

    public int d() {
        return this.f4194d;
    }

    public char e() {
        return this.f4204n.C() ? this.f4200j : this.f4198h;
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        if (!i()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f4188B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f4204n.j(this);
        }
        return false;
    }

    public String f() {
        char cE = e();
        if (cE == 0) {
            return "";
        }
        Resources resources = this.f4204n.s().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f4204n.s()).hasPermanentMenuKey()) {
            sb.append(resources.getString(AbstractC0643g.f5689k));
        }
        int i4 = this.f4204n.C() ? this.f4201k : this.f4199i;
        b(sb, i4, 65536, resources.getString(AbstractC0643g.f5685g));
        b(sb, i4, 4096, resources.getString(AbstractC0643g.f5681c));
        b(sb, i4, 2, resources.getString(AbstractC0643g.f5680b));
        b(sb, i4, 1, resources.getString(AbstractC0643g.f5686h));
        b(sb, i4, 4, resources.getString(AbstractC0643g.f5688j));
        b(sb, i4, 8, resources.getString(AbstractC0643g.f5684f));
        if (cE == '\b') {
            sb.append(resources.getString(AbstractC0643g.f5682d));
        } else if (cE == '\n') {
            sb.append(resources.getString(AbstractC0643g.f5683e));
        } else if (cE != ' ') {
            sb.append(cE);
        } else {
            sb.append(resources.getString(AbstractC0643g.f5687i));
        }
        return sb.toString();
    }

    public AbstractC0219b g() {
        return null;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View view = this.f4187A;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f4201k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f4200j;
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f4208r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f4192b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f4202l;
        if (drawable != null) {
            return c(drawable);
        }
        if (this.f4203m == 0) {
            return null;
        }
        Drawable drawableB = AbstractC0921a.b(this.f4204n.s(), this.f4203m);
        this.f4203m = 0;
        this.f4202l = drawableB;
        return c(drawableB);
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f4210t;
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f4211u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f4197g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f4191a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f4190D;
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f4199i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f4198h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f4193c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f4205o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f4195e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f4196f;
        return charSequence != null ? charSequence : this.f4195e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f4209s;
    }

    public CharSequence h(h.a aVar) {
        return (aVar == null || !aVar.a()) ? getTitle() : getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f4205o != null;
    }

    public boolean i() {
        return ((this.f4216z & 8) == 0 || this.f4187A == null) ? false : true;
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f4189C;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f4215y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f4215y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f4215y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f4215y & 8) == 0;
    }

    public boolean j() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f4207q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        d dVar = this.f4204n;
        if (dVar.g(dVar, this)) {
            return true;
        }
        Runnable runnable = this.f4206p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f4197g == null) {
            return false;
        }
        try {
            this.f4204n.s().startActivity(this.f4197g);
            return true;
        } catch (ActivityNotFoundException e4) {
            Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e4);
            return false;
        }
    }

    public boolean k() {
        return (this.f4215y & 32) == 32;
    }

    public boolean l() {
        return (this.f4215y & 4) != 0;
    }

    public boolean m() {
        return (this.f4216z & 1) == 1;
    }

    public boolean n() {
        return (this.f4216z & 2) == 2;
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC1625b setActionView(int i4) {
        Context contextS = this.f4204n.s();
        setActionView(LayoutInflater.from(contextS).inflate(i4, (ViewGroup) new LinearLayout(contextS), false));
        return this;
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC1625b setActionView(View view) {
        int i4;
        this.f4187A = view;
        if (view != null && view.getId() == -1 && (i4 = this.f4191a) > 0) {
            view.setId(i4);
        }
        this.f4204n.E(this);
        return this;
    }

    public void q(boolean z3) {
        this.f4189C = z3;
        this.f4204n.G(false);
    }

    public void r(boolean z3) {
        int i4 = this.f4215y;
        int i5 = (z3 ? 2 : 0) | (i4 & (-3));
        this.f4215y = i5;
        if (i4 != i5) {
            this.f4204n.G(false);
        }
    }

    public void s(boolean z3) {
        this.f4215y = (z3 ? 4 : 0) | (this.f4215y & (-5));
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4) {
        if (this.f4200j == c4) {
            return this;
        }
        this.f4200j = Character.toLowerCase(c4);
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z3) {
        int i4 = this.f4215y;
        int i5 = (z3 ? 1 : 0) | (i4 & (-2));
        this.f4215y = i5;
        if (i4 != i5) {
            this.f4204n.G(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z3) {
        if ((this.f4215y & 4) != 0) {
            this.f4204n.M(this);
            return this;
        }
        r(z3);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z3) {
        if (z3) {
            this.f4215y |= 16;
        } else {
            this.f4215y &= -17;
        }
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f4203m = 0;
        this.f4202l = drawable;
        this.f4214x = true;
        this.f4204n.G(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC1625b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f4210t = colorStateList;
        this.f4212v = true;
        this.f4214x = true;
        this.f4204n.G(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC1625b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f4211u = mode;
        this.f4213w = true;
        this.f4214x = true;
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f4197g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c4) {
        if (this.f4198h == c4) {
            return this;
        }
        this.f4198h = c4;
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f4188B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f4207q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5) {
        this.f4198h = c4;
        this.f4200j = Character.toLowerCase(c5);
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i4) {
        int i5 = i4 & 3;
        if (i5 != 0 && i5 != 1 && i5 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f4216z = i4;
        this.f4204n.E(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f4195e = charSequence;
        this.f4204n.G(false);
        j jVar = this.f4205o;
        if (jVar != null) {
            jVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f4196f = charSequence;
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z3) {
        if (x(z3)) {
            this.f4204n.F(this);
        }
        return this;
    }

    public void t(boolean z3) {
        if (z3) {
            this.f4215y |= 32;
        } else {
            this.f4215y &= -33;
        }
    }

    public String toString() {
        CharSequence charSequence = this.f4195e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f4190D = contextMenuInfo;
    }

    @Override // android.view.MenuItem
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public InterfaceMenuItemC1625b setShowAsActionFlags(int i4) {
        setShowAsAction(i4);
        return this;
    }

    public void w(j jVar) {
        this.f4205o = jVar;
        jVar.setHeaderTitle(getTitle());
    }

    public boolean x(boolean z3) {
        int i4 = this.f4215y;
        int i5 = (z3 ? 0 : 8) | (i4 & (-9));
        this.f4215y = i5;
        return i4 != i5;
    }

    public boolean y() {
        return this.f4204n.w();
    }

    public boolean z() {
        return this.f4204n.D() && e() != 0;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC1625b setContentDescription(CharSequence charSequence) {
        this.f4208r = charSequence;
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public InterfaceMenuItemC1625b setTooltipText(CharSequence charSequence) {
        this.f4209s = charSequence;
        this.f4204n.G(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC1625b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c4, int i4) {
        if (this.f4200j == c4 && this.f4201k == i4) {
            return this;
        }
        this.f4200j = Character.toLowerCase(c4);
        this.f4201k = KeyEvent.normalizeMetaState(i4);
        this.f4204n.G(false);
        return this;
    }

    @Override // x.InterfaceMenuItemC1625b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c4, int i4) {
        if (this.f4198h == c4 && this.f4199i == i4) {
            return this;
        }
        this.f4198h = c4;
        this.f4199i = KeyEvent.normalizeMetaState(i4);
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c4, char c5, int i4, int i5) {
        this.f4198h = c4;
        this.f4199i = KeyEvent.normalizeMetaState(i4);
        this.f4200j = Character.toLowerCase(c5);
        this.f4201k = KeyEvent.normalizeMetaState(i5);
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i4) {
        this.f4202l = null;
        this.f4203m = i4;
        this.f4214x = true;
        this.f4204n.G(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i4) {
        return setTitle(this.f4204n.s().getString(i4));
    }
}
