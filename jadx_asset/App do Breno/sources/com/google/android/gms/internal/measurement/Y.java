package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class Y extends AbstractC0739f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6629d;

    public /* synthetic */ Y(String str, boolean z3, int i4, U u4, V v4, int i5, X x3) {
        this.f6627b = str;
        this.f6628c = i4;
        this.f6629d = i5;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0739f0
    public final U a() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0739f0
    public final V b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0739f0
    public final String c() {
        return this.f6627b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0739f0
    public final boolean d() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0739f0
    public final int e() {
        return this.f6628c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0739f0) {
            AbstractC0739f0 abstractC0739f0 = (AbstractC0739f0) obj;
            if (this.f6627b.equals(abstractC0739f0.c())) {
                abstractC0739f0.d();
                int i4 = this.f6628c;
                int iE = abstractC0739f0.e();
                if (i4 == 0) {
                    throw null;
                }
                if (i4 == iE) {
                    abstractC0739f0.a();
                    abstractC0739f0.b();
                    int i5 = this.f6629d;
                    int iF = abstractC0739f0.f();
                    if (i5 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0739f0
    public final int f() {
        return this.f6629d;
    }

    public final int hashCode() {
        int iHashCode = this.f6627b.hashCode() ^ 1000003;
        int i4 = this.f6628c;
        if (i4 == 0) {
            throw null;
        }
        int i5 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i4;
        if (this.f6629d != 0) {
            return (i5 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i4 = this.f6628c;
        String str = i4 != 1 ? i4 != 2 ? i4 != 3 ? i4 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.f6629d == 1 ? "READ_AND_WRITE" : "null";
        return "FileComplianceOptions{fileOwner=" + this.f6627b + ", hasDifferentDmaOwner=false, fileChecks=" + str + ", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=" + str2 + "}";
    }
}
