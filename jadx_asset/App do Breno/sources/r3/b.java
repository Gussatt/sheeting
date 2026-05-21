package r3;

import K2.j;
import K2.k;
import K2.p;
import N2.e;
import O2.c;
import P2.h;
import W2.l;
import X2.m;
import h3.C1018m;
import h3.InterfaceC1016l;
import java.util.concurrent.CancellationException;
import n1.AbstractC1445l;
import n1.C1435b;
import n1.InterfaceC1439f;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static final class a implements InterfaceC1439f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1016l f11238a;

        public a(InterfaceC1016l interfaceC1016l) {
            this.f11238a = interfaceC1016l;
        }

        @Override // n1.InterfaceC1439f
        public final void a(AbstractC1445l abstractC1445l) {
            Exception excI = abstractC1445l.i();
            if (excI != null) {
                InterfaceC1016l interfaceC1016l = this.f11238a;
                j.a aVar = j.f2509n;
                interfaceC1016l.p(j.b(k.a(excI)));
            } else {
                if (abstractC1445l.k()) {
                    InterfaceC1016l.a.a(this.f11238a, null, 1, null);
                    return;
                }
                InterfaceC1016l interfaceC1016l2 = this.f11238a;
                j.a aVar2 = j.f2509n;
                interfaceC1016l2.p(j.b(abstractC1445l.j()));
            }
        }
    }

    /* JADX INFO: renamed from: r3.b$b, reason: collision with other inner class name */
    public static final class C0167b extends m implements l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C1435b f11239n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0167b(C1435b c1435b) {
            super(1);
            this.f11239n = c1435b;
        }

        public final void a(Throwable th) {
            this.f11239n.a();
        }

        @Override // W2.l
        public /* bridge */ /* synthetic */ Object k(Object obj) {
            a((Throwable) obj);
            return p.f2516a;
        }
    }

    public static final Object a(AbstractC1445l abstractC1445l, e eVar) {
        return b(abstractC1445l, null, eVar);
    }

    public static final Object b(AbstractC1445l abstractC1445l, C1435b c1435b, e eVar) throws Exception {
        if (!abstractC1445l.l()) {
            C1018m c1018m = new C1018m(O2.b.b(eVar), 1);
            c1018m.A();
            abstractC1445l.b(r3.a.f11237m, new a(c1018m));
            if (c1435b != null) {
                c1018m.J(new C0167b(c1435b));
            }
            Object objX = c1018m.x();
            if (objX == c.c()) {
                h.c(eVar);
            }
            return objX;
        }
        Exception excI = abstractC1445l.i();
        if (excI != null) {
            throw excI;
        }
        if (!abstractC1445l.k()) {
            return abstractC1445l.j();
        }
        throw new CancellationException("Task " + abstractC1445l + " was cancelled normally.");
    }
}
