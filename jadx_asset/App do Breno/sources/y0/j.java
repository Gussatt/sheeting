package y0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class j extends AbstractC1651e {
    public j(i iVar, AbstractC1650d abstractC1650d, long j4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(abstractC1650d.f11999a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j5 = abstractC1650d.f12001c + (j4 * ((long) abstractC1650d.f12003e));
        this.f12008a = iVar.l(byteBufferAllocate, j5);
        this.f12009b = iVar.l(byteBufferAllocate, 4 + j5);
        this.f12010c = iVar.l(byteBufferAllocate, 8 + j5);
        this.f12011d = iVar.l(byteBufferAllocate, j5 + 20);
    }
}
