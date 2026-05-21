package j3;

import h3.AbstractC0994a;
import h3.r0;
import h3.x0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends AbstractC0994a implements d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f8619p;

    public e(N2.i iVar, d dVar, boolean z3, boolean z4) {
        super(iVar, z3, z4);
        this.f8619p = dVar;
    }

    @Override // j3.s
    public Object A() {
        return this.f8619p.A();
    }

    @Override // j3.t
    public Object B(Object obj) {
        return this.f8619p.B(obj);
    }

    @Override // j3.t
    public boolean E() {
        return this.f8619p.E();
    }

    public final d V0() {
        return this.f8619p;
    }

    @Override // h3.x0
    public void W(Throwable th) {
        CancellationException cancellationExceptionK0 = x0.K0(this, th, null, 1, null);
        this.f8619p.e(cancellationExceptionK0);
        U(cancellationExceptionK0);
    }

    @Override // h3.x0, h3.InterfaceC1027q0
    public final void e(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new r0(Z(), null, this);
        }
        W(cancellationException);
    }

    @Override // j3.s
    public f iterator() {
        return this.f8619p.iterator();
    }

    @Override // j3.t
    public Object m(Object obj, N2.e eVar) {
        return this.f8619p.m(obj, eVar);
    }

    @Override // j3.t
    public boolean n(Throwable th) {
        return this.f8619p.n(th);
    }

    @Override // j3.t
    public void s(W2.l lVar) {
        this.f8619p.s(lVar);
    }

    @Override // j3.s
    public Object y(N2.e eVar) {
        return this.f8619p.y(eVar);
    }
}
