package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class W0 extends zzda {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Runnable f6607l;

    public W0(X0 x02, Runnable runnable) {
        this.f6607l = runnable;
    }

    @Override // com.google.android.gms.internal.measurement.A0
    public final void e() {
        this.f6607l.run();
    }
}
