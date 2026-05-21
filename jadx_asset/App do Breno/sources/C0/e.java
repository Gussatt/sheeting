package C0;

import C0.v;
import K0.C0459g;
import K0.C0460h;
import K0.C0461i;
import K0.C0462j;
import K0.InterfaceC0456d;
import K0.N;
import K0.X;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    public static final class b implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f469a;

        public b() {
        }

        @Override // C0.v.a
        public v a() {
            E0.d.a(this.f469a, Context.class);
            return new c(this.f469a);
        }

        @Override // C0.v.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.f469a = (Context) E0.d.b(context);
            return this;
        }
    }

    public static final class c extends v {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final c f470m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public J2.a f471n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public J2.a f472o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public J2.a f473p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public J2.a f474q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public J2.a f475r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public J2.a f476s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public J2.a f477t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public J2.a f478u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public J2.a f479v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public J2.a f480w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public J2.a f481x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public J2.a f482y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public J2.a f483z;

        @Override // C0.v
        public InterfaceC0456d a() {
            return (InterfaceC0456d) this.f477t.get();
        }

        @Override // C0.v
        public u c() {
            return (u) this.f483z.get();
        }

        public final void d(Context context) {
            this.f471n = E0.a.a(k.a());
            E0.b bVarA = E0.c.a(context);
            this.f472o = bVarA;
            D0.j jVarA = D0.j.a(bVarA, M0.c.a(), M0.d.a());
            this.f473p = jVarA;
            this.f474q = E0.a.a(D0.l.a(this.f472o, jVarA));
            this.f475r = X.a(this.f472o, C0459g.a(), C0461i.a());
            this.f476s = E0.a.a(C0460h.a(this.f472o));
            this.f477t = E0.a.a(N.a(M0.c.a(), M0.d.a(), C0462j.a(), this.f475r, this.f476s));
            I0.g gVarB = I0.g.b(M0.c.a());
            this.f478u = gVarB;
            I0.i iVarA = I0.i.a(this.f472o, this.f477t, gVarB, M0.d.a());
            this.f479v = iVarA;
            J2.a aVar = this.f471n;
            J2.a aVar2 = this.f474q;
            J2.a aVar3 = this.f477t;
            this.f480w = I0.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
            J2.a aVar4 = this.f472o;
            J2.a aVar5 = this.f474q;
            J2.a aVar6 = this.f477t;
            this.f481x = J0.s.a(aVar4, aVar5, aVar6, this.f479v, this.f471n, aVar6, M0.c.a(), M0.d.a(), this.f477t);
            J2.a aVar7 = this.f471n;
            J2.a aVar8 = this.f477t;
            this.f482y = J0.w.a(aVar7, aVar8, this.f479v, aVar8);
            this.f483z = E0.a.a(w.a(M0.c.a(), M0.d.a(), this.f480w, this.f481x, this.f482y));
        }

        public c(Context context) {
            this.f470m = this;
            d(context);
        }
    }

    public static v.a a() {
        return new b();
    }
}
