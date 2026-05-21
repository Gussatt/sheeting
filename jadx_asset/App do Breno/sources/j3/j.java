package j3;

import java.util.concurrent.atomic.AtomicReferenceArray;
import m3.C;

/* JADX INFO: loaded from: classes.dex */
public final class j extends C {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f8623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AtomicReferenceArray f8624r;

    public j(long j4, j jVar, b bVar, int i4) {
        super(j4, jVar, i4);
        this.f8623q = bVar;
        this.f8624r = new AtomicReferenceArray(c.f8597b * 2);
    }

    public final void A(int i4, Object obj) {
        this.f8624r.set((i4 * 2) + 1, obj);
    }

    public final void B(int i4, Object obj) {
        z(i4, obj);
    }

    @Override // m3.C
    public int n() {
        return c.f8597b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r0 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0067, code lost:
    
        r4 = u().f8588n;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006d, code lost:
    
        if (r4 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
    
        m3.x.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0072, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:?, code lost:
    
        return;
     */
    @Override // m3.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o(int r4, java.lang.Throwable r5, N2.i r6) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            r3 = this;
            int r5 = j3.c.f8597b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof h3.P0
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof j3.u
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            m3.F r2 = j3.c.j()
            if (r1 == r2) goto L62
            m3.F r2 = j3.c.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            m3.F r2 = j3.c.p()
            if (r1 == r2) goto Le
            m3.F r2 = j3.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            m3.F r4 = j3.c.f()
            if (r1 == r4) goto L99
            m3.F r4 = j3.c.f8599d
            if (r1 != r4) goto L40
            goto L99
        L40:
            m3.F r4 = j3.c.z()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.s(r4)
            if (r0 == 0) goto L99
            j3.b r4 = r3.u()
            W2.l r4 = r4.f8588n
            if (r4 == 0) goto L99
            m3.x.b(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            m3.F r2 = j3.c.j()
            goto L7e
        L7a:
            m3.F r2 = j3.c.i()
        L7e:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L99
            j3.b r4 = r3.u()
            W2.l r4 = r4.f8588n
            if (r4 == 0) goto L99
            m3.x.b(r4, r5, r6)
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j3.j.o(int, java.lang.Throwable, N2.i):void");
    }

    public final boolean r(int i4, Object obj, Object obj2) {
        return i.a(this.f8624r, (i4 * 2) + 1, obj, obj2);
    }

    public final void s(int i4) {
        z(i4, null);
    }

    public final Object t(int i4, Object obj) {
        return this.f8624r.getAndSet((i4 * 2) + 1, obj);
    }

    public final b u() {
        b bVar = this.f8623q;
        X2.l.b(bVar);
        return bVar;
    }

    public final Object v(int i4) {
        return this.f8624r.get(i4 * 2);
    }

    public final Object w(int i4) {
        return this.f8624r.get((i4 * 2) + 1);
    }

    public final void x(int i4, boolean z3) {
        if (z3) {
            u().G0((this.f10514o * ((long) c.f8597b)) + ((long) i4));
        }
        p();
    }

    public final Object y(int i4) {
        Object objV = v(i4);
        s(i4);
        return objV;
    }

    public final void z(int i4, Object obj) {
        this.f8624r.lazySet(i4 * 2, obj);
    }
}
