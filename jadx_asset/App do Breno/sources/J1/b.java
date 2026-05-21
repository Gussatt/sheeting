package J1;

import C0.u;
import C1.G;
import C1.U;
import F1.F;
import G1.j;
import android.content.Context;
import java.nio.charset.Charset;
import n1.AbstractC1445l;
import z0.C1661b;
import z0.g;
import z0.i;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f2350c = new j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f2351d = d("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f2352e = d("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f2353f = new g() { // from class: J1.a
        @Override // z0.g
        public final Object apply(Object obj) {
            return b.f2350c.M((F) obj).getBytes(Charset.forName("UTF-8"));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f2354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f2355b;

    public b(e eVar, g gVar) {
        this.f2354a = eVar;
        this.f2355b = gVar;
    }

    public static b b(Context context, K1.j jVar, U u4) {
        u.f(context);
        i iVarG = u.c().g(new A0.a(f2351d, f2352e));
        C1661b c1661bB = C1661b.b("json");
        g gVar = f2353f;
        return new b(new e(iVarG.a("FIREBASE_CRASHLYTICS_REPORT", F.class, c1661bB, gVar), jVar.b(), u4), gVar);
    }

    public static String d(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str.length() + str2.length());
        for (int i4 = 0; i4 < str.length(); i4++) {
            sb.append(str.charAt(i4));
            if (str2.length() > i4) {
                sb.append(str2.charAt(i4));
            }
        }
        return sb.toString();
    }

    public AbstractC1445l c(G g4, boolean z3) {
        return this.f2354a.i(g4, z3).a();
    }
}
