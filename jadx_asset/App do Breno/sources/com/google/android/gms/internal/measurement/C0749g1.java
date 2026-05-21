package com.google.android.gms.internal.measurement;

import V0.AbstractC0549h;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0749g1 extends AbstractRunnableC0817o1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ String f6726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C0904z1 f6728s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0749g1(C0904z1 c0904z1, boolean z3, int i4, String str, Object obj, Object obj2, Object obj3) {
        super(c0904z1, false);
        this.f6726q = str;
        this.f6727r = obj;
        this.f6728s = c0904z1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC0817o1
    public final void a() {
        ((InterfaceC0871v0) AbstractC0549h.j(this.f6728s.f7033i)).logHealthData(5, this.f6726q, ObjectWrapper.wrap(this.f6727r), ObjectWrapper.wrap(null), ObjectWrapper.wrap(null));
    }
}
