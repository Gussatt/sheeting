package j$.time.temporal;

import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
final class r implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8480a;

    public /* synthetic */ r(int i4) {
        this.f8480a = i4;
    }

    @Override // j$.time.temporal.t
    public final Object a(n nVar) {
        switch (this.f8480a) {
            case 0:
                return (j$.time.w) nVar.a(s.f8481a);
            case 1:
                return (j$.time.chrono.m) nVar.a(s.f8482b);
            case 2:
                return (u) nVar.a(s.f8483c);
            case 3:
                a aVar = a.OFFSET_SECONDS;
                if (nVar.d(aVar)) {
                    return ZoneOffset.S(nVar.g(aVar));
                }
                return null;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                j$.time.w wVar = (j$.time.w) nVar.a(s.f8481a);
                return wVar != null ? wVar : (j$.time.w) nVar.a(s.f8484d);
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                a aVar2 = a.EPOCH_DAY;
                if (nVar.d(aVar2)) {
                    return j$.time.g.W(nVar.e(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (nVar.d(aVar3)) {
                    return j$.time.j.R(nVar.e(aVar3));
                }
                return null;
        }
    }

    public final String toString() {
        switch (this.f8480a) {
            case 0:
                return "ZoneId";
            case 1:
                return "Chronology";
            case 2:
                return "Precision";
            case 3:
                return "ZoneOffset";
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return "Zone";
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return "LocalDate";
            default:
                return "LocalTime";
        }
    }
}
