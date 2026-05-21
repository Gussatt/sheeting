package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.app.Activity;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0840r1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Activity f6940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0896y1 f6941r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0840r1(C0896y1 c0896y1, Activity activity) {
        super(c0896y1.f7017b, true);
        this.f6940q = activity;
        this.f6941r = c0896y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6941r.f7017b.f7033i)).onActivityStartedByScionActivityInfo(H0.d(this.f6940q), this.f6906n);
    }
}
