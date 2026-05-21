package p1;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o1.AbstractC1471h;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    public class a extends b {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Set f10976m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Set f10977n;

        /* JADX INFO: renamed from: p1.w$a$a, reason: collision with other inner class name */
        public class C0154a extends AbstractC1486b {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public final Iterator f10978o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public final Iterator f10979p;

            public C0154a() {
                this.f10978o = a.this.f10976m.iterator();
                this.f10979p = a.this.f10977n.iterator();
            }

            @Override // p1.AbstractC1486b
            public Object c() {
                if (this.f10978o.hasNext()) {
                    return this.f10978o.next();
                }
                while (this.f10979p.hasNext()) {
                    Object next = this.f10979p.next();
                    if (!a.this.f10976m.contains(next)) {
                        return next;
                    }
                }
                return d();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f10976m = set;
            this.f10977n = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f10976m.contains(obj) || this.f10977n.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public z iterator() {
            return new C0154a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return this.f10976m.isEmpty() && this.f10977n.isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            int size = this.f10976m.size();
            Iterator it = this.f10977n.iterator();
            while (it.hasNext()) {
                if (!this.f10976m.contains(it.next())) {
                    size++;
                }
            }
            return size;
        }
    }

    public static abstract class b extends AbstractSet {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: renamed from: d */
        public abstract z iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        public b() {
        }
    }

    public static boolean a(Set set, Object obj) {
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

    public static int b(Set set) {
        Iterator it = set.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i4 = ~(~(i4 + (next != null ? next.hashCode() : 0)));
        }
        return i4;
    }

    public static b c(Set set, Set set2) {
        AbstractC1471h.i(set, "set1");
        AbstractC1471h.i(set2, "set2");
        return new a(set, set2);
    }
}
