package p1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import o1.AbstractC1471h;
import p1.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends h implements List, RandomAccess {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final AbstractC1484A f10929n = new b(t.f10952q, 0);

    public static final class a extends h.a {
        public a() {
            this(4);
        }

        public a e(Object... objArr) {
            super.b(objArr);
            return this;
        }

        public i f() {
            this.f10928c = true;
            return i.k(this.f10926a, this.f10927b);
        }

        public a(int i4) {
            super(i4);
        }
    }

    public static class b extends AbstractC1485a {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final i f10930o;

        public b(i iVar, int i4) {
            super(iVar.size(), i4);
            this.f10930o = iVar;
        }

        @Override // p1.AbstractC1485a
        public Object c(int i4) {
            return this.f10930o.get(i4);
        }
    }

    public class c extends i {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final transient int f10931o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final transient int f10932p;

        public c(int i4, int i5) {
            this.f10931o = i4;
            this.f10932p = i5;
        }

        @Override // p1.h
        public Object[] f() {
            return i.this.f();
        }

        @Override // p1.h
        public int g() {
            return i.this.h() + this.f10931o + this.f10932p;
        }

        @Override // java.util.List
        public Object get(int i4) {
            AbstractC1471h.f(i4, this.f10932p);
            return i.this.get(i4 + this.f10931o);
        }

        @Override // p1.h
        public int h() {
            return i.this.h() + this.f10931o;
        }

        @Override // p1.i, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // p1.i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f10932p;
        }

        @Override // p1.i, java.util.List
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public i subList(int i4, int i5) {
            AbstractC1471h.l(i4, i5, this.f10932p);
            i iVar = i.this;
            int i6 = this.f10931o;
            return iVar.subList(i4 + i6, i5 + i6);
        }

        @Override // p1.i, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i4) {
            return super.listIterator(i4);
        }
    }

    public static i i(Object[] objArr) {
        return k(objArr, objArr.length);
    }

    public static i k(Object[] objArr, int i4) {
        return i4 == 0 ? t() : new t(objArr, i4);
    }

    public static i l(Object... objArr) {
        return i(q.b(objArr));
    }

    public static i t() {
        return t.f10952q;
    }

    public static i u(Object obj, Object obj2) {
        return l(obj, obj2);
    }

    public static i v(Object obj, Object obj2, Object obj3) {
        return l(obj, obj2, obj3);
    }

    public static i w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return l(obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    public static i x(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        AbstractC1471h.e(objArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr2 = new Object[objArr.length + 12];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        return l(objArr2);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // p1.h, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // p1.h
    public int d(Object[] objArr, int i4) {
        int size = size();
        for (int i5 = 0; i5 < size; i5++) {
            objArr[i4 + i5] = get(i5);
        }
        return i4 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return m.a(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = ~(~((i4 * 31) + get(i5).hashCode()));
        }
        return i4;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return m.b(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return m.d(this, obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public z iterator() {
        return listIterator();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC1484A listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public AbstractC1484A listIterator(int i4) {
        AbstractC1471h.j(i4, size());
        return isEmpty() ? f10929n : new b(this, i4);
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: y */
    public i subList(int i4, int i5) {
        AbstractC1471h.l(i4, i5, size());
        int i6 = i5 - i4;
        return i6 == size() ? this : i6 == 0 ? t() : z(i4, i5);
    }

    public i z(int i4, int i5) {
        return new c(i4, i5 - i4);
    }
}
