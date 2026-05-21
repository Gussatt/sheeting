package S0;

import V0.AbstractC0548g;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: S0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0504b extends W0.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f3422m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f3423n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final PendingIntent f3424o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f3425p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C0504b f3421q = new C0504b(0);
    public static final Parcelable.Creator<C0504b> CREATOR = new r();

    public C0504b(int i4, int i5, PendingIntent pendingIntent, String str) {
        this.f3422m = i4;
        this.f3423n = i5;
        this.f3424o = pendingIntent;
        this.f3425p = str;
    }

    public static String k(int i4) {
        if (i4 == 99) {
            return "UNFINISHED";
        }
        if (i4 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i4) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case O.h.LONG_FIELD_NUMBER /* 4 */:
                return "SIGN_IN_REQUIRED";
            case O.h.STRING_FIELD_NUMBER /* 5 */:
                return "INVALID_ACCOUNT";
            case O.h.STRING_SET_FIELD_NUMBER /* 6 */:
                return "RESOLUTION_REQUIRED";
            case O.h.DOUBLE_FIELD_NUMBER /* 7 */:
                return "NETWORK_ERROR";
            case O.h.BYTES_FIELD_NUMBER /* 8 */:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i4) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    case 25:
                        return "API_INSTALL_REQUIRED";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i4 + ")";
                }
        }
    }

    public int d() {
        return this.f3423n;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0504b)) {
            return false;
        }
        C0504b c0504b = (C0504b) obj;
        return this.f3423n == c0504b.f3423n && AbstractC0548g.a(this.f3424o, c0504b.f3424o) && AbstractC0548g.a(this.f3425p, c0504b.f3425p);
    }

    public String f() {
        return this.f3425p;
    }

    public PendingIntent g() {
        return this.f3424o;
    }

    public boolean h() {
        return (this.f3423n == 0 || this.f3424o == null) ? false : true;
    }

    public int hashCode() {
        return AbstractC0548g.b(Integer.valueOf(this.f3423n), this.f3424o, this.f3425p);
    }

    public boolean i() {
        return this.f3423n == 0;
    }

    public String toString() {
        AbstractC0548g.a aVarC = AbstractC0548g.c(this);
        aVarC.a("statusCode", k(this.f3423n));
        aVarC.a("resolution", this.f3424o);
        aVarC.a("message", this.f3425p);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int i5 = this.f3422m;
        int iA = W0.c.a(parcel);
        W0.c.j(parcel, 1, i5);
        W0.c.j(parcel, 2, d());
        W0.c.o(parcel, 3, g(), i4, false);
        W0.c.p(parcel, 4, f(), false);
        W0.c.b(parcel, iA);
    }

    public C0504b(int i4) {
        this(i4, null, null);
    }

    public C0504b(int i4, PendingIntent pendingIntent) {
        this(i4, pendingIntent, null);
    }

    public C0504b(int i4, PendingIntent pendingIntent, String str) {
        this(1, i4, pendingIntent, str);
    }
}
