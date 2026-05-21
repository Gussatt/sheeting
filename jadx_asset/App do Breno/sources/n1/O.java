package n1;

import V0.AbstractC0549h;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class O extends AbstractC1445l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10649a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K f10650b = new K();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f10652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f10653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Exception f10654f;

    @Override // n1.AbstractC1445l
    public final AbstractC1445l a(Executor executor, InterfaceC1438e interfaceC1438e) {
        this.f10650b.a(new C1433A(executor, interfaceC1438e));
        x();
        return this;
    }

    @Override // n1.AbstractC1445l
    public final AbstractC1445l b(Executor executor, InterfaceC1439f interfaceC1439f) {
        this.f10650b.a(new C(executor, interfaceC1439f));
        x();
        return this;
    }

    @Override // n1.AbstractC1445l
    public final AbstractC1445l c(InterfaceC1439f interfaceC1439f) {
        this.f10650b.a(new C(AbstractC1447n.f10659a, interfaceC1439f));
        x();
        return this;
    }

    @Override // n1.AbstractC1445l
    public final AbstractC1445l d(Executor executor, InterfaceC1440g interfaceC1440g) {
        this.f10650b.a(new E(executor, interfaceC1440g));
        x();
        return this;
    }

    @Override // n1.AbstractC1445l
    public final AbstractC1445l e(InterfaceC1440g interfaceC1440g) {
        d(AbstractC1447n.f10659a, interfaceC1440g);
        return this;
    }

    @Override // n1.AbstractC1445l
    public final AbstractC1445l f(Executor executor, InterfaceC1441h interfaceC1441h) {
        this.f10650b.a(new G(executor, interfaceC1441h));
        x();
        return this;
    }

    @Override // n1.AbstractC1445l
    public final AbstractC1445l g(Executor executor, InterfaceC1436c interfaceC1436c) {
        O o4 = new O();
        this.f10650b.a(new w(executor, interfaceC1436c, o4));
        x();
        return o4;
    }

    @Override // n1.AbstractC1445l
    public final AbstractC1445l h(Executor executor, InterfaceC1436c interfaceC1436c) {
        O o4 = new O();
        this.f10650b.a(new y(executor, interfaceC1436c, o4));
        x();
        return o4;
    }

    @Override // n1.AbstractC1445l
    public final Exception i() {
        Exception exc;
        synchronized (this.f10649a) {
            exc = this.f10654f;
        }
        return exc;
    }

    @Override // n1.AbstractC1445l
    public final Object j() {
        Object obj;
        synchronized (this.f10649a) {
            try {
                u();
                v();
                Exception exc = this.f10654f;
                if (exc != null) {
                    throw new C1443j(exc);
                }
                obj = this.f10653e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    @Override // n1.AbstractC1445l
    public final boolean k() {
        return this.f10652d;
    }

    @Override // n1.AbstractC1445l
    public final boolean l() {
        boolean z3;
        synchronized (this.f10649a) {
            z3 = this.f10651c;
        }
        return z3;
    }

    @Override // n1.AbstractC1445l
    public final boolean m() {
        boolean z3;
        synchronized (this.f10649a) {
            try {
                z3 = false;
                if (this.f10651c && !this.f10652d && this.f10654f == null) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // n1.AbstractC1445l
    public final AbstractC1445l n(Executor executor, InterfaceC1444k interfaceC1444k) {
        O o4 = new O();
        this.f10650b.a(new I(executor, interfaceC1444k, o4));
        x();
        return o4;
    }

    @Override // n1.AbstractC1445l
    public final AbstractC1445l o(InterfaceC1444k interfaceC1444k) {
        Executor executor = AbstractC1447n.f10659a;
        O o4 = new O();
        this.f10650b.a(new I(executor, interfaceC1444k, o4));
        x();
        return o4;
    }

    public final void p(Exception exc) {
        AbstractC0549h.k(exc, "Exception must not be null");
        synchronized (this.f10649a) {
            w();
            this.f10651c = true;
            this.f10654f = exc;
        }
        this.f10650b.b(this);
    }

    public final void q(Object obj) {
        synchronized (this.f10649a) {
            w();
            this.f10651c = true;
            this.f10653e = obj;
        }
        this.f10650b.b(this);
    }

    public final boolean r() {
        synchronized (this.f10649a) {
            try {
                if (this.f10651c) {
                    return false;
                }
                this.f10651c = true;
                this.f10652d = true;
                this.f10650b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean s(Exception exc) {
        AbstractC0549h.k(exc, "Exception must not be null");
        synchronized (this.f10649a) {
            try {
                if (this.f10651c) {
                    return false;
                }
                this.f10651c = true;
                this.f10654f = exc;
                this.f10650b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean t(Object obj) {
        synchronized (this.f10649a) {
            try {
                if (this.f10651c) {
                    return false;
                }
                this.f10651c = true;
                this.f10653e = obj;
                this.f10650b.b(this);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        AbstractC0549h.o(this.f10651c, "Task is not yet complete");
    }

    public final void v() {
        if (this.f10652d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void w() {
        if (this.f10651c) {
            throw C1437d.a(this);
        }
    }

    public final void x() {
        synchronized (this.f10649a) {
            try {
                if (this.f10651c) {
                    this.f10650b.b(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
