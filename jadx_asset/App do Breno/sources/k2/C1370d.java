package k2;

import w2.C1616i;
import w2.C1617j;

/* JADX INFO: renamed from: k2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1370d extends AbstractC1367a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1616i f10043b;

    /* JADX INFO: renamed from: k2.d$a */
    public class a implements InterfaceC1372f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C1617j.d f10044a;

        public a(C1617j.d dVar) {
            this.f10044a = dVar;
        }

        @Override // k2.InterfaceC1372f
        public void a(Object obj) {
            this.f10044a.a(obj);
        }

        @Override // k2.InterfaceC1372f
        public void b(String str, String str2, Object obj) {
            this.f10044a.b(str, str2, obj);
        }
    }

    public C1370d(C1616i c1616i, C1617j.d dVar) {
        this.f10043b = c1616i;
        this.f10042a = new a(dVar);
    }

    @Override // k2.InterfaceC1371e
    public Object c(String str) {
        return this.f10043b.a(str);
    }

    @Override // k2.InterfaceC1371e
    public String i() {
        return this.f10043b.f11879a;
    }

    @Override // k2.InterfaceC1371e
    public boolean j(String str) {
        return this.f10043b.c(str);
    }

    @Override // k2.AbstractC1367a
    public InterfaceC1372f o() {
        return this.f10042a;
    }
}
