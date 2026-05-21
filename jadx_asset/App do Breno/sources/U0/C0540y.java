package U0;

import S0.C0504b;
import S0.C0506d;
import T0.a;
import T0.f;
import V0.AbstractC0548g;
import V0.AbstractC0549h;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import b1.AbstractC0634b;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zact;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import n1.C1446m;
import p.C1475a;

/* JADX INFO: renamed from: U0.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0540y implements f.a, f.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a.f f3604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0518b f3605n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C0532p f3606o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f3609r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zact f3610s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f3611t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ C0521e f3615x;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Queue f3603l = new LinkedList();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Set f3607p = new HashSet();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f3608q = new HashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List f3612u = new ArrayList();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C0504b f3613v = null;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f3614w = 0;

    public C0540y(C0521e c0521e, T0.e eVar) {
        this.f3615x = c0521e;
        a.f fVarH = eVar.h(c0521e.f3578n.getLooper(), this);
        this.f3604m = fVarH;
        this.f3605n = eVar.e();
        this.f3606o = new C0532p();
        this.f3609r = eVar.g();
        if (fVarH.o()) {
            this.f3610s = eVar.i(c0521e.f3569e, c0521e.f3578n);
        } else {
            this.f3610s = null;
        }
    }

    public static /* bridge */ /* synthetic */ void B(C0540y c0540y, A a4) {
        if (c0540y.f3612u.contains(a4) && !c0540y.f3611t) {
            if (c0540y.f3604m.b()) {
                c0540y.h();
            } else {
                c0540y.E();
            }
        }
    }

    public static /* bridge */ /* synthetic */ void C(C0540y c0540y, A a4) {
        C0506d[] c0506dArrG;
        if (c0540y.f3612u.remove(a4)) {
            c0540y.f3615x.f3578n.removeMessages(15, a4);
            c0540y.f3615x.f3578n.removeMessages(16, a4);
            C0506d c0506d = a4.f3499b;
            ArrayList arrayList = new ArrayList(c0540y.f3603l.size());
            for (T t4 : c0540y.f3603l) {
                if ((t4 instanceof G) && (c0506dArrG = ((G) t4).g(c0540y)) != null && AbstractC0634b.b(c0506dArrG, c0506d)) {
                    arrayList.add(t4);
                }
            }
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                T t5 = (T) arrayList.get(i4);
                c0540y.f3603l.remove(t5);
                t5.b(new T0.h(c0506d));
            }
        }
    }

    public final void D() {
        AbstractC0549h.c(this.f3615x.f3578n);
        this.f3613v = null;
    }

    public final void E() {
        AbstractC0549h.c(this.f3615x.f3578n);
        if (this.f3604m.b() || this.f3604m.h()) {
            return;
        }
        try {
            C0521e c0521e = this.f3615x;
            int iB = c0521e.f3571g.b(c0521e.f3569e, this.f3604m);
            if (iB == 0) {
                C0521e c0521e2 = this.f3615x;
                a.f fVar = this.f3604m;
                C c4 = new C(c0521e2, fVar, this.f3605n);
                if (fVar.o()) {
                    ((zact) AbstractC0549h.j(this.f3610s)).r1(c4);
                }
                try {
                    this.f3604m.m(c4);
                    return;
                } catch (SecurityException e4) {
                    H(new C0504b(10), e4);
                    return;
                }
            }
            C0504b c0504b = new C0504b(iB, null);
            Log.w("GoogleApiManager", "The service for " + this.f3604m.getClass().getName() + " is not available: " + c0504b.toString());
            H(c0504b, null);
        } catch (IllegalStateException e5) {
            H(new C0504b(10), e5);
        }
    }

    public final void F(T t4) {
        AbstractC0549h.c(this.f3615x.f3578n);
        if (this.f3604m.b()) {
            if (n(t4)) {
                k();
                return;
            } else {
                this.f3603l.add(t4);
                return;
            }
        }
        this.f3603l.add(t4);
        C0504b c0504b = this.f3613v;
        if (c0504b == null || !c0504b.h()) {
            E();
        } else {
            H(this.f3613v, null);
        }
    }

    public final void G() {
        this.f3614w++;
    }

    public final void H(C0504b c0504b, Exception exc) {
        AbstractC0549h.c(this.f3615x.f3578n);
        zact zactVar = this.f3610s;
        if (zactVar != null) {
            zactVar.s1();
        }
        D();
        this.f3615x.f3571g.c();
        e(c0504b);
        if ((this.f3604m instanceof X0.f) && c0504b.d() != 24) {
            this.f3615x.f3566b = true;
            C0521e c0521e = this.f3615x;
            c0521e.f3578n.sendMessageDelayed(c0521e.f3578n.obtainMessage(19), 300000L);
        }
        if (c0504b.d() == 4) {
            f(C0521e.f3562q);
            return;
        }
        if (this.f3603l.isEmpty()) {
            this.f3613v = c0504b;
            return;
        }
        if (exc != null) {
            AbstractC0549h.c(this.f3615x.f3578n);
            g(null, exc, false);
            return;
        }
        if (!this.f3615x.f3579o) {
            f(C0521e.f(this.f3605n, c0504b));
            return;
        }
        g(C0521e.f(this.f3605n, c0504b), null, true);
        if (this.f3603l.isEmpty() || o(c0504b) || this.f3615x.e(c0504b, this.f3609r)) {
            return;
        }
        if (c0504b.d() == 18) {
            this.f3611t = true;
        }
        if (!this.f3611t) {
            f(C0521e.f(this.f3605n, c0504b));
            return;
        }
        C0521e c0521e2 = this.f3615x;
        c0521e2.f3578n.sendMessageDelayed(Message.obtain(c0521e2.f3578n, 9, this.f3605n), 5000L);
    }

    public final void I(C0504b c0504b) {
        AbstractC0549h.c(this.f3615x.f3578n);
        a.f fVar = this.f3604m;
        fVar.e("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(c0504b));
        H(c0504b, null);
    }

    public final void J() {
        AbstractC0549h.c(this.f3615x.f3578n);
        if (this.f3611t) {
            E();
        }
    }

    public final void K() {
        AbstractC0549h.c(this.f3615x.f3578n);
        f(C0521e.f3561p);
        this.f3606o.d();
        for (AbstractC0525i abstractC0525i : (AbstractC0525i[]) this.f3608q.keySet().toArray(new AbstractC0525i[0])) {
            F(new S(null, new C1446m()));
        }
        e(new C0504b(4));
        if (this.f3604m.b()) {
            this.f3604m.a(new C0539x(this));
        }
    }

    public final void L() {
        AbstractC0549h.c(this.f3615x.f3578n);
        if (this.f3611t) {
            m();
            C0521e c0521e = this.f3615x;
            f(c0521e.f3570f.g(c0521e.f3569e) == 18 ? new Status(21, "Connection timed out waiting for Google Play services update to complete.") : new Status(22, "API failed to connect while resuming due to an unknown error."));
            this.f3604m.e("Timing out connection while resuming.");
        }
    }

    @Override // U0.InterfaceC0520d
    public final void a(int i4) {
        if (Looper.myLooper() == this.f3615x.f3578n.getLooper()) {
            j(i4);
        } else {
            this.f3615x.f3578n.post(new RunnableC0537v(this, i4));
        }
    }

    public final boolean b() {
        return this.f3604m.o();
    }

    public final boolean c() {
        return p(true);
    }

    public final C0506d d(C0506d[] c0506dArr) {
        if (c0506dArr != null && c0506dArr.length != 0) {
            C0506d[] c0506dArrI = this.f3604m.i();
            if (c0506dArrI == null) {
                c0506dArrI = new C0506d[0];
            }
            C1475a c1475a = new C1475a(c0506dArrI.length);
            for (C0506d c0506d : c0506dArrI) {
                c1475a.put(c0506d.d(), Long.valueOf(c0506d.f()));
            }
            for (C0506d c0506d2 : c0506dArr) {
                Long l4 = (Long) c1475a.get(c0506d2.d());
                if (l4 == null || l4.longValue() < c0506d2.f()) {
                    return c0506d2;
                }
            }
        }
        return null;
    }

    public final void e(C0504b c0504b) {
        Iterator it = this.f3607p.iterator();
        if (!it.hasNext()) {
            this.f3607p.clear();
            return;
        }
        i.d.a(it.next());
        if (AbstractC0548g.a(c0504b, C0504b.f3421q)) {
            this.f3604m.j();
        }
        throw null;
    }

    public final void f(Status status) {
        AbstractC0549h.c(this.f3615x.f3578n);
        g(status, null, false);
    }

    public final void g(Status status, Exception exc, boolean z3) {
        AbstractC0549h.c(this.f3615x.f3578n);
        if ((status == null) == (exc == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f3603l.iterator();
        while (it.hasNext()) {
            T t4 = (T) it.next();
            if (!z3 || t4.f3531a == 2) {
                if (status != null) {
                    t4.a(status);
                } else {
                    t4.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void h() {
        ArrayList arrayList = new ArrayList(this.f3603l);
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            T t4 = (T) arrayList.get(i4);
            if (!this.f3604m.b()) {
                return;
            }
            if (n(t4)) {
                this.f3603l.remove(t4);
            }
        }
    }

    public final void i() {
        D();
        e(C0504b.f3421q);
        m();
        Iterator it = this.f3608q.values().iterator();
        if (it.hasNext()) {
            i.d.a(it.next());
            throw null;
        }
        h();
        k();
    }

    public final void j(int i4) {
        D();
        this.f3611t = true;
        this.f3606o.c(i4, this.f3604m.l());
        C0518b c0518b = this.f3605n;
        C0521e c0521e = this.f3615x;
        c0521e.f3578n.sendMessageDelayed(Message.obtain(c0521e.f3578n, 9, c0518b), 5000L);
        C0518b c0518b2 = this.f3605n;
        C0521e c0521e2 = this.f3615x;
        c0521e2.f3578n.sendMessageDelayed(Message.obtain(c0521e2.f3578n, 11, c0518b2), 120000L);
        this.f3615x.f3571g.c();
        Iterator it = this.f3608q.values().iterator();
        if (it.hasNext()) {
            i.d.a(it.next());
            throw null;
        }
    }

    public final void k() {
        this.f3615x.f3578n.removeMessages(12, this.f3605n);
        C0518b c0518b = this.f3605n;
        C0521e c0521e = this.f3615x;
        c0521e.f3578n.sendMessageDelayed(c0521e.f3578n.obtainMessage(12, c0518b), this.f3615x.f3565a);
    }

    public final void l(T t4) {
        t4.d(this.f3606o, b());
        try {
            t4.c(this);
        } catch (DeadObjectException unused) {
            a(1);
            this.f3604m.e("DeadObjectException thrown while running ApiCallRunner.");
        }
    }

    public final void m() {
        if (this.f3611t) {
            C0521e c0521e = this.f3615x;
            c0521e.f3578n.removeMessages(11, this.f3605n);
            C0521e c0521e2 = this.f3615x;
            c0521e2.f3578n.removeMessages(9, this.f3605n);
            this.f3611t = false;
        }
    }

    public final boolean n(T t4) {
        if (!(t4 instanceof G)) {
            l(t4);
            return true;
        }
        G g4 = (G) t4;
        C0506d c0506dD = d(g4.g(this));
        if (c0506dD == null) {
            l(t4);
            return true;
        }
        Log.w("GoogleApiManager", this.f3604m.getClass().getName() + " could not execute call because it requires feature (" + c0506dD.d() + ", " + c0506dD.f() + ").");
        if (!this.f3615x.f3579o || !g4.f(this)) {
            g4.b(new T0.h(c0506dD));
            return true;
        }
        A a4 = new A(this.f3605n, c0506dD, null);
        int iIndexOf = this.f3612u.indexOf(a4);
        if (iIndexOf >= 0) {
            A a5 = (A) this.f3612u.get(iIndexOf);
            this.f3615x.f3578n.removeMessages(15, a5);
            C0521e c0521e = this.f3615x;
            c0521e.f3578n.sendMessageDelayed(Message.obtain(c0521e.f3578n, 15, a5), 5000L);
            return false;
        }
        this.f3612u.add(a4);
        C0521e c0521e2 = this.f3615x;
        c0521e2.f3578n.sendMessageDelayed(Message.obtain(c0521e2.f3578n, 15, a4), 5000L);
        C0521e c0521e3 = this.f3615x;
        c0521e3.f3578n.sendMessageDelayed(Message.obtain(c0521e3.f3578n, 16, a4), 120000L);
        C0504b c0504b = new C0504b(2, null);
        if (o(c0504b)) {
            return false;
        }
        this.f3615x.e(c0504b, this.f3609r);
        return false;
    }

    public final boolean o(C0504b c0504b) {
        synchronized (C0521e.f3563r) {
            try {
                C0521e c0521e = this.f3615x;
                if (c0521e.f3575k == null || !c0521e.f3576l.contains(this.f3605n)) {
                    return false;
                }
                this.f3615x.f3575k.s(c0504b, this.f3609r);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean p(boolean z3) {
        AbstractC0549h.c(this.f3615x.f3578n);
        if (!this.f3604m.b() || !this.f3608q.isEmpty()) {
            return false;
        }
        if (!this.f3606o.e()) {
            this.f3604m.e("Timing out service connection.");
            return true;
        }
        if (!z3) {
            return false;
        }
        k();
        return false;
    }

    public final int q() {
        return this.f3609r;
    }

    @Override // U0.InterfaceC0527k
    public final void r(C0504b c0504b) {
        H(c0504b, null);
    }

    public final int s() {
        return this.f3614w;
    }

    @Override // U0.InterfaceC0520d
    public final void u(Bundle bundle) {
        if (Looper.myLooper() == this.f3615x.f3578n.getLooper()) {
            i();
        } else {
            this.f3615x.f3578n.post(new RunnableC0536u(this));
        }
    }

    public final a.f v() {
        return this.f3604m;
    }

    public final Map x() {
        return this.f3608q;
    }
}
