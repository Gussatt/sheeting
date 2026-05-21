package k1;

import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes.dex */
public final class N4 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0887x0 f9159m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9160n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9161o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f9162p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9163q;

    public N4(AppMeasurementDynamiteService appMeasurementDynamiteService, InterfaceC0887x0 interfaceC0887x0, String str, String str2, boolean z3) {
        this.f9159m = interfaceC0887x0;
        this.f9160n = str;
        this.f9161o = str2;
        this.f9162p = z3;
        this.f9163q = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f9163q.f7045l.O().x(this.f9159m, this.f9160n, this.f9161o, this.f9162p);
    }
}
