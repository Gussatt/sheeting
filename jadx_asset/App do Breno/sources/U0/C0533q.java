package U0;

import S0.C0504b;
import S0.C0512j;
import V0.AbstractC0549h;
import android.app.Activity;
import p.C1476b;

/* JADX INFO: renamed from: U0.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0533q extends Y {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1476b f3593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0521e f3594h;

    public C0533q(InterfaceC0524h interfaceC0524h, C0521e c0521e, C0512j c0512j) {
        super(interfaceC0524h, c0512j);
        this.f3593g = new C1476b();
        this.f3594h = c0521e;
        this.f3581b.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, C0521e c0521e, C0518b c0518b) {
        InterfaceC0524h interfaceC0524hD = AbstractC0523g.d(activity);
        C0533q c0533q = (C0533q) interfaceC0524hD.d("ConnectionlessLifecycleHelper", C0533q.class);
        if (c0533q == null) {
            c0533q = new C0533q(interfaceC0524hD, c0521e, C0512j.m());
        }
        AbstractC0549h.k(c0518b, "ApiKey cannot be null");
        c0533q.f3593g.add(c0518b);
        c0521e.a(c0533q);
    }

    @Override // U0.AbstractC0523g
    public final void h() {
        super.h();
        v();
    }

    @Override // U0.Y, U0.AbstractC0523g
    public final void j() {
        super.j();
        v();
    }

    @Override // U0.Y, U0.AbstractC0523g
    public final void k() {
        super.k();
        this.f3594h.b(this);
    }

    @Override // U0.Y
    public final void m(C0504b c0504b, int i4) {
        this.f3594h.B(c0504b, i4);
    }

    @Override // U0.Y
    public final void n() {
        this.f3594h.C();
    }

    public final C1476b t() {
        return this.f3593g;
    }

    public final void v() {
        if (this.f3593g.isEmpty()) {
            return;
        }
        this.f3594h.a(this);
    }
}
