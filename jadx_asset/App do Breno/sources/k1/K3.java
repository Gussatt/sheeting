package k1;

import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class K3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1232j f9114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x7 f9115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zzjp f9116o;

    public K3(zzjp zzjpVar, C1232j c1232j, x7 x7Var) {
        this.f9114m = c1232j;
        this.f9115n = x7Var;
        this.f9116o = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f9116o;
        zzjpVar.f7047l.q();
        C1232j c1232j = this.f9114m;
        if (c1232j.f9483o.d() == null) {
            zzjpVar.f7047l.e0(c1232j, this.f9115n);
        } else {
            zzjpVar.f7047l.n0(c1232j, this.f9115n);
        }
    }
}
