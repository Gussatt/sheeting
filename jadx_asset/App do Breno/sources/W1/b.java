package W1;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import r1.C1509f;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f3792c = {"*", "FCM", "GCM", ""};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f3793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3794b;

    public b(C1509f c1509f) {
        this.f3793a = c1509f.m().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f3794b = b(c1509f);
    }

    public static String b(C1509f c1509f) {
        String strF = c1509f.r().f();
        if (strF != null) {
            return strF;
        }
        String strC = c1509f.r().c();
        if (!strC.startsWith("1:") && !strC.startsWith("2:")) {
            return strC;
        }
        String[] strArrSplit = strC.split(":");
        if (strArrSplit.length != 4) {
            return null;
        }
        String str = strArrSplit[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    public static String c(PublicKey publicKey) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            bArrDigest[0] = (byte) (((bArrDigest[0] & 15) + 112) & 255);
            return Base64.encodeToString(bArrDigest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    public final String a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    public final String d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    public final PublicKey e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e4) {
            Log.w("ContentValues", "Invalid key stored " + e4);
            return null;
        }
    }

    public String f() {
        synchronized (this.f3793a) {
            try {
                String strG = g();
                if (strG != null) {
                    return strG;
                }
                return h();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String g() {
        String string;
        synchronized (this.f3793a) {
            string = this.f3793a.getString("|S|id", null);
        }
        return string;
    }

    public final String h() {
        synchronized (this.f3793a) {
            try {
                String string = this.f3793a.getString("|S||P|", null);
                if (string == null) {
                    return null;
                }
                PublicKey publicKeyE = e(string);
                if (publicKeyE == null) {
                    return null;
                }
                return c(publicKeyE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String i() {
        synchronized (this.f3793a) {
            try {
                for (String str : f3792c) {
                    String string = this.f3793a.getString(a(this.f3794b, str), null);
                    if (string != null && !string.isEmpty()) {
                        if (string.startsWith("{")) {
                            string = d(string);
                        }
                        return string;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
