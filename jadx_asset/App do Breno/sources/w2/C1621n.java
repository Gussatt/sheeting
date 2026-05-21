package w2;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: w2.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1621n implements InterfaceC1615h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1621n f11891a = new C1621n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f11892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f11893c;

    /* JADX INFO: renamed from: w2.n$a */
    public static final class a extends ByteArrayOutputStream {
        public byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        f11892b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f11893c = Charset.forName("UTF8");
    }

    public static final void c(ByteBuffer byteBuffer, int i4) {
        int iPosition = byteBuffer.position() % i4;
        if (iPosition != 0) {
            byteBuffer.position((byteBuffer.position() + i4) - iPosition);
        }
    }

    public static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    public static final int e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int i4 = byteBuffer.get() & 255;
        return i4 < 254 ? i4 : i4 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    public static final void h(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        int size = byteArrayOutputStream.size() % i4;
        if (size != 0) {
            for (int i5 = 0; i5 < i4 - size; i5++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    public static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    public static final void j(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        if (f11892b) {
            byteArrayOutputStream.write(i4);
            byteArrayOutputStream.write(i4 >>> 8);
        } else {
            byteArrayOutputStream.write(i4 >>> 8);
            byteArrayOutputStream.write(i4);
        }
    }

    public static final void k(ByteArrayOutputStream byteArrayOutputStream, double d4) {
        n(byteArrayOutputStream, Double.doubleToLongBits(d4));
    }

    public static final void l(ByteArrayOutputStream byteArrayOutputStream, float f4) {
        m(byteArrayOutputStream, Float.floatToIntBits(f4));
    }

    public static final void m(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        if (f11892b) {
            byteArrayOutputStream.write(i4);
            byteArrayOutputStream.write(i4 >>> 8);
            byteArrayOutputStream.write(i4 >>> 16);
            byteArrayOutputStream.write(i4 >>> 24);
            return;
        }
        byteArrayOutputStream.write(i4 >>> 24);
        byteArrayOutputStream.write(i4 >>> 16);
        byteArrayOutputStream.write(i4 >>> 8);
        byteArrayOutputStream.write(i4);
    }

    public static final void n(ByteArrayOutputStream byteArrayOutputStream, long j4) {
        if (f11892b) {
            byteArrayOutputStream.write((byte) j4);
            byteArrayOutputStream.write((byte) (j4 >>> 8));
            byteArrayOutputStream.write((byte) (j4 >>> 16));
            byteArrayOutputStream.write((byte) (j4 >>> 24));
            byteArrayOutputStream.write((byte) (j4 >>> 32));
            byteArrayOutputStream.write((byte) (j4 >>> 40));
            byteArrayOutputStream.write((byte) (j4 >>> 48));
            byteArrayOutputStream.write((byte) (j4 >>> 56));
            return;
        }
        byteArrayOutputStream.write((byte) (j4 >>> 56));
        byteArrayOutputStream.write((byte) (j4 >>> 48));
        byteArrayOutputStream.write((byte) (j4 >>> 40));
        byteArrayOutputStream.write((byte) (j4 >>> 32));
        byteArrayOutputStream.write((byte) (j4 >>> 24));
        byteArrayOutputStream.write((byte) (j4 >>> 16));
        byteArrayOutputStream.write((byte) (j4 >>> 8));
        byteArrayOutputStream.write((byte) j4);
    }

    public static final void o(ByteArrayOutputStream byteArrayOutputStream, int i4) {
        if (i4 < 254) {
            byteArrayOutputStream.write(i4);
        } else if (i4 <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, i4);
        } else {
            byteArrayOutputStream.write(255);
            m(byteArrayOutputStream, i4);
        }
    }

    @Override // w2.InterfaceC1615h
    public ByteBuffer a(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        p(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // w2.InterfaceC1615h
    public Object b(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objF = f(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return objF;
    }

    public final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public Object g(byte b4, ByteBuffer byteBuffer) {
        int i4 = 0;
        switch (b4) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return Long.valueOf(byteBuffer.getLong());
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return new BigInteger(new String(d(byteBuffer), f11893c), 16);
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return new String(d(byteBuffer), f11893c);
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return d(byteBuffer);
            case 9:
                int iE = e(byteBuffer);
                int[] iArr = new int[iE];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(iArr);
                byteBuffer.position(byteBuffer.position() + (iE * 4));
                return iArr;
            case 10:
                int iE2 = e(byteBuffer);
                long[] jArr = new long[iE2];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr);
                byteBuffer.position(byteBuffer.position() + (iE2 * 8));
                return jArr;
            case 11:
                int iE3 = e(byteBuffer);
                double[] dArr = new double[iE3];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                byteBuffer.position(byteBuffer.position() + (iE3 * 8));
                return dArr;
            case 12:
                int iE4 = e(byteBuffer);
                ArrayList arrayList = new ArrayList(iE4);
                while (i4 < iE4) {
                    arrayList.add(f(byteBuffer));
                    i4++;
                }
                return arrayList;
            case 13:
                int iE5 = e(byteBuffer);
                HashMap map = new HashMap();
                while (i4 < iE5) {
                    map.put(f(byteBuffer), f(byteBuffer));
                    i4++;
                }
                return map;
            case 14:
                int iE6 = e(byteBuffer);
                float[] fArr = new float[iE6];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                byteBuffer.position(byteBuffer.position() + (iE6 * 4));
                return fArr;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int i4 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                n(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                h(byteArrayOutputStream, 8);
                k(byteArrayOutputStream, ((Number) obj).doubleValue());
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f11893c));
                return;
            }
        }
        if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            i(byteArrayOutputStream, obj.toString().getBytes(f11893c));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            i(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] iArr = (int[]) obj;
            o(byteArrayOutputStream, iArr.length);
            h(byteArrayOutputStream, 4);
            int length = iArr.length;
            while (i4 < length) {
                m(byteArrayOutputStream, iArr[i4]);
                i4++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            o(byteArrayOutputStream, jArr.length);
            h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (i4 < length2) {
                n(byteArrayOutputStream, jArr[i4]);
                i4++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            o(byteArrayOutputStream, dArr.length);
            h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (i4 < length3) {
                k(byteArrayOutputStream, dArr[i4]);
                i4++;
            }
            return;
        }
        if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List list = (List) obj;
            o(byteArrayOutputStream, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                p(byteArrayOutputStream, entry.getKey());
                p(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        o(byteArrayOutputStream, fArr.length);
        h(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (i4 < length4) {
            l(byteArrayOutputStream, fArr[i4]);
            i4++;
        }
    }
}
