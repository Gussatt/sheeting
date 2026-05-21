package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class Z0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ zzcs f6632q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6633r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z0(C0904z1 c0904z1, zzcs zzcsVar) {
        super(c0904z1, true);
        this.f6632q = zzcsVar;
        this.f6633r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6633r.f7033i)).getGmpAppId(this.f6632q);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void b() {
        this.f6632q.k(null);
    }
}
