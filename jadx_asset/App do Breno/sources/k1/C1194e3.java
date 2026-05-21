package k1;

import V0.AbstractC0549h;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: k1.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1194e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1185d3 f9408a;

    public C1194e3(InterfaceC1185d3 interfaceC1185d3) {
        AbstractC0549h.j(interfaceC1185d3);
        this.f9408a = interfaceC1185d3;
    }

    public final void a(Context context, Intent intent) {
        C1363z3 c1363z3J = C1363z3.J(context, null, null);
        K2 k2C = c1363z3J.c();
        if (intent == null) {
            k2C.w().a("Receiver called with null intent");
            return;
        }
        c1363z3J.b();
        String action = intent.getAction();
        k2C.v().b("Local receiver got", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                k2C.w().a("Install Referrer Broadcasts are deprecated");
            }
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            k2C.v().a("Starting wakeful intent.");
            this.f9408a.a(context, className);
        }
    }
}
