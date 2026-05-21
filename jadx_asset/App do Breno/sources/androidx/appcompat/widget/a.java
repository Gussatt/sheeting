package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import c.AbstractC0637a;
import c.AbstractC0642f;
import i.C1036a;
import java.util.ArrayList;
import k.C1120i;
import k.J;
import k.c0;
import w.AbstractC1594a;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public c f4503A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public b f4504B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final f f4505C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f4506D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f4507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f4508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4511o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4512p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4513q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4514r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4515s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4516t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4517u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4518v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4519w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f4520x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f4521y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0087a f4522z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    public class C0087a extends androidx.appcompat.view.menu.f {
        public C0087a(Context context, j jVar, View view) {
            super(context, jVar, view, false, AbstractC0637a.f5561f);
            if (!((androidx.appcompat.view.menu.e) jVar.getItem()).k()) {
                View view2 = a.this.f4507k;
                f(view2 == null ? (View) a.this.f4116j : view2);
            }
            j(a.this.f4505C);
        }

        @Override // androidx.appcompat.view.menu.f
        public void e() {
            a aVar = a.this;
            aVar.f4522z = null;
            aVar.f4506D = 0;
            super.e();
        }
    }

    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public j.c a() {
            C0087a c0087a = a.this.f4522z;
            if (c0087a != null) {
                return c0087a.c();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public e f4525m;

        public c(e eVar) {
            this.f4525m = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f4110d != null) {
                a.this.f4110d.c();
            }
            View view = (View) a.this.f4116j;
            if (view != null && view.getWindowToken() != null && this.f4525m.m()) {
                a.this.f4521y = this.f4525m;
            }
            a.this.f4503A = null;
        }
    }

    public class d extends C1120i implements ActionMenuView.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float[] f4527d;

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        public class C0088a extends J {

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ a f4529k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0088a(View view, a aVar) {
                super(view);
                this.f4529k = aVar;
            }

            @Override // k.J
            public j.c b() {
                e eVar = a.this.f4521y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // k.J
            public boolean c() {
                a.this.G();
                return true;
            }

            @Override // k.J
            public boolean d() {
                a aVar = a.this;
                if (aVar.f4503A != null) {
                    return false;
                }
                aVar.y();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, AbstractC0637a.f5560e);
            this.f4527d = new float[2];
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            c0.a(this, getContentDescription());
            setOnTouchListener(new C0088a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean c() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.G();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i4, int i5, int i6, int i7) {
            boolean frame = super.setFrame(i4, i5, i6, i7);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                AbstractC1594a.e(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends androidx.appcompat.view.menu.f {
        public e(Context context, androidx.appcompat.view.menu.d dVar, View view, boolean z3) {
            super(context, dVar, view, z3, AbstractC0637a.f5561f);
            h(8388613);
            j(a.this.f4505C);
        }

        @Override // androidx.appcompat.view.menu.f
        public void e() {
            if (a.this.f4110d != null) {
                a.this.f4110d.close();
            }
            a.this.f4521y = null;
            super.e();
        }
    }

    public class f implements g.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
            if (dVar instanceof j) {
                dVar.z().d(false);
            }
            g.a aVarM = a.this.m();
            if (aVarM != null) {
                aVarM.b(dVar, z3);
            }
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            if (dVar == null) {
                return false;
            }
            a.this.f4506D = ((j) dVar).getItem().getItemId();
            g.a aVarM = a.this.m();
            if (aVarM != null) {
                return aVarM.c(dVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, AbstractC0642f.f5668c, AbstractC0642f.f5667b);
        this.f4520x = new SparseBooleanArray();
        this.f4505C = new f();
    }

    public boolean A() {
        e eVar = this.f4521y;
        return eVar != null && eVar.d();
    }

    public void B(Configuration configuration) {
        if (!this.f4515s) {
            this.f4514r = C1036a.a(this.f4109c).c();
        }
        androidx.appcompat.view.menu.d dVar = this.f4110d;
        if (dVar != null) {
            dVar.G(true);
        }
    }

    public void C(boolean z3) {
        this.f4518v = z3;
    }

    public void D(ActionMenuView actionMenuView) {
        this.f4116j = actionMenuView;
        actionMenuView.E(this.f4110d);
    }

    public void E(Drawable drawable) {
        d dVar = this.f4507k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f4509m = true;
            this.f4508l = drawable;
        }
    }

    public void F(boolean z3) {
        this.f4510n = z3;
        this.f4511o = true;
    }

    public boolean G() {
        androidx.appcompat.view.menu.d dVar;
        if (!this.f4510n || A() || (dVar = this.f4110d) == null || this.f4116j == null || this.f4503A != null || dVar.v().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f4109c, this.f4110d, this.f4507k, true));
        this.f4503A = cVar;
        ((View) this.f4116j).post(cVar);
        super.e(null);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
        v();
        super.b(dVar, z3);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void c(Context context, androidx.appcompat.view.menu.d dVar) {
        super.c(context, dVar);
        Resources resources = context.getResources();
        C1036a c1036aA = C1036a.a(context);
        if (!this.f4511o) {
            this.f4510n = c1036aA.d();
        }
        if (!this.f4517u) {
            this.f4512p = c1036aA.b();
        }
        if (!this.f4515s) {
            this.f4514r = c1036aA.c();
        }
        int measuredWidth = this.f4512p;
        if (this.f4510n) {
            if (this.f4507k == null) {
                d dVar2 = new d(this.f4108b);
                this.f4507k = dVar2;
                if (this.f4509m) {
                    dVar2.setImageDrawable(this.f4508l);
                    this.f4508l = null;
                    this.f4509m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f4507k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f4507k.getMeasuredWidth();
        } else {
            this.f4507k = null;
        }
        this.f4513q = measuredWidth;
        this.f4519w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a
    public void d(androidx.appcompat.view.menu.e eVar, h.a aVar) {
        aVar.d(eVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f4116j);
        if (this.f4504B == null) {
            this.f4504B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f4504B);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public boolean e(j jVar) {
        boolean z3 = false;
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        j jVar2 = jVar;
        while (jVar2.W() != this.f4110d) {
            jVar2 = (j) jVar2.W();
        }
        View viewW = w(jVar2.getItem());
        if (viewW == null) {
            return false;
        }
        this.f4506D = jVar.getItem().getItemId();
        int size = jVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = jVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z3 = true;
                break;
            }
            i4++;
        }
        C0087a c0087a = new C0087a(this.f4109c, jVar, viewW);
        this.f4522z = c0087a;
        c0087a.g(z3);
        this.f4522z.k();
        super.e(jVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.g
    public void f(boolean z3) {
        super.f(z3);
        ((View) this.f4116j).requestLayout();
        androidx.appcompat.view.menu.d dVar = this.f4110d;
        boolean z4 = false;
        if (dVar != null) {
            ArrayList arrayListR = dVar.r();
            int size = arrayListR.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((androidx.appcompat.view.menu.e) arrayListR.get(i4)).g();
            }
        }
        androidx.appcompat.view.menu.d dVar2 = this.f4110d;
        ArrayList arrayListV = dVar2 != null ? dVar2.v() : null;
        if (this.f4510n && arrayListV != null) {
            int size2 = arrayListV.size();
            if (size2 == 1) {
                z4 = !((androidx.appcompat.view.menu.e) arrayListV.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z4 = true;
            }
        }
        if (z4) {
            if (this.f4507k == null) {
                this.f4507k = new d(this.f4108b);
            }
            ViewGroup viewGroup = (ViewGroup) this.f4507k.getParent();
            if (viewGroup != this.f4116j) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f4507k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f4116j;
                actionMenuView.addView(this.f4507k, actionMenuView.C());
            }
        } else {
            d dVar3 = this.f4507k;
            if (dVar3 != null) {
                Object parent = dVar3.getParent();
                Object obj = this.f4116j;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f4507k);
                }
            }
        }
        ((ActionMenuView) this.f4116j).setOverflowReserved(this.f4510n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.e] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.g
    public boolean g() {
        ArrayList arrayListA;
        int size;
        int i4;
        int iG;
        ?? r02;
        int i5;
        a aVar = this;
        androidx.appcompat.view.menu.d dVar = aVar.f4110d;
        View view = null;
        ?? r32 = 0;
        if (dVar != null) {
            arrayListA = dVar.A();
            size = arrayListA.size();
        } else {
            arrayListA = null;
            size = 0;
        }
        int i6 = aVar.f4514r;
        int i7 = aVar.f4513q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f4116j;
        boolean z3 = false;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) arrayListA.get(i10);
            if (eVar.n()) {
                i8++;
            } else if (eVar.m()) {
                i9++;
            } else {
                z3 = true;
            }
            if (aVar.f4518v && eVar.isActionViewExpanded()) {
                i6 = 0;
            }
        }
        if (aVar.f4510n && (z3 || i9 + i8 > i6)) {
            i6--;
        }
        int i11 = i6 - i8;
        SparseBooleanArray sparseBooleanArray = aVar.f4520x;
        sparseBooleanArray.clear();
        if (aVar.f4516t) {
            int i12 = aVar.f4519w;
            iG = i7 / i12;
            i4 = i12 + ((i7 % i12) / iG);
        } else {
            i4 = 0;
            iG = 0;
        }
        int i13 = 0;
        int i14 = 0;
        ?? r03 = aVar;
        while (i13 < size) {
            ?? r15 = (androidx.appcompat.view.menu.e) arrayListA.get(i13);
            if (r15.n()) {
                View viewN = r03.n(r15, view, viewGroup);
                if (r03.f4516t) {
                    iG -= ActionMenuView.G(viewN, i4, iG, iMakeMeasureSpec, r32);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i7 -= measuredWidth;
                if (i14 == 0) {
                    i14 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.t(true);
                r02 = r32;
                i5 = size;
            } else if (r15.m()) {
                int groupId2 = r15.getGroupId();
                boolean z4 = sparseBooleanArray.get(groupId2);
                boolean z5 = (i11 > 0 || z4) && i7 > 0 && (!r03.f4516t || iG > 0);
                boolean z6 = z5;
                i5 = size;
                if (z5) {
                    View viewN2 = r03.n(r15, null, viewGroup);
                    if (r03.f4516t) {
                        int iG2 = ActionMenuView.G(viewN2, i4, iG, iMakeMeasureSpec, 0);
                        iG -= iG2;
                        if (iG2 == 0) {
                            z6 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z7 = z6;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i7 -= measuredWidth2;
                    if (i14 == 0) {
                        i14 = measuredWidth2;
                    }
                    z5 = z7 & (!r03.f4516t ? i7 + i14 <= 0 : i7 < 0);
                }
                if (z5 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z4) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i15 = 0; i15 < i13; i15++) {
                        androidx.appcompat.view.menu.e eVar2 = (androidx.appcompat.view.menu.e) arrayListA.get(i15);
                        if (eVar2.getGroupId() == groupId2) {
                            if (eVar2.k()) {
                                i11++;
                            }
                            eVar2.t(false);
                        }
                    }
                }
                if (z5) {
                    i11--;
                }
                r15.t(z5);
                r02 = 0;
            } else {
                r02 = r32;
                i5 = size;
                r15.t(r02);
            }
            i13++;
            r32 = r02;
            size = i5;
            view = null;
            r03 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i4) {
        if (viewGroup.getChildAt(i4) == this.f4507k) {
            return false;
        }
        return super.l(viewGroup, i4);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.e eVar, View view, ViewGroup viewGroup) {
        View actionView = eVar.getActionView();
        if (actionView == null || eVar.i()) {
            actionView = super.n(eVar, view, viewGroup);
        }
        actionView.setVisibility(eVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean o(int i4, androidx.appcompat.view.menu.e eVar) {
        return eVar.k();
    }

    public boolean v() {
        return y() | z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View w(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f4116j;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = viewGroup.getChildAt(i4);
            if ((childAt instanceof h.a) && ((h.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable x() {
        d dVar = this.f4507k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f4509m) {
            return this.f4508l;
        }
        return null;
    }

    public boolean y() {
        Object obj;
        c cVar = this.f4503A;
        if (cVar != null && (obj = this.f4116j) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f4503A = null;
            return true;
        }
        e eVar = this.f4521y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean z() {
        C0087a c0087a = this.f4522z;
        if (c0087a == null) {
            return false;
        }
        c0087a.b();
        return true;
    }
}
