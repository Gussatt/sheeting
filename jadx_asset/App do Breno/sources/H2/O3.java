package H2;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import w2.InterfaceC1609b;

/* JADX INFO: loaded from: classes.dex */
public class O3 extends P {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Context f1825e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC0324f0 f1826f;

    public O3(InterfaceC1609b interfaceC1609b, Context context, AbstractC0324f0 abstractC0324f0) {
        super(interfaceC1609b);
        this.f1825e = context;
        this.f1826f = abstractC0324f0;
    }

    @Override // H2.P
    public AbstractC0391p2 A() {
        return new C0375m4(this);
    }

    @Override // H2.P
    public AbstractC0402r2 B() {
        return new C0381n4(this);
    }

    @Override // H2.P
    public J2 C() {
        return new C0387o4(this);
    }

    @Override // H2.P
    public N2 D() {
        return new C0393p4(this);
    }

    @Override // H2.P
    public AbstractC0386o3 E() {
        return new J5(this);
    }

    @Override // H2.P
    public J3 F() {
        return new W4(this);
    }

    @Override // H2.P
    public L3 G() {
        return new F5(this);
    }

    public IllegalArgumentException K(Object obj) {
        return new IllegalArgumentException(obj + " doesn't represent a native value.");
    }

    public String L(String str, String str2) {
        return str + " requires " + str2 + ".";
    }

    public Context M() {
        return this.f1825e;
    }

    public AbstractC0324f0 N() {
        return this.f1826f;
    }

    public void O(String str, Throwable th) {
        Log.e(str, th.getClass().getSimpleName() + ", Message: " + th.getMessage() + ", Stacktrace: " + Log.getStackTraceString(th));
    }

    public void P(Runnable runnable) {
        Context context = this.f1825e;
        if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(runnable);
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public boolean Q(int i4) {
        return Build.VERSION.SDK_INT >= i4;
    }

    public void R(Context context) {
        this.f1825e = context;
    }

    @Override // H2.P
    public AbstractC0412t0 e() {
        return new C0383o0(this);
    }

    @Override // H2.P
    public AbstractC0430w0 f() {
        return new S(this);
    }

    @Override // H2.P
    public B0 g() {
        return new T(this);
    }

    @Override // H2.P
    public D0 h() {
        return new V(this);
    }

    @Override // H2.P
    public K0 i() {
        return new X(this);
    }

    @Override // H2.P
    public N0 j() {
        return new Y(this);
    }

    @Override // H2.P
    public Q0 k() {
        return new C0303c0(this);
    }

    @Override // H2.P
    public S0 l() {
        return new C0317e0(this);
    }

    @Override // H2.P
    public X0 m() {
        return new C0331g0(this);
    }

    @Override // H2.P
    public AbstractC0290a1 n() {
        return new C0345i0(this);
    }

    @Override // H2.P
    public AbstractC0325f1 o() {
        return new C0352j0(this);
    }

    @Override // H2.P
    public AbstractC0346i1 p() {
        return new C0377n0(this);
    }

    @Override // H2.P
    public AbstractC0372m1 q() {
        return new C0395q0(this);
    }

    @Override // H2.P
    public AbstractC0425v1 s() {
        return new T3(this);
    }

    @Override // H2.P
    public B1 t() {
        return new R3(this);
    }

    @Override // H2.P
    public F1 u() {
        return new V3(this);
    }

    @Override // H2.P
    public J1 v() {
        return new U3(this);
    }

    @Override // H2.P
    public R1 w() {
        return new X3(this);
    }

    @Override // H2.P
    public AbstractC0354j2 x() {
        return new Y3(this);
    }

    @Override // H2.P
    public AbstractC0367l2 y() {
        return new C0369l4(this);
    }

    @Override // H2.P
    public AbstractC0379n2 z() {
        return new C0363k4(this);
    }
}
