package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes.dex */
public final class J0 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f6372q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f6373r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6374s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f6375t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6376u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J0(C0904z1 c0904z1, String str, String str2, Object obj, boolean z3) {
        super(c0904z1, true);
        this.f6372q = str;
        this.f6373r = str2;
        this.f6374s = obj;
        this.f6375t = z3;
        this.f6376u = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6376u.f7033i)).setUserProperty(this.f6372q, this.f6373r, ObjectWrapper.wrap(this.f6374s), this.f6375t, this.f6905m);
    }
}
