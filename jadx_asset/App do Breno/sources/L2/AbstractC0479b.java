package L2;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: L2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0479b implements Collection, Y2.a {
    public static final CharSequence g(AbstractC0479b abstractC0479b, Object obj) {
        return obj == abstractC0479b ? "(this Collection)" : String.valueOf(obj);
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (X2.l.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        X2.l.e(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract int f();

    @Override // java.util.Collection
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return f();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return X2.f.a(this);
    }

    public String toString() {
        return u.z(this, ", ", "[", "]", 0, null, new W2.l() { // from class: L2.a
            @Override // W2.l
            public final Object k(Object obj) {
                return AbstractC0479b.g(this.f2745m, obj);
            }
        }, 24, null);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        X2.l.e(objArr, "array");
        return X2.f.b(this, objArr);
    }
}
