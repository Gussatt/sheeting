package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class T4 extends AbstractC0783k {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ H5 f6588o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(C0805m5 c0805m5, String str, H5 h5) {
        super("getValue");
        this.f6588o = h5;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0783k
    public final r a(U1 u12, List list) {
        AbstractC0873v2.h("getValue", 2, list);
        r rVarB = u12.b((r) list.get(0));
        r rVarB2 = u12.b((r) list.get(1));
        String strA = this.f6588o.a(rVarB.g());
        return strA != null ? new C0870v(strA) : rVarB2;
    }
}
