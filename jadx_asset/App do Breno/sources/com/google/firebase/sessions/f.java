package com.google.firebase.sessions;

import X2.g;
import X2.j;
import X2.l;
import c2.InterfaceC0673J;
import c2.x;
import f3.p;
import java.util.Locale;
import java.util.UUID;
import r1.C1506c;
import r1.m;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f7113f = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0673J f7114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W2.a f7115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7116c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7117d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x f7118e;

    public /* synthetic */ class a extends j implements W2.a {

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f7119v = new a();

        public a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // W2.a
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final UUID e() {
            return UUID.randomUUID();
        }
    }

    public static final class b {
        public /* synthetic */ b(g gVar) {
            this();
        }

        public final f a() {
            return ((com.google.firebase.sessions.b) m.a(C1506c.f11192a).k(com.google.firebase.sessions.b.class)).d();
        }

        public b() {
        }
    }

    public f(InterfaceC0673J interfaceC0673J, W2.a aVar) {
        l.e(interfaceC0673J, "timeProvider");
        l.e(aVar, "uuidGenerator");
        this.f7114a = interfaceC0673J;
        this.f7115b = aVar;
        this.f7116c = b();
        this.f7117d = -1;
    }

    public final x a() {
        int i4 = this.f7117d + 1;
        this.f7117d = i4;
        this.f7118e = new x(i4 == 0 ? this.f7116c : b(), this.f7116c, this.f7117d, this.f7114a.a());
        return c();
    }

    public final String b() {
        String string = ((UUID) this.f7115b.e()).toString();
        l.d(string, "uuidGenerator().toString()");
        String lowerCase = p.r(string, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        l.d(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final x c() {
        x xVar = this.f7118e;
        if (xVar != null) {
            return xVar;
        }
        l.o("currentSession");
        return null;
    }

    public /* synthetic */ f(InterfaceC0673J interfaceC0673J, W2.a aVar, int i4, g gVar) {
        this(interfaceC0673J, (i4 & 2) != 0 ? a.f7119v : aVar);
    }
}
