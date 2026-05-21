package t3;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: t3.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1554j implements Q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC1548d f11433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Inflater f11434n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11435o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11436p;

    public C1554j(InterfaceC1548d interfaceC1548d, Inflater inflater) {
        X2.l.e(interfaceC1548d, "source");
        X2.l.e(inflater, "inflater");
        this.f11433m = interfaceC1548d;
        this.f11434n = inflater;
    }

    public final long a(C1546b c1546b, long j4) throws IOException {
        X2.l.e(c1546b, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f11436p) {
            throw new IllegalStateException("closed");
        }
        if (j4 == 0) {
            return 0L;
        }
        try {
            M mT = c1546b.T(1);
            int iMin = (int) Math.min(j4, 8192 - mT.f11373c);
            c();
            int iInflate = this.f11434n.inflate(mT.f11371a, mT.f11373c, iMin);
            d();
            if (iInflate > 0) {
                mT.f11373c += iInflate;
                long j5 = iInflate;
                c1546b.M(c1546b.O() + j5);
                return j5;
            }
            if (mT.f11372b == mT.f11373c) {
                c1546b.f11395m = mT.b();
                N.b(mT);
            }
            return 0L;
        } catch (DataFormatException e4) {
            throw new IOException(e4);
        }
    }

    public final boolean c() {
        if (!this.f11434n.needsInput()) {
            return false;
        }
        if (this.f11433m.t()) {
            return true;
        }
        M m4 = this.f11433m.s().f11395m;
        X2.l.b(m4);
        int i4 = m4.f11373c;
        int i5 = m4.f11372b;
        int i6 = i4 - i5;
        this.f11435o = i6;
        this.f11434n.setInput(m4.f11371a, i5, i6);
        return false;
    }

    @Override // t3.Q, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        if (this.f11436p) {
            return;
        }
        this.f11434n.end();
        this.f11436p = true;
        this.f11433m.close();
    }

    public final void d() {
        int i4 = this.f11435o;
        if (i4 == 0) {
            return;
        }
        int remaining = i4 - this.f11434n.getRemaining();
        this.f11435o -= remaining;
        this.f11433m.skip(remaining);
    }

    @Override // t3.Q
    public long o(C1546b c1546b, long j4) throws IOException {
        X2.l.e(c1546b, "sink");
        do {
            long jA = a(c1546b, j4);
            if (jA > 0) {
                return jA;
            }
            if (this.f11434n.finished() || this.f11434n.needsDictionary()) {
                return -1L;
            }
        } while (!this.f11433m.t());
        throw new EOFException("source exhausted prematurely");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1554j(Q q4, Inflater inflater) {
        this(F.b(q4), inflater);
        X2.l.e(q4, "source");
        X2.l.e(inflater, "inflater");
    }
}
