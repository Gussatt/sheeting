package com.google.android.gms.measurement.internal;

import V0.AbstractC0549h;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.measurement.A0;
import com.google.android.gms.internal.measurement.C0;
import com.google.android.gms.internal.measurement.E0;
import com.google.android.gms.internal.measurement.F0;
import com.google.android.gms.internal.measurement.H0;
import com.google.android.gms.internal.measurement.InterfaceC0887x0;
import com.google.android.gms.internal.measurement.zzcu;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.Map;
import k1.AbstractC1291q2;
import k1.AbstractC1325u5;
import k1.C1148H;
import k1.C1150J;
import k1.C1230i5;
import k1.C1238j5;
import k1.C1363z3;
import k1.I4;
import k1.InterfaceC1277o4;
import k1.K4;
import k1.L3;
import k1.N4;
import k1.N5;
import k1.P6;
import k1.RunnableC1253l4;
import k1.RunnableC1270n5;
import k1.RunnableC1279o6;
import k1.W4;
import k1.q7;
import k1.w7;
import p.C1475a;

/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementDynamiteService extends zzcu {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C1363z3 f7045l = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Map f7046m = new C1475a();

    public static /* synthetic */ void $r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(AppMeasurementDynamiteService appMeasurementDynamiteService, A0 a02) {
        try {
            a02.e();
        } catch (RemoteException e4) {
            ((C1363z3) AbstractC0549h.j(appMeasurementDynamiteService.f7045l)).c().w().b("Failed to call IDynamiteUploadBatchesCallback", e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void beginAdUnitExposure(String str, long j4) {
        r();
        this.f7045l.A().l(str, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        r();
        this.f7045l.K().x(str, str2, bundle);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void clearMeasurementEnabled(long j4) {
        r();
        this.f7045l.K().W(null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void endAdUnitExposure(String str, long j4) {
        r();
        this.f7045l.A().m(str, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void generateEventId(InterfaceC0887x0 interfaceC0887x0) {
        r();
        long jC0 = this.f7045l.Q().C0();
        r();
        this.f7045l.Q().M(interfaceC0887x0, jC0);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getAppInstanceId(InterfaceC0887x0 interfaceC0887x0) {
        r();
        this.f7045l.e().A(new L3(this, interfaceC0887x0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getCachedAppInstanceId(InterfaceC0887x0 interfaceC0887x0) {
        r();
        u(interfaceC0887x0, this.f7045l.K().p0());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getConditionalUserProperties(String str, String str2, InterfaceC0887x0 interfaceC0887x0) {
        r();
        this.f7045l.e().A(new N5(this, interfaceC0887x0, str, str2));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getCurrentScreenClass(InterfaceC0887x0 interfaceC0887x0) {
        r();
        u(interfaceC0887x0, this.f7045l.K().q0());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getCurrentScreenName(InterfaceC0887x0 interfaceC0887x0) {
        r();
        u(interfaceC0887x0, this.f7045l.K().r0());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getGmpAppId(InterfaceC0887x0 interfaceC0887x0) {
        r();
        C1238j5 c1238j5K = this.f7045l.K();
        C1363z3 c1363z3 = c1238j5K.f9366a;
        String strB = null;
        if (c1363z3.B().P(null, AbstractC1291q2.f9772q1) || c1238j5K.f9366a.R() == null) {
            try {
                strB = AbstractC1325u5.b(c1363z3.d(), "google_app_id", c1238j5K.f9366a.a());
            } catch (IllegalStateException e4) {
                c1238j5K.f9366a.c().r().b("getGoogleAppId failed with exception", e4);
            }
        } else {
            strB = c1238j5K.f9366a.R();
        }
        u(interfaceC0887x0, strB);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getMaxUserProperties(String str, InterfaceC0887x0 interfaceC0887x0) {
        r();
        this.f7045l.K().j0(str);
        r();
        this.f7045l.Q().L(interfaceC0887x0, 25);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getSessionId(InterfaceC0887x0 interfaceC0887x0) {
        r();
        C1238j5 c1238j5K = this.f7045l.K();
        c1238j5K.f9366a.e().A(new W4(c1238j5K, interfaceC0887x0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getTestFlag(InterfaceC0887x0 interfaceC0887x0, int i4) {
        r();
        if (i4 == 0) {
            this.f7045l.Q().N(interfaceC0887x0, this.f7045l.K().s0());
            return;
        }
        if (i4 == 1) {
            this.f7045l.Q().M(interfaceC0887x0, this.f7045l.K().o0().longValue());
            return;
        }
        if (i4 != 2) {
            if (i4 == 3) {
                this.f7045l.Q().L(interfaceC0887x0, this.f7045l.K().n0().intValue());
                return;
            } else {
                if (i4 != 4) {
                    return;
                }
                this.f7045l.Q().H(interfaceC0887x0, this.f7045l.K().l0().booleanValue());
                return;
            }
        }
        w7 w7VarQ = this.f7045l.Q();
        double dDoubleValue = this.f7045l.K().m0().doubleValue();
        Bundle bundle = new Bundle();
        bundle.putDouble("r", dDoubleValue);
        try {
            interfaceC0887x0.k(bundle);
        } catch (RemoteException e4) {
            w7VarQ.f9366a.c().w().b("Error returning double value to wrapper", e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void getUserProperties(String str, String str2, boolean z3, InterfaceC0887x0 interfaceC0887x0) {
        r();
        this.f7045l.e().A(new N4(this, interfaceC0887x0, str, str2, z3));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void initForTests(Map map) {
        r();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void initialize(IObjectWrapper iObjectWrapper, F0 f02, long j4) {
        C1363z3 c1363z3 = this.f7045l;
        if (c1363z3 == null) {
            this.f7045l = C1363z3.J((Context) AbstractC0549h.j((Context) ObjectWrapper.unwrap(iObjectWrapper)), f02, Long.valueOf(j4));
        } else {
            c1363z3.c().w().a("Attempting to initialize multiple times");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void isDataCollectionEnabled(InterfaceC0887x0 interfaceC0887x0) {
        r();
        this.f7045l.e().A(new RunnableC1279o6(this, interfaceC0887x0));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void logEvent(String str, String str2, Bundle bundle, boolean z3, boolean z4, long j4) {
        r();
        this.f7045l.K().D(str, str2, bundle, z3, z4, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC0887x0 interfaceC0887x0, long j4) {
        r();
        AbstractC0549h.d(str2);
        (bundle != null ? new Bundle(bundle) : new Bundle()).putString("_o", "app");
        this.f7045l.e().A(new RunnableC1253l4(this, interfaceC0887x0, new C1150J(str2, new C1148H(bundle), "app", j4), str));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void logHealthData(int i4, String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        r();
        this.f7045l.c().G(i4, true, false, str, iObjectWrapper == null ? null : ObjectWrapper.unwrap(iObjectWrapper), iObjectWrapper2 == null ? null : ObjectWrapper.unwrap(iObjectWrapper2), iObjectWrapper3 != null ? ObjectWrapper.unwrap(iObjectWrapper3) : null);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityCreated(IObjectWrapper iObjectWrapper, Bundle bundle, long j4) {
        r();
        onActivityCreatedByScionActivityInfo(H0.d((Activity) AbstractC0549h.j((Activity) ObjectWrapper.unwrap(iObjectWrapper))), bundle, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityCreatedByScionActivityInfo(H0 h02, Bundle bundle, long j4) {
        r();
        C1230i5 c1230i5 = this.f7045l.K().f9498c;
        if (c1230i5 != null) {
            this.f7045l.K().y();
            c1230i5.e(h02, bundle);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityDestroyed(IObjectWrapper iObjectWrapper, long j4) {
        r();
        onActivityDestroyedByScionActivityInfo(H0.d((Activity) AbstractC0549h.j((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityDestroyedByScionActivityInfo(H0 h02, long j4) {
        r();
        C1230i5 c1230i5 = this.f7045l.K().f9498c;
        if (c1230i5 != null) {
            this.f7045l.K().y();
            c1230i5.b(h02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityPaused(IObjectWrapper iObjectWrapper, long j4) {
        r();
        onActivityPausedByScionActivityInfo(H0.d((Activity) AbstractC0549h.j((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityPausedByScionActivityInfo(H0 h02, long j4) {
        r();
        C1230i5 c1230i5 = this.f7045l.K().f9498c;
        if (c1230i5 != null) {
            this.f7045l.K().y();
            c1230i5.a(h02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityResumed(IObjectWrapper iObjectWrapper, long j4) {
        r();
        onActivityResumedByScionActivityInfo(H0.d((Activity) AbstractC0549h.j((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityResumedByScionActivityInfo(H0 h02, long j4) {
        r();
        C1230i5 c1230i5 = this.f7045l.K().f9498c;
        if (c1230i5 != null) {
            this.f7045l.K().y();
            c1230i5.d(h02);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivitySaveInstanceState(IObjectWrapper iObjectWrapper, InterfaceC0887x0 interfaceC0887x0, long j4) {
        r();
        onActivitySaveInstanceStateByScionActivityInfo(H0.d((Activity) AbstractC0549h.j((Activity) ObjectWrapper.unwrap(iObjectWrapper))), interfaceC0887x0, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivitySaveInstanceStateByScionActivityInfo(H0 h02, InterfaceC0887x0 interfaceC0887x0, long j4) {
        r();
        C1230i5 c1230i5 = this.f7045l.K().f9498c;
        Bundle bundle = new Bundle();
        if (c1230i5 != null) {
            this.f7045l.K().y();
            c1230i5.c(h02, bundle);
        }
        try {
            interfaceC0887x0.k(bundle);
        } catch (RemoteException e4) {
            this.f7045l.c().w().b("Error returning bundle value to wrapper", e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityStarted(IObjectWrapper iObjectWrapper, long j4) {
        r();
        onActivityStartedByScionActivityInfo(H0.d((Activity) AbstractC0549h.j((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityStartedByScionActivityInfo(H0 h02, long j4) {
        r();
        if (this.f7045l.K().f9498c != null) {
            this.f7045l.K().y();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityStopped(IObjectWrapper iObjectWrapper, long j4) {
        r();
        onActivityStoppedByScionActivityInfo(H0.d((Activity) AbstractC0549h.j((Activity) ObjectWrapper.unwrap(iObjectWrapper))), j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void onActivityStoppedByScionActivityInfo(H0 h02, long j4) {
        r();
        if (this.f7045l.K().f9498c != null) {
            this.f7045l.K().y();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void performAction(Bundle bundle, InterfaceC0887x0 interfaceC0887x0, long j4) {
        r();
        interfaceC0887x0.k(null);
    }

    public final void r() {
        if (this.f7045l == null) {
            throw new IllegalStateException("Attempting to perform action before initialize.");
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void registerOnMeasurementEventListener(C0 c02) {
        InterfaceC1277o4 q7Var;
        r();
        Map map = this.f7046m;
        synchronized (map) {
            try {
                q7Var = (InterfaceC1277o4) map.get(Integer.valueOf(c02.e()));
                if (q7Var == null) {
                    q7Var = new q7(this, c02);
                    map.put(Integer.valueOf(c02.e()), q7Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f7045l.K().J(q7Var);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void resetAnalyticsData(long j4) {
        r();
        this.f7045l.K().L(j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void retrieveAndUploadBatches(final A0 a02) {
        r();
        if (this.f7045l.B().P(null, AbstractC1291q2.f9707S0)) {
            this.f7045l.K().M(new Runnable() { // from class: k1.h3
                @Override // java.lang.Runnable
                public final void run() {
                    AppMeasurementDynamiteService.$r8$lambda$W3cgi1t5N0SU6fYxM9Fsh5qQfPc(this.f9454m, a02);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setConditionalUserProperty(Bundle bundle, long j4) {
        r();
        if (bundle == null) {
            this.f7045l.c().r().a("Conditional user property must not be null");
        } else {
            this.f7045l.K().S(bundle, j4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setConsent(final Bundle bundle, final long j4) {
        r();
        final C1238j5 c1238j5K = this.f7045l.K();
        c1238j5K.f9366a.e().B(new Runnable() { // from class: k1.z4
            @Override // java.lang.Runnable
            public final void run() {
                C1238j5 c1238j5 = c1238j5K;
                if (!TextUtils.isEmpty(c1238j5.f9366a.D().v())) {
                    c1238j5.f9366a.c().x().a("Using developer consent only; google app id found");
                } else {
                    c1238j5.T(bundle, 0, j4);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setConsentThirdParty(Bundle bundle, long j4) {
        r();
        this.f7045l.K().T(bundle, -20, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setCurrentScreen(IObjectWrapper iObjectWrapper, String str, String str2, long j4) {
        r();
        setCurrentScreenByScionActivityInfo(H0.d((Activity) AbstractC0549h.j((Activity) ObjectWrapper.unwrap(iObjectWrapper))), str, str2, j4);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setCurrentScreenByScionActivityInfo(H0 h02, String str, String str2, long j4) {
        r();
        this.f7045l.N().E(h02, str, str2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setDataCollectionEnabled(boolean z3) {
        r();
        C1238j5 c1238j5K = this.f7045l.K();
        c1238j5K.i();
        c1238j5K.f9366a.e().A(new I4(c1238j5K, z3));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setDefaultEventParameters(Bundle bundle) {
        r();
        final C1238j5 c1238j5K = this.f7045l.K();
        final Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        c1238j5K.f9366a.e().A(new Runnable() { // from class: k1.x4
            @Override // java.lang.Runnable
            public final void run() {
                C1238j5.w0(c1238j5K, bundle2);
            }
        });
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setEventInterceptor(C0 c02) {
        r();
        P6 p6 = new P6(this, c02);
        if (this.f7045l.e().E()) {
            this.f7045l.K().V(p6);
        } else {
            this.f7045l.e().A(new RunnableC1270n5(this, p6));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setInstanceIdProvider(E0 e02) {
        r();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setMeasurementEnabled(boolean z3, long j4) {
        r();
        this.f7045l.K().W(Boolean.valueOf(z3));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setMinimumSessionDuration(long j4) {
        r();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setSessionTimeoutDuration(long j4) {
        r();
        C1238j5 c1238j5K = this.f7045l.K();
        c1238j5K.f9366a.e().A(new K4(c1238j5K, j4));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setSgtmDebugInfo(Intent intent) {
        r();
        C1238j5 c1238j5K = this.f7045l.K();
        Uri data = intent.getData();
        if (data == null) {
            c1238j5K.f9366a.c().u().a("Activity intent has no data. Preview Mode was not enabled.");
            return;
        }
        String queryParameter = data.getQueryParameter("sgtm_debug_enable");
        if (queryParameter == null || !queryParameter.equals("1")) {
            C1363z3 c1363z3 = c1238j5K.f9366a;
            c1363z3.c().u().a("[sgtm] Preview Mode was not enabled.");
            c1363z3.B().N(null);
        } else {
            String queryParameter2 = data.getQueryParameter("sgtm_preview_key");
            if (TextUtils.isEmpty(queryParameter2)) {
                return;
            }
            C1363z3 c1363z32 = c1238j5K.f9366a;
            c1363z32.c().u().b("[sgtm] Preview Mode was enabled. Using the sgtmPreviewKey: ", queryParameter2);
            c1363z32.B().N(queryParameter2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setUserId(final String str, long j4) {
        r();
        final C1238j5 c1238j5K = this.f7045l.K();
        if (str != null && TextUtils.isEmpty(str)) {
            c1238j5K.f9366a.c().w().a("User ID must be non-empty or null");
        } else {
            c1238j5K.f9366a.e().A(new Runnable() { // from class: k1.s4
                @Override // java.lang.Runnable
                public final void run() {
                    C1363z3 c1363z3 = c1238j5K.f9366a;
                    if (c1363z3.D().y(str)) {
                        c1363z3.D().x();
                    }
                }
            });
            c1238j5K.a0(null, "_id", str, true, j4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void setUserProperty(String str, String str2, IObjectWrapper iObjectWrapper, boolean z3, long j4) {
        r();
        this.f7045l.K().a0(str, str2, ObjectWrapper.unwrap(iObjectWrapper), z3, j4);
    }

    public final void u(InterfaceC0887x0 interfaceC0887x0, String str) {
        r();
        this.f7045l.Q().N(interfaceC0887x0, str);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0871v0
    public void unregisterOnMeasurementEventListener(C0 c02) {
        InterfaceC1277o4 q7Var;
        r();
        Map map = this.f7046m;
        synchronized (map) {
            q7Var = (InterfaceC1277o4) map.remove(Integer.valueOf(c02.e()));
        }
        if (q7Var == null) {
            q7Var = new q7(this, c02);
        }
        this.f7045l.K().c0(q7Var);
    }
}
