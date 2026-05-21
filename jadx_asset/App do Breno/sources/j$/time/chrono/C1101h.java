package j$.time.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1101h implements Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8331e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f8332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f8333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f8335d;

    static {
        j$.time.d.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    C1101h(m mVar, int i4, int i5, int i6) {
        this.f8332a = mVar;
        this.f8333b = i4;
        this.f8334c = i5;
        this.f8335d = i6;
    }

    public final String toString() {
        m mVar = this.f8332a;
        int i4 = this.f8335d;
        int i5 = this.f8334c;
        int i6 = this.f8333b;
        if (i6 == 0 && i5 == 0 && i4 == 0) {
            return mVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.toString());
        sb.append(" P");
        if (i6 != 0) {
            sb.append(i6);
            sb.append('Y');
        }
        if (i5 != 0) {
            sb.append(i5);
            sb.append('M');
        }
        if (i4 != 0) {
            sb.append(i4);
            sb.append('D');
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1101h) {
            C1101h c1101h = (C1101h) obj;
            if (this.f8333b == c1101h.f8333b && this.f8334c == c1101h.f8334c && this.f8335d == c1101h.f8335d && this.f8332a.equals(c1101h.f8332a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8332a.hashCode() ^ (Integer.rotateLeft(this.f8335d, 16) + (Integer.rotateLeft(this.f8334c, 8) + this.f8333b));
    }

    protected Object writeReplace() {
        return new F((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f8332a.q());
        objectOutput.writeInt(this.f8333b);
        objectOutput.writeInt(this.f8334c);
        objectOutput.writeInt(this.f8335d);
    }
}
