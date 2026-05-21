package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import android.os.Bundle;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0809n1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Long f6891q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6892r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f6893s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Bundle f6894t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f6895u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f6896v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6897w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0809n1(C0904z1 c0904z1, Long l4, String str, String str2, Bundle bundle, boolean z3, boolean z4) {
        super(c0904z1, true);
        this.f6891q = l4;
        this.f6892r = str;
        this.f6893s = str2;
        this.f6894t = bundle;
        this.f6895u = z3;
        this.f6896v = z4;
        this.f6897w = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        Long l4 = this.f6891q;
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6897w.f7033i)).logEvent(this.f6892r, this.f6893s, this.f6894t, this.f6895u, this.f6896v, l4 == null ? this.f6905m : l4.longValue());
    }
}
