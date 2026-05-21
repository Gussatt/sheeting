package j$.time;

import j$.time.chrono.InterfaceC1095b;
import j$.time.chrono.InterfaceC1098e;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements j$.time.temporal.m, j$.time.temporal.o, InterfaceC1095b, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f8425d = U(-999999999, 1, 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f8426e = U(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final short f8428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f8429c;

    static {
        U(1970, 1, 1);
    }

    public static g V(int i4, l lVar, int i5) {
        j$.time.temporal.a.YEAR.P(i4);
        j$.time.temporal.a.DAY_OF_MONTH.P(i5);
        return x(i4, lVar.o(), i5);
    }

    public static g U(int i4, int i5, int i6) {
        j$.time.temporal.a.YEAR.P(i4);
        j$.time.temporal.a.MONTH_OF_YEAR.P(i5);
        j$.time.temporal.a.DAY_OF_MONTH.P(i6);
        return x(i4, i5, i6);
    }

    public static g W(long j4) {
        long j5;
        j$.time.temporal.a.EPOCH_DAY.P(j4);
        long j6 = 719468 + j4;
        if (j6 < 0) {
            long j7 = ((j4 + 719469) / 146097) - 1;
            j5 = j7 * 400;
            j6 += (-j7) * 146097;
        } else {
            j5 = 0;
        }
        long j8 = ((j6 * 400) + 591) / 146097;
        long j9 = j6 - ((j8 / 400) + (((j8 / 4) + (j8 * 365)) - (j8 / 100)));
        if (j9 < 0) {
            j8--;
            j9 = j6 - ((j8 / 400) + (((j8 / 4) + (365 * j8)) - (j8 / 100)));
        }
        int i4 = (int) j9;
        int i5 = ((i4 * 5) + 2) / 153;
        return new g(j$.time.temporal.a.YEAR.O(j8 + j5 + ((long) (i5 / 10))), ((i5 + 2) % 12) + 1, (i4 - (((i5 * 306) + 5) / 10)) + 1);
    }

    public static g B(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        g gVar = (g) nVar.a(j$.time.temporal.s.b());
        if (gVar != null) {
            return gVar;
        }
        throw new a("Unable to obtain LocalDate from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    private static g x(int i4, int i5, int i6) {
        int i7 = 28;
        if (i6 > 28) {
            if (i5 != 2) {
                i7 = (i5 == 4 || i5 == 6 || i5 == 9 || i5 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.t.f8358d.getClass();
                if (j$.time.chrono.t.x(i4)) {
                    i7 = 29;
                }
            }
            if (i6 > i7) {
                if (i6 == 29) {
                    throw new a("Invalid date 'February 29' as '" + i4 + "' is not a leap year");
                }
                throw new a("Invalid date '" + l.J(i5).name() + " " + i6 + "'");
            }
        }
        return new g(i4, i5, i6);
    }

    private static g b0(int i4, int i5, int i6) {
        if (i5 == 2) {
            j$.time.chrono.t.f8358d.getClass();
            i6 = Math.min(i6, j$.time.chrono.t.x((long) i4) ? 29 : 28);
        } else if (i5 == 4 || i5 == 6 || i5 == 9 || i5 == 11) {
            i6 = Math.min(i6, 30);
        }
        return new g(i4, i5, i6);
    }

    private g(int i4, int i5, int i6) {
        this.f8427a = i4;
        this.f8428b = (short) i5;
        this.f8429c = (short) i6;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.B(this);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        if (!aVar.J()) {
            throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
        }
        int i4 = f.f8374a[aVar.ordinal()];
        if (i4 == 1) {
            return j$.time.temporal.w.j(1L, T());
        }
        if (i4 == 2) {
            return j$.time.temporal.w.j(1L, S() ? 366 : 365);
        }
        if (i4 != 3) {
            return i4 != 4 ? ((j$.time.temporal.a) qVar).x() : this.f8427a <= 0 ? j$.time.temporal.w.j(1L, 1000000000L) : j$.time.temporal.w.j(1L, 999999999L);
        }
        return j$.time.temporal.w.j(1L, (l.J(this.f8428b) != l.FEBRUARY || S()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return J(qVar);
        }
        return super.g(qVar);
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            if (qVar == j$.time.temporal.a.EPOCH_DAY) {
                return t();
            }
            if (qVar != j$.time.temporal.a.PROLEPTIC_MONTH) {
                return J(qVar);
            }
            return ((((long) this.f8427a) * 12) + ((long) this.f8428b)) - 1;
        }
        return qVar.p(this);
    }

    private int J(j$.time.temporal.q qVar) {
        int i4;
        int i5 = f.f8374a[((j$.time.temporal.a) qVar).ordinal()];
        short s4 = this.f8429c;
        int i6 = this.f8427a;
        switch (i5) {
            case 1:
                return s4;
            case 2:
                return O();
            case 3:
                i4 = (s4 - 1) / 7;
                break;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return i6 >= 1 ? i6 : 1 - i6;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return L().o();
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                i4 = (s4 - 1) % 7;
                break;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((O() - 1) % 7) + 1;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                throw new j$.time.temporal.v("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((O() - 1) / 7) + 1;
            case 10:
                return this.f8428b;
            case 11:
                throw new j$.time.temporal.v("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i6;
            case 13:
                return i6 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
        }
        return i4 + 1;
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final j$.time.chrono.m f() {
        return j$.time.chrono.t.f8358d;
    }

    public final int Q() {
        return this.f8427a;
    }

    public final int P() {
        return this.f8428b;
    }

    public final int O() {
        return (l.J(this.f8428b).p(S()) + this.f8429c) - 1;
    }

    public final c L() {
        return c.p(((int) Math.floorMod(t() + 3, 7)) + 1);
    }

    public final boolean S() {
        j$.time.chrono.t tVar = j$.time.chrono.t.f8358d;
        long j4 = this.f8427a;
        tVar.getClass();
        return j$.time.chrono.t.x(j4);
    }

    public final int T() {
        short s4 = this.f8428b;
        return s4 != 2 ? (s4 == 4 || s4 == 6 || s4 == 9 || s4 == 11) ? 30 : 31 : S() ? 29 : 28;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final g i(j$.time.temporal.o oVar) {
        if (oVar instanceof g) {
            return (g) oVar;
        }
        return (g) oVar.b(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final g h(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (g) qVar.o(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.P(j4);
        int i4 = f.f8374a[aVar.ordinal()];
        short s4 = this.f8429c;
        short s5 = this.f8428b;
        int i5 = this.f8427a;
        switch (i4) {
            case 1:
                int i6 = (int) j4;
                if (s4 != i6) {
                    return U(i5, s5, i6);
                }
                return this;
            case 2:
                return e0((int) j4);
            case 3:
                return Y(Math.multiplyExact(j4 - e(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH), 7));
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                if (i5 < 1) {
                    j4 = 1 - j4;
                }
                return f0((int) j4);
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return Y(j4 - ((long) L().o()));
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return Y(j4 - e(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return Y(j4 - e(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return W(j4);
            case 9:
                return Y(Math.multiplyExact(j4 - e(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR), 7));
            case 10:
                int i7 = (int) j4;
                if (s5 != i7) {
                    j$.time.temporal.a.MONTH_OF_YEAR.P(i7);
                    return b0(i5, i7, s4);
                }
                return this;
            case 11:
                return Z(j4 - (((((long) i5) * 12) + ((long) s5)) - 1));
            case 12:
                return f0((int) j4);
            case 13:
                if (e(j$.time.temporal.a.ERA) != j4) {
                    return f0(1 - i5);
                }
                return this;
            default:
                throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
        }
    }

    public final g f0(int i4) {
        if (this.f8427a == i4) {
            return this;
        }
        j$.time.temporal.a.YEAR.P(i4);
        return b0(i4, this.f8428b, this.f8429c);
    }

    public final g e0(int i4) {
        if (O() == i4) {
            return this;
        }
        j$.time.temporal.a aVar = j$.time.temporal.a.YEAR;
        int i5 = this.f8427a;
        long j4 = i5;
        aVar.P(j4);
        j$.time.temporal.a.DAY_OF_YEAR.P(i4);
        j$.time.chrono.t.f8358d.getClass();
        boolean zX = j$.time.chrono.t.x(j4);
        if (i4 == 366 && !zX) {
            throw new a("Invalid date 'DayOfYear 366' as '" + i5 + "' is not a leap year");
        }
        l lVarJ = l.J(((i4 - 1) / 31) + 1);
        if (i4 > (lVarJ.x(zX) + lVarJ.p(zX)) - 1) {
            lVarJ = lVarJ.L();
        }
        return new g(i5, lVarJ.o(), (i4 - lVarJ.p(zX)) + 1);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public final g l(long j4, j$.time.temporal.u uVar) {
        if (!(uVar instanceof j$.time.temporal.b)) {
            return (g) uVar.o(this, j4);
        }
        switch (f.f8375b[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return Y(j4);
            case 2:
                return Y(Math.multiplyExact(j4, 7));
            case 3:
                return Z(j4);
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return a0(j4);
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return a0(Math.multiplyExact(j4, 10));
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return a0(Math.multiplyExact(j4, 100));
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return a0(Math.multiplyExact(j4, 1000));
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return h(Math.addExact(e(aVar), j4), aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public final g a0(long j4) {
        return j4 == 0 ? this : b0(j$.time.temporal.a.YEAR.O(((long) this.f8427a) + j4), this.f8428b, this.f8429c);
    }

    public final g Z(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j5 = (((long) this.f8427a) * 12) + ((long) (this.f8428b - 1)) + j4;
        long j6 = 12;
        return b0(j$.time.temporal.a.YEAR.O(Math.floorDiv(j5, j6)), ((int) Math.floorMod(j5, j6)) + 1, this.f8429c);
    }

    public final g Y(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j5 = ((long) this.f8429c) + j4;
        if (j5 > 0) {
            short s4 = this.f8428b;
            int i4 = this.f8427a;
            if (j5 <= 28) {
                return new g(i4, s4, (int) j5);
            }
            if (j5 <= 59) {
                long jT = T();
                if (j5 <= jT) {
                    return new g(i4, s4, (int) j5);
                }
                if (s4 < 12) {
                    return new g(i4, s4 + 1, (int) (j5 - jT));
                }
                int i5 = i4 + 1;
                j$.time.temporal.a.YEAR.P(i5);
                return new g(i5, 1, (int) (j5 - jT));
            }
        }
        return W(Math.addExact(t(), j4));
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j4, uVar);
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.s.b() ? this : super.a(tVar);
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final InterfaceC1098e E(j jVar) {
        return LocalDateTime.R(this, jVar);
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final long t() {
        long j4 = this.f8427a;
        long j5 = this.f8428b;
        long j6 = 365 * j4;
        long j7 = (((367 * j5) - 362) / 12) + (j4 >= 0 ? ((j4 + 399) / 400) + (((3 + j4) / 4) - ((99 + j4) / 100)) + j6 : j6 - ((j4 / (-400)) + ((j4 / (-4)) - (j4 / (-100))))) + ((long) (this.f8429c - 1));
        if (j5 > 2) {
            j7 = !S() ? j7 - 2 : j7 - 1;
        }
        return j7 - 719528;
    }

    @Override // j$.time.chrono.InterfaceC1095b, java.lang.Comparable
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC1095b interfaceC1095b) {
        if (interfaceC1095b instanceof g) {
            return p((g) interfaceC1095b);
        }
        return super.compareTo(interfaceC1095b);
    }

    final int p(g gVar) {
        int i4 = this.f8427a - gVar.f8427a;
        if (i4 != 0) {
            return i4;
        }
        int i5 = this.f8428b - gVar.f8428b;
        return i5 == 0 ? this.f8429c - gVar.f8429c : i5;
    }

    public final boolean R(g gVar) {
        return gVar != null ? p(gVar) < 0 : t() < gVar.t();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && p((g) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final int hashCode() {
        int i4 = this.f8427a;
        return (((i4 << 11) + (this.f8428b << 6)) + this.f8429c) ^ (i4 & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final String toString() {
        int i4 = this.f8427a;
        int iAbs = Math.abs(i4);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i4 > 9999) {
                sb.append('+');
            }
            sb.append(i4);
        } else if (i4 < 0) {
            sb.append(i4 - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i4 + 10000);
            sb.deleteCharAt(0);
        }
        short s4 = this.f8428b;
        sb.append(s4 < 10 ? "-0" : "-");
        sb.append((int) s4);
        short s5 = this.f8429c;
        sb.append(s5 < 10 ? "-0" : "-");
        sb.append((int) s5);
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void g0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f8427a);
        dataOutput.writeByte(this.f8428b);
        dataOutput.writeByte(this.f8429c);
    }
}
