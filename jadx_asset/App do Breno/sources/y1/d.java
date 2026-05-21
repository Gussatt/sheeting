package y1;

import U1.a;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import t1.InterfaceC1540a;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U1.a f12020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile A1.a f12021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile B1.b f12022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12023d;

    public d(U1.a aVar) {
        this(aVar, new B1.c(), new A1.f());
    }

    public static /* synthetic */ void a(d dVar, U1.b bVar) {
        dVar.getClass();
        z1.g.f().b("AnalyticsConnector now available.");
        InterfaceC1540a interfaceC1540a = (InterfaceC1540a) bVar.get();
        A1.e eVar = new A1.e(interfaceC1540a);
        e eVar2 = new e();
        if (g(interfaceC1540a, eVar2) == null) {
            z1.g.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
            return;
        }
        z1.g.f().b("Registered Firebase Analytics listener.");
        A1.d dVar2 = new A1.d();
        A1.c cVar = new A1.c(eVar, 500, TimeUnit.MILLISECONDS);
        synchronized (dVar) {
            try {
                Iterator it = dVar.f12023d.iterator();
                while (it.hasNext()) {
                    dVar2.a((B1.a) it.next());
                }
                eVar2.d(dVar2);
                eVar2.e(cVar);
                dVar.f12022c = dVar2;
                dVar.f12021b = cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void c(d dVar, B1.a aVar) {
        synchronized (dVar) {
            try {
                if (dVar.f12022c instanceof B1.c) {
                    dVar.f12023d.add(aVar);
                }
                dVar.f12022c.a(aVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static InterfaceC1540a.InterfaceC0175a g(InterfaceC1540a interfaceC1540a, e eVar) {
        InterfaceC1540a.InterfaceC0175a interfaceC0175aA = interfaceC1540a.a("clx", eVar);
        if (interfaceC0175aA != null) {
            return interfaceC0175aA;
        }
        z1.g.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
        InterfaceC1540a.InterfaceC0175a interfaceC0175aA2 = interfaceC1540a.a("crash", eVar);
        if (interfaceC0175aA2 != null) {
            z1.g.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
        }
        return interfaceC0175aA2;
    }

    public A1.a d() {
        return new A1.a() { // from class: y1.b
            @Override // A1.a
            public final void a(String str, Bundle bundle) {
                this.f12018a.f12021b.a(str, bundle);
            }
        };
    }

    public B1.b e() {
        return new B1.b() { // from class: y1.a
            @Override // B1.b
            public final void a(B1.a aVar) {
                d.c(this.f12017a, aVar);
            }
        };
    }

    public final void f() {
        this.f12020a.a(new a.InterfaceC0076a() { // from class: y1.c
            @Override // U1.a.InterfaceC0076a
            public final void a(U1.b bVar) {
                d.a(this.f12019a, bVar);
            }
        });
    }

    public d(U1.a aVar, B1.b bVar, A1.a aVar2) {
        this.f12020a = aVar;
        this.f12022c = bVar;
        this.f12023d = new ArrayList();
        this.f12021b = aVar2;
        f();
    }
}
