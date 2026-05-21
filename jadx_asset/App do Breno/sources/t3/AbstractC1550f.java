package t3;

import java.io.Closeable;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: t3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1550f implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f11410m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11411n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11412o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ReentrantLock f11413p = U.b();

    /* JADX INFO: renamed from: t3.f$a */
    public static final class a implements P {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AbstractC1550f f11414m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f11415n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f11416o;

        public a(AbstractC1550f abstractC1550f, long j4) {
            X2.l.e(abstractC1550f, "fileHandle");
            this.f11414m = abstractC1550f;
            this.f11415n = j4;
        }

        @Override // t3.P, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            if (this.f11416o) {
                return;
            }
            this.f11416o = true;
            ReentrantLock reentrantLockG = this.f11414m.g();
            reentrantLockG.lock();
            try {
                AbstractC1550f abstractC1550f = this.f11414m;
                abstractC1550f.f11412o--;
                if (this.f11414m.f11412o == 0 && this.f11414m.f11411n) {
                    K2.p pVar = K2.p.f2516a;
                    reentrantLockG.unlock();
                    this.f11414m.j();
                }
            } finally {
                reentrantLockG.unlock();
            }
        }

        @Override // t3.P, java.io.Flushable
        public void flush() {
            if (this.f11416o) {
                throw new IllegalStateException("closed");
            }
            this.f11414m.k();
        }

        @Override // t3.P
        public void m(C1546b c1546b, long j4) {
            X2.l.e(c1546b, "source");
            if (this.f11416o) {
                throw new IllegalStateException("closed");
            }
            this.f11414m.D(this.f11415n, c1546b, j4);
            this.f11415n += j4;
        }
    }

    /* JADX INFO: renamed from: t3.f$b */
    public static final class b implements Q {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final AbstractC1550f f11417m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f11418n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f11419o;

        public b(AbstractC1550f abstractC1550f, long j4) {
            X2.l.e(abstractC1550f, "fileHandle");
            this.f11417m = abstractC1550f;
            this.f11418n = j4;
        }

        @Override // t3.Q, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
        public void close() {
            if (this.f11419o) {
                return;
            }
            this.f11419o = true;
            ReentrantLock reentrantLockG = this.f11417m.g();
            reentrantLockG.lock();
            try {
                AbstractC1550f abstractC1550f = this.f11417m;
                abstractC1550f.f11412o--;
                if (this.f11417m.f11412o == 0 && this.f11417m.f11411n) {
                    K2.p pVar = K2.p.f2516a;
                    reentrantLockG.unlock();
                    this.f11417m.j();
                }
            } finally {
                reentrantLockG.unlock();
            }
        }

        @Override // t3.Q
        public long o(C1546b c1546b, long j4) {
            X2.l.e(c1546b, "sink");
            if (this.f11419o) {
                throw new IllegalStateException("closed");
            }
            long jU = this.f11417m.u(this.f11418n, c1546b, j4);
            if (jU != -1) {
                this.f11418n += jU;
            }
            return jU;
        }
    }

    public AbstractC1550f(boolean z3) {
        this.f11410m = z3;
    }

    public static /* synthetic */ P x(AbstractC1550f abstractC1550f, long j4, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sink");
        }
        if ((i4 & 1) != 0) {
            j4 = 0;
        }
        return abstractC1550f.w(j4);
    }

    public final Q C(long j4) {
        ReentrantLock reentrantLock = this.f11413p;
        reentrantLock.lock();
        try {
            if (this.f11411n) {
                throw new IllegalStateException("closed");
            }
            this.f11412o++;
            reentrantLock.unlock();
            return new b(this, j4);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void D(long j4, C1546b c1546b, long j5) {
        AbstractC1545a.b(c1546b.O(), 0L, j5);
        long j6 = j4 + j5;
        long j7 = j4;
        while (j7 < j6) {
            M m4 = c1546b.f11395m;
            X2.l.b(m4);
            int iMin = (int) Math.min(j6 - j7, m4.f11373c - m4.f11372b);
            r(j7, m4.f11371a, m4.f11372b, iMin);
            m4.f11372b += iMin;
            long j8 = iMin;
            j7 += j8;
            c1546b.M(c1546b.O() - j8);
            if (m4.f11372b == m4.f11373c) {
                c1546b.f11395m = m4.b();
                N.b(m4);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f11413p;
        reentrantLock.lock();
        try {
            if (this.f11411n) {
                return;
            }
            this.f11411n = true;
            if (this.f11412o != 0) {
                return;
            }
            K2.p pVar = K2.p.f2516a;
            reentrantLock.unlock();
            j();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void flush() {
        if (!this.f11410m) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f11413p;
        reentrantLock.lock();
        try {
            if (this.f11411n) {
                throw new IllegalStateException("closed");
            }
            K2.p pVar = K2.p.f2516a;
            reentrantLock.unlock();
            k();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final ReentrantLock g() {
        return this.f11413p;
    }

    public abstract void j();

    public abstract void k();

    public abstract int l(long j4, byte[] bArr, int i4, int i5);

    public abstract long q();

    public abstract void r(long j4, byte[] bArr, int i4, int i5);

    public final long u(long j4, C1546b c1546b, long j5) {
        if (j5 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j5).toString());
        }
        long j6 = j5 + j4;
        long j7 = j4;
        while (true) {
            if (j7 >= j6) {
                break;
            }
            M mT = c1546b.T(1);
            int iL = l(j7, mT.f11371a, mT.f11373c, (int) Math.min(j6 - j7, 8192 - r7));
            if (iL == -1) {
                if (mT.f11372b == mT.f11373c) {
                    c1546b.f11395m = mT.b();
                    N.b(mT);
                }
                if (j4 == j7) {
                    return -1L;
                }
            } else {
                mT.f11373c += iL;
                long j8 = iL;
                j7 += j8;
                c1546b.M(c1546b.O() + j8);
            }
        }
        return j7 - j4;
    }

    public final P w(long j4) {
        if (!this.f11410m) {
            throw new IllegalStateException("file handle is read-only");
        }
        ReentrantLock reentrantLock = this.f11413p;
        reentrantLock.lock();
        try {
            if (this.f11411n) {
                throw new IllegalStateException("closed");
            }
            this.f11412o++;
            reentrantLock.unlock();
            return new a(this, j4);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long z() {
        ReentrantLock reentrantLock = this.f11413p;
        reentrantLock.lock();
        try {
            if (this.f11411n) {
                throw new IllegalStateException("closed");
            }
            K2.p pVar = K2.p.f2516a;
            reentrantLock.unlock();
            return q();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
