package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.b;
import k.g0;

/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements d.b, h {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4306A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f4307B;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public androidx.appcompat.view.menu.d f4308q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Context f4309r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4310s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4311t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public androidx.appcompat.widget.a f4312u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public g.a f4313v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public d.a f4314w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4315x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4316y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4317z;

    public interface a {
        boolean b();

        boolean c();
    }

    public static class b implements g.a {
        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean c(androidx.appcompat.view.menu.d dVar) {
            return false;
        }
    }

    public static class c extends b.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f4318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f4320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f4321f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f4322g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f4323h;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f4318c = cVar.f4318c;
        }

        public c(int i4, int i5) {
            super(i4, i5);
            this.f4318c = false;
        }
    }

    public class d implements d.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.d.a
        public boolean a(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            e eVar = ActionMenuView.this.f4307B;
            return eVar != null && eVar.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.d.a
        public void b(androidx.appcompat.view.menu.d dVar) {
            d.a aVar = ActionMenuView.this.f4314w;
            if (aVar != null) {
                aVar.b(dVar);
            }
        }
    }

    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int G(android.view.View r5, int r6, int r7, int r8, int r9) {
        /*
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.appcompat.widget.ActionMenuView$c r0 = (androidx.appcompat.widget.ActionMenuView.c) r0
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            int r1 = r1 - r9
            int r8 = android.view.View.MeasureSpec.getMode(r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            boolean r9 = r5 instanceof androidx.appcompat.view.menu.ActionMenuItemView
            if (r9 == 0) goto L1b
            r9 = r5
            androidx.appcompat.view.menu.ActionMenuItemView r9 = (androidx.appcompat.view.menu.ActionMenuItemView) r9
            goto L1c
        L1b:
            r9 = 0
        L1c:
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L28
            boolean r9 = r9.f()
            if (r9 == 0) goto L28
            r9 = r2
            goto L29
        L28:
            r9 = r1
        L29:
            if (r7 <= 0) goto L4c
            r3 = 2
            if (r9 == 0) goto L30
            if (r7 < r3) goto L4c
        L30:
            int r7 = r7 * r6
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r4)
            r5.measure(r7, r8)
            int r7 = r5.getMeasuredWidth()
            int r4 = r7 / r6
            int r7 = r7 % r6
            if (r7 == 0) goto L45
            int r4 = r4 + 1
        L45:
            if (r9 == 0) goto L4a
            if (r4 >= r3) goto L4a
            goto L4d
        L4a:
            r3 = r4
            goto L4d
        L4c:
            r3 = r1
        L4d:
            boolean r7 = r0.f4318c
            if (r7 != 0) goto L54
            if (r9 == 0) goto L54
            r1 = r2
        L54:
            r0.f4321f = r1
            r0.f4319d = r3
            int r6 = r6 * r3
            r7 = 1073741824(0x40000000, float:2.0)
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r7)
            r5.measure(r6, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionMenuView.G(android.view.View, int, int, int, int):int");
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (cVar.f4549b <= 0) {
            cVar.f4549b = 16;
        }
        return cVar;
    }

    public c C() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f4318c = true;
        return cVarGenerateDefaultLayoutParams;
    }

    public boolean D(int i4) {
        boolean zB = false;
        if (i4 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i4 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i4);
        if (i4 < getChildCount() && (childAt instanceof a)) {
            zB = ((a) childAt).b();
        }
        return (i4 <= 0 || !(childAt2 instanceof a)) ? zB : ((a) childAt2).c() | zB;
    }

    public void E(androidx.appcompat.view.menu.d dVar) {
        this.f4308q = dVar;
    }

    public boolean F() {
        androidx.appcompat.widget.a aVar = this.f4312u;
        return aVar != null && aVar.A();
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public final void H(int i4, int i5) {
        long j4;
        int i6;
        int i7;
        boolean z3;
        boolean z4;
        ?? r32;
        int i8;
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i5, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.f4317z;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int iMax = 0;
        int i14 = 0;
        boolean z5 = false;
        int i15 = 0;
        int iMax2 = 0;
        int i16 = 0;
        long j5 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i17 = size2;
            if (childAt.getVisibility() == 8) {
                i8 = i13;
            } else {
                boolean z6 = childAt instanceof ActionMenuItemView;
                i15++;
                if (z6) {
                    int i18 = this.f4306A;
                    z4 = z6;
                    r32 = 0;
                    childAt.setPadding(i18, 0, i18, 0);
                } else {
                    z4 = z6;
                    r32 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f4323h = r32;
                cVar.f4320e = r32;
                cVar.f4319d = r32;
                cVar.f4321f = r32;
                ((ViewGroup.MarginLayoutParams) cVar).leftMargin = r32;
                ((ViewGroup.MarginLayoutParams) cVar).rightMargin = r32;
                cVar.f4322g = z4 && ((ActionMenuItemView) childAt).f();
                int iG = G(childAt, i13, cVar.f4318c ? 1 : i11, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iG);
                i8 = i13;
                if (cVar.f4321f) {
                    i16++;
                }
                if (cVar.f4318c) {
                    z5 = true;
                }
                i11 -= iG;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iG == 1) {
                    j5 |= (long) (1 << i14);
                }
            }
            i14++;
            size2 = i17;
            i13 = i8;
        }
        int i19 = size2;
        int i20 = i13;
        char c4 = 2;
        boolean z7 = z5 && i15 == 2;
        boolean z8 = false;
        while (i16 > 0 && i11 > 0) {
            int i21 = Integer.MAX_VALUE;
            long j6 = 0;
            char c5 = c4;
            int i22 = 0;
            int i23 = 0;
            j4 = 1;
            while (i23 < childCount) {
                c cVar2 = (c) getChildAt(i23).getLayoutParams();
                boolean z9 = z7;
                if (cVar2.f4321f) {
                    int i24 = cVar2.f4319d;
                    if (i24 < i21) {
                        j6 = 1 << i23;
                        i21 = i24;
                        i22 = 1;
                    } else if (i24 == i21) {
                        j6 |= 1 << i23;
                        i22++;
                    }
                }
                i23++;
                z7 = z9;
            }
            boolean z10 = z7;
            j5 |= j6;
            if (i22 > i11) {
                break;
            }
            int i25 = i21 + 1;
            int i26 = 0;
            while (i26 < childCount) {
                View childAt2 = getChildAt(i26);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j7 = 1 << i26;
                if ((j6 & j7) == 0) {
                    if (cVar3.f4319d == i25) {
                        j5 |= j7;
                    }
                    i7 = i26;
                } else {
                    if (!z10 || !cVar3.f4322g) {
                        i7 = i26;
                        z3 = true;
                    } else if (i11 == 1) {
                        int i27 = this.f4306A;
                        z3 = true;
                        i7 = i26;
                        childAt2.setPadding(i27 + i20, 0, i27, 0);
                    } else {
                        i7 = i26;
                        z3 = true;
                    }
                    cVar3.f4319d++;
                    cVar3.f4323h = z3;
                    i11--;
                }
                i26 = i7 + 1;
            }
            c4 = c5;
            z7 = z10;
            z8 = true;
        }
        j4 = 1;
        boolean z11 = !z5 && i15 == 1;
        if (i11 <= 0 || j5 == 0 || (i11 >= i15 - 1 && !z11 && iMax2 <= 1)) {
            i6 = 0;
        } else {
            float fBitCount = Long.bitCount(j5);
            if (z11) {
                i6 = 0;
            } else {
                if ((j5 & j4) != 0) {
                    i6 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f4322g) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i6 = 0;
                }
                int i28 = childCount - 1;
                if ((j5 & ((long) (1 << i28))) != 0 && !((c) getChildAt(i28).getLayoutParams()).f4322g) {
                    fBitCount -= 0.5f;
                }
            }
            int i29 = fBitCount > 0.0f ? (int) ((i11 * i20) / fBitCount) : i6;
            boolean z12 = z8;
            for (int i30 = i6; i30 < childCount; i30++) {
                if ((j5 & ((long) (1 << i30))) != 0) {
                    View childAt3 = getChildAt(i30);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f4320e = i29;
                        cVar4.f4323h = true;
                        if (i30 == 0 && !cVar4.f4322g) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = (-i29) / 2;
                        }
                        z12 = true;
                    } else if (cVar4.f4318c) {
                        cVar4.f4320e = i29;
                        cVar4.f4323h = true;
                        ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = (-i29) / 2;
                        z12 = true;
                    } else {
                        if (i30 != 0) {
                            ((ViewGroup.MarginLayoutParams) cVar4).leftMargin = i29 / 2;
                        }
                        if (i30 != childCount - 1) {
                            ((ViewGroup.MarginLayoutParams) cVar4).rightMargin = i29 / 2;
                        }
                    }
                }
            }
            z8 = z12;
        }
        if (z8) {
            for (int i31 = i6; i31 < childCount; i31++) {
                View childAt4 = getChildAt(i31);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f4323h) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f4319d * i20) + cVar5.f4320e, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, mode != 1073741824 ? iMax : i19);
    }

    public androidx.appcompat.view.menu.d I() {
        return this.f4308q;
    }

    public void J(g.a aVar, d.a aVar2) {
        this.f4313v = aVar;
        this.f4314w = aVar2;
    }

    public boolean K() {
        androidx.appcompat.widget.a aVar = this.f4312u;
        return aVar != null && aVar.G();
    }

    @Override // androidx.appcompat.view.menu.d.b
    public boolean a(androidx.appcompat.view.menu.e eVar) {
        return this.f4308q.H(eVar, 0);
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f4308q == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.d dVar = new androidx.appcompat.view.menu.d(context);
            this.f4308q = dVar;
            dVar.L(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f4312u = aVar;
            aVar.F(true);
            androidx.appcompat.widget.a aVar2 = this.f4312u;
            g.a bVar = this.f4313v;
            if (bVar == null) {
                bVar = new b();
            }
            aVar2.k(bVar);
            this.f4308q.b(this.f4312u, this.f4309r);
            this.f4312u.D(this);
        }
        return this.f4308q;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f4312u.x();
    }

    public int getPopupTheme() {
        return this.f4310s;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f4312u;
        if (aVar != null) {
            aVar.f(false);
            if (this.f4312u.A()) {
                this.f4312u.y();
                this.f4312u.G();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        y();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z3, int i4, int i5, int i6, int i7) {
        int width;
        int paddingLeft;
        if (!this.f4315x) {
            super.onLayout(z3, i4, i5, i6, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i5) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i6 - i4;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zB = g0.b(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f4318c) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (D(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) cVar).leftMargin) + ((ViewGroup.MarginLayoutParams) cVar).rightMargin;
                    D(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f4318c) {
                    int i18 = width2 - ((ViewGroup.MarginLayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((ViewGroup.MarginLayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f4318c) {
                int i21 = paddingLeft2 + ((ViewGroup.MarginLayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = i21 + measuredWidth4 + ((ViewGroup.MarginLayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i4, int i5) {
        androidx.appcompat.view.menu.d dVar;
        boolean z3 = this.f4315x;
        boolean z4 = View.MeasureSpec.getMode(i4) == 1073741824;
        this.f4315x = z4;
        if (z3 != z4) {
            this.f4316y = 0;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (this.f4315x && (dVar = this.f4308q) != null && size != this.f4316y) {
            this.f4316y = size;
            dVar.G(true);
        }
        int childCount = getChildCount();
        if (this.f4315x && childCount > 0) {
            H(i4, i5);
            return;
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            c cVar = (c) getChildAt(i6).getLayoutParams();
            ((ViewGroup.MarginLayoutParams) cVar).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i4, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z3) {
        this.f4312u.C(z3);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f4307B = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f4312u.E(drawable);
    }

    public void setOverflowReserved(boolean z3) {
        this.f4311t = z3;
    }

    public void setPopupTheme(int i4) {
        if (this.f4310s != i4) {
            this.f4310s = i4;
            if (i4 == 0) {
                this.f4309r = getContext();
            } else {
                this.f4309r = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f4312u = aVar;
        aVar.D(this);
    }

    public void y() {
        androidx.appcompat.widget.a aVar = this.f4312u;
        if (aVar != null) {
            aVar.v();
        }
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.f4549b = 16;
        return cVar;
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f4 = context.getResources().getDisplayMetrics().density;
        this.f4317z = (int) (56.0f * f4);
        this.f4306A = (int) (f4 * 4.0f);
        this.f4309r = context;
        this.f4310s = 0;
    }
}
