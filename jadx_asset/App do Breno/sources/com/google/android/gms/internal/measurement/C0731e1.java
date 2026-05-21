package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0731e1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f6686q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6687r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f6688s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zzcs f6689t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6690u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0731e1(C0904z1 c0904z1, String str, String str2, boolean z3, zzcs zzcsVar) {
        super(c0904z1, true);
        this.f6686q = str;
        this.f6687r = str2;
        this.f6688s = z3;
        this.f6689t = zzcsVar;
        this.f6690u = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6690u.f7033i)).getUserProperties(this.f6686q, this.f6687r, this.f6688s, this.f6689t);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void b() {
        this.f6689t.k(null);
    }
}
