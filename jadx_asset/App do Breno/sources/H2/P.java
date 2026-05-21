package H2;

import H2.C0309d;
import H2.P;
import android.util.Log;
import w2.InterfaceC1609b;
import w2.InterfaceC1615h;

/* JADX INFO: loaded from: classes.dex */
public abstract class P {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1609b f1827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1828b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0309d f1829c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1615h f1830d;

    public static final class a implements C0309d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C0344i f1831a;

        public a(C0344i c0344i) {
            this.f1831a = c0344i;
        }

        public static final K2.p c(long j4, K2.j jVar) {
            if (K2.j.f(jVar.i())) {
                Log.e("PigeonProxyApiRegistrar", "Failed to remove Dart strong reference with identifier: " + j4);
            }
            return K2.p.f2516a;
        }

        @Override // H2.C0309d.b
        public void a(final long j4) {
            this.f1831a.e(j4, new W2.l() { // from class: H2.O
                @Override // W2.l
                public final Object k(Object obj) {
                    return P.a.c(j4, (K2.j) obj);
                }
            });
        }
    }

    public P(InterfaceC1609b interfaceC1609b) {
        X2.l.e(interfaceC1609b, "binaryMessenger");
        this.f1827a = interfaceC1609b;
        this.f1829c = C0309d.f2007l.a(new a(new C0344i(interfaceC1609b)));
    }

    public abstract AbstractC0391p2 A();

    public abstract AbstractC0402r2 B();

    public abstract J2 C();

    public abstract N2 D();

    public abstract AbstractC0386o3 E();

    public abstract J3 F();

    public abstract L3 G();

    public N3 H() {
        return new N3(this);
    }

    public final void I() {
        C0344i.f2059b.d(this.f1827a, this.f1829c);
        K0.f1791b.f(this.f1827a, i());
        AbstractC0386o3.f2102b.y(this.f1827a, E());
        J2.f1784b.q(this.f1827a, C());
        AbstractC0346i1.f2062b.b(this.f1827a, p());
        J3.f1786b.c(this.f1827a, F());
        Q0.f1842b.b(this.f1827a, k());
        AbstractC0354j2.f2076b.g(this.f1827a, x());
        X0.f1929b.d(this.f1827a, m());
        N2.f1816b.c(this.f1827a, D());
        AbstractC0372m1.f2090b.c(this.f1827a, q());
        N0.f1813b.b(this.f1827a, j());
        R1.f1857b.g(this.f1827a, w());
        AbstractC0290a1.f1977b.b(this.f1827a, n());
        AbstractC0325f1.f2041b.d(this.f1827a, o());
        AbstractC0412t0.f2146b.b(this.f1827a, e());
        B0.f1715b.d(this.f1827a, g());
        J1.f1782b.c(this.f1827a, v());
        F1.f1756b.c(this.f1827a, u());
        B1.f1717b.e(this.f1827a, t());
        AbstractC0425v1.f2172b.f(this.f1827a, s());
        AbstractC0430w0.f2180b.b(this.f1827a, f());
    }

    public final void J() {
        C0344i.f2059b.d(this.f1827a, null);
        K0.f1791b.f(this.f1827a, null);
        AbstractC0386o3.f2102b.y(this.f1827a, null);
        J2.f1784b.q(this.f1827a, null);
        AbstractC0346i1.f2062b.b(this.f1827a, null);
        J3.f1786b.c(this.f1827a, null);
        Q0.f1842b.b(this.f1827a, null);
        AbstractC0354j2.f2076b.g(this.f1827a, null);
        X0.f1929b.d(this.f1827a, null);
        N2.f1816b.c(this.f1827a, null);
        AbstractC0372m1.f2090b.c(this.f1827a, null);
        N0.f1813b.b(this.f1827a, null);
        R1.f1857b.g(this.f1827a, null);
        AbstractC0290a1.f1977b.b(this.f1827a, null);
        AbstractC0325f1.f2041b.d(this.f1827a, null);
        AbstractC0412t0.f2146b.b(this.f1827a, null);
        B0.f1715b.d(this.f1827a, null);
        J1.f1782b.c(this.f1827a, null);
        F1.f1756b.c(this.f1827a, null);
        B1.f1717b.e(this.f1827a, null);
        AbstractC0425v1.f2172b.f(this.f1827a, null);
        AbstractC0430w0.f2180b.b(this.f1827a, null);
    }

    public final InterfaceC1609b a() {
        return this.f1827a;
    }

    public final InterfaceC1615h b() {
        if (this.f1830d == null) {
            this.f1830d = new N(this);
        }
        InterfaceC1615h interfaceC1615h = this.f1830d;
        X2.l.b(interfaceC1615h);
        return interfaceC1615h;
    }

    public final boolean c() {
        return this.f1828b;
    }

    public final C0309d d() {
        return this.f1829c;
    }

    public abstract AbstractC0412t0 e();

    public abstract AbstractC0430w0 f();

    public abstract B0 g();

    public abstract D0 h();

    public abstract K0 i();

    public abstract N0 j();

    public abstract Q0 k();

    public abstract S0 l();

    public abstract X0 m();

    public abstract AbstractC0290a1 n();

    public abstract AbstractC0325f1 o();

    public abstract AbstractC0346i1 p();

    public abstract AbstractC0372m1 q();

    public C0384o1 r() {
        return new C0384o1(this);
    }

    public abstract AbstractC0425v1 s();

    public abstract B1 t();

    public abstract F1 u();

    public abstract J1 v();

    public abstract R1 w();

    public abstract AbstractC0354j2 x();

    public abstract AbstractC0367l2 y();

    public abstract AbstractC0379n2 z();
}
