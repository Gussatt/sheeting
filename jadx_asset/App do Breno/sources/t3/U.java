package t3;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class U {
    public static final byte[] a(String str) {
        X2.l.e(str, "<this>");
        byte[] bytes = str.getBytes(f3.c.f7276b);
        X2.l.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    public static final ReentrantLock b() {
        return new ReentrantLock();
    }

    public static final String c(byte[] bArr) {
        X2.l.e(bArr, "<this>");
        return new String(bArr, f3.c.f7276b);
    }
}
