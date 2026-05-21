package t3;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.zip.Inflater;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public final class T extends AbstractC1552h {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f11387i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final J f11388j = J.a.e(J.f11359n, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f11389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC1552h f11390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f11391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11392h;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
        }
    }

    public T(J j4, AbstractC1552h abstractC1552h, Map map, String str) {
        X2.l.e(j4, "zipPath");
        X2.l.e(abstractC1552h, "fileSystem");
        X2.l.e(map, "entries");
        this.f11389e = j4;
        this.f11390f = abstractC1552h;
        this.f11391g = map;
        this.f11392h = str;
    }

    @Override // t3.AbstractC1552h
    public void a(J j4, J j5) throws IOException {
        X2.l.e(j4, "source");
        X2.l.e(j5, "target");
        throw new IOException("zip file systems are read-only");
    }

    @Override // t3.AbstractC1552h
    public void d(J j4, boolean z3) throws IOException {
        X2.l.e(j4, "dir");
        throw new IOException("zip file systems are read-only");
    }

    @Override // t3.AbstractC1552h
    public void f(J j4, boolean z3) throws IOException {
        X2.l.e(j4, "path");
        throw new IOException("zip file systems are read-only");
    }

    @Override // t3.AbstractC1552h
    public C1551g h(J j4) throws Throwable {
        InterfaceC1548d interfaceC1548dB;
        X2.l.e(j4, "path");
        u3.h hVar = (u3.h) this.f11391g.get(m(j4));
        Throwable th = null;
        if (hVar == null) {
            return null;
        }
        C1551g c1551g = new C1551g(!hVar.h(), hVar.h(), null, hVar.h() ? null : Long.valueOf(hVar.g()), null, hVar.e(), null, null, 128, null);
        if (hVar.f() == -1) {
            return c1551g;
        }
        AbstractC1550f abstractC1550fI = this.f11390f.i(this.f11389e);
        try {
            interfaceC1548dB = F.b(abstractC1550fI.C(hVar.f()));
            if (abstractC1550fI != null) {
                try {
                    abstractC1550fI.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (abstractC1550fI != null) {
                try {
                    abstractC1550fI.close();
                } catch (Throwable th4) {
                    K2.a.a(th3, th4);
                }
            }
            th = th3;
            interfaceC1548dB = null;
        }
        if (th != null) {
            throw th;
        }
        X2.l.b(interfaceC1548dB);
        return u3.i.h(interfaceC1548dB, c1551g);
    }

    @Override // t3.AbstractC1552h
    public AbstractC1550f i(J j4) {
        X2.l.e(j4, "file");
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // t3.AbstractC1552h
    public AbstractC1550f k(J j4, boolean z3, boolean z4) throws IOException {
        X2.l.e(j4, "file");
        throw new IOException("zip entries are not writable");
    }

    @Override // t3.AbstractC1552h
    public Q l(J j4) throws Throwable {
        InterfaceC1548d interfaceC1548dB;
        X2.l.e(j4, "file");
        u3.h hVar = (u3.h) this.f11391g.get(m(j4));
        if (hVar == null) {
            throw new FileNotFoundException("no such file: " + j4);
        }
        AbstractC1550f abstractC1550fI = this.f11390f.i(this.f11389e);
        Throwable th = null;
        try {
            interfaceC1548dB = F.b(abstractC1550fI.C(hVar.f()));
            if (abstractC1550fI != null) {
                try {
                    abstractC1550fI.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (abstractC1550fI != null) {
                try {
                    abstractC1550fI.close();
                } catch (Throwable th4) {
                    K2.a.a(th3, th4);
                }
            }
            interfaceC1548dB = null;
            th = th3;
        }
        if (th != null) {
            throw th;
        }
        X2.l.b(interfaceC1548dB);
        u3.i.k(interfaceC1548dB);
        return hVar.d() == 0 ? new u3.f(interfaceC1548dB, hVar.g(), true) : new u3.f(new C1554j(new u3.f(interfaceC1548dB, hVar.c(), true), new Inflater(true)), hVar.g(), false);
    }

    public final J m(J j4) {
        return f11388j.p(j4, true);
    }
}
