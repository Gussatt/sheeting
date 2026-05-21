package androidx.appcompat.view.menu;

import C.AbstractC0226i;
import C.AbstractC0241y;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import c.AbstractC0639c;
import c.AbstractC0642f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.N;
import k.P;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j.b implements g, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f4117C = AbstractC0642f.f5670e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4118A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f4119B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f4124g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f4125h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f4133p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f4134q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4136s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f4137t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4138u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4139v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4141x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g.a f4142y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewTreeObserver f4143z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f4126i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f4127j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f4128k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f4129l = new ViewOnAttachStateChangeListenerC0086b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N f4130m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4131n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4132o = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4140w = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4135r = D();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.i() || b.this.f4127j.size() <= 0 || ((d) b.this.f4127j.get(0)).f4151a.n()) {
                return;
            }
            View view = b.this.f4134q;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f4127j.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f4151a.a();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0086b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0086b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f4143z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f4143z = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f4143z.removeGlobalOnLayoutListener(bVar.f4128k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements N {

        public class a implements Runnable {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ d f4147m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public final /* synthetic */ MenuItem f4148n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final /* synthetic */ androidx.appcompat.view.menu.d f4149o;

            public a(d dVar, MenuItem menuItem, androidx.appcompat.view.menu.d dVar2) {
                this.f4147m = dVar;
                this.f4148n = menuItem;
                this.f4149o = dVar2;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f4147m;
                if (dVar != null) {
                    b.this.f4119B = true;
                    dVar.f4152b.d(false);
                    b.this.f4119B = false;
                }
                if (this.f4148n.isEnabled() && this.f4148n.hasSubMenu()) {
                    this.f4149o.H(this.f4148n, 4);
                }
            }
        }

        public c() {
        }

        @Override // k.N
        public void b(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            b.this.f4125h.removeCallbacksAndMessages(null);
            int size = b.this.f4127j.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    i4 = -1;
                    break;
                } else if (dVar == ((d) b.this.f4127j.get(i4)).f4152b) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 == -1) {
                return;
            }
            int i5 = i4 + 1;
            b.this.f4125h.postAtTime(new a(i5 < b.this.f4127j.size() ? (d) b.this.f4127j.get(i5) : null, menuItem, dVar), dVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // k.N
        public void c(androidx.appcompat.view.menu.d dVar, MenuItem menuItem) {
            b.this.f4125h.removeCallbacksAndMessages(dVar);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P f4151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final androidx.appcompat.view.menu.d f4152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4153c;

        public d(P p4, androidx.appcompat.view.menu.d dVar, int i4) {
            this.f4151a = p4;
            this.f4152b = dVar;
            this.f4153c = i4;
        }

        public ListView a() {
            return this.f4151a.d();
        }
    }

    public b(Context context, View view, int i4, int i5, boolean z3) {
        this.f4120c = context;
        this.f4133p = view;
        this.f4122e = i4;
        this.f4123f = i5;
        this.f4124g = z3;
        Resources resources = context.getResources();
        this.f4121d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC0639c.f5583b));
        this.f4125h = new Handler();
    }

    public final int A(androidx.appcompat.view.menu.d dVar) {
        int size = this.f4127j.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (dVar == ((d) this.f4127j.get(i4)).f4152b) {
                return i4;
            }
        }
        return -1;
    }

    public final MenuItem B(androidx.appcompat.view.menu.d dVar, androidx.appcompat.view.menu.d dVar2) {
        int size = dVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = dVar.getItem(i4);
            if (item.hasSubMenu() && dVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(d dVar, androidx.appcompat.view.menu.d dVar2) {
        androidx.appcompat.view.menu.c cVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.f4152b, dVar2);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i4 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            cVar = (androidx.appcompat.view.menu.c) headerViewListAdapter.getWrappedAdapter();
        } else {
            cVar = (androidx.appcompat.view.menu.c) adapter;
            headersCount = 0;
        }
        int count = cVar.getCount();
        while (true) {
            if (i4 >= count) {
                i4 = -1;
                break;
            }
            if (menuItemB == cVar.getItem(i4)) {
                break;
            }
            i4++;
        }
        if (i4 != -1 && (firstVisiblePosition = (i4 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int D() {
        return AbstractC0241y.l(this.f4133p) == 1 ? 0 : 1;
    }

    public final int E(int i4) {
        List list = this.f4127j;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f4134q.getWindowVisibleDisplayFrame(rect);
        return this.f4135r == 1 ? (iArr[0] + listViewA.getWidth()) + i4 > rect.right ? 0 : 1 : iArr[0] - i4 < 0 ? 1 : 0;
    }

    public final void F(androidx.appcompat.view.menu.d dVar) {
        d dVar2;
        View viewC;
        int i4;
        int i5;
        int i6;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f4120c);
        androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(dVar, layoutInflaterFrom, this.f4124g, f4117C);
        if (!i() && this.f4140w) {
            cVar.d(true);
        } else if (i()) {
            cVar.d(j.b.x(dVar));
        }
        int iO = j.b.o(cVar, null, this.f4120c, this.f4121d);
        P pZ = z();
        pZ.p(cVar);
        pZ.s(iO);
        pZ.t(this.f4132o);
        if (this.f4127j.size() > 0) {
            List list = this.f4127j;
            dVar2 = (d) list.get(list.size() - 1);
            viewC = C(dVar2, dVar);
        } else {
            dVar2 = null;
            viewC = null;
        }
        if (viewC != null) {
            pZ.H(false);
            pZ.E(null);
            int iE = E(iO);
            boolean z3 = iE == 1;
            this.f4135r = iE;
            if (Build.VERSION.SDK_INT >= 26) {
                pZ.q(viewC);
                i5 = 0;
                i4 = 0;
            } else {
                int[] iArr = new int[2];
                this.f4133p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewC.getLocationOnScreen(iArr2);
                if ((this.f4132o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f4133p.getWidth();
                    iArr2[0] = iArr2[0] + viewC.getWidth();
                }
                i4 = iArr2[0] - iArr[0];
                i5 = iArr2[1] - iArr[1];
            }
            if ((this.f4132o & 5) == 5) {
                if (!z3) {
                    iO = viewC.getWidth();
                    i6 = i4 - iO;
                }
                i6 = i4 + iO;
            } else {
                if (z3) {
                    iO = viewC.getWidth();
                    i6 = i4 + iO;
                }
                i6 = i4 - iO;
            }
            pZ.v(i6);
            pZ.A(true);
            pZ.C(i5);
        } else {
            if (this.f4136s) {
                pZ.v(this.f4138u);
            }
            if (this.f4137t) {
                pZ.C(this.f4139v);
            }
            pZ.u(n());
        }
        this.f4127j.add(new d(pZ, dVar, this.f4135r));
        pZ.a();
        ListView listViewD = pZ.d();
        listViewD.setOnKeyListener(this);
        if (dVar2 == null && this.f4141x && dVar.u() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(AbstractC0642f.f5674i, (ViewGroup) listViewD, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(dVar.u());
            listViewD.addHeaderView(frameLayout, null, false);
            pZ.a();
        }
    }

    @Override // j.c
    public void a() {
        if (i()) {
            return;
        }
        Iterator it = this.f4126i.iterator();
        while (it.hasNext()) {
            F((androidx.appcompat.view.menu.d) it.next());
        }
        this.f4126i.clear();
        View view = this.f4133p;
        this.f4134q = view;
        if (view != null) {
            boolean z3 = this.f4143z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4143z = viewTreeObserver;
            if (z3) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4128k);
            }
            this.f4134q.addOnAttachStateChangeListener(this.f4129l);
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(androidx.appcompat.view.menu.d dVar, boolean z3) {
        int iA = A(dVar);
        if (iA < 0) {
            return;
        }
        int i4 = iA + 1;
        if (i4 < this.f4127j.size()) {
            ((d) this.f4127j.get(i4)).f4152b.d(false);
        }
        d dVar2 = (d) this.f4127j.remove(iA);
        dVar2.f4152b.K(this);
        if (this.f4119B) {
            dVar2.f4151a.F(null);
            dVar2.f4151a.r(0);
        }
        dVar2.f4151a.dismiss();
        int size = this.f4127j.size();
        if (size > 0) {
            this.f4135r = ((d) this.f4127j.get(size - 1)).f4153c;
        } else {
            this.f4135r = D();
        }
        if (size != 0) {
            if (z3) {
                ((d) this.f4127j.get(0)).f4152b.d(false);
                return;
            }
            return;
        }
        dismiss();
        g.a aVar = this.f4142y;
        if (aVar != null) {
            aVar.b(dVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4143z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4143z.removeGlobalOnLayoutListener(this.f4128k);
            }
            this.f4143z = null;
        }
        this.f4134q.removeOnAttachStateChangeListener(this.f4129l);
        this.f4118A.onDismiss();
    }

    @Override // j.c
    public ListView d() {
        if (this.f4127j.isEmpty()) {
            return null;
        }
        return ((d) this.f4127j.get(r0.size() - 1)).a();
    }

    @Override // j.c
    public void dismiss() {
        int size = this.f4127j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f4127j.toArray(new d[size]);
            for (int i4 = size - 1; i4 >= 0; i4--) {
                d dVar = dVarArr[i4];
                if (dVar.f4151a.i()) {
                    dVar.f4151a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean e(j jVar) {
        for (d dVar : this.f4127j) {
            if (jVar == dVar.f4152b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!jVar.hasVisibleItems()) {
            return false;
        }
        l(jVar);
        g.a aVar = this.f4142y;
        if (aVar != null) {
            aVar.c(jVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.g
    public void f(boolean z3) {
        Iterator it = this.f4127j.iterator();
        while (it.hasNext()) {
            j.b.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean g() {
        return false;
    }

    @Override // j.c
    public boolean i() {
        return this.f4127j.size() > 0 && ((d) this.f4127j.get(0)).f4151a.i();
    }

    @Override // androidx.appcompat.view.menu.g
    public void k(g.a aVar) {
        this.f4142y = aVar;
    }

    @Override // j.b
    public void l(androidx.appcompat.view.menu.d dVar) {
        dVar.b(this, this.f4120c);
        if (i()) {
            F(dVar);
        } else {
            this.f4126i.add(dVar);
        }
    }

    @Override // j.b
    public boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f4127j.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f4127j.get(i4);
            if (!dVar.f4151a.i()) {
                break;
            } else {
                i4++;
            }
        }
        if (dVar != null) {
            dVar.f4152b.d(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i4, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i4 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.b
    public void p(View view) {
        if (this.f4133p != view) {
            this.f4133p = view;
            this.f4132o = AbstractC0226i.a(this.f4131n, AbstractC0241y.l(view));
        }
    }

    @Override // j.b
    public void r(boolean z3) {
        this.f4140w = z3;
    }

    @Override // j.b
    public void s(int i4) {
        if (this.f4131n != i4) {
            this.f4131n = i4;
            this.f4132o = AbstractC0226i.a(i4, AbstractC0241y.l(this.f4133p));
        }
    }

    @Override // j.b
    public void t(int i4) {
        this.f4136s = true;
        this.f4138u = i4;
    }

    @Override // j.b
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f4118A = onDismissListener;
    }

    @Override // j.b
    public void v(boolean z3) {
        this.f4141x = z3;
    }

    @Override // j.b
    public void w(int i4) {
        this.f4137t = true;
        this.f4139v = i4;
    }

    public final P z() {
        P p4 = new P(this.f4120c, null, this.f4122e, this.f4123f);
        p4.G(this.f4130m);
        p4.z(this);
        p4.y(this);
        p4.q(this.f4133p);
        p4.t(this.f4132o);
        p4.x(true);
        p4.w(2);
        return p4;
    }
}
