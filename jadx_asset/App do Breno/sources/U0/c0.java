package U0;

import R.AbstractActivityC0498p;
import R.AbstractComponentCallbacksC0497o;
import android.app.Activity;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c0 extends AbstractComponentCallbacksC0497o implements InterfaceC0524h {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final WeakHashMap f3559e0 = new WeakHashMap();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final b0 f3560d0 = new b0();

    public static c0 m1(AbstractActivityC0498p abstractActivityC0498p) {
        c0 c0Var;
        WeakReference weakReference = (WeakReference) f3559e0.get(abstractActivityC0498p);
        if (weakReference == null || (c0Var = (c0) weakReference.get()) == null) {
            throw null;
        }
        return c0Var;
    }

    @Override // U0.InterfaceC0524h
    public final void a(String str, AbstractC0523g abstractC0523g) {
        this.f3560d0.d(str, abstractC0523g);
    }

    @Override // U0.InterfaceC0524h
    public final AbstractC0523g d(String str, Class cls) {
        return this.f3560d0.c(str, cls);
    }

    @Override // U0.InterfaceC0524h
    public final Activity e() {
        j();
        return null;
    }

    @Override // R.AbstractComponentCallbacksC0497o
    public final void i0(Bundle bundle) {
        super.i0(bundle);
        this.f3560d0.g(bundle);
    }

    @Override // R.AbstractComponentCallbacksC0497o
    public final void t0() {
        super.t0();
        this.f3560d0.i();
    }

    @Override // R.AbstractComponentCallbacksC0497o
    public final void u0(Bundle bundle) {
        super.u0(bundle);
        this.f3560d0.j(bundle);
    }

    @Override // R.AbstractComponentCallbacksC0497o
    public final void v0() {
        super.v0();
        this.f3560d0.k();
    }

    @Override // R.AbstractComponentCallbacksC0497o
    public final void w0() {
        super.w0();
        this.f3560d0.l();
    }
}
