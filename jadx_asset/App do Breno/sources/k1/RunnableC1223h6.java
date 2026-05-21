package k1;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: renamed from: k1.h6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1223h6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC1255l6 f9467m;

    public RunnableC1223h6(ServiceConnectionC1255l6 serviceConnectionC1255l6) {
        this.f9467m = serviceConnectionC1255l6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1263m6 c1263m6 = this.f9467m.f9537c;
        C1363z3 c1363z3 = c1263m6.f9366a;
        Context contextD = c1363z3.d();
        c1363z3.b();
        C1263m6.j0(c1263m6, new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
