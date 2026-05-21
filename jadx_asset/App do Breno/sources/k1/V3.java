package k1;

import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class V3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1150J f9264m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ x7 f9265n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zzjp f9266o;

    public V3(zzjp zzjpVar, C1150J c1150j, x7 x7Var) {
        this.f9264m = c1150j;
        this.f9265n = x7Var;
        this.f9266o = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1150J c1150j = this.f9264m;
        x7 x7Var = this.f9265n;
        zzjp zzjpVar = this.f9266o;
        zzjpVar.r(zzjpVar.s1(c1150j, x7Var), x7Var);
    }
}
