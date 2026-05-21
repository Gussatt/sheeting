package k1;

import com.google.android.gms.measurement.internal.zzjp;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class P3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9192c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjp f9193d;

    public P3(zzjp zzjpVar, String str, String str2, String str3) {
        this.f9190a = str;
        this.f9191b = str2;
        this.f9192c = str3;
        this.f9193d = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjp zzjpVar = this.f9193d;
        zzjpVar.f7047l.q();
        return zzjpVar.f7047l.E0().n(this.f9190a, this.f9191b, this.f9192c);
    }
}
