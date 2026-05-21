package y0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: y0.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1654h extends AbstractC1650d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f12014j;

    public C1654h(boolean z3, i iVar) {
        this.f11999a = z3;
        this.f12014j = iVar;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(z3 ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        this.f12000b = iVar.g(byteBufferAllocate, 16L);
        this.f12001c = iVar.j(byteBufferAllocate, 32L);
        this.f12002d = iVar.j(byteBufferAllocate, 40L);
        this.f12003e = iVar.g(byteBufferAllocate, 54L);
        this.f12004f = iVar.g(byteBufferAllocate, 56L);
        this.f12005g = iVar.g(byteBufferAllocate, 58L);
        this.f12006h = iVar.g(byteBufferAllocate, 60L);
        this.f12007i = iVar.g(byteBufferAllocate, 62L);
    }

    @Override // y0.AbstractC1650d
    public AbstractC1649c a(long j4, int i4) {
        return new C1648b(this.f12014j, this, j4, i4);
    }

    @Override // y0.AbstractC1650d
    public AbstractC1651e b(long j4) {
        return new k(this.f12014j, this, j4);
    }

    @Override // y0.AbstractC1650d
    public AbstractC1652f c(int i4) {
        return new m(this.f12014j, this, i4);
    }
}
