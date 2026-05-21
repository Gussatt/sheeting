package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class R4 implements InterfaceC0844r5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final R4 f6565a = new R4();

    public static R4 c() {
        return f6565a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0844r5
    public final InterfaceC0837q5 a(Class cls) {
        if (!V4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC0837q5) V4.p(cls.asSubclass(V4.class)).E(3, null, null);
        } catch (Exception e4) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e4);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0844r5
    public final boolean b(Class cls) {
        return V4.class.isAssignableFrom(cls);
    }
}
