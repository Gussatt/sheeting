package u3;

import L2.u;
import W2.l;
import X2.m;
import f3.p;
import f3.q;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import t3.AbstractC1550f;
import t3.AbstractC1552h;
import t3.C1551g;
import t3.J;
import t3.Q;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1552h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f11490f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final J f11491g = J.a.e(J.f11359n, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K2.f f11492e;

    public static final class a {

        /* JADX INFO: renamed from: u3.g$a$a, reason: collision with other inner class name */
        public static final class C0178a extends m implements l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0178a f11493n = new C0178a();

            public C0178a() {
                super(1);
            }

            @Override // W2.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean k(h hVar) {
                X2.l.e(hVar, "entry");
                return Boolean.valueOf(g.f11490f.c(hVar.a()));
            }
        }

        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final J b() {
            return g.f11491g;
        }

        public final boolean c(J j4) {
            return !p.n(j4.j(), ".class", true);
        }

        public final List d(ClassLoader classLoader) throws IOException {
            X2.l.e(classLoader, "<this>");
            Enumeration<URL> resources = classLoader.getResources("");
            X2.l.d(resources, "getResources(\"\")");
            ArrayList<URL> list = Collections.list(resources);
            X2.l.d(list, "list(this)");
            ArrayList arrayList = new ArrayList();
            for (URL url : list) {
                a aVar = g.f11490f;
                X2.l.d(url, "it");
                K2.i iVarE = aVar.e(url);
                if (iVarE != null) {
                    arrayList.add(iVarE);
                }
            }
            Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
            X2.l.d(resources2, "getResources(\"META-INF/MANIFEST.MF\")");
            ArrayList<URL> list2 = Collections.list(resources2);
            X2.l.d(list2, "list(this)");
            ArrayList arrayList2 = new ArrayList();
            for (URL url2 : list2) {
                a aVar2 = g.f11490f;
                X2.l.d(url2, "it");
                K2.i iVarF = aVar2.f(url2);
                if (iVarF != null) {
                    arrayList2.add(iVarF);
                }
            }
            return u.C(arrayList, arrayList2);
        }

        public final K2.i e(URL url) {
            X2.l.e(url, "<this>");
            if (X2.l.a(url.getProtocol(), "file")) {
                return K2.m.a(AbstractC1552h.f11429b, J.a.d(J.f11359n, new File(url.toURI()), false, 1, null));
            }
            return null;
        }

        public final K2.i f(URL url) {
            int iK;
            X2.l.e(url, "<this>");
            String string = url.toString();
            X2.l.d(string, "toString()");
            if (!p.t(string, "jar:file:", false, 2, null) || (iK = q.K(string, "!", 0, false, 6, null)) == -1) {
                return null;
            }
            J.a aVar = J.f11359n;
            String strSubstring = string.substring(4, iK);
            X2.l.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            return K2.m.a(i.d(J.a.d(aVar, new File(URI.create(strSubstring)), false, 1, null), AbstractC1552h.f11429b, C0178a.f11493n), b());
        }

        public a() {
        }
    }

    public static final class b extends m implements W2.a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ ClassLoader f11494n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ClassLoader classLoader) {
            super(0);
            this.f11494n = classLoader;
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List e() {
            return g.f11490f.d(this.f11494n);
        }
    }

    public g(ClassLoader classLoader, boolean z3) {
        X2.l.e(classLoader, "classLoader");
        this.f11492e = K2.g.a(new b(classLoader));
        if (z3) {
            p().size();
        }
    }

    private final J o(J j4) {
        return f11491g.p(j4, true);
    }

    @Override // t3.AbstractC1552h
    public void a(J j4, J j5) throws IOException {
        X2.l.e(j4, "source");
        X2.l.e(j5, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // t3.AbstractC1552h
    public void d(J j4, boolean z3) throws IOException {
        X2.l.e(j4, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // t3.AbstractC1552h
    public void f(J j4, boolean z3) throws IOException {
        X2.l.e(j4, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // t3.AbstractC1552h
    public C1551g h(J j4) {
        X2.l.e(j4, "path");
        if (!f11490f.c(j4)) {
            return null;
        }
        String strQ = q(j4);
        for (K2.i iVar : p()) {
            C1551g c1551gH = ((AbstractC1552h) iVar.a()).h(((J) iVar.b()).o(strQ));
            if (c1551gH != null) {
                return c1551gH;
            }
        }
        return null;
    }

    @Override // t3.AbstractC1552h
    public AbstractC1550f i(J j4) throws FileNotFoundException {
        X2.l.e(j4, "file");
        if (!f11490f.c(j4)) {
            throw new FileNotFoundException("file not found: " + j4);
        }
        String strQ = q(j4);
        for (K2.i iVar : p()) {
            try {
                return ((AbstractC1552h) iVar.a()).i(((J) iVar.b()).o(strQ));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + j4);
    }

    @Override // t3.AbstractC1552h
    public AbstractC1550f k(J j4, boolean z3, boolean z4) throws IOException {
        X2.l.e(j4, "file");
        throw new IOException("resources are not writable");
    }

    @Override // t3.AbstractC1552h
    public Q l(J j4) throws FileNotFoundException {
        X2.l.e(j4, "file");
        if (!f11490f.c(j4)) {
            throw new FileNotFoundException("file not found: " + j4);
        }
        String strQ = q(j4);
        for (K2.i iVar : p()) {
            try {
                return ((AbstractC1552h) iVar.a()).l(((J) iVar.b()).o(strQ));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + j4);
    }

    public final List p() {
        return (List) this.f11492e.getValue();
    }

    public final String q(J j4) {
        return o(j4).n(f11491g).toString();
    }
}
