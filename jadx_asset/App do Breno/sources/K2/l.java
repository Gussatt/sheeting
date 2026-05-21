package K2;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class l implements f, Serializable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public W2.a f2512m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile Object f2513n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f2514o;

    public l(W2.a aVar, Object obj) {
        X2.l.e(aVar, "initializer");
        this.f2512m = aVar;
        this.f2513n = n.f2515a;
        this.f2514o = obj == null ? this : obj;
    }

    @Override // K2.f
    public boolean a() {
        return this.f2513n != n.f2515a;
    }

    @Override // K2.f
    public Object getValue() {
        Object objE;
        Object obj = this.f2513n;
        n nVar = n.f2515a;
        if (obj != nVar) {
            return obj;
        }
        synchronized (this.f2514o) {
            objE = this.f2513n;
            if (objE == nVar) {
                W2.a aVar = this.f2512m;
                X2.l.b(aVar);
                objE = aVar.e();
                this.f2513n = objE;
                this.f2512m = null;
            }
        }
        return objE;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ l(W2.a aVar, Object obj, int i4, X2.g gVar) {
        this(aVar, (i4 & 2) != 0 ? null : obj);
    }
}
