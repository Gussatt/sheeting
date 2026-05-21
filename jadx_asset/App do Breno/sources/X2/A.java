package X2;

/* JADX INFO: loaded from: classes.dex */
public class A {
    public d3.b b(Class cls) {
        return new e(cls);
    }

    public d3.d c(Class cls, String str) {
        return new n(cls, str);
    }

    public String g(h hVar) {
        String string = hVar.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith("kotlin.jvm.functions.") ? string.substring(21) : string;
    }

    public String h(m mVar) {
        return g(mVar);
    }

    public d3.e a(i iVar) {
        return iVar;
    }

    public d3.f d(o oVar) {
        return oVar;
    }

    public d3.g e(q qVar) {
        return qVar;
    }

    public d3.h f(s sVar) {
        return sVar;
    }
}
