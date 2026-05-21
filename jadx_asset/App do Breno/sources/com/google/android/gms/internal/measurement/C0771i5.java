package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0771i5 extends AbstractC0812n4 implements RandomAccess, InterfaceC0699a5, A5 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long[] f6763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0771i5 f6764q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long[] f6765n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6766o;

    static {
        long[] jArr = new long[0];
        f6763p = jArr;
        f6764q = new C0771i5(jArr, 0, false);
    }

    public C0771i5(long[] jArr, int i4, boolean z3) {
        super(z3);
        this.f6765n = jArr;
        this.f6766o = i4;
    }

    public static C0771i5 f() {
        return f6764q;
    }

    public static int i(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0699a5
    public final long a(int i4) {
        l(i4);
        return this.f6765n[i4];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        long jLongValue = ((Long) obj).longValue();
        d();
        if (i4 < 0 || i4 > (i5 = this.f6766o)) {
            throw new IndexOutOfBoundsException(k(i4));
        }
        int i6 = i4 + 1;
        long[] jArr = this.f6765n;
        int length = jArr.length;
        if (i5 < length) {
            System.arraycopy(jArr, i4, jArr, i6, i5 - i4);
        } else {
            long[] jArr2 = new long[i(length)];
            System.arraycopy(this.f6765n, 0, jArr2, 0, i4);
            System.arraycopy(this.f6765n, i4, jArr2, i6, this.f6766o - i4);
            this.f6765n = jArr2;
        }
        this.f6765n[i4] = jLongValue;
        this.f6766o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0812n4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = AbstractC0717c5.f6667a;
        collection.getClass();
        if (!(collection instanceof C0771i5)) {
            return super.addAll(collection);
        }
        C0771i5 c0771i5 = (C0771i5) collection;
        int i4 = c0771i5.f6766o;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f6766o;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        long[] jArr = this.f6765n;
        if (i6 > jArr.length) {
            this.f6765n = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(c0771i5.f6765n, 0, this.f6765n, this.f6766o, c0771i5.f6766o);
        this.f6766o = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0812n4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0771i5)) {
            return super.equals(obj);
        }
        C0771i5 c0771i5 = (C0771i5) obj;
        if (this.f6766o != c0771i5.f6766o) {
            return false;
        }
        long[] jArr = c0771i5.f6765n;
        for (int i4 = 0; i4 < this.f6766o; i4++) {
            if (this.f6765n[i4] != jArr[i4]) {
                return false;
            }
        }
        return true;
    }

    public final void g(long j4) {
        d();
        int i4 = this.f6766o;
        int length = this.f6765n.length;
        if (i4 == length) {
            long[] jArr = new long[i(length)];
            System.arraycopy(this.f6765n, 0, jArr, 0, this.f6766o);
            this.f6765n = jArr;
        }
        long[] jArr2 = this.f6765n;
        int i5 = this.f6766o;
        this.f6766o = i5 + 1;
        jArr2[i5] = j4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        l(i4);
        return Long.valueOf(this.f6765n[i4]);
    }

    public final void h(int i4) {
        int length = this.f6765n.length;
        if (i4 <= length) {
            return;
        }
        if (length == 0) {
            this.f6765n = new long[Math.max(i4, 10)];
            return;
        }
        while (length < i4) {
            length = i(length);
        }
        this.f6765n = Arrays.copyOf(this.f6765n, length);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0812n4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f6766o; i5++) {
            long j4 = this.f6765n[i5];
            Charset charset = AbstractC0717c5.f6667a;
            i4 = (i4 * 31) + ((int) (j4 ^ (j4 >>> 32)));
        }
        return i4;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i4 = this.f6766o;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f6765n[i5] == jLongValue) {
                return i5;
            }
        }
        return -1;
    }

    public final String k(int i4) {
        return "Index:" + i4 + ", Size:" + this.f6766o;
    }

    public final void l(int i4) {
        if (i4 < 0 || i4 >= this.f6766o) {
            throw new IndexOutOfBoundsException(k(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0708b5
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0699a5 e(int i4) {
        if (i4 >= this.f6766o) {
            return new C0771i5(i4 == 0 ? f6763p : Arrays.copyOf(this.f6765n, i4), this.f6766o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0812n4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        d();
        l(i4);
        long[] jArr = this.f6765n;
        long j4 = jArr[i4];
        if (i4 < this.f6766o - 1) {
            System.arraycopy(jArr, i4 + 1, jArr, i4, (r3 - i4) - 1);
        }
        this.f6766o--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        d();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f6765n;
        System.arraycopy(jArr, i5, jArr, i4, this.f6766o - i5);
        this.f6766o -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        d();
        l(i4);
        long[] jArr = this.f6765n;
        long j4 = jArr[i4];
        jArr[i4] = jLongValue;
        return Long.valueOf(j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6766o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Long) obj).longValue());
        return true;
    }
}
