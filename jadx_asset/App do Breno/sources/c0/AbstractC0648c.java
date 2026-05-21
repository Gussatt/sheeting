package c0;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: c0.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0648c {
    public static int a(int i4) {
        return ((i4 + 7) & (-8)) / 8;
    }

    public static byte[] b(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static RuntimeException c(String str) {
        return new IllegalStateException(str);
    }

    public static byte[] d(InputStream inputStream, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        int i5 = 0;
        while (i5 < i4) {
            int i6 = inputStream.read(bArr, i5, i4 - i5);
            if (i6 < 0) {
                throw c("Not enough bytes to read: " + i4);
            }
            i5 += i6;
        }
        return bArr;
    }

    public static byte[] e(InputStream inputStream, int i4, int i5) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i5];
            byte[] bArr2 = new byte[2048];
            int i6 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i6 < i4) {
                int i7 = inputStream.read(bArr2);
                if (i7 < 0) {
                    throw c("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i4 + " bytes");
                }
                inflater.setInput(bArr2, 0, i7);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i5 - iInflate);
                    i6 += i7;
                } catch (DataFormatException e4) {
                    throw c(e4.getMessage());
                }
            }
            if (i6 == i4) {
                if (inflater.finished()) {
                    return bArr;
                }
                throw c("Inflater did not finish");
            }
            throw c("Didn't read enough bytes during decompression. expected=" + i4 + " actual=" + i6);
        } finally {
            inflater.end();
        }
    }

    public static String f(InputStream inputStream, int i4) {
        return new String(d(inputStream, i4), StandardCharsets.UTF_8);
    }

    public static long g(InputStream inputStream, int i4) throws IOException {
        byte[] bArrD = d(inputStream, i4);
        long j4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            j4 += ((long) (bArrD[i5] & 255)) << (i5 * 8);
        }
        return j4;
    }

    public static int h(InputStream inputStream) {
        return (int) g(inputStream, 2);
    }

    public static long i(InputStream inputStream) {
        return g(inputStream, 4);
    }

    public static int j(InputStream inputStream) {
        return (int) g(inputStream, 1);
    }

    public static int k(String str) {
        return str.getBytes(StandardCharsets.UTF_8).length;
    }

    public static void l(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i4);
            }
        }
    }

    public static void m(OutputStream outputStream, byte[] bArr) throws IOException {
        q(outputStream, bArr.length);
        byte[] bArrB = b(bArr);
        q(outputStream, bArrB.length);
        outputStream.write(bArrB);
    }

    public static void n(OutputStream outputStream, String str) throws IOException {
        outputStream.write(str.getBytes(StandardCharsets.UTF_8));
    }

    public static void o(OutputStream outputStream, long j4, int i4) throws IOException {
        byte[] bArr = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            bArr[i5] = (byte) ((j4 >> (i5 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    public static void p(OutputStream outputStream, int i4) throws IOException {
        o(outputStream, i4, 2);
    }

    public static void q(OutputStream outputStream, long j4) throws IOException {
        o(outputStream, j4, 4);
    }

    public static void r(OutputStream outputStream, int i4) throws IOException {
        o(outputStream, i4, 1);
    }
}
