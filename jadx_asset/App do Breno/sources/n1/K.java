package n1;

import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10644a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Queue f10645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10646c;

    public final void a(J j4) {
        synchronized (this.f10644a) {
            try {
                if (this.f10645b == null) {
                    this.f10645b = new ArrayDeque();
                }
                this.f10645b.add(j4);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(AbstractC1445l abstractC1445l) {
        J j4;
        synchronized (this.f10644a) {
            if (this.f10645b != null && !this.f10646c) {
                this.f10646c = true;
                while (true) {
                    synchronized (this.f10644a) {
                        try {
                            j4 = (J) this.f10645b.poll();
                            if (j4 == null) {
                                this.f10646c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    j4.d(abstractC1445l);
                }
            }
        }
    }
}
