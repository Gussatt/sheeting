package androidx.lifecycle;

import java.util.Map;
import l.C1377c;
import m.C1390b;

/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f4994j = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f4995a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C1390b f4996b = new C1390b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4997c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f4998d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Object f4999e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5000f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5001g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5002h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Runnable f5003i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (m.this.f4995a) {
                obj = m.this.f4999e;
                m.this.f4999e = m.f4994j;
            }
            m.this.d(obj);
        }
    }

    public abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f5005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5007c;

        public abstract void a(boolean z3);

        public abstract boolean b();
    }

    public m() {
        Object obj = f4994j;
        this.f4999e = obj;
        this.f5003i = new a();
        this.f4998d = obj;
        this.f5000f = -1;
    }

    public static void a(String str) {
        if (C1377c.f().b()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public final void b(b bVar) {
        if (bVar.f5006b) {
            if (!bVar.b()) {
                bVar.a(false);
                return;
            }
            int i4 = bVar.f5007c;
            int i5 = this.f5000f;
            if (i4 >= i5) {
                return;
            }
            bVar.f5007c = i5;
            bVar.f5005a.a(this.f4998d);
        }
    }

    public void c(b bVar) {
        if (this.f5001g) {
            this.f5002h = true;
            return;
        }
        this.f5001g = true;
        do {
            this.f5002h = false;
            C1390b.d dVarH = this.f4996b.h();
            while (dVarH.hasNext()) {
                b((b) ((Map.Entry) dVarH.next()).getValue());
                if (this.f5002h) {
                    break;
                }
            }
        } while (this.f5002h);
        this.f5001g = false;
    }

    public void d(Object obj) {
        a("setValue");
        this.f5000f++;
        this.f4998d = obj;
        c(null);
    }
}
