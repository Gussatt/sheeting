package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0598u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f4922a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f4923b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f4924c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f4925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f4926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC0585g f4927f;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$a */
    public interface a {
        boolean a(int i4);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.u$b */
    public interface b extends List, RandomAccess {
        void j();

        b n(int i4);

        boolean r();
    }

    static {
        byte[] bArr = new byte[0];
        f4925d = bArr;
        f4926e = ByteBuffer.wrap(bArr);
        f4927f = AbstractC0585g.i(bArr);
    }

    public static Object a(Object obj) {
        obj.getClass();
        return obj;
    }

    public static Object b(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static int c(boolean z3) {
        return z3 ? 1231 : 1237;
    }

    public static int d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static int e(byte[] bArr, int i4, int i5) {
        int iG = g(i5, bArr, i4, i5);
        if (iG == 0) {
            return 1;
        }
        return iG;
    }

    public static int f(long j4) {
        return (int) (j4 ^ (j4 >>> 32));
    }

    public static int g(int i4, byte[] bArr, int i5, int i6) {
        for (int i7 = i5; i7 < i5 + i6; i7++) {
            i4 = (i4 * 31) + bArr[i7];
        }
        return i4;
    }
}
