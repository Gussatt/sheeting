package E1;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f938c = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I1.g f939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f940b;

    public f(I1.g gVar) {
        this.f939a = gVar;
        this.f940b = f938c;
    }

    public void a() {
        this.f940b.d();
    }

    public byte[] b() {
        return this.f940b.c();
    }

    public String c() {
        return this.f940b.b();
    }

    public final File d(String str) {
        return this.f939a.q(str, "userlog");
    }

    public final void e(String str) {
        this.f940b.a();
        this.f940b = f938c;
        if (str == null) {
            return;
        }
        f(d(str), 65536);
    }

    public void f(File file, int i4) {
        this.f940b = new i(file, i4);
    }

    public void g(long j4, String str) {
        this.f940b.e(j4, str);
    }

    public f(I1.g gVar, String str) {
        this(gVar);
        e(str);
    }

    public static final class b implements d {
        public b() {
        }

        @Override // E1.d
        public String b() {
            return null;
        }

        @Override // E1.d
        public byte[] c() {
            return null;
        }

        @Override // E1.d
        public void a() {
        }

        @Override // E1.d
        public void d() {
        }

        @Override // E1.d
        public void e(long j4, String str) {
        }
    }
}
