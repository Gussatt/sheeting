package k1;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjp;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class Z3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x7 f9335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f9336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjp f9337c;

    public Z3(zzjp zzjpVar, x7 x7Var, Bundle bundle) {
        this.f9335a = x7Var;
        this.f9336b = bundle;
        this.f9337c = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjp zzjpVar = this.f9337c;
        zzjpVar.f7047l.q();
        return zzjpVar.f7047l.k(this.f9335a, this.f9336b);
    }
}
