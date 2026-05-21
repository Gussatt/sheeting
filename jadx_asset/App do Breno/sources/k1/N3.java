package k1;

import com.google.android.gms.measurement.internal.zzjp;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class N3 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f9155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f9156b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f9157c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zzjp f9158d;

    public N3(zzjp zzjpVar, String str, String str2, String str3) {
        this.f9155a = str;
        this.f9156b = str2;
        this.f9157c = str3;
        this.f9158d = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        zzjp zzjpVar = this.f9158d;
        zzjpVar.f7047l.q();
        return zzjpVar.f7047l.E0().r(this.f9155a, this.f9156b, this.f9157c);
    }
}
