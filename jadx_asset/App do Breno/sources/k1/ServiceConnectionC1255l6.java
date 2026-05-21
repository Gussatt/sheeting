package k1;

import S0.C0504b;
import V0.AbstractC0549h;
import a1.C0575b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.a;

/* JADX INFO: renamed from: k1.l6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1255l6 implements ServiceConnection, a.InterfaceC0114a, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f9535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile D2 f9536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9537c;

    public ServiceConnectionC1255l6(C1263m6 c1263m6) {
        this.f9537c = c1263m6;
    }

    @Override // com.google.android.gms.common.internal.a.InterfaceC0114a
    public final void a(int i4) {
        C1363z3 c1363z3 = this.f9537c.f9366a;
        c1363z3.e().y();
        c1363z3.c().q().a("Service connection suspended");
        c1363z3.e().A(new RunnableC1223h6(this));
    }

    public final void c(Intent intent) {
        C1263m6 c1263m6 = this.f9537c;
        c1263m6.h();
        Context contextD = c1263m6.f9366a.d();
        C0575b c0575bB = C0575b.b();
        synchronized (this) {
            try {
                if (this.f9535a) {
                    this.f9537c.f9366a.c().v().a("Connection attempt already in progress");
                    return;
                }
                C1263m6 c1263m62 = this.f9537c;
                c1263m62.f9366a.c().v().a("Using local app measurement service");
                this.f9535a = true;
                c0575bB.a(contextD, intent, c1263m62.f9584c, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        C1263m6 c1263m6 = this.f9537c;
        c1263m6.h();
        Context contextD = c1263m6.f9366a.d();
        synchronized (this) {
            try {
                if (this.f9535a) {
                    this.f9537c.f9366a.c().v().a("Connection attempt already in progress");
                    return;
                }
                if (this.f9536b != null && (this.f9536b.h() || this.f9536b.b())) {
                    this.f9537c.f9366a.c().v().a("Already awaiting connection attempt");
                    return;
                }
                this.f9536b = new D2(contextD, Looper.getMainLooper(), this, this);
                this.f9537c.f9366a.c().v().a("Connecting to remote service");
                this.f9535a = true;
                AbstractC0549h.j(this.f9536b);
                this.f9536b.q();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (this.f9536b != null && (this.f9536b.b() || this.f9536b.h())) {
            this.f9536b.n();
        }
        this.f9536b = null;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f9537c.f9366a.e().y();
        synchronized (this) {
            if (iBinder == null) {
                this.f9535a = false;
                this.f9537c.f9366a.c().r().a("Service connected with null binder");
                return;
            }
            InterfaceC1306s2 c1298r2 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c1298r2 = iInterfaceQueryLocalInterface instanceof InterfaceC1306s2 ? (InterfaceC1306s2) iInterfaceQueryLocalInterface : new C1298r2(iBinder);
                    this.f9537c.f9366a.c().v().a("Bound to IMeasurementService interface");
                } else {
                    this.f9537c.f9366a.c().r().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f9537c.f9366a.c().r().a("Service connect failed to get IMeasurementService");
            }
            if (c1298r2 == null) {
                this.f9535a = false;
                try {
                    C0575b c0575bB = C0575b.b();
                    C1263m6 c1263m6 = this.f9537c;
                    c0575bB.c(c1263m6.f9366a.d(), c1263m6.f9584c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f9537c.f9366a.e().A(new RunnableC1197e6(this, c1298r2));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        C1363z3 c1363z3 = this.f9537c.f9366a;
        c1363z3.e().y();
        c1363z3.c().q().a("Service disconnected");
        c1363z3.e().A(new RunnableC1206f6(this, componentName));
    }

    @Override // com.google.android.gms.common.internal.a.b
    public final void r(C0504b c0504b) {
        C1263m6 c1263m6 = this.f9537c;
        c1263m6.f9366a.e().y();
        K2 k2G = c1263m6.f9366a.G();
        if (k2G != null) {
            k2G.w().b("Service connection failed", c0504b);
        }
        synchronized (this) {
            this.f9535a = false;
            this.f9536b = null;
        }
        this.f9537c.f9366a.e().A(new RunnableC1247k6(this, c0504b));
    }

    @Override // com.google.android.gms.common.internal.a.InterfaceC0114a
    public final void u(Bundle bundle) {
        this.f9537c.f9366a.e().y();
        synchronized (this) {
            try {
                AbstractC0549h.j(this.f9536b);
                this.f9537c.f9366a.e().A(new RunnableC1215g6(this, (InterfaceC1306s2) this.f9536b.D()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f9536b = null;
                this.f9535a = false;
            }
        }
    }
}
