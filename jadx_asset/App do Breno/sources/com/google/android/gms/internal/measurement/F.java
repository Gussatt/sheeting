package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class F extends AbstractC0894y {
    public F() {
        this.f7016a.add(O.AND);
        this.f7016a.add(O.NOT);
        this.f7016a.add(O.OR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0894y
    public final r a(String str, U1 u12, List list) {
        O o4 = O.ADD;
        int iOrdinal = AbstractC0873v2.e(str).ordinal();
        if (iOrdinal == 1) {
            AbstractC0873v2.h(O.AND.name(), 2, list);
            r rVarB = u12.b((r) list.get(0));
            return !rVarB.i().booleanValue() ? rVarB : u12.b((r) list.get(1));
        }
        if (iOrdinal == 47) {
            AbstractC0873v2.h(O.NOT.name(), 1, list);
            return new C0747g(Boolean.valueOf(!u12.b((r) list.get(0)).i().booleanValue()));
        }
        if (iOrdinal != 50) {
            return super.b(str);
        }
        AbstractC0873v2.h(O.OR.name(), 2, list);
        r rVarB2 = u12.b((r) list.get(0));
        return rVarB2.i().booleanValue() ? rVarB2 : u12.b((r) list.get(1));
    }
}
