package k1;

import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes.dex */
public final class L3 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9128m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9129n;

    public L3(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0887x0 interfaceC0887x0) {
        this.f9128m = interfaceC0887x0;
        this.f9129n = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9129n.f7045l.O().r(this.f9128m);
    }
}
