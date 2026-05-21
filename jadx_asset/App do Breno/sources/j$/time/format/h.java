package j$.time.format;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
final class h implements f {
    @Override // j$.time.format.f
    public final boolean o(p pVar, StringBuilder sb) {
        boolean z3;
        Long lE = pVar.e(j$.time.temporal.a.INSTANT_SECONDS);
        j$.time.temporal.n nVarD = pVar.d();
        j$.time.temporal.a aVar = j$.time.temporal.a.NANO_OF_SECOND;
        Long lValueOf = nVarD.d(aVar) ? Long.valueOf(pVar.d().e(aVar)) : null;
        int i4 = 0;
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        int iO = aVar.O(lValueOf != null ? lValueOf.longValue() : 0L);
        if (jLongValue >= -62167219200L) {
            long j4 = jLongValue - 253402300800L;
            long jFloorDiv = Math.floorDiv(j4, 315569520000L) + 1;
            LocalDateTime localDateTimeS = LocalDateTime.S(Math.floorMod(j4, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (jFloorDiv > 0) {
                sb.append('+');
                sb.append(jFloorDiv);
            }
            sb.append(localDateTimeS);
            if (localDateTimeS.J() == 0) {
                sb.append(":00");
            }
            z3 = true;
        } else {
            long j5 = jLongValue + 62167219200L;
            z3 = true;
            long j6 = j5 / 315569520000L;
            long j7 = j5 % 315569520000L;
            LocalDateTime localDateTimeS2 = LocalDateTime.S(j7 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(localDateTimeS2);
            if (localDateTimeS2.J() == 0) {
                sb.append(":00");
            }
            if (j6 < 0) {
                if (localDateTimeS2.L() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j6 - 1));
                } else if (j7 == 0) {
                    sb.insert(length, j6);
                } else {
                    sb.insert(length + 1, Math.abs(j6));
                }
            }
        }
        if (iO > 0) {
            sb.append('.');
            int i5 = 100000000;
            while (true) {
                if (iO <= 0 && i4 % 3 == 0 && i4 >= -2) {
                    break;
                }
                int i6 = iO / i5;
                sb.append((char) (i6 + 48));
                iO -= i6 * i5;
                i5 /= 10;
                i4++;
            }
        }
        sb.append('Z');
        return z3;
    }

    public final String toString() {
        return "Instant()";
    }
}
