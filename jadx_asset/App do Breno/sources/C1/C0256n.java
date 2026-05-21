package C1;

import d2.InterfaceC0920b;

/* JADX INFO: renamed from: C1.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0256n implements InterfaceC0920b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0255m f642b;

    public C0256n(J j4, I1.g gVar) {
        this.f641a = j4;
        this.f642b = new C0255m(gVar);
    }

    @Override // d2.InterfaceC0920b
    public InterfaceC0920b.a a() {
        return InterfaceC0920b.a.CRASHLYTICS;
    }

    @Override // d2.InterfaceC0920b
    public void b(InterfaceC0920b.C0119b c0119b) {
        z1.g.f().b("App Quality Sessions session changed: " + c0119b);
        this.f642b.f(c0119b.a());
    }

    @Override // d2.InterfaceC0920b
    public boolean c() {
        return this.f641a.d();
    }

    public String d(String str) {
        return this.f642b.c(str);
    }

    public void e(String str) {
        this.f642b.g(str);
    }
}
