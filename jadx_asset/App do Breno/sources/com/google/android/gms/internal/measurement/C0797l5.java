package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0797l5 implements F5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0844r5 f6879b = new C0780j5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0844r5 f6880a;

    public C0797l5() {
        R4 r4C = R4.c();
        B5 b5 = B5.f6298c;
        C0789k5 c0789k5 = new C0789k5(r4C, f6879b);
        Charset charset = AbstractC0717c5.f6667a;
        this.f6880a = c0789k5;
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final E5 a(Class cls) {
        K5 k5 = G5.f6351a;
        if (!V4.class.isAssignableFrom(cls)) {
            B5 b5 = B5.f6298c;
        }
        InterfaceC0837q5 interfaceC0837q5A = this.f6880a.a(cls);
        if (interfaceC0837q5A.b()) {
            B5 b52 = B5.f6298c;
            return C0892x5.j(G5.r(), O4.a(), interfaceC0837q5A.a());
        }
        B5 b53 = B5.f6298c;
        return C0884w5.A(cls, interfaceC0837q5A, AbstractC0908z5.a(), AbstractC0762h5.a(), G5.r(), interfaceC0837q5A.c() + (-1) != 1 ? O4.a() : null, AbstractC0829p5.a());
    }
}
