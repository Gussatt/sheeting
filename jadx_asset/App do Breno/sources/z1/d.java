package z1;

import F1.F;
import F1.G;
import U1.a;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class d implements InterfaceC1662a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f12094c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1.a f12095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f12096b = new AtomicReference(null);

    public static final class b implements h {
        public b() {
        }

        @Override // z1.h
        public File a() {
            return null;
        }

        @Override // z1.h
        public File b() {
            return null;
        }

        @Override // z1.h
        public File c() {
            return null;
        }

        @Override // z1.h
        public F.a d() {
            return null;
        }

        @Override // z1.h
        public File e() {
            return null;
        }

        @Override // z1.h
        public File f() {
            return null;
        }

        @Override // z1.h
        public File g() {
            return null;
        }
    }

    public d(U1.a aVar) {
        this.f12095a = aVar;
        aVar.a(new a.InterfaceC0076a() { // from class: z1.b
            @Override // U1.a.InterfaceC0076a
            public final void a(U1.b bVar) {
                d.f(this.f12089a, bVar);
            }
        });
    }

    public static /* synthetic */ void f(d dVar, U1.b bVar) {
        dVar.getClass();
        g.f().b("Crashlytics native component now available.");
        dVar.f12096b.set((InterfaceC1662a) bVar.get());
    }

    @Override // z1.InterfaceC1662a
    public h a(String str) {
        InterfaceC1662a interfaceC1662a = (InterfaceC1662a) this.f12096b.get();
        return interfaceC1662a == null ? f12094c : interfaceC1662a.a(str);
    }

    @Override // z1.InterfaceC1662a
    public boolean b() {
        InterfaceC1662a interfaceC1662a = (InterfaceC1662a) this.f12096b.get();
        return interfaceC1662a != null && interfaceC1662a.b();
    }

    @Override // z1.InterfaceC1662a
    public void c(final String str, final String str2, final long j4, final G g4) {
        g.f().i("Deferring native open session: " + str);
        this.f12095a.a(new a.InterfaceC0076a() { // from class: z1.c
            @Override // U1.a.InterfaceC0076a
            public final void a(U1.b bVar) {
                ((InterfaceC1662a) bVar.get()).c(str, str2, j4, g4);
            }
        });
    }

    @Override // z1.InterfaceC1662a
    public boolean d(String str) {
        InterfaceC1662a interfaceC1662a = (InterfaceC1662a) this.f12096b.get();
        return interfaceC1662a != null && interfaceC1662a.d(str);
    }
}
