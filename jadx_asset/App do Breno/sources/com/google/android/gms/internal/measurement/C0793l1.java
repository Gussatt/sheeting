package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0793l1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f6877q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6878r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0793l1(C0904z1 c0904z1, Bundle bundle) {
        super(c0904z1, true);
        this.f6877q = bundle;
        this.f6878r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6878r.f7033i)).setDefaultEventParameters(this.f6877q);
    }
}
