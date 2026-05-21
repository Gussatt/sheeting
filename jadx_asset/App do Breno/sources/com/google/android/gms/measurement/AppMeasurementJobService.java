package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import k1.C1334v6;
import k1.InterfaceC1326u6;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements InterfaceC1326u6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1334v6 f7042b;

    @Override // k1.InterfaceC1326u6
    public final void a(Intent intent) {
    }

    @Override // k1.InterfaceC1326u6
    public final boolean b(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // k1.InterfaceC1326u6
    public final void c(JobParameters jobParameters, boolean z3) {
        jobFinished(jobParameters, false);
    }

    public final C1334v6 d() {
        if (this.f7042b == null) {
            this.f7042b = new C1334v6(this);
        }
        return this.f7042b;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().f();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().g();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        d();
        C1334v6.i(intent);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        d().h(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d();
        C1334v6.j(intent);
        return true;
    }
}
