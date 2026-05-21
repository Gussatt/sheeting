package j$.time;

import j$.time.chrono.InterfaceC1095b;
import j$.time.chrono.InterfaceC1098e;
import j$.time.chrono.InterfaceC1103j;
import j$.time.format.DateTimeFormatter;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDateTime implements j$.time.temporal.m, j$.time.temporal.o, InterfaceC1098e, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LocalDateTime f8298c = R(g.f8425d, j.f8433e);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final LocalDateTime f8299d = R(g.f8426e, j.f8434f);
    private static final long serialVersionUID = 6207766400415563566L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f8300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f8301b;

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, bVar).l(1L, bVar) : l(-j4, bVar);
    }

    @Override // j$.time.chrono.InterfaceC1098e
    public final InterfaceC1103j D(ZoneOffset zoneOffset) {
        return z.x(this, zoneOffset, null);
    }

    public static LocalDateTime Q(int i4) {
        return new LocalDateTime(g.U(i4, 12, 31), j.Q(0));
    }

    public static LocalDateTime R(g gVar, j jVar) {
        Objects.requireNonNull(gVar, "date");
        Objects.requireNonNull(jVar, "time");
        return new LocalDateTime(gVar, jVar);
    }

    public static LocalDateTime S(long j4, int i4, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j5 = i4;
        j$.time.temporal.a.NANO_OF_SECOND.P(j5);
        long jP = j4 + ((long) zoneOffset.P());
        long j6 = 86400;
        return new LocalDateTime(g.W(Math.floorDiv(jP, j6)), j.R((((long) ((int) Math.floorMod(jP, j6))) * 1000000000) + j5));
    }

    public static LocalDateTime x(j$.time.temporal.n nVar) {
        if (nVar instanceof LocalDateTime) {
            return (LocalDateTime) nVar;
        }
        if (nVar instanceof z) {
            return ((z) nVar).L();
        }
        if (nVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) nVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(g.B(nVar), j.B(nVar));
        } catch (a e4) {
            throw new a("Unable to obtain LocalDateTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName(), e4);
        }
    }

    private LocalDateTime(g gVar, j jVar) {
        this.f8300a = gVar;
        this.f8301b = jVar;
    }

    private LocalDateTime Z(g gVar, j jVar) {
        return (this.f8300a == gVar && this.f8301b == jVar) ? this : new LocalDateTime(gVar, jVar);
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar != null && qVar.L(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        return aVar.J() || aVar.Q();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.f8301b.k(qVar) : this.f8300a.k(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.f8301b.g(qVar) : this.f8300a.g(qVar);
        }
        return super.g(qVar);
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.f8301b.e(qVar) : this.f8300a.e(qVar);
        }
        return qVar.p(this);
    }

    private int p(LocalDateTime localDateTime) {
        int iP = this.f8300a.p(localDateTime.f8300a);
        return iP == 0 ? this.f8301b.compareTo(localDateTime.f8301b) : iP;
    }

    public final g W() {
        return this.f8300a;
    }

    @Override // j$.time.chrono.InterfaceC1098e
    public final InterfaceC1095b n() {
        return this.f8300a;
    }

    public final int L() {
        return this.f8300a.Q();
    }

    @Override // j$.time.chrono.InterfaceC1098e
    public final j m() {
        return this.f8301b;
    }

    public final int J() {
        return this.f8301b.P();
    }

    public final int B() {
        return this.f8301b.O();
    }

    public final LocalDateTime Y(g gVar) {
        return Z(gVar, this.f8301b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(g gVar) {
        return Z(gVar, this.f8301b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime h(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            boolean zQ = ((j$.time.temporal.a) qVar).Q();
            j jVar = this.f8301b;
            g gVar = this.f8300a;
            if (zQ) {
                return Z(gVar, jVar.h(j4, qVar));
            }
            return Z(gVar.h(j4, qVar), jVar);
        }
        return (LocalDateTime) qVar.o(this, j4);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime l(long j4, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            int i4 = h.f8430a[((j$.time.temporal.b) uVar).ordinal()];
            j jVar = this.f8301b;
            g gVar = this.f8300a;
            switch (i4) {
                case 1:
                    return V(this.f8300a, 0L, 0L, 0L, j4);
                case 2:
                    LocalDateTime localDateTimeZ = Z(gVar.Y(j4 / 86400000000L), jVar);
                    return localDateTimeZ.V(localDateTimeZ.f8300a, 0L, 0L, 0L, (j4 % 86400000000L) * 1000);
                case 3:
                    LocalDateTime localDateTimeZ2 = Z(gVar.Y(j4 / 86400000), jVar);
                    return localDateTimeZ2.V(localDateTimeZ2.f8300a, 0L, 0L, 0L, (j4 % 86400000) * 1000000);
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    return U(j4);
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    return V(this.f8300a, 0L, j4, 0L, 0L);
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    return V(this.f8300a, j4, 0L, 0L, 0L);
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    LocalDateTime localDateTimeZ3 = Z(gVar.Y(j4 / 256), jVar);
                    return localDateTimeZ3.V(localDateTimeZ3.f8300a, (j4 % 256) * 12, 0L, 0L, 0L);
                default:
                    return Z(gVar.l(j4, uVar), jVar);
            }
        }
        return (LocalDateTime) uVar.o(this, j4);
    }

    public final LocalDateTime U(long j4) {
        return V(this.f8300a, 0L, 0L, j4, 0L);
    }

    @Override // j$.time.chrono.InterfaceC1098e
    /* JADX INFO: renamed from: j */
    public final InterfaceC1098e c(long j4, j$.time.temporal.b bVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, bVar).l(1L, bVar) : l(-j4, bVar);
    }

    private LocalDateTime V(g gVar, long j4, long j5, long j6, long j7) {
        long j8 = j4 | j5 | j6 | j7;
        j jVarR = this.f8301b;
        if (j8 == 0) {
            return Z(gVar, jVarR);
        }
        long j9 = j4 / 24;
        long j10 = j9 + (j5 / 1440) + (j6 / 86400) + (j7 / 86400000000000L);
        long j11 = 1;
        long j12 = ((j4 % 24) * 3600000000000L) + ((j5 % 1440) * 60000000000L) + ((j6 % 86400) * 1000000000) + (j7 % 86400000000000L);
        long jZ = jVarR.Z();
        long j13 = (j12 * j11) + jZ;
        long jFloorDiv = Math.floorDiv(j13, 86400000000000L) + (j10 * j11);
        long jFloorMod = Math.floorMod(j13, 86400000000000L);
        if (jFloorMod != jZ) {
            jVarR = j.R(jFloorMod);
        }
        return Z(gVar.Y(jFloorDiv), jVarR);
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.b()) {
            return this.f8300a;
        }
        return super.a(tVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    @Override // j$.time.chrono.InterfaceC1098e, java.lang.Comparable
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC1098e interfaceC1098e) {
        if (interfaceC1098e instanceof LocalDateTime) {
            return p((LocalDateTime) interfaceC1098e);
        }
        return super.compareTo(interfaceC1098e);
    }

    public final boolean O(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return p(localDateTime) > 0;
        }
        long jT = this.f8300a.t();
        long jT2 = localDateTime.f8300a.t();
        if (jT <= jT2) {
            return jT == jT2 && this.f8301b.Z() > localDateTime.f8301b.Z();
        }
        return true;
    }

    public final boolean P(LocalDateTime localDateTime) {
        if (localDateTime != null) {
            return p(localDateTime) < 0;
        }
        long jT = this.f8300a.t();
        long jT2 = localDateTime.f8300a.t();
        if (jT >= jT2) {
            return jT == jT2 && this.f8301b.Z() < localDateTime.f8301b.Z();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.f8300a.equals(localDateTime.f8300a) && this.f8301b.equals(localDateTime.f8301b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8300a.hashCode() ^ this.f8301b.hashCode();
    }

    public final String toString() {
        return this.f8300a.toString() + "T" + this.f8301b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void a0(DataOutput dataOutput) {
        this.f8300a.g0(dataOutput);
        this.f8301b.d0(dataOutput);
    }
}
