package h3;

import N2.i;
import java.io.Closeable;

/* JADX INFO: renamed from: h3.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1007g0 extends F implements Closeable {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f7540o = new a(null);

    /* JADX INFO: renamed from: h3.g0$a */
    public static final class a extends N2.b {

        /* JADX INFO: renamed from: h3.g0$a$a, reason: collision with other inner class name */
        public static final class C0126a extends X2.m implements W2.l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0126a f7541n = new C0126a();

            public C0126a() {
                super(1);
            }

            @Override // W2.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AbstractC1007g0 k(i.b bVar) {
                if (bVar instanceof AbstractC1007g0) {
                    return (AbstractC1007g0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public a() {
            super(F.f7498n, C0126a.f7541n);
        }
    }
}
