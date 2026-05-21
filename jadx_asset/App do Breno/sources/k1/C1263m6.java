package k1;

import V0.AbstractC0549h;
import a1.C0575b;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k1.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1263m6 extends AbstractC1219h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ServiceConnectionC1255l6 f9584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1306s2 f9585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f9586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC1141A f9587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f9588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J6 f9589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f9590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC1141A f9591j;

    public C1263m6(C1363z3 c1363z3) {
        super(c1363z3);
        this.f9590i = new ArrayList();
        this.f9589h = new J6(c1363z3.f());
        this.f9584c = new ServiceConnectionC1255l6(this);
        this.f9587f = new S5(this, c1363z3);
        this.f9591j = new W5(this, c1363z3);
    }

    private final boolean V() {
        this.f9366a.b();
        return true;
    }

    public static /* synthetic */ void b0(C1263m6 c1263m6) {
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("Failed to send storage consent settings to service");
            return;
        }
        try {
            x7 x7VarR = c1263m6.R(false);
            AbstractC0549h.j(x7VarR);
            interfaceC1306s2.a0(x7VarR);
            c1263m6.T();
        } catch (RemoteException e4) {
            c1263m6.f9366a.c().r().b("Failed to send storage consent settings to the service", e4);
        }
    }

    public static /* synthetic */ void c0(C1263m6 c1263m6, AtomicReference atomicReference, x7 x7Var, S6 s6) {
        InterfaceC1306s2 interfaceC1306s2;
        synchronized (atomicReference) {
            try {
                interfaceC1306s2 = c1263m6.f9585d;
            } catch (RemoteException e4) {
                c1263m6.f9366a.c().r().b("[sgtm] Failed to get upload batches; remote exception", e4);
                atomicReference.notifyAll();
            }
            if (interfaceC1306s2 == null) {
                c1263m6.f9366a.c().r().a("[sgtm] Failed to get upload batches; not connected to service");
                return;
            }
            AbstractC0549h.j(x7Var);
            interfaceC1306s2.Z(x7Var, s6, new K5(c1263m6, atomicReference));
            c1263m6.T();
        }
    }

    public static /* synthetic */ void d0(C1263m6 c1263m6, AtomicReference atomicReference, x7 x7Var, Bundle bundle) {
        InterfaceC1306s2 interfaceC1306s2;
        synchronized (atomicReference) {
            try {
                interfaceC1306s2 = c1263m6.f9585d;
            } catch (RemoteException e4) {
                c1263m6.f9366a.c().r().b("Failed to request trigger URIs; remote exception", e4);
                atomicReference.notifyAll();
            }
            if (interfaceC1306s2 == null) {
                c1263m6.f9366a.c().r().a("Failed to request trigger URIs; not connected to service");
                return;
            }
            AbstractC0549h.j(x7Var);
            interfaceC1306s2.V0(x7Var, bundle, new J5(c1263m6, atomicReference));
            c1263m6.T();
        }
    }

    public static /* synthetic */ void e0(C1263m6 c1263m6, x7 x7Var, C1216h c1216h) {
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("[sgtm] Discarding data. Failed to update batch upload status.");
            return;
        }
        try {
            interfaceC1306s2.G0(x7Var, c1216h);
            c1263m6.T();
        } catch (RemoteException e4) {
            c1263m6.f9366a.c().r().c("[sgtm] Failed to update batch upload status, rowId, exception", Long.valueOf(c1216h.f9450m), e4);
        }
    }

    public static /* synthetic */ void f0(C1263m6 c1263m6) {
        InterfaceC1306s2 interfaceC1306s2 = c1263m6.f9585d;
        if (interfaceC1306s2 == null) {
            c1263m6.f9366a.c().r().a("Failed to send Dma consent settings to service");
            return;
        }
        try {
            x7 x7VarR = c1263m6.R(false);
            AbstractC0549h.j(x7VarR);
            interfaceC1306s2.C0(x7VarR);
            c1263m6.T();
        } catch (RemoteException e4) {
            c1263m6.f9366a.c().r().b("Failed to send Dma consent settings to the service", e4);
        }
    }

    public static /* bridge */ /* synthetic */ void j0(C1263m6 c1263m6, ComponentName componentName) {
        c1263m6.h();
        if (c1263m6.f9585d != null) {
            c1263m6.f9585d = null;
            c1263m6.f9366a.c().v().b("Disconnected from device MeasurementService", componentName);
            c1263m6.h();
            c1263m6.p();
        }
    }

    public final void A(InterfaceC0887x0 interfaceC0887x0, C1150J c1150j, String str) {
        h();
        i();
        C1363z3 c1363z3 = this.f9366a;
        if (c1363z3.Q().z0(12451000) == 0) {
            U(new V5(this, c1150j, str, interfaceC0887x0));
        } else {
            c1363z3.c().w().a("Not bundling data. Service unavailable or out of date");
            c1363z3.Q().K(interfaceC0887x0, new byte[0]);
        }
    }

    public final void B() {
        h();
        i();
        x7 x7VarR = R(false);
        V();
        this.f9366a.E().q();
        U(new M5(this, x7VarR));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(k1.InterfaceC1306s2 r61, W0.a r62, k1.x7 r63) {
        /*
            Method dump skipped, instruction units count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1263m6.C(k1.s2, W0.a, k1.x7):void");
    }

    public final void D(C1232j c1232j) {
        AbstractC0549h.j(c1232j);
        h();
        i();
        this.f9366a.b();
        U(new RunnableC1161a6(this, true, R(true), this.f9366a.E().u(c1232j), new C1232j(c1232j), c1232j));
    }

    public final void E(boolean z3) {
        h();
        i();
        if (O()) {
            U(new Y5(this, R(false)));
        }
    }

    public final void F(C1333v5 c1333v5) {
        h();
        i();
        U(new T5(this, c1333v5));
    }

    public final void G(Bundle bundle) {
        h();
        i();
        C1148H c1148h = new C1148H(bundle);
        V();
        U(new U5(this, true, R(false), this.f9366a.B().P(null, AbstractC1291q2.f9760m1) && this.f9366a.E().v(c1148h), c1148h, bundle));
    }

    public final void H() {
        h();
        i();
        U(new Runnable() { // from class: k1.E5
            @Override // java.lang.Runnable
            public final void run() {
                C1263m6.f0(this.f8956m);
            }
        });
    }

    public final void I() {
        h();
        i();
        U(new X5(this, R(true)));
    }

    public final void J(InterfaceC1306s2 interfaceC1306s2) {
        h();
        AbstractC0549h.j(interfaceC1306s2);
        this.f9585d = interfaceC1306s2;
        T();
        S();
    }

    public final void K(boolean z3) {
        h();
        i();
        U(new Runnable() { // from class: k1.D5
            @Override // java.lang.Runnable
            public final void run() {
                C1263m6.b0(this.f8939m);
            }
        });
    }

    public final void L(s7 s7Var) {
        h();
        i();
        V();
        U(new L5(this, R(true), this.f9366a.E().x(s7Var), s7Var));
    }

    public final void M(final C1216h c1216h) {
        h();
        i();
        final x7 x7VarR = R(true);
        AbstractC0549h.j(x7VarR);
        U(new Runnable() { // from class: k1.F5
            @Override // java.lang.Runnable
            public final void run() {
                C1263m6.e0(this.f9032m, x7VarR, c1216h);
            }
        });
    }

    public final boolean N() {
        h();
        i();
        return this.f9585d != null;
    }

    public final boolean O() {
        h();
        i();
        return !Q() || this.f9366a.Q().y0() >= ((Integer) AbstractC1291q2.f9689J0.a(null)).intValue();
    }

    public final boolean P() {
        h();
        i();
        return !Q() || this.f9366a.Q().y0() >= 241200;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Q() {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1263m6.Q():boolean");
    }

    public final x7 R(boolean z3) {
        Pair pairA;
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.b();
        C1346x2 c1346x2D = this.f9366a.D();
        String str = null;
        if (z3) {
            C1363z3 c1363z32 = c1363z3.c().f9366a;
            if (c1363z32.H().f9314f != null && (pairA = c1363z32.H().f9314f.a()) != null && pairA != Z2.f9309B) {
                str = String.valueOf(pairA.second) + ":" + ((String) pairA.first);
            }
        }
        return c1346x2D.r(str);
    }

    public final void S() {
        h();
        I2 i2V = this.f9366a.c().v();
        List list = this.f9590i;
        i2V.b("Processing queued up service tasks", Integer.valueOf(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e4) {
                this.f9366a.c().r().b("Task exception while flushing queue", e4);
            }
        }
        this.f9590i.clear();
        this.f9591j.b();
    }

    public final void T() {
        h();
        this.f9589h.b();
        this.f9366a.B();
        this.f9587f.d(((Long) AbstractC1291q2.f9718Y.a(null)).longValue());
    }

    public final void U(Runnable runnable) {
        h();
        if (N()) {
            runnable.run();
            return;
        }
        List list = this.f9590i;
        long size = list.size();
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.B();
        if (size >= 1000) {
            c1363z3.c().r().a("Discarding data. Max runnable queue size reached");
            return;
        }
        list.add(runnable);
        this.f9591j.d(60000L);
        p();
    }

    public final C1288q W() {
        h();
        i();
        InterfaceC1306s2 interfaceC1306s2 = this.f9585d;
        if (interfaceC1306s2 == null) {
            p();
            this.f9366a.c().q().a("Failed to get consents; not connected to service yet.");
            return null;
        }
        x7 x7VarR = R(false);
        AbstractC0549h.j(x7VarR);
        try {
            C1288q c1288qB1 = interfaceC1306s2.b1(x7VarR);
            T();
            return c1288qB1;
        } catch (RemoteException e4) {
            this.f9366a.c().r().b("Failed to get consents; remote exception", e4);
            return null;
        }
    }

    public final Boolean Z() {
        return this.f9586e;
    }

    public final void l0() {
        h();
        i();
        U(new R5(this, R(true)));
    }

    @Override // k1.AbstractC1219h2
    public final boolean n() {
        return false;
    }

    public final void o() {
        h();
        i();
        x7 x7VarR = R(true);
        V();
        this.f9366a.B().P(null, AbstractC1291q2.f9760m1);
        this.f9366a.E().r();
        U(new Q5(this, x7VarR, true));
    }

    public final void p() {
        h();
        i();
        if (N()) {
            return;
        }
        if (Q()) {
            this.f9584c.d();
            return;
        }
        C1363z3 c1363z3 = this.f9366a;
        if (c1363z3.B().k()) {
            return;
        }
        c1363z3.b();
        List<ResolveInfo> listQueryIntentServices = c1363z3.d().getPackageManager().queryIntentServices(new Intent().setClassName(c1363z3.d(), "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            c1363z3.c().r().a("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        Context contextD = c1363z3.d();
        c1363z3.b();
        intent.setComponent(new ComponentName(contextD, "com.google.android.gms.measurement.AppMeasurementService"));
        this.f9584c.c(intent);
    }

    public final void q() {
        h();
        i();
        ServiceConnectionC1255l6 serviceConnectionC1255l6 = this.f9584c;
        serviceConnectionC1255l6.e();
        try {
            C0575b.b().c(this.f9366a.d(), serviceConnectionC1255l6);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f9585d = null;
    }

    public final void r(InterfaceC0887x0 interfaceC0887x0) {
        h();
        i();
        U(new P5(this, R(false), interfaceC0887x0));
    }

    public final void s(AtomicReference atomicReference) {
        h();
        i();
        U(new O5(this, atomicReference, R(false)));
    }

    public final void t(InterfaceC0887x0 interfaceC0887x0, String str, String str2) {
        h();
        i();
        U(new RunnableC1179c6(this, str, str2, R(false), interfaceC0887x0));
    }

    public final void u(AtomicReference atomicReference, String str, String str2, String str3) {
        h();
        i();
        U(new RunnableC1170b6(this, atomicReference, null, str2, str3, R(false)));
    }

    public final void v(final AtomicReference atomicReference, final Bundle bundle) {
        h();
        i();
        final x7 x7VarR = R(false);
        U(new Runnable() { // from class: k1.G5
            @Override // java.lang.Runnable
            public final void run() {
                C1263m6.d0(this.f9050m, atomicReference, x7VarR, bundle);
            }
        });
    }

    public final void w(final AtomicReference atomicReference, final S6 s6) {
        h();
        i();
        final x7 x7VarR = R(false);
        U(new Runnable() { // from class: k1.H5
            @Override // java.lang.Runnable
            public final void run() {
                C1263m6.c0(this.f9064m, atomicReference, x7VarR, s6);
            }
        });
    }

    public final void x(InterfaceC0887x0 interfaceC0887x0, String str, String str2, boolean z3) {
        h();
        i();
        U(new I5(this, str, str2, R(false), z3, interfaceC0887x0));
    }

    public final void y(AtomicReference atomicReference, String str, String str2, String str3, boolean z3) {
        h();
        i();
        U(new RunnableC1188d6(this, atomicReference, null, str2, str3, R(false), z3));
    }

    public final void z(C1150J c1150j, String str) {
        AbstractC0549h.j(c1150j);
        h();
        i();
        V();
        U(new Z5(this, true, R(true), this.f9366a.E().w(c1150j), c1150j, str));
    }
}
