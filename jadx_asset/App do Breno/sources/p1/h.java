package p1;

import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import o1.AbstractC1471h;

/* JADX INFO: loaded from: classes.dex */
public abstract class h extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object[] f10925m = new Object[0];

    public static abstract class a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f10926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f10927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f10928c;

        public a(int i4) {
            d.b(i4, "initialCapacity");
            this.f10926a = new Object[i4];
            this.f10927b = 0;
        }

        public b b(Object... objArr) {
            c(objArr, objArr.length);
            return this;
        }

        public final void c(Object[] objArr, int i4) {
            q.c(objArr, i4);
            d(this.f10927b + i4);
            System.arraycopy(objArr, 0, this.f10926a, this.f10927b, i4);
            this.f10927b += i4;
        }

        public final void d(int i4) {
            Object[] objArr = this.f10926a;
            if (objArr.length < i4) {
                this.f10926a = Arrays.copyOf(objArr, b.a(objArr.length, i4));
                this.f10928c = false;
            } else if (this.f10928c) {
                this.f10926a = (Object[]) objArr.clone();
                this.f10928c = false;
            }
        }
    }

    public static abstract class b {
        public static int a(int i4, int i5) {
            if (i5 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i4 + (i4 >> 1) + 1;
            if (iHighestOneBit < i5) {
                iHighestOneBit = Integer.highestOneBit(i5 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(Object obj);

    public abstract int d(Object[] objArr, int i4);

    public Object[] f() {
        return null;
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int h() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f10925m);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        AbstractC1471h.h(objArr);
        int size = size();
        if (objArr.length < size) {
            Object[] objArrF = f();
            if (objArrF != null) {
                return s.a(objArrF, h(), g(), objArr);
            }
            objArr = q.d(objArr, size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        d(objArr, 0);
        return objArr;
    }
}
