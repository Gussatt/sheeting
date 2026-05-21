package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class N extends AbstractC0894y {
    public N() {
        this.f7016a.add(O.ASSIGN);
        this.f7016a.add(O.CONST);
        this.f7016a.add(O.CREATE_ARRAY);
        this.f7016a.add(O.CREATE_OBJECT);
        this.f7016a.add(O.EXPRESSION_LIST);
        this.f7016a.add(O.GET);
        this.f7016a.add(O.GET_INDEX);
        this.f7016a.add(O.GET_PROPERTY);
        this.f7016a.add(O.NULL);
        this.f7016a.add(O.SET_PROPERTY);
        this.f7016a.add(O.TYPEOF);
        this.f7016a.add(O.UNDEFINED);
        this.f7016a.add(O.VAR);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0894y
    public final r a(String str, U1 u12, List list) {
        String str2;
        O o4 = O.ADD;
        int iOrdinal = AbstractC0873v2.e(str).ordinal();
        int i4 = 0;
        if (iOrdinal == 3) {
            AbstractC0873v2.h(O.ASSIGN.name(), 2, list);
            r rVarB = u12.b((r) list.get(0));
            if (!(rVarB instanceof C0870v)) {
                throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", rVarB.getClass().getCanonicalName()));
            }
            if (!u12.h(rVarB.g())) {
                throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", rVarB.g()));
            }
            r rVarB2 = u12.b((r) list.get(1));
            u12.g(rVarB.g(), rVarB2);
            return rVarB2;
        }
        if (iOrdinal == 14) {
            AbstractC0873v2.i(O.CONST.name(), 2, list);
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            while (i4 < list.size() - 1) {
                r rVarB3 = u12.b((r) list.get(i4));
                if (!(rVarB3 instanceof C0870v)) {
                    throw new IllegalArgumentException(String.format("Expected string for const name. got %s", rVarB3.getClass().getCanonicalName()));
                }
                u12.f(rVarB3.g(), u12.b((r) list.get(i4 + 1)));
                i4 += 2;
            }
            return r.f6932b;
        }
        if (iOrdinal == 24) {
            AbstractC0873v2.i(O.EXPRESSION_LIST.name(), 1, list);
            r rVarB4 = r.f6932b;
            while (i4 < list.size()) {
                rVarB4 = u12.b((r) list.get(i4));
                if (rVarB4 instanceof C0756h) {
                    throw new IllegalStateException("ControlValue cannot be in an expression list");
                }
                i4++;
            }
            return rVarB4;
        }
        if (iOrdinal == 33) {
            AbstractC0873v2.h(O.GET.name(), 1, list);
            r rVarB5 = u12.b((r) list.get(0));
            if (rVarB5 instanceof C0870v) {
                return u12.d(rVarB5.g());
            }
            throw new IllegalArgumentException(String.format("Expected string for get var. got %s", rVarB5.getClass().getCanonicalName()));
        }
        if (iOrdinal == 49) {
            AbstractC0873v2.h(O.NULL.name(), 0, list);
            return r.f6933c;
        }
        if (iOrdinal == 58) {
            AbstractC0873v2.h(O.SET_PROPERTY.name(), 3, list);
            r rVarB6 = u12.b((r) list.get(0));
            r rVarB7 = u12.b((r) list.get(1));
            r rVarB8 = u12.b((r) list.get(2));
            if (rVarB6 == r.f6932b || rVarB6 == r.f6933c) {
                throw new IllegalStateException(String.format("Can't set property %s of %s", rVarB7.g(), rVarB6.g()));
            }
            if ((rVarB6 instanceof C0738f) && (rVarB7 instanceof C0774j)) {
                ((C0738f) rVarB6).B(rVarB7.f().intValue(), rVarB8);
                return rVarB8;
            }
            if (!(rVarB6 instanceof InterfaceC0807n)) {
                return rVarB8;
            }
            ((InterfaceC0807n) rVarB6).p(rVarB7.g(), rVarB8);
            return rVarB8;
        }
        if (iOrdinal == 17) {
            if (list.isEmpty()) {
                return new C0738f();
            }
            C0738f c0738f = new C0738f();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r rVarB9 = u12.b((r) it.next());
                if (rVarB9 instanceof C0756h) {
                    throw new IllegalStateException("Failed to evaluate array element");
                }
                c0738f.B(i4, rVarB9);
                i4++;
            }
            return c0738f;
        }
        if (iOrdinal == 18) {
            if (list.isEmpty()) {
                return new C0815o();
            }
            if (list.size() % 2 != 0) {
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", Integer.valueOf(list.size())));
            }
            C0815o c0815o = new C0815o();
            while (i4 < list.size() - 1) {
                r rVarB10 = u12.b((r) list.get(i4));
                r rVarB11 = u12.b((r) list.get(i4 + 1));
                if ((rVarB10 instanceof C0756h) || (rVarB11 instanceof C0756h)) {
                    throw new IllegalStateException("Failed to evaluate map entry");
                }
                c0815o.p(rVarB10.g(), rVarB11);
                i4 += 2;
            }
            return c0815o;
        }
        if (iOrdinal == 35 || iOrdinal == 36) {
            AbstractC0873v2.h(O.GET_PROPERTY.name(), 2, list);
            r rVarB12 = u12.b((r) list.get(0));
            r rVarB13 = u12.b((r) list.get(1));
            if ((rVarB12 instanceof C0738f) && AbstractC0873v2.k(rVarB13)) {
                return ((C0738f) rVarB12).u(rVarB13.f().intValue());
            }
            if (rVarB12 instanceof InterfaceC0807n) {
                return ((InterfaceC0807n) rVarB12).o(rVarB13.g());
            }
            if (rVarB12 instanceof C0870v) {
                if ("length".equals(rVarB13.g())) {
                    return new C0774j(Double.valueOf(rVarB12.g().length()));
                }
                if (AbstractC0873v2.k(rVarB13) && rVarB13.f().doubleValue() < rVarB12.g().length()) {
                    return new C0870v(String.valueOf(rVarB12.g().charAt(rVarB13.f().intValue())));
                }
            }
            return r.f6932b;
        }
        switch (iOrdinal) {
            case 62:
                AbstractC0873v2.h(O.TYPEOF.name(), 1, list);
                r rVarB14 = u12.b((r) list.get(0));
                if (rVarB14 instanceof C0878w) {
                    str2 = "undefined";
                } else if (rVarB14 instanceof C0747g) {
                    str2 = "boolean";
                } else if (rVarB14 instanceof C0774j) {
                    str2 = "number";
                } else if (rVarB14 instanceof C0870v) {
                    str2 = "string";
                } else if (rVarB14 instanceof C0831q) {
                    str2 = "function";
                } else {
                    if ((rVarB14 instanceof C0846s) || (rVarB14 instanceof C0756h)) {
                        throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", rVarB14));
                    }
                    str2 = "object";
                }
                return new C0870v(str2);
            case 63:
                AbstractC0873v2.h(O.UNDEFINED.name(), 0, list);
                return r.f6932b;
            case 64:
                AbstractC0873v2.i(O.VAR.name(), 1, list);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    r rVarB15 = u12.b((r) it2.next());
                    if (!(rVarB15 instanceof C0870v)) {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", rVarB15.getClass().getCanonicalName()));
                    }
                    u12.e(rVarB15.g(), r.f6932b);
                }
                return r.f6932b;
            default:
                return super.b(str);
        }
    }
}
