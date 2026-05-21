package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class V0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f6600q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6601r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V0(C0904z1 c0904z1, String str) {
        super(c0904z1, true);
        this.f6600q = str;
        this.f6601r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6601r.f7033i)).endAdUnitExposure(this.f6600q, this.f6906n);
    }
}
