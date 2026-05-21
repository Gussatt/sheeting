package k1;

import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class S3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9226m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zzjp f9227n;

    public S3(zzjp zzjpVar, x7 x7Var) {
        this.f9226m = x7Var;
        this.f9227n = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f9227n;
        zzjpVar.f7047l.q();
        zzjpVar.f7047l.g0(this.f9226m);
    }
}
