package k1;

import V0.AbstractC0549h;
import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class R3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zzjp f9218n;

    public R3(zzjp zzjpVar, x7 x7Var) {
        this.f9217m = x7Var;
        this.f9218n = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f9218n;
        zzjpVar.f7047l.q();
        l7 l7Var = zzjpVar.f7047l;
        l7Var.e().h();
        l7Var.r();
        x7 x7Var = this.f9217m;
        AbstractC0549h.d(x7Var.f9967m);
        l7Var.B0(x7Var);
    }
}
