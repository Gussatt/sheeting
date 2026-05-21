package J0;

import K0.InterfaceC0456d;
import L0.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f2342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0456d f2343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f2344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L0.b f2345d;

    public v(Executor executor, InterfaceC0456d interfaceC0456d, x xVar, L0.b bVar) {
        this.f2342a = executor;
        this.f2343b = interfaceC0456d;
        this.f2344c = xVar;
        this.f2345d = bVar;
    }

    public static /* synthetic */ Object a(v vVar) {
        Iterator it = vVar.f2343b.v().iterator();
        while (it.hasNext()) {
            vVar.f2344c.a((C0.p) it.next(), 1);
        }
        return null;
    }

    public void c() {
        this.f2342a.execute(new Runnable() { // from class: J0.t
            @Override // java.lang.Runnable
            public final void run() {
                v vVar = this.f2340m;
                vVar.f2345d.d(new b.a() { // from class: J0.u
                    @Override // L0.b.a
                    public final Object a() {
                        return v.a(vVar);
                    }
                });
            }
        });
    }
}
