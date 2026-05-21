package k1;

import com.google.android.gms.measurement.internal.zzjp;

/* JADX INFO: loaded from: classes.dex */
public final class J3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f9093m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9094n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9095o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ long f9096p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ zzjp f9097q;

    public J3(zzjp zzjpVar, String str, String str2, String str3, long j4) {
        this.f9093m = str;
        this.f9094n = str2;
        this.f9095o = str3;
        this.f9096p = j4;
        this.f9097q = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f9093m;
        if (str == null) {
            zzjp zzjpVar = this.f9097q;
            zzjpVar.f7047l.i0(this.f9094n, null);
        } else {
            C1333v5 c1333v5 = new C1333v5(this.f9095o, str, this.f9096p);
            zzjp zzjpVar2 = this.f9097q;
            zzjpVar2.f7047l.i0(this.f9094n, c1333v5);
        }
    }
}
