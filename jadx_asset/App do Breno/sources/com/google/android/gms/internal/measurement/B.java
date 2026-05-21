package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B extends AbstractC0894y {
    public B() {
        this.f7016a.add(O.APPLY);
        this.f7016a.add(O.BLOCK);
        this.f7016a.add(O.BREAK);
        this.f7016a.add(O.CASE);
        this.f7016a.add(O.DEFAULT);
        this.f7016a.add(O.CONTINUE);
        this.f7016a.add(O.DEFINE_FUNCTION);
        this.f7016a.add(O.FN);
        this.f7016a.add(O.IF);
        this.f7016a.add(O.QUOTE);
        this.f7016a.add(O.RETURN);
        this.f7016a.add(O.SWITCH);
        this.f7016a.add(O.TERNARY);
    }

    public static r c(U1 u12, List list) {
        AbstractC0873v2.i(O.FN.name(), 2, list);
        r rVarB = u12.b((r) list.get(0));
        r rVarB2 = u12.b((r) list.get(1));
        if (!(rVarB2 instanceof C0738f)) {
            throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", rVarB2.getClass().getCanonicalName()));
        }
        List listX = ((C0738f) rVarB2).x();
        List arrayList = new ArrayList();
        if (list.size() > 2) {
            arrayList = list.subList(2, list.size());
        }
        return new C0831q(rVarB.g(), listX, arrayList, u12);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0894y
    public final r a(String str, U1 u12, List list) {
        O o4 = O.ADD;
        int iOrdinal = AbstractC0873v2.e(str).ordinal();
        if (iOrdinal == 2) {
            AbstractC0873v2.h(O.APPLY.name(), 3, list);
            r rVarB = u12.b((r) list.get(0));
            String strG = u12.b((r) list.get(1)).g();
            r rVarB2 = u12.b((r) list.get(2));
            if (!(rVarB2 instanceof C0738f)) {
                throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", rVarB2.getClass().getCanonicalName()));
            }
            if (strG.isEmpty()) {
                throw new IllegalArgumentException("Function name for apply is undefined");
            }
            return rVarB.l(strG, u12, ((C0738f) rVarB2).x());
        }
        if (iOrdinal == 15) {
            AbstractC0873v2.h(O.BREAK.name(), 0, list);
            return r.f6934d;
        }
        if (iOrdinal == 25) {
            return c(u12, list);
        }
        if (iOrdinal != 41) {
            if (iOrdinal == 54) {
                return new C0738f(list);
            }
            if (iOrdinal == 57) {
                if (list.isEmpty()) {
                    return r.f6936f;
                }
                AbstractC0873v2.h(O.RETURN.name(), 1, list);
                return new C0756h("return", u12.b((r) list.get(0)));
            }
            if (iOrdinal != 19) {
                if (iOrdinal == 20) {
                    AbstractC0873v2.i(O.DEFINE_FUNCTION.name(), 2, list);
                    C0831q c0831q = (C0831q) c(u12, list);
                    if (c0831q.b() == null) {
                        u12.g("", c0831q);
                        return c0831q;
                    }
                    u12.g(c0831q.b(), c0831q);
                    return c0831q;
                }
                if (iOrdinal == 60) {
                    AbstractC0873v2.h(O.SWITCH.name(), 3, list);
                    r rVarB3 = u12.b((r) list.get(0));
                    r rVarB4 = u12.b((r) list.get(1));
                    r rVarB5 = u12.b((r) list.get(2));
                    if (!(rVarB4 instanceof C0738f)) {
                        throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                    }
                    if (!(rVarB5 instanceof C0738f)) {
                        throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                    }
                    C0738f c0738f = (C0738f) rVarB4;
                    C0738f c0738f2 = (C0738f) rVarB5;
                    int i4 = 0;
                    boolean z3 = false;
                    while (true) {
                        if (i4 < c0738f.t()) {
                            if (z3 || rVarB3.equals(u12.b(c0738f.u(i4)))) {
                                r rVarB6 = u12.b(c0738f2.u(i4));
                                if (!(rVarB6 instanceof C0756h)) {
                                    z3 = true;
                                } else if (!((C0756h) rVarB6).b().equals("break")) {
                                    return rVarB6;
                                }
                            } else {
                                z3 = false;
                            }
                            i4++;
                        } else if (c0738f.t() + 1 == c0738f2.t()) {
                            r rVarB7 = u12.b(c0738f2.u(c0738f.t()));
                            if (rVarB7 instanceof C0756h) {
                                String strB = ((C0756h) rVarB7).b();
                                if (strB.equals("return") || strB.equals("continue")) {
                                    return rVarB7;
                                }
                            }
                        }
                    }
                } else {
                    if (iOrdinal == 61) {
                        AbstractC0873v2.h(O.TERNARY.name(), 3, list);
                        return u12.b((r) list.get(0)).i().booleanValue() ? u12.b((r) list.get(1)) : u12.b((r) list.get(2));
                    }
                    switch (iOrdinal) {
                        case 11:
                            return u12.a().c(new C0738f(list));
                        case 12:
                            AbstractC0873v2.h(O.BREAK.name(), 0, list);
                            return r.f6935e;
                        case 13:
                            break;
                        default:
                            return super.b(str);
                    }
                }
            }
            if (list.isEmpty()) {
                return r.f6932b;
            }
            r rVarB8 = u12.b((r) list.get(0));
            return rVarB8 instanceof C0738f ? u12.c((C0738f) rVarB8) : r.f6932b;
        }
        AbstractC0873v2.i(O.IF.name(), 2, list);
        r rVarB9 = u12.b((r) list.get(0));
        r rVarB10 = u12.b((r) list.get(1));
        r rVarB11 = list.size() > 2 ? u12.b((r) list.get(2)) : null;
        r rVarC = r.f6932b;
        if (rVarB9.i().booleanValue()) {
            rVarC = u12.c((C0738f) rVarB10);
        } else if (rVarB11 != null) {
            rVarC = u12.c((C0738f) rVarB11);
        }
        if (rVarC instanceof C0756h) {
            return rVarC;
        }
        return r.f6932b;
    }
}
