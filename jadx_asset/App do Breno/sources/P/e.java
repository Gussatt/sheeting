package P;

import L.w;
import X2.l;
import X2.m;
import h3.I;
import java.io.File;
import java.util.List;
import t3.AbstractC1552h;
import t3.J;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f2884a = new e();

    public static final class a extends m implements W2.a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ W2.a f2885n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W2.a aVar) {
            super(0);
            this.f2885n = aVar;
        }

        @Override // W2.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final J e() {
            File file = (File) this.f2885n.e();
            if (l.a(U2.e.a(file), "preferences_pb")) {
                J.a aVar = J.f11359n;
                File absoluteFile = file.getAbsoluteFile();
                l.d(absoluteFile, "file.absoluteFile");
                return J.a.d(aVar, absoluteFile, false, 1, null);
            }
            throw new IllegalStateException(("File extension for file: " + file + " does not match required extension for Preferences file: preferences_pb").toString());
        }
    }

    public final L.h a(w wVar, M.b bVar, List list, I i4) {
        l.e(wVar, "storage");
        l.e(list, "migrations");
        l.e(i4, "scope");
        return new d(L.i.f2542a.a(wVar, bVar, list, i4));
    }

    public final L.h b(M.b bVar, List list, I i4, W2.a aVar) {
        l.e(list, "migrations");
        l.e(i4, "scope");
        l.e(aVar, "produceFile");
        return new d(a(new N.d(AbstractC1552h.f11429b, j.f2890a, null, new a(aVar), 4, null), bVar, list, i4));
    }
}
