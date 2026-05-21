package U0;

import U0.ComponentCallbacks2C0519c;

/* JADX INFO: renamed from: U0.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0535t implements ComponentCallbacks2C0519c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0521e f3597a;

    public C0535t(C0521e c0521e) {
        this.f3597a = c0521e;
    }

    @Override // U0.ComponentCallbacks2C0519c.a
    public final void a(boolean z3) {
        C0521e c0521e = this.f3597a;
        c0521e.f3578n.sendMessage(c0521e.f3578n.obtainMessage(1, Boolean.valueOf(z3)));
    }
}
