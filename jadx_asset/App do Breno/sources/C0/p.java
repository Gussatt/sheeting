package C0;

import C0.d;
import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    public static abstract class a {
        public abstract p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(z0.e eVar);
    }

    public static a a() {
        return new d.b().d(z0.e.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract z0.e d();

    public boolean e() {
        return c() != null;
    }

    public p f(z0.e eVar) {
        return a().b(b()).d(eVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
