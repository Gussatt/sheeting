package L2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: L2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0480c extends AbstractC0479b implements List, Y2.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f2746m = new a(null);

    /* JADX INFO: renamed from: L2.c$a */
    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final void a(int i4, int i5) {
            if (i4 < 0 || i4 >= i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        public final void b(int i4, int i5) {
            if (i4 < 0 || i4 > i5) {
                throw new IndexOutOfBoundsException("index: " + i4 + ", size: " + i5);
            }
        }

        public final void c(int i4, int i5, int i6) {
            if (i4 < 0 || i5 > i6) {
                throw new IndexOutOfBoundsException("fromIndex: " + i4 + ", toIndex: " + i5 + ", size: " + i6);
            }
            if (i4 <= i5) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i4 + " > toIndex: " + i5);
        }

        public final int d(int i4, int i5) {
            int i6 = i4 + (i4 >> 1);
            if (i6 - i5 < 0) {
                i6 = i5;
            }
            return i6 - 2147483639 > 0 ? i5 > 2147483639 ? Integer.MAX_VALUE : 2147483639 : i6;
        }

        public final boolean e(Collection collection, Collection collection2) {
            X2.l.e(collection, "c");
            X2.l.e(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator it = collection2.iterator();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!X2.l.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int f(Collection collection) {
            X2.l.e(collection, "c");
            Iterator it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: L2.c$b */
    public class b implements Iterator, Y2.a {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f2747m;

        public b() {
        }

        public final int c() {
            return this.f2747m;
        }

        public final void d(int i4) {
            this.f2747m = i4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2747m < AbstractC0480c.this.size();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            AbstractC0480c abstractC0480c = AbstractC0480c.this;
            int i4 = this.f2747m;
            this.f2747m = i4 + 1;
            return abstractC0480c.get(i4);
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: L2.c$c, reason: collision with other inner class name */
    public class C0061c extends b implements ListIterator, Y2.a {
        public C0061c(int i4) {
            super();
            AbstractC0480c.f2746m.b(i4, AbstractC0480c.this.size());
            d(i4);
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return c() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return c();
        }

        @Override // java.util.ListIterator
        public Object previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            AbstractC0480c abstractC0480c = AbstractC0480c.this;
            d(c() - 1);
            return abstractC0480c.get(c());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return c() - 1;
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX INFO: renamed from: L2.c$d */
    public static final class d extends AbstractC0480c implements RandomAccess {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final AbstractC0480c f2750n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f2751o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f2752p;

        public d(AbstractC0480c abstractC0480c, int i4, int i5) {
            X2.l.e(abstractC0480c, "list");
            this.f2750n = abstractC0480c;
            this.f2751o = i4;
            AbstractC0480c.f2746m.c(i4, i5, abstractC0480c.size());
            this.f2752p = i5 - i4;
        }

        @Override // L2.AbstractC0479b
        public int f() {
            return this.f2752p;
        }

        @Override // L2.AbstractC0480c, java.util.List
        public Object get(int i4) {
            AbstractC0480c.f2746m.a(i4, this.f2752p);
            return this.f2750n.get(this.f2751o + i4);
        }
    }

    @Override // java.util.List
    public void add(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f2746m.e(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List
    public abstract Object get(int i4);

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return f2746m.f(this);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        Iterator it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            if (X2.l.a(it.next(), obj)) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (X2.l.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new C0061c(0);
    }

    @Override // java.util.List
    public Object remove(int i4) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public Object set(int i4, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i4, int i5) {
        return new d(this, i4, i5);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i4) {
        return new C0061c(i4);
    }
}
