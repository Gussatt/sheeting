package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.app.Activity;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0864u1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Activity f6973q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0896y1 f6974r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0864u1(C0896y1 c0896y1, Activity activity) {
        super(c0896y1.f7017b, true);
        this.f6973q = activity;
        this.f6974r = c0896y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6974r.f7017b.f7033i)).onActivityPausedByScionActivityInfo(H0.d(this.f6973q), this.f6906n);
    }
}
