package b1;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import c1.C0663e;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: b1.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0633a {
    public static byte[] a(Context context, String str) {
        MessageDigest messageDigestB;
        PackageInfo packageInfoD = C0663e.a(context).d(str, 64);
        Signature[] signatureArr = packageInfoD.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (messageDigestB = b("SHA1")) == null) {
            return null;
        }
        return messageDigestB.digest(packageInfoD.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int i4 = 0; i4 < 2; i4++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
