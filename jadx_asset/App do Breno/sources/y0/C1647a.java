package y0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: y0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1647a extends AbstractC1649c {
    public C1647a(i iVar, AbstractC1650d abstractC1650d, long j4, int i4) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(abstractC1650d.f11999a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j5 = j4 + ((long) (i4 * 8));
        this.f11997a = iVar.l(byteBufferAllocate, j5);
        this.f11998b = iVar.l(byteBufferAllocate, j5 + 4);
    }
}
