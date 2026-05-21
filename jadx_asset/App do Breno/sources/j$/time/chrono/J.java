package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class J extends AbstractC1097d {
    private static final long serialVersionUID = -8722293800195731463L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient j$.time.g f8322a;

    J(j$.time.g gVar) {
        Objects.requireNonNull(gVar, "isoDate");
        this.f8322a = gVar;
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final m f() {
        return H.f8320d;
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b
    public final int hashCode() {
        H.f8320d.getClass();
        return this.f8322a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final n s() {
        return O() >= 1 ? K.BE : K.BEFORE_BE;
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
        int i4 = I.f8321a[aVar.ordinal()];
        if (i4 == 1 || i4 == 2 || i4 == 3) {
            return this.f8322a.k(qVar);
        }
        if (i4 != 4) {
            return H.f8320d.x(aVar);
        }
        j$.time.temporal.w wVarX = j$.time.temporal.a.YEAR.x();
        return j$.time.temporal.w.j(1L, O() <= 0 ? (-(wVarX.e() + 543)) + 1 : 543 + wVarX.d());
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            int i4 = I.f8321a[((j$.time.temporal.a) qVar).ordinal()];
            if (i4 == 4) {
                int iO = O();
                if (iO < 1) {
                    iO = 1 - iO;
                }
                return iO;
            }
            j$.time.g gVar = this.f8322a;
            if (i4 == 5) {
                return ((((long) O()) * 12) + ((long) gVar.P())) - 1;
            }
            if (i4 == 6) {
                return O();
            }
            if (i4 != 7) {
                return gVar.e(qVar);
            }
            return O() < 1 ? 0 : 1;
        }
        return qVar.p(this);
    }

    private int O() {
        return this.f8322a.Q() + 543;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    @Override // j$.time.chrono.AbstractC1097d, j$.time.temporal.m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.chrono.J h(long r9, j$.time.temporal.q r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.a
            if (r0 == 0) goto L99
            r0 = r11
            j$.time.temporal.a r0 = (j$.time.temporal.a) r0
            long r1 = r8.e(r0)
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.I.f8321a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.g r3 = r8.f8322a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4b
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4b
            if (r2 == r4) goto L4b
            goto L61
        L27:
            j$.time.chrono.H r11 = j$.time.chrono.H.f8320d
            j$.time.temporal.w r11 = r11.x(r0)
            r11.b(r9, r0)
            int r11 = r8.O()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            int r11 = r3.P()
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.g r9 = r3.Z(r9)
            j$.time.chrono.J r9 = r8.Q(r9)
            return r9
        L4b:
            j$.time.chrono.H r2 = j$.time.chrono.H.f8320d
            j$.time.temporal.w r2 = r2.x(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L84
            if (r0 == r5) goto L79
            if (r0 == r4) goto L6a
        L61:
            j$.time.g r9 = r3.h(r9, r11)
            j$.time.chrono.J r9 = r8.Q(r9)
            return r9
        L6a:
            int r9 = r8.O()
            int r9 = (-542) - r9
            j$.time.g r9 = r3.f0(r9)
            j$.time.chrono.J r9 = r8.Q(r9)
            return r9
        L79:
            int r2 = r2 + (-543)
            j$.time.g r9 = r3.f0(r2)
            j$.time.chrono.J r9 = r8.Q(r9)
            return r9
        L84:
            int r9 = r8.O()
            r10 = 1
            if (r9 < r10) goto L8c
            goto L8e
        L8c:
            int r2 = 1 - r2
        L8e:
            int r2 = r2 + (-543)
            j$.time.g r9 = r3.f0(r2)
            j$.time.chrono.J r9 = r8.Q(r9)
            return r9
        L99:
            j$.time.chrono.b r9 = super.h(r9, r11)
            j$.time.chrono.J r9 = (j$.time.chrono.J) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.J.h(long, j$.time.temporal.q):j$.time.chrono.J");
    }

    @Override // j$.time.chrono.AbstractC1097d
    /* JADX INFO: renamed from: L */
    public final InterfaceC1095b i(j$.time.temporal.o oVar) {
        return (J) super.i(oVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.temporal.m
    public final j$.time.temporal.m i(j$.time.g gVar) {
        return (J) super.i(gVar);
    }

    @Override // j$.time.chrono.AbstractC1097d
    final InterfaceC1095b J(long j4) {
        return Q(this.f8322a.a0(j4));
    }

    @Override // j$.time.chrono.AbstractC1097d
    final InterfaceC1095b B(long j4) {
        return Q(this.f8322a.Z(j4));
    }

    @Override // j$.time.chrono.AbstractC1097d
    final InterfaceC1095b x(long j4) {
        return Q(this.f8322a.Y(j4));
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public final InterfaceC1095b l(long j4, j$.time.temporal.u uVar) {
        return (J) super.l(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.temporal.m
    public final j$.time.temporal.m l(long j4, j$.time.temporal.u uVar) {
        return (J) super.l(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public final InterfaceC1095b c(long j4, j$.time.temporal.u uVar) {
        return (J) super.c(j4, uVar);
    }

    @Override // j$.time.chrono.AbstractC1097d, j$.time.chrono.InterfaceC1095b, j$.time.temporal.m
    public final j$.time.temporal.m c(long j4, j$.time.temporal.u uVar) {
        return (J) super.c(j4, uVar);
    }

    private J Q(j$.time.g gVar) {
        return gVar.equals(this.f8322a) ? this : new J(gVar);
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final long t() {
        return this.f8322a.t();
    }

    @Override // j$.time.chrono.AbstractC1097d
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof J) {
            return this.f8322a.equals(((J) obj).f8322a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 8, this);
    }

    @Override // j$.time.chrono.InterfaceC1095b
    public final InterfaceC1098e E(j$.time.j jVar) {
        return C1100g.x(this, jVar);
    }
}
