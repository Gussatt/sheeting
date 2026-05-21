package j$.time.chrono;

import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1097d implements InterfaceC1095b, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    abstract InterfaceC1095b B(long j4);

    abstract InterfaceC1095b J(long j4);

    abstract InterfaceC1095b x(long j4);

    @Override // j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        return c(j4, uVar);
    }

    static InterfaceC1095b p(m mVar, j$.time.temporal.m mVar2) {
        InterfaceC1095b interfaceC1095b = (InterfaceC1095b) mVar2;
        if (mVar.equals(interfaceC1095b.f())) {
            return interfaceC1095b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.q() + ", actual: " + interfaceC1095b.f().q());
    }

    AbstractC1097d() {
    }

    @Override // j$.time.temporal.m
    public InterfaceC1095b l(long j4, j$.time.temporal.u uVar) {
        boolean z3 = uVar instanceof j$.time.temporal.b;
        if (!z3) {
            if (!z3) {
                return p(f(), uVar.o(this, j4));
            }
            throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
        switch (AbstractC1096c.f8327a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return x(j4);
            case 2:
                return x(Math.multiplyExact(j4, 7));
            case 3:
                return B(j4);
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return J(j4);
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return J(Math.multiplyExact(j4, 10));
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return J(Math.multiplyExact(j4, 100));
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return J(Math.multiplyExact(j4, 1000));
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return h(Math.addExact(e(aVar), j4), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1095b) && compareTo((InterfaceC1095b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public int hashCode() {
        long jT = t();
        return ((int) (jT ^ (jT >>> 32))) ^ f().hashCode();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public InterfaceC1095b i(j$.time.temporal.o oVar) {
        return p(f(), oVar.b(this));
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public String toString() {
        long jE = e(j$.time.temporal.a.YEAR_OF_ERA);
        long jE2 = e(j$.time.temporal.a.MONTH_OF_YEAR);
        long jE3 = e(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(f().toString());
        sb.append(" ");
        sb.append(s());
        sb.append(" ");
        sb.append(jE);
        sb.append(jE2 < 10 ? "-0" : "-");
        sb.append(jE2);
        sb.append(jE3 < 10 ? "-0" : "-");
        sb.append(jE3);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public InterfaceC1095b h(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.b.a("Unsupported field: ", qVar));
        }
        return p(f(), qVar.o(this, j4));
    }
}
