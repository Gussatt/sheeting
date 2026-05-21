package com.google.android.gms.measurement;

import T.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import k1.C1334v6;
import k1.InterfaceC1326u6;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements InterfaceC1326u6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1334v6 f7044b;

    private final C1334v6 d() {
        if (this.f7044b == null) {
            this.f7044b = new C1334v6(this);
        }
        return this.f7044b;
    }

    @Override // k1.InterfaceC1326u6
    public final void a(Intent intent) {
        a.b(intent);
    }

    @Override // k1.InterfaceC1326u6
    public final boolean b(int i4) {
        return stopSelfResult(i4);
    }

    @Override // k1.InterfaceC1326u6
    public final void c(JobParameters jobParameters, boolean z3) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return d().b(intent);
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

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i4, int i5) {
        d().a(intent, i4, i5);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        d();
        C1334v6.j(intent);
        return true;
    }
}
