package U0;

import S0.C0506d;
import T0.a;
import V0.AbstractC0549h;
import n1.C1446m;

/* JADX INFO: renamed from: U0.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0530n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0506d[] f3582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3584c;

    /* JADX INFO: renamed from: U0.n$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC0528l f3585a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public C0506d[] f3587c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f3586b = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3588d = 0;

        public /* synthetic */ a(O o4) {
        }

        public AbstractC0530n a() {
            AbstractC0549h.b(this.f3585a != null, "execute parameter required");
            return new N(this, this.f3587c, this.f3586b, this.f3588d);
        }

        public a b(InterfaceC0528l interfaceC0528l) {
            this.f3585a = interfaceC0528l;
            return this;
        }

        public a c(boolean z3) {
            this.f3586b = z3;
            return this;
        }

        public a d(C0506d... c0506dArr) {
            this.f3587c = c0506dArr;
            return this;
        }
    }

    public AbstractC0530n(C0506d[] c0506dArr, boolean z3, int i4) {
        this.f3582a = c0506dArr;
        boolean z4 = false;
        if (c0506dArr != null && z3) {
            z4 = true;
        }
        this.f3583b = z4;
        this.f3584c = i4;
    }

    public static a a() {
        return new a(null);
    }

    public abstract void b(a.b bVar, C1446m c1446m);

    public boolean c() {
        return this.f3583b;
    }

    public final int d() {
        return this.f3584c;
    }

    public final C0506d[] e() {
        return this.f3582a;
    }
}
