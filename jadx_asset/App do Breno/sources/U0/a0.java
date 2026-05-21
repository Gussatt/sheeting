package U0;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0523g f3544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f3545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ b0 f3546o;

    public a0(b0 b0Var, AbstractC0523g abstractC0523g, String str) {
        this.f3544m = abstractC0523g;
        this.f3545n = str;
        this.f3546o = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        b0 b0Var = this.f3546o;
        if (b0Var.f3552b > 0) {
            AbstractC0523g abstractC0523g = this.f3544m;
            if (b0Var.f3553c != null) {
                bundle = b0Var.f3553c.getBundle(this.f3545n);
            } else {
                bundle = null;
            }
            abstractC0523g.f(bundle);
        }
        if (this.f3546o.f3552b >= 2) {
            this.f3544m.j();
        }
        if (this.f3546o.f3552b >= 3) {
            this.f3544m.h();
        }
        if (this.f3546o.f3552b >= 4) {
            this.f3544m.k();
        }
        if (this.f3546o.f3552b >= 5) {
            this.f3544m.g();
        }
    }
}
