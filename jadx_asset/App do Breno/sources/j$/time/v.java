package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class v implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {
    private static final long serialVersionUID = 4183400860270640070L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8495b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        v vVar = (v) obj;
        int i4 = this.f8494a - vVar.f8494a;
        return i4 == 0 ? this.f8495b - vVar.f8495b : i4;
    }

    static {
        j$.time.format.n nVar = new j$.time.format.n();
        nVar.l(j$.time.temporal.a.YEAR, 4, 10, j$.time.format.u.EXCEEDS_PAD);
        nVar.e('-');
        nVar.k(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        nVar.v();
    }

    private v(int i4, int i5) {
        this.f8494a = i4;
        this.f8495b = i5;
    }

    private v O(int i4, int i5) {
        return (this.f8494a == i4 && this.f8495b == i5) ? this : new v(i4, i5);
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.YEAR || qVar == j$.time.temporal.a.MONTH_OF_YEAR || qVar == j$.time.temporal.a.PROLEPTIC_MONTH || qVar == j$.time.temporal.a.YEAR_OF_ERA || qVar == j$.time.temporal.a.ERA : qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.YEAR_OF_ERA) {
            return j$.time.temporal.w.j(1L, this.f8494a <= 0 ? 1000000000L : 999999999L);
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
        int i4 = u.f8492a[((j$.time.temporal.a) qVar).ordinal()];
        if (i4 == 1) {
            return this.f8495b;
        }
        if (i4 == 2) {
            return p();
        }
        int i5 = this.f8494a;
        if (i4 == 3) {
            if (i5 < 1) {
                i5 = 1 - i5;
            }
            return i5;
        }
        if (i4 == 4) {
            return i5;
        }
        if (i4 == 5) {
            return i5 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
    }

    private long p() {
        return ((((long) this.f8494a) * 12) + ((long) this.f8495b)) - 1;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(g gVar) {
        return (v) gVar.b(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final v h(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (v) qVar.o(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.P(j4);
        int i4 = u.f8492a[aVar.ordinal()];
        int i5 = this.f8494a;
        if (i4 == 1) {
            int i6 = (int) j4;
            j$.time.temporal.a.MONTH_OF_YEAR.P(i6);
            return O(i5, i6);
        }
        if (i4 == 2) {
            return B(j4 - p());
        }
        int i7 = this.f8495b;
        if (i4 == 3) {
            if (i5 < 1) {
                j4 = 1 - j4;
            }
            int i8 = (int) j4;
            j$.time.temporal.a.YEAR.P(i8);
            return O(i8, i7);
        }
        if (i4 == 4) {
            int i9 = (int) j4;
            j$.time.temporal.a.YEAR.P(i9);
            return O(i9, i7);
        }
        if (i4 != 5) {
            throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
        }
        if (e(j$.time.temporal.a.ERA) == j4) {
            return this;
        }
        int i10 = 1 - i5;
        j$.time.temporal.a.YEAR.P(i10);
        return O(i10, i7);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public final v l(long j4, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (v) uVar.o(this, j4);
        }
        switch (u.f8493b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return B(j4);
            case 2:
                return J(j4);
            case 3:
                return J(Math.multiplyExact(j4, 10));
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return J(Math.multiplyExact(j4, 100));
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return J(Math.multiplyExact(j4, 1000));
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return h(Math.addExact(e(aVar), j4), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final v J(long j4) {
        return j4 == 0 ? this : O(j$.time.temporal.a.YEAR.O(((long) this.f8494a) + j4), this.f8495b);
    }

    public final v B(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j5 = (((long) this.f8494a) * 12) + ((long) (this.f8495b - 1)) + j4;
        long j6 = 12;
        return O(j$.time.temporal.a.YEAR.O(Math.floorDiv(j5, j6)), ((int) Math.floorMod(j5, j6)) + 1);
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
            return j$.time.temporal.b.MONTHS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.z(mVar).equals(j$.time.chrono.t.f8358d)) {
            throw new a("Adjustment only supported on ISO date-time");
        }
        return mVar.h(p(), j$.time.temporal.a.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            if (this.f8494a == vVar.f8494a && this.f8495b == vVar.f8495b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8495b << 27) ^ this.f8494a;
    }

    public final String toString() {
        int i4 = this.f8494a;
        int iAbs = Math.abs(i4);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i4);
        } else if (i4 < 0) {
            sb.append(i4 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i4 + 10000);
            sb.deleteCharAt(0);
        }
        int i5 = this.f8495b;
        sb.append(i5 < 10 ? "-0" : "-");
        sb.append(i5);
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void Q(DataOutput dataOutput) {
        dataOutput.writeInt(this.f8494a);
        dataOutput.writeByte(this.f8495b);
    }

    static v L(ObjectInput objectInput) throws IOException {
        int i4 = objectInput.readInt();
        byte b4 = objectInput.readByte();
        j$.time.temporal.a.YEAR.P(i4);
        j$.time.temporal.a.MONTH_OF_YEAR.P(b4);
        return new v(i4, b4);
    }
}
