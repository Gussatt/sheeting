package j$.time.format;

import j$.time.chrono.InterfaceC1095b;
import j$.time.w;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j$.time.temporal.n f8417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DateTimeFormatter f8418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8419c;

    p(j$.time.temporal.n nVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.m mVarB = dateTimeFormatter.b();
        if (mVarB != null) {
            j$.time.chrono.m mVar = (j$.time.chrono.m) nVar.a(j$.time.temporal.s.a());
            w wVar = (w) nVar.a(j$.time.temporal.s.g());
            InterfaceC1095b interfaceC1095bR = null;
            mVarB = Objects.equals(mVarB, mVar) ? null : mVarB;
            if (mVarB != null) {
                j$.time.chrono.m mVar2 = mVarB != null ? mVarB : mVar;
                if (mVarB != null) {
                    if (nVar.d(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC1095bR = mVar2.r(nVar);
                    } else if (mVarB != j$.time.chrono.t.f8358d || mVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.J() && nVar.d(aVar)) {
                                throw new j$.time.a("Unable to apply override chronology '" + mVarB + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + nVar);
                            }
                        }
                    }
                }
                nVar = new o(interfaceC1095bR, nVar, mVar2, wVar);
            }
        }
        this.f8417a = nVar;
        this.f8418b = dateTimeFormatter;
    }

    final j$.time.temporal.n d() {
        return this.f8417a;
    }

    final Locale c() {
        return this.f8418b.d();
    }

    final s b() {
        return this.f8418b.c();
    }

    final void g() {
        this.f8419c++;
    }

    final void a() {
        this.f8419c--;
    }

    final Object f(a aVar) {
        j$.time.temporal.n nVar = this.f8417a;
        Object objA = nVar.a(aVar);
        if (objA != null || this.f8419c != 0) {
            return objA;
        }
        throw new j$.time.a("Unable to extract " + aVar + " from temporal " + nVar);
    }

    final Long e(j$.time.temporal.q qVar) {
        int i4 = this.f8419c;
        j$.time.temporal.n nVar = this.f8417a;
        if (i4 <= 0 || nVar.d(qVar)) {
            return Long.valueOf(nVar.e(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.f8417a.toString();
    }
}
