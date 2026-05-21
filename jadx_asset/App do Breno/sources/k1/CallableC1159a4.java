package k1;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzjp;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: k1.a4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1159a4 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x7 f9351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Bundle f9352b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ zzjp f9353c;

    public CallableC1159a4(zzjp zzjpVar, x7 x7Var, Bundle bundle) {
        this.f9351a = x7Var;
        this.f9352b = bundle;
        this.f9353c = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjp zzjpVar = this.f9353c;
        zzjpVar.f7047l.q();
        return zzjpVar.f7047l.k(this.f9351a, this.f9352b);
    }
}
