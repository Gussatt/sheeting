package C1;

import android.os.Process;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: C1.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0251i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f611b = AbstractC0252j.A(UUID.randomUUID().toString() + System.currentTimeMillis());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLong f612c = new AtomicLong(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f613a;

    public C0251i() {
        byte[] bArr = new byte[10];
        f(bArr);
        e(bArr);
        d(bArr);
        String strU = AbstractC0252j.u(bArr);
        Locale locale = Locale.US;
        this.f613a = String.format(locale, "%s%s%s%s", strU.substring(0, 12), strU.substring(12, 16), strU.subSequence(16, 20), f611b.substring(0, 12)).toUpperCase(locale);
    }

    public static byte[] a(long j4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.putInt((int) j4);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public static byte[] b(long j4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(2);
        byteBufferAllocate.putShort((short) j4);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.position(0);
        return byteBufferAllocate.array();
    }

    public String c() {
        return this.f613a;
    }

    public final void d(byte[] bArr) {
        byte[] bArrB = b(Integer.valueOf(Process.myPid()).shortValue());
        bArr[8] = bArrB[0];
        bArr[9] = bArrB[1];
    }

    public final void e(byte[] bArr) {
        byte[] bArrB = b(f612c.incrementAndGet());
        bArr[6] = bArrB[0];
        bArr[7] = bArrB[1];
    }

    public final void f(byte[] bArr) {
        long time = new Date().getTime();
        byte[] bArrA = a(time / 1000);
        bArr[0] = bArrA[0];
        bArr[1] = bArrA[1];
        bArr[2] = bArrA[2];
        bArr[3] = bArrA[3];
        byte[] bArrB = b(time % 1000);
        bArr[4] = bArrB[0];
        bArr[5] = bArrB[1];
    }

    public String toString() {
        return this.f613a;
    }
}
