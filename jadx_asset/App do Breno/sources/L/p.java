package L;

import h3.InterfaceC1030u;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static final class a extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final W2.p f2695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC1030u f2696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v f2697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final N2.i f2698d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W2.p pVar, InterfaceC1030u interfaceC1030u, v vVar, N2.i iVar) {
            super(null);
            X2.l.e(pVar, "transform");
            X2.l.e(interfaceC1030u, "ack");
            X2.l.e(iVar, "callerContext");
            this.f2695a = pVar;
            this.f2696b = interfaceC1030u;
            this.f2697c = vVar;
            this.f2698d = iVar;
        }

        public final InterfaceC1030u a() {
            return this.f2696b;
        }

        public final N2.i b() {
            return this.f2698d;
        }

        public v c() {
            return this.f2697c;
        }

        public final W2.p d() {
            return this.f2695a;
        }
    }

    public /* synthetic */ p(X2.g gVar) {
        this();
    }

    public p() {
    }
}
