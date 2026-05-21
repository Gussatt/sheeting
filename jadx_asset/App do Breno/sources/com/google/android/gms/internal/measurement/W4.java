package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class W4 extends AbstractC0812n4 implements RandomAccess, Z4, A5 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int[] f6609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final W4 f6610q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int[] f6611n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6612o;

    static {
        int[] iArr = new int[0];
        f6609p = iArr;
        f6610q = new W4(iArr, 0, false);
    }

    public W4(int[] iArr, int i4, boolean z3) {
        super(z3);
        this.f6611n = iArr;
        this.f6612o = i4;
    }

    public static W4 g() {
        return f6610q;
    }

    public static int k(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i4, Object obj) {
        int i5;
        int iIntValue = ((Integer) obj).intValue();
        d();
        if (i4 < 0 || i4 > (i5 = this.f6612o)) {
            throw new IndexOutOfBoundsException(l(i4));
        }
        int i6 = i4 + 1;
        int[] iArr = this.f6611n;
        int length = iArr.length;
        if (i5 < length) {
            System.arraycopy(iArr, i4, iArr, i6, i5 - i4);
        } else {
            int[] iArr2 = new int[k(length)];
            System.arraycopy(this.f6611n, 0, iArr2, 0, i4);
            System.arraycopy(this.f6611n, i4, iArr2, i6, this.f6612o - i4);
            this.f6611n = iArr2;
        }
        this.f6611n[i4] = iIntValue;
        this.f6612o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0812n4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        d();
        Charset charset = AbstractC0717c5.f6667a;
        collection.getClass();
        if (!(collection instanceof W4)) {
            return super.addAll(collection);
        }
        W4 w4 = (W4) collection;
        int i4 = w4.f6612o;
        if (i4 == 0) {
            return false;
        }
        int i5 = this.f6612o;
        if (Integer.MAX_VALUE - i5 < i4) {
            throw new OutOfMemoryError();
        }
        int i6 = i5 + i4;
        int[] iArr = this.f6611n;
        if (i6 > iArr.length) {
            this.f6611n = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(w4.f6611n, 0, this.f6611n, this.f6612o, w4.f6612o);
        this.f6612o = i6;
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
        if (!(obj instanceof W4)) {
            return super.equals(obj);
        }
        W4 w4 = (W4) obj;
        if (this.f6612o != w4.f6612o) {
            return false;
        }
        int[] iArr = w4.f6611n;
        for (int i4 = 0; i4 < this.f6612o; i4++) {
            if (this.f6611n[i4] != iArr[i4]) {
                return false;
            }
        }
        return true;
    }

    public final int f(int i4) {
        o(i4);
        return this.f6611n[i4];
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i4) {
        o(i4);
        return Integer.valueOf(this.f6611n[i4]);
    }

    public final void h(int i4) {
        d();
        int i5 = this.f6612o;
        int length = this.f6611n.length;
        if (i5 == length) {
            int[] iArr = new int[k(length)];
            System.arraycopy(this.f6611n, 0, iArr, 0, this.f6612o);
            this.f6611n = iArr;
        }
        int[] iArr2 = this.f6611n;
        int i6 = this.f6612o;
        this.f6612o = i6 + 1;
        iArr2[i6] = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0812n4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i4 = 1;
        for (int i5 = 0; i5 < this.f6612o; i5++) {
            i4 = (i4 * 31) + this.f6611n[i5];
        }
        return i4;
    }

    public final void i(int i4) {
        int length = this.f6611n.length;
        if (i4 <= length) {
            return;
        }
        if (length == 0) {
            this.f6611n = new int[Math.max(i4, 10)];
            return;
        }
        while (length < i4) {
            length = k(length);
        }
        this.f6611n = Arrays.copyOf(this.f6611n, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i4 = this.f6612o;
        for (int i5 = 0; i5 < i4; i5++) {
            if (this.f6611n[i5] == iIntValue) {
                return i5;
            }
        }
        return -1;
    }

    public final String l(int i4) {
        return "Index:" + i4 + ", Size:" + this.f6612o;
    }

    public final void o(int i4) {
        if (i4 < 0 || i4 >= this.f6612o) {
            throw new IndexOutOfBoundsException(l(i4));
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0708b5
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final Z4 e(int i4) {
        if (i4 >= this.f6612o) {
            return new W4(i4 == 0 ? f6609p : Arrays.copyOf(this.f6611n, i4), this.f6612o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0812n4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i4) {
        d();
        o(i4);
        int[] iArr = this.f6611n;
        int i5 = iArr[i4];
        if (i4 < this.f6612o - 1) {
            System.arraycopy(iArr, i4 + 1, iArr, i4, (r2 - i4) - 1);
        }
        this.f6612o--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i4, int i5) {
        d();
        if (i5 < i4) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f6611n;
        System.arraycopy(iArr, i5, iArr, i4, this.f6612o - i5);
        this.f6612o -= i5 - i4;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i4, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        d();
        o(i4);
        int[] iArr = this.f6611n;
        int i5 = iArr[i4];
        iArr[i4] = iIntValue;
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6612o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        h(((Integer) obj).intValue());
        return true;
    }
}
