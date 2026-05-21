package H2;

import H2.C0303c0;
import android.webkit.DownloadListener;

/* JADX INFO: renamed from: H2.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0303c0 extends Q0 {

    /* JADX INFO: renamed from: H2.c0$a */
    public static class a implements DownloadListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0303c0 f1999a;

        public a(C0303c0 c0303c0) {
            this.f1999a = c0303c0;
        }

        public static /* synthetic */ K2.p a(K2.j jVar) {
            return null;
        }

        @Override // android.webkit.DownloadListener
        public void onDownloadStart(final String str, final String str2, final String str3, final String str4, final long j4) {
            this.f1999a.b().P(new Runnable() { // from class: H2.a0
                @Override // java.lang.Runnable
                public final void run() {
                    C0303c0.a aVar = this.f1971m;
                    aVar.f1999a.c(aVar, str, str2, str3, str4, j4, new W2.l() { // from class: H2.b0
                        @Override // W2.l
                        public final Object k(Object obj) {
                            return C0303c0.a.a((K2.j) obj);
                        }
                    });
                }
            });
        }
    }

    public C0303c0(O3 o32) {
        super(o32);
    }

    @Override // H2.Q0
    public DownloadListener e() {
        return new a(this);
    }

    @Override // H2.Q0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public O3 b() {
        return (O3) super.b();
    }
}
