package h3;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: h3.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1002e extends AbstractC0994a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Thread f7535p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AbstractC0995a0 f7536q;

    public C1002e(N2.i iVar, Thread thread, AbstractC0995a0 abstractC0995a0) {
        super(iVar, true, true);
        this.f7535p = thread;
        this.f7536q = abstractC0995a0;
    }

    @Override // h3.x0
    public void R(Object obj) {
        if (X2.l.a(Thread.currentThread(), this.f7535p)) {
            return;
        }
        Thread thread = this.f7535p;
        AbstractC0998c.a();
        LockSupport.unpark(thread);
    }

    public final Object V0() throws Throwable {
        AbstractC0998c.a();
        try {
            AbstractC0995a0 abstractC0995a0 = this.f7536q;
            if (abstractC0995a0 != null) {
                AbstractC0995a0.a0(abstractC0995a0, false, 1, null);
            }
            while (!Thread.interrupted()) {
                try {
                    AbstractC0995a0 abstractC0995a02 = this.f7536q;
                    long jD0 = abstractC0995a02 != null ? abstractC0995a02.d0() : Long.MAX_VALUE;
                    if (G()) {
                        AbstractC0995a0 abstractC0995a03 = this.f7536q;
                        if (abstractC0995a03 != null) {
                            AbstractC0995a0.V(abstractC0995a03, false, 1, null);
                        }
                        AbstractC0998c.a();
                        Object objH = y0.h(n0());
                        C1035z c1035z = objH instanceof C1035z ? (C1035z) objH : null;
                        if (c1035z == null) {
                            return objH;
                        }
                        throw c1035z.f7590a;
                    }
                    AbstractC0998c.a();
                    LockSupport.parkNanos(this, jD0);
                } catch (Throwable th) {
                    AbstractC0995a0 abstractC0995a04 = this.f7536q;
                    if (abstractC0995a04 != null) {
                        AbstractC0995a0.V(abstractC0995a04, false, 1, null);
                    }
                    throw th;
                }
            }
            InterruptedException interruptedException = new InterruptedException();
            U(interruptedException);
            throw interruptedException;
        } catch (Throwable th2) {
            AbstractC0998c.a();
            throw th2;
        }
    }

    @Override // h3.x0
    public boolean r0() {
        return true;
    }
}
