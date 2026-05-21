package B2;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import w2.C1621n;

/* JADX INFO: loaded from: classes.dex */
public class Y extends C1621n {
    @Override // w2.C1621n
    public Object g(byte b4, ByteBuffer byteBuffer) {
        X2.l.e(byteBuffer, "buffer");
        if (b4 != -127) {
            return super.g(b4, byteBuffer);
        }
        Object objF = f(byteBuffer);
        List list = objF instanceof List ? (List) objF : null;
        if (list != null) {
            return C0193a.f290c.a(list);
        }
        return null;
    }

    @Override // w2.C1621n
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        X2.l.e(byteArrayOutputStream, "stream");
        if (!(obj instanceof C0193a)) {
            super.p(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(129);
            p(byteArrayOutputStream, ((C0193a) obj).a());
        }
    }
}
