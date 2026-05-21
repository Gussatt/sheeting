package w1;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: w1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1604c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f11798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f11799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f11802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f11803g;

    public static /* synthetic */ Object a(Object obj, InterfaceC1605d interfaceC1605d) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC1605d interfaceC1605d) {
        return obj;
    }

    public static b c(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b d(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static b e(E e4) {
        return new b(e4, new E[0]);
    }

    public static b f(E e4, E... eArr) {
        return new b(e4, eArr);
    }

    public static C1604c l(final Object obj, Class cls) {
        return m(cls).e(new g() { // from class: w1.a
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return C1604c.b(obj, interfaceC1605d);
            }
        }).c();
    }

    public static b m(Class cls) {
        return c(cls).f();
    }

    public static C1604c q(final Object obj, Class cls, Class... clsArr) {
        return d(cls, clsArr).e(new g() { // from class: w1.b
            @Override // w1.g
            public final Object a(InterfaceC1605d interfaceC1605d) {
                return C1604c.a(obj, interfaceC1605d);
            }
        }).c();
    }

    public Set g() {
        return this.f11799c;
    }

    public g h() {
        return this.f11802f;
    }

    public String i() {
        return this.f11797a;
    }

    public Set j() {
        return this.f11798b;
    }

    public Set k() {
        return this.f11803g;
    }

    public boolean n() {
        return this.f11800d == 1;
    }

    public boolean o() {
        return this.f11800d == 2;
    }

    public boolean p() {
        return this.f11801e == 0;
    }

    public C1604c r(g gVar) {
        return new C1604c(this.f11797a, this.f11798b, this.f11799c, this.f11800d, this.f11801e, gVar, this.f11803g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f11798b.toArray()) + ">{" + this.f11800d + ", type=" + this.f11801e + ", deps=" + Arrays.toString(this.f11799c.toArray()) + "}";
    }

    /* JADX INFO: renamed from: w1.c$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11804a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f11805b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f11806c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f11807d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f11808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public g f11809f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f11810g;

        public b b(q qVar) {
            AbstractC1601D.c(qVar, "Null dependency");
            i(qVar.c());
            this.f11806c.add(qVar);
            return this;
        }

        public C1604c c() {
            AbstractC1601D.d(this.f11809f != null, "Missing required property: factory.");
            return new C1604c(this.f11804a, new HashSet(this.f11805b), new HashSet(this.f11806c), this.f11807d, this.f11808e, this.f11809f, this.f11810g);
        }

        public b d() {
            return h(2);
        }

        public b e(g gVar) {
            this.f11809f = (g) AbstractC1601D.c(gVar, "Null factory");
            return this;
        }

        public final b f() {
            this.f11808e = 1;
            return this;
        }

        public b g(String str) {
            this.f11804a = str;
            return this;
        }

        public final b h(int i4) {
            AbstractC1601D.d(this.f11807d == 0, "Instantiation type has already been set.");
            this.f11807d = i4;
            return this;
        }

        public final void i(E e4) {
            AbstractC1601D.a(!this.f11805b.contains(e4), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b(Class cls, Class... clsArr) {
            this.f11804a = null;
            HashSet hashSet = new HashSet();
            this.f11805b = hashSet;
            this.f11806c = new HashSet();
            this.f11807d = 0;
            this.f11808e = 0;
            this.f11810g = new HashSet();
            AbstractC1601D.c(cls, "Null interface");
            hashSet.add(E.b(cls));
            for (Class cls2 : clsArr) {
                AbstractC1601D.c(cls2, "Null interface");
                this.f11805b.add(E.b(cls2));
            }
        }

        public b(E e4, E... eArr) {
            this.f11804a = null;
            HashSet hashSet = new HashSet();
            this.f11805b = hashSet;
            this.f11806c = new HashSet();
            this.f11807d = 0;
            this.f11808e = 0;
            this.f11810g = new HashSet();
            AbstractC1601D.c(e4, "Null interface");
            hashSet.add(e4);
            for (E e5 : eArr) {
                AbstractC1601D.c(e5, "Null interface");
            }
            Collections.addAll(this.f11805b, eArr);
        }
    }

    public C1604c(String str, Set set, Set set2, int i4, int i5, g gVar, Set set3) {
        this.f11797a = str;
        this.f11798b = Collections.unmodifiableSet(set);
        this.f11799c = Collections.unmodifiableSet(set2);
        this.f11800d = i4;
        this.f11801e = i5;
        this.f11802f = gVar;
        this.f11803g = Collections.unmodifiableSet(set3);
    }
}
