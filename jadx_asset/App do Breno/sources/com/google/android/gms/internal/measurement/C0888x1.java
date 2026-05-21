package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.app.Activity;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0888x1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Activity f7006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0896y1 f7007r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0888x1(C0896y1 c0896y1, Activity activity) {
        super(c0896y1.f7017b, true);
        this.f7006q = activity;
        this.f7007r = c0896y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f7007r.f7017b.f7033i)).onActivityDestroyedByScionActivityInfo(H0.d(this.f7006q), this.f6906n);
    }
}
