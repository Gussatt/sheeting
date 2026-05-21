package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0717c5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f6667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f6668b;

    static {
        Charset.forName("US-ASCII");
        f6667a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6668b = bArr;
        ByteBuffer.wrap(bArr);
        int i4 = D4.f6316a;
        try {
            new B4(bArr, 0, 0, false, null).c(0);
        } catch (C0735e5 e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    public static int a(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int b(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = 0; i7 < i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }

    public static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }
}
