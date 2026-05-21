package i3;

import N2.i;
import X2.g;
import X2.l;
import android.os.Handler;
import android.os.Looper;
import h3.S;
import h3.W;
import h3.u0;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class c extends d implements S {
    private volatile c _immediate;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Handler f7742o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f7743p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f7744q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f7745r;

    public c(Handler handler, String str, boolean z3) {
        super(null);
        this.f7742o = handler;
        this.f7743p = str;
        this.f7744q = z3;
        this._immediate = z3 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f7745r = cVar;
    }

    @Override // h3.F
    public void R(i iVar, Runnable runnable) {
        if (this.f7742o.post(runnable)) {
            return;
        }
        W(iVar, runnable);
    }

    @Override // h3.F
    public boolean S(i iVar) {
        return (this.f7744q && l.a(Looper.myLooper(), this.f7742o.getLooper())) ? false : true;
    }

    public final void W(i iVar, Runnable runnable) {
        u0.c(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        W.b().R(iVar, runnable);
    }

    @Override // h3.B0
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public c U() {
        return this.f7745r;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f7742o == this.f7742o;
    }

    public int hashCode() {
        return System.identityHashCode(this.f7742o);
    }

    @Override // h3.F
    public String toString() {
        String strV = V();
        if (strV != null) {
            return strV;
        }
        String string = this.f7743p;
        if (string == null) {
            string = this.f7742o.toString();
        }
        if (!this.f7744q) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ c(Handler handler, String str, int i4, g gVar) {
        this(handler, (i4 & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}
