package k1;

import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class Y3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ s7 f9302m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x7 f9303n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zzjp f9304o;

    public Y3(zzjp zzjpVar, s7 s7Var, x7 x7Var) {
        this.f9302m = s7Var;
        this.f9303n = x7Var;
        this.f9304o = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f9304o;
        zzjpVar.f7047l.q();
        s7 s7Var = this.f9302m;
        if (s7Var.d() == null) {
            zzjpVar.f7047l.f0(s7Var.f9845n, this.f9303n);
        } else {
            zzjpVar.f7047l.r0(s7Var, this.f9303n);
        }
    }
}
