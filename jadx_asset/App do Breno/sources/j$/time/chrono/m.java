package j$.time.chrono;

import j$.time.LocalDateTime;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends Comparable {
    n F(int i4);

    String I();

    boolean equals(Object obj);

    int hashCode();

    String q();

    InterfaceC1095b r(j$.time.temporal.n nVar);

    String toString();

    static m z(j$.time.temporal.n nVar) {
        Objects.requireNonNull(nVar, "temporal");
        m mVar = (m) nVar.a(j$.time.temporal.s.a());
        t tVar = t.f8358d;
        if (mVar != null) {
            return mVar;
        }
        Objects.requireNonNull(tVar, "defaultObj");
        return tVar;
    }

    default InterfaceC1098e u(LocalDateTime localDateTime) {
        try {
            return r(localDateTime).E(j$.time.j.B(localDateTime));
        } catch (j$.time.a e4) {
            throw new j$.time.a("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e4);
        }
    }
}
