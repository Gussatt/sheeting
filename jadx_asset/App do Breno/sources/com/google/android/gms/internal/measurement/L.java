package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class L extends AbstractC0894y {
    public L() {
        this.f7016a.add(O.ADD);
        this.f7016a.add(O.DIVIDE);
        this.f7016a.add(O.MODULUS);
        this.f7016a.add(O.MULTIPLY);
        this.f7016a.add(O.NEGATE);
        this.f7016a.add(O.POST_DECREMENT);
        this.f7016a.add(O.POST_INCREMENT);
        this.f7016a.add(O.PRE_DECREMENT);
        this.f7016a.add(O.PRE_INCREMENT);
        this.f7016a.add(O.SUBTRACT);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0894y
    public final r a(String str, U1 u12, List list) {
        O o4 = O.ADD;
        int iOrdinal = AbstractC0873v2.e(str).ordinal();
        if (iOrdinal == 0) {
            AbstractC0873v2.h(O.ADD.name(), 2, list);
            r rVarB = u12.b((r) list.get(0));
            r rVarB2 = u12.b((r) list.get(1));
            if (!(rVarB instanceof InterfaceC0807n) && !(rVarB instanceof C0870v) && !(rVarB2 instanceof InterfaceC0807n) && !(rVarB2 instanceof C0870v)) {
                return new C0774j(Double.valueOf(rVarB.f().doubleValue() + rVarB2.f().doubleValue()));
            }
            return new C0870v(String.valueOf(rVarB.g()).concat(String.valueOf(rVarB2.g())));
        }
        if (iOrdinal == 21) {
            AbstractC0873v2.h(O.DIVIDE.name(), 2, list);
            return new C0774j(Double.valueOf(u12.b((r) list.get(0)).f().doubleValue() / u12.b((r) list.get(1)).f().doubleValue()));
        }
        if (iOrdinal == 59) {
            AbstractC0873v2.h(O.SUBTRACT.name(), 2, list);
            return new C0774j(Double.valueOf(u12.b((r) list.get(0)).f().doubleValue() + new C0774j(Double.valueOf(-u12.b((r) list.get(1)).f().doubleValue())).f().doubleValue()));
        }
        if (iOrdinal == 52 || iOrdinal == 53) {
            AbstractC0873v2.h(str, 2, list);
            r rVarB3 = u12.b((r) list.get(0));
            u12.b((r) list.get(1));
            return rVarB3;
        }
        if (iOrdinal == 55 || iOrdinal == 56) {
            AbstractC0873v2.h(str, 1, list);
            return u12.b((r) list.get(0));
        }
        switch (iOrdinal) {
            case 44:
                AbstractC0873v2.h(O.MODULUS.name(), 2, list);
                return new C0774j(Double.valueOf(u12.b((r) list.get(0)).f().doubleValue() % u12.b((r) list.get(1)).f().doubleValue()));
            case 45:
                AbstractC0873v2.h(O.MULTIPLY.name(), 2, list);
                return new C0774j(Double.valueOf(u12.b((r) list.get(0)).f().doubleValue() * u12.b((r) list.get(1)).f().doubleValue()));
            case 46:
                AbstractC0873v2.h(O.NEGATE.name(), 1, list);
                return new C0774j(Double.valueOf(-u12.b((r) list.get(0)).f().doubleValue()));
            default:
                return super.b(str);
        }
    }
}
