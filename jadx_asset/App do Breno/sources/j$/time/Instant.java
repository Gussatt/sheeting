package j$.time;

import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.m, j$.time.temporal.o, Comparable<Instant>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Instant f8295c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8297b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.f8296a, instant2.f8296a);
        return iCompare != 0 ? iCompare : this.f8297b - instant2.f8297b;
    }

    static {
        L(-31557014167219200L, 0L);
        L(31556889864403199L, 999999999L);
    }

    public static Instant L(long j4, long j5) {
        return p(Math.addExact(j4, Math.floorDiv(j5, 1000000000L)), (int) Math.floorMod(j5, 1000000000L));
    }

    public static Instant J(long j4) {
        long j5 = 1000;
        return p(Math.floorDiv(j4, j5), ((int) Math.floorMod(j4, j5)) * 1000000);
    }

    private static Instant p(long j4, int i4) {
        if ((((long) i4) | j4) == 0) {
            return f8295c;
        }
        if (j4 < -31557014167219200L || j4 > 31556889864403199L) {
            throw new a("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j4, i4);
    }

    private Instant(long j4, int i4) {
        this.f8296a = j4;
        this.f8297b = i4;
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.NANO_OF_SECOND || qVar == j$.time.temporal.a.MICRO_OF_SECOND || qVar == j$.time.temporal.a.MILLI_OF_SECOND : qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return super.k(qVar).a(qVar.p(this), qVar);
        }
        int i4 = e.f8372a[((j$.time.temporal.a) qVar).ordinal()];
        int i5 = this.f8297b;
        if (i4 == 1) {
            return i5;
        }
        if (i4 == 2) {
            return i5 / 1000;
        }
        if (i4 == 3) {
            return i5 / 1000000;
        }
        if (i4 == 4) {
            j$.time.temporal.a.INSTANT_SECONDS.O(this.f8296a);
        }
        throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        int i4;
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.p(this);
        }
        int i5 = e.f8372a[((j$.time.temporal.a) qVar).ordinal()];
        int i6 = this.f8297b;
        if (i5 == 1) {
            return i6;
        }
        if (i5 == 2) {
            i4 = i6 / 1000;
        } else {
            if (i5 != 3) {
                if (i5 == 4) {
                    return this.f8296a;
                }
                throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
            }
            i4 = i6 / 1000000;
        }
        return i4;
    }

    public final long x() {
        return this.f8296a;
    }

    public final int B() {
        return this.f8297b;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(g gVar) {
        return (Instant) gVar.b(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m h(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (Instant) qVar.o(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.P(j4);
        int i4 = e.f8372a[aVar.ordinal()];
        int i5 = this.f8297b;
        long j5 = this.f8296a;
        if (i4 != 1) {
            if (i4 == 2) {
                int i6 = ((int) j4) * 1000;
                if (i6 != i5) {
                    return p(j5, i6);
                }
            } else if (i4 == 3) {
                int i7 = ((int) j4) * 1000000;
                if (i7 != i5) {
                    return p(j5, i7);
                }
            } else {
                if (i4 != 4) {
                    throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
                }
                if (j4 != j5) {
                    return p(j4, i5);
                }
            }
        } else if (j4 != i5) {
            return p(j5, (int) j4);
        }
        return this;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final Instant l(long j4, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (Instant) uVar.o(this, j4);
        }
        switch (e.f8373b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return O(0L, j4);
            case 2:
                return O(j4 / 1000000, (j4 % 1000000) * 1000);
            case 3:
                return O(j4 / 1000, (j4 % 1000) * 1000000);
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return O(j4, 0L);
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return O(Math.multiplyExact(j4, 60), 0L);
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return O(Math.multiplyExact(j4, 3600), 0L);
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return O(Math.multiplyExact(j4, 43200), 0L);
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return O(Math.multiplyExact(j4, 86400), 0L);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    private Instant O(long j4, long j5) {
        if ((j4 | j5) == 0) {
            return this;
        }
        return L(Math.addExact(Math.addExact(this.f8296a, j4), j5 / 1000000000), ((long) this.f8297b) + (j5 % 1000000000));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j4, uVar);
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        if (tVar == j$.time.temporal.s.a() || tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.b() || tVar == j$.time.temporal.s.c()) {
            return null;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(this.f8296a, j$.time.temporal.a.INSTANT_SECONDS).h(this.f8297b, j$.time.temporal.a.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.x(this, zoneOffset);
    }

    public final long Q() {
        long j4 = this.f8296a;
        return (j4 >= 0 || this.f8297b <= 0) ? Math.addExact(Math.multiplyExact(j4, 1000), r5 / 1000000) : Math.addExact(Math.multiplyExact(j4 + 1, 1000), (r5 / 1000000) - 1000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.f8296a == instant.f8296a && this.f8297b == instant.f8297b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f8296a;
        return (this.f8297b * 51) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f8376e.a(this);
    }

    private Object writeReplace() {
        return new r((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void R(DataOutput dataOutput) {
        dataOutput.writeLong(this.f8296a);
        dataOutput.writeInt(this.f8297b);
    }
}
