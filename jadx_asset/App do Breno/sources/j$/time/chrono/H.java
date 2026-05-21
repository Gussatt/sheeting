package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends AbstractC1094a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f8320d = new H();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        map.put("en", new String[]{"BB", "BE"});
        map.put("th", new String[]{"BB", "BE"});
        map2.put("en", new String[]{"B.B.", "B.E."});
        map2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        map3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        map3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    @Override // j$.time.chrono.m
    public final n F(int i4) {
        if (i4 == 0) {
            return K.BEFORE_BE;
        }
        if (i4 == 1) {
            return K.BE;
        }
        throw new j$.time.a("Invalid era: " + i4);
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.m
    public final String I() {
        return "buddhist";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1095b r(j$.time.temporal.n nVar) {
        if (nVar instanceof J) {
            return (J) nVar;
        }
        return new J(j$.time.g.B(nVar));
    }

    private H() {
    }

    public final j$.time.temporal.w x(j$.time.temporal.a aVar) {
        int i4 = G.f8319a[aVar.ordinal()];
        if (i4 == 1) {
            j$.time.temporal.w wVarX = j$.time.temporal.a.PROLEPTIC_MONTH.x();
            return j$.time.temporal.w.j(wVarX.e() + 6516, wVarX.d() + 6516);
        }
        if (i4 == 2) {
            j$.time.temporal.w wVarX2 = j$.time.temporal.a.YEAR.x();
            return j$.time.temporal.w.k((-(wVarX2.e() + 543)) + 1, wVarX2.d() + 543);
        }
        if (i4 == 3) {
            j$.time.temporal.w wVarX3 = j$.time.temporal.a.YEAR.x();
            return j$.time.temporal.w.j(wVarX3.e() + 543, wVarX3.d() + 543);
        }
        return aVar.x();
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
