package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class X0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Runnable f6621q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6622r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X0(C0904z1 c0904z1, Runnable runnable) {
        super(c0904z1, true);
        this.f6621q = runnable;
        this.f6622r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6622r.f7033i)).retrieveAndUploadBatches(new W0(this, this.f6621q));
    }
}
