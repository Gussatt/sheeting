package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends w implements j$.time.temporal.n, j$.time.temporal.o, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient String f8309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ConcurrentHashMap f8304c = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f8305d = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = S(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ZoneOffset f8306e = S(-64800);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneOffset f8307f = S(64800);

    /* JADX WARN: Removed duplicated region for block: B:33:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static j$.time.ZoneOffset Q(java.lang.String r7) {
        /*
            java.lang.String r0 = "offsetId"
            java.util.Objects.requireNonNull(r7, r0)
            java.util.concurrent.ConcurrentHashMap r0 = j$.time.ZoneOffset.f8305d
            java.lang.Object r0 = r0.get(r7)
            j$.time.ZoneOffset r0 = (j$.time.ZoneOffset) r0
            if (r0 == 0) goto L10
            return r0
        L10:
            int r0 = r7.length()
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L63
            r1 = 3
            if (r0 == r1) goto L7f
            r4 = 5
            if (r0 == r4) goto L5a
            r5 = 6
            r6 = 4
            if (r0 == r5) goto L50
            r5 = 7
            if (r0 == r5) goto L43
            r1 = 9
            if (r0 != r1) goto L37
            int r0 = T(r7, r2, r3)
            int r1 = T(r7, r6, r2)
            int r2 = T(r7, r5, r2)
            goto L85
        L37:
            j$.time.a r0 = new j$.time.a
            java.lang.String r1 = "Invalid ID for ZoneOffset, invalid format: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L43:
            int r0 = T(r7, r2, r3)
            int r1 = T(r7, r1, r3)
            int r2 = T(r7, r4, r3)
            goto L85
        L50:
            int r0 = T(r7, r2, r3)
            int r1 = T(r7, r6, r2)
        L58:
            r2 = r3
            goto L85
        L5a:
            int r0 = T(r7, r2, r3)
            int r1 = T(r7, r1, r3)
            goto L58
        L63:
            char r0 = r7.charAt(r3)
            char r7 = r7.charAt(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
        L7f:
            int r0 = T(r7, r2, r3)
            r1 = r3
            r2 = r1
        L85:
            char r3 = r7.charAt(r3)
            r4 = 43
            r5 = 45
            if (r3 == r4) goto L9e
            if (r3 != r5) goto L92
            goto L9e
        L92:
            j$.time.a r0 = new j$.time.a
            java.lang.String r1 = "Invalid ID for ZoneOffset, plus/minus not found when expected: "
            java.lang.String r7 = r1.concat(r7)
            r0.<init>(r7)
            throw r0
        L9e:
            if (r3 != r5) goto La8
            int r7 = -r0
            int r0 = -r1
            int r1 = -r2
            j$.time.ZoneOffset r7 = R(r7, r0, r1)
            return r7
        La8:
            j$.time.ZoneOffset r7 = R(r0, r1, r2)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.ZoneOffset.Q(java.lang.String):j$.time.ZoneOffset");
    }

    private static int T(String str, int i4, boolean z3) {
        if (z3 && str.charAt(i4 - 1) != ':') {
            throw new a("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i4);
        char cCharAt2 = str.charAt(i4 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new a("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset R(int i4, int i5, int i6) {
        if (i4 < -18 || i4 > 18) {
            throw new a("Zone offset hours not in valid range: value " + i4 + " is not in the range -18 to 18");
        }
        if (i4 > 0) {
            if (i5 < 0 || i6 < 0) {
                throw new a("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i4 < 0) {
            if (i5 > 0 || i6 > 0) {
                throw new a("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i5 > 0 && i6 < 0) || (i5 < 0 && i6 > 0)) {
            throw new a("Zone offset minutes and seconds must have the same sign");
        }
        if (i5 < -59 || i5 > 59) {
            throw new a("Zone offset minutes not in valid range: value " + i5 + " is not in the range -59 to 59");
        }
        if (i6 < -59 || i6 > 59) {
            throw new a("Zone offset seconds not in valid range: value " + i6 + " is not in the range -59 to 59");
        }
        if (Math.abs(i4) == 18 && (i5 | i6) != 0) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        return S((i5 * 60) + (i4 * 3600) + i6);
    }

    public static ZoneOffset S(int i4) {
        if (i4 < -64800 || i4 > 64800) {
            throw new a("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i4 % 900 == 0) {
            Integer numValueOf = Integer.valueOf(i4);
            ConcurrentHashMap concurrentHashMap = f8304c;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i4));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
            f8305d.putIfAbsent(zoneOffset2.f8309b, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i4);
    }

    private ZoneOffset(int i4) {
        String string;
        this.f8308a = i4;
        if (i4 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i4);
            StringBuilder sb = new StringBuilder();
            int i5 = iAbs / 3600;
            int i6 = (iAbs / 60) % 60;
            sb.append(i4 < 0 ? "-" : "+");
            sb.append(i5 < 10 ? "0" : "");
            sb.append(i5);
            sb.append(i6 < 10 ? ":0" : ":");
            sb.append(i6);
            int i7 = iAbs % 60;
            if (i7 != 0) {
                sb.append(i7 < 10 ? ":0" : ":");
                sb.append(i7);
            }
            string = sb.toString();
        }
        this.f8309b = string;
    }

    public final int P() {
        return this.f8308a;
    }

    @Override // j$.time.w
    public final String q() {
        return this.f8309b;
    }

    @Override // j$.time.w
    public final j$.time.zone.f p() {
        return j$.time.zone.f.h(this);
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        return qVar instanceof j$.time.temporal.a ? qVar == j$.time.temporal.a.OFFSET_SECONDS : qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.n
    public final int g(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f8308a;
        }
        if (qVar == null) {
            return super.k(qVar).a(e(qVar), qVar);
        }
        throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
    }

    @Override // j$.time.temporal.n
    public final long e(j$.time.temporal.q qVar) {
        if (qVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f8308a;
        }
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(b.a("Unsupported field: ", qVar));
        }
        return qVar.p(this);
    }

    @Override // j$.time.temporal.n
    public final Object a(j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.f()) ? this : super.a(tVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(this.f8308a, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f8308a - this.f8308a;
    }

    @Override // j$.time.w
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            if (this.f8308a == ((ZoneOffset) obj).f8308a) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.w
    public final int hashCode() {
        return this.f8308a;
    }

    @Override // j$.time.w
    public final String toString() {
        return this.f8309b;
    }

    private Object writeReplace() {
        return new r((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.w
    final void L(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        V(objectOutput);
    }

    final void V(DataOutput dataOutput) {
        int i4 = this.f8308a;
        int i5 = i4 % 900 == 0 ? i4 / 900 : 127;
        dataOutput.writeByte(i5);
        if (i5 == 127) {
            dataOutput.writeInt(i4);
        }
    }

    static ZoneOffset U(ObjectInput objectInput) throws IOException {
        byte b4 = objectInput.readByte();
        return b4 == 127 ? S(objectInput.readInt()) : S(b4 * 900);
    }
}
