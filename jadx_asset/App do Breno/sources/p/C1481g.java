package p;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: renamed from: p.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1481g {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static Object[] f10898p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f10899q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static Object[] f10900r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f10901s;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f10902m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object[] f10903n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10904o;

    public C1481g() {
        this.f10902m = AbstractC1477c.f10867a;
        this.f10903n = AbstractC1477c.f10869c;
        this.f10904o = 0;
    }

    public static int b(int[] iArr, int i4, int i5) {
        try {
            return AbstractC1477c.a(iArr, i4, i5);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static void d(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (C1481g.class) {
                try {
                    if (f10901s < 10) {
                        objArr[0] = f10900r;
                        objArr[1] = iArr;
                        for (int i5 = (i4 << 1) - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f10900r = objArr;
                        f10901s++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1481g.class) {
                try {
                    if (f10899q < 10) {
                        objArr[0] = f10898p;
                        objArr[1] = iArr;
                        for (int i6 = (i4 << 1) - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f10898p = objArr;
                        f10899q++;
                    }
                } finally {
                }
            }
        }
    }

    public final void a(int i4) {
        if (i4 == 8) {
            synchronized (C1481g.class) {
                try {
                    Object[] objArr = f10900r;
                    if (objArr != null) {
                        this.f10903n = objArr;
                        f10900r = (Object[]) objArr[0];
                        this.f10902m = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f10901s--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i4 == 4) {
            synchronized (C1481g.class) {
                try {
                    Object[] objArr2 = f10898p;
                    if (objArr2 != null) {
                        this.f10903n = objArr2;
                        f10898p = (Object[]) objArr2[0];
                        this.f10902m = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f10899q--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f10902m = new int[i4];
        this.f10903n = new Object[i4 << 1];
    }

    public void c(int i4) {
        int i5 = this.f10904o;
        int[] iArr = this.f10902m;
        if (iArr.length < i4) {
            Object[] objArr = this.f10903n;
            a(i4);
            if (this.f10904o > 0) {
                System.arraycopy(iArr, 0, this.f10902m, 0, i5);
                System.arraycopy(objArr, 0, this.f10903n, 0, i5 << 1);
            }
            d(iArr, objArr, i5);
        }
        if (this.f10904o != i5) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i4 = this.f10904o;
        if (i4 > 0) {
            int[] iArr = this.f10902m;
            Object[] objArr = this.f10903n;
            this.f10902m = AbstractC1477c.f10867a;
            this.f10903n = AbstractC1477c.f10869c;
            this.f10904o = 0;
            d(iArr, objArr, i4);
        }
        if (this.f10904o > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    public int e(Object obj, int i4) {
        int i5 = this.f10904o;
        if (i5 == 0) {
            return -1;
        }
        int iB = b(this.f10902m, i5, i4);
        if (iB < 0 || obj.equals(this.f10903n[iB << 1])) {
            return iB;
        }
        int i6 = iB + 1;
        while (i6 < i5 && this.f10902m[i6] == i4) {
            if (obj.equals(this.f10903n[i6 << 1])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iB - 1; i7 >= 0 && this.f10902m[i7] == i4; i7--) {
            if (obj.equals(this.f10903n[i7 << 1])) {
                return i7;
            }
        }
        return ~i6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1481g) {
            C1481g c1481g = (C1481g) obj;
            if (size() != c1481g.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f10904o; i4++) {
                try {
                    Object objI = i(i4);
                    Object objM = m(i4);
                    Object obj2 = c1481g.get(objI);
                    if (objM == null) {
                        if (obj2 != null || !c1481g.containsKey(objI)) {
                            return false;
                        }
                    } else if (!objM.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i5 = 0; i5 < this.f10904o; i5++) {
                try {
                    Object objI2 = i(i5);
                    Object objM2 = m(i5);
                    Object obj3 = map.get(objI2);
                    if (objM2 == null) {
                        if (obj3 != null || !map.containsKey(objI2)) {
                            return false;
                        }
                    } else if (!objM2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f(Object obj) {
        return obj == null ? g() : e(obj, obj.hashCode());
    }

    public int g() {
        int i4 = this.f10904o;
        if (i4 == 0) {
            return -1;
        }
        int iB = b(this.f10902m, i4, 0);
        if (iB < 0 || this.f10903n[iB << 1] == null) {
            return iB;
        }
        int i5 = iB + 1;
        while (i5 < i4 && this.f10902m[i5] == 0) {
            if (this.f10903n[i5 << 1] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iB - 1; i6 >= 0 && this.f10902m[i6] == 0; i6--) {
            if (this.f10903n[i6 << 1] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public Object get(Object obj) {
        return getOrDefault(obj, null);
    }

    public Object getOrDefault(Object obj, Object obj2) {
        int iF = f(obj);
        return iF >= 0 ? this.f10903n[(iF << 1) + 1] : obj2;
    }

    public int h(Object obj) {
        int i4 = this.f10904o * 2;
        Object[] objArr = this.f10903n;
        if (obj == null) {
            for (int i5 = 1; i5 < i4; i5 += 2) {
                if (objArr[i5] == null) {
                    return i5 >> 1;
                }
            }
            return -1;
        }
        for (int i6 = 1; i6 < i4; i6 += 2) {
            if (obj.equals(objArr[i6])) {
                return i6 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f10902m;
        Object[] objArr = this.f10903n;
        int i4 = this.f10904o;
        int i5 = 1;
        int i6 = 0;
        int iHashCode = 0;
        while (i6 < i4) {
            Object obj = objArr[i5];
            iHashCode += (obj == null ? 0 : obj.hashCode()) ^ iArr[i6];
            i6++;
            i5 += 2;
        }
        return iHashCode;
    }

    public Object i(int i4) {
        return this.f10903n[i4 << 1];
    }

    public boolean isEmpty() {
        return this.f10904o <= 0;
    }

    public void j(C1481g c1481g) {
        int i4 = c1481g.f10904o;
        c(this.f10904o + i4);
        if (this.f10904o != 0) {
            for (int i5 = 0; i5 < i4; i5++) {
                put(c1481g.i(i5), c1481g.m(i5));
            }
        } else if (i4 > 0) {
            System.arraycopy(c1481g.f10902m, 0, this.f10902m, 0, i4);
            System.arraycopy(c1481g.f10903n, 0, this.f10903n, 0, i4 << 1);
            this.f10904o = i4;
        }
    }

    public Object k(int i4) {
        Object[] objArr = this.f10903n;
        int i5 = i4 << 1;
        Object obj = objArr[i5 + 1];
        int i6 = this.f10904o;
        int i7 = 0;
        if (i6 <= 1) {
            d(this.f10902m, objArr, i6);
            this.f10902m = AbstractC1477c.f10867a;
            this.f10903n = AbstractC1477c.f10869c;
        } else {
            int i8 = i6 - 1;
            int[] iArr = this.f10902m;
            if (iArr.length <= 8 || i6 >= iArr.length / 3) {
                if (i4 < i8) {
                    int i9 = i4 + 1;
                    int i10 = i8 - i4;
                    System.arraycopy(iArr, i9, iArr, i4, i10);
                    Object[] objArr2 = this.f10903n;
                    System.arraycopy(objArr2, i9 << 1, objArr2, i5, i10 << 1);
                }
                Object[] objArr3 = this.f10903n;
                int i11 = i8 << 1;
                objArr3[i11] = null;
                objArr3[i11 + 1] = null;
            } else {
                a(i6 > 8 ? i6 + (i6 >> 1) : 8);
                if (i6 != this.f10904o) {
                    throw new ConcurrentModificationException();
                }
                if (i4 > 0) {
                    System.arraycopy(iArr, 0, this.f10902m, 0, i4);
                    System.arraycopy(objArr, 0, this.f10903n, 0, i5);
                }
                if (i4 < i8) {
                    int i12 = i4 + 1;
                    int i13 = i8 - i4;
                    System.arraycopy(iArr, i12, this.f10902m, i4, i13);
                    System.arraycopy(objArr, i12 << 1, this.f10903n, i5, i13 << 1);
                }
            }
            i7 = i8;
        }
        if (i6 != this.f10904o) {
            throw new ConcurrentModificationException();
        }
        this.f10904o = i7;
        return obj;
    }

    public Object l(int i4, Object obj) {
        int i5 = (i4 << 1) + 1;
        Object[] objArr = this.f10903n;
        Object obj2 = objArr[i5];
        objArr[i5] = obj;
        return obj2;
    }

    public Object m(int i4) {
        return this.f10903n[(i4 << 1) + 1];
    }

    public Object put(Object obj, Object obj2) {
        int i4;
        int iE;
        int i5 = this.f10904o;
        if (obj == null) {
            iE = g();
            i4 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i4 = iHashCode;
            iE = e(obj, iHashCode);
        }
        if (iE >= 0) {
            int i6 = (iE << 1) + 1;
            Object[] objArr = this.f10903n;
            Object obj3 = objArr[i6];
            objArr[i6] = obj2;
            return obj3;
        }
        int i7 = ~iE;
        int[] iArr = this.f10902m;
        if (i5 >= iArr.length) {
            int i8 = 8;
            if (i5 >= 8) {
                i8 = (i5 >> 1) + i5;
            } else if (i5 < 4) {
                i8 = 4;
            }
            Object[] objArr2 = this.f10903n;
            a(i8);
            if (i5 != this.f10904o) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f10902m;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f10903n, 0, objArr2.length);
            }
            d(iArr, objArr2, i5);
        }
        if (i7 < i5) {
            int[] iArr3 = this.f10902m;
            int i9 = i7 + 1;
            System.arraycopy(iArr3, i7, iArr3, i9, i5 - i7);
            Object[] objArr3 = this.f10903n;
            System.arraycopy(objArr3, i7 << 1, objArr3, i9 << 1, (this.f10904o - i7) << 1);
        }
        int i10 = this.f10904o;
        if (i5 == i10) {
            int[] iArr4 = this.f10902m;
            if (i7 < iArr4.length) {
                iArr4[i7] = i4;
                Object[] objArr4 = this.f10903n;
                int i11 = i7 << 1;
                objArr4[i11] = obj;
                objArr4[i11 + 1] = obj2;
                this.f10904o = i10 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public Object putIfAbsent(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? put(obj, obj2) : obj3;
    }

    public Object remove(Object obj) {
        int iF = f(obj);
        if (iF >= 0) {
            return k(iF);
        }
        return null;
    }

    public Object replace(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF >= 0) {
            return l(iF, obj2);
        }
        return null;
    }

    public int size() {
        return this.f10904o;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10904o * 28);
        sb.append('{');
        for (int i4 = 0; i4 < this.f10904o; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object objI = i(i4);
            if (objI != this) {
                sb.append(objI);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object objM = m(i4);
            if (objM != this) {
                sb.append(objM);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        Object objM = m(iF);
        if (obj2 != objM && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        k(iF);
        return true;
    }

    public boolean replace(Object obj, Object obj2, Object obj3) {
        int iF = f(obj);
        if (iF < 0) {
            return false;
        }
        Object objM = m(iF);
        if (objM != obj2 && (obj2 == null || !obj2.equals(objM))) {
            return false;
        }
        l(iF, obj3);
        return true;
    }

    public C1481g(int i4) {
        if (i4 == 0) {
            this.f10902m = AbstractC1477c.f10867a;
            this.f10903n = AbstractC1477c.f10869c;
        } else {
            a(i4);
        }
        this.f10904o = 0;
    }

    public C1481g(C1481g c1481g) {
        this();
        if (c1481g != null) {
            j(c1481g);
        }
    }
}
