package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0788k4 implements X4 {
    PURPOSE_RESTRICTION_NOT_ALLOWED(0),
    PURPOSE_RESTRICTION_REQUIRE_CONSENT(1),
    PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST(2),
    PURPOSE_RESTRICTION_UNDEFINED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6872m;

    EnumC0788k4(int i4) {
        this.f6872m = i4;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.f6872m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(d());
    }
}
