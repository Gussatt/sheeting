package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class B extends AbstractC1094a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final B f8313d = new B();
    private static final long serialVersionUID = 1039765215346859963L;

    @Override // j$.time.chrono.m
    public final String q() {
        return "Minguo";
    }

    @Override // j$.time.chrono.m
    public final n F(int i4) {
        if (i4 == 0) {
            return E.BEFORE_ROC;
        }
        if (i4 == 1) {
            return E.ROC;
        }
        throw new j$.time.a("Invalid era: " + i4);
    }

    @Override // j$.time.chrono.m
    public final String I() {
        return "roc";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1095b r(j$.time.temporal.n nVar) {
        if (nVar instanceof D) {
            return (D) nVar;
        }
        return new D(j$.time.g.B(nVar));
    }

    public final j$.time.temporal.w x(j$.time.temporal.a aVar) {
        int i4 = A.f8312a[aVar.ordinal()];
        if (i4 == 1) {
            j$.time.temporal.w wVarX = j$.time.temporal.a.PROLEPTIC_MONTH.x();
            return j$.time.temporal.w.j(wVarX.e() - 22932, wVarX.d() - 22932);
        }
        if (i4 == 2) {
            j$.time.temporal.w wVarX2 = j$.time.temporal.a.YEAR.x();
            return j$.time.temporal.w.k(wVarX2.d() - 1911, (-wVarX2.e()) + 1912);
        }
        if (i4 == 3) {
            j$.time.temporal.w wVarX3 = j$.time.temporal.a.YEAR.x();
            return j$.time.temporal.w.j(wVarX3.e() - 1911, wVarX3.d() - 1911);
        }
        return aVar.x();
    }

    private B() {
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
