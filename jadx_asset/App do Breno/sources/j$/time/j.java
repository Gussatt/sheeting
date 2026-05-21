package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f8433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f8434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final j f8435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final j[] f8436h = new j[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f8437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f8438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte f8439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8440d;

    static {
        int i4 = 0;
        while (true) {
            j[] jVarArr = f8436h;
            if (i4 < jVarArr.length) {
                jVarArr[i4] = new j(i4, 0, 0, 0);
                i4++;
            } else {
                j jVar = jVarArr[0];
                f8435g = jVar;
                j jVar2 = jVarArr[12];
                f8433e = jVar;
                f8434f = new j(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static j Q(int i4) {
        j$.time.temporal.a.HOUR_OF_DAY.P(i4);
        return f8436h[i4];
    }

    public static j S(long j4) {
        j$.time.temporal.a.SECOND_OF_DAY.P(j4);
        int i4 = (int) (j4 / 3600);
        long j5 = j4 - ((long) (i4 * 3600));
        int i5 = (int) (j5 / 60);
        return x(i4, i5, (int) (j5 - ((long) (i5 * 60))), 0);
    }

    public static j R(long j4) {
        j$.time.temporal.a.NANO_OF_DAY.P(j4);
        int i4 = (int) (j4 / 3600000000000L);
        long j5 = j4 - (((long) i4) * 3600000000000L);
        int i5 = (int) (j5 / 60000000000L);
        long j6 = j5 - (((long) i5) * 60000000000L);
        int i6 = (int) (j6 / 1000000000);
        return x(i4, i5, i6, (int) (j6 - (((long) i6) * 1000000000)));
    }

    public static j B(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        j jVar = (j) nVar.a(j$.time.temporal.s.c());
        if (jVar != null) {
            return jVar;
        }
        throw new a("Unable to obtain LocalTime from TemporalAccessor: " + nVar + " of type " + nVar.getClass().getName());
    }

    private static j x(int i4, int i5, int i6, int i7) {
        if ((i5 | i6 | i7) == 0) {
            return f8436h[i4];
        }
        return new j(i4, i5, i6, i7);
    }

    private j(int i4, int i5, int i6, int i7) {
        this.f8437a = (byte) i4;
        this.f8438b = (byte) i5;
        this.f8439c = (byte) i6;
        this.f8440d = i7;
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).Q();
        }
        return qVar != null && qVar.L(this);
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
            if (qVar == j$.time.temporal.a.NANO_OF_DAY) {
                return Z();
            }
            if (qVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return Z() / 1000;
            }
            return J(qVar);
        }
        return qVar.p(this);
    }

    private int J(j$.time.temporal.q qVar) {
        int i4 = i.f8431a[((j$.time.temporal.a) qVar).ordinal()];
        byte b4 = this.f8438b;
        int i5 = this.f8440d;
        byte b5 = this.f8437a;
        switch (i4) {
            case 1:
                return i5;
            case 2:
                throw new j$.time.temporal.v("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i5 / 1000;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                throw new j$.time.temporal.v("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return i5 / 1000000;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return (int) (Z() / 1000000);
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return this.f8439c;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return a0();
            case 9:
                return b4;
            case 10:
                return (b5 * 60) + b4;
            case 11:
                return b5 % 12;
            case 12:
                int i6 = b5 % 12;
                if (i6 % 12 == 0) {
                    return 12;
                }
                return i6;
            case 14:
                if (b5 == 0) {
                    return 24;
                }
            case 13:
                return b5;
            case 15:
                return b5 / 12;
            default:
                throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
        }
    }

    public final int L() {
        return this.f8437a;
    }

    public final int P() {
        return this.f8439c;
    }

    public final int O() {
        return this.f8440d;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(g gVar) {
        return (j) gVar.b(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final j h(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (j) qVar.o(this, j4);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        aVar.P(j4);
        int i4 = i.f8431a[aVar.ordinal()];
        byte b4 = this.f8438b;
        byte b5 = this.f8439c;
        int i5 = this.f8440d;
        byte b6 = this.f8437a;
        switch (i4) {
            case 1:
                return c0((int) j4);
            case 2:
                return R(j4);
            case 3:
                return c0(((int) j4) * 1000);
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return R(j4 * 1000);
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return c0(((int) j4) * 1000000);
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return R(j4 * 1000000);
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                int i6 = (int) j4;
                if (b5 != i6) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.P(i6);
                    return x(b6, b4, i6, i5);
                }
                return this;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return X(j4 - ((long) a0()));
            case 9:
                int i7 = (int) j4;
                if (b4 != i7) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.P(i7);
                    return x(b6, i7, b5, i5);
                }
                return this;
            case 10:
                return V(j4 - ((long) ((b6 * 60) + b4)));
            case 11:
                return U(j4 - ((long) (b6 % 12)));
            case 12:
                if (j4 == 12) {
                    j4 = 0;
                }
                return U(j4 - ((long) (b6 % 12)));
            case 13:
                int i8 = (int) j4;
                if (b6 != i8) {
                    j$.time.temporal.a.HOUR_OF_DAY.P(i8);
                    return x(i8, b4, b5, i5);
                }
                return this;
            case 14:
                if (j4 == 24) {
                    j4 = 0;
                }
                int i9 = (int) j4;
                if (b6 != i9) {
                    j$.time.temporal.a.HOUR_OF_DAY.P(i9);
                    return x(i9, b4, b5, i5);
                }
                return this;
            case 15:
                return U((j4 - ((long) (b6 / 12))) * 12);
            default:
                throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
        }
    }

    public final j c0(int i4) {
        if (this.f8440d == i4) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.P(i4);
        return x(this.f8437a, this.f8438b, this.f8439c, i4);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final j l(long j4, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (i.f8432b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return W(j4);
                case 2:
                    return W((j4 % 86400000000L) * 1000);
                case 3:
                    return W((j4 % 86400000) * 1000000);
                case O.h.LONG_FIELD_NUMBER /* 4 */:
                    return X(j4);
                case O.h.STRING_FIELD_NUMBER /* 5 */:
                    return V(j4);
                case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                    return U(j4);
                case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                    return U((j4 % 2) * 12);
                default:
                    throw new j$.time.temporal.v("Unsupported unit: " + uVar);
            }
        }
        return (j) uVar.o(this, j4);
    }

    public final j U(long j4) {
        if (j4 == 0) {
            return this;
        }
        return x(((((int) (j4 % 24)) + this.f8437a) + 24) % 24, this.f8438b, this.f8439c, this.f8440d);
    }

    public final j V(long j4) {
        if (j4 != 0) {
            int i4 = (this.f8437a * 60) + this.f8438b;
            int i5 = ((((int) (j4 % 1440)) + i4) + 1440) % 1440;
            if (i4 != i5) {
                return x(i5 / 60, i5 % 60, this.f8439c, this.f8440d);
            }
        }
        return this;
    }

    public final j X(long j4) {
        if (j4 != 0) {
            int i4 = (this.f8438b * 60) + (this.f8437a * 3600) + this.f8439c;
            int i5 = ((((int) (j4 % 86400)) + i4) + 86400) % 86400;
            if (i4 != i5) {
                return x(i5 / 3600, (i5 / 60) % 60, i5 % 60, this.f8440d);
            }
        }
        return this;
    }

    public final j W(long j4) {
        if (j4 != 0) {
            long jZ = Z();
            long j5 = (((j4 % 86400000000000L) + jZ) + 86400000000000L) % 86400000000000L;
            if (jZ != j5) {
                return x((int) (j5 / 3600000000000L), (int) ((j5 / 60000000000L) % 60), (int) ((j5 / 1000000000) % 60), (int) (j5 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        return j4 == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j4, uVar);
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a() || tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.c()) {
            return this;
        }
        if (tVar == j$.time.temporal.s.b()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(Z(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int a0() {
        return (this.f8438b * 60) + (this.f8437a * 3600) + this.f8439c;
    }

    public final long Z() {
        return (((long) this.f8439c) * 1000000000) + (((long) this.f8438b) * 60000000000L) + (((long) this.f8437a) * 3600000000000L) + ((long) this.f8440d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final int compareTo(j jVar) {
        int iCompare = Integer.compare(this.f8437a, jVar.f8437a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f8438b, jVar.f8438b)) == 0 && (iCompare = Integer.compare(this.f8439c, jVar.f8439c)) == 0) ? Integer.compare(this.f8440d, jVar.f8440d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.f8437a == jVar.f8437a && this.f8438b == jVar.f8438b && this.f8439c == jVar.f8439c && this.f8440d == jVar.f8440d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jZ = Z();
        return (int) (jZ ^ (jZ >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b4 = this.f8437a;
        sb.append(b4 < 10 ? "0" : "");
        sb.append((int) b4);
        byte b5 = this.f8438b;
        sb.append(b5 < 10 ? ":0" : ":");
        sb.append((int) b5);
        byte b6 = this.f8439c;
        int i4 = this.f8440d;
        if (b6 > 0 || i4 > 0) {
            sb.append(b6 < 10 ? ":0" : ":");
            sb.append((int) b6);
            if (i4 > 0) {
                sb.append('.');
                if (i4 % 1000000 == 0) {
                    sb.append(Integer.toString((i4 / 1000000) + 1000).substring(1));
                } else if (i4 % 1000 == 0) {
                    sb.append(Integer.toString((i4 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i4 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void d0(DataOutput dataOutput) {
        byte b4 = this.f8439c;
        byte b5 = this.f8437a;
        byte b6 = this.f8438b;
        int i4 = this.f8440d;
        if (i4 != 0) {
            dataOutput.writeByte(b5);
            dataOutput.writeByte(b6);
            dataOutput.writeByte(b4);
            dataOutput.writeInt(i4);
            return;
        }
        if (b4 != 0) {
            dataOutput.writeByte(b5);
            dataOutput.writeByte(b6);
            dataOutput.writeByte(~b4);
        } else if (b6 == 0) {
            dataOutput.writeByte(~b5);
        } else {
            dataOutput.writeByte(b5);
            dataOutput.writeByte(~b6);
        }
    }

    static j Y(ObjectInput objectInput) throws IOException {
        int i4;
        int i5;
        int i6 = objectInput.readByte();
        int i7 = 0;
        if (i6 < 0) {
            i6 = ~i6;
            i5 = 0;
            i4 = 0;
        } else {
            byte b4 = objectInput.readByte();
            if (b4 < 0) {
                int i8 = ~b4;
                i4 = 0;
                i7 = i8;
                i5 = 0;
            } else {
                byte b5 = objectInput.readByte();
                if (b5 < 0) {
                    i5 = ~b5;
                    i4 = 0;
                    i7 = b4;
                } else {
                    i4 = objectInput.readInt();
                    i7 = b4;
                    i5 = b5;
                }
            }
        }
        j$.time.temporal.a.HOUR_OF_DAY.P(i6);
        j$.time.temporal.a.MINUTE_OF_HOUR.P(i7);
        j$.time.temporal.a.SECOND_OF_MINUTE.P(i5);
        j$.time.temporal.a.NANO_OF_SECOND.P(i4);
        return x(i6, i7, i5, i4);
    }
}
