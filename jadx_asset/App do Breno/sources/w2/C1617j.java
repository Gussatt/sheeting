package w2;

import java.nio.ByteBuffer;
import l2.AbstractC1388b;
import w2.InterfaceC1609b;

/* JADX INFO: renamed from: w2.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1617j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1609b f11881a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11882b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC1618k f11883c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1609b.c f11884d;

    /* JADX INFO: renamed from: w2.j$a */
    public final class a implements InterfaceC1609b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f11885a;

        /* JADX INFO: renamed from: w2.j$a$a, reason: collision with other inner class name */
        public class C0186a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1609b.InterfaceC0184b f11887a;

            public C0186a(InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
                this.f11887a = interfaceC0184b;
            }

            @Override // w2.C1617j.d
            public void a(Object obj) {
                this.f11887a.a(C1617j.this.f11883c.a(obj));
            }

            @Override // w2.C1617j.d
            public void b(String str, String str2, Object obj) {
                this.f11887a.a(C1617j.this.f11883c.c(str, str2, obj));
            }

            @Override // w2.C1617j.d
            public void c() {
                this.f11887a.a(null);
            }
        }

        public a(c cVar) {
            this.f11885a = cVar;
        }

        @Override // w2.InterfaceC1609b.a
        public void a(ByteBuffer byteBuffer, InterfaceC1609b.InterfaceC0184b interfaceC0184b) {
            try {
                this.f11885a.g(C1617j.this.f11883c.e(byteBuffer), new C0186a(interfaceC0184b));
            } catch (RuntimeException e4) {
                AbstractC1388b.c("MethodChannel#" + C1617j.this.f11882b, "Failed to handle method call", e4);
                interfaceC0184b.a(C1617j.this.f11883c.b("error", e4.getMessage(), null, AbstractC1388b.d(e4)));
            }
        }
    }

    /* JADX INFO: renamed from: w2.j$b */
    public final class b implements InterfaceC1609b.InterfaceC0184b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f11889a;

        public b(d dVar) {
            this.f11889a = dVar;
        }

        @Override // w2.InterfaceC1609b.InterfaceC0184b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f11889a.c();
                } else {
                    try {
                        this.f11889a.a(C1617j.this.f11883c.f(byteBuffer));
                    } catch (C1611d e4) {
                        this.f11889a.b(e4.f11875m, e4.getMessage(), e4.f11876n);
                    }
                }
            } catch (RuntimeException e5) {
                AbstractC1388b.c("MethodChannel#" + C1617j.this.f11882b, "Failed to handle method call result", e5);
            }
        }
    }

    /* JADX INFO: renamed from: w2.j$c */
    public interface c {
        void g(C1616i c1616i, d dVar);
    }

    /* JADX INFO: renamed from: w2.j$d */
    public interface d {
        void a(Object obj);

        void b(String str, String str2, Object obj);

        void c();
    }

    public C1617j(InterfaceC1609b interfaceC1609b, String str) {
        this(interfaceC1609b, str, C1622o.f11894b);
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f11881a.c(this.f11882b, this.f11883c.d(new C1616i(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        if (this.f11884d != null) {
            this.f11881a.d(this.f11882b, cVar != null ? new a(cVar) : null, this.f11884d);
        } else {
            this.f11881a.h(this.f11882b, cVar != null ? new a(cVar) : null);
        }
    }

    public C1617j(InterfaceC1609b interfaceC1609b, String str, InterfaceC1618k interfaceC1618k) {
        this(interfaceC1609b, str, interfaceC1618k, null);
    }

    public C1617j(InterfaceC1609b interfaceC1609b, String str, InterfaceC1618k interfaceC1618k, InterfaceC1609b.c cVar) {
        this.f11881a = interfaceC1609b;
        this.f11882b = str;
        this.f11883c = interfaceC1618k;
        this.f11884d = cVar;
    }
}
