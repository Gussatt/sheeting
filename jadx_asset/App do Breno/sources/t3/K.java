package t3;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC1547c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final P f11362m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C1546b f11363n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11364o;

    public K(P p4) {
        X2.l.e(p4, "sink");
        this.f11362m = p4;
        this.f11363n = new C1546b();
    }

    @Override // t3.InterfaceC1547c
    public OutputStream N() {
        return new a();
    }

    public InterfaceC1547c a() {
        if (this.f11364o) {
            throw new IllegalStateException("closed");
        }
        long jG = this.f11363n.g();
        if (jG > 0) {
            this.f11362m.m(this.f11363n, jG);
        }
        return this;
    }

    @Override // t3.P, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws Throwable {
        if (this.f11364o) {
            return;
        }
        try {
            if (this.f11363n.O() > 0) {
                P p4 = this.f11362m;
                C1546b c1546b = this.f11363n;
                p4.m(c1546b, c1546b.O());
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.f11362m.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f11364o = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // t3.P, java.io.Flushable
    public void flush() {
        if (this.f11364o) {
            throw new IllegalStateException("closed");
        }
        if (this.f11363n.O() > 0) {
            P p4 = this.f11362m;
            C1546b c1546b = this.f11363n;
            p4.m(c1546b, c1546b.O());
        }
        this.f11362m.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f11364o;
    }

    @Override // t3.P
    public void m(C1546b c1546b, long j4) {
        X2.l.e(c1546b, "source");
        if (this.f11364o) {
            throw new IllegalStateException("closed");
        }
        this.f11363n.m(c1546b, j4);
        a();
    }

    public String toString() {
        return "buffer(" + this.f11362m + ')';
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        X2.l.e(byteBuffer, "source");
        if (this.f11364o) {
            throw new IllegalStateException("closed");
        }
        int iWrite = this.f11363n.write(byteBuffer);
        a();
        return iWrite;
    }

    public static final class a extends OutputStream {
        public a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws Throwable {
            K.this.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
            K k4 = K.this;
            if (k4.f11364o) {
                return;
            }
            k4.flush();
        }

        public String toString() {
            return K.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i4) throws IOException {
            K k4 = K.this;
            if (k4.f11364o) {
                throw new IOException("closed");
            }
            k4.f11363n.X((byte) i4);
            K.this.a();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i4, int i5) throws IOException {
            X2.l.e(bArr, "data");
            K k4 = K.this;
            if (!k4.f11364o) {
                k4.f11363n.V(bArr, i4, i5);
                K.this.a();
                return;
            }
            throw new IOException("closed");
        }
    }
}
