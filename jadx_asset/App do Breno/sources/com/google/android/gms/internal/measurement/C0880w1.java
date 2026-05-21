package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.app.Activity;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0880w1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Activity f6986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ zzcs f6987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0896y1 f6988s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0880w1(C0896y1 c0896y1, Activity activity, zzcs zzcsVar) {
        super(c0896y1.f7017b, true);
        this.f6986q = activity;
        this.f6987r = zzcsVar;
        this.f6988s = c0896y1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6988s.f7017b.f7033i)).onActivitySaveInstanceStateByScionActivityInfo(H0.d(this.f6986q), this.f6987r, this.f6906n);
    }
}
