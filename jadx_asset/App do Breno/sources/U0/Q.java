package U0;

import S0.C0506d;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import n1.C1446m;

/* JADX INFO: loaded from: classes.dex */
public final class Q extends G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0530n f3528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1446m f3529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0529m f3530d;

    public Q(int i4, AbstractC0530n abstractC0530n, C1446m c1446m, InterfaceC0529m interfaceC0529m) {
        super(i4);
        this.f3529c = c1446m;
        this.f3528b = abstractC0530n;
        this.f3530d = interfaceC0529m;
        if (i4 == 2 && abstractC0530n.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // U0.T
    public final void a(Status status) {
        this.f3529c.d(this.f3530d.a(status));
    }

    @Override // U0.T
    public final void b(Exception exc) {
        this.f3529c.d(exc);
    }

    @Override // U0.T
    public final void c(C0540y c0540y) throws DeadObjectException {
        try {
            this.f3528b.b(c0540y.v(), this.f3529c);
        } catch (DeadObjectException e4) {
            throw e4;
        } catch (RemoteException e5) {
            a(T.e(e5));
        } catch (RuntimeException e6) {
            this.f3529c.d(e6);
        }
    }

    @Override // U0.T
    public final void d(C0532p c0532p, boolean z3) {
        c0532p.b(this.f3529c, z3);
    }

    @Override // U0.G
    public final boolean f(C0540y c0540y) {
        return this.f3528b.c();
    }

    @Override // U0.G
    public final C0506d[] g(C0540y c0540y) {
        return this.f3528b.e();
    }
}
