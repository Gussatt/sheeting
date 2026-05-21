package com.google.android.gms.measurement.internal;

import S0.AbstractC0516n;
import S0.o;
import V0.AbstractC0549h;
import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.os.Binder;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import b1.p;
import com.google.android.gms.internal.measurement.C0702b;
import com.google.android.gms.internal.measurement.C0712c0;
import com.google.android.gms.internal.measurement.C0735e5;
import com.google.android.gms.internal.measurement.C0903z0;
import com.google.android.gms.internal.measurement.P2;
import com.google.android.gms.internal.measurement.R2;
import com.google.android.gms.internal.measurement.S2;
import com.google.android.gms.measurement.internal.zzjp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import k1.AbstractC1237j4;
import k1.AbstractC1291q2;
import k1.C1145E;
import k1.C1148H;
import k1.C1150J;
import k1.C1216h;
import k1.C1232j;
import k1.C1268n3;
import k1.C1288q;
import k1.C1343x;
import k1.C1363z3;
import k1.C2;
import k1.CallableC1159a4;
import k1.G3;
import k1.H3;
import k1.I2;
import k1.I3;
import k1.InterfaceC1322u2;
import k1.InterfaceC1338w2;
import k1.J3;
import k1.K2;
import k1.K3;
import k1.M3;
import k1.N3;
import k1.O3;
import k1.P3;
import k1.Q3;
import k1.Q6;
import k1.R3;
import k1.S3;
import k1.S6;
import k1.T3;
import k1.U3;
import k1.U6;
import k1.V3;
import k1.W3;
import k1.X3;
import k1.Y3;
import k1.Z3;
import k1.l7;
import k1.p7;
import k1.r7;
import k1.s7;
import k1.u7;
import k1.w7;
import k1.x7;

/* JADX INFO: loaded from: classes.dex */
public final class zzjp extends zzgk {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l7 f7047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f7048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f7049n;

    public zzjp(l7 l7Var, String str) {
        AbstractC0549h.j(l7Var);
        this.f7047l = l7Var;
        this.f7049n = null;
    }

    public static /* synthetic */ void zzE(zzjp zzjpVar, x7 x7Var) {
        l7 l7Var = zzjpVar.f7047l;
        l7Var.q();
        l7Var.j0(x7Var);
    }

    public static /* synthetic */ void zzF(zzjp zzjpVar, x7 x7Var, C1216h c1216h) {
        l7 l7Var = zzjpVar.f7047l;
        l7Var.q();
        l7Var.o0((String) AbstractC0549h.j(x7Var.f9967m), c1216h);
    }

    public static /* synthetic */ void zzG(zzjp zzjpVar, x7 x7Var) {
        l7 l7Var = zzjpVar.f7047l;
        l7Var.q();
        l7Var.h0(x7Var);
    }

    public static /* synthetic */ void zzH(zzjp zzjpVar, x7 x7Var, Bundle bundle, InterfaceC1322u2 interfaceC1322u2, String str) {
        l7 l7Var = zzjpVar.f7047l;
        l7Var.q();
        try {
            interfaceC1322u2.I0(l7Var.k(x7Var, bundle));
        } catch (RemoteException e4) {
            zzjpVar.f7047l.c().r().c("Failed to return trigger URIs for app", str, e4);
        }
    }

    public static /* synthetic */ void zzI(zzjp zzjpVar, Bundle bundle, String str, x7 x7Var) {
        l7 l7Var = zzjpVar.f7047l;
        boolean zP = l7Var.D0().P(null, AbstractC1291q2.f9733d1);
        boolean zP2 = l7Var.D0().P(null, AbstractC1291q2.f9739f1);
        if (bundle.isEmpty() && zP) {
            C1343x c1343xE0 = zzjpVar.f7047l.E0();
            c1343xE0.h();
            c1343xE0.i();
            try {
                c1343xE0.y0().execSQL("delete from default_event_params where app_id=?", new String[]{str});
                return;
            } catch (SQLiteException e4) {
                c1343xE0.f9366a.c().r().b("Error clearing default event params", e4);
                return;
            }
        }
        C1343x c1343xE02 = l7Var.E0();
        c1343xE02.h();
        c1343xE02.i();
        byte[] bArrI = c1343xE02.f9189b.a().L(new C1145E(c1343xE02.f9366a, "", str, "dep", 0L, 0L, bundle)).i();
        C1363z3 c1363z3 = c1343xE02.f9366a;
        c1363z3.c().v().c("Saving default event parameters, appId, data size", str, Integer.valueOf(bArrI.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("parameters", bArrI);
        try {
            if (c1343xE02.y0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                c1363z3.c().r().b("Failed to insert default event parameters (got -1). appId", K2.z(str));
            }
        } catch (SQLiteException e5) {
            c1343xE02.f9366a.c().r().c("Error storing default event parameters. appId", K2.z(str), e5);
        }
        l7 l7Var2 = zzjpVar.f7047l;
        C1343x c1343xE03 = l7Var2.E0();
        long j4 = x7Var.f9965R;
        if (c1343xE03.b0(str, j4)) {
            if (zP2) {
                l7Var2.E0().s(str, Long.valueOf(j4), null, bundle);
            } else {
                l7Var2.E0().s(str, null, null, bundle);
            }
        }
    }

    public static /* synthetic */ void zzd(zzjp zzjpVar, String str, S6 s6, InterfaceC1338w2 interfaceC1338w2) {
        U6 u6;
        l7 l7Var = zzjpVar.f7047l;
        l7Var.q();
        if (l7Var.D0().P(null, AbstractC1291q2.f9703Q0)) {
            l7Var.e().h();
            l7Var.r();
            List<p7> listP = l7Var.E0().p(str, s6, ((Integer) AbstractC1291q2.f9672B.a(null)).intValue());
            ArrayList arrayList = new ArrayList();
            for (p7 p7Var : listP) {
                if (l7Var.x0(str, p7Var.h())) {
                    int iA = p7Var.a();
                    if (iA > 0) {
                        if (iA <= ((Integer) AbstractC1291q2.f9791z.a(null)).intValue()) {
                            if (l7Var.f().a() >= p7Var.b() + Math.min(((Long) AbstractC1291q2.f9787x.a(null)).longValue() * (1 << (iA - 1)), ((Long) AbstractC1291q2.f9789y.a(null)).longValue())) {
                            }
                        }
                        l7Var.c().v().d("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str, Long.valueOf(p7Var.c()), Long.valueOf(p7Var.b()));
                    }
                    Q6 q6E = p7Var.e();
                    try {
                        P2 p22 = (P2) r7.M(R2.G(), q6E.f9209n);
                        for (int i4 = 0; i4 < p22.u(); i4++) {
                            S2 s22 = (S2) p22.B(i4).o();
                            s22.V(l7Var.f().a());
                            p22.y(i4, s22);
                        }
                        q6E.f9209n = ((R2) p22.q()).i();
                        if (Log.isLoggable(l7Var.c().D(), 2)) {
                            q6E.f9214s = l7Var.a().N((R2) p22.q());
                        }
                        arrayList.add(q6E);
                    } catch (C0735e5 unused) {
                        l7Var.c().w().b("Failed to parse queued batch. appId", str);
                    }
                } else {
                    l7Var.c().v().d("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str, Long.valueOf(p7Var.c()), p7Var.h());
                }
            }
            u6 = new U6(arrayList);
        } else {
            u6 = new U6(Collections.EMPTY_LIST);
        }
        try {
            interfaceC1338w2.b0(u6);
            zzjpVar.f7047l.c().v().c("[sgtm] Sending queued upload batches to client. appId, count", str, Integer.valueOf(u6.f9258m.size()));
        } catch (RemoteException e4) {
            zzjpVar.f7047l.c().r().c("[sgtm] Failed to return upload batches for app", str, e4);
        }
    }

    @Override // k1.InterfaceC1306s2
    public final void C0(final x7 x7Var) {
        AbstractC0549h.d(x7Var.f9967m);
        AbstractC0549h.j(x7Var.f9954G);
        u(new Runnable() { // from class: k1.E3
            @Override // java.lang.Runnable
            public final void run() {
                zzjp.zzG(this.f8953m, x7Var);
            }
        });
    }

    @Override // k1.InterfaceC1306s2
    public final String D(x7 x7Var) {
        p1(x7Var, false);
        return this.f7047l.i(x7Var);
    }

    @Override // k1.InterfaceC1306s2
    public final void E(C1150J c1150j, String str, String str2) {
        AbstractC0549h.j(c1150j);
        AbstractC0549h.d(str);
        q1(str, true);
        o1(new W3(this, c1150j, str));
    }

    @Override // k1.InterfaceC1306s2
    public final void E0(s7 s7Var, x7 x7Var) {
        AbstractC0549h.j(s7Var);
        p1(x7Var, false);
        o1(new Y3(this, s7Var, x7Var));
    }

    @Override // k1.InterfaceC1306s2
    public final List F(String str, String str2, boolean z3, x7 x7Var) {
        p1(x7Var, false);
        String str3 = x7Var.f9967m;
        AbstractC0549h.j(str3);
        try {
            List<u7> list = (List) this.f7047l.e().s(new N3(this, str3, str, str2)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (u7 u7Var : list) {
                if (z3 || !w7.h0(u7Var.f9879c)) {
                    arrayList.add(new s7(u7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.f7047l.c().r().c("Failed to query user properties. appId", K2.z(x7Var.f9967m), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e5) {
            e = e5;
            this.f7047l.c().r().c("Failed to query user properties. appId", K2.z(x7Var.f9967m), e);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // k1.InterfaceC1306s2
    public final void G0(final x7 x7Var, final C1216h c1216h) {
        if (this.f7047l.D0().P(null, AbstractC1291q2.f9703Q0)) {
            p1(x7Var, false);
            o1(new Runnable() { // from class: k1.A3
                @Override // java.lang.Runnable
                public final void run() {
                    zzjp.zzF(this.f8880m, x7Var, c1216h);
                }
            });
        }
    }

    @Override // k1.InterfaceC1306s2
    public final List H0(String str, String str2, String str3) {
        q1(str, true);
        try {
            return (List) this.f7047l.e().s(new Q3(this, str, str2, str3)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.f7047l.c().r().b("Failed to get conditional user properties as", e4);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // k1.InterfaceC1306s2
    public final void J(C1232j c1232j) {
        AbstractC0549h.j(c1232j);
        AbstractC0549h.j(c1232j.f9483o);
        AbstractC0549h.d(c1232j.f9481m);
        q1(c1232j.f9481m, true);
        o1(new M3(this, new C1232j(c1232j)));
    }

    @Override // k1.InterfaceC1306s2
    public final void N(C1150J c1150j, x7 x7Var) {
        AbstractC0549h.j(c1150j);
        p1(x7Var, false);
        o1(new V3(this, c1150j, x7Var));
    }

    @Override // k1.InterfaceC1306s2
    public final List S0(x7 x7Var, boolean z3) {
        p1(x7Var, false);
        String str = x7Var.f9967m;
        AbstractC0549h.j(str);
        try {
            List<u7> list = (List) this.f7047l.e().s(new G3(this, str)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (u7 u7Var : list) {
                if (z3 || !w7.h0(u7Var.f9879c)) {
                    arrayList.add(new s7(u7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.f7047l.c().r().c("Failed to get user properties. appId", K2.z(x7Var.f9967m), e);
            return null;
        } catch (ExecutionException e5) {
            e = e5;
            this.f7047l.c().r().c("Failed to get user properties. appId", K2.z(x7Var.f9967m), e);
            return null;
        }
    }

    @Override // k1.InterfaceC1306s2
    public final void T(x7 x7Var) {
        p1(x7Var, false);
        o1(new H3(this, x7Var));
    }

    @Override // k1.InterfaceC1306s2
    public final void V0(final x7 x7Var, final Bundle bundle, final InterfaceC1322u2 interfaceC1322u2) {
        p1(x7Var, false);
        final String str = (String) AbstractC0549h.j(x7Var.f9967m);
        this.f7047l.e().A(new Runnable() { // from class: k1.B3
            @Override // java.lang.Runnable
            public final void run() {
                zzjp.zzH(this.f8895m, x7Var, bundle, interfaceC1322u2, str);
            }
        });
    }

    @Override // k1.InterfaceC1306s2
    public final void W0(C1232j c1232j, x7 x7Var) {
        AbstractC0549h.j(c1232j);
        AbstractC0549h.j(c1232j.f9483o);
        p1(x7Var, false);
        C1232j c1232j2 = new C1232j(c1232j);
        c1232j2.f9481m = x7Var.f9967m;
        o1(new K3(this, c1232j2, x7Var));
    }

    @Override // k1.InterfaceC1306s2
    public final void Z(x7 x7Var, final S6 s6, final InterfaceC1338w2 interfaceC1338w2) {
        l7 l7Var = this.f7047l;
        if (l7Var.D0().P(null, AbstractC1291q2.f9703Q0)) {
            p1(x7Var, false);
            final String str = (String) AbstractC0549h.j(x7Var.f9967m);
            this.f7047l.e().A(new Runnable() { // from class: k1.D3
                @Override // java.lang.Runnable
                public final void run() {
                    zzjp.zzd(this.f8934m, str, s6, interfaceC1338w2);
                }
            });
        } else {
            try {
                interfaceC1338w2.b0(new U6(Collections.EMPTY_LIST));
                l7Var.c().v().a("[sgtm] Client upload is not enabled on the service side.");
            } catch (RemoteException e4) {
                this.f7047l.c().w().b("[sgtm] UploadBatchesCallback failed.", e4);
            }
        }
    }

    @Override // k1.InterfaceC1306s2
    public final void a0(final x7 x7Var) {
        AbstractC0549h.d(x7Var.f9967m);
        AbstractC0549h.j(x7Var.f9954G);
        u(new Runnable() { // from class: k1.C3
            @Override // java.lang.Runnable
            public final void run() {
                zzjp.zzE(this.f8914m, x7Var);
            }
        });
    }

    @Override // k1.InterfaceC1306s2
    public final void a1(x7 x7Var) {
        AbstractC0549h.d(x7Var.f9967m);
        AbstractC0549h.j(x7Var.f9954G);
        u(new T3(this, x7Var));
    }

    @Override // k1.InterfaceC1306s2
    public final C1288q b1(x7 x7Var) {
        p1(x7Var, false);
        AbstractC0549h.d(x7Var.f9967m);
        try {
            return (C1288q) this.f7047l.e().t(new U3(this, x7Var)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e4) {
            this.f7047l.c().r().c("Failed to get consent. appId", K2.z(x7Var.f9967m), e4);
            return new C1288q(null);
        }
    }

    @Override // k1.InterfaceC1306s2
    public final List d0(x7 x7Var, Bundle bundle) {
        p1(x7Var, false);
        AbstractC0549h.j(x7Var.f9967m);
        l7 l7Var = this.f7047l;
        if (!l7Var.D0().P(null, AbstractC1291q2.f9748i1)) {
            try {
                return (List) this.f7047l.e().s(new CallableC1159a4(this, x7Var, bundle)).get();
            } catch (InterruptedException | ExecutionException e4) {
                this.f7047l.c().r().c("Failed to get trigger URIs. appId", K2.z(x7Var.f9967m), e4);
                return Collections.EMPTY_LIST;
            }
        }
        try {
            return (List) l7Var.e().t(new Z3(this, x7Var, bundle)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e5) {
            this.f7047l.c().r().c("Failed to get trigger URIs. appId", K2.z(x7Var.f9967m), e5);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // k1.InterfaceC1306s2
    public final void f1(x7 x7Var) {
        p1(x7Var, false);
        o1(new R3(this, x7Var));
    }

    @Override // k1.InterfaceC1306s2
    public final void g1(x7 x7Var) {
        p1(x7Var, false);
        o1(new I3(this, x7Var));
    }

    @Override // k1.InterfaceC1306s2
    public final List h1(String str, String str2, x7 x7Var) {
        p1(x7Var, false);
        String str3 = x7Var.f9967m;
        AbstractC0549h.j(str3);
        try {
            return (List) this.f7047l.e().s(new P3(this, str3, str, str2)).get();
        } catch (InterruptedException | ExecutionException e4) {
            this.f7047l.c().r().b("Failed to get conditional user properties", e4);
            return Collections.EMPTY_LIST;
        }
    }

    @Override // k1.InterfaceC1306s2
    public final void j1(long j4, String str, String str2, String str3) {
        o1(new J3(this, str2, str3, str, j4));
    }

    @Override // k1.InterfaceC1306s2
    public final void l0(final Bundle bundle, final x7 x7Var) {
        p1(x7Var, false);
        final String str = x7Var.f9967m;
        AbstractC0549h.j(str);
        o1(new Runnable() { // from class: k1.F3
            @Override // java.lang.Runnable
            public final void run() {
                zzjp.zzI(this.f9027m, bundle, str, x7Var);
            }
        });
    }

    @Override // k1.InterfaceC1306s2
    public final List n1(String str, String str2, String str3, boolean z3) {
        q1(str, true);
        try {
            List<u7> list = (List) this.f7047l.e().s(new O3(this, str, str2, str3)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (u7 u7Var : list) {
                if (z3 || !w7.h0(u7Var.f9879c)) {
                    arrayList.add(new s7(u7Var));
                }
            }
            return arrayList;
        } catch (InterruptedException e4) {
            e = e4;
            this.f7047l.c().r().c("Failed to get user properties as. appId", K2.z(str), e);
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e5) {
            e = e5;
            this.f7047l.c().r().c("Failed to get user properties as. appId", K2.z(str), e);
            return Collections.EMPTY_LIST;
        }
    }

    public final void o1(Runnable runnable) {
        AbstractC0549h.j(runnable);
        l7 l7Var = this.f7047l;
        if (l7Var.e().E()) {
            runnable.run();
        } else {
            l7Var.e().A(runnable);
        }
    }

    public final void p1(x7 x7Var, boolean z3) {
        AbstractC0549h.j(x7Var);
        String str = x7Var.f9967m;
        AbstractC0549h.d(str);
        q1(str, false);
        this.f7047l.g().U(x7Var.f9968n, x7Var.f9949B);
    }

    public final void q1(String str, boolean z3) {
        if (TextUtils.isEmpty(str)) {
            this.f7047l.c().r().a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z3) {
            try {
                if (this.f7048m == null) {
                    boolean z4 = true;
                    if (!"com.google.android.gms".equals(this.f7049n)) {
                        l7 l7Var = this.f7047l;
                        if (!p.a(l7Var.d(), Binder.getCallingUid()) && !o.a(l7Var.d()).c(Binder.getCallingUid())) {
                            z4 = false;
                        }
                    }
                    this.f7048m = Boolean.valueOf(z4);
                }
                if (this.f7048m.booleanValue()) {
                    return;
                }
            } catch (SecurityException e4) {
                this.f7047l.c().r().b("Measurement Service called with invalid calling package. appId", K2.z(str));
                throw e4;
            }
        }
        if (this.f7049n == null && AbstractC0516n.i(this.f7047l.d(), Binder.getCallingUid(), str)) {
            this.f7049n = str;
        }
        if (str.equals(this.f7049n)) {
        } else {
            throw new SecurityException(String.format("Unknown calling package name '%s'.", str));
        }
    }

    public final void r(C1150J c1150j, x7 x7Var) {
        if (!((Boolean) AbstractC1291q2.f9766o1.a(null)).booleanValue()) {
            l7 l7Var = this.f7047l;
            C1268n3 c1268n3K0 = l7Var.K0();
            String str = x7Var.f9967m;
            if (!c1268n3K0.N(str)) {
                r1(c1150j, x7Var);
                return;
            }
            l7Var.c().v().b("EES config found for", str);
        }
        l7 l7Var2 = this.f7047l;
        C1268n3 c1268n3K02 = l7Var2.K0();
        String str2 = x7Var.f9967m;
        C0712c0 c0712c0 = TextUtils.isEmpty(str2) ? null : (C0712c0) c1268n3K02.f9604j.c(str2);
        if (c0712c0 == null) {
            this.f7047l.c().v().b("EES not loaded for", x7Var.f9967m);
            r1(c1150j, x7Var);
            return;
        }
        try {
            Map mapS = l7Var2.a().S(c1150j.f9089n.g(), true);
            String str3 = c1150j.f9088m;
            String strA = AbstractC1237j4.a(str3);
            if (strA != null) {
                str3 = strA;
            }
            if (c0712c0.e(new C0702b(str3, c1150j.f9091p, mapS))) {
                if (c0712c0.g()) {
                    l7 l7Var3 = this.f7047l;
                    l7Var3.c().v().b("EES edited event", c1150j.f9088m);
                    r1(l7Var3.a().J(c0712c0.a().b()), x7Var);
                } else {
                    r1(c1150j, x7Var);
                }
                if (c0712c0.f()) {
                    for (C0702b c0702b : c0712c0.a().c()) {
                        l7 l7Var4 = this.f7047l;
                        l7Var4.c().v().b("EES logging created event", c0702b.e());
                        r1(l7Var4.a().J(c0702b), x7Var);
                    }
                    return;
                }
                return;
            }
        } catch (C0903z0 unused) {
            this.f7047l.c().r().c("EES error. appId, eventName", x7Var.f9968n, c1150j.f9088m);
        }
        this.f7047l.c().v().b("EES was not applied to event", c1150j.f9088m);
        r1(c1150j, x7Var);
    }

    public final void r1(C1150J c1150j, x7 x7Var) {
        l7 l7Var = this.f7047l;
        l7Var.q();
        l7Var.x(c1150j, x7Var);
    }

    public final C1150J s1(C1150J c1150j, x7 x7Var) {
        C1148H c1148h;
        if ("_cmp".equals(c1150j.f9088m) && (c1148h = c1150j.f9089n) != null && c1148h.d() != 0) {
            String strL = c1148h.l("_cis");
            if ("referrer broadcast".equals(strL) || "referrer API".equals(strL)) {
                this.f7047l.c().u().b("Event has been filtered ", c1150j.toString());
                return new C1150J("_cmpx", c1148h, c1150j.f9090o, c1150j.f9091p);
            }
        }
        return c1150j;
    }

    @Override // k1.InterfaceC1306s2
    public final byte[] t0(C1150J c1150j, String str) {
        AbstractC0549h.d(str);
        AbstractC0549h.j(c1150j);
        q1(str, true);
        l7 l7Var = this.f7047l;
        I2 i2Q = l7Var.c().q();
        C2 c2H0 = l7Var.H0();
        String str2 = c1150j.f9088m;
        i2Q.b("Log and bundle. event", c2H0.d(str2));
        long jC = l7Var.f().c() / 1000000;
        try {
            byte[] bArr = (byte[]) l7Var.e().t(new X3(this, c1150j, str)).get();
            if (bArr == null) {
                l7Var.c().r().b("Log and bundle returned null. appId", K2.z(str));
                bArr = new byte[0];
            }
            l7Var.c().q().d("Log and bundle processed. event, size, time_ms", l7Var.H0().d(str2), Integer.valueOf(bArr.length), Long.valueOf((l7Var.f().c() / 1000000) - jC));
            return bArr;
        } catch (InterruptedException e4) {
            e = e4;
            l7 l7Var2 = this.f7047l;
            l7Var2.c().r().d("Failed to log and bundle. appId, event, error", K2.z(str), l7Var2.H0().d(c1150j.f9088m), e);
            return null;
        } catch (ExecutionException e5) {
            e = e5;
            l7 l7Var22 = this.f7047l;
            l7Var22.c().r().d("Failed to log and bundle. appId, event, error", K2.z(str), l7Var22.H0().d(c1150j.f9088m), e);
            return null;
        }
    }

    public final void u(Runnable runnable) {
        AbstractC0549h.j(runnable);
        l7 l7Var = this.f7047l;
        if (l7Var.e().E()) {
            runnable.run();
        } else {
            l7Var.e().B(runnable);
        }
    }

    @Override // k1.InterfaceC1306s2
    public final void y(x7 x7Var) {
        String str = x7Var.f9967m;
        AbstractC0549h.d(str);
        q1(str, false);
        o1(new S3(this, x7Var));
    }
}
