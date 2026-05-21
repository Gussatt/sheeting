package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f8292c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8294b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f8293a, duration2.f8293a);
        return iCompare != 0 ? iCompare : this.f8294b - duration2.f8294b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration B(long j4) {
        return o(j4, 0);
    }

    public static Duration J(long j4, long j5) {
        return o(Math.addExact(j4, Math.floorDiv(j5, 1000000000L)), (int) Math.floorMod(j5, 1000000000L));
    }

    public static Duration ofMillis(long j4) {
        long j5 = j4 / 1000;
        int i4 = (int) (j4 % 1000);
        if (i4 < 0) {
            i4 += 1000;
            j5--;
        }
        return o(j5, i4 * 1000000);
    }

    private static Duration o(long j4, int i4) {
        if ((((long) i4) | j4) == 0) {
            return f8292c;
        }
        return new Duration(j4, i4);
    }

    private Duration(long j4, int i4) {
        this.f8293a = j4;
        this.f8294b = i4;
    }

    public final long x() {
        return this.f8293a;
    }

    public final int p() {
        return this.f8294b;
    }

    public long toMillis() {
        long j4 = this.f8294b;
        long j5 = this.f8293a;
        if (j5 < 0) {
            j5++;
            j4 -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j5, 1000), j4 / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f8293a == duration.f8293a && this.f8294b == duration.f8294b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f8293a;
        return (this.f8294b * 51) + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        if (this == f8292c) {
            return "PT0S";
        }
        long j4 = this.f8293a;
        int i4 = this.f8294b;
        long j5 = (j4 >= 0 || i4 <= 0) ? j4 : 1 + j4;
        long j6 = j5 / 3600;
        int i5 = (int) ((j5 % 3600) / 60);
        int i6 = (int) (j5 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j6 != 0) {
            sb.append(j6);
            sb.append('H');
        }
        if (i5 != 0) {
            sb.append(i5);
            sb.append('M');
        }
        if (i6 == 0 && i4 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j4 < 0 && i4 > 0 && i6 == 0) {
            sb.append("-0");
        } else {
            sb.append(i6);
        }
        if (i4 > 0) {
            int length = sb.length();
            if (j4 < 0) {
                sb.append(2000000000 - ((long) i4));
            } else {
                sb.append(((long) i4) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeLong(this.f8293a);
        objectOutput.writeInt(this.f8294b);
    }
}
