package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;

/* JADX INFO: loaded from: classes.dex */
public final class O0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ H0 f6487q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6488r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f6489s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6490t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O0(C0904z1 c0904z1, H0 h02, String str, String str2) {
        super(c0904z1, true);
        this.f6487q = h02;
        this.f6488r = str;
        this.f6489s = str2;
        this.f6490t = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6490t.f7033i)).setCurrentScreenByScionActivityInfo(this.f6487q, this.f6488r, this.f6489s, this.f6905m);
    }
}
