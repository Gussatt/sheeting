package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1095b extends j$.time.temporal.m, j$.time.temporal.o, Comparable {
    m f();

    @Override // j$.time.temporal.m
    InterfaceC1095b h(long j4, j$.time.temporal.q qVar);

    int hashCode();

    @Override // j$.time.temporal.m
    InterfaceC1095b l(long j4, j$.time.temporal.u uVar);

    String toString();

    default n s() {
        return f().F(g(j$.time.temporal.a.ERA));
    }

    @Override // j$.time.temporal.n
    default boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) qVar).J();
        }
        return qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.m
    default InterfaceC1095b c(long j4, j$.time.temporal.u uVar) {
        return AbstractC1097d.p(f(), super.c(j4, uVar));
    }

    @Override // j$.time.temporal.n
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.c()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.a()) {
            return f();
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.DAYS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.o
    default j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(t(), j$.time.temporal.a.EPOCH_DAY);
    }

    default InterfaceC1098e E(j$.time.j jVar) {
        return C1100g.x(this, jVar);
    }

    default long t() {
        return e(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: K */
    default int compareTo(InterfaceC1095b interfaceC1095b) {
        int iCompare = Long.compare(t(), interfaceC1095b.t());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC1094a) f()).q().compareTo(interfaceC1095b.f().q());
    }
}
