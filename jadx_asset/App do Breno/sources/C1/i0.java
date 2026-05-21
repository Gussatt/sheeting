package C1;

import F1.F;
import android.app.ApplicationExitInfo;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import n1.AbstractC1445l;
import n1.AbstractC1448o;
import n1.InterfaceC1436c;

/* JADX INFO: loaded from: classes.dex */
public class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1.e f615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J1.b f616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final E1.f f617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E1.o f618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final O f619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final D1.f f620g;

    public i0(F f4, I1.e eVar, J1.b bVar, E1.f fVar, E1.o oVar, O o4, D1.f fVar2) {
        this.f614a = f4;
        this.f615b = eVar;
        this.f616c = bVar;
        this.f617d = fVar;
        this.f618e = oVar;
        this.f619f = o4;
        this.f620g = fVar2;
    }

    public static /* synthetic */ void a(i0 i0Var, F.e.d dVar, E1.c cVar, boolean z3) {
        i0Var.getClass();
        z1.g.f().b("disk worker: log non-fatal event to persistence");
        i0Var.f615b.w(dVar, cVar.b(), z3);
    }

    public static F.a h(ApplicationExitInfo applicationExitInfo) {
        String strI = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strI = i(traceInputStream);
            }
        } catch (IOException e4) {
            z1.g.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e4);
        }
        return F.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strI).a();
    }

    public static String i(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i4 = inputStream.read(bArr);
            if (i4 == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i4);
        }
    }

    public static i0 j(Context context, O o4, I1.g gVar, C0244b c0244b, E1.f fVar, E1.o oVar, L1.d dVar, K1.j jVar, U u4, C0256n c0256n, D1.f fVar2) {
        return new i0(new F(context, o4, c0244b, dVar, jVar), new I1.e(gVar, jVar, c0256n), J1.b.b(context, jVar, u4), fVar, oVar, o4, fVar2);
    }

    public static List o(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(F.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: C1.h0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((F.c) obj).b().compareTo(((F.c) obj2).b());
            }
        });
        return Collections.unmodifiableList(arrayList);
    }

    public final F.e.d d(F.e.d dVar, E1.f fVar, E1.o oVar) {
        return e(dVar, fVar, oVar, Collections.EMPTY_MAP);
    }

    public final F.e.d e(F.e.d dVar, E1.f fVar, E1.o oVar, Map map) {
        F.e.d.b bVarH = dVar.h();
        String strC = fVar.c();
        if (strC != null) {
            bVarH.d(F.e.d.AbstractC0030d.a().b(strC).a());
        } else {
            z1.g.f().i("No log data to include with this event.");
        }
        List listO = o(oVar.f(map));
        List listO2 = o(oVar.g());
        if (!listO.isEmpty() || !listO2.isEmpty()) {
            bVarH.b(dVar.b().i().e(listO).g(listO2).a());
        }
        return bVarH.a();
    }

    public final F.e.d f(F.e.d dVar, Map map) {
        return g(e(dVar, this.f617d, this.f618e, map), this.f618e);
    }

    public final F.e.d g(F.e.d dVar, E1.o oVar) {
        List listH = oVar.h();
        if (listH.isEmpty()) {
            return dVar;
        }
        F.e.d.b bVarH = dVar.h();
        bVarH.e(F.e.d.f.a().b(listH).a());
        return bVarH.a();
    }

    public final G k(G g4) {
        if (g4.b().h() != null && g4.b().g() != null) {
            return g4;
        }
        N nD = this.f619f.d(true);
        return G.a(g4.b().t(nD.b()).s(nD.a()), g4.d(), g4.c());
    }

    public void l(String str, List list, F.a aVar) {
        z1.g.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F.d.b bVarC = ((S) it.next()).c();
            if (bVarC != null) {
                arrayList.add(bVarC);
            }
        }
        this.f615b.l(str, F.d.a().b(Collections.unmodifiableList(arrayList)).a(), aVar);
    }

    public void m(long j4, String str) {
        this.f615b.k(str, j4);
    }

    public final ApplicationExitInfo n(String str, List list) {
        long jQ = this.f615b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = V.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    public boolean p() {
        return this.f615b.r();
    }

    public SortedSet q() {
        return this.f615b.p();
    }

    public void r(String str, long j4) {
        this.f615b.x(this.f614a.e(str, j4));
    }

    public final boolean s(AbstractC1445l abstractC1445l) {
        if (!abstractC1445l.m()) {
            z1.g.f().l("Crashlytics report could not be enqueued to DataTransport", abstractC1445l.i());
            return false;
        }
        G g4 = (G) abstractC1445l.j();
        z1.g.f().b("Crashlytics report successfully enqueued to DataTransport: " + g4.d());
        File fileC = g4.c();
        if (fileC.delete()) {
            z1.g.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        z1.g.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    public final void t(Throwable th, Thread thread, String str, final E1.c cVar, boolean z3) {
        final boolean zEquals = str.equals("crash");
        final F.e.d dVarF = f(this.f614a.d(th, thread, str, cVar.c(), 4, 8, z3), cVar.a());
        if (z3) {
            this.f615b.w(dVarF, cVar.b(), zEquals);
        } else {
            this.f620g.f878b.d(new Runnable() { // from class: C1.f0
                @Override // java.lang.Runnable
                public final void run() {
                    i0.a(this.f600m, dVarF, cVar, zEquals);
                }
            });
        }
    }

    public void u(Throwable th, Thread thread, String str, long j4) {
        z1.g.f().i("Persisting fatal event for session " + str);
        t(th, thread, "crash", new E1.c(str, j4), true);
    }

    public void v(Throwable th, Thread thread, E1.c cVar) {
        z1.g.f().i("Persisting non-fatal event for session " + cVar.b());
        t(th, thread, "error", cVar, false);
    }

    public void w(String str, List list, E1.f fVar, E1.o oVar) {
        ApplicationExitInfo applicationExitInfoN = n(str, list);
        if (applicationExitInfoN == null) {
            z1.g.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        F.e.d dVarC = this.f614a.c(h(applicationExitInfoN));
        z1.g.f().b("Persisting anr for session " + str);
        this.f615b.w(g(d(dVarC, fVar, oVar), oVar), str, true);
    }

    public void x() {
        this.f615b.i();
    }

    public AbstractC1445l y(Executor executor) {
        return z(executor, null);
    }

    public AbstractC1445l z(Executor executor, String str) {
        List<G> listU = this.f615b.u();
        ArrayList arrayList = new ArrayList();
        for (G g4 : listU) {
            if (str == null || str.equals(g4.d())) {
                arrayList.add(this.f616c.c(k(g4), str != null).g(executor, new InterfaceC1436c() { // from class: C1.g0
                    @Override // n1.InterfaceC1436c
                    public final Object a(AbstractC1445l abstractC1445l) {
                        return Boolean.valueOf(this.f607a.s(abstractC1445l));
                    }
                }));
            }
        }
        return AbstractC1448o.f(arrayList);
    }
}
