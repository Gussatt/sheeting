package j$.time.chrono;

import j$.time.ZoneOffset;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1098e extends j$.time.temporal.m, j$.time.temporal.o, Comparable {
    InterfaceC1103j D(ZoneOffset zoneOffset);

    j$.time.j m();

    InterfaceC1095b n();

    default m f() {
        return n().f();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    default InterfaceC1098e c(long j4, j$.time.temporal.b bVar) {
        return C1100g.p(f(), super.c(j4, bVar));
    }

    @Override // j$.time.temporal.n
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.c()) {
            return m();
        }
        if (tVar == j$.time.temporal.s.a()) {
            return f();
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.a(this);
    }

    @Override // j$.time.temporal.o
    default j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(n().t(), j$.time.temporal.a.EPOCH_DAY).h(m().Z(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long N(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((n().t() * 86400) + ((long) m().a0())) - ((long) zoneOffset.P());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: M */
    default int compareTo(InterfaceC1098e interfaceC1098e) {
        int iCompareTo = n().compareTo(interfaceC1098e.n());
        return (iCompareTo == 0 && (iCompareTo = m().compareTo(interfaceC1098e.m())) == 0) ? ((AbstractC1094a) f()).q().compareTo(interfaceC1098e.f().q()) : iCompareTo;
    }
}
