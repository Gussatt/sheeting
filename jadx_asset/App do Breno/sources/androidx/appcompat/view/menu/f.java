package androidx.appcompat.view.menu;

import C.AbstractC0226i;
import C.AbstractC0241y;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;
import c.AbstractC0639c;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f4218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f4219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f4222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f4223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4224h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g.a f4225i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public j.b f4226j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f4227k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f4228l;

    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            f.this.e();
        }
    }

    public f(Context context, d dVar, View view, boolean z3, int i4) {
        this(context, dVar, view, z3, i4, 0);
    }

    public final j.b a() {
        Display defaultDisplay = ((WindowManager) this.f4217a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        j.b bVar = Math.min(point.x, point.y) >= this.f4217a.getResources().getDimensionPixelSize(AbstractC0639c.f5582a) ? new b(this.f4217a, this.f4222f, this.f4220d, this.f4221e, this.f4219c) : new i(this.f4217a, this.f4218b, this.f4222f, this.f4220d, this.f4221e, this.f4219c);
        bVar.l(this.f4218b);
        bVar.u(this.f4228l);
        bVar.p(this.f4222f);
        bVar.k(this.f4225i);
        bVar.r(this.f4224h);
        bVar.s(this.f4223g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f4226j.dismiss();
        }
    }

    public j.b c() {
        if (this.f4226j == null) {
            this.f4226j = a();
        }
        return this.f4226j;
    }

    public boolean d() {
        j.b bVar = this.f4226j;
        return bVar != null && bVar.i();
    }

    public void e() {
        this.f4226j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f4227k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f4222f = view;
    }

    public void g(boolean z3) {
        this.f4224h = z3;
        j.b bVar = this.f4226j;
        if (bVar != null) {
            bVar.r(z3);
        }
    }

    public void h(int i4) {
        this.f4223g = i4;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f4227k = onDismissListener;
    }

    public void j(g.a aVar) {
        this.f4225i = aVar;
        j.b bVar = this.f4226j;
        if (bVar != null) {
            bVar.k(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i4, int i5, boolean z3, boolean z4) {
        j.b bVarC = c();
        bVarC.v(z4);
        if (z3) {
            if ((AbstractC0226i.a(this.f4223g, AbstractC0241y.l(this.f4222f)) & 7) == 5) {
                i4 -= this.f4222f.getWidth();
            }
            bVarC.t(i4);
            bVarC.w(i5);
            int i6 = (int) ((this.f4217a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            bVarC.q(new Rect(i4 - i6, i5 - i6, i4 + i6, i5 + i6));
        }
        bVarC.a();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f4222f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i4, int i5) {
        if (d()) {
            return true;
        }
        if (this.f4222f == null) {
            return false;
        }
        l(i4, i5, true, true);
        return true;
    }

    public f(Context context, d dVar, View view, boolean z3, int i4, int i5) {
        this.f4223g = 8388611;
        this.f4228l = new a();
        this.f4217a = context;
        this.f4218b = dVar;
        this.f4222f = view;
        this.f4219c = z3;
        this.f4220d = i4;
        this.f4221e = i5;
    }
}
