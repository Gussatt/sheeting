package com.google.android.gms.common.api.internal;

import S0.C0504b;
import T0.a;
import T0.f;
import U0.K;
import U0.L;
import U0.M;
import V0.AbstractC0549h;
import V0.C0543b;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.google.android.gms.signin.internal.zac;
import java.util.Set;
import l1.AbstractC1385d;
import l1.InterfaceC1386e;
import m1.j;

/* JADX INFO: loaded from: classes.dex */
public final class zact extends zac implements f.a, f.b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a.AbstractC0073a f6188s = AbstractC1385d.f10247c;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f6189l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Handler f6190m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a.AbstractC0073a f6191n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f6192o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final C0543b f6193p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC1386e f6194q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public M f6195r;

    public zact(Context context, Handler handler, C0543b c0543b) {
        a.AbstractC0073a abstractC0073a = f6188s;
        this.f6189l = context;
        this.f6190m = handler;
        this.f6193p = (C0543b) AbstractC0549h.k(c0543b, "ClientSettings must not be null");
        this.f6192o = c0543b.e();
        this.f6191n = abstractC0073a;
    }

    public static /* bridge */ /* synthetic */ void q1(zact zactVar, j jVar) {
        C0504b c0504bD = jVar.d();
        if (c0504bD.i()) {
            com.google.android.gms.common.internal.f fVar = (com.google.android.gms.common.internal.f) AbstractC0549h.j(jVar.f());
            C0504b c0504bD2 = fVar.d();
            if (!c0504bD2.i()) {
                String strValueOf = String.valueOf(c0504bD2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(strValueOf), new Exception());
                zactVar.f6195r.c(c0504bD2);
                zactVar.f6194q.n();
                return;
            }
            zactVar.f6195r.b(fVar.f(), zactVar.f6192o);
        } else {
            zactVar.f6195r.c(c0504bD);
        }
        zactVar.f6194q.n();
    }

    @Override // com.google.android.gms.signin.internal.zac, m1.InterfaceC1395d
    public final void J0(j jVar) {
        this.f6190m.post(new L(this, jVar));
    }

    @Override // U0.InterfaceC0520d
    public final void a(int i4) {
        this.f6195r.d(i4);
    }

    @Override // U0.InterfaceC0527k
    public final void r(C0504b c0504b) {
        this.f6195r.c(c0504b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T0.a$f, l1.e] */
    public final void r1(M m4) {
        InterfaceC1386e interfaceC1386e = this.f6194q;
        if (interfaceC1386e != null) {
            interfaceC1386e.n();
        }
        this.f6193p.i(Integer.valueOf(System.identityHashCode(this)));
        a.AbstractC0073a abstractC0073a = this.f6191n;
        Context context = this.f6189l;
        Handler handler = this.f6190m;
        C0543b c0543b = this.f6193p;
        this.f6194q = abstractC0073a.a(context, handler.getLooper(), c0543b, c0543b.f(), this, this);
        this.f6195r = m4;
        Set set = this.f6192o;
        if (set == null || set.isEmpty()) {
            this.f6190m.post(new K(this));
        } else {
            this.f6194q.p();
        }
    }

    public final void s1() {
        InterfaceC1386e interfaceC1386e = this.f6194q;
        if (interfaceC1386e != null) {
            interfaceC1386e.n();
        }
    }

    @Override // U0.InterfaceC0520d
    public final void u(Bundle bundle) {
        this.f6194q.k(this);
    }
}
