package y0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class k extends AbstractC1651e {
    public k(i iVar, AbstractC1650d abstractC1650d, long j4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(abstractC1650d.f11999a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j5 = abstractC1650d.f12001c + (j4 * ((long) abstractC1650d.f12003e));
        this.f12008a = iVar.l(byteBufferAllocate, j5);
        this.f12009b = iVar.j(byteBufferAllocate, 8 + j5);
        this.f12010c = iVar.j(byteBufferAllocate, 16 + j5);
        this.f12011d = iVar.j(byteBufferAllocate, j5 + 40);
    }
}
