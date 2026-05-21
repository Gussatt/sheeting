package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC0733e3 implements X4 {
    CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN(0),
    CLIENT_UPLOAD_ELIGIBLE(1),
    MEASUREMENT_SERVICE_NOT_ENABLED(2),
    ANDROID_TOO_OLD(3),
    NON_PLAY_MODE(4),
    SDK_TOO_OLD(5),
    MISSING_JOB_SCHEDULER(6),
    NOT_ENABLED_IN_MANIFEST(7),
    CLIENT_FLAG_OFF(8),
    SERVICE_FLAG_OFF(20),
    PINNED_TO_SERVICE_UPLOAD(21),
    MISSING_SGTM_SERVER_URL(22);


    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6704m;

    EnumC0733e3(int i4) {
        this.f6704m = i4;
    }

    public static EnumC0733e3 f(int i4) {
        switch (i4) {
            case 0:
                return CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN;
            case 1:
                return CLIENT_UPLOAD_ELIGIBLE;
            case 2:
                return MEASUREMENT_SERVICE_NOT_ENABLED;
            case 3:
                return ANDROID_TOO_OLD;
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return NON_PLAY_MODE;
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return SDK_TOO_OLD;
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return MISSING_JOB_SCHEDULER;
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return NOT_ENABLED_IN_MANIFEST;
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return CLIENT_FLAG_OFF;
            default:
                switch (i4) {
                    case 20:
                        return SERVICE_FLAG_OFF;
                    case 21:
                        return PINNED_TO_SERVICE_UPLOAD;
                    case 22:
                        return MISSING_SGTM_SERVER_URL;
                    default:
                        return null;
                }
        }
    }

    public final int d() {
        return this.f6704m;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.f6704m);
    }
}
