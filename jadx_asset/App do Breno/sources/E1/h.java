package E1;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public class h implements Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Logger f944s = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final RandomAccessFile f945m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f946n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f947o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b f948p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public b f949q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final byte[] f950r = new byte[16];

    public class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f951a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ StringBuilder f952b;

        public a(StringBuilder sb) {
            this.f952b = sb;
        }

        @Override // E1.h.d
        public void a(InputStream inputStream, int i4) {
            if (this.f951a) {
                this.f951a = false;
            } else {
                this.f952b.append(", ");
            }
            this.f952b.append(i4);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f954c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f956b;

        public b(int i4, int i5) {
            this.f955a = i4;
            this.f956b = i5;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f955a + ", length = " + this.f956b + "]";
        }
    }

    public final class c extends InputStream {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f957m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f958n;

        public /* synthetic */ c(h hVar, b bVar, a aVar) {
            this(bVar);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i4, int i5) throws IOException {
            h.u(bArr, "buffer");
            if ((i4 | i5) < 0 || i5 > bArr.length - i4) {
                throw new ArrayIndexOutOfBoundsException();
            }
            int i6 = this.f958n;
            if (i6 <= 0) {
                return -1;
            }
            if (i5 > i6) {
                i5 = i6;
            }
            h.this.G(this.f957m, bArr, i4, i5);
            this.f957m = h.this.O(this.f957m + i5);
            this.f958n -= i5;
            return i5;
        }

        public c(b bVar) {
            this.f957m = h.this.O(bVar.f955a + 4);
            this.f958n = bVar.f956b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f958n == 0) {
                return -1;
            }
            h.this.f945m.seek(this.f957m);
            int i4 = h.this.f945m.read();
            this.f957m = h.this.O(this.f957m + 1);
            this.f958n--;
            return i4;
        }
    }

    public interface d {
        void a(InputStream inputStream, int i4);
    }

    public h(File file) throws IOException {
        if (!file.exists()) {
            q(file);
        }
        this.f945m = w(file);
        z();
    }

    public static int C(byte[] bArr, int i4) {
        return ((bArr[i4] & 255) << 24) + ((bArr[i4 + 1] & 255) << 16) + ((bArr[i4 + 2] & 255) << 8) + (bArr[i4 + 3] & 255);
    }

    public static void S(byte[] bArr, int i4, int i5) {
        bArr[i4] = (byte) (i5 >> 24);
        bArr[i4 + 1] = (byte) (i5 >> 16);
        bArr[i4 + 2] = (byte) (i5 >> 8);
        bArr[i4 + 3] = (byte) i5;
    }

    public static void T(byte[] bArr, int... iArr) {
        int i4 = 0;
        for (int i5 : iArr) {
            S(bArr, i4, i5);
            i4 += 4;
        }
    }

    public static void q(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile randomAccessFileW = w(file2);
        try {
            randomAccessFileW.setLength(4096L);
            randomAccessFileW.seek(0L);
            byte[] bArr = new byte[16];
            T(bArr, 4096, 0, 0, 0);
            randomAccessFileW.write(bArr);
            randomAccessFileW.close();
            if (!file2.renameTo(file)) {
                throw new IOException("Rename failed!");
            }
        } catch (Throwable th) {
            randomAccessFileW.close();
            throw th;
        }
    }

    public static Object u(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(str);
    }

    public static RandomAccessFile w(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    public final int D() {
        return this.f946n - M();
    }

    public synchronized void F() {
        try {
            if (r()) {
                throw new NoSuchElementException();
            }
            if (this.f947o == 1) {
                j();
            } else {
                b bVar = this.f948p;
                int iO = O(bVar.f955a + 4 + bVar.f956b);
                G(iO, this.f950r, 0, 4);
                int iC = C(this.f950r, 0);
                R(this.f946n, this.f947o - 1, iO, this.f949q.f955a);
                this.f947o--;
                this.f948p = new b(iO, iC);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void G(int i4, byte[] bArr, int i5, int i6) throws IOException {
        int iO = O(i4);
        int i7 = iO + i6;
        int i8 = this.f946n;
        if (i7 <= i8) {
            this.f945m.seek(iO);
            this.f945m.readFully(bArr, i5, i6);
            return;
        }
        int i9 = i8 - iO;
        this.f945m.seek(iO);
        this.f945m.readFully(bArr, i5, i9);
        this.f945m.seek(16L);
        this.f945m.readFully(bArr, i5 + i9, i6 - i9);
    }

    public final void H(int i4, byte[] bArr, int i5, int i6) throws IOException {
        int iO = O(i4);
        int i7 = iO + i6;
        int i8 = this.f946n;
        if (i7 <= i8) {
            this.f945m.seek(iO);
            this.f945m.write(bArr, i5, i6);
            return;
        }
        int i9 = i8 - iO;
        this.f945m.seek(iO);
        this.f945m.write(bArr, i5, i9);
        this.f945m.seek(16L);
        this.f945m.write(bArr, i5 + i9, i6 - i9);
    }

    public final void I(int i4) throws IOException {
        this.f945m.setLength(i4);
        this.f945m.getChannel().force(true);
    }

    public int M() {
        if (this.f947o == 0) {
            return 16;
        }
        b bVar = this.f949q;
        int i4 = bVar.f955a;
        int i5 = this.f948p.f955a;
        return i4 >= i5 ? (i4 - i5) + 4 + bVar.f956b + 16 : (((i4 + 4) + bVar.f956b) + this.f946n) - i5;
    }

    public final int O(int i4) {
        int i5 = this.f946n;
        return i4 < i5 ? i4 : (i4 + 16) - i5;
    }

    public final void R(int i4, int i5, int i6, int i7) throws IOException {
        T(this.f950r, i4, i5, i6, i7);
        this.f945m.seek(0L);
        this.f945m.write(this.f950r);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f945m.close();
    }

    public void f(byte[] bArr) {
        g(bArr, 0, bArr.length);
    }

    public synchronized void g(byte[] bArr, int i4, int i5) {
        int iO;
        try {
            u(bArr, "buffer");
            if ((i4 | i5) < 0 || i5 > bArr.length - i4) {
                throw new IndexOutOfBoundsException();
            }
            k(i5);
            boolean zR = r();
            if (zR) {
                iO = 16;
            } else {
                b bVar = this.f949q;
                iO = O(bVar.f955a + 4 + bVar.f956b);
            }
            b bVar2 = new b(iO, i5);
            S(this.f950r, 0, i5);
            H(bVar2.f955a, this.f950r, 0, 4);
            H(bVar2.f955a + 4, bArr, i4, i5);
            R(this.f946n, this.f947o + 1, zR ? bVar2.f955a : this.f948p.f955a, bVar2.f955a);
            this.f949q = bVar2;
            this.f947o++;
            if (zR) {
                this.f948p = bVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void j() {
        try {
            R(4096, 0, 0, 0);
            this.f947o = 0;
            b bVar = b.f954c;
            this.f948p = bVar;
            this.f949q = bVar;
            if (this.f946n > 4096) {
                I(4096);
            }
            this.f946n = 4096;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void k(int i4) throws IOException {
        int i5 = i4 + 4;
        int iD = D();
        if (iD >= i5) {
            return;
        }
        int i6 = this.f946n;
        do {
            iD += i6;
            i6 <<= 1;
        } while (iD < i5);
        I(i6);
        b bVar = this.f949q;
        int iO = O(bVar.f955a + 4 + bVar.f956b);
        if (iO < this.f948p.f955a) {
            FileChannel channel = this.f945m.getChannel();
            channel.position(this.f946n);
            long j4 = iO - 4;
            if (channel.transferTo(16L, j4, channel) != j4) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i7 = this.f949q.f955a;
        int i8 = this.f948p.f955a;
        if (i7 < i8) {
            int i9 = (this.f946n + i7) - 16;
            R(i6, this.f947o, i8, i9);
            this.f949q = new b(i9, this.f949q.f956b);
        } else {
            R(i6, this.f947o, i8, i7);
        }
        this.f946n = i6;
    }

    public synchronized void l(d dVar) {
        int iO = this.f948p.f955a;
        for (int i4 = 0; i4 < this.f947o; i4++) {
            b bVarX = x(iO);
            dVar.a(new c(this, bVarX, null), bVarX.f956b);
            iO = O(bVarX.f955a + 4 + bVarX.f956b);
        }
    }

    public synchronized boolean r() {
        return this.f947o == 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append("fileLength=");
        sb.append(this.f946n);
        sb.append(", size=");
        sb.append(this.f947o);
        sb.append(", first=");
        sb.append(this.f948p);
        sb.append(", last=");
        sb.append(this.f949q);
        sb.append(", element lengths=[");
        try {
            l(new a(sb));
        } catch (IOException e4) {
            f944s.log(Level.WARNING, "read error", (Throwable) e4);
        }
        sb.append("]]");
        return sb.toString();
    }

    public final b x(int i4) throws IOException {
        if (i4 == 0) {
            return b.f954c;
        }
        this.f945m.seek(i4);
        return new b(i4, this.f945m.readInt());
    }

    public final void z() throws IOException {
        this.f945m.seek(0L);
        this.f945m.readFully(this.f950r);
        int iC = C(this.f950r, 0);
        this.f946n = iC;
        if (iC <= this.f945m.length()) {
            this.f947o = C(this.f950r, 4);
            int iC2 = C(this.f950r, 8);
            int iC3 = C(this.f950r, 12);
            this.f948p = x(iC2);
            this.f949q = x(iC3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f946n + ", Actual length: " + this.f945m.length());
    }
}
