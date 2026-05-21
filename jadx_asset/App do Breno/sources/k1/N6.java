package k1;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.AbstractC0800m0;
import com.google.android.gms.internal.measurement.AbstractC0808n0;

/* JADX INFO: loaded from: classes.dex */
public final class N6 extends W6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f9168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC1141A f9169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f9170f;

    public N6(l7 l7Var) {
        super(l7Var);
        this.f9168d = (AlarmManager) this.f9366a.d().getSystemService("alarm");
    }

    private final void r() {
        JobScheduler jobScheduler = (JobScheduler) this.f9366a.d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(o());
        }
    }

    @Override // k1.W6
    public final boolean l() {
        AlarmManager alarmManager = this.f9168d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        r();
        return false;
    }

    public final void m() {
        i();
        this.f9366a.c().v().a("Unscheduling upload");
        AlarmManager alarmManager = this.f9168d;
        if (alarmManager != null) {
            alarmManager.cancel(p());
        }
        q().b();
        r();
    }

    public final void n(long j4) {
        i();
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.b();
        Context contextD = c1363z3.d();
        if (!w7.j0(contextD)) {
            c1363z3.c().q().a("Receiver not registered/enabled");
        }
        if (!w7.l0(contextD, false)) {
            c1363z3.c().q().a("Service not registered/enabled");
        }
        m();
        c1363z3.c().v().b("Scheduling upload, millis", Long.valueOf(j4));
        c1363z3.f().b();
        c1363z3.B();
        if (j4 < Math.max(0L, ((Long) AbstractC1291q2.f9692L.a(null)).longValue()) && !q().e()) {
            q().d(j4);
        }
        c1363z3.b();
        Context contextD2 = c1363z3.d();
        ComponentName componentName = new ComponentName(contextD2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iO = o();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        AbstractC0808n0.a(contextD2, new JobInfo.Builder(iO, componentName).setMinimumLatency(j4).setOverrideDeadline(j4 + j4).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final int o() {
        if (this.f9170f == null) {
            this.f9170f = Integer.valueOf("measurement".concat(String.valueOf(this.f9366a.d().getPackageName())).hashCode());
        }
        return this.f9170f.intValue();
    }

    public final PendingIntent p() {
        Context contextD = this.f9366a.d();
        return PendingIntent.getBroadcast(contextD, 0, new Intent().setClassName(contextD, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC0800m0.f6883a);
    }

    public final AbstractC1141A q() {
        if (this.f9169e == null) {
            this.f9169e = new M6(this, this.f9189b.M0());
        }
        return this.f9169e;
    }
}
