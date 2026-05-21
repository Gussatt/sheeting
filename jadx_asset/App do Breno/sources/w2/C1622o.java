package w2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import l2.AbstractC1388b;
import w2.C1621n;

/* JADX INFO: renamed from: w2.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1622o implements InterfaceC1618k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1622o f11894b = new C1622o(C1621n.f11891a);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1621n f11895a;

    public C1622o(C1621n c1621n) {
        this.f11895a = c1621n;
    }

    @Override // w2.InterfaceC1618k
    public ByteBuffer a(Object obj) throws IOException {
        C1621n.a aVar = new C1621n.a();
        aVar.write(0);
        this.f11895a.p(aVar, obj);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // w2.InterfaceC1618k
    public ByteBuffer b(String str, String str2, Object obj, String str3) throws IOException {
        C1621n.a aVar = new C1621n.a();
        aVar.write(1);
        this.f11895a.p(aVar, str);
        this.f11895a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f11895a.p(aVar, AbstractC1388b.d((Throwable) obj));
        } else {
            this.f11895a.p(aVar, obj);
        }
        this.f11895a.p(aVar, str3);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // w2.InterfaceC1618k
    public ByteBuffer c(String str, String str2, Object obj) throws IOException {
        C1621n.a aVar = new C1621n.a();
        aVar.write(1);
        this.f11895a.p(aVar, str);
        this.f11895a.p(aVar, str2);
        if (obj instanceof Throwable) {
            this.f11895a.p(aVar, AbstractC1388b.d((Throwable) obj));
        } else {
            this.f11895a.p(aVar, obj);
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // w2.InterfaceC1618k
    public ByteBuffer d(C1616i c1616i) {
        C1621n.a aVar = new C1621n.a();
        this.f11895a.p(aVar, c1616i.f11879a);
        this.f11895a.p(aVar, c1616i.f11880b);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(aVar.size());
        byteBufferAllocateDirect.put(aVar.a(), 0, aVar.size());
        return byteBufferAllocateDirect;
    }

    @Override // w2.InterfaceC1618k
    public C1616i e(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object objF = this.f11895a.f(byteBuffer);
        Object objF2 = this.f11895a.f(byteBuffer);
        if (!(objF instanceof String) || byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Method call corrupted");
        }
        return new C1616i((String) objF, objF2);
    }

    @Override // w2.InterfaceC1618k
    public Object f(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        byte b4 = byteBuffer.get();
        if (b4 != 0) {
            if (b4 == 1) {
            }
            throw new IllegalArgumentException("Envelope corrupted");
        }
        Object objF = this.f11895a.f(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return objF;
        }
        Object objF2 = this.f11895a.f(byteBuffer);
        Object objF3 = this.f11895a.f(byteBuffer);
        Object objF4 = this.f11895a.f(byteBuffer);
        if ((objF2 instanceof String) && ((objF3 == null || (objF3 instanceof String)) && !byteBuffer.hasRemaining())) {
            throw new C1611d((String) objF2, (String) objF3, objF4);
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }
}
