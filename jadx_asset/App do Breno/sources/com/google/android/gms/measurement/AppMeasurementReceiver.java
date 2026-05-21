package com.google.android.gms.measurement;

import T.a;
import android.content.Context;
import android.content.Intent;
import k1.C1194e3;
import k1.InterfaceC1185d3;

/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends a implements InterfaceC1185d3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1194e3 f7043c;

    @Override // k1.InterfaceC1185d3
    public void a(Context context, Intent intent) {
        a.c(context, intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f7043c == null) {
            this.f7043c = new C1194e3(this);
        }
        this.f7043c.a(context, intent);
    }
}
