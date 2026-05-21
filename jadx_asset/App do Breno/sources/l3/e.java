package l3;

import L2.u;
import h3.I;
import h3.J;
import h3.K;
import h3.M;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final N2.i f10268m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f10269n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final j3.a f10270o;

    public static final class a extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f10271q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f10272r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ k3.e f10273s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ e f10274t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k3.e eVar, e eVar2, N2.e eVar3) {
            super(2, eVar3);
            this.f10273s = eVar;
            this.f10274t = eVar2;
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            a aVar = new a(this.f10273s, this.f10274t, eVar);
            aVar.f10272r = obj;
            return aVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f10271q;
            if (i4 == 0) {
                K2.k.b(obj);
                I i5 = (I) this.f10272r;
                k3.e eVar = this.f10273s;
                j3.s sVarJ = this.f10274t.j(i5);
                this.f10271q = 1;
                if (k3.f.h(eVar, sVarJ, this) == objC) {
                    return objC;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
            }
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(I i4, N2.e eVar) {
            return ((a) m(i4, eVar)).q(K2.p.f2516a);
        }
    }

    public static final class b extends P2.k implements W2.p {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f10275q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f10276r;

        public b(N2.e eVar) {
            super(2, eVar);
        }

        @Override // P2.a
        public final N2.e m(Object obj, N2.e eVar) {
            b bVar = e.this.new b(eVar);
            bVar.f10276r = obj;
            return bVar;
        }

        @Override // P2.a
        public final Object q(Object obj) throws Throwable {
            Object objC = O2.c.c();
            int i4 = this.f10275q;
            if (i4 == 0) {
                K2.k.b(obj);
                j3.r rVar = (j3.r) this.f10276r;
                e eVar = e.this;
                this.f10275q = 1;
                if (eVar.f(rVar, this) == objC) {
                    return objC;
                }
            } else {
                if (i4 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                K2.k.b(obj);
            }
            return K2.p.f2516a;
        }

        @Override // W2.p
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object j(j3.r rVar, N2.e eVar) {
            return ((b) m(rVar, eVar)).q(K2.p.f2516a);
        }
    }

    public e(N2.i iVar, int i4, j3.a aVar) {
        this.f10268m = iVar;
        this.f10269n = i4;
        this.f10270o = aVar;
    }

    public static /* synthetic */ Object e(e eVar, k3.e eVar2, N2.e eVar3) {
        Object objB = J.b(new a(eVar2, eVar, null), eVar3);
        return objB == O2.c.c() ? objB : K2.p.f2516a;
    }

    public String a() {
        return null;
    }

    @Override // k3.d
    public Object b(k3.e eVar, N2.e eVar2) {
        return e(this, eVar, eVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0013  */
    @Override // l3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k3.d d(N2.i r2, int r3, j3.a r4) {
        /*
            r1 = this;
            N2.i r0 = r1.f10268m
            N2.i r2 = r2.D(r0)
            j3.a r0 = j3.a.SUSPEND
            if (r4 == r0) goto Lb
            goto L25
        Lb:
            int r4 = r1.f10269n
            r0 = -3
            if (r4 != r0) goto L11
            goto L23
        L11:
            if (r3 != r0) goto L15
        L13:
            r3 = r4
            goto L23
        L15:
            r0 = -2
            if (r4 != r0) goto L19
            goto L23
        L19:
            if (r3 != r0) goto L1c
            goto L13
        L1c:
            int r3 = r3 + r4
            if (r3 < 0) goto L20
            goto L23
        L20:
            r3 = 2147483647(0x7fffffff, float:NaN)
        L23:
            j3.a r4 = r1.f10270o
        L25:
            N2.i r0 = r1.f10268m
            boolean r0 = X2.l.a(r2, r0)
            if (r0 == 0) goto L36
            int r0 = r1.f10269n
            if (r3 != r0) goto L36
            j3.a r0 = r1.f10270o
            if (r4 != r0) goto L36
            return r1
        L36:
            l3.e r2 = r1.g(r2, r3, r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.e.d(N2.i, int, j3.a):k3.d");
    }

    public abstract Object f(j3.r rVar, N2.e eVar);

    public abstract e g(N2.i iVar, int i4, j3.a aVar);

    public final W2.p h() {
        return new b(null);
    }

    public final int i() {
        int i4 = this.f10269n;
        if (i4 == -3) {
            return -2;
        }
        return i4;
    }

    public j3.s j(I i4) {
        return j3.p.c(i4, this.f10268m, i(), this.f10270o, K.ATOMIC, null, h(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strA = a();
        if (strA != null) {
            arrayList.add(strA);
        }
        if (this.f10268m != N2.j.f2823m) {
            arrayList.add("context=" + this.f10268m);
        }
        if (this.f10269n != -3) {
            arrayList.add("capacity=" + this.f10269n);
        }
        if (this.f10270o != j3.a.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.f10270o);
        }
        return M.a(this) + '[' + u.z(arrayList, ", ", null, null, 0, null, null, 62, null) + ']';
    }
}
