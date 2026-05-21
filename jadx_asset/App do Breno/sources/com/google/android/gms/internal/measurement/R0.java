package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class R0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6560q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R0(C0904z1 c0904z1) {
        super(c0904z1, true);
        this.f6560q = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6560q.f7033i)).resetAnalyticsData(this.f6905m);
    }
}
