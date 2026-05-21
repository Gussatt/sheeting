package com.google.firebase.sessions;

import N2.i;
import V1.h;
import android.content.Context;
import c2.C0665B;
import c2.C0671H;
import c2.C0683i;
import c2.C0686l;
import c2.C0690p;
import c2.w;
import com.google.firebase.sessions.b;
import e2.AbstractC0936d;
import e2.C0933a;
import e2.C0935c;
import e2.InterfaceC0934b;
import f2.C0955f;
import f2.C0956g;
import r1.C1509f;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    public static final class b implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Context f7086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public i f7087b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public i f7088c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C1509f f7089d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public h f7090e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public U1.b f7091f;

        public b() {
        }

        @Override // com.google.firebase.sessions.b.a
        public com.google.firebase.sessions.b a() {
            AbstractC0936d.a(this.f7086a, Context.class);
            AbstractC0936d.a(this.f7087b, i.class);
            AbstractC0936d.a(this.f7088c, i.class);
            AbstractC0936d.a(this.f7089d, C1509f.class);
            AbstractC0936d.a(this.f7090e, h.class);
            AbstractC0936d.a(this.f7091f, U1.b.class);
            return new c(this.f7086a, this.f7087b, this.f7088c, this.f7089d, this.f7090e, this.f7091f);
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public b g(Context context) {
            this.f7086a = (Context) AbstractC0936d.b(context);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public b b(i iVar) {
            this.f7087b = (i) AbstractC0936d.b(iVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public b c(i iVar) {
            this.f7088c = (i) AbstractC0936d.b(iVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public b e(C1509f c1509f) {
            this.f7089d = (C1509f) AbstractC0936d.b(c1509f);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public b d(h hVar) {
            this.f7090e = (h) AbstractC0936d.b(hVar);
            return this;
        }

        @Override // com.google.firebase.sessions.b.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public b f(U1.b bVar) {
            this.f7091f = (U1.b) AbstractC0936d.b(bVar);
            return this;
        }
    }

    public static final class c implements com.google.firebase.sessions.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f7092a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public J2.a f7093b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public J2.a f7094c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public J2.a f7095d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public J2.a f7096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public J2.a f7097f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public J2.a f7098g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public J2.a f7099h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public J2.a f7100i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public J2.a f7101j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public J2.a f7102k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public J2.a f7103l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public J2.a f7104m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public J2.a f7105n;

        @Override // com.google.firebase.sessions.b
        public C0686l a() {
            return (C0686l) this.f7100i.get();
        }

        @Override // com.google.firebase.sessions.b
        public d b() {
            return (d) this.f7101j.get();
        }

        @Override // com.google.firebase.sessions.b
        public C0955f c() {
            return (C0955f) this.f7097f.get();
        }

        @Override // com.google.firebase.sessions.b
        public f d() {
            return (f) this.f7105n.get();
        }

        @Override // com.google.firebase.sessions.b
        public e e() {
            return (e) this.f7104m.get();
        }

        public final void f(Context context, i iVar, i iVar2, C1509f c1509f, h hVar, U1.b bVar) {
            this.f7093b = C0935c.a(c1509f);
            this.f7094c = C0935c.a(iVar2);
            this.f7095d = C0935c.a(iVar);
            InterfaceC0934b interfaceC0934bA = C0935c.a(hVar);
            this.f7096e = interfaceC0934bA;
            this.f7097f = C0933a.a(C0956g.a(this.f7093b, this.f7094c, this.f7095d, interfaceC0934bA));
            InterfaceC0934b interfaceC0934bA2 = C0935c.a(context);
            this.f7098g = interfaceC0934bA2;
            J2.a aVarA = C0933a.a(C0671H.a(interfaceC0934bA2));
            this.f7099h = aVarA;
            this.f7100i = C0933a.a(C0690p.a(this.f7093b, this.f7097f, this.f7095d, aVarA));
            this.f7101j = C0933a.a(w.a(this.f7098g, this.f7095d));
            InterfaceC0934b interfaceC0934bA3 = C0935c.a(bVar);
            this.f7102k = interfaceC0934bA3;
            J2.a aVarA2 = C0933a.a(C0683i.a(interfaceC0934bA3));
            this.f7103l = aVarA2;
            this.f7104m = C0933a.a(C0665B.a(this.f7093b, this.f7096e, this.f7097f, aVarA2, this.f7095d));
            this.f7105n = C0933a.a(com.google.firebase.sessions.c.a());
        }

        public c(Context context, i iVar, i iVar2, C1509f c1509f, h hVar, U1.b bVar) {
            this.f7092a = this;
            f(context, iVar, iVar2, c1509f, hVar, bVar);
        }
    }

    public static b.a a() {
        return new b();
    }
}
