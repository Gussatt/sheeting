package k1;

import V0.AbstractC0549h;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k1.d6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1188d6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9401m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9402n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9403o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x7 f9404p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f9405q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9406r;

    public RunnableC1188d6(C1263m6 c1263m6, AtomicReference atomicReference, String str, String str2, String str3, x7 x7Var, boolean z3) {
        this.f9401m = atomicReference;
        this.f9402n = str2;
        this.f9403o = str3;
        this.f9404p = x7Var;
        this.f9405q = z3;
        this.f9406r = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1263m6 c1263m6;
        InterfaceC1306s2 interfaceC1306s2;
        AtomicReference atomicReference2 = this.f9401m;
        synchronized (atomicReference2) {
            try {
                try {
                    c1263m6 = this.f9406r;
                    interfaceC1306s2 = c1263m6.f9585d;
                } catch (RemoteException e4) {
                    this.f9406r.f9366a.c().r().d("(legacy) Failed to get user properties; remote exception", null, this.f9402n, e4);
                    this.f9401m.set(Collections.EMPTY_LIST);
                    atomicReference = this.f9401m;
                }
                if (interfaceC1306s2 == null) {
                    c1263m6.f9366a.c().r().d("(legacy) Failed to get user properties; not connected to service", null, this.f9402n, this.f9403o);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    x7 x7Var = this.f9404p;
                    AbstractC0549h.j(x7Var);
                    atomicReference2.set(interfaceC1306s2.F(this.f9402n, this.f9403o, this.f9405q, x7Var));
                } else {
                    atomicReference2.set(interfaceC1306s2.n1(null, this.f9402n, this.f9403o, this.f9405q));
                }
                c1263m6.T();
                atomicReference = this.f9401m;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f9401m.notify();
                throw th;
            }
        }
    }
}
