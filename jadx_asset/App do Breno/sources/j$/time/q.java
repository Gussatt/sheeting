package j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final q f8450d = new q(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f8451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8453c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        d.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    private q(int i4, int i5, int i6) {
        this.f8451a = i4;
        this.f8452b = i5;
        this.f8453c = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f8451a == qVar.f8451a && this.f8452b == qVar.f8452b && this.f8453c == qVar.f8453c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f8453c, 16) + Integer.rotateLeft(this.f8452b, 8) + this.f8451a;
    }

    public final String toString() {
        if (this == f8450d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i4 = this.f8451a;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('Y');
        }
        int i5 = this.f8452b;
        if (i5 != 0) {
            sb.append(i5);
            sb.append('M');
        }
        int i6 = this.f8453c;
        if (i6 != 0) {
            sb.append(i6);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f8451a);
        objectOutput.writeInt(this.f8452b);
        objectOutput.writeInt(this.f8453c);
    }

    static q a(ObjectInput objectInput) throws IOException {
        int i4 = objectInput.readInt();
        int i5 = objectInput.readInt();
        int i6 = objectInput.readInt();
        if ((i4 | i5 | i6) == 0) {
            return f8450d;
        }
        return new q(i4, i5, i6);
    }
}
