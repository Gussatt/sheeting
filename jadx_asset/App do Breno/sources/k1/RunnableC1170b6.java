package k1;

import V0.AbstractC0549h;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: k1.b6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1170b6 implements Runnable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f9369m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String f9370n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ String f9371o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ x7 f9372p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C1263m6 f9373q;

    public RunnableC1170b6(C1263m6 c1263m6, AtomicReference atomicReference, String str, String str2, String str3, x7 x7Var) {
        this.f9369m = atomicReference;
        this.f9370n = str2;
        this.f9371o = str3;
        this.f9372p = x7Var;
        this.f9373q = c1263m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        C1263m6 c1263m6;
        InterfaceC1306s2 interfaceC1306s2;
        AtomicReference atomicReference2 = this.f9369m;
        synchronized (atomicReference2) {
            try {
                try {
                    c1263m6 = this.f9373q;
                    interfaceC1306s2 = c1263m6.f9585d;
                } catch (RemoteException e4) {
                    this.f9373q.f9366a.c().r().d("(legacy) Failed to get conditional properties; remote exception", null, this.f9370n, e4);
                    this.f9369m.set(Collections.EMPTY_LIST);
                    atomicReference = this.f9369m;
                }
                if (interfaceC1306s2 == null) {
                    c1263m6.f9366a.c().r().d("(legacy) Failed to get conditional properties; not connected to service", null, this.f9370n, this.f9371o);
                    atomicReference2.set(Collections.EMPTY_LIST);
                    atomicReference2.notify();
                    return;
                }
                if (TextUtils.isEmpty(null)) {
                    x7 x7Var = this.f9372p;
                    AbstractC0549h.j(x7Var);
                    atomicReference2.set(interfaceC1306s2.h1(this.f9370n, this.f9371o, x7Var));
                } else {
                    atomicReference2.set(interfaceC1306s2.H0(null, this.f9370n, this.f9371o));
                }
                c1263m6.T();
                atomicReference = this.f9369m;
                atomicReference.notify();
            } catch (Throwable th) {
                this.f9369m.notify();
                throw th;
            }
        }
    }
}
