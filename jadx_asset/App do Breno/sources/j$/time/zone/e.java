package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.l;
import j$.time.temporal.o;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f8511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f8512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.time.c f8513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j$.time.j f8514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d f8516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ZoneOffset f8517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ZoneOffset f8518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ZoneOffset f8519i;

    e(l lVar, int i4, j$.time.c cVar, j$.time.j jVar, boolean z3, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f8511a = lVar;
        this.f8512b = (byte) i4;
        this.f8513c = cVar;
        this.f8514d = jVar;
        this.f8515e = z3;
        this.f8516f = dVar;
        this.f8517g = zoneOffset;
        this.f8518h = zoneOffset2;
        this.f8519i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        j$.time.j jVar = this.f8514d;
        boolean z3 = this.f8515e;
        int iA0 = z3 ? 86400 : jVar.a0();
        int iP = this.f8517g.P();
        ZoneOffset zoneOffset = this.f8518h;
        int iP2 = zoneOffset.P() - iP;
        ZoneOffset zoneOffset2 = this.f8519i;
        int iP3 = zoneOffset2.P() - iP;
        int iL = iA0 % 3600 == 0 ? z3 ? 24 : jVar.L() : 31;
        int i4 = iP % 900 == 0 ? (iP / 900) + 128 : 255;
        int i5 = (iP2 == 0 || iP2 == 1800 || iP2 == 3600) ? iP2 / 1800 : 3;
        int i6 = (iP3 == 0 || iP3 == 1800 || iP3 == 3600) ? iP3 / 1800 : 3;
        j$.time.c cVar = this.f8513c;
        objectOutput.writeInt((this.f8511a.o() << 28) + ((this.f8512b + 32) << 22) + ((cVar == null ? 0 : cVar.o()) << 19) + (iL << 14) + (this.f8516f.ordinal() << 12) + (i4 << 4) + (i5 << 2) + i6);
        if (iL == 31) {
            objectOutput.writeInt(iA0);
        }
        if (i4 == 255) {
            objectOutput.writeInt(iP);
        }
        if (i5 == 3) {
            objectOutput.writeInt(zoneOffset.P());
        }
        if (i6 == 3) {
            objectOutput.writeInt(zoneOffset2.P());
        }
    }

    static e b(ObjectInput objectInput) {
        int i4 = objectInput.readInt();
        l lVarJ = l.J(i4 >>> 28);
        int i5 = ((264241152 & i4) >>> 22) - 32;
        int i6 = (3670016 & i4) >>> 19;
        j$.time.c cVarP = i6 == 0 ? null : j$.time.c.p(i6);
        int i7 = (507904 & i4) >>> 14;
        d dVar = d.values()[(i4 & 12288) >>> 12];
        int i8 = (i4 & 4080) >>> 4;
        int i9 = (i4 & 12) >>> 2;
        int i10 = i4 & 3;
        j$.time.j jVarS = i7 == 31 ? j$.time.j.S(objectInput.readInt()) : j$.time.j.Q(i7 % 24);
        ZoneOffset zoneOffsetS = ZoneOffset.S(i8 == 255 ? objectInput.readInt() : (i8 - 128) * 900);
        ZoneOffset zoneOffsetS2 = ZoneOffset.S(i9 == 3 ? objectInput.readInt() : (i9 * 1800) + zoneOffsetS.P());
        ZoneOffset zoneOffsetS3 = i10 == 3 ? ZoneOffset.S(objectInput.readInt()) : ZoneOffset.S((i10 * 1800) + zoneOffsetS.P());
        boolean z3 = i7 == 24;
        Objects.requireNonNull(lVarJ, "month");
        Objects.requireNonNull(jVarS, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        if (i5 < -28 || i5 > 31 || i5 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z3 && !jVarS.equals(j$.time.j.f8435g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (jVarS.O() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(lVarJ, i5, cVarP, jVarS, z3, dVar, zoneOffsetS, zoneOffsetS2, zoneOffsetS3);
    }

    public final b a(int i4) {
        j$.time.g gVarV;
        l lVar = this.f8511a;
        j$.time.c cVar = this.f8513c;
        byte b4 = this.f8512b;
        if (b4 < 0) {
            t.f8358d.getClass();
            gVarV = j$.time.g.V(i4, lVar, lVar.x(t.x(i4)) + 1 + b4);
            if (cVar != null) {
                final int iO = cVar.o();
                final int i5 = 1;
                gVarV = gVarV.i(new o() { // from class: j$.time.temporal.p
                    @Override // j$.time.temporal.o
                    public final m b(m mVar) {
                        switch (i5) {
                            case 0:
                                int iG = mVar.g(a.DAY_OF_WEEK);
                                int i6 = iO;
                                if (iG == i6) {
                                    return mVar;
                                }
                                return mVar.l(iG - i6 >= 0 ? 7 - r0 : -r0, b.DAYS);
                            default:
                                int iG2 = mVar.g(a.DAY_OF_WEEK);
                                int i7 = iO;
                                if (iG2 == i7) {
                                    return mVar;
                                }
                                return mVar.c(i7 - iG2 >= 0 ? 7 - r1 : -r1, b.DAYS);
                        }
                    }
                });
            }
        } else {
            gVarV = j$.time.g.V(i4, lVar, b4);
            if (cVar != null) {
                final int iO2 = cVar.o();
                final int i6 = 0;
                gVarV = gVarV.i(new o() { // from class: j$.time.temporal.p
                    @Override // j$.time.temporal.o
                    public final m b(m mVar) {
                        switch (i6) {
                            case 0:
                                int iG = mVar.g(a.DAY_OF_WEEK);
                                int i62 = iO2;
                                if (iG == i62) {
                                    return mVar;
                                }
                                return mVar.l(iG - i62 >= 0 ? 7 - r0 : -r0, b.DAYS);
                            default:
                                int iG2 = mVar.g(a.DAY_OF_WEEK);
                                int i7 = iO2;
                                if (iG2 == i7) {
                                    return mVar;
                                }
                                return mVar.c(i7 - iG2 >= 0 ? 7 - r1 : -r1, b.DAYS);
                        }
                    }
                });
            }
        }
        if (this.f8515e) {
            gVarV = gVarV.Y(1L);
        }
        LocalDateTime localDateTimeR = LocalDateTime.R(gVarV, this.f8514d);
        int i7 = c.f8509a[this.f8516f.ordinal()];
        ZoneOffset zoneOffset = this.f8518h;
        if (i7 == 1) {
            localDateTimeR = localDateTimeR.U(zoneOffset.P() - ZoneOffset.UTC.P());
        } else if (i7 == 2) {
            localDateTimeR = localDateTimeR.U(zoneOffset.P() - this.f8517g.P());
        }
        return new b(localDateTimeR, zoneOffset, this.f8519i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f8511a == eVar.f8511a && this.f8512b == eVar.f8512b && this.f8513c == eVar.f8513c && this.f8516f == eVar.f8516f && this.f8514d.equals(eVar.f8514d) && this.f8515e == eVar.f8515e && this.f8517g.equals(eVar.f8517g) && this.f8518h.equals(eVar.f8518h) && this.f8519i.equals(eVar.f8519i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iA0 = ((this.f8514d.a0() + (this.f8515e ? 1 : 0)) << 15) + (this.f8511a.ordinal() << 11) + ((this.f8512b + 32) << 5);
        j$.time.c cVar = this.f8513c;
        return ((this.f8517g.hashCode() ^ (this.f8516f.ordinal() + (iA0 + ((cVar == null ? 7 : cVar.ordinal()) << 2)))) ^ this.f8518h.hashCode()) ^ this.f8519i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f8518h;
        ZoneOffset zoneOffset2 = this.f8519i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        l lVar = this.f8511a;
        byte b4 = this.f8512b;
        j$.time.c cVar = this.f8513c;
        if (cVar == null) {
            sb.append(lVar.name());
            sb.append(' ');
            sb.append((int) b4);
        } else if (b4 == -1) {
            sb.append(cVar.name());
            sb.append(" on or before last day of ");
            sb.append(lVar.name());
        } else if (b4 < 0) {
            sb.append(cVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b4) - 1);
            sb.append(" of ");
            sb.append(lVar.name());
        } else {
            sb.append(cVar.name());
            sb.append(" on or after ");
            sb.append(lVar.name());
            sb.append(' ');
            sb.append((int) b4);
        }
        sb.append(" at ");
        sb.append(this.f8515e ? "24:00" : this.f8514d.toString());
        sb.append(" ");
        sb.append(this.f8516f);
        sb.append(", standard offset ");
        sb.append(this.f8517g);
        sb.append(']');
        return sb.toString();
    }
}
