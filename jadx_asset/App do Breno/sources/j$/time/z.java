package j$.time;

import j$.time.chrono.InterfaceC1095b;
import j$.time.chrono.InterfaceC1098e;
import j$.time.chrono.InterfaceC1103j;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements j$.time.temporal.m, InterfaceC1103j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LocalDateTime f8500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset f8501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final w f8502c;

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, bVar).l(1L, bVar) : l(-j4, bVar);
    }

    public static z x(LocalDateTime localDateTime, w wVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(wVar, "zone");
        if (wVar instanceof ZoneOffset) {
            return new z(localDateTime, wVar, (ZoneOffset) wVar);
        }
        j$.time.zone.f fVarP = wVar.p();
        List listG = fVarP.g(localDateTime);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarP.f(localDateTime);
            localDateTime = localDateTime.U(bVarF.x().x());
            zoneOffset = bVarF.B();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
            Objects.requireNonNull(zoneOffset, "offset");
        }
        return new z(localDateTime, wVar, zoneOffset);
    }

    private static z p(long j4, int i4, w wVar) {
        ZoneOffset zoneOffsetD = wVar.p().d(Instant.L(j4, i4));
        return new z(LocalDateTime.S(j4, i4, zoneOffsetD), wVar, zoneOffsetD);
    }

    private z(LocalDateTime localDateTime, w wVar, ZoneOffset zoneOffset) {
        this.f8500a = localDateTime;
        this.f8501b = zoneOffset;
        this.f8502c = wVar;
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.INSTANT_SECONDS || qVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) qVar).x();
            }
            return this.f8500a.k(qVar);
        }
        return qVar.B(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i4 = y.f8499a[((j$.time.temporal.a) qVar).ordinal()];
            if (i4 == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i4 == 2) {
                return this.f8501b.P();
            }
            return this.f8500a.g(qVar);
        }
        return super.g(qVar);
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i4 = y.f8499a[((j$.time.temporal.a) qVar).ordinal()];
            if (i4 == 1) {
                return G();
            }
            if (i4 == 2) {
                return this.f8501b.P();
            }
            return this.f8500a.e(qVar);
        }
        return qVar.p(this);
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final ZoneOffset y() {
        return this.f8501b;
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final w H() {
        return this.f8502c;
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final InterfaceC1103j A(w wVar) {
        Objects.requireNonNull(wVar, "zone");
        return this.f8502c.equals(wVar) ? this : x(this.f8500a, wVar, this.f8501b);
    }

    public final LocalDateTime L() {
        return this.f8500a;
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final InterfaceC1098e w() {
        return this.f8500a;
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final InterfaceC1095b n() {
        return this.f8500a.W();
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final j m() {
        return this.f8500a.m();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final z i(g gVar) {
        return x(LocalDateTime.R(gVar, this.f8500a.m()), this.f8502c, this.f8501b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m h(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i4 = y.f8499a[aVar.ordinal()];
            LocalDateTime localDateTime = this.f8500a;
            w wVar = this.f8502c;
            if (i4 == 1) {
                return p(j4, localDateTime.B(), wVar);
            }
            ZoneOffset zoneOffset = this.f8501b;
            if (i4 != 2) {
                return x(localDateTime.h(j4, qVar), wVar, zoneOffset);
            }
            ZoneOffset zoneOffsetS = ZoneOffset.S(aVar.O(j4));
            return (zoneOffsetS.equals(zoneOffset) || !wVar.p().g(localDateTime).contains(zoneOffsetS)) ? this : new z(localDateTime, wVar, zoneOffsetS);
        }
        return (z) qVar.o(this, j4);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final z l(long j4, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) uVar;
            int iCompareTo = bVar.compareTo(j$.time.temporal.b.DAYS);
            ZoneOffset zoneOffset = this.f8501b;
            w wVar = this.f8502c;
            LocalDateTime localDateTime = this.f8500a;
            if (iCompareTo >= 0 && bVar != j$.time.temporal.b.FOREVER) {
                return x(localDateTime.l(j4, uVar), wVar, zoneOffset);
            }
            LocalDateTime localDateTimeL = localDateTime.l(j4, uVar);
            Objects.requireNonNull(localDateTimeL, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(wVar, "zone");
            if (wVar.p().g(localDateTimeL).contains(zoneOffset)) {
                return new z(localDateTimeL, wVar, zoneOffset);
            }
            return p(localDateTimeL.N(zoneOffset), localDateTimeL.B(), wVar);
        }
        return (z) uVar.o(this, j4);
    }

    @Override // j$.time.chrono.InterfaceC1103j
    /* JADX INFO: renamed from: j */
    public final InterfaceC1103j c(long j4, j$.time.temporal.b bVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, bVar).l(1L, bVar) : l(-j4, bVar);
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.b()) {
            return this.f8500a.W();
        }
        return super.a(tVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            z zVar = (z) obj;
            if (this.f8500a.equals(zVar.f8500a) && this.f8501b.equals(zVar.f8501b) && this.f8502c.equals(zVar.f8502c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8500a.hashCode() ^ this.f8501b.hashCode()) ^ Integer.rotateLeft(this.f8502c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f8500a.toString();
        ZoneOffset zoneOffset = this.f8501b;
        String str = string + zoneOffset.toString();
        w wVar = this.f8502c;
        if (zoneOffset == wVar) {
            return str;
        }
        return str + "[" + wVar.toString() + "]";
    }

    private Object writeReplace() {
        return new r((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void P(DataOutput dataOutput) {
        this.f8500a.a0(dataOutput);
        this.f8501b.V(dataOutput);
        this.f8502c.L((ObjectOutput) dataOutput);
    }

    static z J(ObjectInput objectInput) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.f8298c;
        g gVar = g.f8425d;
        LocalDateTime localDateTimeR = LocalDateTime.R(g.U(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.Y(objectInput));
        ZoneOffset zoneOffsetU = ZoneOffset.U(objectInput);
        w wVar = (w) r.a(objectInput);
        Objects.requireNonNull(wVar, "zone");
        if ((wVar instanceof ZoneOffset) && !zoneOffsetU.equals(wVar)) {
            throw new IllegalArgumentException("ZoneId must match ZoneOffset");
        }
        return new z(localDateTimeR, wVar, zoneOffsetU);
    }
}
