package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class x extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8496c = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient j$.time.zone.f f8498b;

    static x O(String str) {
        j$.time.zone.f fVarA;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i4 = 0; i4 < length; i4++) {
                char cCharAt = str.charAt(i4);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i4 == 0) && ((cCharAt < '0' || cCharAt > '9' || i4 == 0) && ((cCharAt != '~' || i4 == 0) && ((cCharAt != '.' || i4 == 0) && ((cCharAt != '_' || i4 == 0) && ((cCharAt != '+' || i4 == 0) && (cCharAt != '-' || i4 == 0))))))))) {
                    throw new a("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarA = j$.time.zone.j.a(str, true);
            } catch (j$.time.zone.g unused) {
                fVarA = null;
            }
            return new x(str, fVarA);
        }
        throw new a("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    x(String str, j$.time.zone.f fVar) {
        this.f8497a = str;
        this.f8498b = fVar;
    }

    @Override // j$.time.w
    public final String q() {
        return this.f8497a;
    }

    @Override // j$.time.w
    public final j$.time.zone.f p() {
        j$.time.zone.f fVar = this.f8498b;
        return fVar != null ? fVar : j$.time.zone.j.a(this.f8497a, false);
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.w
    final void L(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f8497a);
    }

    final void P(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f8497a);
    }
}
