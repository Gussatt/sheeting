package C0;

import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public final class s implements z0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1661b f495c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z0.g f496d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f497e;

    public s(p pVar, String str, C1661b c1661b, z0.g gVar, t tVar) {
        this.f493a = pVar;
        this.f494b = str;
        this.f495c = c1661b;
        this.f496d = gVar;
        this.f497e = tVar;
    }

    public static /* synthetic */ void c(Exception exc) {
    }

    @Override // z0.h
    public void a(z0.c cVar, z0.j jVar) {
        this.f497e.a(o.a().e(this.f493a).c(cVar).f(this.f494b).d(this.f496d).b(this.f495c).a(), jVar);
    }

    @Override // z0.h
    public void b(z0.c cVar) {
        a(cVar, new z0.j() { // from class: C0.r
            @Override // z0.j
            public final void a(Exception exc) {
                s.c(exc);
            }
        });
    }

    public p d() {
        return this.f493a;
    }
}
