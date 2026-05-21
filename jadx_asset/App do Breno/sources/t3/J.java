package t3;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class J implements Comparable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f11359n = new a(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f11360o;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1549e f11361m;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static /* synthetic */ J d(a aVar, File file, boolean z3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z3 = false;
            }
            return aVar.a(file, z3);
        }

        public static /* synthetic */ J e(a aVar, String str, boolean z3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z3 = false;
            }
            return aVar.b(str, z3);
        }

        public static /* synthetic */ J f(a aVar, Path path, boolean z3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z3 = false;
            }
            return aVar.c(path, z3);
        }

        public final J a(File file, boolean z3) {
            X2.l.e(file, "<this>");
            String string = file.toString();
            X2.l.d(string, "toString()");
            return b(string, z3);
        }

        public final J b(String str, boolean z3) {
            X2.l.e(str, "<this>");
            return u3.c.k(str, z3);
        }

        public final J c(Path path, boolean z3) {
            X2.l.e(path, "<this>");
            return b(path.toString(), z3);
        }

        public a() {
        }
    }

    static {
        String str = File.separator;
        X2.l.d(str, "separator");
        f11360o = str;
    }

    public J(C1549e c1549e) {
        X2.l.e(c1549e, "bytes");
        this.f11361m = c1549e;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(J j4) {
        X2.l.e(j4, "other");
        return f().compareTo(j4.f());
    }

    public boolean equals(Object obj) {
        return (obj instanceof J) && X2.l.a(((J) obj).f(), f());
    }

    public final C1549e f() {
        return this.f11361m;
    }

    public final J g() {
        int iO = u3.c.o(this);
        if (iO == -1) {
            return null;
        }
        return new J(f().A(0, iO));
    }

    public final List h() {
        ArrayList arrayList = new ArrayList();
        int iO = u3.c.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < f().y() && f().g(iO) == 92) {
            iO++;
        }
        int iY = f().y();
        int i4 = iO;
        while (iO < iY) {
            if (f().g(iO) == 47 || f().g(iO) == 92) {
                arrayList.add(f().A(i4, iO));
                i4 = iO + 1;
            }
            iO++;
        }
        if (i4 < f().y()) {
            arrayList.add(f().A(i4, f().y()));
        }
        return arrayList;
    }

    public int hashCode() {
        return f().hashCode();
    }

    public final boolean i() {
        return u3.c.o(this) != -1;
    }

    public final String j() {
        return k().C();
    }

    public final C1549e k() {
        int iL = u3.c.l(this);
        return iL != -1 ? C1549e.B(f(), iL + 1, 0, 2, null) : (s() == null || f().y() != 2) ? f() : C1549e.f11406q;
    }

    public final J l() {
        return f11359n.b(toString(), true);
    }

    public final J m() {
        if (X2.l.a(f(), u3.c.f11482d) || X2.l.a(f(), u3.c.f11479a) || X2.l.a(f(), u3.c.f11480b) || u3.c.n(this)) {
            return null;
        }
        int iL = u3.c.l(this);
        if (iL == 2 && s() != null) {
            if (f().y() == 3) {
                return null;
            }
            return new J(C1549e.B(f(), 0, 3, 1, null));
        }
        if (iL == 1 && f().z(u3.c.f11480b)) {
            return null;
        }
        if (iL != -1 || s() == null) {
            return iL == -1 ? new J(u3.c.f11482d) : iL == 0 ? new J(C1549e.B(f(), 0, 1, 1, null)) : new J(C1549e.B(f(), 0, iL, 1, null));
        }
        if (f().y() == 2) {
            return null;
        }
        return new J(C1549e.B(f(), 0, 2, 1, null));
    }

    public final J n(J j4) {
        X2.l.e(j4, "other");
        if (!X2.l.a(g(), j4.g())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + j4).toString());
        }
        List listH = h();
        List listH2 = j4.h();
        int iMin = Math.min(listH.size(), listH2.size());
        int i4 = 0;
        while (i4 < iMin && X2.l.a(listH.get(i4), listH2.get(i4))) {
            i4++;
        }
        if (i4 == iMin && f().y() == j4.f().y()) {
            return a.e(f11359n, ".", false, 1, null);
        }
        if (listH2.subList(i4, listH2.size()).indexOf(u3.c.f11483e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + j4).toString());
        }
        C1546b c1546b = new C1546b();
        C1549e c1549eM = u3.c.m(j4);
        if (c1549eM == null && (c1549eM = u3.c.m(this)) == null) {
            c1549eM = u3.c.s(f11360o);
        }
        int size = listH2.size();
        for (int i5 = i4; i5 < size; i5++) {
            c1546b.U(u3.c.f11483e);
            c1546b.U(c1549eM);
        }
        int size2 = listH.size();
        while (i4 < size2) {
            c1546b.U((C1549e) listH.get(i4));
            c1546b.U(c1549eM);
            i4++;
        }
        return u3.c.q(c1546b, false);
    }

    public final J o(String str) {
        X2.l.e(str, "child");
        return u3.c.j(this, u3.c.q(new C1546b().Y(str), false), false);
    }

    public final J p(J j4, boolean z3) {
        X2.l.e(j4, "child");
        return u3.c.j(this, j4, z3);
    }

    public final File q() {
        return new File(toString());
    }

    public final Path r() {
        Path path = Paths.get(toString(), new String[0]);
        X2.l.d(path, "get(toString())");
        return path;
    }

    public final Character s() {
        if (C1549e.o(f(), u3.c.f11479a, 0, 2, null) != -1 || f().y() < 2 || f().g(1) != 58) {
            return null;
        }
        char cG = (char) f().g(0);
        if (('a' > cG || cG >= '{') && ('A' > cG || cG >= '[')) {
            return null;
        }
        return Character.valueOf(cG);
    }

    public String toString() {
        return f().C();
    }
}
