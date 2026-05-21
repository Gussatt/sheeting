package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class T0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f6584q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6585r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T0(C0904z1 c0904z1, long j4) {
        super(c0904z1, true);
        this.f6584q = j4;
        this.f6585r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6585r.f7033i)).setSessionTimeoutDuration(this.f6584q);
    }
}
