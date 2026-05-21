package h2;

import android.content.Intent;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: renamed from: h2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0992a {
    public static String a(Intent intent) {
        String strB = b(intent);
        if (strB == null) {
            return c(intent);
        }
        Log.d("com.llfbandit.app_links", "handleIntent: (Data) (short deep link)" + strB);
        return strB;
    }

    public static String b(Intent intent) {
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA");
        if (byteArrayExtra == null || byteArrayExtra.length == 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(byteArrayExtra, 0, byteArrayExtra.length);
        parcelObtain.setDataPosition(0);
        return w3.a.b(parcelObtain, parcelObtain.readInt());
    }

    public static String c(Intent intent) {
        String action = intent.getAction();
        if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action) || "android.intent.action.SENDTO".equals(action)) {
            return null;
        }
        String dataString = intent.getDataString();
        if (dataString != null) {
            Log.d("com.llfbandit.app_links", "Handled intent: action: " + action + " / data: " + dataString);
        }
        return dataString;
    }
}
