package U0;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import n1.C1446m;

/* JADX INFO: loaded from: classes.dex */
public abstract class P extends G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1446m f3527b;

    public P(int i4, C1446m c1446m) {
        super(i4);
        this.f3527b = c1446m;
    }

    @Override // U0.T
    public final void a(Status status) {
        this.f3527b.d(new T0.b(status));
    }

    @Override // U0.T
    public final void b(Exception exc) {
        this.f3527b.d(exc);
    }

    @Override // U0.T
    public final void c(C0540y c0540y) throws DeadObjectException {
        try {
            h(c0540y);
        } catch (DeadObjectException e4) {
            a(T.e(e4));
            throw e4;
        } catch (RemoteException e5) {
            a(T.e(e5));
        } catch (RuntimeException e6) {
            this.f3527b.d(e6);
        }
    }

    public abstract void h(C0540y c0540y);
}
