package n0;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10601a = new a(null);

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public static /* synthetic */ h b(a aVar, Object obj, String str, j jVar, g gVar, int i4, Object obj2) {
            if ((i4 & 2) != 0) {
                jVar = c.f10584a.a();
            }
            if ((i4 & 4) != 0) {
                gVar = C1432a.f10579a;
            }
            return aVar.a(obj, str, jVar, gVar);
        }

        public final h a(Object obj, String str, j jVar, g gVar) {
            X2.l.e(obj, "<this>");
            X2.l.e(str, "tag");
            X2.l.e(jVar, "verificationMode");
            X2.l.e(gVar, "logger");
            return new i(obj, str, jVar, gVar);
        }

        public a() {
        }
    }

    public abstract Object a();

    public final String b(Object obj, String str) {
        X2.l.e(obj, "value");
        X2.l.e(str, "message");
        return str + " value: " + obj;
    }

    public abstract h c(String str, W2.l lVar);
}
