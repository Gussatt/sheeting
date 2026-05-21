package k1;

import V0.AbstractC0549h;
import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class T3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zzjp f9238n;

    public T3(zzjp zzjpVar, x7 x7Var) {
        this.f9237m = x7Var;
        this.f9238n = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f9238n;
        zzjpVar.f7047l.q();
        l7 l7Var = zzjpVar.f7047l;
        l7Var.e().h();
        l7Var.r();
        x7 x7Var = this.f9237m;
        AbstractC0549h.d(x7Var.f9967m);
        l7Var.j0(x7Var);
        l7Var.h0(x7Var);
    }
}
