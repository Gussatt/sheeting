package w2;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: w2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1609b {

    /* JADX INFO: renamed from: w2.b$a */
    public interface a {
        void a(ByteBuffer byteBuffer, InterfaceC0184b interfaceC0184b);
    }

    /* JADX INFO: renamed from: w2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0184b {
        void a(ByteBuffer byteBuffer);
    }

    /* JADX INFO: renamed from: w2.b$c */
    public interface c {
    }

    /* JADX INFO: renamed from: w2.b$d */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f11865a = true;

        public boolean a() {
            return this.f11865a;
        }
    }

    c a(d dVar);

    default c b() {
        return a(new d());
    }

    void c(String str, ByteBuffer byteBuffer, InterfaceC0184b interfaceC0184b);

    void d(String str, a aVar, c cVar);

    void e(String str, ByteBuffer byteBuffer);

    void h(String str, a aVar);
}
