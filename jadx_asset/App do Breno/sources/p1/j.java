package p1;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import p1.h;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements Map, Serializable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Map.Entry[] f10934p = new Map.Entry[0];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public transient k f10935m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public transient k f10936n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public transient h f10937o;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Comparator f10938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object[] f10939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f10941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C0151a f10942e;

        /* JADX INFO: renamed from: p1.j$a$a, reason: collision with other inner class name */
        public static final class C0151a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f10943a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Object f10944b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Object f10945c;

            public C0151a(Object obj, Object obj2, Object obj3) {
                this.f10943a = obj;
                this.f10944b = obj2;
                this.f10945c = obj3;
            }

            public IllegalArgumentException a() {
                String strValueOf = String.valueOf(this.f10943a);
                String strValueOf2 = String.valueOf(this.f10944b);
                String strValueOf3 = String.valueOf(this.f10943a);
                String strValueOf4 = String.valueOf(this.f10945c);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 39 + strValueOf2.length() + strValueOf3.length() + strValueOf4.length());
                sb.append("Multiple entries with same key: ");
                sb.append(strValueOf);
                sb.append("=");
                sb.append(strValueOf2);
                sb.append(" and ");
                sb.append(strValueOf3);
                sb.append("=");
                sb.append(strValueOf4);
                return new IllegalArgumentException(sb.toString());
            }
        }

        public a() {
            this(4);
        }

        public static void j(Object[] objArr, int i4, Comparator comparator) {
            Map.Entry[] entryArr = new Map.Entry[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * 2;
                Object obj = objArr[i6];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i6 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i5] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i4, r.a(comparator).b(o.c()));
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = i7 * 2;
                objArr[i8] = entryArr[i7].getKey();
                objArr[i8 + 1] = entryArr[i7].getValue();
            }
        }

        public j a() {
            return c();
        }

        public final j b(boolean z3) {
            Object[] objArrE;
            C0151a c0151a;
            C0151a c0151a2;
            if (z3 && (c0151a2 = this.f10942e) != null) {
                throw c0151a2.a();
            }
            int length = this.f10940c;
            if (this.f10938a == null) {
                objArrE = this.f10939b;
            } else {
                if (this.f10941d) {
                    this.f10939b = Arrays.copyOf(this.f10939b, length * 2);
                }
                objArrE = this.f10939b;
                if (!z3) {
                    objArrE = e(objArrE, this.f10940c);
                    if (objArrE.length < this.f10939b.length) {
                        length = objArrE.length >>> 1;
                    }
                }
                j(objArrE, length, this.f10938a);
            }
            this.f10941d = true;
            u uVarM = u.m(length, objArrE, this);
            if (!z3 || (c0151a = this.f10942e) == null) {
                return uVarM;
            }
            throw c0151a.a();
        }

        public j c() {
            return b(true);
        }

        public final void d(int i4) {
            int i5 = i4 * 2;
            Object[] objArr = this.f10939b;
            if (i5 > objArr.length) {
                this.f10939b = Arrays.copyOf(objArr, h.b.a(objArr.length, i5));
                this.f10941d = false;
            }
        }

        public final Object[] e(Object[] objArr, int i4) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                Object obj = objArr[i5 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i5);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i4 - bitSet.cardinality()) * 2];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4 * 2) {
                if (bitSet.get(i6 >>> 1)) {
                    i6 += 2;
                } else {
                    int i8 = i7 + 1;
                    int i9 = i6 + 1;
                    Object obj2 = objArr[i6];
                    Objects.requireNonNull(obj2);
                    objArr2[i7] = obj2;
                    i7 += 2;
                    i6 += 2;
                    Object obj3 = objArr[i9];
                    Objects.requireNonNull(obj3);
                    objArr2[i8] = obj3;
                }
            }
            return objArr2;
        }

        public a f(Object obj, Object obj2) {
            d(this.f10940c + 1);
            d.a(obj, obj2);
            Object[] objArr = this.f10939b;
            int i4 = this.f10940c;
            objArr[i4 * 2] = obj;
            objArr[(i4 * 2) + 1] = obj2;
            this.f10940c = i4 + 1;
            return this;
        }

        public a g(Map.Entry entry) {
            return f(entry.getKey(), entry.getValue());
        }

        public a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                d(this.f10940c + ((Collection) iterable).size());
            }
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                g((Map.Entry) it.next());
            }
            return this;
        }

        public a i(Map map) {
            return h(map.entrySet());
        }

        public a(int i4) {
            this.f10939b = new Object[i4 * 2];
            this.f10940c = 0;
            this.f10941d = false;
        }
    }

    public static a a() {
        return new a();
    }

    public static j b(Iterable iterable) {
        a aVar = new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        aVar.h(iterable);
        return aVar.a();
    }

    public static j h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        d.a(obj, obj2);
        d.a(obj3, obj4);
        d.a(obj5, obj6);
        d.a(obj7, obj8);
        return u.l(4, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8});
    }

    public static j i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        d.a(obj, obj2);
        d.a(obj3, obj4);
        d.a(obj5, obj6);
        d.a(obj7, obj8);
        d.a(obj9, obj10);
        return u.l(5, new Object[]{obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10});
    }

    public static j j(Map.Entry... entryArr) {
        return b(Arrays.asList(entryArr));
    }

    public abstract k c();

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    public abstract k d();

    public abstract h e();

    @Override // java.util.Map
    public boolean equals(Object obj) {
        return o.a(this, obj);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public k entrySet() {
        k kVar = this.f10935m;
        if (kVar != null) {
            return kVar;
        }
        k kVarC = c();
        this.f10935m = kVarC;
        return kVarC;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public k keySet() {
        k kVar = this.f10936n;
        if (kVar != null) {
            return kVar;
        }
        k kVarD = d();
        this.f10936n = kVarD;
        return kVarD;
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return w.b(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public h values() {
        h hVar = this.f10937o;
        if (hVar != null) {
            return hVar;
        }
        h hVarE = e();
        this.f10937o = hVarE;
        return hVarE;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return o.b(this);
    }
}
