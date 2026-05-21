package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class K0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f6380q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6381r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K0(C0904z1 c0904z1, Bundle bundle) {
        super(c0904z1, true);
        this.f6380q = bundle;
        this.f6381r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6381r.f7033i)).setConditionalUserProperty(this.f6380q, this.f6905m);
    }
}
