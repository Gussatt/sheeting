package I0;

import C0.p;
import C0.u;
import D0.m;
import J0.x;
import K0.InterfaceC0456d;
import L0.b;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import z0.j;

/* JADX INFO: loaded from: classes.dex */
public class c implements e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f2242f = Logger.getLogger(u.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f2243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f2244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D0.e f2245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0456d f2246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final L0.b f2247e;

    public c(Executor executor, D0.e eVar, x xVar, InterfaceC0456d interfaceC0456d, L0.b bVar) {
        this.f2244b = executor;
        this.f2245c = eVar;
        this.f2243a = xVar;
        this.f2246d = interfaceC0456d;
        this.f2247e = bVar;
    }

    public static /* synthetic */ Object b(c cVar, p pVar, C0.i iVar) {
        cVar.f2246d.n(pVar, iVar);
        cVar.f2243a.a(pVar, 1);
        return null;
    }

    public static /* synthetic */ void c(final c cVar, final p pVar, j jVar, C0.i iVar) {
        cVar.getClass();
        try {
            m mVarA = cVar.f2245c.a(pVar.b());
            if (mVarA == null) {
                String str = String.format("Transport backend '%s' is not registered", pVar.b());
                f2242f.warning(str);
                jVar.a(new IllegalArgumentException(str));
            } else {
                final C0.i iVarB = mVarA.b(iVar);
                cVar.f2247e.d(new b.a() { // from class: I0.b
                    @Override // L0.b.a
                    public final Object a() {
                        return c.b(this.f2239a, pVar, iVarB);
                    }
                });
                jVar.a(null);
            }
        } catch (Exception e4) {
            f2242f.warning("Error scheduling event " + e4.getMessage());
            jVar.a(e4);
        }
    }

    @Override // I0.e
    public void a(final p pVar, final C0.i iVar, final j jVar) {
        this.f2244b.execute(new Runnable() { // from class: I0.a
            @Override // java.lang.Runnable
            public final void run() {
                c.c(this.f2235m, pVar, jVar, iVar);
            }
        });
    }
}
