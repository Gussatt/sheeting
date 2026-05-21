package k1;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: k1.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1270n5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ P6 f9609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9610n;

    public RunnableC1270n5(AppMeasurementDynamiteService appMeasurementDynamiteService, P6 p6) {
        this.f9609m = p6;
        this.f9610n = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9610n.f7045l.K().V(this.f9609m);
    }
}
