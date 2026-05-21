package k1;

import V0.AbstractC0549h;
import android.app.Application;
import android.app.BroadcastOptions;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.AbstractC0752g4;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: k1.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1363z3 implements InterfaceC1186d4 {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static volatile C1363z3 f9991H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public long f9992A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile Boolean f9993B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public volatile boolean f9994C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f9995D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f9996E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final long f9998G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10001c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10002d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10003e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1208g f10004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C1264n f10005g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Z2 f10006h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final K2 f10007i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1307s3 f10008j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final E6 f10009k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final w7 f10010l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C2 f10011m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final b1.d f10012n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C5 f10013o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C1238j5 f10014p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final E0 f10015q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final C1286p5 f10016r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f10017s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public A2 f10018t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C1263m6 f10019u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C1144D f10020v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public C1346x2 f10021w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public C1301r5 f10022x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Boolean f10024z;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f10023y = false;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final AtomicInteger f9997F = new AtomicInteger(0);

    public C1363z3(C1293q4 c1293q4) {
        AbstractC0549h.j(c1293q4);
        Context context = c1293q4.f9797a;
        C1208g c1208g = new C1208g(context);
        this.f10004f = c1208g;
        AbstractC1267n2.f9597a = c1208g;
        this.f9999a = context;
        this.f10000b = c1293q4.f9798b;
        this.f10001c = c1293q4.f9799c;
        this.f10002d = c1293q4.f9800d;
        this.f10003e = c1293q4.f9804h;
        this.f9993B = c1293q4.f9801e;
        this.f10017s = c1293q4.f9806j;
        this.f9994C = true;
        AbstractC0752g4.d(context);
        b1.d dVarD = b1.g.d();
        this.f10012n = dVarD;
        Long l4 = c1293q4.f9805i;
        this.f9998G = l4 != null ? l4.longValue() : dVarD.a();
        this.f10005g = new C1264n(this);
        Z2 z22 = new Z2(this);
        z22.l();
        this.f10006h = z22;
        K2 k22 = new K2(this);
        k22.l();
        this.f10007i = k22;
        w7 w7Var = new w7(this);
        w7Var.l();
        this.f10010l = w7Var;
        this.f10011m = new C2(new C1285p4(c1293q4, this));
        this.f10015q = new E0(this);
        C5 c5 = new C5(this);
        c5.j();
        this.f10013o = c5;
        C1238j5 c1238j5 = new C1238j5(this);
        c1238j5.j();
        this.f10014p = c1238j5;
        E6 e6 = new E6(this);
        e6.j();
        this.f10009k = e6;
        C1286p5 c1286p5 = new C1286p5(this);
        c1286p5.l();
        this.f10016r = c1286p5;
        C1307s3 c1307s3 = new C1307s3(this);
        c1307s3.l();
        this.f10008j = c1307s3;
        com.google.android.gms.internal.measurement.F0 f02 = c1293q4.f9803g;
        boolean z3 = f02 == null || f02.f6330n == 0;
        if (context.getApplicationContext() instanceof Application) {
            x(c1238j5);
            if (c1238j5.f9366a.f9999a.getApplicationContext() instanceof Application) {
                Application application = (Application) c1238j5.f9366a.f9999a.getApplicationContext();
                if (c1238j5.f9498c == null) {
                    c1238j5.f9498c = new C1230i5(c1238j5);
                }
                if (z3) {
                    application.unregisterActivityLifecycleCallbacks(c1238j5.f9498c);
                    application.registerActivityLifecycleCallbacks(c1238j5.f9498c);
                    K2 k23 = c1238j5.f9366a.f10007i;
                    y(k23);
                    k23.v().a("Registered activity lifecycle callback");
                }
            }
        } else {
            y(k22);
            k22.w().a("Application context is not an Application");
        }
        c1307s3.A(new RunnableC1323u3(this, c1293q4));
    }

    public static C1363z3 J(Context context, com.google.android.gms.internal.measurement.F0 f02, Long l4) {
        Bundle bundle;
        if (f02 != null && (f02.f6333q == null || f02.f6334r == null)) {
            f02 = new com.google.android.gms.internal.measurement.F0(f02.f6329m, f02.f6330n, f02.f6331o, f02.f6332p, null, null, f02.f6335s, null);
        }
        AbstractC0549h.j(context);
        AbstractC0549h.j(context.getApplicationContext());
        if (f9991H == null) {
            synchronized (C1363z3.class) {
                try {
                    if (f9991H == null) {
                        f9991H = new C1363z3(new C1293q4(context, f02, l4));
                    }
                } finally {
                }
            }
        } else if (f02 != null && (bundle = f02.f6335s) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            AbstractC0549h.j(f9991H);
            f9991H.f9993B = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        AbstractC0549h.j(f9991H);
        return f9991H;
    }

    public static /* synthetic */ void g(C1363z3 c1363z3, String str, int i4, Throwable th, byte[] bArr, Map map) {
        int i5;
        if (i4 != 200 && i4 != 204) {
            i5 = 304;
            if (i4 != 304) {
                i5 = i4;
            }
            K2 k22 = c1363z3.f10007i;
            y(k22);
            k22.w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i5), th);
        }
        i5 = i4;
        if (th == null) {
            Z2 z22 = c1363z3.f10006h;
            w(z22);
            z22.f9330v.a(true);
            if (bArr == null || bArr.length == 0) {
                K2 k23 = c1363z3.f10007i;
                y(k23);
                k23.q().a("Deferred Deep Link response empty.");
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject(new String(bArr));
                String strOptString = jSONObject.optString("deeplink", "");
                if (TextUtils.isEmpty(strOptString)) {
                    K2 k24 = c1363z3.f10007i;
                    y(k24);
                    k24.q().a("Deferred Deep Link is empty.");
                    return;
                }
                String strOptString2 = jSONObject.optString("gclid", "");
                String strOptString3 = jSONObject.optString("gbraid", "");
                String strOptString4 = jSONObject.optString("gad_source", "");
                double dOptDouble = jSONObject.optDouble("timestamp", 0.0d);
                Bundle bundle = new Bundle();
                w7 w7Var = c1363z3.f10010l;
                w(w7Var);
                C1363z3 c1363z32 = w7Var.f9366a;
                if (!TextUtils.isEmpty(strOptString)) {
                    Context context = c1363z32.f9999a;
                    List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(strOptString)), 0);
                    if (listQueryIntentActivities != null && !listQueryIntentActivities.isEmpty()) {
                        if (!TextUtils.isEmpty(strOptString3)) {
                            bundle.putString("gbraid", strOptString3);
                        }
                        if (!TextUtils.isEmpty(strOptString4)) {
                            bundle.putString("gad_source", strOptString4);
                        }
                        bundle.putString("gclid", strOptString2);
                        bundle.putString("_cis", "ddp");
                        c1363z3.f10014p.F("auto", "_cmp", bundle);
                        w(w7Var);
                        if (TextUtils.isEmpty(strOptString)) {
                            return;
                        }
                        try {
                            SharedPreferences.Editor editorEdit = context.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
                            editorEdit.putString("deeplink", strOptString);
                            editorEdit.putLong("timestamp", Double.doubleToRawLongBits(dOptDouble));
                            if (editorEdit.commit()) {
                                Intent intent = new Intent("android.google.analytics.action.DEEPLINK_ACTION");
                                Context context2 = w7Var.f9366a.f9999a;
                                if (Build.VERSION.SDK_INT < 34) {
                                    context2.sendBroadcast(intent);
                                    return;
                                } else {
                                    context2.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                                    return;
                                }
                            }
                            return;
                        } catch (RuntimeException e4) {
                            K2 k25 = w7Var.f9366a.f10007i;
                            y(k25);
                            k25.r().b("Failed to persist Deferred Deep Link. exception", e4);
                            return;
                        }
                    }
                }
                K2 k26 = c1363z3.f10007i;
                y(k26);
                k26.w().d("Deferred Deep Link validation failed. gclid, gbraid, deep link", strOptString2, strOptString3, strOptString);
                return;
            } catch (JSONException e5) {
                K2 k27 = c1363z3.f10007i;
                y(k27);
                k27.r().b("Failed to parse the Deferred Deep Link response. exception", e5);
                return;
            }
        }
        K2 k222 = c1363z3.f10007i;
        y(k222);
        k222.w().c("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i5), th);
    }

    public static /* synthetic */ void h(C1363z3 c1363z3, C1293q4 c1293q4) {
        C1307s3 c1307s3 = c1363z3.f10008j;
        y(c1307s3);
        c1307s3.h();
        C1264n c1264n = c1363z3.f10005g;
        c1264n.I();
        C1144D c1144d = new C1144D(c1363z3);
        c1144d.l();
        c1363z3.f10020v = c1144d;
        com.google.android.gms.internal.measurement.F0 f02 = c1293q4.f9803g;
        C1346x2 c1346x2 = new C1346x2(c1363z3, c1293q4.f9802f, f02 == null ? 0L : f02.f6329m);
        c1346x2.j();
        c1363z3.f10021w = c1346x2;
        A2 a22 = new A2(c1363z3);
        a22.j();
        c1363z3.f10018t = a22;
        C1263m6 c1263m6 = new C1263m6(c1363z3);
        c1263m6.j();
        c1363z3.f10019u = c1263m6;
        w7 w7Var = c1363z3.f10010l;
        w7Var.m();
        c1363z3.f10006h.m();
        c1363z3.f10021w.k();
        C1301r5 c1301r5 = new C1301r5(c1363z3);
        c1301r5.j();
        c1363z3.f10022x = c1301r5;
        c1301r5.k();
        K2 k22 = c1363z3.f10007i;
        y(k22);
        I2 i2U = k22.u();
        c1264n.B();
        i2U.b("App measurement initialized, version", 119002L);
        y(k22);
        k22.u().a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String strT = c1346x2.t();
        if (TextUtils.isEmpty(c1363z3.f10000b)) {
            w(w7Var);
            if (w7Var.c0(strT, c1264n.K())) {
                y(k22);
                k22.u().a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                y(k22);
                k22.u().a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strT)));
            }
        }
        y(k22);
        k22.q().a("Debug-level message logging enabled");
        int i4 = c1363z3.f9995D;
        AtomicInteger atomicInteger = c1363z3.f9997F;
        if (i4 != atomicInteger.get()) {
            y(k22);
            k22.r().c("Not all components initialized", Integer.valueOf(c1363z3.f9995D), Integer.valueOf(atomicInteger.get()));
        }
        c1363z3.f10023y = true;
    }

    public static final void u() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    public static final void v(G1 g12) {
        if (g12 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void w(AbstractC1168b4 abstractC1168b4) {
        if (abstractC1168b4 == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void x(AbstractC1219h2 abstractC1219h2) {
        if (abstractC1219h2 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC1219h2.m()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1219h2.getClass())));
        }
    }

    public static final void y(AbstractC1177c4 abstractC1177c4) {
        if (abstractC1177c4 == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!abstractC1177c4.n()) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(abstractC1177c4.getClass())));
        }
    }

    public final E0 A() {
        E0 e02 = this.f10015q;
        v(e02);
        return e02;
    }

    public final C1264n B() {
        return this.f10005g;
    }

    public final C1144D C() {
        y(this.f10020v);
        return this.f10020v;
    }

    public final C1346x2 D() {
        x(this.f10021w);
        return this.f10021w;
    }

    public final A2 E() {
        x(this.f10018t);
        return this.f10018t;
    }

    public final C2 F() {
        return this.f10011m;
    }

    public final K2 G() {
        K2 k22 = this.f10007i;
        if (k22 == null || !k22.n()) {
            return null;
        }
        return k22;
    }

    public final Z2 H() {
        Z2 z22 = this.f10006h;
        w(z22);
        return z22;
    }

    public final C1307s3 I() {
        return this.f10008j;
    }

    public final C1238j5 K() {
        C1238j5 c1238j5 = this.f10014p;
        x(c1238j5);
        return c1238j5;
    }

    public final C1286p5 L() {
        C1286p5 c1286p5 = this.f10016r;
        y(c1286p5);
        return c1286p5;
    }

    public final C1301r5 M() {
        v(this.f10022x);
        return this.f10022x;
    }

    public final C5 N() {
        C5 c5 = this.f10013o;
        x(c5);
        return c5;
    }

    public final C1263m6 O() {
        x(this.f10019u);
        return this.f10019u;
    }

    public final E6 P() {
        E6 e6 = this.f10009k;
        x(e6);
        return e6;
    }

    public final w7 Q() {
        w7 w7Var = this.f10010l;
        w(w7Var);
        return w7Var;
    }

    public final String R() {
        if (this.f10005g.P(null, AbstractC1291q2.f9772q1)) {
            return null;
        }
        return this.f10000b;
    }

    public final String S() {
        if (this.f10005g.P(null, AbstractC1291q2.f9772q1)) {
            return null;
        }
        return this.f10001c;
    }

    public final String T() {
        return this.f10002d;
    }

    public final String a() {
        return this.f10017s;
    }

    @Override // k1.InterfaceC1186d4
    public final C1208g b() {
        return this.f10004f;
    }

    @Override // k1.InterfaceC1186d4
    public final K2 c() {
        K2 k22 = this.f10007i;
        y(k22);
        return k22;
    }

    @Override // k1.InterfaceC1186d4
    public final Context d() {
        return this.f9999a;
    }

    @Override // k1.InterfaceC1186d4
    public final C1307s3 e() {
        C1307s3 c1307s3 = this.f10008j;
        y(c1307s3);
        return c1307s3;
    }

    @Override // k1.InterfaceC1186d4
    public final b1.d f() {
        return this.f10012n;
    }

    public final void i() {
        this.f9997F.incrementAndGet();
    }

    public final void j() {
        this.f9995D++;
    }

    public final void k(boolean z3) {
        this.f9993B = Boolean.valueOf(z3);
    }

    public final void l(boolean z3) {
        C1307s3 c1307s3 = this.f10008j;
        y(c1307s3);
        c1307s3.h();
        this.f9994C = z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(com.google.android.gms.internal.measurement.F0 r14) {
        /*
            Method dump skipped, instruction units count: 1285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1363z3.m(com.google.android.gms.internal.measurement.F0):void");
    }

    public final boolean n() {
        return this.f9993B != null && this.f9993B.booleanValue();
    }

    public final boolean o() {
        return z() == 0;
    }

    public final boolean p() {
        C1307s3 c1307s3 = this.f10008j;
        y(c1307s3);
        c1307s3.h();
        return this.f9994C;
    }

    public final boolean q() {
        return TextUtils.isEmpty(this.f10000b);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean r() {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1363z3.r():boolean");
    }

    public final boolean s() {
        return this.f10003e;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t() {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.C1363z3.t():boolean");
    }

    public final int z() {
        C1307s3 c1307s3 = this.f10008j;
        y(c1307s3);
        c1307s3.h();
        C1264n c1264n = this.f10005g;
        if (c1264n.i()) {
            return 1;
        }
        y(c1307s3);
        c1307s3.h();
        if (!this.f9994C) {
            return 8;
        }
        Z2 z22 = this.f10006h;
        w(z22);
        Boolean boolU = z22.u();
        if (boolU != null) {
            return boolU.booleanValue() ? 0 : 3;
        }
        C1208g c1208g = c1264n.f9366a.f10004f;
        Boolean boolF = c1264n.F("firebase_analytics_collection_enabled");
        return boolF != null ? boolF.booleanValue() ? 0 : 4 : (this.f9993B == null || this.f9993B.booleanValue()) ? 0 : 7;
    }
}
