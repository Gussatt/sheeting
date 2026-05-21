package c2;

import android.util.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f6104a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f6105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f6106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f6107d;

    static {
        String strEncodeToString = Base64.encodeToString(f3.p.m(t.f6103a.e()), 10);
        f6105b = strEncodeToString;
        f6106c = "firebase_session_" + strEncodeToString + "_data";
        f6107d = "firebase_session_" + strEncodeToString + "_settings";
    }

    public final String a() {
        return f6106c;
    }

    public final String b() {
        return f6107d;
    }
}
