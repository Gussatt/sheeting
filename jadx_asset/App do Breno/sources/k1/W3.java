package k1;

import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class W3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C1150J f9281m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9282n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ zzjp f9283o;

    public W3(zzjp zzjpVar, C1150J c1150j, String str) {
        this.f9281m = c1150j;
        this.f9282n = str;
        this.f9283o = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f9283o;
        zzjpVar.f7047l.q();
        zzjpVar.f7047l.y(this.f9281m, this.f9282n);
    }
}
