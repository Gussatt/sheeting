package g3;

import X2.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final long d(long j4, int i4) {
        return a.i((j4 << 1) + ((long) i4));
    }

    public static final long e(long j4) {
        return a.i((j4 << 1) + 1);
    }

    public static final long f(long j4) {
        return a.i(j4 << 1);
    }

    public static final long g(long j4) {
        return j4 * ((long) 1000000);
    }

    public static final long h(int i4, d dVar) {
        l.e(dVar, "unit");
        return dVar.compareTo(d.f7313q) <= 0 ? f(e.b(i4, dVar, d.f7310n)) : i(i4, dVar);
    }

    public static final long i(long j4, d dVar) {
        l.e(dVar, "unit");
        d dVar2 = d.f7310n;
        long jB = e.b(4611686018426999999L, dVar2, dVar);
        return ((-jB) > j4 || j4 > jB) ? e(c3.e.d(e.a(j4, dVar, d.f7312p), -4611686018427387903L, 4611686018427387903L)) : f(e.b(j4, dVar, dVar2));
    }
}
