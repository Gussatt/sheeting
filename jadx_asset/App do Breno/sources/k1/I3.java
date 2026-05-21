package k1;

import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class I3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x7 f9077m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zzjp f9078n;

    public I3(zzjp zzjpVar, x7 x7Var) {
        this.f9077m = x7Var;
        this.f9078n = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        zzjp zzjpVar = this.f9078n;
        zzjpVar.f7047l.q();
        zzjpVar.f7047l.a0(this.f9077m);
    }
}
