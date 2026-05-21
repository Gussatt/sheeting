package w2;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: w2.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1623p implements InterfaceC1615h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f11896a = Charset.forName("UTF8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1623p f11897b = new C1623p();

    @Override // w2.InterfaceC1615h
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String b(ByteBuffer byteBuffer) {
        byte[] bArrArray;
        int iArrayOffset;
        if (byteBuffer == null) {
            return null;
        }
        int iRemaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArrArray = byteBuffer.array();
            iArrayOffset = byteBuffer.arrayOffset();
        } else {
            bArrArray = new byte[iRemaining];
            byteBuffer.get(bArrArray);
            iArrayOffset = 0;
        }
        return new String(bArrArray, iArrayOffset, iRemaining, f11896a);
    }

    @Override // w2.InterfaceC1615h
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public ByteBuffer a(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(f11896a);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bytes.length);
        byteBufferAllocateDirect.put(bytes);
        return byteBufferAllocateDirect;
    }
}
