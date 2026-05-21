package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0789k5 implements InterfaceC0844r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0844r5[] f6873a;

    public C0789k5(InterfaceC0844r5... interfaceC0844r5Arr) {
        this.f6873a = interfaceC0844r5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0844r5
    public final InterfaceC0837q5 a(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            InterfaceC0844r5 interfaceC0844r5 = this.f6873a[i4];
            if (interfaceC0844r5.b(cls)) {
                return interfaceC0844r5.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0844r5
    public final boolean b(Class cls) {
        for (int i4 = 0; i4 < 2; i4++) {
            if (this.f6873a[i4].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
