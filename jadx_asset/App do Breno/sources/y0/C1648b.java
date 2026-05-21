package y0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: y0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1648b extends AbstractC1649c {
    public C1648b(i iVar, AbstractC1650d abstractC1650d, long j4, int i4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(abstractC1650d.f11999a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j5 = j4 + ((long) (i4 * 16));
        this.f11997a = iVar.j(byteBufferAllocate, j5);
        this.f11998b = iVar.j(byteBufferAllocate, j5 + 8);
    }
}
