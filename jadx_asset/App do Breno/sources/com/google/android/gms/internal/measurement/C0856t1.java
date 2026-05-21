package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0856t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0902z f6965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U1 f6966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U1 f6967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0890x3 f6968d;

    public C0856t1() {
        C0902z c0902z = new C0902z();
        this.f6965a = c0902z;
        U1 u12 = new U1(null, c0902z);
        this.f6967c = u12;
        this.f6966b = u12.a();
        C0890x3 c0890x3 = new C0890x3();
        this.f6968d = c0890x3;
        u12.g("require", new G7(c0890x3));
        c0890x3.a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.Y0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new I7();
            }
        });
        u12.g("runtime.counter", new C0774j(Double.valueOf(0.0d)));
    }

    public final r a(U1 u12, C0882w3... c0882w3Arr) {
        r rVarA = r.f6932b;
        for (C0882w3 c0882w3 : c0882w3Arr) {
            rVarA = W2.a(c0882w3);
            AbstractC0873v2.c(this.f6967c);
            if ((rVarA instanceof C0846s) || (rVarA instanceof C0831q)) {
                rVarA = this.f6965a.a(u12, rVarA);
            }
        }
        return rVarA;
    }
}
