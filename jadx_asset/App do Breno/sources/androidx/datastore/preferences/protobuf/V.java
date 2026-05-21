package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class V extends AbstractC0581c implements RandomAccess {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final V f4674p = new V(new Object[0], 0, false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Object[] f4675n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4676o;

    public V(Object[] objArr, int i4, boolean z3) {
        super(z3);
        this.f4675n = objArr;
        this.f4676o = i4;
    }

    public static Object[] f(int i4) {
        return new Object[i4];
    }

    public static V g() {
        return f4674p;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        d();
        int i4 = this.f4676o;
        Object[] objArr = this.f4675n;
        if (i4 == objArr.length) {
            this.f4675n = Arrays.copyOf(objArr, ((i4 * 3) / 2) + 1);
        }
        Object[] objArr2 = this.f4675n;
        int i5 = this.f4676o;
        this.f4676o = i5 + 1;
        objArr2[i5] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i4) {
        h(i4);
        return this.f4675n[i4];
    }

    public final void h(int i4) {
        if (i4 < 0 || i4 >= this.f4676o) {
            throw new IndexOutOfBoundsException(i(i4));
        }
    }

    public final String i(int i4) {
        return "Index:" + i4 + ", Size:" + this.f4676o;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0598u.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public V n(int i4) {
        if (i4 >= this.f4676o) {
            return new V(Arrays.copyOf(this.f4675n, i4), this.f4676o, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0581c, java.util.AbstractList, java.util.List
    public Object remove(int i4) {
        d();
        h(i4);
        Object[] objArr = this.f4675n;
        Object obj = objArr[i4];
        if (i4 < this.f4676o - 1) {
            System.arraycopy(objArr, i4 + 1, objArr, i4, (r2 - i4) - 1);
        }
        this.f4676o--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i4, Object obj) {
        d();
        h(i4);
        Object[] objArr = this.f4675n;
        Object obj2 = objArr[i4];
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4676o;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i4, Object obj) {
        int i5;
        d();
        if (i4 >= 0 && i4 <= (i5 = this.f4676o)) {
            Object[] objArr = this.f4675n;
            if (i5 < objArr.length) {
                System.arraycopy(objArr, i4, objArr, i4 + 1, i5 - i4);
            } else {
                Object[] objArrF = f(((i5 * 3) / 2) + 1);
                System.arraycopy(this.f4675n, 0, objArrF, 0, i4);
                System.arraycopy(this.f4675n, i4, objArrF, i4 + 1, this.f4676o - i4);
                this.f4675n = objArrF;
            }
            this.f4675n[i4] = obj;
            this.f4676o++;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException(i(i4));
    }
}
