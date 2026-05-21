package j$.time.zone;

import j$.time.Duration;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f8505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocalDateTime f8506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ZoneOffset f8507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ZoneOffset f8508d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f8505a, ((b) obj).f8505a);
    }

    b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f8505a = localDateTime.N(zoneOffset);
        this.f8506b = localDateTime;
        this.f8507c = zoneOffset;
        this.f8508d = zoneOffset2;
    }

    b(long j4, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f8505a = j4;
        this.f8506b = LocalDateTime.S(j4, 0, zoneOffset);
        this.f8507c = zoneOffset;
        this.f8508d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        a.c(this.f8505a, objectOutput);
        a.d(this.f8507c, objectOutput);
        a.d(this.f8508d, objectOutput);
    }

    public final long G() {
        return this.f8505a;
    }

    public final LocalDateTime p() {
        return this.f8506b;
    }

    public final ZoneOffset J() {
        return this.f8507c;
    }

    public final ZoneOffset B() {
        return this.f8508d;
    }

    public final LocalDateTime o() {
        return this.f8506b.U(this.f8508d.P() - this.f8507c.P());
    }

    public final Duration x() {
        return Duration.B(this.f8508d.P() - this.f8507c.P());
    }

    public final boolean O() {
        return this.f8508d.P() > this.f8507c.P();
    }

    final List L() {
        return O() ? Collections.EMPTY_LIST : j$.time.d.a(new Object[]{this.f8507c, this.f8508d});
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f8505a == bVar.f8505a && this.f8507c.equals(bVar.f8507c) && this.f8508d.equals(bVar.f8508d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8506b.hashCode() ^ this.f8507c.hashCode()) ^ Integer.rotateLeft(this.f8508d.hashCode(), 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        sb.append(O() ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.f8506b);
        sb.append(this.f8507c);
        sb.append(" to ");
        sb.append(this.f8508d);
        sb.append(']');
        return sb.toString();
    }
}
