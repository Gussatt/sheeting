package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0801m1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ BinderC0825p1 f6884q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6885r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0801m1(C0904z1 c0904z1, BinderC0825p1 binderC0825p1) {
        super(c0904z1, true);
        this.f6884q = binderC0825p1;
        this.f6885r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6885r.f7033i)).registerOnMeasurementEventListener(this.f6884q);
    }
}
