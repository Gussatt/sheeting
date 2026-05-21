package h3;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: h3.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0999c0 extends AbstractC0995a0 {
    public abstract Thread g0();

    public final void h0() {
        Thread threadG0 = g0();
        if (Thread.currentThread() != threadG0) {
            AbstractC0998c.a();
            LockSupport.unpark(threadG0);
        }
    }
}
