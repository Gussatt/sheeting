package C0;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(z0.h hVar, z0.e eVar) {
        if (!(hVar instanceof s)) {
            G0.a.g("ForcedSender", "Expected instance of `TransportImpl`, got `%s`.", hVar);
        } else {
            u.c().e().l(((s) hVar).d().f(eVar), 1);
        }
    }
}
