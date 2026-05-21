package com.google.android.gms.common.internal;

import S0.C0504b;
import S0.C0506d;
import S0.C0513k;
import V0.AbstractC0545d;
import V0.AbstractC0549h;
import V0.C0544c;
import V0.C0550i;
import V0.M;
import V0.N;
import V0.S;
import V0.Z;
import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f6198A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public volatile N f6199B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public AtomicInteger f6200C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f6203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f6205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile String f6206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Z f6207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f6208h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Looper f6209i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AbstractC0545d f6210j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0513k f6211k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Handler f6212l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Object f6213m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f6214n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IGmsServiceBroker f6215o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public c f6216p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IInterface f6217q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f6218r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f6219s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6220t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final InterfaceC0114a f6221u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f6222v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f6223w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f6224x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile String f6225y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0504b f6226z;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final C0506d[] f6197E = new C0506d[0];

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final String[] f6196D = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: com.google.android.gms.common.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0114a {
        void a(int i4);

        void u(Bundle bundle);
    }

    public interface b {
        void r(C0504b c0504b);
    }

    public interface c {
        void a(C0504b c0504b);
    }

    public class d implements c {
        public d() {
        }

        @Override // com.google.android.gms.common.internal.a.c
        public final void a(C0504b c0504b) {
            if (c0504b.i()) {
                a aVar = a.this;
                aVar.d(null, aVar.C());
            } else if (a.this.f6222v != null) {
                a.this.f6222v.r(c0504b);
            }
        }
    }

    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, Looper looper, int i4, InterfaceC0114a interfaceC0114a, b bVar, String str) {
        AbstractC0545d abstractC0545dA = AbstractC0545d.a(context);
        C0513k c0513kF = C0513k.f();
        AbstractC0549h.j(interfaceC0114a);
        AbstractC0549h.j(bVar);
        this(context, looper, abstractC0545dA, c0513kF, i4, interfaceC0114a, bVar, str);
    }

    public static /* bridge */ /* synthetic */ void c0(a aVar, N n4) {
        aVar.f6199B = n4;
        if (aVar.S()) {
            C0544c c0544c = n4.f3634p;
            C0550i.b().c(c0544c == null ? null : c0544c.k());
        }
    }

    public static /* bridge */ /* synthetic */ void d0(a aVar, int i4) {
        int i5;
        int i6;
        synchronized (aVar.f6213m) {
            i5 = aVar.f6220t;
        }
        if (i5 == 3) {
            aVar.f6198A = true;
            i6 = 5;
        } else {
            i6 = 4;
        }
        Handler handler = aVar.f6212l;
        handler.sendMessage(handler.obtainMessage(i6, aVar.f6200C.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean g0(a aVar, int i4, int i5, IInterface iInterface) {
        synchronized (aVar.f6213m) {
            try {
                if (aVar.f6220t != i4) {
                    return false;
                }
                aVar.i0(i5, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean h0(a aVar) {
        if (aVar.f6198A || TextUtils.isEmpty(aVar.E()) || TextUtils.isEmpty(aVar.B())) {
            return false;
        }
        try {
            Class.forName(aVar.E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public Bundle A() {
        return new Bundle();
    }

    public String B() {
        return null;
    }

    public Set C() {
        return Collections.EMPTY_SET;
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.f6213m) {
            try {
                if (this.f6220t == 5) {
                    throw new DeadObjectException();
                }
                r();
                iInterface = this.f6217q;
                AbstractC0549h.k(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String E();

    public abstract String F();

    public String G() {
        return "com.google.android.gms";
    }

    public C0544c H() {
        N n4 = this.f6199B;
        if (n4 == null) {
            return null;
        }
        return n4.f3634p;
    }

    public boolean I() {
        return g() >= 211700000;
    }

    public boolean J() {
        return this.f6199B != null;
    }

    public void K(IInterface iInterface) {
        this.f6203c = System.currentTimeMillis();
    }

    public void L(C0504b c0504b) {
        this.f6204d = c0504b.d();
        this.f6205e = System.currentTimeMillis();
    }

    public void M(int i4) {
        this.f6201a = i4;
        this.f6202b = System.currentTimeMillis();
    }

    public void N(int i4, IBinder iBinder, Bundle bundle, int i5) {
        this.f6212l.sendMessage(this.f6212l.obtainMessage(1, i5, -1, new j(this, i4, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f6225y = str;
    }

    public void Q(int i4) {
        this.f6212l.sendMessage(this.f6212l.obtainMessage(6, this.f6200C.get(), i4));
    }

    public void R(c cVar, int i4, PendingIntent pendingIntent) {
        AbstractC0549h.k(cVar, "Connection progress callbacks cannot be null.");
        this.f6216p = cVar;
        this.f6212l.sendMessage(this.f6212l.obtainMessage(3, this.f6200C.get(), i4, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    public final String X() {
        String str = this.f6224x;
        return str == null ? this.f6208h.getClass().getName() : str;
    }

    public void a(e eVar) {
        eVar.a();
    }

    public boolean b() {
        boolean z3;
        synchronized (this.f6213m) {
            z3 = this.f6220t == 4;
        }
        return z3;
    }

    public void d(IAccountAccessor iAccountAccessor, Set set) {
        Bundle bundleA = A();
        String str = Build.VERSION.SDK_INT < 31 ? this.f6225y : this.f6225y;
        int i4 = this.f6223w;
        int i5 = C0513k.f3436a;
        Scope[] scopeArr = com.google.android.gms.common.internal.b.f6228A;
        Bundle bundle = new Bundle();
        C0506d[] c0506dArr = com.google.android.gms.common.internal.b.f6229B;
        com.google.android.gms.common.internal.b bVar = new com.google.android.gms.common.internal.b(6, i4, i5, null, null, scopeArr, bundle, null, c0506dArr, c0506dArr, true, 0, false, str);
        bVar.f6233p = this.f6208h.getPackageName();
        bVar.f6236s = bundleA;
        if (set != null) {
            bVar.f6235r = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountU = u();
            if (accountU == null) {
                accountU = new Account("<<default account>>", "com.google");
            }
            bVar.f6237t = accountU;
            if (iAccountAccessor != null) {
                bVar.f6234q = iAccountAccessor.asBinder();
            }
        } else if (O()) {
            bVar.f6237t = u();
        }
        bVar.f6238u = f6197E;
        bVar.f6239v = v();
        if (S()) {
            bVar.f6242y = true;
        }
        try {
            synchronized (this.f6214n) {
                try {
                    IGmsServiceBroker iGmsServiceBroker = this.f6215o;
                    if (iGmsServiceBroker != null) {
                        iGmsServiceBroker.k1(new zzd(this, this.f6200C.get()), bVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e4) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e4);
            Q(3);
        } catch (RemoteException e5) {
            e = e5;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f6200C.get());
        } catch (SecurityException e6) {
            throw e6;
        } catch (RuntimeException e7) {
            e = e7;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f6200C.get());
        }
    }

    public void e(String str) {
        this.f6206f = str;
        n();
    }

    public final void e0(int i4, Bundle bundle, int i5) {
        this.f6212l.sendMessage(this.f6212l.obtainMessage(7, i5, -1, new k(this, i4, bundle)));
    }

    public boolean f() {
        return true;
    }

    public abstract int g();

    public boolean h() {
        boolean z3;
        synchronized (this.f6213m) {
            int i4 = this.f6220t;
            z3 = true;
            if (i4 != 2 && i4 != 3) {
                z3 = false;
            }
        }
        return z3;
    }

    public final C0506d[] i() {
        N n4 = this.f6199B;
        if (n4 == null) {
            return null;
        }
        return n4.f3632n;
    }

    public final void i0(int i4, IInterface iInterface) {
        Z z3;
        AbstractC0549h.a((i4 == 4) == (iInterface != null));
        synchronized (this.f6213m) {
            try {
                this.f6220t = i4;
                this.f6217q = iInterface;
                Bundle bundle = null;
                if (i4 == 1) {
                    i iVar = this.f6219s;
                    if (iVar != null) {
                        AbstractC0545d abstractC0545d = this.f6210j;
                        String strB = this.f6207g.b();
                        AbstractC0549h.j(strB);
                        abstractC0545d.e(strB, this.f6207g.a(), 4225, iVar, X(), this.f6207g.c());
                        this.f6219s = null;
                    }
                } else if (i4 == 2 || i4 == 3) {
                    i iVar2 = this.f6219s;
                    if (iVar2 != null && (z3 = this.f6207g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + z3.b() + " on " + z3.a());
                        AbstractC0545d abstractC0545d2 = this.f6210j;
                        String strB2 = this.f6207g.b();
                        AbstractC0549h.j(strB2);
                        abstractC0545d2.e(strB2, this.f6207g.a(), 4225, iVar2, X(), this.f6207g.c());
                        this.f6200C.incrementAndGet();
                    }
                    i iVar3 = new i(this, this.f6200C.get());
                    this.f6219s = iVar3;
                    Z z4 = (this.f6220t != 3 || B() == null) ? new Z(G(), F(), false, 4225, I()) : new Z(y().getPackageName(), B(), true, 4225, false);
                    this.f6207g = z4;
                    if (z4.c() && g() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f6207g.b())));
                    }
                    AbstractC0545d abstractC0545d3 = this.f6210j;
                    String strB3 = this.f6207g.b();
                    AbstractC0549h.j(strB3);
                    C0504b c0504bC = abstractC0545d3.c(new S(strB3, this.f6207g.a(), 4225, this.f6207g.c()), iVar3, X(), w());
                    if (!c0504bC.i()) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f6207g.b() + " on " + this.f6207g.a());
                        int iD = c0504bC.d() == -1 ? 16 : c0504bC.d();
                        if (c0504bC.g() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", c0504bC.g());
                        }
                        e0(iD, bundle, this.f6200C.get());
                    }
                } else if (i4 == 4) {
                    AbstractC0549h.j(iInterface);
                    K(iInterface);
                }
            } finally {
            }
        }
    }

    public String j() {
        Z z3;
        if (!b() || (z3 = this.f6207g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return z3.a();
    }

    public String l() {
        return this.f6206f;
    }

    public void m(c cVar) {
        AbstractC0549h.k(cVar, "Connection progress callbacks cannot be null.");
        this.f6216p = cVar;
        i0(2, null);
    }

    public void n() {
        this.f6200C.incrementAndGet();
        synchronized (this.f6218r) {
            try {
                int size = this.f6218r.size();
                for (int i4 = 0; i4 < size; i4++) {
                    ((M) this.f6218r.get(i4)).d();
                }
                this.f6218r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f6214n) {
            this.f6215o = null;
        }
        i0(1, null);
    }

    public boolean o() {
        return false;
    }

    public void q() {
        int iH = this.f6211k.h(this.f6208h, g());
        if (iH == 0) {
            m(new d());
        } else {
            i0(1, null);
            R(new d(), iH, null);
        }
    }

    public final void r() {
        if (!b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface s(IBinder iBinder);

    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C0506d[] v() {
        return f6197E;
    }

    public Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f6208h;
    }

    public int z() {
        return this.f6223w;
    }

    public a(Context context, Looper looper, AbstractC0545d abstractC0545d, C0513k c0513k, int i4, InterfaceC0114a interfaceC0114a, b bVar, String str) {
        this.f6206f = null;
        this.f6213m = new Object();
        this.f6214n = new Object();
        this.f6218r = new ArrayList();
        this.f6220t = 1;
        this.f6226z = null;
        this.f6198A = false;
        this.f6199B = null;
        this.f6200C = new AtomicInteger(0);
        AbstractC0549h.k(context, "Context must not be null");
        this.f6208h = context;
        AbstractC0549h.k(looper, "Looper must not be null");
        this.f6209i = looper;
        AbstractC0549h.k(abstractC0545d, "Supervisor must not be null");
        this.f6210j = abstractC0545d;
        AbstractC0549h.k(c0513k, "API availability must not be null");
        this.f6211k = c0513k;
        this.f6212l = new h(this, looper);
        this.f6223w = i4;
        this.f6221u = interfaceC0114a;
        this.f6222v = bVar;
        this.f6224x = str;
    }
}
