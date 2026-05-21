package H2;

import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import w2.C1621n;

/* JADX INFO: renamed from: H2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0295b extends C1621n {
    @Override // w2.C1621n
    public Object g(byte b4, ByteBuffer byteBuffer) {
        X2.l.e(byteBuffer, "buffer");
        if (b4 == -127) {
            Long l4 = (Long) f(byteBuffer);
            if (l4 == null) {
                return null;
            }
            return EnumC0310d0.f2019n.a((int) l4.longValue());
        }
        if (b4 == -126) {
            Long l5 = (Long) f(byteBuffer);
            if (l5 == null) {
                return null;
            }
            return U.f1880n.a((int) l5.longValue());
        }
        if (b4 == -125) {
            Long l6 = (Long) f(byteBuffer);
            if (l6 == null) {
                return null;
            }
            return EnumC0389p0.f2104n.a((int) l6.longValue());
        }
        if (b4 != -124) {
            return super.g(b4, byteBuffer);
        }
        Long l7 = (Long) f(byteBuffer);
        if (l7 == null) {
            return null;
        }
        return W3.f1914n.a((int) l7.longValue());
    }

    @Override // w2.C1621n
    public void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        X2.l.e(byteArrayOutputStream, "stream");
        if (obj instanceof EnumC0310d0) {
            byteArrayOutputStream.write(129);
            p(byteArrayOutputStream, Integer.valueOf(((EnumC0310d0) obj).f()));
            return;
        }
        if (obj instanceof U) {
            byteArrayOutputStream.write(130);
            p(byteArrayOutputStream, Integer.valueOf(((U) obj).f()));
        } else if (obj instanceof EnumC0389p0) {
            byteArrayOutputStream.write(131);
            p(byteArrayOutputStream, Integer.valueOf(((EnumC0389p0) obj).f()));
        } else if (!(obj instanceof W3)) {
            super.p(byteArrayOutputStream, obj);
        } else {
            byteArrayOutputStream.write(132);
            p(byteArrayOutputStream, Integer.valueOf(((W3) obj).f()));
        }
    }
}
