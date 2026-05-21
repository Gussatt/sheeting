package y0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class m extends AbstractC1652f {
    public m(i iVar, AbstractC1650d abstractC1650d, int i4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(abstractC1650d.f11999a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f12012a = iVar.l(byteBufferAllocate, abstractC1650d.f12002d + ((long) (i4 * abstractC1650d.f12005g)) + 44);
    }
}
