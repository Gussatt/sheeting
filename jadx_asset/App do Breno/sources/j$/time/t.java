package j$.time;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8458b = 0;
    private static final long serialVersionUID = -23038383694477807L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8459a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8459a - ((t) obj).f8459a;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.v();
    }

    public static t p(int i4) {
        j$.time.temporal.a.YEAR.P(i4);
        return new t(i4);
    }

    private t(int i4) {
        this.f8459a = i4;
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f8459a <= 0 ? 1000000000L : 999999999L);
        }
        return super.k(qVar);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.q qVar) {
        return k(qVar).a(e(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.p(this);
        }
        int i4 = s.f8456a[((j$.time.temporal.a) qVar).ordinal()];
        int i5 = this.f8459a;
        if (i4 == 1) {
            if (i5 < 1) {
                i5 = 1 - i5;
            }
            return i5;
        }
        if (i4 == 2) {
            return i5;
        }
        if (i4 == 3) {
            return i5 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(g gVar) {
        return (t) gVar.b(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final t h(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (t) qVar.o(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.P(j4);
        int i4 = s.f8456a[aVar.ordinal()];
        int i5 = this.f8459a;
        if (i4 == 1) {
            if (i5 < 1) {
                j4 = 1 - j4;
            }
            return p((int) j4);
        }
        if (i4 == 2) {
            return p((int) j4);
        }
        if (i4 == 3) {
            return e(j$.time.temporal.a.ERA) == j4 ? this : p(1 - i5);
        }
        throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final t l(long j4, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (t) uVar.o(this, j4);
        }
        int i4 = s.f8457b[((j$.time.temporal.b) uVar).ordinal()];
        if (i4 == 1) {
            return B(j4);
        }
        if (i4 == 2) {
            return B(Math.multiplyExact(j4, 10));
        }
        if (i4 == 3) {
            return B(Math.multiplyExact(j4, 100));
        }
        if (i4 == 4) {
            return B(Math.multiplyExact(j4, 1000));
        }
        if (i4 == 5) {
            j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
            return h(Math.addExact(e(aVar), j4), aVar);
        }
        throw new j$.time.temporal.v("Unsupported unit: " + uVar);
    }

    public final t B(long j4) {
        return j4 == 0 ? this : p(j$.time.temporal.a.YEAR.O(((long) this.f8459a) + j4));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j4, uVar);
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return j$.time.chrono.t.f8358d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.YEARS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.z(mVar).equals(j$.time.chrono.t.f8358d)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.h(this.f8459a, j$.time.temporal.a.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t) {
            if (this.f8459a == ((t) obj).f8459a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8459a;
    }

    public final String toString() {
        return Integer.toString(this.f8459a);
    }

    private Object writeReplace() {
        return new r((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void L(DataOutput dataOutput) {
        dataOutput.writeInt(this.f8459a);
    }
}
