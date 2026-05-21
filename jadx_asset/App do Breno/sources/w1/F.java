package w1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class F implements InterfaceC1605d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f11787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f11788c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f11789d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set f11790e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f11791f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC1605d f11792g;

    public static class a implements S1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f11793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S1.c f11794b;

        public a(Set set, S1.c cVar) {
            this.f11793a = set;
            this.f11794b = cVar;
        }

        @Override // S1.c
        public void a(S1.a aVar) {
            if (!this.f11793a.contains(aVar.b())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f11794b.a(aVar);
        }
    }

    public F(C1604c c1604c, InterfaceC1605d interfaceC1605d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c1604c.g()) {
            if (qVar.e()) {
                if (qVar.g()) {
                    hashSet4.add(qVar.c());
                } else {
                    hashSet.add(qVar.c());
                }
            } else if (qVar.d()) {
                hashSet3.add(qVar.c());
            } else if (qVar.g()) {
                hashSet5.add(qVar.c());
            } else {
                hashSet2.add(qVar.c());
            }
        }
        if (!c1604c.k().isEmpty()) {
            hashSet.add(E.b(S1.c.class));
        }
        this.f11786a = Collections.unmodifiableSet(hashSet);
        this.f11787b = Collections.unmodifiableSet(hashSet2);
        this.f11788c = Collections.unmodifiableSet(hashSet3);
        this.f11789d = Collections.unmodifiableSet(hashSet4);
        this.f11790e = Collections.unmodifiableSet(hashSet5);
        this.f11791f = c1604c.k();
        this.f11792g = interfaceC1605d;
    }

    @Override // w1.InterfaceC1605d
    public Object a(Class cls) {
        if (!this.f11786a.contains(E.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f11792g.a(cls);
        return !cls.equals(S1.c.class) ? objA : new a(this.f11791f, (S1.c) objA);
    }

    @Override // w1.InterfaceC1605d
    public U1.a c(E e4) {
        if (this.f11788c.contains(e4)) {
            return this.f11792g.c(e4);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", e4));
    }

    @Override // w1.InterfaceC1605d
    public U1.b d(E e4) {
        if (this.f11790e.contains(e4)) {
            return this.f11792g.d(e4);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", e4));
    }

    @Override // w1.InterfaceC1605d
    public U1.b e(Class cls) {
        return g(E.b(cls));
    }

    @Override // w1.InterfaceC1605d
    public Object f(E e4) {
        if (this.f11786a.contains(e4)) {
            return this.f11792g.f(e4);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", e4));
    }

    @Override // w1.InterfaceC1605d
    public U1.b g(E e4) {
        if (this.f11787b.contains(e4)) {
            return this.f11792g.g(e4);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", e4));
    }

    @Override // w1.InterfaceC1605d
    public U1.a h(Class cls) {
        return c(E.b(cls));
    }

    @Override // w1.InterfaceC1605d
    public Set i(E e4) {
        if (this.f11789d.contains(e4)) {
            return this.f11792g.i(e4);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", e4));
    }
}
