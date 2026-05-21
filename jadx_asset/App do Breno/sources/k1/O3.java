package k1;

import com.google.android.gms.measurement.internal.zzjp;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class O3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjp f9180d;

    public O3(zzjp zzjpVar, String str, String str2, String str3) {
        this.f9177a = str;
        this.f9178b = str2;
        this.f9179c = str3;
        this.f9180d = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjp zzjpVar = this.f9180d;
        zzjpVar.f7047l.q();
        return zzjpVar.f7047l.E0().r(this.f9177a, this.f9178b, this.f9179c);
    }
}
