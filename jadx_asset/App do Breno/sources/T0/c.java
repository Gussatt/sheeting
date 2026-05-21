package T0;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static String a(int i4) {
        switch (i4) {
            case -1:
                return "SUCCESS_CACHE";
            case 0:
                return "SUCCESS";
            case 1:
            case 9:
            case 11:
            case 12:
            default:
                return "unknown status code: " + i4;
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
            case 10:
                return "DEVELOPER_ERROR";
            case 13:
                return "ERROR";
            case 14:
                return "INTERRUPTED";
            case 15:
                return "TIMEOUT";
            case 16:
                return "CANCELED";
            case 17:
                return "API_NOT_CONNECTED";
            case 18:
                return "DEAD_CLIENT";
            case 19:
                return "REMOTE_EXCEPTION";
            case 20:
                return "CONNECTION_SUSPENDED_DURING_CALL";
            case 21:
                return "RECONNECTION_TIMED_OUT_DURING_UPDATE";
            case 22:
                return "RECONNECTION_TIMED_OUT";
        }
    }
}
