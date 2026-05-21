package j$.time.chrono;

import j$.time.ZoneOffset;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1100g implements InterfaceC1098e, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient InterfaceC1095b f8329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.j f8330b;

    static C1100g x(InterfaceC1095b interfaceC1095b, j$.time.j jVar) {
        return new C1100g(interfaceC1095b, jVar);
    }

    static C1100g p(m mVar, j$.time.temporal.m mVar2) {
        C1100g c1100g = (C1100g) mVar2;
        if (mVar.equals(c1100g.f())) {
            return c1100g;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.q() + ", actual: " + c1100g.f().q());
    }

    private C1100g(InterfaceC1095b interfaceC1095b, j$.time.j jVar) {
        Objects.requireNonNull(jVar, "time");
        this.f8329a = interfaceC1095b;
        this.f8330b = jVar;
    }

    private C1100g P(j$.time.temporal.m mVar, j$.time.j jVar) {
        InterfaceC1095b interfaceC1095b = this.f8329a;
        return (interfaceC1095b == mVar && this.f8330b == jVar) ? this : new C1100g(AbstractC1097d.p(interfaceC1095b.f(), mVar), jVar);
    }

    @Override // j$.time.chrono.InterfaceC1098e
    public final InterfaceC1095b n() {
        return this.f8329a;
    }

    @Override // j$.time.chrono.InterfaceC1098e
    public final j$.time.j m() {
        return this.f8330b;
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
            return (((j$.time.temporal.a) qVar).Q() ? this.f8330b : this.f8329a).k(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.f8330b.g(qVar) : this.f8329a.g(qVar);
        }
        return k(qVar).a(e(qVar), qVar);
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q() ? this.f8330b.e(qVar) : this.f8329a.e(qVar);
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(j$.time.g gVar) {
        return P(gVar, this.f8330b);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final C1100g h(long j4, j$.time.temporal.q qVar) {
        boolean z3 = qVar instanceof j$.time.temporal.a;
        InterfaceC1095b interfaceC1095b = this.f8329a;
        if (z3) {
            boolean zQ = ((j$.time.temporal.a) qVar).Q();
            j$.time.j jVar = this.f8330b;
            if (zQ) {
                return P(interfaceC1095b, jVar.h(j4, qVar));
            }
            return P(interfaceC1095b.h(j4, qVar), jVar);
        }
        return p(interfaceC1095b.f(), qVar.o(this, j4));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final C1100g l(long j4, j$.time.temporal.u uVar) {
        boolean z3 = uVar instanceof j$.time.temporal.b;
        InterfaceC1095b interfaceC1095b = this.f8329a;
        if (z3) {
            int i4 = AbstractC1099f.f8328a[((j$.time.temporal.b) uVar).ordinal()];
            j$.time.j jVar = this.f8330b;
            switch (i4) {
                case 1:
                    return L(this.f8329a, 0L, 0L, 0L, j4);
                case 2:
                    C1100g c1100gP = P(interfaceC1095b.l(j4 / 86400000000L, (j$.time.temporal.u) j$.time.temporal.b.DAYS), jVar);
                    return c1100gP.L(c1100gP.f8329a, 0L, 0L, 0L, (j4 % 86400000000L) * 1000);
                case 3:
                    C1100g c1100gP2 = P(interfaceC1095b.l(j4 / 86400000, (j$.time.temporal.u) j$.time.temporal.b.DAYS), jVar);
                    return c1100gP2.L(c1100gP2.f8329a, 0L, 0L, 0L, (j4 % 86400000) * 1000000);
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    return J(j4);
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    return L(this.f8329a, 0L, j4, 0L, 0L);
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    return L(this.f8329a, j4, 0L, 0L, 0L);
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    C1100g c1100gP3 = P(interfaceC1095b.l(j4 / 256, (j$.time.temporal.u) j$.time.temporal.b.DAYS), jVar);
                    return c1100gP3.L(c1100gP3.f8329a, (j4 % 256) * 12, 0L, 0L, 0L);
                default:
                    return P(interfaceC1095b.l(j4, uVar), jVar);
            }
        }
        return p(interfaceC1095b.f(), uVar.o(this, j4));
    }

    final C1100g J(long j4) {
        return L(this.f8329a, 0L, 0L, j4, 0L);
    }

    private C1100g L(InterfaceC1095b interfaceC1095b, long j4, long j5, long j6, long j7) {
        long j8 = j4 | j5 | j6 | j7;
        j$.time.j jVarR = this.f8330b;
        if (j8 == 0) {
            return P(interfaceC1095b, jVarR);
        }
        long j9 = j5 / 1440;
        long j10 = j4 / 24;
        long j11 = (j5 % 1440) * 60000000000L;
        long j12 = ((j4 % 24) * 3600000000000L) + j11 + ((j6 % 86400) * 1000000000) + (j7 % 86400000000000L);
        long jZ = jVarR.Z();
        long j13 = j12 + jZ;
        long jFloorDiv = Math.floorDiv(j13, 86400000000000L) + j10 + j9 + (j6 / 86400) + (j7 / 86400000000000L);
        long jFloorMod = Math.floorMod(j13, 86400000000000L);
        if (jFloorMod != jZ) {
            jVarR = j$.time.j.R(jFloorMod);
        }
        return P(interfaceC1095b.l(jFloorDiv, (j$.time.temporal.u) j$.time.temporal.b.DAYS), jVarR);
    }

    @Override // j$.time.chrono.InterfaceC1098e
    public final InterfaceC1103j D(ZoneOffset zoneOffset) {
        return l.x(zoneOffset, null, this);
    }

    private Object writeReplace() {
        return new F((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f8329a);
        objectOutput.writeObject(this.f8330b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1098e) && compareTo((InterfaceC1098e) obj) == 0;
    }

    public final int hashCode() {
        return this.f8329a.hashCode() ^ this.f8330b.hashCode();
    }

    public final String toString() {
        return this.f8329a.toString() + "T" + this.f8330b.toString();
    }
}
