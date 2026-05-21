package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: p.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1476b implements Collection, Set {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f10856q = new int[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Object[] f10857r = new Object[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static Object[] f10858s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f10859t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static Object[] f10860u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f10861v;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f10862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object[] f10863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC1480f f10865p;

    /* JADX INFO: renamed from: p.b$a */
    public class a extends AbstractC1480f {
        public a() {
        }

        @Override // p.AbstractC1480f
        public void a() {
            C1476b.this.clear();
        }

        @Override // p.AbstractC1480f
        public Object b(int i4, int i5) {
            return C1476b.this.f10863n[i4];
        }

        @Override // p.AbstractC1480f
        public Map c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // p.AbstractC1480f
        public int d() {
            return C1476b.this.f10864o;
        }

        @Override // p.AbstractC1480f
        public int e(Object obj) {
            return C1476b.this.indexOf(obj);
        }

        @Override // p.AbstractC1480f
        public int f(Object obj) {
            return C1476b.this.indexOf(obj);
        }

        @Override // p.AbstractC1480f
        public void g(Object obj, Object obj2) {
            C1476b.this.add(obj);
        }

        @Override // p.AbstractC1480f
        public void h(int i4) {
            C1476b.this.l(i4);
        }

        @Override // p.AbstractC1480f
        public Object i(int i4, Object obj) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C1476b() {
        this(0);
    }

    public static void g(int[] iArr, Object[] objArr, int i4) {
        if (iArr.length == 8) {
            synchronized (C1476b.class) {
                try {
                    if (f10861v < 10) {
                        objArr[0] = f10860u;
                        objArr[1] = iArr;
                        for (int i5 = i4 - 1; i5 >= 2; i5--) {
                            objArr[i5] = null;
                        }
                        f10860u = objArr;
                        f10861v++;
                    }
                } finally {
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (C1476b.class) {
                try {
                    if (f10859t < 10) {
                        objArr[0] = f10858s;
                        objArr[1] = iArr;
                        for (int i6 = i4 - 1; i6 >= 2; i6--) {
                            objArr[i6] = null;
                        }
                        f10858s = objArr;
                        f10859t++;
                    }
                } finally {
                }
            }
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i4;
        int i5;
        if (obj == null) {
            i5 = k();
            i4 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i4 = iHashCode;
            i5 = i(obj, iHashCode);
        }
        if (i5 >= 0) {
            return false;
        }
        int i6 = ~i5;
        int i7 = this.f10864o;
        int[] iArr = this.f10862m;
        if (i7 >= iArr.length) {
            int i8 = 8;
            if (i7 >= 8) {
                i8 = (i7 >> 1) + i7;
            } else if (i7 < 4) {
                i8 = 4;
            }
            Object[] objArr = this.f10863n;
            d(i8);
            int[] iArr2 = this.f10862m;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f10863n, 0, objArr.length);
            }
            g(iArr, objArr, this.f10864o);
        }
        int i9 = this.f10864o;
        if (i6 < i9) {
            int[] iArr3 = this.f10862m;
            int i10 = i6 + 1;
            System.arraycopy(iArr3, i6, iArr3, i10, i9 - i6);
            Object[] objArr2 = this.f10863n;
            System.arraycopy(objArr2, i6, objArr2, i10, this.f10864o - i6);
        }
        this.f10862m[i6] = i4;
        this.f10863n[i6] = obj;
        this.f10864o++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection collection) {
        f(this.f10864o + collection.size());
        Iterator it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i4 = this.f10864o;
        if (i4 != 0) {
            g(this.f10862m, this.f10863n, i4);
            this.f10862m = f10856q;
            this.f10863n = f10857r;
            this.f10864o = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final void d(int i4) {
        if (i4 == 8) {
            synchronized (C1476b.class) {
                try {
                    Object[] objArr = f10860u;
                    if (objArr != null) {
                        this.f10863n = objArr;
                        f10860u = (Object[]) objArr[0];
                        this.f10862m = (int[]) objArr[1];
                        objArr[1] = null;
                        objArr[0] = null;
                        f10861v--;
                        return;
                    }
                } finally {
                }
            }
        } else if (i4 == 4) {
            synchronized (C1476b.class) {
                try {
                    Object[] objArr2 = f10858s;
                    if (objArr2 != null) {
                        this.f10863n = objArr2;
                        f10858s = (Object[]) objArr2[0];
                        this.f10862m = (int[]) objArr2[1];
                        objArr2[1] = null;
                        objArr2[0] = null;
                        f10859t--;
                        return;
                    }
                } finally {
                }
            }
        }
        this.f10862m = new int[i4];
        this.f10863n = new Object[i4];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i4 = 0; i4 < this.f10864o; i4++) {
                try {
                    if (!set.contains(o(i4))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public void f(int i4) {
        int[] iArr = this.f10862m;
        if (iArr.length < i4) {
            Object[] objArr = this.f10863n;
            d(i4);
            int i5 = this.f10864o;
            if (i5 > 0) {
                System.arraycopy(iArr, 0, this.f10862m, 0, i5);
                System.arraycopy(objArr, 0, this.f10863n, 0, this.f10864o);
            }
            g(iArr, objArr, this.f10864o);
        }
    }

    public final AbstractC1480f h() {
        if (this.f10865p == null) {
            this.f10865p = new a();
        }
        return this.f10865p;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f10862m;
        int i4 = this.f10864o;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            i5 += iArr[i6];
        }
        return i5;
    }

    public final int i(Object obj, int i4) {
        int i5 = this.f10864o;
        if (i5 == 0) {
            return -1;
        }
        int iA = AbstractC1477c.a(this.f10862m, i5, i4);
        if (iA < 0 || obj.equals(this.f10863n[iA])) {
            return iA;
        }
        int i6 = iA + 1;
        while (i6 < i5 && this.f10862m[i6] == i4) {
            if (obj.equals(this.f10863n[i6])) {
                return i6;
            }
            i6++;
        }
        for (int i7 = iA - 1; i7 >= 0 && this.f10862m[i7] == i4; i7--) {
            if (obj.equals(this.f10863n[i7])) {
                return i7;
            }
        }
        return ~i6;
    }

    public int indexOf(Object obj) {
        return obj == null ? k() : i(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f10864o <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return h().m().iterator();
    }

    public final int k() {
        int i4 = this.f10864o;
        if (i4 == 0) {
            return -1;
        }
        int iA = AbstractC1477c.a(this.f10862m, i4, 0);
        if (iA < 0 || this.f10863n[iA] == null) {
            return iA;
        }
        int i5 = iA + 1;
        while (i5 < i4 && this.f10862m[i5] == 0) {
            if (this.f10863n[i5] == null) {
                return i5;
            }
            i5++;
        }
        for (int i6 = iA - 1; i6 >= 0 && this.f10862m[i6] == 0; i6--) {
            if (this.f10863n[i6] == null) {
                return i6;
            }
        }
        return ~i5;
    }

    public Object l(int i4) {
        Object[] objArr = this.f10863n;
        Object obj = objArr[i4];
        int i5 = this.f10864o;
        if (i5 <= 1) {
            g(this.f10862m, objArr, i5);
            this.f10862m = f10856q;
            this.f10863n = f10857r;
            this.f10864o = 0;
            return obj;
        }
        int[] iArr = this.f10862m;
        if (iArr.length <= 8 || i5 >= iArr.length / 3) {
            int i6 = i5 - 1;
            this.f10864o = i6;
            if (i4 < i6) {
                int i7 = i4 + 1;
                System.arraycopy(iArr, i7, iArr, i4, i6 - i4);
                Object[] objArr2 = this.f10863n;
                System.arraycopy(objArr2, i7, objArr2, i4, this.f10864o - i4);
            }
            this.f10863n[this.f10864o] = null;
            return obj;
        }
        d(i5 > 8 ? i5 + (i5 >> 1) : 8);
        this.f10864o--;
        if (i4 > 0) {
            System.arraycopy(iArr, 0, this.f10862m, 0, i4);
            System.arraycopy(objArr, 0, this.f10863n, 0, i4);
        }
        int i8 = this.f10864o;
        if (i4 < i8) {
            int i9 = i4 + 1;
            System.arraycopy(iArr, i9, this.f10862m, i4, i8 - i4);
            System.arraycopy(objArr, i9, this.f10863n, i4, this.f10864o - i4);
        }
        return obj;
    }

    public Object o(int i4) {
        return this.f10863n[i4];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        l(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        boolean z3 = false;
        for (int i4 = this.f10864o - 1; i4 >= 0; i4--) {
            if (!collection.contains(this.f10863n[i4])) {
                l(i4);
                z3 = true;
            }
        }
        return z3;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f10864o;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i4 = this.f10864o;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f10863n, 0, objArr, 0, i4);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f10864o * 14);
        sb.append('{');
        for (int i4 = 0; i4 < this.f10864o; i4++) {
            if (i4 > 0) {
                sb.append(", ");
            }
            Object objO = o(i4);
            if (objO != this) {
                sb.append(objO);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public C1476b(int i4) {
        if (i4 == 0) {
            this.f10862m = f10856q;
            this.f10863n = f10857r;
        } else {
            d(i4);
        }
        this.f10864o = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray(Object[] objArr) {
        if (objArr.length < this.f10864o) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), this.f10864o);
        }
        System.arraycopy(this.f10863n, 0, objArr, 0, this.f10864o);
        int length = objArr.length;
        int i4 = this.f10864o;
        if (length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
