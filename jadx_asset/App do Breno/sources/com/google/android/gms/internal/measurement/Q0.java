package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class Q0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Bundle f6555q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6556r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q0(C0904z1 c0904z1, Bundle bundle) {
        super(c0904z1, true);
        this.f6555q = bundle;
        this.f6556r = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6556r.f7033i)).setConsentThirdParty(this.f6555q, this.f6905m);
    }
}
