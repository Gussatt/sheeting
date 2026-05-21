package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import t.AbstractC1537a;
import x.InterfaceMenuC1624a;

/* JADX INFO: loaded from: classes.dex */
public class d implements InterfaceMenuC1624a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final int[] f4160A = {1, 4, 5, 3, 2, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f4162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f4165e;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f4173m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f4174n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Drawable f4175o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f4176p;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public e f4184x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f4186z;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4172l = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4177q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4178r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4179s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4180t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4181u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ArrayList f4182v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CopyOnWriteArrayList f4183w = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f4185y = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f4166f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f4167g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4168h = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f4169i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f4170j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4171k = true;

    public interface a {
        boolean a(d dVar, MenuItem menuItem);

        void b(d dVar);
    }

    public interface b {
        boolean a(e eVar);
    }

    public d(Context context) {
        this.f4161a = context;
        this.f4162b = context.getResources();
        T(true);
    }

    public static int m(ArrayList arrayList, int i4) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((e) arrayList.get(size)).d() <= i4) {
                return size + 1;
            }
        }
        return 0;
    }

    public static int x(int i4) {
        int i5 = ((-65536) & i4) >> 16;
        if (i5 >= 0) {
            int[] iArr = f4160A;
            if (i5 < iArr.length) {
                return (i4 & 65535) | (iArr[i5] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public ArrayList A() {
        if (!this.f4168h) {
            return this.f4167g;
        }
        this.f4167g.clear();
        int size = this.f4166f.size();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.f4166f.get(i4);
            if (eVar.isVisible()) {
                this.f4167g.add(eVar);
            }
        }
        this.f4168h = false;
        this.f4171k = true;
        return this.f4167g;
    }

    public boolean B() {
        return this.f4185y;
    }

    public boolean C() {
        return this.f4163c;
    }

    public boolean D() {
        return this.f4164d;
    }

    public void E(e eVar) {
        this.f4171k = true;
        G(true);
    }

    public void F(e eVar) {
        this.f4168h = true;
        G(true);
    }

    public void G(boolean z3) {
        if (this.f4177q) {
            this.f4178r = true;
            if (z3) {
                this.f4179s = true;
                return;
            }
            return;
        }
        if (z3) {
            this.f4168h = true;
            this.f4171k = true;
        }
        h(z3);
    }

    public boolean H(MenuItem menuItem, int i4) {
        return I(menuItem, null, i4);
    }

    public boolean I(MenuItem menuItem, g gVar, int i4) {
        e eVar = (e) menuItem;
        if (eVar == null || !eVar.isEnabled()) {
            return false;
        }
        boolean zJ = eVar.j();
        eVar.g();
        if (eVar.i()) {
            boolean zExpandActionView = eVar.expandActionView() | zJ;
            if (zExpandActionView) {
                d(true);
            }
            return zExpandActionView;
        }
        if (!eVar.hasSubMenu()) {
            if ((i4 & 1) == 0) {
                d(true);
            }
            return zJ;
        }
        if ((i4 & 4) == 0) {
            d(false);
        }
        if (!eVar.hasSubMenu()) {
            eVar.w(new j(s(), this, eVar));
        }
        boolean zI = i((j) eVar.getSubMenu(), gVar) | zJ;
        if (!zI) {
            d(true);
        }
        return zI;
    }

    public final void J(int i4, boolean z3) {
        if (i4 < 0 || i4 >= this.f4166f.size()) {
            return;
        }
        this.f4166f.remove(i4);
        if (z3) {
            G(true);
        }
    }

    public void K(g gVar) {
        for (WeakReference weakReference : this.f4183w) {
            g gVar2 = (g) weakReference.get();
            if (gVar2 == null || gVar2 == gVar) {
                this.f4183w.remove(weakReference);
            }
        }
    }

    public void L(a aVar) {
        this.f4165e = aVar;
    }

    public void M(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.f4166f.size();
        V();
        for (int i4 = 0; i4 < size; i4++) {
            e eVar = (e) this.f4166f.get(i4);
            if (eVar.getGroupId() == groupId && eVar.l() && eVar.isCheckable()) {
                eVar.r(eVar == menuItem);
            }
        }
        U();
    }

    public d N(int i4) {
        P(0, null, i4, null, null);
        return this;
    }

    public d O(Drawable drawable) {
        P(0, null, 0, drawable, null);
        return this;
    }

    public final void P(int i4, CharSequence charSequence, int i5, Drawable drawable, View view) {
        Resources resourcesY = y();
        if (view != null) {
            this.f4176p = view;
            this.f4174n = null;
            this.f4175o = null;
        } else {
            if (i4 > 0) {
                this.f4174n = resourcesY.getText(i4);
            } else if (charSequence != null) {
                this.f4174n = charSequence;
            }
            if (i5 > 0) {
                this.f4175o = AbstractC1537a.b(s(), i5);
            } else if (drawable != null) {
                this.f4175o = drawable;
            }
            this.f4176p = null;
        }
        G(false);
    }

    public d Q(int i4) {
        P(i4, null, 0, null, null);
        return this;
    }

    public d R(CharSequence charSequence) {
        P(0, charSequence, 0, null, null);
        return this;
    }

    public d S(View view) {
        P(0, null, 0, null, view);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(boolean r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.f4162b
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.f4161a
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.f4161a
            boolean r3 = C.C.l(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.f4164d = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.d.T(boolean):void");
    }

    public void U() {
        this.f4177q = false;
        if (this.f4178r) {
            this.f4178r = false;
            G(this.f4179s);
        }
    }

    public void V() {
        if (this.f4177q) {
            return;
        }
        this.f4177q = true;
        this.f4178r = false;
        this.f4179s = false;
    }

    public MenuItem a(int i4, int i5, int i6, CharSequence charSequence) {
        int iX = x(i6);
        e eVarF = f(i4, i5, i6, iX, charSequence, this.f4172l);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.f4173m;
        if (contextMenuInfo != null) {
            eVarF.u(contextMenuInfo);
        }
        ArrayList arrayList = this.f4166f;
        arrayList.add(m(arrayList, iX), eVarF);
        G(true);
        return eVarF;
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i4, int i5, int i6, ComponentName componentName, Intent[] intentArr, Intent intent, int i7, MenuItem[] menuItemArr) {
        int i8;
        PackageManager packageManager = this.f4161a.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i7 & 1) == 0) {
            removeGroup(i4);
        }
        for (int i9 = 0; i9 < size; i9++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i9);
            int i10 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i10 < 0 ? intent : intentArr[i10]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i4, i5, i6, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i8 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i8] = intent3;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(g gVar, Context context) {
        this.f4183w.add(new WeakReference(gVar));
        gVar.c(context, this);
        this.f4171k = true;
    }

    public void c() {
        a aVar = this.f4165e;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        e eVar = this.f4184x;
        if (eVar != null) {
            e(eVar);
        }
        this.f4166f.clear();
        G(true);
    }

    public void clearHeader() {
        this.f4175o = null;
        this.f4174n = null;
        this.f4176p = null;
        G(false);
    }

    @Override // android.view.Menu
    public void close() {
        d(true);
    }

    public final void d(boolean z3) {
        if (this.f4181u) {
            return;
        }
        this.f4181u = true;
        for (WeakReference weakReference : this.f4183w) {
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f4183w.remove(weakReference);
            } else {
                gVar.b(this, z3);
            }
        }
        this.f4181u = false;
    }

    public boolean e(e eVar) {
        boolean zH = false;
        if (!this.f4183w.isEmpty() && this.f4184x == eVar) {
            V();
            for (WeakReference weakReference : this.f4183w) {
                g gVar = (g) weakReference.get();
                if (gVar != null) {
                    zH = gVar.h(this, eVar);
                    if (zH) {
                        break;
                    }
                } else {
                    this.f4183w.remove(weakReference);
                }
            }
            U();
            if (zH) {
                this.f4184x = null;
            }
        }
        return zH;
    }

    public final e f(int i4, int i5, int i6, int i7, CharSequence charSequence, int i8) {
        return new e(this, i4, i5, i6, i7, charSequence, i8);
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i4) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = (e) this.f4166f.get(i5);
            if (eVar.getItemId() == i4) {
                return eVar;
            }
            if (eVar.hasSubMenu() && (menuItemFindItem = eVar.getSubMenu().findItem(i4)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public boolean g(d dVar, MenuItem menuItem) {
        a aVar = this.f4165e;
        return aVar != null && aVar.a(dVar, menuItem);
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i4) {
        return (MenuItem) this.f4166f.get(i4);
    }

    public final void h(boolean z3) {
        if (this.f4183w.isEmpty()) {
            return;
        }
        V();
        for (WeakReference weakReference : this.f4183w) {
            g gVar = (g) weakReference.get();
            if (gVar == null) {
                this.f4183w.remove(weakReference);
            } else {
                gVar.f(z3);
            }
        }
        U();
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.f4186z) {
            return true;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (((e) this.f4166f.get(i4)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(j jVar, g gVar) {
        if (this.f4183w.isEmpty()) {
            return false;
        }
        boolean zE = gVar != null ? gVar.e(jVar) : false;
        for (WeakReference weakReference : this.f4183w) {
            g gVar2 = (g) weakReference.get();
            if (gVar2 == null) {
                this.f4183w.remove(weakReference);
            } else if (!zE) {
                zE = gVar2.e(jVar);
            }
        }
        return zE;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i4, KeyEvent keyEvent) {
        return o(i4, keyEvent) != null;
    }

    public boolean j(e eVar) {
        boolean zJ = false;
        if (this.f4183w.isEmpty()) {
            return false;
        }
        V();
        for (WeakReference weakReference : this.f4183w) {
            g gVar = (g) weakReference.get();
            if (gVar != null) {
                zJ = gVar.j(this, eVar);
                if (zJ) {
                    break;
                }
            } else {
                this.f4183w.remove(weakReference);
            }
        }
        U();
        if (zJ) {
            this.f4184x = eVar;
        }
        return zJ;
    }

    public int k(int i4) {
        return l(i4, 0);
    }

    public int l(int i4, int i5) {
        int size = size();
        if (i5 < 0) {
            i5 = 0;
        }
        while (i5 < size) {
            if (((e) this.f4166f.get(i5)).getGroupId() == i4) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    public int n(int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            if (((e) this.f4166f.get(i5)).getItemId() == i4) {
                return i5;
            }
        }
        return -1;
    }

    public e o(int i4, KeyEvent keyEvent) {
        ArrayList arrayList = this.f4182v;
        arrayList.clear();
        p(arrayList, i4, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (e) arrayList.get(0);
        }
        boolean zC = C();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = (e) arrayList.get(i5);
            char alphabeticShortcut = zC ? eVar.getAlphabeticShortcut() : eVar.getNumericShortcut();
            char[] cArr = keyData.meta;
            if ((alphabeticShortcut == cArr[0] && (metaState & 2) == 0) || ((alphabeticShortcut == cArr[2] && (metaState & 2) != 0) || (zC && alphabeticShortcut == '\b' && i4 == 67))) {
                return eVar;
            }
        }
        return null;
    }

    public void p(List list, int i4, KeyEvent keyEvent) {
        boolean zC = C();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i4 == 67) {
            int size = this.f4166f.size();
            for (int i5 = 0; i5 < size; i5++) {
                e eVar = (e) this.f4166f.get(i5);
                if (eVar.hasSubMenu()) {
                    ((d) eVar.getSubMenu()).p(list, i4, keyEvent);
                }
                char alphabeticShortcut = zC ? eVar.getAlphabeticShortcut() : eVar.getNumericShortcut();
                if ((modifiers & 69647) == ((zC ? eVar.getAlphabeticModifiers() : eVar.getNumericModifiers()) & 69647) && alphabeticShortcut != 0) {
                    char[] cArr = keyData.meta;
                    if ((alphabeticShortcut == cArr[0] || alphabeticShortcut == cArr[2] || (zC && alphabeticShortcut == '\b' && i4 == 67)) && eVar.isEnabled()) {
                        list.add(eVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i4, int i5) {
        return H(findItem(i4), i5);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i4, KeyEvent keyEvent, int i5) {
        e eVarO = o(i4, keyEvent);
        boolean zH = eVarO != null ? H(eVarO, i5) : false;
        if ((i5 & 2) != 0) {
            d(true);
        }
        return zH;
    }

    public void q() {
        ArrayList arrayListA = A();
        if (this.f4171k) {
            boolean zG = false;
            for (WeakReference weakReference : this.f4183w) {
                g gVar = (g) weakReference.get();
                if (gVar == null) {
                    this.f4183w.remove(weakReference);
                } else {
                    zG |= gVar.g();
                }
            }
            if (zG) {
                this.f4169i.clear();
                this.f4170j.clear();
                int size = arrayListA.size();
                for (int i4 = 0; i4 < size; i4++) {
                    e eVar = (e) arrayListA.get(i4);
                    if (eVar.k()) {
                        this.f4169i.add(eVar);
                    } else {
                        this.f4170j.add(eVar);
                    }
                }
            } else {
                this.f4169i.clear();
                this.f4170j.clear();
                this.f4170j.addAll(A());
            }
            this.f4171k = false;
        }
    }

    public ArrayList r() {
        q();
        return this.f4169i;
    }

    @Override // android.view.Menu
    public void removeGroup(int i4) {
        int iK = k(i4);
        if (iK >= 0) {
            int size = this.f4166f.size() - iK;
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i5 >= size || ((e) this.f4166f.get(iK)).getGroupId() != i4) {
                    break;
                }
                J(iK, false);
                i5 = i6;
            }
            G(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i4) {
        J(n(i4), true);
    }

    public Context s() {
        return this.f4161a;
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i4, boolean z3, boolean z4) {
        int size = this.f4166f.size();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = (e) this.f4166f.get(i5);
            if (eVar.getGroupId() == i4) {
                eVar.s(z4);
                eVar.setCheckable(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z3) {
        this.f4185y = z3;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i4, boolean z3) {
        int size = this.f4166f.size();
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = (e) this.f4166f.get(i5);
            if (eVar.getGroupId() == i4) {
                eVar.setEnabled(z3);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i4, boolean z3) {
        int size = this.f4166f.size();
        boolean z4 = false;
        for (int i5 = 0; i5 < size; i5++) {
            e eVar = (e) this.f4166f.get(i5);
            if (eVar.getGroupId() == i4 && eVar.x(z3)) {
                z4 = true;
            }
        }
        if (z4) {
            G(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z3) {
        this.f4163c = z3;
        G(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f4166f.size();
    }

    public e t() {
        return this.f4184x;
    }

    public CharSequence u() {
        return this.f4174n;
    }

    public ArrayList v() {
        q();
        return this.f4170j;
    }

    public boolean w() {
        return this.f4180t;
    }

    public Resources y() {
        return this.f4162b;
    }

    public d z() {
        return this;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4) {
        return a(0, 0, 0, this.f4162b.getString(i4));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4) {
        return addSubMenu(0, 0, 0, this.f4162b.getString(i4));
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, CharSequence charSequence) {
        return a(i4, i5, i6, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, CharSequence charSequence) {
        e eVar = (e) a(i4, i5, i6, charSequence);
        j jVar = new j(this.f4161a, this, eVar);
        eVar.w(jVar);
        return jVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i4, int i5, int i6, int i7) {
        return a(i4, i5, i6, this.f4162b.getString(i7));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i4, int i5, int i6, int i7) {
        return addSubMenu(i4, i5, i6, this.f4162b.getString(i7));
    }
}
