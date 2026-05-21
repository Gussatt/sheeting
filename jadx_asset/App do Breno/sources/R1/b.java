package R1;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f3334m = 0;

    public long a() {
        return this.f3334m;
    }

    @Override // java.io.OutputStream
    public void write(int i4) {
        this.f3334m++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f3334m += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i4, int i5) {
        int i6;
        if (i4 >= 0 && i4 <= bArr.length && i5 >= 0 && (i6 = i4 + i5) <= bArr.length && i6 >= 0) {
            this.f3334m += (long) i5;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
