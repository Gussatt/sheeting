package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class M0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f6410q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6411r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ zzcs f6412s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6413t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M0(C0904z1 c0904z1, String str, String str2, zzcs zzcsVar) {
        super(c0904z1, true);
        this.f6410q = str;
        this.f6411r = str2;
        this.f6412s = zzcsVar;
        this.f6413t = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6413t.f7033i)).getConditionalUserProperties(this.f6410q, this.f6411r, this.f6412s);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void b() {
        this.f6412s.k(null);
    }
}
