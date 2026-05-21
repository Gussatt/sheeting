package k1;

import V0.AbstractC0549h;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.internal.measurement.C0904z1;
import com.google.android.gms.measurement.internal.zzjp;
import java.util.Objects;

/* JADX INFO: renamed from: k1.v6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1334v6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9891a;

    public C1334v6(Context context) {
        AbstractC0549h.j(context);
        this.f9891a = context;
    }

    public static /* synthetic */ void c(C1334v6 c1334v6, JobParameters jobParameters) {
        Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
        ((InterfaceC1326u6) c1334v6.f9891a).c(jobParameters, false);
    }

    public static /* synthetic */ void d(C1334v6 c1334v6, K2 k22, JobParameters jobParameters) {
        k22.v().a("AppMeasurementJobService processed last upload request.");
        ((InterfaceC1326u6) c1334v6.f9891a).c(jobParameters, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(C1334v6 c1334v6, int i4, K2 k22, Intent intent) {
        Context context = c1334v6.f9891a;
        InterfaceC1326u6 interfaceC1326u6 = (InterfaceC1326u6) context;
        if (interfaceC1326u6.b(i4)) {
            k22.v().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i4));
            C1363z3.J(context, null, null).c().v().a("Completed wakeful intent.");
            interfaceC1326u6.a(intent);
        }
    }

    public static final void i(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    public static final boolean j(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    public final int a(final Intent intent, int i4, final int i5) {
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Context context = this.f9891a;
        C1363z3 c1363z3J = C1363z3.J(context, null, null);
        final K2 k2C = c1363z3J.c();
        String action = intent.getAction();
        c1363z3J.b();
        k2C.v().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i5), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            k(l7.S0(context), new Runnable() { // from class: k1.r6
                @Override // java.lang.Runnable
                public final void run() {
                    C1334v6.e(this.f9816m, i5, k2C, intent);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new zzjp(l7.S0(this.f9891a), null);
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    public final void f() {
        Log.v("FA", this.f9891a.getClass().getSimpleName().concat(" is starting up."));
    }

    public final void g() {
        Log.v("FA", this.f9891a.getClass().getSimpleName().concat(" is shutting down."));
    }

    public final boolean h(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            String str = (String) AbstractC0549h.j(string);
            l7 l7VarS0 = l7.S0(this.f9891a);
            final K2 k2C = l7VarS0.c();
            l7VarS0.b();
            k2C.v().b("Local AppMeasurementJobService called. action", str);
            k(l7VarS0, new Runnable() { // from class: k1.s6
                @Override // java.lang.Runnable
                public final void run() {
                    C1334v6.d(this.f9841m, k2C, jobParameters);
                }
            });
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        C0904z1 c0904z1Z = C0904z1.z(this.f9891a, null, null, null, null);
        if (!((Boolean) AbstractC1291q2.f9711U0.a(null)).booleanValue()) {
            return true;
        }
        c0904z1Z.d(new Runnable() { // from class: k1.q6
            @Override // java.lang.Runnable
            public final void run() {
                C1334v6.c(this.f9807m, jobParameters);
            }
        });
        return true;
    }

    public final void k(l7 l7Var, Runnable runnable) {
        l7Var.e().A(new RunnableC1318t6(this, l7Var, runnable));
    }
}
