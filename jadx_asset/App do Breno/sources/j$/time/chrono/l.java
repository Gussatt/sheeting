package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class l implements InterfaceC1103j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient C1100g f8338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ZoneOffset f8339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j$.time.w f8340c;

    static InterfaceC1103j x(j$.time.w wVar, ZoneOffset zoneOffset, C1100g c1100g) {
        Objects.requireNonNull(c1100g, "localDateTime");
        Objects.requireNonNull(wVar, "zone");
        if (wVar instanceof ZoneOffset) {
            return new l(wVar, (ZoneOffset) wVar, c1100g);
        }
        j$.time.zone.f fVarP = wVar.p();
        LocalDateTime localDateTimeX = LocalDateTime.x(c1100g);
        List listG = fVarP.g(localDateTimeX);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarP.f(localDateTimeX);
            c1100g = c1100g.J(bVarF.x().x());
            zoneOffset = bVarF.B();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(wVar, zoneOffset, c1100g);
    }

    static l p(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.f())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.q() + ", actual: " + lVar.f().q());
    }

    private l(j$.time.w wVar, ZoneOffset zoneOffset, C1100g c1100g) {
        Objects.requireNonNull(c1100g, "dateTime");
        this.f8338a = c1100g;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f8339b = zoneOffset;
        Objects.requireNonNull(wVar, "zone");
        this.f8340c = wVar;
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final ZoneOffset y() {
        return this.f8339b;
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final InterfaceC1098e w() {
        return this.f8338a;
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final j$.time.w H() {
        return this.f8340c;
    }

    @Override // j$.time.chrono.InterfaceC1103j
    public final InterfaceC1103j A(j$.time.w wVar) {
        return x(wVar, this.f8339b, this.f8338a);
    }

    @Override // j$.time.temporal.n
    public final boolean d(j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            return true;
        }
        return qVar != null && qVar.L(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m h(long j4, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) qVar;
            int i4 = AbstractC1104k.f8337a[aVar.ordinal()];
            if (i4 == 1) {
                return l(j4 - G(), j$.time.temporal.b.SECONDS);
            }
            j$.time.w wVar = this.f8340c;
            C1100g c1100g = this.f8338a;
            if (i4 != 2) {
                return x(wVar, this.f8339b, c1100g.h(j4, qVar));
            }
            Instant instantL = Instant.L(c1100g.N(ZoneOffset.S(aVar.O(j4))), c1100g.m().O());
            m mVarF = f();
            ZoneOffset zoneOffsetD = wVar.p().d(instantL);
            Objects.requireNonNull(zoneOffsetD, "offset");
            return new l(wVar, zoneOffsetD, (C1100g) mVarF.u(LocalDateTime.S(instantL.x(), instantL.B(), zoneOffsetD)));
        }
        return p(f(), qVar.o(this, j4));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public final InterfaceC1103j l(long j4, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return i(this.f8338a.l(j4, uVar));
        }
        return p(f(), uVar.o(this, j4));
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f8338a);
        objectOutput.writeObject(this.f8339b);
        objectOutput.writeObject(this.f8340c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC1103j) && compareTo((InterfaceC1103j) obj) == 0;
    }

    public final int hashCode() {
        return (this.f8338a.hashCode() ^ this.f8339b.hashCode()) ^ Integer.rotateLeft(this.f8340c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f8338a.toString();
        ZoneOffset zoneOffset = this.f8339b;
        String str = string + zoneOffset.toString();
        j$.time.w wVar = this.f8340c;
        if (zoneOffset == wVar) {
            return str;
        }
        return str + "[" + wVar.toString() + "]";
    }
}
