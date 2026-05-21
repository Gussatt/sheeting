package m2;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f10379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f10380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f10381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f10383e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f10384f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f10385g;

    public enum a {
        kKeyboard(0),
        kDirectionalPad(1),
        kGamepad(2),
        kJoystick(3),
        kHdmi(4);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final long f10392m;

        a(long j4) {
            this.f10392m = j4;
        }

        public long f() {
            return this.f10392m;
        }
    }

    public enum b {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f10397m;

        b(long j4) {
            this.f10397m = j4;
        }

        public long f() {
            return this.f10397m;
        }
    }

    public ByteBuffer a() {
        try {
            String str = this.f10385g;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(length + 56);
            byteBufferAllocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocateDirect.putLong(length);
            byteBufferAllocateDirect.putLong(this.f10379a);
            byteBufferAllocateDirect.putLong(this.f10380b.f());
            byteBufferAllocateDirect.putLong(this.f10381c);
            byteBufferAllocateDirect.putLong(this.f10382d);
            byteBufferAllocateDirect.putLong(this.f10383e ? 1L : 0L);
            byteBufferAllocateDirect.putLong(this.f10384f.f());
            if (bytes != null) {
                byteBufferAllocateDirect.put(bytes);
            }
            return byteBufferAllocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
