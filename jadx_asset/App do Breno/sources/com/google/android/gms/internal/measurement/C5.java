package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class C5 extends AbstractC0812n4 implements RandomAccess {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Object[] f6306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C5 f6307q;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object[] f6308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f6309o;

    static {
        Object[] objArr = new Object[0];
        f6306p = objArr;
        f6307q = new C5(objArr, 0, false);
    }

    public C5(Object[] objArr, int i4, boolean z3) {
        super(z3);
        this.f6308n = objArr;
        this.f6309o = i4;
    }

    public static C5 f() {
        return f6307q;
    }

    public static int h(int i4) {
        return Math.max(((i4 * 3) / 2) + 1, 10);
    }

    private final void k(int i4) {
        if (i4 < 0 || i4 >= this.f6309o) {
            throw new IndexOutOfBoundsException(i(i4));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        d();
        if (i4 < 0 || i4 > (i5 = this.f6309o)) {
            throw new IndexOutOfBoundsException(i(i4));
        }
        int i6 = i4 + 1;
        Object[] objArr = this.f6308n;
        int length = objArr.length;
        if (i5 < length) {
            System.arraycopy(objArr, i4, objArr, i6, i5 - i4);
        } else {
            Object[] objArr2 = new Object[h(length)];
            System.arraycopy(this.f6308n, 0, objArr2, 0, i4);
            System.arraycopy(this.f6308n, i4, objArr2, i6, this.f6309o - i4);
            this.f6308n = objArr2;
        }
        this.f6308n[i4] = obj;
        this.f6309o++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0708b5
    public final /* bridge */ /* synthetic */ InterfaceC0708b5 e(int i4) {
        if (i4 >= this.f6309o) {
            return new C5(i4 == 0 ? f6306p : Arrays.copyOf(this.f6308n, i4), this.f6309o, true);
        }
        throw new IllegalArgumentException();
    }

    public final void g(int i4) {
        int length = this.f6308n.length;
        if (i4 <= length) {
            return;
        }
        if (length == 0) {
            this.f6308n = new Object[Math.max(i4, 10)];
            return;
        }
        while (length < i4) {
            length = h(length);
        }
        this.f6308n = Arrays.copyOf(this.f6308n, length);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i4) {
        k(i4);
        return this.f6308n[i4];
    }

    public final String i(int i4) {
        return "Index:" + i4 + ", Size:" + this.f6309o;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0812n4, java.util.AbstractList, java.util.List
    public final Object remove(int i4) {
        d();
        k(i4);
        Object[] objArr = this.f6308n;
        Object obj = objArr[i4];
        if (i4 < this.f6309o - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f6309o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i4, Object obj) {
        d();
        k(i4);
        Object[] objArr = this.f6308n;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6309o;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        d();
        int i4 = this.f6309o;
        int length = this.f6308n.length;
        if (i4 == length) {
            this.f6308n = Arrays.copyOf(this.f6308n, h(length));
        }
        Object[] objArr = this.f6308n;
        int i5 = this.f6309o;
        this.f6309o = i5 + 1;
        objArr[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
