package j$.time.format;

import j$.time.temporal.w;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
final class g extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f8388g;

    g(j$.time.temporal.q qVar, int i4, int i5, boolean z3, int i6) {
        super(qVar, i4, i5, u.NOT_NEGATIVE, i6);
        this.f8388g = z3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i
    final i b() {
        if (this.f8394e == -1) {
            return this;
        }
        return new g(this.f8390a, this.f8391b, this.f8392c, this.f8388g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i
    final i c(int i4) {
        return new g(this.f8390a, this.f8391b, this.f8392c, this.f8388g, this.f8394e + i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.q, java.lang.Enum] */
    @Override // j$.time.format.i, j$.time.format.f
    public final boolean o(p pVar, StringBuilder sb) {
        ?? r02 = this.f8390a;
        Long lE = pVar.e(r02);
        if (lE == null) {
            return false;
        }
        s sVarB = pVar.b();
        long jLongValue = lE.longValue();
        w wVarX = r02.x();
        wVarX.b(jLongValue, r02);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(wVarX.e());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(wVarX.d()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z3 = this.f8388g;
        int i4 = this.f8391b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i4), this.f8392c), roundingMode).toPlainString().substring(2);
            sVarB.getClass();
            if (z3) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i4 <= 0) {
            return true;
        }
        if (z3) {
            sVarB.getClass();
            sb.append('.');
        }
        for (int i5 = 0; i5 < i4; i5++) {
            sVarB.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.i
    public final String toString() {
        return "Fraction(" + this.f8390a + "," + this.f8391b + "," + this.f8392c + (this.f8388g ? ",DecimalPoint" : "") + ")";
    }
}
