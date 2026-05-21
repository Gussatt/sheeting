package U0;

import S0.C0504b;
import S0.C0512j;
import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import f1.HandlerC0949h;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y extends AbstractC0523g implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile boolean f3538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f3539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f3540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0512j f3541f;

    public Y(InterfaceC0524h interfaceC0524h, C0512j c0512j) {
        super(interfaceC0524h);
        this.f3539d = new AtomicReference(null);
        this.f3540e = new HandlerC0949h(Looper.getMainLooper());
        this.f3541f = c0512j;
    }

    public static final int p(U u4) {
        if (u4 == null) {
            return -1;
        }
        return u4.a();
    }

    @Override // U0.AbstractC0523g
    public final void e(int i4, int i5, Intent intent) {
        U u4 = (U) this.f3539d.get();
        if (i4 != 1) {
            if (i4 == 2) {
                int iG = this.f3541f.g(b());
                if (iG == 0) {
                    o();
                    return;
                } else {
                    if (u4 == null) {
                        return;
                    }
                    if (u4.b().d() == 18 && iG == 18) {
                        return;
                    }
                }
            }
        } else if (i5 == -1) {
            o();
            return;
        } else if (i5 == 0) {
            if (u4 != null) {
                l(new C0504b(intent != null ? intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13) : 13, null, u4.b().toString()), p(u4));
                return;
            }
            return;
        }
        if (u4 != null) {
            l(u4.b(), u4.a());
        }
    }

    @Override // U0.AbstractC0523g
    public final void f(Bundle bundle) {
        super.f(bundle);
        if (bundle != null) {
            this.f3539d.set(bundle.getBoolean("resolving_error", false) ? new U(new C0504b(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
    }

    @Override // U0.AbstractC0523g
    public final void i(Bundle bundle) {
        super.i(bundle);
        U u4 = (U) this.f3539d.get();
        if (u4 == null) {
            return;
        }
        bundle.putBoolean("resolving_error", true);
        bundle.putInt("failed_client_id", u4.a());
        bundle.putInt("failed_status", u4.b().d());
        bundle.putParcelable("failed_resolution", u4.b().g());
    }

    @Override // U0.AbstractC0523g
    public void j() {
        super.j();
        this.f3538c = true;
    }

    @Override // U0.AbstractC0523g
    public void k() {
        super.k();
        this.f3538c = false;
    }

    public final void l(C0504b c0504b, int i4) {
        this.f3539d.set(null);
        m(c0504b, i4);
    }

    public abstract void m(C0504b c0504b, int i4);

    public abstract void n();

    public final void o() {
        this.f3539d.set(null);
        n();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l(new C0504b(13, null), p((U) this.f3539d.get()));
    }

    public final void s(C0504b c0504b, int i4) {
        AtomicReference atomicReference;
        U u4 = new U(c0504b, i4);
        do {
            atomicReference = this.f3539d;
            if (X.a(atomicReference, null, u4)) {
                this.f3540e.post(new W(this, u4));
                return;
            }
        } while (atomicReference.get() == null);
    }
}
