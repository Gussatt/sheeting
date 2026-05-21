package w1;

import U1.a;

/* JADX INFO: renamed from: w1.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1600C implements U1.b, U1.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.InterfaceC0076a f11780c = new a.InterfaceC0076a() { // from class: w1.z
        @Override // U1.a.InterfaceC0076a
        public final void a(U1.b bVar) {
            C1600C.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final U1.b f11781d = new U1.b() { // from class: w1.A
        @Override // U1.b
        public final Object get() {
            return C1600C.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a.InterfaceC0076a f11782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile U1.b f11783b;

    public C1600C(a.InterfaceC0076a interfaceC0076a, U1.b bVar) {
        this.f11782a = interfaceC0076a;
        this.f11783b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(a.InterfaceC0076a interfaceC0076a, a.InterfaceC0076a interfaceC0076a2, U1.b bVar) {
        interfaceC0076a.a(bVar);
        interfaceC0076a2.a(bVar);
    }

    public static /* synthetic */ void d(U1.b bVar) {
    }

    public static C1600C e() {
        return new C1600C(f11780c, f11781d);
    }

    public static C1600C f(U1.b bVar) {
        return new C1600C(null, bVar);
    }

    @Override // U1.a
    public void a(final a.InterfaceC0076a interfaceC0076a) {
        U1.b bVar;
        U1.b bVar2;
        U1.b bVar3 = this.f11783b;
        U1.b bVar4 = f11781d;
        if (bVar3 != bVar4) {
            interfaceC0076a.a(bVar3);
            return;
        }
        synchronized (this) {
            bVar = this.f11783b;
            if (bVar != bVar4) {
                bVar2 = bVar;
            } else {
                final a.InterfaceC0076a interfaceC0076a2 = this.f11782a;
                this.f11782a = new a.InterfaceC0076a() { // from class: w1.B
                    @Override // U1.a.InterfaceC0076a
                    public final void a(U1.b bVar5) {
                        C1600C.c(interfaceC0076a2, interfaceC0076a, bVar5);
                    }
                };
                bVar2 = null;
            }
        }
        if (bVar2 != null) {
            interfaceC0076a.a(bVar);
        }
    }

    public void g(U1.b bVar) {
        a.InterfaceC0076a interfaceC0076a;
        if (this.f11783b != f11781d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC0076a = this.f11782a;
            this.f11782a = null;
            this.f11783b = bVar;
        }
        interfaceC0076a.a(bVar);
    }

    @Override // U1.b
    public Object get() {
        return this.f11783b.get();
    }
}
