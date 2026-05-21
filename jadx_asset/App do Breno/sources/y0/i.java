package y0;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i implements Closeable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f12015m = 1179403647;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final FileChannel f12016n;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f12016n = new FileInputStream(file).getChannel();
    }

    public final long a(AbstractC1650d abstractC1650d, long j4, long j5) {
        for (long j6 = 0; j6 < j4; j6++) {
            AbstractC1651e abstractC1651eB = abstractC1650d.b(j6);
            if (abstractC1651eB.f12008a == 1) {
                long j7 = abstractC1651eB.f12010c;
                if (j7 <= j5 && j5 <= abstractC1651eB.f12011d + j7) {
                    return (j5 - j7) + abstractC1651eB.f12009b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public AbstractC1650d c() throws IOException {
        this.f12016n.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (l(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sF = f(byteBufferAllocate, 4L);
        boolean z3 = f(byteBufferAllocate, 5L) == 2;
        if (sF == 1) {
            return new C1653g(z3, this);
        }
        if (sF == 2) {
            return new C1654h(z3, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12016n.close();
    }

    public List d() throws IOException {
        long j4;
        long j5;
        this.f12016n.position(0L);
        ArrayList arrayList = new ArrayList();
        AbstractC1650d abstractC1650dC = c();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(abstractC1650dC.f11999a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j6 = abstractC1650dC.f12004f;
        int i4 = 0;
        if (j6 == 65535) {
            j6 = abstractC1650dC.c(0).f12012a;
        }
        long j7 = 0;
        while (true) {
            j4 = 1;
            if (j7 >= j6) {
                j5 = 0;
                break;
            }
            AbstractC1651e abstractC1651eB = abstractC1650dC.b(j7);
            if (abstractC1651eB.f12008a == 2) {
                j5 = abstractC1651eB.f12009b;
                break;
            }
            j7++;
        }
        if (j5 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j8 = 0;
        while (true) {
            AbstractC1649c abstractC1649cA = abstractC1650dC.a(j5, i4);
            long j9 = j4;
            long j10 = abstractC1649cA.f11997a;
            if (j10 == j9) {
                arrayList2.add(Long.valueOf(abstractC1649cA.f11998b));
            } else if (j10 == 5) {
                j8 = abstractC1649cA.f11998b;
            }
            i4++;
            if (abstractC1649cA.f11997a == 0) {
                break;
            }
            j4 = j9;
            j6 = j6;
        }
        if (j8 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(abstractC1650dC, j6, j8);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(k(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    public void e(ByteBuffer byteBuffer, long j4, int i4) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i4);
        long j5 = 0;
        while (j5 < i4) {
            int i5 = this.f12016n.read(byteBuffer, j4 + j5);
            if (i5 == -1) {
                throw new EOFException();
            }
            j5 += (long) i5;
        }
        byteBuffer.position(0);
    }

    public short f(ByteBuffer byteBuffer, long j4) throws IOException {
        e(byteBuffer, j4, 1);
        return (short) (byteBuffer.get() & 255);
    }

    public int g(ByteBuffer byteBuffer, long j4) throws IOException {
        e(byteBuffer, j4, 2);
        return byteBuffer.getShort() & 65535;
    }

    public long j(ByteBuffer byteBuffer, long j4) throws IOException {
        e(byteBuffer, j4, 8);
        return byteBuffer.getLong();
    }

    public String k(ByteBuffer byteBuffer, long j4) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            long j5 = 1 + j4;
            short sF = f(byteBuffer, j4);
            if (sF == 0) {
                return sb.toString();
            }
            sb.append((char) sF);
            j4 = j5;
        }
    }

    public long l(ByteBuffer byteBuffer, long j4) throws IOException {
        e(byteBuffer, j4, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
