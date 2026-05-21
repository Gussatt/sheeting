package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0779j4 implements X4 {
    IAB_TCF_PURPOSE_UNKNOWN(0),
    IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE(1),
    IAB_TCF_PURPOSE_SELECT_BASIC_ADS(2),
    IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE(3),
    IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS(4),
    IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_CONTENT_PROFILE(5),
    IAB_TCF_PURPOSE_SELECT_PERSONALISED_CONTENT(6),
    IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE(7),
    IAB_TCF_PURPOSE_MEASURE_CONTENT_PERFORMANCE(8),
    IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS(9),
    IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS(10),
    IAB_TCF_PURPOSE_USE_LIMITED_DATA_TO_SELECT_CONTENT(11),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6858m;

    EnumC0779j4(int i4) {
        this.f6858m = i4;
    }

    public final int d() {
        if (this != UNRECOGNIZED) {
            return this.f6858m;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(d());
    }
}
