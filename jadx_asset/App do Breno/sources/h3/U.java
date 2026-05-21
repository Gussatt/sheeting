package h3;

import K2.j;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import m3.C1425j;

/* JADX INFO: loaded from: classes.dex */
public abstract class U extends o3.h {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f7520o;

    public U(int i4) {
        this.f7520o = i4;
    }

    public abstract void a(Object obj, Throwable th);

    public abstract N2.e d();

    public Throwable e(Object obj) {
        C1035z c1035z = obj instanceof C1035z ? (C1035z) obj : null;
        if (c1035z != null) {
            return c1035z.f7590a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            K2.a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        X2.l.b(th);
        H.a(d().b(), new L("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objB;
        Object objB2;
        o3.i iVar = this.f10837n;
        try {
            N2.e eVarD = d();
            X2.l.c(eVarD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            C1425j c1425j = (C1425j) eVarD;
            N2.e eVar = c1425j.f10542q;
            Object obj = c1425j.f10544s;
            N2.i iVarB = eVar.b();
            Object objC = m3.J.c(iVarB, obj);
            N0 n0G = objC != m3.J.f10520a ? E.g(eVar, iVarB, objC) : null;
            try {
                N2.i iVarB2 = eVar.b();
                Object objJ = j();
                Throwable thE = e(objJ);
                InterfaceC1027q0 interfaceC1027q0 = (thE == null && V.b(this.f7520o)) ? (InterfaceC1027q0) iVarB2.d(InterfaceC1027q0.f7558k) : null;
                if (interfaceC1027q0 != null && !interfaceC1027q0.c()) {
                    CancellationException cancellationExceptionC = interfaceC1027q0.C();
                    a(objJ, cancellationExceptionC);
                    j.a aVar = K2.j.f2509n;
                    eVar.p(K2.j.b(K2.k.a(cancellationExceptionC)));
                } else if (thE != null) {
                    j.a aVar2 = K2.j.f2509n;
                    eVar.p(K2.j.b(K2.k.a(thE)));
                } else {
                    j.a aVar3 = K2.j.f2509n;
                    eVar.p(K2.j.b(f(objJ)));
                }
                K2.p pVar = K2.p.f2516a;
                if (n0G == null || n0G.V0()) {
                    m3.J.a(iVarB, objC);
                }
                try {
                    iVar.a();
                    objB2 = K2.j.b(K2.p.f2516a);
                } catch (Throwable th) {
                    j.a aVar4 = K2.j.f2509n;
                    objB2 = K2.j.b(K2.k.a(th));
                }
                g(null, K2.j.d(objB2));
            } catch (Throwable th2) {
                if (n0G == null || n0G.V0()) {
                    m3.J.a(iVarB, objC);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                j.a aVar5 = K2.j.f2509n;
                iVar.a();
                objB = K2.j.b(K2.p.f2516a);
            } catch (Throwable th4) {
                j.a aVar6 = K2.j.f2509n;
                objB = K2.j.b(K2.k.a(th4));
            }
            g(th3, K2.j.d(objB));
        }
    }

    public Object f(Object obj) {
        return obj;
    }
}
