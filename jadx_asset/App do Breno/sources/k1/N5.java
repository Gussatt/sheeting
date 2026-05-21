package k1;

import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes.dex */
public final class N5 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9164m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9165n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9166o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9167p;

    public N5(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0887x0 interfaceC0887x0, String str, String str2) {
        this.f9164m = interfaceC0887x0;
        this.f9165n = str;
        this.f9166o = str2;
        this.f9167p = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9167p.f7045l.O().t(this.f9164m, this.f9165n, this.f9166o);
    }
}
