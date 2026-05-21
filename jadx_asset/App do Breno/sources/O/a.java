package O;

import W2.l;
import X2.m;
import android.content.Context;
import h3.I;
import h3.J;
import h3.J0;
import h3.W;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: O.a$a, reason: collision with other inner class name */
    public static final class C0063a extends m implements l {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final C0063a f2824n = new C0063a();

        public C0063a() {
            super(1);
        }

        @Override // W2.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List k(Context context) {
            X2.l.e(context, "it");
            return L2.m.f();
        }
    }

    public static final Z2.a a(String str, M.b bVar, l lVar, I i4) {
        X2.l.e(str, "name");
        X2.l.e(lVar, "produceMigrations");
        X2.l.e(i4, "scope");
        return new c(str, bVar, lVar, i4);
    }

    public static /* synthetic */ Z2.a b(String str, M.b bVar, l lVar, I i4, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            bVar = null;
        }
        if ((i5 & 4) != 0) {
            lVar = C0063a.f2824n;
        }
        if ((i5 & 8) != 0) {
            i4 = J.a(W.b().D(J0.b(null, 1, null)));
        }
        return a(str, bVar, lVar, i4);
    }
}
