package t3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: t3.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1557m extends AbstractC1552h {
    @Override // t3.AbstractC1552h
    public void a(J j4, J j5) throws IOException {
        X2.l.e(j4, "source");
        X2.l.e(j5, "target");
        if (j4.q().renameTo(j5.q())) {
            return;
        }
        throw new IOException("failed to move " + j4 + " to " + j5);
    }

    @Override // t3.AbstractC1552h
    public void d(J j4, boolean z3) throws IOException {
        X2.l.e(j4, "dir");
        if (j4.q().mkdir()) {
            return;
        }
        C1551g c1551gH = h(j4);
        if (c1551gH == null || !c1551gH.c()) {
            throw new IOException("failed to create directory: " + j4);
        }
        if (z3) {
            throw new IOException(j4 + " already exist.");
        }
    }

    @Override // t3.AbstractC1552h
    public void f(J j4, boolean z3) throws IOException {
        X2.l.e(j4, "path");
        if (Thread.interrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        File fileQ = j4.q();
        if (fileQ.delete()) {
            return;
        }
        if (fileQ.exists()) {
            throw new IOException("failed to delete " + j4);
        }
        if (z3) {
            throw new FileNotFoundException("no such file: " + j4);
        }
    }

    @Override // t3.AbstractC1552h
    public C1551g h(J j4) {
        X2.l.e(j4, "path");
        File fileQ = j4.q();
        boolean zIsFile = fileQ.isFile();
        boolean zIsDirectory = fileQ.isDirectory();
        long jLastModified = fileQ.lastModified();
        long length = fileQ.length();
        if (zIsFile || zIsDirectory || jLastModified != 0 || length != 0 || fileQ.exists()) {
            return new C1551g(zIsFile, zIsDirectory, null, Long.valueOf(length), null, Long.valueOf(jLastModified), null, null, 128, null);
        }
        return null;
    }

    @Override // t3.AbstractC1552h
    public AbstractC1550f i(J j4) {
        X2.l.e(j4, "file");
        return new C1556l(false, new RandomAccessFile(j4.q(), "r"));
    }

    @Override // t3.AbstractC1552h
    public AbstractC1550f k(J j4, boolean z3, boolean z4) throws IOException {
        X2.l.e(j4, "file");
        if (z3 && z4) {
            throw new IllegalArgumentException("Cannot require mustCreate and mustExist at the same time.");
        }
        if (z3) {
            m(j4);
        }
        if (z4) {
            n(j4);
        }
        return new C1556l(true, new RandomAccessFile(j4.q(), "rw"));
    }

    @Override // t3.AbstractC1552h
    public Q l(J j4) {
        X2.l.e(j4, "file");
        return F.d(j4.q());
    }

    public final void m(J j4) throws IOException {
        if (g(j4)) {
            throw new IOException(j4 + " already exists.");
        }
    }

    public final void n(J j4) throws IOException {
        if (g(j4)) {
            return;
        }
        throw new IOException(j4 + " doesn't exist.");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
