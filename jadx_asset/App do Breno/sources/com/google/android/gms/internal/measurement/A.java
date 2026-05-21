package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC0894y {
    public A() {
        this.f7016a.add(O.EQUALS);
        this.f7016a.add(O.GREATER_THAN);
        this.f7016a.add(O.GREATER_THAN_EQUALS);
        this.f7016a.add(O.IDENTITY_EQUALS);
        this.f7016a.add(O.IDENTITY_NOT_EQUALS);
        this.f7016a.add(O.LESS_THAN);
        this.f7016a.add(O.LESS_THAN_EQUALS);
        this.f7016a.add(O.NOT_EQUALS);
    }

    public static boolean c(r rVar, r rVar2) {
        if (rVar.getClass().equals(rVar2.getClass())) {
            if ((rVar instanceof C0878w) || (rVar instanceof C0823p)) {
                return true;
            }
            return rVar instanceof C0774j ? (Double.isNaN(rVar.f().doubleValue()) || Double.isNaN(rVar2.f().doubleValue()) || rVar.f().doubleValue() != rVar2.f().doubleValue()) ? false : true : rVar instanceof C0870v ? rVar.g().equals(rVar2.g()) : rVar instanceof C0747g ? rVar.i().equals(rVar2.i()) : rVar == rVar2;
        }
        if (((rVar instanceof C0878w) || (rVar instanceof C0823p)) && ((rVar2 instanceof C0878w) || (rVar2 instanceof C0823p))) {
            return true;
        }
        boolean z3 = rVar instanceof C0774j;
        if (z3 && (rVar2 instanceof C0870v)) {
            return c(rVar, new C0774j(rVar2.f()));
        }
        boolean z4 = rVar instanceof C0870v;
        if (z4 && (rVar2 instanceof C0774j)) {
            return c(new C0774j(rVar.f()), rVar2);
        }
        if (rVar instanceof C0747g) {
            return c(new C0774j(rVar.f()), rVar2);
        }
        if (rVar2 instanceof C0747g) {
            return c(rVar, new C0774j(rVar2.f()));
        }
        if ((z4 || z3) && (rVar2 instanceof InterfaceC0807n)) {
            return c(rVar, new C0870v(rVar2.g()));
        }
        if ((rVar instanceof InterfaceC0807n) && ((rVar2 instanceof C0870v) || (rVar2 instanceof C0774j))) {
            return c(new C0870v(rVar.g()), rVar2);
        }
        return false;
    }

    public static boolean d(r rVar, r rVar2) {
        if (rVar instanceof InterfaceC0807n) {
            rVar = new C0870v(rVar.g());
        }
        if (rVar2 instanceof InterfaceC0807n) {
            rVar2 = new C0870v(rVar2.g());
        }
        if ((rVar instanceof C0870v) && (rVar2 instanceof C0870v)) {
            return rVar.g().compareTo(rVar2.g()) < 0;
        }
        double dDoubleValue = rVar.f().doubleValue();
        double dDoubleValue2 = rVar2.f().doubleValue();
        return (Double.isNaN(dDoubleValue) || Double.isNaN(dDoubleValue2) || (dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || ((dDoubleValue == 0.0d && dDoubleValue2 == 0.0d) || Double.compare(dDoubleValue, dDoubleValue2) >= 0)) ? false : true;
    }

    public static boolean e(r rVar, r rVar2) {
        if (rVar instanceof InterfaceC0807n) {
            rVar = new C0870v(rVar.g());
        }
        if (rVar2 instanceof InterfaceC0807n) {
            rVar2 = new C0870v(rVar2.g());
        }
        return (((rVar instanceof C0870v) && (rVar2 instanceof C0870v)) || !(Double.isNaN(rVar.f().doubleValue()) || Double.isNaN(rVar2.f().doubleValue()))) && !d(rVar2, rVar);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0894y
    public final r a(String str, U1 u12, List list) {
        boolean zC;
        boolean zC2;
        AbstractC0873v2.h(AbstractC0873v2.e(str).name(), 2, list);
        r rVarB = u12.b((r) list.get(0));
        r rVarB2 = u12.b((r) list.get(1));
        int iOrdinal = AbstractC0873v2.e(str).ordinal();
        if (iOrdinal != 23) {
            if (iOrdinal == 48) {
                zC2 = c(rVarB, rVarB2);
            } else if (iOrdinal == 42) {
                zC = d(rVarB, rVarB2);
            } else if (iOrdinal != 43) {
                switch (iOrdinal) {
                    case 37:
                        zC = d(rVarB2, rVarB);
                        break;
                    case 38:
                        zC = e(rVarB2, rVarB);
                        break;
                    case 39:
                        zC = AbstractC0873v2.l(rVarB, rVarB2);
                        break;
                    case 40:
                        zC2 = AbstractC0873v2.l(rVarB, rVarB2);
                        break;
                    default:
                        return super.b(str);
                }
            } else {
                zC = e(rVarB, rVarB2);
            }
            zC = !zC2;
        } else {
            zC = c(rVarB, rVarB2);
        }
        return zC ? r.f6937g : r.f6938h;
    }
}
