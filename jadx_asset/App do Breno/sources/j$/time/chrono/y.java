package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class y extends AbstractC1097d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final j$.time.g f8363d = j$.time.g.U(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.g f8364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient z f8365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient int f8366c;

    y(j$.time.g gVar) {
        if (gVar.R(f8363d)) {
            throw new j$.time.a("JapaneseDate before Meiji 6 is not supported");
        }
        z zVarP = z.p(gVar);
        this.f8365b = zVarP;
        this.f8366c = (gVar.Q() - zVarP.r().Q()) + 1;
        this.f8364a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final m f() {
        return w.f8361d;
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b
    public final int hashCode() {
        w.f8361d.getClass();
        return this.f8364a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final n s() {
        return this.f8365b;
    }

    @Override // j$.time.chrono.InterfaceC1095b, j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH || qVar == j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH || qVar == j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).J();
        }
        return qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.B(this);
        }
        if (!d(qVar)) {
            throw new j$.time.temporal.v(j$.time.b.a("Unsupported field: ", qVar));
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        int i4 = x.f8362a[aVar.ordinal()];
        j$.time.g gVar = this.f8364a;
        if (i4 == 1) {
            return j$.time.temporal.w.j(1L, gVar.T());
        }
        z zVar = this.f8365b;
        if (i4 != 2) {
            if (i4 != 3) {
                return w.f8361d.x(aVar);
            }
            int iQ = zVar.r().Q();
            return zVar.u() != null ? j$.time.temporal.w.j(1L, (r0.r().Q() - iQ) + 1) : j$.time.temporal.w.j(1L, 999999999 - iQ);
        }
        z zVarU = zVar.u();
        int iO = (zVarU == null || zVarU.r().Q() != gVar.Q()) ? gVar.S() ? 366 : 365 : zVarU.r().O() - 1;
        if (this.f8366c == 1) {
            iO -= zVar.r().O() - 1;
        }
        return j$.time.temporal.w.j(1L, iO);
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.p(this);
        }
        int i4 = x.f8362a[((j$.time.temporal.a) qVar).ordinal()];
        int i5 = this.f8366c;
        z zVar = this.f8365b;
        j$.time.g gVar = this.f8364a;
        switch (i4) {
            case 2:
                return i5 == 1 ? (gVar.O() - zVar.r().O()) + 1 : gVar.O();
            case 3:
                return i5;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
            case O.h.STRING_FIELD_NUMBER /* 5 */:
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                throw new j$.time.temporal.v(j$.time.b.a("Unsupported field: ", qVar));
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return zVar.o();
            default:
                return gVar.e(qVar);
        }
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.temporal.m
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final y h(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            if (e(aVar) == j4) {
                return this;
            }
            int[] iArr = x.f8362a;
            int i4 = iArr[aVar.ordinal()];
            j$.time.g gVar = this.f8364a;
            if (i4 == 3 || i4 == 8 || i4 == 9) {
                int iA = w.f8361d.x(aVar).a(j4, aVar);
                int i5 = iArr[aVar.ordinal()];
                if (i5 == 3) {
                    return Q(this.f8365b, iA);
                }
                if (i5 == 8) {
                    return Q(z.x(iA), this.f8366c);
                }
                if (i5 == 9) {
                    return P(gVar.f0(iA));
                }
            }
            return P(gVar.h(j4, qVar));
        }
        return (y) super.h(j4, qVar);
    }

    @Override // j$.time.chrono.AbstractC1097d
    /* JADX INFO: renamed from: L */
    public final InterfaceC1095b i(j$.time.temporal.o oVar) {
        return (y) super.i(oVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.temporal.m
    public final j$.time.temporal.m i(j$.time.g gVar) {
        return (y) super.i(gVar);
    }

    private y Q(z zVar, int i4) {
        w.f8361d.getClass();
        if (zVar == null) {
            throw new ClassCastException("Era must be JapaneseEra");
        }
        int iQ = (zVar.r().Q() + i4) - 1;
        if (i4 != 1 && (iQ < -999999999 || iQ > 999999999 || iQ < zVar.r().Q() || zVar != z.p(j$.time.g.U(iQ, 1, 1)))) {
            throw new j$.time.a("Invalid yearOfEra value");
        }
        return P(this.f8364a.f0(iQ));
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final InterfaceC1098e E(j$.time.j jVar) {
        return C1100g.x(this, jVar);
    }

    @Override // j$.time.chrono.AbstractC1097d
    final InterfaceC1095b J(long j4) {
        return P(this.f8364a.a0(j4));
    }

    @Override // j$.time.chrono.AbstractC1097d
    final InterfaceC1095b B(long j4) {
        return P(this.f8364a.Z(j4));
    }

    @Override // j$.time.chrono.AbstractC1097d
    final InterfaceC1095b x(long j4) {
        return P(this.f8364a.Y(j4));
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public final InterfaceC1095b l(long j4, j$.time.temporal.u uVar) {
        return (y) super.l(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j4, j$.time.temporal.u uVar) {
        return (y) super.l(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public final InterfaceC1095b c(long j4, j$.time.temporal.u uVar) {
        return (y) super.c(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        return (y) super.c(j4, uVar);
    }

    private y P(j$.time.g gVar) {
        return gVar.equals(this.f8364a) ? this : new y(gVar);
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final long t() {
        return this.f8364a.t();
    }

    @Override // j$.time.chrono.AbstractC1097d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.f8364a.equals(((y) obj).f8364a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 4, this);
    }
}
