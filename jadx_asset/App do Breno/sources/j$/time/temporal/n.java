package j$.time.temporal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface n {
    boolean d(q qVar);

    long e(q qVar);

    default w k(q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.B(this);
        }
        if (d(qVar)) {
            return ((a) qVar).x();
        }
        throw new v(j$.time.b.a("Unsupported field: ", qVar));
    }

    default int g(q qVar) {
        w wVarK = k(qVar);
        if (!wVarK.h()) {
            throw new v("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jE = e(qVar);
        if (wVarK.i(jE)) {
            return (int) jE;
        }
        throw new j$.time.a("Invalid value for " + qVar + " (valid values " + wVarK + "): " + jE);
    }

    default Object a(t tVar) {
        if (tVar == s.f8481a || tVar == s.f8482b || tVar == s.f8483c) {
            return null;
        }
        return tVar.a(this);
    }
}
