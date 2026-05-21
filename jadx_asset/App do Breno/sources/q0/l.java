package q0;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public interface l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11057a = a.f11058a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f11058a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static W2.l f11059b = C0161a.f11060n;

        /* JADX INFO: renamed from: q0.l$a$a, reason: collision with other inner class name */
        public static final class C0161a extends X2.m implements W2.l {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public static final C0161a f11060n = new C0161a();

            public C0161a() {
                super(1);
            }

            @Override // W2.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final l k(l lVar) {
                X2.l.e(lVar, "it");
                return lVar;
            }
        }

        public final l a() {
            return (l) f11059b.k(o.f11061b);
        }
    }

    static l b() {
        return f11057a.a();
    }

    k a(Activity activity);
}
