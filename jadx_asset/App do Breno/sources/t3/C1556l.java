package t3;

import java.io.RandomAccessFile;

/* JADX INFO: renamed from: t3.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1556l extends AbstractC1550f {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RandomAccessFile f11439q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1556l(boolean z3, RandomAccessFile randomAccessFile) {
        super(z3);
        X2.l.e(randomAccessFile, "randomAccessFile");
        this.f11439q = randomAccessFile;
    }

    @Override // t3.AbstractC1550f
    public synchronized void j() {
        this.f11439q.close();
    }

    @Override // t3.AbstractC1550f
    public synchronized void k() {
        this.f11439q.getFD().sync();
    }

    @Override // t3.AbstractC1550f
    public synchronized int l(long j4, byte[] bArr, int i4, int i5) {
        X2.l.e(bArr, "array");
        this.f11439q.seek(j4);
        int i6 = 0;
        while (true) {
            if (i6 >= i5) {
                break;
            }
            int i7 = this.f11439q.read(bArr, i4, i5 - i6);
            if (i7 != -1) {
                i6 += i7;
            } else if (i6 == 0) {
                return -1;
            }
        }
        return i6;
    }

    @Override // t3.AbstractC1550f
    public synchronized long q() {
        return this.f11439q.length();
    }

    @Override // t3.AbstractC1550f
    public synchronized void r(long j4, byte[] bArr, int i4, int i5) {
        X2.l.e(bArr, "array");
        this.f11439q.seek(j4);
        this.f11439q.write(bArr, i4, i5);
    }
}
