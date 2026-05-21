package t3;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class L implements InterfaceC1548d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Q f11366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1546b f11367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11368o;

    public L(Q q4) {
        X2.l.e(q4, "source");
        this.f11366m = q4;
        this.f11367n = new C1546b();
    }

    @Override // t3.InterfaceC1548d
    public short A() throws EOFException {
        K(2L);
        return this.f11367n.A();
    }

    @Override // t3.InterfaceC1548d
    public long E() throws EOFException {
        K(8L);
        return this.f11367n.E();
    }

    @Override // t3.InterfaceC1548d
    public void K(long j4) throws EOFException {
        if (!a(j4)) {
            throw new EOFException();
        }
    }

    @Override // t3.InterfaceC1548d
    public InputStream P() {
        return new a();
    }

    public boolean a(long j4) {
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f11368o) {
            throw new IllegalStateException("closed");
        }
        while (this.f11367n.O() < j4) {
            if (this.f11366m.o(this.f11367n, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // t3.Q, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws EOFException {
        if (this.f11368o) {
            return;
        }
        this.f11368o = true;
        this.f11366m.close();
        this.f11367n.a();
    }

    @Override // t3.InterfaceC1548d
    public String h(long j4) throws EOFException {
        K(j4);
        return this.f11367n.h(j4);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f11368o;
    }

    @Override // t3.Q
    public long o(C1546b c1546b, long j4) {
        X2.l.e(c1546b, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
        }
        if (this.f11368o) {
            throw new IllegalStateException("closed");
        }
        if (this.f11367n.O() == 0 && this.f11366m.o(this.f11367n, 8192L) == -1) {
            return -1L;
        }
        return this.f11367n.o(c1546b, Math.min(j4, this.f11367n.O()));
    }

    @Override // t3.InterfaceC1548d
    public int p() throws EOFException {
        K(4L);
        return this.f11367n.p();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        X2.l.e(byteBuffer, "sink");
        if (this.f11367n.O() == 0 && this.f11366m.o(this.f11367n, 8192L) == -1) {
            return -1;
        }
        return this.f11367n.read(byteBuffer);
    }

    @Override // t3.InterfaceC1548d
    public byte readByte() throws EOFException {
        K(1L);
        return this.f11367n.readByte();
    }

    @Override // t3.InterfaceC1548d
    public C1546b s() {
        return this.f11367n;
    }

    @Override // t3.InterfaceC1548d
    public void skip(long j4) throws EOFException {
        if (this.f11368o) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            if (this.f11367n.O() == 0 && this.f11366m.o(this.f11367n, 8192L) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j4, this.f11367n.O());
            this.f11367n.skip(jMin);
            j4 -= jMin;
        }
    }

    @Override // t3.InterfaceC1548d
    public boolean t() {
        if (this.f11368o) {
            throw new IllegalStateException("closed");
        }
        return this.f11367n.t() && this.f11366m.o(this.f11367n, 8192L) == -1;
    }

    public String toString() {
        return "buffer(" + this.f11366m + ')';
    }

    public static final class a extends InputStream {
        public a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            L l4 = L.this;
            if (l4.f11368o) {
                throw new IOException("closed");
            }
            return (int) Math.min(l4.f11367n.O(), Integer.MAX_VALUE);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws EOFException {
            L.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            L l4 = L.this;
            if (l4.f11368o) {
                throw new IOException("closed");
            }
            if (l4.f11367n.O() == 0) {
                L l5 = L.this;
                if (l5.f11366m.o(l5.f11367n, 8192L) == -1) {
                    return -1;
                }
            }
            return L.this.f11367n.readByte() & 255;
        }

        public String toString() {
            return L.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            X2.l.e(bArr, "data");
            if (!L.this.f11368o) {
                AbstractC1545a.b(bArr.length, i4, i5);
                if (L.this.f11367n.O() == 0) {
                    L l4 = L.this;
                    if (l4.f11366m.o(l4.f11367n, 8192L) == -1) {
                        return -1;
                    }
                }
                return L.this.f11367n.read(bArr, i4, i5);
            }
            throw new IOException("closed");
        }
    }
}
