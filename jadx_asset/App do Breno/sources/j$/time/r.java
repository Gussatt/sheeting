package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f8454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f8455b;

    public r() {
    }

    r(byte b4, Object obj) {
        this.f8454a = b4;
        this.f8455b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b4 = this.f8454a;
        Object obj = this.f8455b;
        objectOutput.writeByte(b4);
        switch (b4) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).R(objectOutput);
                return;
            case 3:
                ((g) obj).g0(objectOutput);
                return;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                ((j) obj).d0(objectOutput);
                return;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                ((LocalDateTime) obj).a0(objectOutput);
                return;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                ((z) obj).P(objectOutput);
                return;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                ((x) obj).P(objectOutput);
                return;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                ((ZoneOffset) obj).V(objectOutput);
                return;
            case 9:
                ((p) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((t) obj).L(objectOutput);
                return;
            case 12:
                ((v) obj).Q(objectOutput);
                return;
            case 13:
                ((n) obj).x(objectOutput);
                return;
            case 14:
                ((q) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b4 = objectInput.readByte();
        this.f8454a = b4;
        this.f8455b = b(b4, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b4, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b4) {
            case 1:
                Duration duration = Duration.f8292c;
                return Duration.J(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f8295c;
                return Instant.L(objectInput.readLong(), objectInput.readInt());
            case 3:
                g gVar = g.f8425d;
                return g.U(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return j.Y(objectInput);
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                LocalDateTime localDateTime = LocalDateTime.f8298c;
                g gVar2 = g.f8425d;
                return LocalDateTime.R(g.U(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j.Y(objectInput));
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return z.J(objectInput);
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                int i4 = x.f8496c;
                return w.x(objectInput.readUTF());
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return ZoneOffset.U(objectInput);
            case 9:
                return p.B(objectInput);
            case 10:
                return OffsetDateTime.J(objectInput);
            case 11:
                int i5 = t.f8458b;
                return t.p(objectInput.readInt());
            case 12:
                return v.L(objectInput);
            case 13:
                return n.p(objectInput);
            case 14:
                return q.a(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f8455b;
    }
}
