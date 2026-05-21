package com.google.android.gms.internal.measurement;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class H3 extends AbstractC0734e4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o1.k f6361b;

    public H3(Context context, o1.k kVar) {
        this.f6360a = context;
        this.f6361b = kVar;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0734e4
    public final Context a() {
        return this.f6360a;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0734e4
    public final o1.k b() {
        return this.f6361b;
    }

    public final boolean equals(Object obj) {
        o1.k kVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0734e4) {
            AbstractC0734e4 abstractC0734e4 = (AbstractC0734e4) obj;
            if (this.f6360a.equals(abstractC0734e4.a()) && ((kVar = this.f6361b) != null ? kVar.equals(abstractC0734e4.b()) : abstractC0734e4.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f6360a.hashCode() ^ 1000003;
        o1.k kVar = this.f6361b;
        return (iHashCode * 1000003) ^ (kVar == null ? 0 : kVar.hashCode());
    }

    public final String toString() {
        o1.k kVar = this.f6361b;
        return "FlagsContext{context=" + this.f6360a.toString() + ", hermeticFileOverrides=" + String.valueOf(kVar) + "}";
    }
}
