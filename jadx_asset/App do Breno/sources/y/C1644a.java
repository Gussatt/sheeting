package y;

import android.os.CancellationSignal;

/* JADX INFO: renamed from: y.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1644a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC0189a f11984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f11985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11986d;

    /* JADX INFO: renamed from: y.a$a, reason: collision with other inner class name */
    public interface InterfaceC0189a {
        void a();
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f11983a) {
                    return;
                }
                this.f11983a = true;
                this.f11986d = true;
                InterfaceC0189a interfaceC0189a = this.f11984b;
                Object obj = this.f11985c;
                if (interfaceC0189a != null) {
                    try {
                        interfaceC0189a.a();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f11986d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f11986d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(InterfaceC0189a interfaceC0189a) {
        synchronized (this) {
            try {
                c();
                if (this.f11984b == interfaceC0189a) {
                    return;
                }
                this.f11984b = interfaceC0189a;
                if (this.f11983a && interfaceC0189a != null) {
                    interfaceC0189a.a();
                }
            } finally {
            }
        }
    }

    public final void c() {
        while (this.f11986d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
