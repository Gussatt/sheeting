package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class P0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Boolean f6496q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6497r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P0(C0904z1 c0904z1, Boolean bool) {
        super(c0904z1, true);
        this.f6496q = bool;
        this.f6497r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6497r.f7033i)).setMeasurementEnabled(this.f6496q.booleanValue(), this.f6905m);
    }
}
