package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f8489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f8490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f8491d;

    public static w j(long j4, long j5) {
        if (j4 > j5) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new w(j4, j4, j5, j5);
    }

    public static w k(long j4, long j5) {
        if (j4 > j5) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j5) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new w(1L, 1L, j4, j5);
    }

    private w(long j4, long j5, long j6, long j7) {
        this.f8488a = j4;
        this.f8489b = j5;
        this.f8490c = j6;
        this.f8491d = j7;
    }

    public final boolean g() {
        return this.f8488a == this.f8489b && this.f8490c == this.f8491d;
    }

    public final long e() {
        return this.f8488a;
    }

    public final long f() {
        return this.f8490c;
    }

    public final long d() {
        return this.f8491d;
    }

    public final boolean h() {
        return this.f8488a >= -2147483648L && this.f8491d <= 2147483647L;
    }

    public final boolean i(long j4) {
        return j4 >= this.f8488a && j4 <= this.f8491d;
    }

    public final int a(long j4, q qVar) {
        if (h() && i(j4)) {
            return (int) j4;
        }
        throw new j$.time.a(c(j4, qVar));
    }

    public final void b(long j4, q qVar) {
        if (!i(j4)) {
            throw new j$.time.a(c(j4, qVar));
        }
    }

    private String c(long j4, q qVar) {
        if (qVar != null) {
            return "Invalid value for " + qVar + " (valid values " + this + "): " + j4;
        }
        return "Invalid value (valid values " + this + "): " + j4;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j4 = this.f8488a;
        long j5 = this.f8489b;
        if (j4 > j5) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j6 = this.f8490c;
        long j7 = this.f8491d;
        if (j6 > j7) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j5 > j7) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f8488a == wVar.f8488a && this.f8489b == wVar.f8489b && this.f8490c == wVar.f8490c && this.f8491d == wVar.f8491d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f8489b;
        long j5 = this.f8488a + (j4 << 16) + (j4 >> 48);
        long j6 = this.f8490c;
        long j7 = j5 + (j6 << 32) + (j6 >> 32);
        long j8 = this.f8491d;
        long j9 = j7 + (j8 << 48) + (j8 >> 16);
        return (int) ((j9 >>> 32) ^ j9);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j4 = this.f8488a;
        sb.append(j4);
        long j5 = this.f8489b;
        if (j4 != j5) {
            sb.append('/');
            sb.append(j5);
        }
        sb.append(" - ");
        long j6 = this.f8490c;
        sb.append(j6);
        long j7 = this.f8491d;
        if (j6 != j7) {
            sb.append('/');
            sb.append(j7);
        }
        return sb.toString();
    }
}
