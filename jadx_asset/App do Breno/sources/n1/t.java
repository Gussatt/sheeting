package n1;

import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class t implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10663a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f10665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10667e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10668f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Exception f10669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10670h;

    public t(int i4, O o4) {
        this.f10664b = i4;
        this.f10665c = o4;
    }

    private final void d() {
        if (this.f10666d + this.f10667e + this.f10668f == this.f10664b) {
            if (this.f10669g == null) {
                if (this.f10670h) {
                    this.f10665c.r();
                    return;
                } else {
                    this.f10665c.q(null);
                    return;
                }
            }
            this.f10665c.p(new ExecutionException(this.f10667e + " out of " + this.f10664b + " underlying tasks failed", this.f10669g));
        }
    }

    @Override // n1.InterfaceC1438e
    public final void a() {
        synchronized (this.f10663a) {
            this.f10668f++;
            this.f10670h = true;
            d();
        }
    }

    @Override // n1.InterfaceC1441h
    public final void b(Object obj) {
        synchronized (this.f10663a) {
            this.f10666d++;
            d();
        }
    }

    @Override // n1.InterfaceC1440g
    public final void c(Exception exc) {
        synchronized (this.f10663a) {
            this.f10667e++;
            this.f10669g = exc;
            d();
        }
    }
}
