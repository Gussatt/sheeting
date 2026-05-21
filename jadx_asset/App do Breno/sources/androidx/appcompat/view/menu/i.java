package androidx.appcompat.view.menu;

import C.AbstractC0241y;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.g;
import c.AbstractC0639c;
import c.AbstractC0642f;
import k.P;

/* JADX INFO: loaded from: classes.dex */
public final class i extends j.b implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, g, View.OnKeyListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f4230w = AbstractC0642f.f5675j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f4231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f4232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f4233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f4234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4235g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f4236h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f4237i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P f4238j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4241m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f4242n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f4243o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public g.a f4244p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f4245q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f4246r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4247s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4248t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4250v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f4239k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f4240l = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4249u = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!i.this.i() || i.this.f4238j.n()) {
                return;
            }
            View view = i.this.f4243o;
            if (view == null || !view.isShown()) {
                i.this.dismiss();
            } else {
                i.this.f4238j.a();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = i.this.f4245q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    i.this.f4245q = view.getViewTreeObserver();
                }
                i iVar = i.this;
                iVar.f4245q.removeGlobalOnLayoutListener(iVar.f4239k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public i(Context context, d dVar, View view, int i4, int i5, boolean z3) {
        this.f4231c = context;
        this.f4232d = dVar;
        this.f4234f = z3;
        this.f4233e = new c(dVar, LayoutInflater.from(context), z3, f4230w);
        this.f4236h = i4;
        this.f4237i = i5;
        Resources resources = context.getResources();
        this.f4235g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC0639c.f5583b));
        this.f4242n = view;
        this.f4238j = new P(context, null, i4, i5);
        dVar.b(this, context);
    }

    @Override // j.c
    public void a() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public void b(d dVar, boolean z3) {
        if (dVar != this.f4232d) {
            return;
        }
        dismiss();
        g.a aVar = this.f4244p;
        if (aVar != null) {
            aVar.b(dVar, z3);
        }
    }

    @Override // j.c
    public ListView d() {
        return this.f4238j.d();
    }

    @Override // j.c
    public void dismiss() {
        if (i()) {
            this.f4238j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean e(j jVar) {
        if (jVar.hasVisibleItems()) {
            f fVar = new f(this.f4231c, jVar, this.f4243o, this.f4234f, this.f4236h, this.f4237i);
            fVar.j(this.f4244p);
            fVar.g(j.b.x(jVar));
            fVar.i(this.f4241m);
            this.f4241m = null;
            this.f4232d.d(false);
            int iJ = this.f4238j.j();
            int iL = this.f4238j.l();
            if ((Gravity.getAbsoluteGravity(this.f4249u, AbstractC0241y.l(this.f4242n)) & 7) == 5) {
                iJ += this.f4242n.getWidth();
            }
            if (fVar.n(iJ, iL)) {
                g.a aVar = this.f4244p;
                if (aVar == null) {
                    return true;
                }
                aVar.c(jVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.g
    public void f(boolean z3) {
        this.f4247s = false;
        c cVar = this.f4233e;
        if (cVar != null) {
            cVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.g
    public boolean g() {
        return false;
    }

    @Override // j.c
    public boolean i() {
        return !this.f4246r && this.f4238j.i();
    }

    @Override // androidx.appcompat.view.menu.g
    public void k(g.a aVar) {
        this.f4244p = aVar;
    }

    @Override // j.b
    public void l(d dVar) {
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f4246r = true;
        this.f4232d.close();
        ViewTreeObserver viewTreeObserver = this.f4245q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4245q = this.f4243o.getViewTreeObserver();
            }
            this.f4245q.removeGlobalOnLayoutListener(this.f4239k);
            this.f4245q = null;
        }
        this.f4243o.removeOnAttachStateChangeListener(this.f4240l);
        PopupWindow.OnDismissListener onDismissListener = this.f4241m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f4242n = view;
    }

    @Override // j.b
    public void r(boolean z3) {
        this.f4233e.d(z3);
    }

    @Override // j.b
    public void s(int i4) {
        this.f4249u = i4;
    }

    @Override // j.b
    public void t(int i4) {
        this.f4238j.v(i4);
    }

    @Override // j.b
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f4241m = onDismissListener;
    }

    @Override // j.b
    public void v(boolean z3) {
        this.f4250v = z3;
    }

    @Override // j.b
    public void w(int i4) {
        this.f4238j.C(i4);
    }

    public final boolean z() {
        View view;
        if (i()) {
            return true;
        }
        if (this.f4246r || (view = this.f4242n) == null) {
            return false;
        }
        this.f4243o = view;
        this.f4238j.y(this);
        this.f4238j.z(this);
        this.f4238j.x(true);
        View view2 = this.f4243o;
        boolean z3 = this.f4245q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4245q = viewTreeObserver;
        if (z3) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4239k);
        }
        view2.addOnAttachStateChangeListener(this.f4240l);
        this.f4238j.q(view2);
        this.f4238j.t(this.f4249u);
        if (!this.f4247s) {
            this.f4248t = j.b.o(this.f4233e, null, this.f4231c, this.f4235g);
            this.f4247s = true;
        }
        this.f4238j.s(this.f4248t);
        this.f4238j.w(2);
        this.f4238j.u(n());
        this.f4238j.a();
        ListView listViewD = this.f4238j.d();
        listViewD.setOnKeyListener(this);
        if (this.f4250v && this.f4232d.u() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f4231c).inflate(AbstractC0642f.f5674i, (ViewGroup) listViewD, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f4232d.u());
            }
            frameLayout.setEnabled(false);
            listViewD.addHeaderView(frameLayout, null, false);
        }
        this.f4238j.p(this.f4233e);
        this.f4238j.a();
        return true;
    }
}
