package j3;

import X2.z;
import h3.P0;
import j3.h;
import m3.O;
import m3.x;

/* JADX INFO: loaded from: classes.dex */
public class o extends b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f8625y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f8626z;

    public o(int i4, a aVar, W2.l lVar) {
        super(i4, lVar);
        this.f8625y = i4;
        this.f8626z = aVar;
        if (aVar == a.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + z.b(b.class).c() + " instead").toString());
        }
        if (i4 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i4 + " was specified").toString());
    }

    public static /* synthetic */ Object H0(o oVar, Object obj, N2.e eVar) throws Throwable {
        O oD;
        Object objK0 = oVar.K0(obj, true);
        if (!(objK0 instanceof h.a)) {
            return K2.p.f2516a;
        }
        h.c(objK0);
        W2.l lVar = oVar.f8588n;
        if (lVar == null || (oD = x.d(lVar, obj, null, 2, null)) == null) {
            throw oVar.N();
        }
        K2.a.a(oD, oVar.N());
        throw oD;
    }

    @Override // j3.b, j3.t
    public Object B(Object obj) {
        return K0(obj, false);
    }

    public final Object I0(Object obj, boolean z3) {
        W2.l lVar;
        O oD;
        Object objB = super.B(obj);
        if (h.f(objB) || h.e(objB)) {
            return objB;
        }
        if (!z3 || (lVar = this.f8588n) == null || (oD = x.d(lVar, obj, null, 2, null)) == null) {
            return h.f8620a.c(K2.p.f2516a);
        }
        throw oD;
    }

    public final Object J0(Object obj) {
        j jVarI;
        int i4;
        o oVar;
        Object obj2 = c.f8599d;
        j jVar = (j) b.f8582t.get(this);
        while (true) {
            long andIncrement = b.f8578p.getAndIncrement(this);
            long j4 = andIncrement & 1152921504606846975L;
            boolean zX = X(andIncrement);
            int i5 = c.f8597b;
            long j5 = j4 / ((long) i5);
            int i6 = (int) (j4 % ((long) i5));
            if (jVar.f10514o != j5) {
                jVarI = I(j5, jVar);
                if (jVarI != null) {
                    oVar = this;
                    i4 = i6;
                } else if (zX) {
                    return h.f8620a.a(N());
                }
            } else {
                jVarI = jVar;
                i4 = i6;
                oVar = this;
            }
            Object obj3 = obj;
            int iC0 = oVar.C0(jVarI, i4, obj3, j4, obj2, zX);
            jVar = jVarI;
            if (iC0 == 0) {
                jVar.b();
                return h.f8620a.c(K2.p.f2516a);
            }
            if (iC0 == 1) {
                return h.f8620a.c(K2.p.f2516a);
            }
            if (iC0 == 2) {
                if (zX) {
                    jVar.p();
                    return h.f8620a.a(N());
                }
                P0 p02 = obj2 instanceof P0 ? (P0) obj2 : null;
                if (p02 != null) {
                    m0(p02, jVar, i4);
                }
                D((jVar.f10514o * ((long) i5)) + ((long) i4));
                return h.f8620a.c(K2.p.f2516a);
            }
            if (iC0 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iC0 == 4) {
                if (j4 < M()) {
                    jVar.b();
                }
                return h.f8620a.a(N());
            }
            if (iC0 == 5) {
                jVar.b();
            }
            obj = obj3;
        }
    }

    public final Object K0(Object obj, boolean z3) {
        return this.f8626z == a.DROP_LATEST ? I0(obj, z3) : J0(obj);
    }

    @Override // j3.b
    public boolean Y() {
        return this.f8626z == a.DROP_OLDEST;
    }

    @Override // j3.b, j3.t
    public Object m(Object obj, N2.e eVar) {
        return H0(this, obj, eVar);
    }
}
