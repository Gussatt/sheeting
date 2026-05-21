package androidx.appcompat.widget;

import C.AbstractC0226i;
import C.AbstractC0227j;
import C.AbstractC0241y;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.d;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import c.AbstractC0637a;
import c.AbstractC0645i;
import d.AbstractC0910a;
import e.AbstractC0921a;
import i.C1038c;
import i.InterfaceC1037b;
import java.util.ArrayList;
import java.util.List;
import k.C1118g;
import k.C1120i;
import k.C1132v;
import k.InterfaceC1111A;
import k.T;
import k.a0;
import k.g0;

/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f4450A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ColorStateList f4451B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f4452C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f4453D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f4454E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final ArrayList f4455F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final int[] f4456G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final ActionMenuView.e f4457H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public androidx.appcompat.widget.d f4458I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public androidx.appcompat.widget.a f4459J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public d f4460K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public g.a f4461L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public d.a f4462M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f4463N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final Runnable f4464O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ActionMenuView f4465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f4466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f4467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageButton f4468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f4469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f4470g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CharSequence f4471h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageButton f4472i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f4473j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Context f4474k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4475l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f4476m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4477n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4478o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4479p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4480q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4481r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f4482s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4483t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public T f4484u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4485v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f4486w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4487x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f4488y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public CharSequence f4489z;

    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            Toolbar.this.getClass();
            return false;
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.H();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.d();
        }
    }

    public class d implements androidx.appcompat.view.menu.g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.d f4493b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f4494c;

        public d() {
        }

        @Override // androidx.appcompat.view.menu.g
        public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
        }

        @Override // androidx.appcompat.view.menu.g
        public void c(Context context, androidx.appcompat.view.menu.d dVar) {
            androidx.appcompat.view.menu.e eVar;
            androidx.appcompat.view.menu.d dVar2 = this.f4493b;
            if (dVar2 != null && (eVar = this.f4494c) != null) {
                dVar2.e(eVar);
            }
            this.f4493b = dVar;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean e(j jVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g
        public void f(boolean z3) {
            if (this.f4494c != null) {
                androidx.appcompat.view.menu.d dVar = this.f4493b;
                if (dVar != null) {
                    int size = dVar.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        if (this.f4493b.getItem(i4) == this.f4494c) {
                            return;
                        }
                    }
                }
                h(this.f4493b, this.f4494c);
            }
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean h(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.e eVar) {
            KeyEvent.Callback callback = Toolbar.this.f4473j;
            if (callback instanceof InterfaceC1037b) {
                ((InterfaceC1037b) callback).c();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f4473j);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f4472i);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f4473j = null;
            toolbar3.a();
            this.f4494c = null;
            Toolbar.this.requestLayout();
            eVar.q(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.g
        public boolean j(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.e eVar) {
            Toolbar.this.e();
            ViewParent parent = Toolbar.this.f4472i.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f4472i);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f4472i);
            }
            Toolbar.this.f4473j = eVar.getActionView();
            this.f4494c = eVar;
            ViewParent parent2 = Toolbar.this.f4473j.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f4473j);
                }
                e eVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                eVarGenerateDefaultLayoutParams.f7120a = (toolbar4.f4478o & 112) | 8388611;
                eVarGenerateDefaultLayoutParams.f4496b = 2;
                toolbar4.f4473j.setLayoutParams(eVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f4473j);
            }
            Toolbar.this.B();
            Toolbar.this.requestLayout();
            eVar.q(true);
            KeyEvent.Callback callback = Toolbar.this.f4473j;
            if (callback instanceof InterfaceC1037b) {
                ((InterfaceC1037b) callback).b();
            }
            return true;
        }
    }

    public interface f {
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC0637a.f5575t);
    }

    private MenuInflater getMenuInflater() {
        return new C1038c(getContext());
    }

    public final void A() {
        removeCallbacks(this.f4464O);
        post(this.f4464O);
    }

    public void B() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f4496b != 2 && childAt != this.f4465b) {
                removeViewAt(childCount);
                this.f4455F.add(childAt);
            }
        }
    }

    public void C(int i4, int i5) {
        f();
        this.f4484u.g(i4, i5);
    }

    public void D(Context context, int i4) {
        this.f4477n = i4;
        TextView textView = this.f4467d;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public void E(Context context, int i4) {
        this.f4476m = i4;
        TextView textView = this.f4466c;
        if (textView != null) {
            textView.setTextAppearance(context, i4);
        }
    }

    public final boolean F() {
        if (!this.f4463N) {
            return false;
        }
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (G(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean G(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean H() {
        ActionMenuView actionMenuView = this.f4465b;
        return actionMenuView != null && actionMenuView.K();
    }

    public void a() {
        for (int size = this.f4455F.size() - 1; size >= 0; size--) {
            addView((View) this.f4455F.get(size));
        }
        this.f4455F.clear();
    }

    public final void b(List list, int i4) {
        boolean z3 = AbstractC0241y.l(this) == 1;
        int childCount = getChildCount();
        int iA = AbstractC0226i.a(i4, AbstractC0241y.l(this));
        list.clear();
        if (!z3) {
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f4496b == 0 && G(childAt) && n(eVar.f7120a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i6 = childCount - 1; i6 >= 0; i6--) {
            View childAt2 = getChildAt(i6);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f4496b == 0 && G(childAt2) && n(eVar2.f7120a) == iA) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z3) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e eVarGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        eVarGenerateDefaultLayoutParams.f4496b = 1;
        if (!z3 || this.f4473j == null) {
            addView(view, eVarGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f4455F.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public void d() {
        d dVar = this.f4460K;
        androidx.appcompat.view.menu.e eVar = dVar == null ? null : dVar.f4494c;
        if (eVar != null) {
            eVar.collapseActionView();
        }
    }

    public void e() {
        if (this.f4472i == null) {
            C1118g c1118g = new C1118g(getContext(), null, AbstractC0637a.f5574s);
            this.f4472i = c1118g;
            c1118g.setImageDrawable(this.f4470g);
            this.f4472i.setContentDescription(this.f4471h);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f7120a = (this.f4478o & 112) | 8388611;
            eVarGenerateDefaultLayoutParams.f4496b = 2;
            this.f4472i.setLayoutParams(eVarGenerateDefaultLayoutParams);
            this.f4472i.setOnClickListener(new c());
        }
    }

    public final void f() {
        if (this.f4484u == null) {
            this.f4484u = new T();
        }
    }

    public final void g() {
        if (this.f4469f == null) {
            this.f4469f = new C1120i(getContext());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f4472i;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f4472i;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        T t4 = this.f4484u;
        if (t4 != null) {
            return t4.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i4 = this.f4486w;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        T t4 = this.f4484u;
        if (t4 != null) {
            return t4.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        T t4 = this.f4484u;
        if (t4 != null) {
            return t4.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        T t4 = this.f4484u;
        if (t4 != null) {
            return t4.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i4 = this.f4485v;
        return i4 != Integer.MIN_VALUE ? i4 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.d dVarI;
        ActionMenuView actionMenuView = this.f4465b;
        return (actionMenuView == null || (dVarI = actionMenuView.I()) == null || !dVarI.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f4486w, 0));
    }

    public int getCurrentContentInsetLeft() {
        return AbstractC0241y.l(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return AbstractC0241y.l(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f4485v, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f4469f;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f4469f;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        h();
        return this.f4465b.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f4468e;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f4468e;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.f4459J;
    }

    public Drawable getOverflowIcon() {
        h();
        return this.f4465b.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f4474k;
    }

    public int getPopupTheme() {
        return this.f4475l;
    }

    public CharSequence getSubtitle() {
        return this.f4489z;
    }

    public final TextView getSubtitleTextView() {
        return this.f4467d;
    }

    public CharSequence getTitle() {
        return this.f4488y;
    }

    public int getTitleMarginBottom() {
        return this.f4483t;
    }

    public int getTitleMarginEnd() {
        return this.f4481r;
    }

    public int getTitleMarginStart() {
        return this.f4480q;
    }

    public int getTitleMarginTop() {
        return this.f4482s;
    }

    public final TextView getTitleTextView() {
        return this.f4466c;
    }

    public InterfaceC1111A getWrapper() {
        if (this.f4458I == null) {
            this.f4458I = new androidx.appcompat.widget.d(this, true);
        }
        return this.f4458I;
    }

    public final void h() {
        i();
        if (this.f4465b.I() == null) {
            androidx.appcompat.view.menu.d dVar = (androidx.appcompat.view.menu.d) this.f4465b.getMenu();
            if (this.f4460K == null) {
                this.f4460K = new d();
            }
            this.f4465b.setExpandedActionViewsExclusive(true);
            dVar.b(this.f4460K, this.f4474k);
        }
    }

    public final void i() {
        if (this.f4465b == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f4465b = actionMenuView;
            actionMenuView.setPopupTheme(this.f4475l);
            this.f4465b.setOnMenuItemClickListener(this.f4457H);
            this.f4465b.J(this.f4461L, this.f4462M);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f7120a = (this.f4478o & 112) | 8388613;
            this.f4465b.setLayoutParams(eVarGenerateDefaultLayoutParams);
            c(this.f4465b, false);
        }
    }

    public final void j() {
        if (this.f4468e == null) {
            this.f4468e = new C1118g(getContext(), null, AbstractC0637a.f5574s);
            e eVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            eVarGenerateDefaultLayoutParams.f7120a = (this.f4478o & 112) | 8388611;
            this.f4468e.setLayoutParams(eVarGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof AbstractC0910a ? new e((AbstractC0910a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public final int n(int i4) {
        int iL = AbstractC0241y.l(this);
        int iA = AbstractC0226i.a(i4, iL) & 7;
        return (iA == 1 || iA == 3 || iA == 5) ? iA : iL == 1 ? 5 : 3;
    }

    public final int o(View view, int i4) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = i4 > 0 ? (measuredHeight - i4) / 2 : 0;
        int iP = p(eVar.f7120a);
        if (iP == 48) {
            return getPaddingTop() - i5;
        }
        if (iP == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i5;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        if (iMax < i6) {
            iMax = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            if (i7 < i8) {
                iMax = Math.max(0, iMax - (i8 - i7));
            }
        }
        return paddingTop + iMax;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f4464O);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f4453D = false;
        }
        if (!this.f4453D) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f4453D = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f4453D = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0298 A[LOOP:0: B:104:0x0296->B:105:0x0298, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b6 A[LOOP:1: B:107:0x02b4->B:108:0x02b6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02ed A[LOOP:2: B:116:0x02eb->B:117:0x02ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021e  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instruction units count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i4, int i5) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f4456G;
        boolean zB = g0.b(this);
        int i6 = !zB ? 1 : 0;
        if (G(this.f4468e)) {
            z(this.f4468e, i4, 0, i5, 0, this.f4479p);
            measuredWidth = this.f4468e.getMeasuredWidth() + q(this.f4468e);
            iMax = Math.max(0, this.f4468e.getMeasuredHeight() + r(this.f4468e));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f4468e.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (G(this.f4472i)) {
            z(this.f4472i, i4, 0, i5, 0, this.f4479p);
            measuredWidth = this.f4472i.getMeasuredWidth() + q(this.f4472i);
            iMax = Math.max(iMax, this.f4472i.getMeasuredHeight() + r(this.f4472i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4472i.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (G(this.f4465b)) {
            z(this.f4465b, i4, iMax3, i5, 0, this.f4479p);
            measuredWidth2 = this.f4465b.getMeasuredWidth() + q(this.f4465b);
            iMax = Math.max(iMax, this.f4465b.getMeasuredHeight() + r(this.f4465b));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4465b.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i6] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (G(this.f4473j)) {
            iArr = iArr2;
            iMax4 += y(this.f4473j, i4, iMax4, i5, 0, iArr);
            iMax = Math.max(iMax, this.f4473j.getMeasuredHeight() + r(this.f4473j));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4473j.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (G(this.f4469f)) {
            iMax4 += y(this.f4469f, i4, iMax4, i5, 0, iArr);
            iMax = Math.max(iMax, this.f4469f.getMeasuredHeight() + r(this.f4469f));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f4469f.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (((e) childAt.getLayoutParams()).f4496b == 0 && G(childAt)) {
                iMax4 += y(childAt, i4, iMax4, i5, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + r(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i8 = iMax4;
        int i9 = this.f4482s + this.f4483t;
        int i10 = this.f4480q + this.f4481r;
        if (G(this.f4466c)) {
            y(this.f4466c, i4, i8 + i10, i5, i9, iArr);
            int measuredWidth3 = this.f4466c.getMeasuredWidth() + q(this.f4466c);
            int measuredHeight2 = this.f4466c.getMeasuredHeight() + r(this.f4466c);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f4466c.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (G(this.f4467d)) {
            iMax2 = Math.max(iMax2, y(this.f4467d, i4, i8 + i10, i5, i9 + measuredHeight, iArr));
            measuredHeight += this.f4467d.getMeasuredHeight() + r(this.f4467d);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f4467d.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i8 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i4, (-16777216) & iCombineMeasuredStates2), F() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i5, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f4465b;
        androidx.appcompat.view.menu.d dVarI = actionMenuView != null ? actionMenuView.I() : null;
        int i4 = gVar.f4497o;
        if (i4 != 0 && this.f4460K != null && dVarI != null && (menuItemFindItem = dVarI.findItem(i4)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (gVar.f4498p) {
            A();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i4) {
        super.onRtlPropertiesChanged(i4);
        f();
        this.f4484u.f(i4 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.e eVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.f4460K;
        if (dVar != null && (eVar = dVar.f4494c) != null) {
            gVar.f4497o = eVar.getItemId();
        }
        gVar.f4498p = v();
        return gVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f4452C = false;
        }
        if (!this.f4452C) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f4452C = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f4452C = false;
        }
        return true;
    }

    public final int p(int i4) {
        int i5 = i4 & 112;
        return (i5 == 16 || i5 == 48 || i5 == 80) ? i5 : this.f4487x & 112;
    }

    public final int q(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return AbstractC0227j.b(marginLayoutParams) + AbstractC0227j.a(marginLayoutParams);
    }

    public final int r(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int s(List list, int[] iArr) {
        int i4 = iArr[0];
        int i5 = iArr[1];
        int size = list.size();
        int i6 = 0;
        int measuredWidth = 0;
        while (i6 < size) {
            View view = (View) list.get(i6);
            e eVar = (e) view.getLayoutParams();
            int i7 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i4;
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i5;
            int iMax = Math.max(0, i7);
            int iMax2 = Math.max(0, i8);
            int iMax3 = Math.max(0, -i7);
            int iMax4 = Math.max(0, -i8);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i6++;
            i5 = iMax4;
            i4 = iMax3;
        }
        return measuredWidth;
    }

    public void setCollapseContentDescription(int i4) {
        setCollapseContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setCollapseIcon(int i4) {
        setCollapseIcon(AbstractC0921a.b(getContext(), i4));
    }

    public void setCollapsible(boolean z3) {
        this.f4463N = z3;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f4486w) {
            this.f4486w = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i4) {
        if (i4 < 0) {
            i4 = Integer.MIN_VALUE;
        }
        if (i4 != this.f4485v) {
            this.f4485v = i4;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i4) {
        setLogo(AbstractC0921a.b(getContext(), i4));
    }

    public void setLogoDescription(int i4) {
        setLogoDescription(getContext().getText(i4));
    }

    public void setNavigationContentDescription(int i4) {
        setNavigationContentDescription(i4 != 0 ? getContext().getText(i4) : null);
    }

    public void setNavigationIcon(int i4) {
        setNavigationIcon(AbstractC0921a.b(getContext(), i4));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        j();
        this.f4468e.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
    }

    public void setOverflowIcon(Drawable drawable) {
        h();
        this.f4465b.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i4) {
        if (this.f4475l != i4) {
            this.f4475l = i4;
            if (i4 == 0) {
                this.f4474k = getContext();
            } else {
                this.f4474k = new ContextThemeWrapper(getContext(), i4);
            }
        }
    }

    public void setSubtitle(int i4) {
        setSubtitle(getContext().getText(i4));
    }

    public void setSubtitleTextColor(int i4) {
        setSubtitleTextColor(ColorStateList.valueOf(i4));
    }

    public void setTitle(int i4) {
        setTitle(getContext().getText(i4));
    }

    public void setTitleMarginBottom(int i4) {
        this.f4483t = i4;
        requestLayout();
    }

    public void setTitleMarginEnd(int i4) {
        this.f4481r = i4;
        requestLayout();
    }

    public void setTitleMarginStart(int i4) {
        this.f4480q = i4;
        requestLayout();
    }

    public void setTitleMarginTop(int i4) {
        this.f4482s = i4;
        requestLayout();
    }

    public void setTitleTextColor(int i4) {
        setTitleTextColor(ColorStateList.valueOf(i4));
    }

    public void t(int i4) {
        getMenuInflater().inflate(i4, getMenu());
    }

    public final boolean u(View view) {
        return view.getParent() == this || this.f4455F.contains(view);
    }

    public boolean v() {
        ActionMenuView actionMenuView = this.f4465b;
        return actionMenuView != null && actionMenuView.F();
    }

    public final int w(View view, int i4, int[] iArr, int i5) {
        e eVar = (e) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int iMax = i4 + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        int iO = o(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iO, iMax + measuredWidth, view.getMeasuredHeight() + iO);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    public final int x(View view, int i4, int[] iArr, int i5) {
        e eVar = (e) view.getLayoutParams();
        int i6 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int iMax = i4 - Math.max(0, i6);
        iArr[1] = Math.max(0, -i6);
        int iO = o(view, i5);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iO, iMax, view.getMeasuredHeight() + iO);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    public final int y(View view, int i4, int i5, int i6, int i7, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i8 = marginLayoutParams.leftMargin - iArr[0];
        int i9 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i8) + Math.max(0, i9);
        iArr[0] = Math.max(0, -i8);
        iArr[1] = Math.max(0, -i9);
        view.measure(ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + iMax + i5, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void z(View view, int i4, int i5, int i6, int i7, int i8) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i4, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i5, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i6, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i8 >= 0) {
            if (mode != 0) {
                i8 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i8);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public static class e extends AbstractC0910a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4496b;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f4496b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(int i4, int i5) {
            super(i4, i5);
            this.f4496b = 0;
            this.f7120a = 8388627;
        }

        public e(e eVar) {
            super((AbstractC0910a) eVar);
            this.f4496b = 0;
            this.f4496b = eVar.f4496b;
        }

        public e(AbstractC0910a abstractC0910a) {
            super(abstractC0910a);
            this.f4496b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f4496b = 0;
            a(marginLayoutParams);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f4496b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f4487x = 8388627;
        this.f4454E = new ArrayList();
        this.f4455F = new ArrayList();
        this.f4456G = new int[2];
        this.f4457H = new a();
        this.f4464O = new b();
        a0 a0VarR = a0.r(getContext(), attributeSet, AbstractC0645i.f5901x2, i4, 0);
        this.f4476m = a0VarR.l(AbstractC0645i.f5795Z2, 0);
        this.f4477n = a0VarR.l(AbstractC0645i.f5759Q2, 0);
        this.f4487x = a0VarR.j(AbstractC0645i.f5905y2, this.f4487x);
        this.f4478o = a0VarR.j(AbstractC0645i.f5909z2, 48);
        int iD = a0VarR.d(AbstractC0645i.f5771T2, 0);
        iD = a0VarR.o(AbstractC0645i.f5791Y2) ? a0VarR.d(AbstractC0645i.f5791Y2, iD) : iD;
        this.f4483t = iD;
        this.f4482s = iD;
        this.f4481r = iD;
        this.f4480q = iD;
        int iD2 = a0VarR.d(AbstractC0645i.f5783W2, -1);
        if (iD2 >= 0) {
            this.f4480q = iD2;
        }
        int iD3 = a0VarR.d(AbstractC0645i.f5779V2, -1);
        if (iD3 >= 0) {
            this.f4481r = iD3;
        }
        int iD4 = a0VarR.d(AbstractC0645i.f5787X2, -1);
        if (iD4 >= 0) {
            this.f4482s = iD4;
        }
        int iD5 = a0VarR.d(AbstractC0645i.f5775U2, -1);
        if (iD5 >= 0) {
            this.f4483t = iD5;
        }
        this.f4479p = a0VarR.e(AbstractC0645i.f5735K2, -1);
        int iD6 = a0VarR.d(AbstractC0645i.f5719G2, Integer.MIN_VALUE);
        int iD7 = a0VarR.d(AbstractC0645i.f5703C2, Integer.MIN_VALUE);
        int iE = a0VarR.e(AbstractC0645i.f5711E2, 0);
        int iE2 = a0VarR.e(AbstractC0645i.f5715F2, 0);
        f();
        this.f4484u.e(iE, iE2);
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.f4484u.g(iD6, iD7);
        }
        this.f4485v = a0VarR.d(AbstractC0645i.f5723H2, Integer.MIN_VALUE);
        this.f4486w = a0VarR.d(AbstractC0645i.f5707D2, Integer.MIN_VALUE);
        this.f4470g = a0VarR.f(AbstractC0645i.f5699B2);
        this.f4471h = a0VarR.n(AbstractC0645i.f5695A2);
        CharSequence charSequenceN = a0VarR.n(AbstractC0645i.f5767S2);
        if (!TextUtils.isEmpty(charSequenceN)) {
            setTitle(charSequenceN);
        }
        CharSequence charSequenceN2 = a0VarR.n(AbstractC0645i.f5755P2);
        if (!TextUtils.isEmpty(charSequenceN2)) {
            setSubtitle(charSequenceN2);
        }
        this.f4474k = getContext();
        setPopupTheme(a0VarR.l(AbstractC0645i.f5751O2, 0));
        Drawable drawableF = a0VarR.f(AbstractC0645i.f5747N2);
        if (drawableF != null) {
            setNavigationIcon(drawableF);
        }
        CharSequence charSequenceN3 = a0VarR.n(AbstractC0645i.f5743M2);
        if (!TextUtils.isEmpty(charSequenceN3)) {
            setNavigationContentDescription(charSequenceN3);
        }
        Drawable drawableF2 = a0VarR.f(AbstractC0645i.f5727I2);
        if (drawableF2 != null) {
            setLogo(drawableF2);
        }
        CharSequence charSequenceN4 = a0VarR.n(AbstractC0645i.f5731J2);
        if (!TextUtils.isEmpty(charSequenceN4)) {
            setLogoDescription(charSequenceN4);
        }
        if (a0VarR.o(AbstractC0645i.f5800a3)) {
            setTitleTextColor(a0VarR.c(AbstractC0645i.f5800a3));
        }
        if (a0VarR.o(AbstractC0645i.f5763R2)) {
            setSubtitleTextColor(a0VarR.c(AbstractC0645i.f5763R2));
        }
        if (a0VarR.o(AbstractC0645i.f5739L2)) {
            t(a0VarR.l(AbstractC0645i.f5739L2, 0));
        }
        a0VarR.s();
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.f4472i;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            this.f4472i.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f4472i;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f4470g);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!u(this.f4469f)) {
                c(this.f4469f, true);
            }
        } else {
            ImageView imageView = this.f4469f;
            if (imageView != null && u(imageView)) {
                removeView(this.f4469f);
                this.f4455F.remove(this.f4469f);
            }
        }
        ImageView imageView2 = this.f4469f;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageView imageView = this.f4469f;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageButton imageButton = this.f4468e;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!u(this.f4468e)) {
                c(this.f4468e, true);
            }
        } else {
            ImageButton imageButton = this.f4468e;
            if (imageButton != null && u(imageButton)) {
                removeView(this.f4468e);
                this.f4455F.remove(this.f4468e);
            }
        }
        ImageButton imageButton2 = this.f4468e;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f4467d;
            if (textView != null && u(textView)) {
                removeView(this.f4467d);
                this.f4455F.remove(this.f4467d);
            }
        } else {
            if (this.f4467d == null) {
                Context context = getContext();
                C1132v c1132v = new C1132v(context);
                this.f4467d = c1132v;
                c1132v.setSingleLine();
                this.f4467d.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f4477n;
                if (i4 != 0) {
                    this.f4467d.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f4451B;
                if (colorStateList != null) {
                    this.f4467d.setTextColor(colorStateList);
                }
            }
            if (!u(this.f4467d)) {
                c(this.f4467d, true);
            }
        }
        TextView textView2 = this.f4467d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f4489z = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f4451B = colorStateList;
        TextView textView = this.f4467d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f4466c;
            if (textView != null && u(textView)) {
                removeView(this.f4466c);
                this.f4455F.remove(this.f4466c);
            }
        } else {
            if (this.f4466c == null) {
                Context context = getContext();
                C1132v c1132v = new C1132v(context);
                this.f4466c = c1132v;
                c1132v.setSingleLine();
                this.f4466c.setEllipsize(TextUtils.TruncateAt.END);
                int i4 = this.f4476m;
                if (i4 != 0) {
                    this.f4466c.setTextAppearance(context, i4);
                }
                ColorStateList colorStateList = this.f4450A;
                if (colorStateList != null) {
                    this.f4466c.setTextColor(colorStateList);
                }
            }
            if (!u(this.f4466c)) {
                c(this.f4466c, true);
            }
        }
        TextView textView2 = this.f4466c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f4488y = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f4450A = colorStateList;
        TextView textView = this.f4466c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public static class g extends J.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f4497o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f4498p;

        public static class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i4) {
                return new g[i4];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4497o = parcel.readInt();
            this.f4498p = parcel.readInt() != 0;
        }

        @Override // J.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i4) {
            super.writeToParcel(parcel, i4);
            parcel.writeInt(this.f4497o);
            parcel.writeInt(this.f4498p ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
