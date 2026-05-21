package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends AbstractC1094a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f8361d = new w();
    private static final long serialVersionUID = 459996390165777884L;

    @Override // j$.time.chrono.m
    public final String q() {
        return "Japanese";
    }

    @Override // j$.time.chrono.m
    public final String I() {
        return "japanese";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1095b r(j$.time.temporal.n nVar) {
        if (nVar instanceof y) {
            return (y) nVar;
        }
        return new y(j$.time.g.B(nVar));
    }

    private w() {
    }

    @Override // j$.time.chrono.m
    public final n F(int i4) {
        return z.x(i4);
    }

    public final j$.time.temporal.w x(j$.time.temporal.a aVar) {
        switch (v.f8360a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                throw new j$.time.temporal.v("Unsupported field: " + aVar);
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return j$.time.temporal.w.k(z.B(), 999999999 - z.q().r().Q());
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return j$.time.temporal.w.k(z.z(), j$.time.temporal.a.DAY_OF_YEAR.x().d());
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return j$.time.temporal.w.j(y.f8363d.Q(), 999999999L);
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return j$.time.temporal.w.j(z.f8367d.o(), z.q().o());
            default:
                return aVar.x();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
