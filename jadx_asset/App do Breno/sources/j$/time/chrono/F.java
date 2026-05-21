package j$.time.chrono;

import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f8317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f8318b;

    public F() {
    }

    F(byte b4, Object obj) {
        this.f8317a = b4;
        this.f8318b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b4 = this.f8317a;
        Object obj = this.f8318b;
        objectOutput.writeByte(b4);
        switch (b4) {
            case 1:
                objectOutput.writeUTF(((AbstractC1094a) obj).q());
                return;
            case 2:
                ((C1100g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((l) obj).writeExternal(objectOutput);
                return;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(yVar.g(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(yVar.g(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(yVar.g(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                ((z) obj).F(objectOutput);
                return;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                ((r) obj).writeExternal(objectOutput);
                return;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                D d4 = (D) obj;
                d4.getClass();
                objectOutput.writeInt(d4.g(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(d4.g(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(d4.g(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                J j4 = (J) obj;
                j4.getClass();
                objectOutput.writeInt(j4.g(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j4.g(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j4.g(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C1101h) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objO;
        byte b4 = objectInput.readByte();
        this.f8317a = b4;
        switch (b4) {
            case 1:
                int i4 = AbstractC1094a.f8326c;
                objO = AbstractC1094a.o(objectInput.readUTF());
                break;
            case 2:
                objO = ((InterfaceC1095b) objectInput.readObject()).E((j$.time.j) objectInput.readObject());
                break;
            case 3:
                objO = ((InterfaceC1098e) objectInput.readObject()).D((ZoneOffset) objectInput.readObject()).A((j$.time.w) objectInput.readObject());
                break;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                j$.time.g gVar = y.f8363d;
                int i5 = objectInput.readInt();
                byte b5 = objectInput.readByte();
                byte b6 = objectInput.readByte();
                w.f8361d.getClass();
                objO = new y(j$.time.g.U(i5, b5, b6));
                break;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                z zVar = z.f8367d;
                objO = z.x(objectInput.readByte());
                break;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                p pVar = (p) objectInput.readObject();
                int i6 = objectInput.readInt();
                byte b7 = objectInput.readByte();
                byte b8 = objectInput.readByte();
                pVar.getClass();
                objO = r.P(pVar, i6, b7, b8);
                break;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                int i7 = objectInput.readInt();
                byte b9 = objectInput.readByte();
                byte b10 = objectInput.readByte();
                B.f8313d.getClass();
                objO = new D(j$.time.g.U(i7 + 1911, b9, b10));
                break;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                int i8 = objectInput.readInt();
                byte b11 = objectInput.readByte();
                byte b12 = objectInput.readByte();
                H.f8320d.getClass();
                objO = new J(j$.time.g.U(i8 - 543, b11, b12));
                break;
            case 9:
                int i9 = C1101h.f8331e;
                objO = new C1101h(AbstractC1094a.o(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f8318b = objO;
    }

    private Object readResolve() {
        return this.f8318b;
    }
}
