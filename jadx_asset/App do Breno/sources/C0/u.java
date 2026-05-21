package C0;

import C0.i;
import android.content.Context;
import java.util.Collections;
import java.util.Set;
import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public class u implements t {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile v f498e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M0.a f499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M0.a f500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I0.e f501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J0.r f502d;

    public u(M0.a aVar, M0.a aVar2, I0.e eVar, J0.r rVar, J0.v vVar) {
        this.f499a = aVar;
        this.f500b = aVar2;
        this.f501c = eVar;
        this.f502d = rVar;
        vVar.c();
    }

    public static u c() {
        v vVar = f498e;
        if (vVar != null) {
            return vVar.c();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(C1661b.b("proto"));
    }

    public static void f(Context context) {
        if (f498e == null) {
            synchronized (u.class) {
                try {
                    if (f498e == null) {
                        f498e = e.a().b(context).a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // C0.t
    public void a(o oVar, z0.j jVar) {
        this.f501c.a(oVar.f().f(oVar.c().d()), b(oVar), jVar);
    }

    public final i b(o oVar) {
        i.a aVarG = i.a().i(this.f499a.a()).o(this.f500b.a()).n(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a());
        oVar.c().e();
        oVar.c().b();
        return aVarG.d();
    }

    public J0.r e() {
        return this.f502d;
    }

    public z0.i g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.getName()).c(fVar.b()).a(), this);
    }
}
