package k1;

import com.google.android.gms.measurement.internal.zzjp;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class Q3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjp f9204d;

    public Q3(zzjp zzjpVar, String str, String str2, String str3) {
        this.f9201a = str;
        this.f9202b = str2;
        this.f9203c = str3;
        this.f9204d = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjp zzjpVar = this.f9204d;
        zzjpVar.f7047l.q();
        return zzjpVar.f7047l.E0().n(this.f9201a, this.f9202b, this.f9203c);
    }
}
