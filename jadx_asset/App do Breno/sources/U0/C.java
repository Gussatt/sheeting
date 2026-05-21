package U0;

import S0.C0504b;
import T0.a;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.a;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class C implements a.c, M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.f f3502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0518b f3503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IAccountAccessor f3504c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f3505d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3506e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0521e f3507f;

    public C(C0521e c0521e, a.f fVar, C0518b c0518b) {
        this.f3507f = c0521e;
        this.f3502a = fVar;
        this.f3503b = c0518b;
    }

    @Override // com.google.android.gms.common.internal.a.c
    public final void a(C0504b c0504b) {
        this.f3507f.f3578n.post(new B(this, c0504b));
    }

    @Override // U0.M
    public final void b(IAccountAccessor iAccountAccessor, Set set) {
        if (iAccountAccessor == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            c(new C0504b(4));
        } else {
            this.f3504c = iAccountAccessor;
            this.f3505d = set;
            i();
        }
    }

    @Override // U0.M
    public final void c(C0504b c0504b) {
        C0540y c0540y = (C0540y) this.f3507f.f3574j.get(this.f3503b);
        if (c0540y != null) {
            c0540y.I(c0504b);
        }
    }

    @Override // U0.M
    public final void d(int i4) {
        C0540y c0540y = (C0540y) this.f3507f.f3574j.get(this.f3503b);
        if (c0540y != null) {
            if (c0540y.f3611t) {
                c0540y.I(new C0504b(17));
            } else {
                c0540y.a(i4);
            }
        }
    }

    public final void i() {
        IAccountAccessor iAccountAccessor;
        if (!this.f3506e || (iAccountAccessor = this.f3504c) == null) {
            return;
        }
        this.f3502a.d(iAccountAccessor, this.f3505d);
    }
}
