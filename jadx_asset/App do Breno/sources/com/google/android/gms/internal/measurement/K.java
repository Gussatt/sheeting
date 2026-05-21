package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class K extends AbstractC0894y {
    public K() {
        this.f7016a.add(O.FOR_IN);
        this.f7016a.add(O.FOR_IN_CONST);
        this.f7016a.add(O.FOR_IN_LET);
        this.f7016a.add(O.FOR_LET);
        this.f7016a.add(O.FOR_OF);
        this.f7016a.add(O.FOR_OF_CONST);
        this.f7016a.add(O.FOR_OF_LET);
        this.f7016a.add(O.WHILE);
    }

    public static r c(I i4, Iterator it, r rVar) {
        if (it != null) {
            while (it.hasNext()) {
                r rVarC = i4.a((r) it.next()).c((C0738f) rVar);
                if (rVarC instanceof C0756h) {
                    C0756h c0756h = (C0756h) rVarC;
                    if ("break".equals(c0756h.b())) {
                        return r.f6932b;
                    }
                    if ("return".equals(c0756h.b())) {
                        return c0756h;
                    }
                }
            }
        }
        return r.f6932b;
    }

    public static r d(I i4, r rVar, r rVar2) {
        return c(i4, rVar.k(), rVar2);
    }

    public static r e(I i4, r rVar, r rVar2) {
        if (rVar instanceof Iterable) {
            return c(i4, ((Iterable) rVar).iterator(), rVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0894y
    public final r a(String str, U1 u12, List list) {
        O o4 = O.ADD;
        int iOrdinal = AbstractC0873v2.e(str).ordinal();
        if (iOrdinal == 65) {
            AbstractC0873v2.h(O.WHILE.name(), 4, list);
            r rVar = (r) list.get(0);
            r rVar2 = (r) list.get(1);
            r rVar3 = (r) list.get(2);
            r rVarB = u12.b((r) list.get(3));
            if (u12.b(rVar3).i().booleanValue()) {
                r rVarC = u12.c((C0738f) rVarB);
                if (rVarC instanceof C0756h) {
                    C0756h c0756h = (C0756h) rVarC;
                    if ("break".equals(c0756h.b())) {
                        return r.f6932b;
                    }
                    if ("return".equals(c0756h.b())) {
                        return c0756h;
                    }
                }
            }
            while (u12.b(rVar).i().booleanValue()) {
                r rVarC2 = u12.c((C0738f) rVarB);
                if (rVarC2 instanceof C0756h) {
                    C0756h c0756h2 = (C0756h) rVarC2;
                    if ("break".equals(c0756h2.b())) {
                        return r.f6932b;
                    }
                    if ("return".equals(c0756h2.b())) {
                        return c0756h2;
                    }
                }
                u12.b(rVar2);
            }
            return r.f6932b;
        }
        switch (iOrdinal) {
            case 26:
                AbstractC0873v2.h(O.FOR_IN.name(), 3, list);
                if (!(list.get(0) instanceof C0870v)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
                }
                return d(new J(u12, ((r) list.get(0)).g()), u12.b((r) list.get(1)), u12.b((r) list.get(2)));
            case 27:
                AbstractC0873v2.h(O.FOR_IN_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C0870v)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
                }
                return d(new G(u12, ((r) list.get(0)).g()), u12.b((r) list.get(1)), u12.b((r) list.get(2)));
            case 28:
                AbstractC0873v2.h(O.FOR_IN_LET.name(), 3, list);
                if (!(list.get(0) instanceof C0870v)) {
                    throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
                }
                return d(new H(u12, ((r) list.get(0)).g()), u12.b((r) list.get(1)), u12.b((r) list.get(2)));
            case 29:
                AbstractC0873v2.h(O.FOR_LET.name(), 4, list);
                r rVarB2 = u12.b((r) list.get(0));
                if (!(rVarB2 instanceof C0738f)) {
                    throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
                }
                C0738f c0738f = (C0738f) rVarB2;
                r rVar4 = (r) list.get(1);
                r rVar5 = (r) list.get(2);
                r rVarB3 = u12.b((r) list.get(3));
                U1 u1A = u12.a();
                for (int i4 = 0; i4 < c0738f.t(); i4++) {
                    String strG = c0738f.u(i4).g();
                    u1A.g(strG, u12.d(strG));
                }
                while (u12.b(rVar4).i().booleanValue()) {
                    r rVarC3 = u12.c((C0738f) rVarB3);
                    if (rVarC3 instanceof C0756h) {
                        C0756h c0756h3 = (C0756h) rVarC3;
                        if ("break".equals(c0756h3.b())) {
                            return r.f6932b;
                        }
                        if ("return".equals(c0756h3.b())) {
                            return c0756h3;
                        }
                    }
                    U1 u1A2 = u12.a();
                    for (int i5 = 0; i5 < c0738f.t(); i5++) {
                        String strG2 = c0738f.u(i5).g();
                        u1A2.g(strG2, u1A.d(strG2));
                    }
                    u1A2.b(rVar5);
                    u1A = u1A2;
                }
                return r.f6932b;
            case 30:
                AbstractC0873v2.h(O.FOR_OF.name(), 3, list);
                if (!(list.get(0) instanceof C0870v)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
                }
                return e(new J(u12, ((r) list.get(0)).g()), u12.b((r) list.get(1)), u12.b((r) list.get(2)));
            case 31:
                AbstractC0873v2.h(O.FOR_OF_CONST.name(), 3, list);
                if (!(list.get(0) instanceof C0870v)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
                }
                return e(new G(u12, ((r) list.get(0)).g()), u12.b((r) list.get(1)), u12.b((r) list.get(2)));
            case 32:
                AbstractC0873v2.h(O.FOR_OF_LET.name(), 3, list);
                if (!(list.get(0) instanceof C0870v)) {
                    throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
                }
                return e(new H(u12, ((r) list.get(0)).g()), u12.b((r) list.get(1)), u12.b((r) list.get(2)));
            default:
                return super.b(str);
        }
    }
}
