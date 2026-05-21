package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
class i implements f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final long[] f8389f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Enum f8390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f8391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f8392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u f8393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f8394e;

    /* JADX WARN: Multi-variable type inference failed */
    i(j$.time.temporal.q qVar, int i4, int i5, u uVar) {
        this.f8390a = (Enum) qVar;
        this.f8391b = i4;
        this.f8392c = i5;
        this.f8393d = uVar;
        this.f8394e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected i(j$.time.temporal.q qVar, int i4, int i5, u uVar, int i6) {
        this.f8390a = (Enum) qVar;
        this.f8391b = i4;
        this.f8392c = i5;
        this.f8393d = uVar;
        this.f8394e = i6;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.q, java.lang.Enum] */
    i b() {
        return this.f8394e == -1 ? this : new i(this.f8390a, this.f8391b, this.f8392c, this.f8393d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.q, java.lang.Enum] */
    i c(int i4) {
        int i5 = this.f8394e + i4;
        return new i(this.f8390a, this.f8391b, this.f8392c, this.f8393d, i5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.q, java.lang.Enum, java.lang.Object] */
    @Override // j$.time.format.f
    public boolean o(p pVar, StringBuilder sb) {
        ?? r02 = this.f8390a;
        Long lE = pVar.e(r02);
        if (lE == null) {
            return false;
        }
        long jLongValue = lE.longValue();
        s sVarB = pVar.b();
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i4 = this.f8392c;
        if (length > i4) {
            throw new j$.time.a("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i4);
        }
        sVarB.getClass();
        int i5 = this.f8391b;
        u uVar = this.f8393d;
        if (jLongValue >= 0) {
            int i6 = c.f8384a[uVar.ordinal()];
            if (i6 != 1) {
                if (i6 == 2) {
                    sb.append('+');
                }
            } else if (i5 < 19 && jLongValue >= f8389f[i5]) {
                sb.append('+');
            }
        } else {
            int i7 = c.f8384a[uVar.ordinal()];
            if (i7 == 1 || i7 == 2 || i7 == 3) {
                sb.append('-');
            } else if (i7 == 4) {
                throw new j$.time.a("Field " + ((Object) r02) + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i8 = 0; i8 < i5 - string.length(); i8++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public String toString() {
        Enum r02 = this.f8390a;
        int i4 = this.f8392c;
        u uVar = this.f8393d;
        int i5 = this.f8391b;
        if (i5 == 1 && i4 == 19 && uVar == u.NORMAL) {
            return "Value(" + r02 + ")";
        }
        if (i5 == i4 && uVar == u.NOT_NEGATIVE) {
            return "Value(" + r02 + "," + i5 + ")";
        }
        return "Value(" + r02 + "," + i5 + "," + i4 + "," + uVar + ")";
    }
}
