package F2;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.List;
import w2.C1621n;

/* JADX INFO: renamed from: F2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0287m extends C1621n {
    @Override // w2.C1621n
    public Object g(byte b4, ByteBuffer byteBuffer) {
        X2.l.e(byteBuffer, "buffer");
        if (b4 == -127) {
            Long l4 = (Long) f(byteBuffer);
            if (l4 != null) {
                return K.f1612n.a((int) l4.longValue());
            }
            return null;
        }
        if (b4 == -126) {
            Object objF = f(byteBuffer);
            List list = objF instanceof List ? (List) objF : null;
            if (list != null) {
                return H.f1482c.a(list);
            }
            return null;
        }
        if (b4 != -125) {
            return super.g(b4, byteBuffer);
        }
        Object objF2 = f(byteBuffer);
        List list2 = objF2 instanceof List ? (List) objF2 : null;
        if (list2 != null) {
            return M.f1619c.a(list2);
        }
        return null;
    }

    @Override // w2.C1621n
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        X2.l.e(byteArrayOutputStream, "stream");
        if (obj instanceof K) {
            byteArrayOutputStream.write(129);
            p(byteArrayOutputStream, Integer.valueOf(((K) obj).f()));
        } else if (obj instanceof H) {
            byteArrayOutputStream.write(130);
            p(byteArrayOutputStream, ((H) obj).b());
        } else if (!(obj instanceof M)) {
            super.p(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(131);
            p(byteArrayOutputStream, ((M) obj).a());
        }
    }
}
