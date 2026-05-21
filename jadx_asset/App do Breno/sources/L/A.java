package L;

import N2.i;

/* JADX INFO: loaded from: classes.dex */
public final class A implements i.b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f2517o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f2518p = "Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final A f2519m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f2520n;

    public static final class a {

        /* JADX INFO: renamed from: L.A$a$a, reason: collision with other inner class name */
        public static final class C0053a implements i.c {

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public static final C0053a f2521m = new C0053a();
        }

        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public A(A a4, j jVar) {
        X2.l.e(jVar, "instance");
        this.f2519m = a4;
        this.f2520n = jVar;
    }

    @Override // N2.i
    public N2.i D(N2.i iVar) {
        return i.b.a.d(this, iVar);
    }

    @Override // N2.i
    public N2.i F(i.c cVar) {
        return i.b.a.c(this, cVar);
    }

    @Override // N2.i
    public Object O(Object obj, W2.p pVar) {
        return i.b.a.a(this, obj, pVar);
    }

    public final void b(h hVar) {
        X2.l.e(hVar, "candidate");
        if (this.f2520n == hVar) {
            throw new IllegalStateException(f2518p.toString());
        }
        A a4 = this.f2519m;
        if (a4 != null) {
            a4.b(hVar);
        }
    }

    @Override // N2.i.b, N2.i
    public i.b d(i.c cVar) {
        return i.b.a.b(this, cVar);
    }

    @Override // N2.i.b
    public i.c getKey() {
        return a.C0053a.f2521m;
    }
}
