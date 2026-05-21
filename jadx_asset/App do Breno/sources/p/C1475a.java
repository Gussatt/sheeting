package p;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: p.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1475a extends C1481g implements Map {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public AbstractC1480f f10854t;

    /* JADX INFO: renamed from: p.a$a, reason: collision with other inner class name */
    public class C0149a extends AbstractC1480f {
        public C0149a() {
        }

        @Override // p.AbstractC1480f
        public void a() {
            C1475a.this.clear();
        }

        @Override // p.AbstractC1480f
        public Object b(int i4, int i5) {
            return C1475a.this.f10903n[(i4 << 1) + i5];
        }

        @Override // p.AbstractC1480f
        public Map c() {
            return C1475a.this;
        }

        @Override // p.AbstractC1480f
        public int d() {
            return C1475a.this.f10904o;
        }

        @Override // p.AbstractC1480f
        public int e(Object obj) {
            return C1475a.this.f(obj);
        }

        @Override // p.AbstractC1480f
        public int f(Object obj) {
            return C1475a.this.h(obj);
        }

        @Override // p.AbstractC1480f
        public void g(Object obj, Object obj2) {
            C1475a.this.put(obj, obj2);
        }

        @Override // p.AbstractC1480f
        public void h(int i4) {
            C1475a.this.k(i4);
        }

        @Override // p.AbstractC1480f
        public Object i(int i4, Object obj) {
            return C1475a.this.l(i4, obj);
        }
    }

    public C1475a() {
    }

    @Override // java.util.Map
    public Set entrySet() {
        return n().l();
    }

    @Override // java.util.Map
    public Set keySet() {
        return n().m();
    }

    public final AbstractC1480f n() {
        if (this.f10854t == null) {
            this.f10854t = new C0149a();
        }
        return this.f10854t;
    }

    public boolean o(Collection collection) {
        return AbstractC1480f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        c(this.f10904o + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection values() {
        return n().n();
    }

    public C1475a(int i4) {
        super(i4);
    }

    public C1475a(C1481g c1481g) {
        super(c1481g);
    }
}
