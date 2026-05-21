package y1;

import C1.AbstractC0252j;
import C1.C0244b;
import C1.C0249g;
import C1.C0256n;
import C1.D;
import C1.J;
import C1.O;
import android.content.Context;
import android.content.pm.PackageManager;
import d2.C0919a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import n1.AbstractC1445l;
import n1.InterfaceC1440g;
import r1.C1509f;
import z1.l;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D f12027a;

    public h(D d4) {
        this.f12027a = d4;
    }

    public static h e() {
        h hVar = (h) C1509f.o().k(h.class);
        if (hVar != null) {
            return hVar;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static h f(C1509f c1509f, V1.h hVar, U1.a aVar, U1.a aVar2, U1.a aVar3, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        Context contextM = c1509f.m();
        String packageName = contextM.getPackageName();
        z1.g.f().g("Initializing Firebase Crashlytics " + D.s() + " for " + packageName);
        D1.f fVar = new D1.f(executorService, executorService2);
        I1.g gVar = new I1.g(contextM);
        J j4 = new J(c1509f);
        O o4 = new O(contextM, packageName, hVar, j4);
        z1.d dVar = new z1.d(aVar);
        d dVar2 = new d(aVar2);
        C0256n c0256n = new C0256n(j4, gVar);
        C0919a.e(c0256n);
        D d4 = new D(c1509f, o4, dVar, j4, dVar2.e(), dVar2.d(), gVar, c0256n, new l(aVar3), fVar);
        String strC = c1509f.r().c();
        String strM = AbstractC0252j.m(contextM);
        List<C0249g> listJ = AbstractC0252j.j(contextM);
        z1.g.f().b("Mapping file ID is: " + strM);
        for (C0249g c0249g : listJ) {
            z1.g.f().b(String.format("Build id for %s on %s: %s", c0249g.c(), c0249g.a(), c0249g.b()));
        }
        try {
            C0244b c0244bA = C0244b.a(contextM, o4, strC, strM, listJ, new z1.f(contextM));
            z1.g.f().i("Installer package name is: " + c0244bA.f587d);
            K1.g gVarL = K1.g.l(contextM, strC, o4, new H1.b(), c0244bA.f589f, c0244bA.f590g, gVar, j4);
            gVarL.o(fVar).d(executorService3, new InterfaceC1440g() { // from class: y1.g
                @Override // n1.InterfaceC1440g
                public final void c(Exception exc) {
                    z1.g.f().e("Error fetching settings.", exc);
                }
            });
            if (d4.z(c0244bA, gVarL)) {
                d4.q(gVarL);
            }
            return new h(d4);
        } catch (PackageManager.NameNotFoundException e4) {
            z1.g.f().e("Error retrieving app package info.", e4);
            return null;
        }
    }

    public AbstractC1445l b() {
        return this.f12027a.l();
    }

    public void c() {
        this.f12027a.m();
    }

    public boolean d() {
        return this.f12027a.n();
    }

    public void g(String str) {
        this.f12027a.u(str);
    }

    public void h(Throwable th) {
        if (th == null) {
            z1.g.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.f12027a.v(th, Collections.EMPTY_MAP);
        }
    }

    public void i() {
        this.f12027a.A();
    }

    public void j(Boolean bool) {
        this.f12027a.B(bool);
    }

    public void k(String str, String str2) {
        this.f12027a.C(str, str2);
    }

    public void l(String str) {
        this.f12027a.E(str);
    }
}
