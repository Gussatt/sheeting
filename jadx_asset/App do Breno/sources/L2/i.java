package L2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends h {
    public static final List c(Object[] objArr) {
        X2.l.e(objArr, "<this>");
        List listA = k.a(objArr);
        X2.l.d(listA, "asList(...)");
        return listA;
    }

    public static byte[] d(byte[] bArr, byte[] bArr2, int i4, int i5, int i6) {
        X2.l.e(bArr, "<this>");
        X2.l.e(bArr2, "destination");
        System.arraycopy(bArr, i5, bArr2, i4, i6 - i5);
        return bArr2;
    }

    public static final Object[] e(Object[] objArr, Object[] objArr2, int i4, int i5, int i6) {
        X2.l.e(objArr, "<this>");
        X2.l.e(objArr2, "destination");
        System.arraycopy(objArr, i5, objArr2, i4, i6 - i5);
        return objArr2;
    }

    public static /* synthetic */ byte[] f(byte[] bArr, byte[] bArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = bArr.length;
        }
        return d(bArr, bArr2, i4, i5, i6);
    }

    public static /* synthetic */ Object[] g(Object[] objArr, Object[] objArr2, int i4, int i5, int i6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            i4 = 0;
        }
        if ((i7 & 4) != 0) {
            i5 = 0;
        }
        if ((i7 & 8) != 0) {
            i6 = objArr.length;
        }
        return e(objArr, objArr2, i4, i5, i6);
    }

    public static byte[] h(byte[] bArr, int i4, int i5) {
        X2.l.e(bArr, "<this>");
        g.b(i5, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
        X2.l.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static Object[] i(Object[] objArr, int i4, int i5) {
        X2.l.e(objArr, "<this>");
        g.b(i5, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i4, i5);
        X2.l.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static final void j(Object[] objArr, Object obj, int i4, int i5) {
        X2.l.e(objArr, "<this>");
        Arrays.fill(objArr, i4, i5, obj);
    }

    public static final void k(Object[] objArr, Comparator comparator) {
        X2.l.e(objArr, "<this>");
        X2.l.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }
}
