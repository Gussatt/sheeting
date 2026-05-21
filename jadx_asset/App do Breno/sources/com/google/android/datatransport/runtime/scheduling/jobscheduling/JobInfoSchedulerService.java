package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import C0.p;
import C0.u;
import N0.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i4 = jobParameters.getExtras().getInt("priority");
        int i5 = jobParameters.getExtras().getInt("attemptNumber");
        u.f(getApplicationContext());
        p.a aVarD = p.a().b(string).d(a.b(i4));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        u.c().e().m(aVarD.a(), i5, new Runnable() { // from class: J0.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f2289m.jobFinished(jobParameters, false);
            }
        });
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
