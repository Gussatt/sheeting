package k1;

import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class H3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zzjp f9062n;

    public H3(zzjp zzjpVar, x7 x7Var) {
        this.f9061m = x7Var;
        this.f9062n = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f9062n;
        zzjpVar.f7047l.q();
        zzjpVar.f7047l.b0(this.f9061m);
    }
}
