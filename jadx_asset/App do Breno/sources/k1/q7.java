package k1;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: loaded from: classes.dex */
public final class q7 implements InterfaceC1277o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.C0 f9809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f9810b;

    public q7(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.C0 c02) {
        this.f9810b = appMeasurementDynamiteService;
        this.f9809a = c02;
    }

    @Override // k1.InterfaceC1277o4
    public final void a(String str, String str2, Bundle bundle, long j4) {
        try {
            this.f9809a.Y0(str, str2, bundle, j4);
        } catch (RemoteException e4) {
            C1363z3 c1363z3 = this.f9810b.f7045l;
            if (c1363z3 != null) {
                c1363z3.c().w().b("Event listener threw exception", e4);
            }
        }
    }
}
