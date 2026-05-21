package j$.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
public interface n extends j$.time.temporal.n, j$.time.temporal.o {
    int o();

    @Override // j$.time.temporal.n
    default boolean d(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.ERA : qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    default int g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return o();
        }
        return super.g(qVar);
    }

    @Override // j$.time.temporal.n
    default long e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.ERA) {
            return o();
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.b.a("Unsupported field: ", qVar));
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.n
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.ERAS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.o
    default j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(o(), j$.time.temporal.a.ERA);
    }
}
