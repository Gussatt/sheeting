package m;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: m.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1390b implements Iterable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f10308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f10309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WeakHashMap f10310o = new WeakHashMap();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10311p = 0;

    /* JADX INFO: renamed from: m.b$a */
    public static class a extends e {
        public a(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.C1390b.e
        public c d(c cVar) {
            return cVar.f10315p;
        }

        @Override // m.C1390b.e
        public c e(c cVar) {
            return cVar.f10314o;
        }
    }

    /* JADX INFO: renamed from: m.b$b, reason: collision with other inner class name */
    public static class C0139b extends e {
        public C0139b(c cVar, c cVar2) {
            super(cVar, cVar2);
        }

        @Override // m.C1390b.e
        public c d(c cVar) {
            return cVar.f10314o;
        }

        @Override // m.C1390b.e
        public c e(c cVar) {
            return cVar.f10315p;
        }
    }

    /* JADX INFO: renamed from: m.b$c */
    public static class c implements Map.Entry {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Object f10312m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Object f10313n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public c f10314o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public c f10315p;

        public c(Object obj, Object obj2) {
            this.f10312m = obj;
            this.f10313n = obj2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f10312m.equals(cVar.f10312m) && this.f10313n.equals(cVar.f10313n);
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f10312m;
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.f10313n;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f10312m.hashCode() ^ this.f10313n.hashCode();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f10312m + "=" + this.f10313n;
        }
    }

    /* JADX INFO: renamed from: m.b$d */
    public class d extends f implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public c f10316m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f10317n = true;

        public d() {
        }

        @Override // m.C1390b.f
        public void c(c cVar) {
            c cVar2 = this.f10316m;
            if (cVar == cVar2) {
                c cVar3 = cVar2.f10315p;
                this.f10316m = cVar3;
                this.f10317n = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            if (this.f10317n) {
                this.f10317n = false;
                this.f10316m = C1390b.this.f10308m;
            } else {
                c cVar = this.f10316m;
                this.f10316m = cVar != null ? cVar.f10314o : null;
            }
            return this.f10316m;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10317n) {
                return C1390b.this.f10308m != null;
            }
            c cVar = this.f10316m;
            return (cVar == null || cVar.f10314o == null) ? false : true;
        }
    }

    /* JADX INFO: renamed from: m.b$e */
    public static abstract class e extends f implements Iterator {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public c f10319m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public c f10320n;

        public e(c cVar, c cVar2) {
            this.f10319m = cVar2;
            this.f10320n = cVar;
        }

        @Override // m.C1390b.f
        public void c(c cVar) {
            if (this.f10319m == cVar && cVar == this.f10320n) {
                this.f10320n = null;
                this.f10319m = null;
            }
            c cVar2 = this.f10319m;
            if (cVar2 == cVar) {
                this.f10319m = d(cVar2);
            }
            if (this.f10320n == cVar) {
                this.f10320n = g();
            }
        }

        public abstract c d(c cVar);

        public abstract c e(c cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            c cVar = this.f10320n;
            this.f10320n = g();
            return cVar;
        }

        public final c g() {
            c cVar = this.f10320n;
            c cVar2 = this.f10319m;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return e(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f10320n != null;
        }
    }

    /* JADX INFO: renamed from: m.b$f */
    public static abstract class f {
        public abstract void c(c cVar);
    }

    public Iterator d() {
        C0139b c0139b = new C0139b(this.f10309n, this.f10308m);
        this.f10310o.put(c0139b, Boolean.FALSE);
        return c0139b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1390b)) {
            return false;
        }
        C1390b c1390b = (C1390b) obj;
        if (size() != c1390b.size()) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = c1390b.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object next = it2.next();
            if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry f() {
        return this.f10308m;
    }

    public c g(Object obj) {
        c cVar = this.f10308m;
        while (cVar != null && !cVar.f10312m.equals(obj)) {
            cVar = cVar.f10314o;
        }
        return cVar;
    }

    public d h() {
        d dVar = new d();
        this.f10310o.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public int hashCode() {
        Iterator it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += ((Map.Entry) it.next()).hashCode();
        }
        return iHashCode;
    }

    public Map.Entry i() {
        return this.f10309n;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        a aVar = new a(this.f10308m, this.f10309n);
        this.f10310o.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public c k(Object obj, Object obj2) {
        c cVar = new c(obj, obj2);
        this.f10311p++;
        c cVar2 = this.f10309n;
        if (cVar2 == null) {
            this.f10308m = cVar;
            this.f10309n = cVar;
            return cVar;
        }
        cVar2.f10314o = cVar;
        cVar.f10315p = cVar2;
        this.f10309n = cVar;
        return cVar;
    }

    public Object l(Object obj, Object obj2) {
        c cVarG = g(obj);
        if (cVarG != null) {
            return cVarG.f10313n;
        }
        k(obj, obj2);
        return null;
    }

    public Object o(Object obj) {
        c cVarG = g(obj);
        if (cVarG == null) {
            return null;
        }
        this.f10311p--;
        if (!this.f10310o.isEmpty()) {
            Iterator it = this.f10310o.keySet().iterator();
            while (it.hasNext()) {
                ((f) it.next()).c(cVarG);
            }
        }
        c cVar = cVarG.f10315p;
        if (cVar != null) {
            cVar.f10314o = cVarG.f10314o;
        } else {
            this.f10308m = cVarG.f10314o;
        }
        c cVar2 = cVarG.f10314o;
        if (cVar2 != null) {
            cVar2.f10315p = cVar;
        } else {
            this.f10309n = cVar;
        }
        cVarG.f10314o = null;
        cVarG.f10315p = null;
        return cVarG.f10313n;
    }

    public int size() {
        return this.f10311p;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
