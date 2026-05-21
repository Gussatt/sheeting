package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0785k1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f6864q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6865r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0785k1(C0904z1 c0904z1, boolean z3) {
        super(c0904z1, true);
        this.f6864q = z3;
        this.f6865r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6865r.f7033i)).setDataCollectionEnabled(this.f6864q);
    }
}
