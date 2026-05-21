package j$.time.chrono;

import j$.time.LocalDateTime;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC1094a implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f8358d = new t();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.m
    public final n F(int i4) {
        if (i4 == 0) {
            return u.BCE;
        }
        if (i4 == 1) {
            return u.CE;
        }
        throw new j$.time.a("Invalid era: " + i4);
    }

    @Override // j$.time.chrono.m
    public final String q() {
        return "ISO";
    }

    @Override // j$.time.chrono.m
    public final String I() {
        return "iso8601";
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1095b r(j$.time.temporal.n nVar) {
        return j$.time.g.B(nVar);
    }

    private t() {
    }

    @Override // j$.time.chrono.m
    public final InterfaceC1098e u(LocalDateTime localDateTime) {
        return LocalDateTime.x(localDateTime);
    }

    public static boolean x(long j4) {
        if ((3 & j4) == 0) {
            return j4 % 100 != 0 || j4 % 400 == 0;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    Object writeReplace() {
        return new F((byte) 1, this);
    }
}
