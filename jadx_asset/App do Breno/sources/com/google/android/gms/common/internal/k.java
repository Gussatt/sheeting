package com.google.android.gms.common.internal;

import S0.C0504b;
import V0.B;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class k extends B {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a f6260g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(a aVar, int i4, Bundle bundle) {
        super(aVar, i4, bundle);
        this.f6260g = aVar;
    }

    @Override // V0.B
    public final void f(C0504b c0504b) {
        if (this.f6260g.t() && a.h0(this.f6260g)) {
            a.d0(this.f6260g, 16);
        } else {
            this.f6260g.f6216p.a(c0504b);
            this.f6260g.L(c0504b);
        }
    }

    @Override // V0.B
    public final boolean g() {
        this.f6260g.f6216p.a(C0504b.f3421q);
        return true;
    }
}
