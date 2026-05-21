package k1;

import com.google.android.gms.measurement.internal.zzjp;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class U3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x7 f9247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjp f9248b;

    public U3(zzjp zzjpVar, x7 x7Var) {
        this.f9247a = x7Var;
        this.f9248b = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjp zzjpVar = this.f9248b;
        zzjpVar.f7047l.q();
        return new C1288q(zzjpVar.f7047l.z0(this.f9247a.f9967m));
    }
}
