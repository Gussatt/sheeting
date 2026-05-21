package com.google.android.gms.internal.measurement;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Comparator {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ AbstractC0783k f6313m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ U1 f6314n;

    public D(AbstractC0783k abstractC0783k, U1 u12) {
        this.f6313m = abstractC0783k;
        this.f6314n = u12;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        r rVar = (r) obj;
        r rVar2 = (r) obj2;
        if (rVar instanceof C0878w) {
            return !(rVar2 instanceof C0878w) ? 1 : 0;
        }
        if (rVar2 instanceof C0878w) {
            return -1;
        }
        AbstractC0783k abstractC0783k = this.f6313m;
        return abstractC0783k == null ? rVar.g().compareTo(rVar2.g()) : (int) AbstractC0873v2.a(abstractC0783k.a(this.f6314n, Arrays.asList(rVar, rVar2)).f().doubleValue());
    }
}
