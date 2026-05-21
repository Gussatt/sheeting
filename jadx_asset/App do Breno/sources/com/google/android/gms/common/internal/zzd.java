package com.google.android.gms.common.internal;

import V0.AbstractC0549h;
import V0.N;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class zzd extends zzac {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f6261l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6262m;

    public zzd(a aVar, int i4) {
        this.f6261l = aVar;
        this.f6262m = i4;
    }

    @Override // V0.InterfaceC0546e
    public final void M0(int i4, IBinder iBinder, N n4) {
        a aVar = this.f6261l;
        AbstractC0549h.k(aVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        AbstractC0549h.j(n4);
        a.c0(aVar, n4);
        m1(i4, iBinder, n4.f3631m);
    }

    @Override // V0.InterfaceC0546e
    public final void m1(int i4, IBinder iBinder, Bundle bundle) {
        AbstractC0549h.k(this.f6261l, "onPostInitComplete can be called only once per call to getRemoteService");
        this.f6261l.N(i4, iBinder, bundle, this.f6262m);
        this.f6261l = null;
    }

    @Override // V0.InterfaceC0546e
    public final void x0(int i4, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }
}
