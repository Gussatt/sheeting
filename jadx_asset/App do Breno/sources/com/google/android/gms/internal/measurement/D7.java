package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class D7 extends AbstractC0783k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC0755g7 f6322o;

    public D7(InterfaceC0755g7 interfaceC0755g7) {
        super("internal.logger");
        this.f6322o = interfaceC0755g7;
        this.f6863n.put("log", new C7(this, false, true));
        this.f6863n.put("silent", new C0736e6(this, "silent"));
        ((AbstractC0783k) this.f6863n.get("silent")).p("log", new C7(this, true, true));
        this.f6863n.put("unmonitored", new F6(this, "unmonitored"));
        ((AbstractC0783k) this.f6863n.get("unmonitored")).p("log", new C7(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0783k
    public final r a(U1 u12, List list) {
        return r.f6932b;
    }
}
