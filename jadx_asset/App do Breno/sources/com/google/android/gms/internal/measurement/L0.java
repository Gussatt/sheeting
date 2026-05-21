package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class L0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f6394q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Bundle f6396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6397t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(C0904z1 c0904z1, String str, String str2, Bundle bundle) {
        super(c0904z1, true);
        this.f6394q = str;
        this.f6395r = str2;
        this.f6396s = bundle;
        this.f6397t = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6397t.f7033i)).clearConditionalUserProperty(this.f6394q, this.f6395r, this.f6396s);
    }
}
