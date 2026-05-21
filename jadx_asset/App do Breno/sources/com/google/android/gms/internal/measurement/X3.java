package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class X3 extends AbstractC0783k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0711c f6624o;

    public X3(C0711c c0711c) {
        super("internal.eventLogger");
        this.f6624o = c0711c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0783k
    public final r a(U1 u12, List list) {
        AbstractC0873v2.h(this.f6862m, 3, list);
        String strG = u12.b((r) list.get(0)).g();
        long jA = (long) AbstractC0873v2.a(u12.b((r) list.get(1)).f().doubleValue());
        r rVarB = u12.b((r) list.get(2));
        this.f6624o.e(strG, jA, rVarB instanceof C0815o ? AbstractC0873v2.g((C0815o) rVarB) : new HashMap());
        return r.f6932b;
    }
}
