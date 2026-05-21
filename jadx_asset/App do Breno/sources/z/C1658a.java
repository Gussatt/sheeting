package z;

import android.graphics.Typeface;
import android.os.Handler;
import z.f;
import z.g;

/* JADX INFO: renamed from: z.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1658a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.c f12033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f12034b;

    /* JADX INFO: renamed from: z.a$a, reason: collision with other inner class name */
    public class RunnableC0191a implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g.c f12035m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Typeface f12036n;

        public RunnableC0191a(g.c cVar, Typeface typeface) {
            this.f12035m = cVar;
            this.f12036n = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12035m.b(this.f12036n);
        }
    }

    /* JADX INFO: renamed from: z.a$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ g.c f12038m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f12039n;

        public b(g.c cVar, int i4) {
            this.f12038m = cVar;
            this.f12039n = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f12038m.a(this.f12039n);
        }
    }

    public C1658a(g.c cVar, Handler handler) {
        this.f12033a = cVar;
        this.f12034b = handler;
    }

    public final void a(int i4) {
        this.f12034b.post(new b(this.f12033a, i4));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f12063a);
        } else {
            a(eVar.f12064b);
        }
    }

    public final void c(Typeface typeface) {
        this.f12034b.post(new RunnableC0191a(this.f12033a, typeface));
    }
}
