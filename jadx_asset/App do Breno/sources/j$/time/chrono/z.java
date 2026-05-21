package j$.time.chrono;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class z implements n, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final z f8367d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final z[] f8368e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient int f8369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.g f8370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f8371c;

    static {
        z zVar = new z(-1, j$.time.g.U(1868, 1, 1), "Meiji");
        f8367d = zVar;
        f8368e = new z[]{zVar, new z(0, j$.time.g.U(1912, 7, 30), "Taisho"), new z(1, j$.time.g.U(1926, 12, 25), "Showa"), new z(2, j$.time.g.U(1989, 1, 8), "Heisei"), new z(3, j$.time.g.U(2019, 5, 1), "Reiwa")};
    }

    static z q() {
        return f8368e[r0.length - 1];
    }

    static long B() {
        int iQ = 1000000000 - q().f8370b.Q();
        z[] zVarArr = f8368e;
        int iQ2 = zVarArr[0].f8370b.Q();
        for (int i4 = 1; i4 < zVarArr.length; i4++) {
            z zVar = zVarArr[i4];
            iQ = Math.min(iQ, (zVar.f8370b.Q() - iQ2) + 1);
            iQ2 = zVar.f8370b.Q();
        }
        return iQ;
    }

    static long z() {
        long jF = j$.time.temporal.a.DAY_OF_YEAR.x().f();
        for (z zVar : f8368e) {
            jF = Math.min(jF, ((zVar.f8370b.S() ? 366 : 365) - zVar.f8370b.O()) + 1);
            if (zVar.u() != null) {
                jF = Math.min(jF, zVar.u().f8370b.O() - 1);
            }
        }
        return jF;
    }

    private z(int i4, j$.time.g gVar, String str) {
        this.f8369a = i4;
        this.f8370b = gVar;
        this.f8371c = str;
    }

    final j$.time.g r() {
        return this.f8370b;
    }

    public static z x(int i4) {
        int i5 = i4 + 1;
        if (i5 >= 0) {
            z[] zVarArr = f8368e;
            if (i5 < zVarArr.length) {
                return zVarArr[i5];
            }
        }
        throw new j$.time.a("Invalid era: " + i4);
    }

    static z p(j$.time.g gVar) {
        if (gVar.R(y.f8363d)) {
            throw new j$.time.a("JapaneseDate before Meiji 6 are not supported");
        }
        z[] zVarArr = f8368e;
        for (int length = zVarArr.length - 1; length >= 0; length--) {
            z zVar = zVarArr[length];
            if (gVar.compareTo(zVar.f8370b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    @Override // j$.time.chrono.n
    public final int o() {
        return this.f8369a;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.w k(j$.time.temporal.q qVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        if (qVar == aVar) {
            return w.f8361d.x(aVar);
        }
        return super.k(qVar);
    }

    public final String toString() {
        return this.f8371c;
    }

    final z u() {
        if (this == q()) {
            return null;
        }
        return x(this.f8369a + 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }

    final void F(DataOutput dataOutput) throws IOException {
        dataOutput.writeByte(this.f8369a);
    }
}
