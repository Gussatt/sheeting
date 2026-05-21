package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
final class j implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String[] f8395d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final j f8396e = new j("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f8398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f8399c;

    static {
        new j("+HH:MM:ss", "0");
    }

    j(String str, String str2) {
        int i4 = 0;
        while (true) {
            String[] strArr = f8395d;
            if (i4 < 22) {
                if (strArr[i4].equals(str)) {
                    this.f8398b = i4;
                    this.f8399c = i4 % 11;
                    this.f8397a = str2;
                    return;
                }
                i4++;
            } else {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            }
        }
    }

    @Override // j$.time.format.f
    public final boolean o(p pVar, StringBuilder sb) {
        Long lE = pVar.e(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z3 = false;
        if (lE == null) {
            return false;
        }
        int intExact = Math.toIntExact(lE.longValue());
        String str = this.f8397a;
        if (intExact == 0) {
            sb.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb.length();
        sb.append(intExact < 0 ? "-" : "+");
        if (this.f8398b < 11 || iAbs >= 10) {
            a(false, iAbs, sb);
        } else {
            sb.append((char) (iAbs + 48));
        }
        int i4 = this.f8399c;
        if ((i4 >= 3 && i4 <= 8) || ((i4 >= 9 && iAbs3 > 0) || (i4 >= 1 && iAbs2 > 0))) {
            a(i4 > 0 && i4 % 2 == 0, iAbs2, sb);
            iAbs += iAbs2;
            if (i4 == 7 || i4 == 8 || (i4 >= 5 && iAbs3 > 0)) {
                if (i4 > 0 && i4 % 2 == 0) {
                    z3 = true;
                }
                a(z3, iAbs3, sb);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb.setLength(length);
            sb.append(str);
        }
        return true;
    }

    private static void a(boolean z3, int i4, StringBuilder sb) {
        sb.append(z3 ? ":" : "");
        sb.append((char) ((i4 / 10) + 48));
        sb.append((char) ((i4 % 10) + 48));
    }

    public final String toString() {
        String strReplace = this.f8397a.replace("'", "''");
        return "Offset(" + f8395d[this.f8398b] + ",'" + strReplace + "')";
    }
}
