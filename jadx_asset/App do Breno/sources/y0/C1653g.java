package y0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: y0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1653g extends AbstractC1650d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f12013j;

    public C1653g(boolean z3, i iVar) {
        this.f11999a = z3;
        this.f12013j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        byteBufferAllocate.order(z3 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f12000b = iVar.g(byteBufferAllocate, 16L);
        this.f12001c = iVar.l(byteBufferAllocate, 28L);
        this.f12002d = iVar.l(byteBufferAllocate, 32L);
        this.f12003e = iVar.g(byteBufferAllocate, 42L);
        this.f12004f = iVar.g(byteBufferAllocate, 44L);
        this.f12005g = iVar.g(byteBufferAllocate, 46L);
        this.f12006h = iVar.g(byteBufferAllocate, 48L);
        this.f12007i = iVar.g(byteBufferAllocate, 50L);
    }

    @Override // y0.AbstractC1650d
    public AbstractC1649c a(long j4, int i4) {
        return new C1647a(this.f12013j, this, j4, i4);
    }

    @Override // y0.AbstractC1650d
    public AbstractC1651e b(long j4) {
        return new j(this.f12013j, this, j4);
    }

    @Override // y0.AbstractC1650d
    public AbstractC1652f c(int i4) {
        return new l(this.f12013j, this, i4);
    }
}
