package j$.time.zone;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long[] f8520i = new long[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final e[] f8521j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final LocalDateTime[] f8522k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b[] f8523l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f8524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset[] f8525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f8526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LocalDateTime[] f8527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ZoneOffset[] f8528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e[] f8529f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TimeZone f8530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient ConcurrentHashMap f8531h = new ConcurrentHashMap();

    public static f h(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new f(zoneOffset);
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f8524a = jArr;
        this.f8525b = zoneOffsetArr;
        this.f8526c = jArr2;
        this.f8528e = zoneOffsetArr2;
        this.f8529f = eVarArr;
        if (jArr2.length == 0) {
            this.f8527d = f8522k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i4 = 0;
            while (i4 < jArr2.length) {
                int i5 = i4 + 1;
                b bVar = new b(jArr2[i4], zoneOffsetArr2[i4], zoneOffsetArr2[i5]);
                if (bVar.O()) {
                    arrayList.add(bVar.p());
                    arrayList.add(bVar.o());
                } else {
                    arrayList.add(bVar.o());
                    arrayList.add(bVar.p());
                }
                i4 = i5;
            }
            this.f8527d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f8530g = null;
    }

    private f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f8525b = zoneOffsetArr;
        long[] jArr = f8520i;
        this.f8524a = jArr;
        this.f8526c = jArr;
        this.f8527d = f8522k;
        this.f8528e = zoneOffsetArr;
        this.f8529f = f8521j;
        this.f8530g = null;
    }

    f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {i(timeZone.getRawOffset())};
        this.f8525b = zoneOffsetArr;
        long[] jArr = f8520i;
        this.f8524a = jArr;
        this.f8526c = jArr;
        this.f8527d = f8522k;
        this.f8528e = zoneOffsetArr;
        this.f8529f = f8521j;
        this.f8530g = timeZone;
    }

    private static ZoneOffset i(int i4) {
        return ZoneOffset.S(i4 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f8530g != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        long[] jArr = this.f8524a;
        objectOutput.writeInt(jArr.length);
        for (long j4 : jArr) {
            a.c(j4, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.f8525b) {
            a.d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.f8526c;
        objectOutput.writeInt(jArr2.length);
        for (long j5 : jArr2) {
            a.c(j5, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f8528e) {
            a.d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = this.f8529f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    final void k(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f8530g.getID());
    }

    static f j(ObjectInput objectInput) throws IOException {
        int i4 = objectInput.readInt();
        long[] jArr = f8520i;
        long[] jArr2 = i4 == 0 ? jArr : new long[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            jArr2[i5] = a.a(objectInput);
        }
        int i6 = i4 + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i6];
        for (int i7 = 0; i7 < i6; i7++) {
            zoneOffsetArr[i7] = a.b(objectInput);
        }
        int i8 = objectInput.readInt();
        if (i8 != 0) {
            jArr = new long[i8];
        }
        long[] jArr3 = jArr;
        for (int i9 = 0; i9 < i8; i9++) {
            jArr3[i9] = a.a(objectInput);
        }
        int i10 = i8 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            zoneOffsetArr2[i11] = a.b(objectInput);
        }
        int i12 = objectInput.readByte();
        e[] eVarArr = i12 == 0 ? f8521j : new e[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            eVarArr[i13] = e.b(objectInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f8530g;
        if (timeZone != null) {
            return i(timeZone.getOffset(instant.Q()));
        }
        long[] jArr = this.f8526c;
        if (jArr.length == 0) {
            return this.f8525b[0];
        }
        long jX = instant.x();
        int length = this.f8529f.length;
        ZoneOffset[] zoneOffsetArr = this.f8528e;
        if (length > 0 && jX > jArr[jArr.length - 1]) {
            b[] bVarArrB = b(c(jX, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i4 = 0; i4 < bVarArrB.length; i4++) {
                bVar = bVarArrB[i4];
                if (jX < bVar.G()) {
                    return bVar.J();
                }
            }
            return bVar.B();
        }
        int iBinarySearch = Arrays.binarySearch(jArr, jX);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return zoneOffsetArr[iBinarySearch + 1];
    }

    public final List g(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return ((b) objE).L();
        }
        return Collections.singletonList((ZoneOffset) objE);
    }

    public final b f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return (b) objE;
        }
        return null;
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f8525b;
        int i4 = 0;
        TimeZone timeZone = this.f8530g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.L());
            if (bVarArrB.length == 0) {
                return i(timeZone.getOffset(localDateTime.N(zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i4 < length) {
                b bVar = bVarArrB[i4];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.J())) {
                    return objA;
                }
                i4++;
                obj = objA;
            }
            return obj;
        }
        if (this.f8526c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f8529f.length;
        LocalDateTime[] localDateTimeArr = this.f8527d;
        if (length2 > 0 && localDateTime.O(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.L());
            int length3 = bVarArrB2.length;
            while (i4 < length3) {
                b bVar2 = bVarArrB2[i4];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.J())) {
                    return objA2;
                }
                i4++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.f8528e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i5 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i5])) {
                iBinarySearch = i5;
            }
        }
        if ((iBinarySearch & 1) == 0) {
            LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
            int i6 = iBinarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr2[i6];
            ZoneOffset zoneOffset2 = zoneOffsetArr2[i6 + 1];
            if (zoneOffset2.P() > zoneOffset.P()) {
                return new b(localDateTime2, zoneOffset, zoneOffset2);
            }
            return new b(localDateTime3, zoneOffset, zoneOffset2);
        }
        return zoneOffsetArr2[(iBinarySearch / 2) + 1];
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTimeP = bVar.p();
        if (bVar.O()) {
            if (localDateTime.P(localDateTimeP)) {
                return bVar.J();
            }
            if (!localDateTime.P(bVar.o())) {
                return bVar.B();
            }
        } else {
            if (!localDateTime.P(localDateTimeP)) {
                return bVar.B();
            }
            if (localDateTime.P(bVar.o())) {
                return bVar.J();
            }
        }
        return bVar;
    }

    private b[] b(int i4) {
        Integer numValueOf = Integer.valueOf(i4);
        ConcurrentHashMap concurrentHashMap = this.f8531h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.f8530g;
        if (timeZone != null) {
            b[] bVarArr2 = f8523l;
            if (i4 < 1800) {
                return bVarArr2;
            }
            long jN = LocalDateTime.Q(i4 - 1).N(this.f8525b[0]);
            long j4 = 1000;
            int offset = timeZone.getOffset(jN * 1000);
            long j5 = 31968000 + jN;
            while (jN < j5) {
                long j6 = 7776000 + jN;
                long j7 = j4;
                if (offset != timeZone.getOffset(j6 * j7)) {
                    while (j6 - jN > 1) {
                        int i5 = offset;
                        long jFloorDiv = Math.floorDiv(j6 + jN, 2L);
                        if (timeZone.getOffset(jFloorDiv * j7) == i5) {
                            jN = jFloorDiv;
                        } else {
                            j6 = jFloorDiv;
                        }
                        offset = i5;
                    }
                    int i6 = offset;
                    if (timeZone.getOffset(jN * j7) == i6) {
                        jN = j6;
                    }
                    ZoneOffset zoneOffsetI = i(i6);
                    offset = timeZone.getOffset(jN * j7);
                    ZoneOffset zoneOffsetI2 = i(offset);
                    if (c(jN, zoneOffsetI2) == i4) {
                        bVarArr2 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr2[bVarArr2.length - 1] = new b(jN, zoneOffsetI, zoneOffsetI2);
                    }
                } else {
                    jN = j6;
                }
                j4 = j7;
            }
            if (1916 <= i4 && i4 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        e[] eVarArr = this.f8529f;
        b[] bVarArr3 = new b[eVarArr.length];
        for (int i7 = 0; i7 < eVarArr.length; i7++) {
            bVarArr3[i7] = eVarArr[i7].a(i4);
        }
        if (i4 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    private static int c(long j4, ZoneOffset zoneOffset) {
        return j$.time.g.W(Math.floorDiv(j4 + ((long) zoneOffset.P()), 86400)).Q();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f8530g, fVar.f8530g) && Arrays.equals(this.f8524a, fVar.f8524a) && Arrays.equals(this.f8525b, fVar.f8525b) && Arrays.equals(this.f8526c, fVar.f8526c) && Arrays.equals(this.f8528e, fVar.f8528e) && Arrays.equals(this.f8529f, fVar.f8529f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f8530g) ^ Arrays.hashCode(this.f8524a)) ^ Arrays.hashCode(this.f8525b)) ^ Arrays.hashCode(this.f8526c)) ^ Arrays.hashCode(this.f8528e)) ^ Arrays.hashCode(this.f8529f);
    }

    public final String toString() {
        TimeZone timeZone = this.f8530g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f8525b[r1.length - 1] + "]";
    }
}
