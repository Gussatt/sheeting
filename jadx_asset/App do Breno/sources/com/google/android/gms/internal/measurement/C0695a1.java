package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0695a1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ zzcs f6646q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6647r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0695a1(C0904z1 c0904z1, zzcs zzcsVar) {
        super(c0904z1, true);
        this.f6646q = zzcsVar;
        this.f6647r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6647r.f7033i)).getCachedAppInstanceId(this.f6646q);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void b() {
        this.f6646q.k(null);
    }
}
