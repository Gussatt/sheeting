package p1;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;
import o1.AbstractC1471h;

/* JADX INFO: loaded from: classes.dex */
public abstract class k extends h implements Set {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient i f10946n;

    public static int k(int i4) {
        int iMax = Math.max(i4, 2);
        if (iMax >= 751619276) {
            AbstractC1471h.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    public static k l(int i4, Object... objArr) {
        if (i4 == 0) {
            return t();
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return u(obj);
        }
        int iK = k(i4);
        Object[] objArr2 = new Object[iK];
        int i5 = iK - 1;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            Object objA = q.a(objArr[i8], i8);
            int iHashCode = objA.hashCode();
            int iA = g.a(iHashCode);
            while (true) {
                int i9 = iA & i5;
                Object obj2 = objArr2[i9];
                if (obj2 == null) {
                    objArr[i7] = objA;
                    objArr2[i9] = objA;
                    i6 += iHashCode;
                    i7++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iA++;
            }
        }
        Arrays.fill(objArr, i7, i4, (Object) null);
        if (i7 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new x(obj3);
        }
        if (k(i7) < iK / 2) {
            return l(i7, objArr);
        }
        if (x(i7, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i7);
        }
        return new v(objArr, i6, objArr2, i5, i7);
    }

    public static k t() {
        return v.f10970u;
    }

    public static k u(Object obj) {
        return new x(obj);
    }

    public static k v(Object obj, Object obj2, Object obj3) {
        return l(3, obj, obj2, obj3);
    }

    public static k w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        AbstractC1471h.e(objArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = objArr.length + 6;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, objArr.length);
        return l(length, objArr2);
    }

    public static boolean x(int i4, int i5) {
        return i4 < (i5 >> 1) + (i5 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k) && p() && ((k) obj).p() && hashCode() != obj.hashCode()) {
            return false;
        }
        return w.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return w.b(this);
    }

    public i i() {
        i iVar = this.f10946n;
        if (iVar != null) {
            return iVar;
        }
        i iVarO = o();
        this.f10946n = iVarO;
        return iVarO;
    }

    public i o() {
        return i.i(toArray());
    }

    public boolean p() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public abstract z iterator();
}
