package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f8448a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f8449b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        p pVar = (p) obj;
        ZoneOffset zoneOffset = pVar.f8449b;
        ZoneOffset zoneOffset2 = this.f8449b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        j jVar = pVar.f8448a;
        j jVar2 = this.f8448a;
        if (zEquals) {
            return jVar2.compareTo(jVar);
        }
        int iCompare = Long.compare(jVar2.Z() - (((long) zoneOffset2.P()) * 1000000000), jVar.Z() - (((long) pVar.f8449b.P()) * 1000000000));
        return iCompare == 0 ? jVar2.compareTo(jVar) : iCompare;
    }

    static {
        j jVar = j.f8433e;
        ZoneOffset zoneOffset = ZoneOffset.f8307f;
        jVar.getClass();
        p(jVar, zoneOffset);
        j jVar2 = j.f8434f;
        ZoneOffset zoneOffset2 = ZoneOffset.f8306e;
        jVar2.getClass();
        p(jVar2, zoneOffset2);
    }

    public static p p(j jVar, ZoneOffset zoneOffset) {
        return new p(jVar, zoneOffset);
    }

    private p(j jVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(jVar, "time");
        this.f8448a = jVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f8449b = zoneOffset;
    }

    private p J(j jVar, ZoneOffset zoneOffset) {
        return (this.f8448a == jVar && this.f8449b.equals(zoneOffset)) ? this : new p(jVar, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) qVar).Q() || qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).x();
            }
            return this.f8448a.k(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f8449b.P();
            }
            return this.f8448a.e(qVar);
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(g gVar) {
        return (p) gVar.b(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m h(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = j$.time.temporal.a.OFFSET_SECONDS;
            j jVar = this.f8448a;
            if (qVar == aVar) {
                return J(jVar, ZoneOffset.S(((j$.time.temporal.a) qVar).O(j4)));
            }
            return J(jVar.h(j4, qVar), this.f8449b);
        }
        return (p) qVar.o(this, j4);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final p l(long j4, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return J(this.f8448a.l(j4, uVar), this.f8449b);
        }
        return (p) uVar.o(this, j4);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j4, uVar);
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.f()) {
            return this.f8449b;
        }
        if (((tVar == j$.time.temporal.s.g()) || (tVar == j$.time.temporal.s.a())) || tVar == j$.time.temporal.s.b()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.c()) {
            return this.f8448a;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(this.f8448a.Z(), j$.time.temporal.a.NANO_OF_DAY).h(this.f8449b.P(), j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.f8448a.equals(pVar.f8448a) && this.f8449b.equals(pVar.f8449b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8448a.hashCode() ^ this.f8449b.hashCode();
    }

    public final String toString() {
        return this.f8448a.toString() + this.f8449b.toString();
    }

    private Object writeReplace() {
        return new r((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        this.f8448a.d0(objectOutput);
        this.f8449b.V(objectOutput);
    }

    static p B(ObjectInput objectInput) {
        return new p(j.Y(objectInput), ZoneOffset.U(objectInput));
    }
}
