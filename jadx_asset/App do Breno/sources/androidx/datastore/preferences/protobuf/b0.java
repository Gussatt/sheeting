package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b0 extends AbstractMap {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public List f4685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Map f4686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f4687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile f f4688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map f4689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile c f4690r;

    public class a extends b0 {
        public a() {
            super(null);
        }

        @Override // androidx.datastore.preferences.protobuf.b0
        public void p() {
            if (!o()) {
                if (k() > 0) {
                    i.d.a(j(0).getKey());
                    throw null;
                }
                Iterator it = m().iterator();
                if (it.hasNext()) {
                    i.d.a(((Map.Entry) it.next()).getKey());
                    throw null;
                }
            }
            super.p();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return super.r((Comparable) obj, obj2);
        }
    }

    public class c extends f {
        public c() {
            super(b0.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.b0.f, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new b(b0.this, null);
        }

        public /* synthetic */ c(b0 b0Var, a aVar) {
            this();
        }
    }

    public class d implements Map.Entry, Comparable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Comparable f4695m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Object f4696n;

        public d(b0 b0Var, Map.Entry entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return getKey().compareTo(dVar.getKey());
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return f(this.f4695m, entry.getKey()) && f(this.f4696n, entry.getValue());
        }

        public final boolean f(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Comparable getKey() {
            return this.f4695m;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f4696n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Comparable comparable = this.f4695m;
            int iHashCode = comparable == null ? 0 : comparable.hashCode();
            Object obj = this.f4696n;
            return iHashCode ^ (obj != null ? obj.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            b0.this.g();
            Object obj2 = this.f4696n;
            this.f4696n = obj;
            return obj2;
        }

        public String toString() {
            return this.f4695m + "=" + this.f4696n;
        }

        public d(Comparable comparable, Object obj) {
            this.f4695m = comparable;
            this.f4696n = obj;
        }
    }

    public class f extends AbstractSet {
        public f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            b0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = b0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 != value) {
                return obj2 != null && obj2.equals(value);
            }
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry entry) {
            if (contains(entry)) {
                return false;
            }
            b0.this.r((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator iterator() {
            return new e(b0.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            b0.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return b0.this.size();
        }

        public /* synthetic */ f(b0 b0Var, a aVar) {
            this();
        }
    }

    public /* synthetic */ b0(a aVar) {
        this();
    }

    public static b0 q() {
        return new a();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f4685m.isEmpty()) {
            this.f4685m.clear();
        }
        if (this.f4686n.isEmpty()) {
            return;
        }
        this.f4686n.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f4686n.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set entrySet() {
        if (this.f4688p == null) {
            this.f4688p = new f(this, null);
        }
        return this.f4688p;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return super.equals(obj);
        }
        b0 b0Var = (b0) obj;
        int size = size();
        if (size != b0Var.size()) {
            return false;
        }
        int iK = k();
        if (iK != b0Var.k()) {
            return entrySet().equals(b0Var.entrySet());
        }
        for (int i4 = 0; i4 < iK; i4++) {
            if (!j(i4).equals(b0Var.j(i4))) {
                return false;
            }
        }
        if (iK != size) {
            return this.f4686n.equals(b0Var.f4686n);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(java.lang.Comparable r5) {
        /*
            r4 = this;
            java.util.List r0 = r4.f4685m
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List r2 = r4.f4685m
            java.lang.Object r2 = r2.get(r1)
            androidx.datastore.preferences.protobuf.b0$d r2 = (androidx.datastore.preferences.protobuf.b0.d) r2
            java.lang.Comparable r2 = r2.getKey()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List r3 = r4.f4685m
            java.lang.Object r3 = r3.get(r2)
            androidx.datastore.preferences.protobuf.b0$d r3 = (androidx.datastore.preferences.protobuf.b0.d) r3
            java.lang.Comparable r3 = r3.getKey()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.b0.f(java.lang.Comparable):int");
    }

    public final void g() {
        if (this.f4687o) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        return iF >= 0 ? ((d) this.f4685m.get(iF)).getValue() : this.f4686n.get(comparable);
    }

    public Set h() {
        if (this.f4690r == null) {
            this.f4690r = new c(this, null);
        }
        return this.f4690r;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iK = k();
        int iHashCode = 0;
        for (int i4 = 0; i4 < iK; i4++) {
            iHashCode += ((d) this.f4685m.get(i4)).hashCode();
        }
        return l() > 0 ? iHashCode + this.f4686n.hashCode() : iHashCode;
    }

    public final void i() {
        g();
        if (!this.f4685m.isEmpty() || (this.f4685m instanceof ArrayList)) {
            return;
        }
        this.f4685m = new ArrayList(16);
    }

    public Map.Entry j(int i4) {
        return (Map.Entry) this.f4685m.get(i4);
    }

    public int k() {
        return this.f4685m.size();
    }

    public int l() {
        return this.f4686n.size();
    }

    public Iterable m() {
        return this.f4686n.isEmpty() ? Collections.EMPTY_SET : this.f4686n.entrySet();
    }

    public final SortedMap n() {
        g();
        if (this.f4686n.isEmpty() && !(this.f4686n instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f4686n = treeMap;
            this.f4689q = treeMap.descendingMap();
        }
        return (SortedMap) this.f4686n;
    }

    public boolean o() {
        return this.f4687o;
    }

    public void p() {
        if (this.f4687o) {
            return;
        }
        this.f4686n = this.f4686n.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f4686n);
        this.f4689q = this.f4689q.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f4689q);
        this.f4687o = true;
    }

    public Object r(Comparable comparable, Object obj) {
        g();
        int iF = f(comparable);
        if (iF >= 0) {
            return ((d) this.f4685m.get(iF)).setValue(obj);
        }
        i();
        int i4 = -(iF + 1);
        if (i4 >= 16) {
            return n().put(comparable, obj);
        }
        if (this.f4685m.size() == 16) {
            d dVar = (d) this.f4685m.remove(15);
            n().put(dVar.getKey(), dVar.getValue());
        }
        this.f4685m.add(i4, new d(comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int iF = f(comparable);
        if (iF >= 0) {
            return s(iF);
        }
        if (this.f4686n.isEmpty()) {
            return null;
        }
        return this.f4686n.remove(comparable);
    }

    public final Object s(int i4) {
        g();
        Object value = ((d) this.f4685m.remove(i4)).getValue();
        if (!this.f4686n.isEmpty()) {
            Iterator it = n().entrySet().iterator();
            this.f4685m.add(new d(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4685m.size() + this.f4686n.size();
    }

    public class b implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4691m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Iterator f4692n;

        public b() {
            this.f4691m = b0.this.f4685m.size();
        }

        public final Iterator c() {
            if (this.f4692n == null) {
                this.f4692n = b0.this.f4689q.entrySet().iterator();
            }
            return this.f4692n;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (c().hasNext()) {
                return (Map.Entry) c().next();
            }
            List list = b0.this.f4685m;
            int i4 = this.f4691m - 1;
            this.f4691m = i4;
            return (Map.Entry) list.get(i4);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i4 = this.f4691m;
            return (i4 > 0 && i4 <= b0.this.f4685m.size()) || c().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        public /* synthetic */ b(b0 b0Var, a aVar) {
            this();
        }
    }

    public class e implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4698m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f4699n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Iterator f4700o;

        public e() {
            this.f4698m = -1;
        }

        public final Iterator c() {
            if (this.f4700o == null) {
                this.f4700o = b0.this.f4686n.entrySet().iterator();
            }
            return this.f4700o;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            this.f4699n = true;
            int i4 = this.f4698m + 1;
            this.f4698m = i4;
            return i4 < b0.this.f4685m.size() ? (Map.Entry) b0.this.f4685m.get(this.f4698m) : (Map.Entry) c().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4698m + 1 < b0.this.f4685m.size() || (!b0.this.f4686n.isEmpty() && c().hasNext());
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4699n) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f4699n = false;
            b0.this.g();
            if (this.f4698m >= b0.this.f4685m.size()) {
                c().remove();
                return;
            }
            b0 b0Var = b0.this;
            int i4 = this.f4698m;
            this.f4698m = i4 - 1;
            b0Var.s(i4);
        }

        public /* synthetic */ e(b0 b0Var, a aVar) {
            this();
        }
    }

    public b0() {
        this.f4685m = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        this.f4686n = map;
        this.f4689q = map;
    }
}
