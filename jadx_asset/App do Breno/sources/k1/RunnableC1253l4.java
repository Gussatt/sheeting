package k1;

import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: k1.l4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1253l4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9531m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C1150J f9532n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9533o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9534p;

    public RunnableC1253l4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0887x0 interfaceC0887x0, C1150J c1150j, String str) {
        this.f9531m = interfaceC0887x0;
        this.f9532n = c1150j;
        this.f9533o = str;
        this.f9534p = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9534p.f7045l.O().A(this.f9531m, this.f9532n, this.f9533o);
    }
}
