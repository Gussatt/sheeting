package k1;

import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: renamed from: k1.o6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1279o6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9648m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9649n;

    public RunnableC1279o6(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0887x0 interfaceC0887x0) {
        this.f9648m = interfaceC0887x0;
        this.f9649n = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f9649n;
        appMeasurementDynamiteService.f7045l.Q().H(this.f9648m, appMeasurementDynamiteService.f7045l.n());
    }
}
