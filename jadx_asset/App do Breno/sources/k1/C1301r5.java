package k1;

import V0.AbstractC0549h;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.EnumC0733e3;

/* JADX INFO: renamed from: k1.r5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1301r5 extends AbstractC1219h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobScheduler f9815c;

    public C1301r5(C1363z3 c1363z3) {
        super(c1363z3);
    }

    @Override // k1.AbstractC1219h2
    public final void l() {
        this.f9815c = (JobScheduler) this.f9366a.d().getSystemService("jobscheduler");
    }

    @Override // k1.AbstractC1219h2
    public final boolean n() {
        return true;
    }

    public final int o() {
        return "measurement-client".concat(String.valueOf(this.f9366a.d().getPackageName())).hashCode();
    }

    public final EnumC0733e3 p() {
        i();
        h();
        C1363z3 c1363z3 = this.f9366a;
        if (!c1363z3.B().P(null, AbstractC1291q2.f9707S0)) {
            return EnumC0733e3.CLIENT_FLAG_OFF;
        }
        if (this.f9815c == null) {
            return EnumC0733e3.MISSING_JOB_SCHEDULER;
        }
        if (!c1363z3.B().m()) {
            return EnumC0733e3.NOT_ENABLED_IN_MANIFEST;
        }
        C1363z3 c1363z32 = this.f9366a;
        return c1363z32.D().q() >= 119000 ? !w7.k0(c1363z3.d(), "com.google.android.gms.measurement.AppMeasurementJobService") ? EnumC0733e3.MEASUREMENT_SERVICE_NOT_ENABLED : !c1363z32.O().Q() ? EnumC0733e3.NON_PLAY_MODE : EnumC0733e3.CLIENT_UPLOAD_ELIGIBLE : EnumC0733e3.SDK_TOO_OLD;
    }

    public final void q(long j4) {
        i();
        h();
        JobScheduler jobScheduler = this.f9815c;
        if (jobScheduler != null && jobScheduler.getPendingJob(o()) != null) {
            this.f9366a.c().v().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        EnumC0733e3 enumC0733e3P = p();
        if (enumC0733e3P != EnumC0733e3.CLIENT_UPLOAD_ELIGIBLE) {
            this.f9366a.c().v().b("[sgtm] Not eligible for Scion upload", enumC0733e3P.name());
            return;
        }
        C1363z3 c1363z3 = this.f9366a;
        c1363z3.c().v().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j4));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        c1363z3.c().v().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) AbstractC0549h.j(this.f9815c)).schedule(new JobInfo.Builder(o(), new ComponentName(c1363z3.d(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j4).setOverrideDeadline(j4 + j4).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }
}
