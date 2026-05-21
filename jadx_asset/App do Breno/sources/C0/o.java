package C0;

import C0.c;
import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(C1661b c1661b);

        public abstract a c(z0.c cVar);

        public abstract a d(z0.g gVar);

        public abstract a e(p pVar);

        public abstract a f(String str);
    }

    public static a a() {
        return new c.b();
    }

    public abstract C1661b b();

    public abstract z0.c c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    public abstract z0.g e();

    public abstract p f();

    public abstract String g();
}
