package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class h0 extends f0 {
    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public g0 g(Object obj) {
        return ((AbstractC0597t) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(g0 g0Var) {
        return g0Var.d();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(g0 g0Var) {
        return g0Var.e();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public g0 k(g0 g0Var, g0 g0Var2) {
        return g0.c().equals(g0Var2) ? g0Var : g0.c().equals(g0Var) ? g0.j(g0Var, g0Var2) : g0Var.i(g0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public g0 n() {
        return g0.k();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, g0 g0Var) {
        p(obj, g0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, g0 g0Var) {
        ((AbstractC0597t) obj).unknownFields = g0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public g0 r(g0 g0Var) {
        g0Var.h();
        return g0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(g0 g0Var, l0 l0Var) {
        g0Var.p(l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(g0 g0Var, l0 l0Var) {
        g0Var.r(l0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    public boolean q(X x3) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(g0 g0Var, int i4, int i5) {
        g0Var.n(k0.c(i4, 5), Integer.valueOf(i5));
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(g0 g0Var, int i4, long j4) {
        g0Var.n(k0.c(i4, 1), Long.valueOf(j4));
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(g0 g0Var, int i4, g0 g0Var2) {
        g0Var.n(k0.c(i4, 3), g0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(g0 g0Var, int i4, AbstractC0584f abstractC0584f) {
        g0Var.n(k0.c(i4, 2), abstractC0584f);
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(g0 g0Var, int i4, long j4) {
        g0Var.n(k0.c(i4, 0), Long.valueOf(j4));
    }

    @Override // androidx.datastore.preferences.protobuf.f0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public g0 f(Object obj) {
        g0 g0VarG = g(obj);
        if (g0VarG != g0.c()) {
            return g0VarG;
        }
        g0 g0VarK = g0.k();
        p(obj, g0VarK);
        return g0VarK;
    }
}
