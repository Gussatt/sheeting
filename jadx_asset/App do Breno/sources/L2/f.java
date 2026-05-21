package L2;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC0481d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f2755p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Object[] f2756q = new Object[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f2757m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object[] f2758n = f2756q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2759o;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        X2.l.e(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        t();
        k(size() + collection.size());
        g(s(this.f2757m + size()), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        t();
        k(size() + 1);
        int i4 = i(this.f2757m);
        this.f2757m = i4;
        this.f2758n[i4] = obj;
        this.f2759o = size() + 1;
    }

    public final void addLast(Object obj) {
        t();
        k(size() + 1);
        this.f2758n[s(this.f2757m + size())] = obj;
        this.f2759o = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (!isEmpty()) {
            t();
            p(this.f2757m, s(this.f2757m + size()));
        }
        this.f2757m = 0;
        this.f2759o = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // L2.AbstractC0481d
    public int d() {
        return this.f2759o;
    }

    @Override // L2.AbstractC0481d
    public Object f(int i4) {
        AbstractC0480c.f2746m.a(i4, size());
        if (i4 == m.h(this)) {
            return removeLast();
        }
        if (i4 == 0) {
            return removeFirst();
        }
        t();
        int iS = s(this.f2757m + i4);
        Object obj = this.f2758n[iS];
        if (i4 < (size() >> 1)) {
            int i5 = this.f2757m;
            if (iS >= i5) {
                Object[] objArr = this.f2758n;
                i.e(objArr, objArr, i5 + 1, i5, iS);
            } else {
                Object[] objArr2 = this.f2758n;
                i.e(objArr2, objArr2, 1, 0, iS);
                Object[] objArr3 = this.f2758n;
                objArr3[0] = objArr3[objArr3.length - 1];
                int i6 = this.f2757m;
                i.e(objArr3, objArr3, i6 + 1, i6, objArr3.length - 1);
            }
            Object[] objArr4 = this.f2758n;
            int i7 = this.f2757m;
            objArr4[i7] = null;
            this.f2757m = l(i7);
        } else {
            int iS2 = s(this.f2757m + m.h(this));
            if (iS <= iS2) {
                Object[] objArr5 = this.f2758n;
                i.e(objArr5, objArr5, iS, iS + 1, iS2 + 1);
            } else {
                Object[] objArr6 = this.f2758n;
                i.e(objArr6, objArr6, iS, iS + 1, objArr6.length);
                Object[] objArr7 = this.f2758n;
                objArr7[objArr7.length - 1] = objArr7[0];
                i.e(objArr7, objArr7, 0, 1, iS2 + 1);
            }
            this.f2758n[iS2] = null;
        }
        this.f2759o = size() - 1;
        return obj;
    }

    public final void g(int i4, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f2758n.length;
        while (i4 < length && it.hasNext()) {
            this.f2758n[i4] = it.next();
            i4++;
        }
        int i5 = this.f2757m;
        for (int i6 = 0; i6 < i5 && it.hasNext(); i6++) {
            this.f2758n[i6] = it.next();
        }
        this.f2759o = size() + collection.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i4) {
        AbstractC0480c.f2746m.a(i4, size());
        return this.f2758n[s(this.f2757m + i4)];
    }

    public final void h(int i4) {
        Object[] objArr = new Object[i4];
        Object[] objArr2 = this.f2758n;
        i.e(objArr2, objArr, 0, this.f2757m, objArr2.length);
        Object[] objArr3 = this.f2758n;
        int length = objArr3.length;
        int i5 = this.f2757m;
        i.e(objArr3, objArr, length - i5, 0, i5);
        this.f2757m = 0;
        this.f2758n = objArr;
    }

    public final int i(int i4) {
        return i4 == 0 ? j.o(this.f2758n) : i4 - 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        int i4;
        int iS = s(this.f2757m + size());
        int length = this.f2757m;
        if (length < iS) {
            while (length < iS) {
                if (X2.l.a(obj, this.f2758n[length])) {
                    i4 = this.f2757m;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iS) {
            return -1;
        }
        int length2 = this.f2758n.length;
        while (true) {
            if (length >= length2) {
                for (int i5 = 0; i5 < iS; i5++) {
                    if (X2.l.a(obj, this.f2758n[i5])) {
                        length = i5 + this.f2758n.length;
                        i4 = this.f2757m;
                    }
                }
                return -1;
            }
            if (X2.l.a(obj, this.f2758n[length])) {
                i4 = this.f2757m;
                break;
            }
            length++;
        }
        return length - i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return size() == 0;
    }

    public final void k(int i4) {
        if (i4 < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f2758n;
        if (i4 <= objArr.length) {
            return;
        }
        if (objArr == f2756q) {
            this.f2758n = new Object[c3.e.a(i4, 10)];
        } else {
            h(AbstractC0480c.f2746m.d(objArr.length, i4));
        }
    }

    public final int l(int i4) {
        if (i4 == j.o(this.f2758n)) {
            return 0;
        }
        return i4 + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        int iO;
        int i4;
        int iS = s(this.f2757m + size());
        int i5 = this.f2757m;
        if (i5 < iS) {
            iO = iS - 1;
            if (i5 <= iO) {
                while (!X2.l.a(obj, this.f2758n[iO])) {
                    if (iO != i5) {
                        iO--;
                    }
                }
                i4 = this.f2757m;
                return iO - i4;
            }
            return -1;
        }
        if (i5 > iS) {
            int i6 = iS - 1;
            while (true) {
                if (-1 >= i6) {
                    iO = j.o(this.f2758n);
                    int i7 = this.f2757m;
                    if (i7 <= iO) {
                        while (!X2.l.a(obj, this.f2758n[iO])) {
                            if (iO != i7) {
                                iO--;
                            }
                        }
                        i4 = this.f2757m;
                    }
                } else {
                    if (X2.l.a(obj, this.f2758n[i6])) {
                        iO = i6 + this.f2758n.length;
                        i4 = this.f2757m;
                        break;
                    }
                    i6--;
                }
            }
        }
        return -1;
    }

    public final int o(int i4) {
        return i4 < 0 ? i4 + this.f2758n.length : i4;
    }

    public final void p(int i4, int i5) {
        if (i4 < i5) {
            i.j(this.f2758n, null, i4, i5);
            return;
        }
        Object[] objArr = this.f2758n;
        i.j(objArr, null, i4, objArr.length);
        i.j(this.f2758n, null, 0, i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection collection) {
        int iS;
        X2.l.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f2758n.length != 0) {
            int iS2 = s(this.f2757m + size());
            int i4 = this.f2757m;
            if (i4 < iS2) {
                iS = i4;
                while (i4 < iS2) {
                    Object obj = this.f2758n[i4];
                    if (collection.contains(obj)) {
                        z3 = true;
                    } else {
                        this.f2758n[iS] = obj;
                        iS++;
                    }
                    i4++;
                }
                i.j(this.f2758n, null, iS, iS2);
            } else {
                int length = this.f2758n.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f2758n;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (collection.contains(obj2)) {
                        z4 = true;
                    } else {
                        this.f2758n[i5] = obj2;
                        i5++;
                    }
                    i4++;
                }
                iS = s(i5);
                for (int i6 = 0; i6 < iS2; i6++) {
                    Object[] objArr2 = this.f2758n;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        z4 = true;
                    } else {
                        this.f2758n[iS] = obj3;
                        iS = l(iS);
                    }
                }
                z3 = z4;
            }
            if (z3) {
                t();
                this.f2759o = o(iS - this.f2757m);
            }
        }
        return z3;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        Object[] objArr = this.f2758n;
        int i4 = this.f2757m;
        Object obj = objArr[i4];
        objArr[i4] = null;
        this.f2757m = l(i4);
        this.f2759o = size() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        t();
        int iS = s(this.f2757m + m.h(this));
        Object[] objArr = this.f2758n;
        Object obj = objArr[iS];
        objArr[iS] = null;
        this.f2759o = size() - 1;
        return obj;
    }

    @Override // java.util.AbstractList
    public void removeRange(int i4, int i5) {
        AbstractC0480c.f2746m.c(i4, i5, size());
        int i6 = i5 - i4;
        if (i6 == 0) {
            return;
        }
        if (i6 == size()) {
            clear();
            return;
        }
        if (i6 == 1) {
            remove(i4);
            return;
        }
        t();
        if (i4 < size() - i5) {
            v(i4, i5);
            int iS = s(this.f2757m + i6);
            p(this.f2757m, iS);
            this.f2757m = iS;
        } else {
            w(i4, i5);
            int iS2 = s(this.f2757m + size());
            p(o(iS2 - i6), iS2);
        }
        this.f2759o = size() - i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection collection) {
        int iS;
        X2.l.e(collection, "elements");
        boolean z3 = false;
        z3 = false;
        z3 = false;
        if (!isEmpty() && this.f2758n.length != 0) {
            int iS2 = s(this.f2757m + size());
            int i4 = this.f2757m;
            if (i4 < iS2) {
                iS = i4;
                while (i4 < iS2) {
                    Object obj = this.f2758n[i4];
                    if (collection.contains(obj)) {
                        this.f2758n[iS] = obj;
                        iS++;
                    } else {
                        z3 = true;
                    }
                    i4++;
                }
                i.j(this.f2758n, null, iS, iS2);
            } else {
                int length = this.f2758n.length;
                boolean z4 = false;
                int i5 = i4;
                while (i4 < length) {
                    Object[] objArr = this.f2758n;
                    Object obj2 = objArr[i4];
                    objArr[i4] = null;
                    if (collection.contains(obj2)) {
                        this.f2758n[i5] = obj2;
                        i5++;
                    } else {
                        z4 = true;
                    }
                    i4++;
                }
                iS = s(i5);
                for (int i6 = 0; i6 < iS2; i6++) {
                    Object[] objArr2 = this.f2758n;
                    Object obj3 = objArr2[i6];
                    objArr2[i6] = null;
                    if (collection.contains(obj3)) {
                        this.f2758n[iS] = obj3;
                        iS = l(iS);
                    } else {
                        z4 = true;
                    }
                }
                z3 = z4;
            }
            if (z3) {
                t();
                this.f2759o = o(iS - this.f2757m);
            }
        }
        return z3;
    }

    public final int s(int i4) {
        Object[] objArr = this.f2758n;
        return i4 >= objArr.length ? i4 - objArr.length : i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i4, Object obj) {
        AbstractC0480c.f2746m.a(i4, size());
        int iS = s(this.f2757m + i4);
        Object[] objArr = this.f2758n;
        Object obj2 = objArr[iS];
        objArr[iS] = obj;
        return obj2;
    }

    public final void t() {
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        X2.l.e(objArr, "array");
        if (objArr.length < size()) {
            objArr = g.a(objArr, size());
        }
        Object[] objArr2 = objArr;
        int iS = s(this.f2757m + size());
        int i4 = this.f2757m;
        if (i4 < iS) {
            i.g(this.f2758n, objArr2, 0, i4, iS, 2, null);
        } else if (!isEmpty()) {
            Object[] objArr3 = this.f2758n;
            i.e(objArr3, objArr2, 0, this.f2757m, objArr3.length);
            Object[] objArr4 = this.f2758n;
            i.e(objArr4, objArr2, objArr4.length - this.f2757m, 0, iS);
        }
        return l.c(size(), objArr2);
    }

    public final Object u() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final void v(int i4, int i5) {
        int iS = s(this.f2757m + (i4 - 1));
        int iS2 = s(this.f2757m + (i5 - 1));
        while (i4 > 0) {
            int i6 = iS + 1;
            int iMin = Math.min(i4, Math.min(i6, iS2 + 1));
            Object[] objArr = this.f2758n;
            int i7 = iS2 - iMin;
            int i8 = iS - iMin;
            i.e(objArr, objArr, i7 + 1, i8 + 1, i6);
            iS = o(i8);
            iS2 = o(i7);
            i4 -= iMin;
        }
    }

    public final void w(int i4, int i5) {
        int iS = s(this.f2757m + i5);
        int iS2 = s(this.f2757m + i4);
        int size = size();
        while (true) {
            size -= i5;
            if (size <= 0) {
                return;
            }
            Object[] objArr = this.f2758n;
            i5 = Math.min(size, Math.min(objArr.length - iS, objArr.length - iS2));
            Object[] objArr2 = this.f2758n;
            int i6 = iS + i5;
            i.e(objArr2, objArr2, iS2, iS, i6);
            iS = s(i6);
            iS2 = s(iS2 + i5);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i4, Object obj) {
        AbstractC0480c.f2746m.b(i4, size());
        if (i4 == size()) {
            addLast(obj);
            return;
        }
        if (i4 == 0) {
            addFirst(obj);
            return;
        }
        t();
        k(size() + 1);
        int iS = s(this.f2757m + i4);
        if (i4 < ((size() + 1) >> 1)) {
            int i5 = i(iS);
            int i6 = i(this.f2757m);
            int i7 = this.f2757m;
            if (i5 >= i7) {
                Object[] objArr = this.f2758n;
                objArr[i6] = objArr[i7];
                i.e(objArr, objArr, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr2 = this.f2758n;
                i.e(objArr2, objArr2, i7 - 1, i7, objArr2.length);
                Object[] objArr3 = this.f2758n;
                objArr3[objArr3.length - 1] = objArr3[0];
                i.e(objArr3, objArr3, 0, 1, i5 + 1);
            }
            this.f2758n[i5] = obj;
            this.f2757m = i6;
        } else {
            int iS2 = s(this.f2757m + size());
            if (iS < iS2) {
                Object[] objArr4 = this.f2758n;
                i.e(objArr4, objArr4, iS + 1, iS, iS2);
            } else {
                Object[] objArr5 = this.f2758n;
                i.e(objArr5, objArr5, 1, 0, iS2);
                Object[] objArr6 = this.f2758n;
                objArr6[0] = objArr6[objArr6.length - 1];
                i.e(objArr6, objArr6, iS + 1, iS, objArr6.length - 1);
            }
            this.f2758n[iS] = obj;
        }
        this.f2759o = size() + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i4, Collection collection) {
        X2.l.e(collection, "elements");
        AbstractC0480c.f2746m.b(i4, size());
        if (collection.isEmpty()) {
            return false;
        }
        if (i4 == size()) {
            return addAll(collection);
        }
        t();
        k(size() + collection.size());
        int iS = s(this.f2757m + size());
        int iS2 = s(this.f2757m + i4);
        int size = collection.size();
        if (i4 < ((size() + 1) >> 1)) {
            int i5 = this.f2757m;
            int length = i5 - size;
            if (iS2 < i5) {
                Object[] objArr = this.f2758n;
                i.e(objArr, objArr, length, i5, objArr.length);
                if (size >= iS2) {
                    Object[] objArr2 = this.f2758n;
                    i.e(objArr2, objArr2, objArr2.length - size, 0, iS2);
                } else {
                    Object[] objArr3 = this.f2758n;
                    i.e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f2758n;
                    i.e(objArr4, objArr4, 0, size, iS2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f2758n;
                i.e(objArr5, objArr5, length, i5, iS2);
            } else {
                Object[] objArr6 = this.f2758n;
                length += objArr6.length;
                int i6 = iS2 - i5;
                int length2 = objArr6.length - length;
                if (length2 >= i6) {
                    i.e(objArr6, objArr6, length, i5, iS2);
                } else {
                    i.e(objArr6, objArr6, length, i5, i5 + length2);
                    Object[] objArr7 = this.f2758n;
                    i.e(objArr7, objArr7, 0, this.f2757m + length2, iS2);
                }
            }
            this.f2757m = length;
            g(o(iS2 - size), collection);
        } else {
            int i7 = iS2 + size;
            if (iS2 < iS) {
                int i8 = size + iS;
                Object[] objArr8 = this.f2758n;
                if (i8 <= objArr8.length) {
                    i.e(objArr8, objArr8, i7, iS2, iS);
                } else if (i7 >= objArr8.length) {
                    i.e(objArr8, objArr8, i7 - objArr8.length, iS2, iS);
                } else {
                    int length3 = iS - (i8 - objArr8.length);
                    i.e(objArr8, objArr8, 0, length3, iS);
                    Object[] objArr9 = this.f2758n;
                    i.e(objArr9, objArr9, i7, iS2, length3);
                }
            } else {
                Object[] objArr10 = this.f2758n;
                i.e(objArr10, objArr10, size, 0, iS);
                Object[] objArr11 = this.f2758n;
                if (i7 >= objArr11.length) {
                    i.e(objArr11, objArr11, i7 - objArr11.length, iS2, objArr11.length);
                } else {
                    i.e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f2758n;
                    i.e(objArr12, objArr12, i7, iS2, objArr12.length - size);
                }
            }
            g(iS2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
