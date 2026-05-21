package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f8503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Serializable f8504b;

    public a() {
    }

    a(byte b4, Serializable serializable) {
        this.f8503a = b4;
        this.f8504b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b4 = this.f8503a;
        Serializable serializable = this.f8504b;
        objectOutput.writeByte(b4);
        if (b4 == 1) {
            ((f) serializable).writeExternal(objectOutput);
            return;
        }
        if (b4 == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b4 == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else {
            if (b4 == 100) {
                ((f) serializable).k(objectOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable serializableJ;
        byte b4 = objectInput.readByte();
        this.f8503a = b4;
        if (b4 == 1) {
            serializableJ = f.j(objectInput);
        } else if (b4 == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            serializableJ = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b4 == 3) {
            serializableJ = e.b(objectInput);
        } else {
            if (b4 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            serializableJ = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f8504b = serializableJ;
    }

    private Object readResolve() {
        return this.f8504b;
    }

    static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int iP = zoneOffset.P();
        int i4 = iP % 900 == 0 ? iP / 900 : 127;
        objectOutput.writeByte(i4);
        if (i4 == 127) {
            objectOutput.writeInt(iP);
        }
    }

    static ZoneOffset b(ObjectInput objectInput) throws IOException {
        byte b4 = objectInput.readByte();
        return b4 == 127 ? ZoneOffset.S(objectInput.readInt()) : ZoneOffset.S(b4 * 900);
    }

    static void c(long j4, ObjectOutput objectOutput) {
        if (j4 >= -4575744000L && j4 < 10413792000L && j4 % 900 == 0) {
            int i4 = (int) ((j4 + 4575744000L) / 900);
            objectOutput.writeByte((i4 >>> 16) & 255);
            objectOutput.writeByte((i4 >>> 8) & 255);
            objectOutput.writeByte(i4 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j4);
    }

    static long a(ObjectInput objectInput) {
        int i4 = objectInput.readByte() & 255;
        if (i4 == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i4 << 16) + ((objectInput.readByte() & 255) << 8)) + (objectInput.readByte() & 255))) * 900) - 4575744000L;
    }
}
