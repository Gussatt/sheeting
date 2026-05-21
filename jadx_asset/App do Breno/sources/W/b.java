package W;

import androidx.lifecycle.B;
import androidx.lifecycle.C;
import androidx.lifecycle.E;
import androidx.lifecycle.j;
import i.d;
import p.C1482h;

/* JADX INFO: loaded from: classes.dex */
public class b extends W.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f3773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f3774b;

    public static class a extends B {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C.b f3775f = new C0079a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C1482h f3776d = new C1482h();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3777e = false;

        /* JADX INFO: renamed from: W.b$a$a, reason: collision with other inner class name */
        public static class C0079a implements C.b {
            @Override // androidx.lifecycle.C.b
            public B a(Class cls) {
                return new a();
            }
        }

        public static a d(E e4) {
            return (a) new C(e4, f3775f).a(a.class);
        }

        @Override // androidx.lifecycle.B
        public void c() {
            super.c();
            if (this.f3776d.m() <= 0) {
                this.f3776d.b();
            } else {
                d.a(this.f3776d.n(0));
                throw null;
            }
        }

        public void e() {
            if (this.f3776d.m() <= 0) {
                return;
            }
            d.a(this.f3776d.n(0));
            throw null;
        }
    }

    public b(j jVar, E e4) {
        this.f3773a = jVar;
        this.f3774b = a.d(e4);
    }

    @Override // W.a
    public void b() {
        this.f3774b.e();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        B.b.a(this.f3773a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
