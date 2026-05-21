package c0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: c0.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0656k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f5937a = {112, 114, 111, 0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f5938b = {112, 114, 109, 0};

    public static void A(InputStream inputStream) {
        AbstractC0648c.h(inputStream);
        int iJ = AbstractC0648c.j(inputStream);
        if (iJ == 6 || iJ == 7) {
            return;
        }
        while (iJ > 0) {
            AbstractC0648c.j(inputStream);
            for (int iJ2 = AbstractC0648c.j(inputStream); iJ2 > 0; iJ2--) {
                AbstractC0648c.h(inputStream);
            }
            iJ--;
        }
    }

    public static boolean B(OutputStream outputStream, byte[] bArr, C0647b[] c0647bArr) throws IOException {
        if (Arrays.equals(bArr, AbstractC0657l.f5939a)) {
            N(outputStream, c0647bArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC0657l.f5940b)) {
            M(outputStream, c0647bArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC0657l.f5942d)) {
            K(outputStream, c0647bArr);
            return true;
        }
        if (Arrays.equals(bArr, AbstractC0657l.f5941c)) {
            L(outputStream, c0647bArr);
            return true;
        }
        if (!Arrays.equals(bArr, AbstractC0657l.f5943e)) {
            return false;
        }
        J(outputStream, c0647bArr);
        return true;
    }

    public static void C(OutputStream outputStream, C0647b c0647b) throws IOException {
        int[] iArr = c0647b.f5920h;
        int length = iArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int i6 = iArr[i4];
            AbstractC0648c.p(outputStream, i6 - i5);
            i4++;
            i5 = i6;
        }
    }

    public static C0658m D(C0647b[] c0647bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            AbstractC0648c.p(byteArrayOutputStream, c0647bArr.length);
            int i4 = 2;
            for (C0647b c0647b : c0647bArr) {
                AbstractC0648c.q(byteArrayOutputStream, c0647b.f5915c);
                AbstractC0648c.q(byteArrayOutputStream, c0647b.f5916d);
                AbstractC0648c.q(byteArrayOutputStream, c0647b.f5919g);
                String strJ = j(c0647b.f5913a, c0647b.f5914b, AbstractC0657l.f5939a);
                int iK = AbstractC0648c.k(strJ);
                AbstractC0648c.p(byteArrayOutputStream, iK);
                i4 = i4 + 14 + iK;
                AbstractC0648c.n(byteArrayOutputStream, strJ);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (i4 == byteArray.length) {
                C0658m c0658m = new C0658m(EnumC0649d.DEX_FILES, i4, byteArray, false);
                byteArrayOutputStream.close();
                return c0658m;
            }
            throw AbstractC0648c.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void E(OutputStream outputStream, byte[] bArr) throws IOException {
        outputStream.write(f5937a);
        outputStream.write(bArr);
    }

    public static void F(OutputStream outputStream, C0647b c0647b) throws IOException {
        I(outputStream, c0647b);
        C(outputStream, c0647b);
        H(outputStream, c0647b);
    }

    public static void G(OutputStream outputStream, C0647b c0647b, String str) throws IOException {
        AbstractC0648c.p(outputStream, AbstractC0648c.k(str));
        AbstractC0648c.p(outputStream, c0647b.f5917e);
        AbstractC0648c.q(outputStream, c0647b.f5918f);
        AbstractC0648c.q(outputStream, c0647b.f5915c);
        AbstractC0648c.q(outputStream, c0647b.f5919g);
        AbstractC0648c.n(outputStream, str);
    }

    public static void H(OutputStream outputStream, C0647b c0647b) throws IOException {
        byte[] bArr = new byte[k(c0647b.f5919g)];
        for (Map.Entry entry : c0647b.f5921i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                z(bArr, 2, iIntValue, c0647b);
            }
            if ((iIntValue2 & 4) != 0) {
                z(bArr, 4, iIntValue, c0647b);
            }
        }
        outputStream.write(bArr);
    }

    public static void I(OutputStream outputStream, C0647b c0647b) throws IOException {
        int i4 = 0;
        for (Map.Entry entry : c0647b.f5921i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                AbstractC0648c.p(outputStream, iIntValue - i4);
                AbstractC0648c.p(outputStream, 0);
                i4 = iIntValue;
            }
        }
    }

    public static void J(OutputStream outputStream, C0647b[] c0647bArr) throws IOException {
        AbstractC0648c.p(outputStream, c0647bArr.length);
        for (C0647b c0647b : c0647bArr) {
            String strJ = j(c0647b.f5913a, c0647b.f5914b, AbstractC0657l.f5943e);
            AbstractC0648c.p(outputStream, AbstractC0648c.k(strJ));
            AbstractC0648c.p(outputStream, c0647b.f5921i.size());
            AbstractC0648c.p(outputStream, c0647b.f5920h.length);
            AbstractC0648c.q(outputStream, c0647b.f5915c);
            AbstractC0648c.n(outputStream, strJ);
            Iterator it = c0647b.f5921i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC0648c.p(outputStream, ((Integer) it.next()).intValue());
            }
            for (int i4 : c0647b.f5920h) {
                AbstractC0648c.p(outputStream, i4);
            }
        }
    }

    public static void K(OutputStream outputStream, C0647b[] c0647bArr) throws IOException {
        AbstractC0648c.r(outputStream, c0647bArr.length);
        for (C0647b c0647b : c0647bArr) {
            int size = c0647b.f5921i.size() * 4;
            String strJ = j(c0647b.f5913a, c0647b.f5914b, AbstractC0657l.f5942d);
            AbstractC0648c.p(outputStream, AbstractC0648c.k(strJ));
            AbstractC0648c.p(outputStream, c0647b.f5920h.length);
            AbstractC0648c.q(outputStream, size);
            AbstractC0648c.q(outputStream, c0647b.f5915c);
            AbstractC0648c.n(outputStream, strJ);
            Iterator it = c0647b.f5921i.keySet().iterator();
            while (it.hasNext()) {
                AbstractC0648c.p(outputStream, ((Integer) it.next()).intValue());
                AbstractC0648c.p(outputStream, 0);
            }
            for (int i4 : c0647b.f5920h) {
                AbstractC0648c.p(outputStream, i4);
            }
        }
    }

    public static void L(OutputStream outputStream, C0647b[] c0647bArr) throws IOException {
        byte[] bArrB = b(c0647bArr, AbstractC0657l.f5941c);
        AbstractC0648c.r(outputStream, c0647bArr.length);
        AbstractC0648c.m(outputStream, bArrB);
    }

    public static void M(OutputStream outputStream, C0647b[] c0647bArr) throws IOException {
        byte[] bArrB = b(c0647bArr, AbstractC0657l.f5940b);
        AbstractC0648c.r(outputStream, c0647bArr.length);
        AbstractC0648c.m(outputStream, bArrB);
    }

    public static void N(OutputStream outputStream, C0647b[] c0647bArr) throws IOException {
        O(outputStream, c0647bArr);
    }

    public static void O(OutputStream outputStream, C0647b[] c0647bArr) throws IOException {
        int length;
        ArrayList arrayList = new ArrayList(3);
        ArrayList arrayList2 = new ArrayList(3);
        arrayList.add(D(c0647bArr));
        arrayList.add(c(c0647bArr));
        arrayList.add(d(c0647bArr));
        long length2 = ((long) AbstractC0657l.f5939a.length) + ((long) f5937a.length) + 4 + ((long) (arrayList.size() * 16));
        AbstractC0648c.q(outputStream, arrayList.size());
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            C0658m c0658m = (C0658m) arrayList.get(i4);
            AbstractC0648c.q(outputStream, c0658m.f5946a.f());
            AbstractC0648c.q(outputStream, length2);
            if (c0658m.f5949d) {
                byte[] bArr = c0658m.f5948c;
                long length3 = bArr.length;
                byte[] bArrB = AbstractC0648c.b(bArr);
                arrayList2.add(bArrB);
                AbstractC0648c.q(outputStream, bArrB.length);
                AbstractC0648c.q(outputStream, length3);
                length = bArrB.length;
            } else {
                arrayList2.add(c0658m.f5948c);
                AbstractC0648c.q(outputStream, c0658m.f5948c.length);
                AbstractC0648c.q(outputStream, 0L);
                length = c0658m.f5948c.length;
            }
            length2 += (long) length;
        }
        for (int i5 = 0; i5 < arrayList2.size(); i5++) {
            outputStream.write((byte[]) arrayList2.get(i5));
        }
    }

    public static int a(C0647b c0647b) {
        Iterator it = c0647b.f5921i.entrySet().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue |= ((Integer) ((Map.Entry) it.next()).getValue()).intValue();
        }
        return iIntValue;
    }

    public static byte[] b(C0647b[] c0647bArr, byte[] bArr) throws IOException {
        int i4 = 0;
        int iK = 0;
        for (C0647b c0647b : c0647bArr) {
            iK += AbstractC0648c.k(j(c0647b.f5913a, c0647b.f5914b, bArr)) + 16 + (c0647b.f5917e * 2) + c0647b.f5918f + k(c0647b.f5919g);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iK);
        if (Arrays.equals(bArr, AbstractC0657l.f5941c)) {
            int length = c0647bArr.length;
            while (i4 < length) {
                C0647b c0647b2 = c0647bArr[i4];
                G(byteArrayOutputStream, c0647b2, j(c0647b2.f5913a, c0647b2.f5914b, bArr));
                F(byteArrayOutputStream, c0647b2);
                i4++;
            }
        } else {
            for (C0647b c0647b3 : c0647bArr) {
                G(byteArrayOutputStream, c0647b3, j(c0647b3.f5913a, c0647b3.f5914b, bArr));
            }
            int length2 = c0647bArr.length;
            while (i4 < length2) {
                F(byteArrayOutputStream, c0647bArr[i4]);
                i4++;
            }
        }
        if (byteArrayOutputStream.size() == iK) {
            return byteArrayOutputStream.toByteArray();
        }
        throw AbstractC0648c.c("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + iK);
    }

    public static C0658m c(C0647b[] c0647bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        for (int i5 = 0; i5 < c0647bArr.length; i5++) {
            try {
                C0647b c0647b = c0647bArr[i5];
                AbstractC0648c.p(byteArrayOutputStream, i5);
                AbstractC0648c.p(byteArrayOutputStream, c0647b.f5917e);
                i4 = i4 + 4 + (c0647b.f5917e * 2);
                C(byteArrayOutputStream, c0647b);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i4 == byteArray.length) {
            C0658m c0658m = new C0658m(EnumC0649d.CLASSES, i4, byteArray, true);
            byteArrayOutputStream.close();
            return c0658m;
        }
        throw AbstractC0648c.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
    }

    public static C0658m d(C0647b[] c0647bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        for (int i5 = 0; i5 < c0647bArr.length; i5++) {
            try {
                C0647b c0647b = c0647bArr[i5];
                int iA = a(c0647b);
                byte[] bArrE = e(c0647b);
                byte[] bArrF = f(c0647b);
                AbstractC0648c.p(byteArrayOutputStream, i5);
                int length = bArrE.length + 2 + bArrF.length;
                AbstractC0648c.q(byteArrayOutputStream, length);
                AbstractC0648c.p(byteArrayOutputStream, iA);
                byteArrayOutputStream.write(bArrE);
                byteArrayOutputStream.write(bArrF);
                i4 = i4 + 6 + length;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (i4 == byteArray.length) {
            C0658m c0658m = new C0658m(EnumC0649d.METHODS, i4, byteArray, true);
            byteArrayOutputStream.close();
            return c0658m;
        }
        throw AbstractC0648c.c("Expected size " + i4 + ", does not match actual size " + byteArray.length);
    }

    public static byte[] e(C0647b c0647b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            H(byteArrayOutputStream, c0647b);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static byte[] f(C0647b c0647b) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            I(byteArrayOutputStream, c0647b);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static String g(String str, String str2) {
        return "!".equals(str2) ? str.replace(":", "!") : ":".equals(str2) ? str.replace("!", ":") : str;
    }

    public static String h(String str) {
        int iIndexOf = str.indexOf("!");
        if (iIndexOf < 0) {
            iIndexOf = str.indexOf(":");
        }
        return iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
    }

    public static C0647b i(C0647b[] c0647bArr, String str) {
        if (c0647bArr.length <= 0) {
            return null;
        }
        String strH = h(str);
        for (int i4 = 0; i4 < c0647bArr.length; i4++) {
            if (c0647bArr[i4].f5914b.equals(strH)) {
                return c0647bArr[i4];
            }
        }
        return null;
    }

    public static String j(String str, String str2, byte[] bArr) {
        String strA = AbstractC0657l.a(bArr);
        if (str.length() <= 0) {
            return g(str2, strA);
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return g(str2, strA);
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return str + AbstractC0657l.a(bArr) + str2;
    }

    public static int k(int i4) {
        return y(i4 * 2) / 8;
    }

    public static int l(int i4, int i5, int i6) {
        if (i4 == 1) {
            throw AbstractC0648c.c("HOT methods are not stored in the bitmap");
        }
        if (i4 == 2) {
            return i5;
        }
        if (i4 == 4) {
            return i5 + i6;
        }
        throw AbstractC0648c.c("Unexpected flag: " + i4);
    }

    public static int[] m(InputStream inputStream, int i4) {
        int[] iArr = new int[i4];
        int iH = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            iH += AbstractC0648c.h(inputStream);
            iArr[i5] = iH;
        }
        return iArr;
    }

    public static int n(BitSet bitSet, int i4, int i5) {
        int i6 = bitSet.get(l(2, i4, i5)) ? 2 : 0;
        return bitSet.get(l(4, i4, i5)) ? i6 | 4 : i6;
    }

    public static byte[] o(InputStream inputStream, byte[] bArr) {
        if (Arrays.equals(bArr, AbstractC0648c.d(inputStream, bArr.length))) {
            return AbstractC0648c.d(inputStream, AbstractC0657l.f5940b.length);
        }
        throw AbstractC0648c.c("Invalid magic");
    }

    public static void p(InputStream inputStream, C0647b c0647b) {
        int iAvailable = inputStream.available() - c0647b.f5918f;
        int iH = 0;
        while (inputStream.available() > iAvailable) {
            iH += AbstractC0648c.h(inputStream);
            c0647b.f5921i.put(Integer.valueOf(iH), 1);
            for (int iH2 = AbstractC0648c.h(inputStream); iH2 > 0; iH2--) {
                A(inputStream);
            }
        }
        if (inputStream.available() != iAvailable) {
            throw AbstractC0648c.c("Read too much data during profile line parse");
        }
    }

    public static C0647b[] q(InputStream inputStream, byte[] bArr, byte[] bArr2, C0647b[] c0647bArr) {
        if (Arrays.equals(bArr, AbstractC0657l.f5944f)) {
            if (Arrays.equals(AbstractC0657l.f5939a, bArr2)) {
                throw AbstractC0648c.c("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            }
            return r(inputStream, bArr, c0647bArr);
        }
        if (Arrays.equals(bArr, AbstractC0657l.f5945g)) {
            return t(inputStream, bArr2, c0647bArr);
        }
        throw AbstractC0648c.c("Unsupported meta version");
    }

    public static C0647b[] r(InputStream inputStream, byte[] bArr, C0647b[] c0647bArr) throws IOException {
        if (!Arrays.equals(bArr, AbstractC0657l.f5944f)) {
            throw AbstractC0648c.c("Unsupported meta version");
        }
        int iJ = AbstractC0648c.j(inputStream);
        byte[] bArrE = AbstractC0648c.e(inputStream, (int) AbstractC0648c.i(inputStream), (int) AbstractC0648c.i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC0648c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            C0647b[] c0647bArrS = s(byteArrayInputStream, iJ, c0647bArr);
            byteArrayInputStream.close();
            return c0647bArrS;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C0647b[] s(InputStream inputStream, int i4, C0647b[] c0647bArr) {
        if (inputStream.available() == 0) {
            return new C0647b[0];
        }
        if (i4 != c0647bArr.length) {
            throw AbstractC0648c.c("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i4];
        int[] iArr = new int[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int iH = AbstractC0648c.h(inputStream);
            iArr[i5] = AbstractC0648c.h(inputStream);
            strArr[i5] = AbstractC0648c.f(inputStream, iH);
        }
        for (int i6 = 0; i6 < i4; i6++) {
            C0647b c0647b = c0647bArr[i6];
            if (!c0647b.f5914b.equals(strArr[i6])) {
                throw AbstractC0648c.c("Order of dexfiles in metadata did not match baseline");
            }
            int i7 = iArr[i6];
            c0647b.f5917e = i7;
            c0647b.f5920h = m(inputStream, i7);
        }
        return c0647bArr;
    }

    public static C0647b[] t(InputStream inputStream, byte[] bArr, C0647b[] c0647bArr) throws IOException {
        int iH = AbstractC0648c.h(inputStream);
        byte[] bArrE = AbstractC0648c.e(inputStream, (int) AbstractC0648c.i(inputStream), (int) AbstractC0648c.i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC0648c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            C0647b[] c0647bArrU = u(byteArrayInputStream, bArr, iH, c0647bArr);
            byteArrayInputStream.close();
            return c0647bArrU;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C0647b[] u(InputStream inputStream, byte[] bArr, int i4, C0647b[] c0647bArr) {
        if (inputStream.available() == 0) {
            return new C0647b[0];
        }
        if (i4 != c0647bArr.length) {
            throw AbstractC0648c.c("Mismatched number of dex files found in metadata");
        }
        for (int i5 = 0; i5 < i4; i5++) {
            AbstractC0648c.h(inputStream);
            String strF = AbstractC0648c.f(inputStream, AbstractC0648c.h(inputStream));
            long jI = AbstractC0648c.i(inputStream);
            int iH = AbstractC0648c.h(inputStream);
            C0647b c0647bI = i(c0647bArr, strF);
            if (c0647bI == null) {
                throw AbstractC0648c.c("Missing profile key: " + strF);
            }
            c0647bI.f5916d = jI;
            int[] iArrM = m(inputStream, iH);
            if (Arrays.equals(bArr, AbstractC0657l.f5943e)) {
                c0647bI.f5917e = iH;
                c0647bI.f5920h = iArrM;
            }
        }
        return c0647bArr;
    }

    public static void v(InputStream inputStream, C0647b c0647b) {
        BitSet bitSetValueOf = BitSet.valueOf(AbstractC0648c.d(inputStream, AbstractC0648c.a(c0647b.f5919g * 2)));
        int i4 = 0;
        while (true) {
            int i5 = c0647b.f5919g;
            if (i4 >= i5) {
                return;
            }
            int iN = n(bitSetValueOf, i4, i5);
            if (iN != 0) {
                Integer num = (Integer) c0647b.f5921i.get(Integer.valueOf(i4));
                if (num == null) {
                    num = 0;
                }
                c0647b.f5921i.put(Integer.valueOf(i4), Integer.valueOf(iN | num.intValue()));
            }
            i4++;
        }
    }

    public static C0647b[] w(InputStream inputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, AbstractC0657l.f5940b)) {
            throw AbstractC0648c.c("Unsupported version");
        }
        int iJ = AbstractC0648c.j(inputStream);
        byte[] bArrE = AbstractC0648c.e(inputStream, (int) AbstractC0648c.i(inputStream), (int) AbstractC0648c.i(inputStream));
        if (inputStream.read() > 0) {
            throw AbstractC0648c.c("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrE);
        try {
            C0647b[] c0647bArrX = x(byteArrayInputStream, str, iJ);
            byteArrayInputStream.close();
            return c0647bArrX;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static C0647b[] x(InputStream inputStream, String str, int i4) {
        if (inputStream.available() == 0) {
            return new C0647b[0];
        }
        C0647b[] c0647bArr = new C0647b[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            int iH = AbstractC0648c.h(inputStream);
            int iH2 = AbstractC0648c.h(inputStream);
            c0647bArr[i5] = new C0647b(str, AbstractC0648c.f(inputStream, iH), AbstractC0648c.i(inputStream), 0L, iH2, (int) AbstractC0648c.i(inputStream), (int) AbstractC0648c.i(inputStream), new int[iH2], new TreeMap());
        }
        for (int i6 = 0; i6 < i4; i6++) {
            C0647b c0647b = c0647bArr[i6];
            p(inputStream, c0647b);
            c0647b.f5920h = m(inputStream, c0647b.f5917e);
            v(inputStream, c0647b);
        }
        return c0647bArr;
    }

    public static int y(int i4) {
        return (i4 + 7) & (-8);
    }

    public static void z(byte[] bArr, int i4, int i5, C0647b c0647b) {
        int iL = l(i4, i5, c0647b.f5919g);
        int i6 = iL / 8;
        bArr[i6] = (byte) ((1 << (iL % 8)) | bArr[i6]);
    }
}
