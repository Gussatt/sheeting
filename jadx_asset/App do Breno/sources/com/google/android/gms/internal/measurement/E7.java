package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class E7 extends AbstractC0783k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Callable f6328o;

    public E7(String str, Callable callable) {
        super("internal.appMetadata");
        this.f6328o = callable;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0783k
    public final r a(U1 u12, List list) {
        try {
            return W2.b(this.f6328o.call());
        } catch (Exception unused) {
            return r.f6932b;
        }
    }
}
