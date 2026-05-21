package j$.time.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC1097d {
    private static final long serialVersionUID = -5207853542612002020L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient p f8353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient int f8354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient int f8355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f8356d;

    static r P(p pVar, int i4, int i5, int i6) {
        return new r(pVar, i4, i5, i6);
    }

    static r Q(p pVar, long j4) {
        return new r(pVar, j4);
    }

    private r(p pVar, int i4, int i5, int i6) {
        pVar.O(i4, i5, i6);
        this.f8353a = pVar;
        this.f8354b = i4;
        this.f8355c = i5;
        this.f8356d = i6;
    }

    private r(p pVar, long j4) {
        int[] iArrP = pVar.P((int) j4);
        this.f8353a = pVar;
        this.f8354b = iArrP[0];
        this.f8355c = iArrP[1];
        this.f8356d = iArrP[2];
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final m f() {
        return this.f8353a;
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final n s() {
        return s.AH;
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
        int i4 = q.f8352a[aVar.ordinal()];
        int i5 = this.f8354b;
        return i4 != 1 ? i4 != 2 ? i4 != 3 ? this.f8353a.T(aVar) : j$.time.temporal.w.j(1L, 5L) : j$.time.temporal.w.j(1L, r3.R(i5)) : j$.time.temporal.w.j(1L, r3.Q(i5, this.f8355c));
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return qVar.p(this);
        }
        int i4 = q.f8352a[((j$.time.temporal.a) qVar).ordinal()];
        int i5 = this.f8355c;
        int i6 = this.f8356d;
        int i7 = this.f8354b;
        switch (i4) {
            case 1:
                return i6;
            case 2:
                return O();
            case 3:
                return ((i6 - 1) / 7) + 1;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return ((int) Math.floorMod(t() + 3, 7)) + 1;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return ((i6 - 1) % 7) + 1;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return ((O() - 1) % 7) + 1;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return t();
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return ((O() - 1) / 7) + 1;
            case 9:
                return i5;
            case 10:
                return ((((long) i7) * 12) + ((long) i5)) - 1;
            case 11:
                return i7;
            case 12:
                return i7;
            case 13:
                return i7 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.v(j$.time.b.a("Unsupported field: ", qVar));
        }
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.temporal.m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final r h(long j4, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (r) super.h(j4, qVar);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
        p pVar = this.f8353a;
        pVar.T(aVar).b(j4, aVar);
        int i4 = (int) j4;
        int i5 = q.f8352a[aVar.ordinal()];
        int i6 = this.f8356d;
        int i7 = this.f8355c;
        int i8 = this.f8354b;
        switch (i5) {
            case 1:
                return T(i8, i7, i4);
            case 2:
                return x(Math.min(i4, pVar.R(i8)) - O());
            case 3:
                return x((j4 - e(j$.time.temporal.a.ALIGNED_WEEK_OF_MONTH)) * 7);
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return x(j4 - ((long) (((int) Math.floorMod(t() + 3, 7)) + 1)));
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return x(j4 - e(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return x(j4 - e(j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return new r(pVar, j4);
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return x((j4 - e(j$.time.temporal.a.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return T(i8, i4, i6);
            case 10:
                return B(j4 - (((((long) i8) * 12) + ((long) i7)) - 1));
            case 11:
                if (i8 < 1) {
                    i4 = 1 - i4;
                }
                return T(i4, i7, i6);
            case 12:
                return T(i4, i7, i6);
            case 13:
                return T(1 - i8, i7, i6);
            default:
                throw new j$.time.temporal.v(j$.time.b.a("Unsupported field: ", qVar));
        }
    }

    private r T(int i4, int i5, int i6) {
        p pVar = this.f8353a;
        int iQ = pVar.Q(i4, i5);
        if (i6 > iQ) {
            i6 = iQ;
        }
        return new r(pVar, i4, i5, i6);
    }

    @Override // j$.time.chrono.AbstractC1097d
    /* JADX INFO: renamed from: L */
    public final InterfaceC1095b i(j$.time.temporal.o oVar) {
        return (r) super.i(oVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.temporal.m
    public final j$.time.temporal.m i(j$.time.g gVar) {
        return (r) super.i(gVar);
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final long t() {
        return this.f8353a.O(this.f8354b, this.f8355c, this.f8356d);
    }

    private int O() {
        return this.f8353a.L(this.f8354b, this.f8355c) + this.f8356d;
    }

    @Override // j$.time.chrono.AbstractC1097d
    final InterfaceC1095b J(long j4) {
        return j4 == 0 ? this : T(Math.addExact(this.f8354b, (int) j4), this.f8355c, this.f8356d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC1097d
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final r B(long j4) {
        if (j4 == 0) {
            return this;
        }
        long j5 = (((long) this.f8354b) * 12) + ((long) (this.f8355c - 1)) + j4;
        return T(this.f8353a.B(Math.floorDiv(j5, 12L)), ((int) Math.floorMod(j5, 12L)) + 1, this.f8356d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // j$.time.chrono.AbstractC1097d
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final r x(long j4) {
        return new r(this.f8353a, t() + j4);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public final InterfaceC1095b l(long j4, j$.time.temporal.u uVar) {
        return (r) super.l(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j4, j$.time.temporal.u uVar) {
        return (r) super.l(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public final InterfaceC1095b c(long j4, j$.time.temporal.u uVar) {
        return (r) super.c(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        return (r) super.c(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (this.f8354b == rVar.f8354b && this.f8355c == rVar.f8355c && this.f8356d == rVar.f8356d && this.f8353a.equals(rVar.f8353a)) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b
    public final int hashCode() {
        this.f8353a.getClass();
        int i4 = this.f8354b;
        return (((i4 << 11) + (this.f8355c << 6)) + this.f8356d) ^ ((i4 & (-2048)) ^ 2100100019);
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final InterfaceC1098e E(j$.time.j jVar) {
        return C1100g.x(this, jVar);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 6, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f8353a);
        objectOutput.writeInt(g(j$.time.temporal.a.YEAR));
        objectOutput.writeByte(g(j$.time.temporal.a.MONTH_OF_YEAR));
        objectOutput.writeByte(g(j$.time.temporal.a.DAY_OF_MONTH));
    }
}
