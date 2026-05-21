package t3;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: t3.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1555k implements Q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InputStream f11437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final S f11438n;

    public C1555k(InputStream inputStream, S s4) {
        X2.l.e(inputStream, "input");
        X2.l.e(s4, "timeout");
        this.f11437m = inputStream;
        this.f11438n = s4;
    }

    @Override // t3.Q, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        this.f11437m.close();
    }

    @Override // t3.Q
    public long o(C1546b c1546b, long j4) throws IOException {
        X2.l.e(c1546b, "sink");
        if (j4 == 0) {
            return 0L;
        }
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        try {
            this.f11438n.a();
            M mT = c1546b.T(1);
            int i4 = this.f11437m.read(mT.f11371a, mT.f11373c, (int) Math.min(j4, 8192 - mT.f11373c));
            if (i4 != -1) {
                mT.f11373c += i4;
                long j5 = i4;
                c1546b.M(c1546b.O() + j5);
                return j5;
            }
            if (mT.f11372b != mT.f11373c) {
                return -1L;
            }
            c1546b.f11395m = mT.b();
            N.b(mT);
            return -1L;
        } catch (AssertionError e4) {
            if (F.c(e4)) {
                throw new IOException(e4);
            }
            throw e4;
        }
    }

    public String toString() {
        return "source(" + this.f11437m + ')';
    }
}
