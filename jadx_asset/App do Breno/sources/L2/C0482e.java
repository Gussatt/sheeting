package L2;

import X2.AbstractC0568b;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: L2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0482e implements Collection, Y2.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object[] f2753m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f2754n;

    public C0482e(Object[] objArr, boolean z3) {
        X2.l.e(objArr, "values");
        this.f2753m = objArr;
        this.f2754n = z3;
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
        return j.l(this.f2753m, obj);
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

    public int d() {
        return this.f2753m.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f2753m.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return AbstractC0568b.a(this.f2753m);
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
        return d();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        X2.l.e(objArr, "array");
        return X2.f.b(this, objArr);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return l.a(this.f2753m, this.f2754n);
    }
}
