package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public abstract class S5 {
    public static /* bridge */ /* synthetic */ void a(byte b4, byte b5, byte b6, byte b7, char[] cArr, int i4) throws C0735e5 {
        if (e(b5) || (((b4 << 28) + (b5 + 112)) >> 30) != 0 || e(b6) || e(b7)) {
            throw new C0735e5("Protocol message had invalid UTF-8.");
        }
        int i5 = ((b4 & 7) << 18) | ((b5 & 63) << 12) | ((b6 & 63) << 6) | (b7 & 63);
        cArr[i4] = (char) ((i5 >>> 10) + 55232);
        cArr[i4 + 1] = (char) ((i5 & 1023) + 56320);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
      0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void b(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.measurement.C0735e5 {
        /*
            boolean r0 = e(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = e(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.android.gms.internal.measurement.e5 r2 = new com.google.android.gms.internal.measurement.e5
            java.lang.String r3 = "Protocol message had invalid UTF-8."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.S5.b(byte, byte, byte, char[], int):void");
    }

    public static /* bridge */ /* synthetic */ void c(byte b4, byte b5, char[] cArr, int i4) throws C0735e5 {
        if (b4 < -62 || e(b5)) {
            throw new C0735e5("Protocol message had invalid UTF-8.");
        }
        cArr[i4] = (char) (((b4 & 31) << 6) | (b5 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean d(byte b4) {
        return b4 >= 0;
    }

    public static boolean e(byte b4) {
        return b4 > -65;
    }
}
