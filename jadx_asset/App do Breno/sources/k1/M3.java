package k1;

import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class M3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1232j f9135m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ zzjp f9136n;

    public M3(zzjp zzjpVar, C1232j c1232j) {
        this.f9135m = c1232j;
        this.f9136n = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f9136n;
        zzjpVar.f7047l.q();
        C1232j c1232j = this.f9135m;
        if (c1232j.f9483o.d() == null) {
            zzjpVar.f7047l.d0(c1232j);
        } else {
            zzjpVar.f7047l.m0(c1232j);
        }
    }
}
