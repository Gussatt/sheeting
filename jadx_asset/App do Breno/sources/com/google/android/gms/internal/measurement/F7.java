package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F7 extends AbstractC0783k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final J7 f6346o;

    public F7(J7 j7) {
        super("internal.registerCallback");
        this.f6346o = j7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0783k
    public final r a(U1 u12, List list) {
        AbstractC0873v2.h(this.f6862m, 3, list);
        String strG = u12.b((r) list.get(0)).g();
        r rVarB = u12.b((r) list.get(1));
        if (!(rVarB instanceof C0831q)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        r rVarB2 = u12.b((r) list.get(2));
        if (!(rVarB2 instanceof C0815o)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C0815o c0815o = (C0815o) rVarB2;
        if (!c0815o.h("type")) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f6346o.a(strG, c0815o.h("priority") ? AbstractC0873v2.b(c0815o.o("priority").f().doubleValue()) : 1000, (C0831q) rVarB, c0815o.o("type").g());
        return r.f6932b;
    }
}
