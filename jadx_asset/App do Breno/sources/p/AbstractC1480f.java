package p;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: p.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1480f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f10883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f10884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f10885c;

    /* JADX INFO: renamed from: p.f$a */
    public final class a implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f10886m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f10887n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f10888o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f10889p = false;

        public a(int i4) {
            this.f10886m = i4;
            this.f10887n = AbstractC1480f.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10888o < this.f10887n;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Object objB = AbstractC1480f.this.b(this.f10888o, this.f10886m);
            this.f10888o++;
            this.f10889p = true;
            return objB;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10889p) {
                throw new IllegalStateException();
            }
            int i4 = this.f10888o - 1;
            this.f10888o = i4;
            this.f10887n--;
            this.f10889p = false;
            AbstractC1480f.this.h(i4);
        }
    }

    /* JADX INFO: renamed from: p.f$b */
    public final class b implements Set {
        public b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            int iD = AbstractC1480f.this.d();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                AbstractC1480f.this.g(entry.getKey(), entry.getValue());
            }
            return iD != AbstractC1480f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC1480f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = AbstractC1480f.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return AbstractC1477c.c(AbstractC1480f.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC1480f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = AbstractC1480f.this.d() - 1; iD >= 0; iD--) {
                Object objB = AbstractC1480f.this.b(iD, 0);
                Object objB2 = AbstractC1480f.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC1480f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1480f.this.new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC1480f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: p.f$c */
    public final class c implements Set {
        public c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC1480f.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC1480f.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection collection) {
            return AbstractC1480f.j(AbstractC1480f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC1480f.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = AbstractC1480f.this.d() - 1; iD >= 0; iD--) {
                Object objB = AbstractC1480f.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC1480f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1480f.this.new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iE = AbstractC1480f.this.e(obj);
            if (iE < 0) {
                return false;
            }
            AbstractC1480f.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection collection) {
            return AbstractC1480f.o(AbstractC1480f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection collection) {
            return AbstractC1480f.p(AbstractC1480f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC1480f.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC1480f.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC1480f.this.r(objArr, 0);
        }
    }

    /* JADX INFO: renamed from: p.f$d */
    public final class d implements Iterator, Map.Entry {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f10893m;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f10895o = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f10894n = -1;

        public d() {
            this.f10893m = AbstractC1480f.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f10894n++;
            this.f10895o = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f10895o) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return AbstractC1477c.c(entry.getKey(), AbstractC1480f.this.b(this.f10894n, 0)) && AbstractC1477c.c(entry.getValue(), AbstractC1480f.this.b(this.f10894n, 1));
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            if (this.f10895o) {
                return AbstractC1480f.this.b(this.f10894n, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            if (this.f10895o) {
                return AbstractC1480f.this.b(this.f10894n, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10894n < this.f10893m;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f10895o) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = AbstractC1480f.this.b(this.f10894n, 0);
            Object objB2 = AbstractC1480f.this.b(this.f10894n, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f10895o) {
                throw new IllegalStateException();
            }
            AbstractC1480f.this.h(this.f10894n);
            this.f10894n--;
            this.f10893m--;
            this.f10895o = false;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (this.f10895o) {
                return AbstractC1480f.this.i(this.f10894n, obj);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* JADX INFO: renamed from: p.f$e */
    public final class e implements Collection {
        public e() {
        }

        @Override // java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            AbstractC1480f.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC1480f.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return AbstractC1480f.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1480f.this.new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int iF = AbstractC1480f.this.f(obj);
            if (iF < 0) {
                return false;
            }
            AbstractC1480f.this.h(iF);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection collection) {
            int iD = AbstractC1480f.this.d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < iD) {
                if (collection.contains(AbstractC1480f.this.b(i4, 1))) {
                    AbstractC1480f.this.h(i4);
                    i4--;
                    iD--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection collection) {
            int iD = AbstractC1480f.this.d();
            int i4 = 0;
            boolean z3 = false;
            while (i4 < iD) {
                if (!collection.contains(AbstractC1480f.this.b(i4, 1))) {
                    AbstractC1480f.this.h(i4);
                    i4--;
                    iD--;
                    z3 = true;
                }
                i4++;
            }
            return z3;
        }

        @Override // java.util.Collection
        public int size() {
            return AbstractC1480f.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC1480f.this.q(1);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC1480f.this.r(objArr, 1);
        }
    }

    public static boolean j(Map map, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean k(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean o(Map map, Collection collection) {
        int size = map.size();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static boolean p(Map map, Collection collection) {
        int size = map.size();
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public abstract void a();

    public abstract Object b(int i4, int i5);

    public abstract Map c();

    public abstract int d();

    public abstract int e(Object obj);

    public abstract int f(Object obj);

    public abstract void g(Object obj, Object obj2);

    public abstract void h(int i4);

    public abstract Object i(int i4, Object obj);

    public Set l() {
        if (this.f10883a == null) {
            this.f10883a = new b();
        }
        return this.f10883a;
    }

    public Set m() {
        if (this.f10884b == null) {
            this.f10884b = new c();
        }
        return this.f10884b;
    }

    public Collection n() {
        if (this.f10885c == null) {
            this.f10885c = new e();
        }
        return this.f10885c;
    }

    public Object[] q(int i4) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i5 = 0; i5 < iD; i5++) {
            objArr[i5] = b(i5, i4);
        }
        return objArr;
    }

    public Object[] r(Object[] objArr, int i4) {
        int iD = d();
        if (objArr.length < iD) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), iD);
        }
        for (int i5 = 0; i5 < iD; i5++) {
            objArr[i5] = b(i5, i4);
        }
        if (objArr.length > iD) {
            objArr[iD] = null;
        }
        return objArr;
    }
}
