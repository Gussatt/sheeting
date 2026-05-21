package io.flutter.plugin.platform;

import android.content.Context;
import android.view.View;
import io.flutter.view.TextureRegistry;
import o2.C1472a;
import v2.s;

/* JADX INFO: loaded from: classes.dex */
public class Q implements InterfaceC1085q, s.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1090w f7964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public P f7965b;

    public Q(C1090w c1090w, P p4) {
        this.f7964a = c1090w;
        this.f7965b = p4;
    }

    @Override // v2.s.e
    public void a(int i4, int i5) {
        if (this.f7965b.k(i4) != null) {
            this.f7965b.f7962p.a(i4, i5);
        } else {
            this.f7964a.f8074w.a(i4, i5);
        }
    }

    @Override // v2.s.e
    public void b(v2.q qVar) {
        if (this.f7965b.k(qVar.f11697a) != null) {
            this.f7965b.f7962p.b(qVar);
        } else {
            this.f7964a.f8074w.b(qVar);
        }
    }

    @Override // v2.s.e
    public void c(int i4) {
        if (this.f7965b.k(i4) != null) {
            this.f7965b.f7962p.c(i4);
        } else {
            this.f7964a.f8074w.c(i4);
        }
    }

    @Override // v2.s.e
    public void d(int i4) {
        if (this.f7965b.k(i4) != null) {
            this.f7965b.f7962p.d(i4);
        } else {
            this.f7964a.f8074w.d(i4);
        }
    }

    @Override // v2.s.e
    public void e(s.d dVar, s.b bVar) {
        if (this.f7965b.k(dVar.f11720a) != null) {
            return;
        }
        this.f7964a.f8074w.e(dVar, bVar);
    }

    @Override // v2.s.e
    public long f(v2.p pVar) {
        return this.f7964a.f8074w.f(pVar);
    }

    @Override // v2.s.e
    public void g(boolean z3) {
        this.f7964a.f8074w.g(z3);
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public void h(io.flutter.view.h hVar) {
        this.f7964a.h(hVar);
        this.f7965b.h(hVar);
    }

    @Override // v2.s.e
    public void i(int i4, double d4, double d5) {
        if (this.f7965b.k(i4) != null) {
            return;
        }
        this.f7964a.f8074w.i(i4, d4, d5);
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public boolean j(int i4) {
        return this.f7965b.k(i4) != null ? this.f7965b.j(i4) : this.f7964a.j(i4);
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public View k(int i4) {
        return this.f7965b.k(i4) != null ? this.f7965b.k(i4) : this.f7964a.k(i4);
    }

    @Override // io.flutter.plugin.platform.InterfaceC1085q
    public void l() {
        this.f7964a.l();
        this.f7965b.l();
    }

    @Override // v2.s.e
    public void m(v2.p pVar) {
        this.f7964a.f8074w.m(pVar);
    }

    public void n(Context context, TextureRegistry textureRegistry, C1472a c1472a) {
        this.f7964a.C(context, textureRegistry, c1472a);
        this.f7965b.f(context, c1472a);
        this.f7964a.W().e(this);
    }
}
