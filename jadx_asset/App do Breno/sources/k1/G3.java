package k1;

import com.google.android.gms.measurement.internal.zzjp;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class G3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzjp f9047b;

    public G3(zzjp zzjpVar, String str) {
        this.f9046a = str;
        this.f9047b = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjp zzjpVar = this.f9047b;
        zzjpVar.f7047l.q();
        return zzjpVar.f7047l.E0().q(this.f9046a);
    }
}
