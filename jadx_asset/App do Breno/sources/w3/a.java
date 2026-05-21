package w3;

import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static int a(Parcel parcel, int i4) {
        return (i4 & (-65536)) != -65536 ? (i4 >> 16) & 65535 : parcel.readInt();
    }

    public static String b(Parcel parcel, int i4) {
        int iA = a(parcel, i4);
        if (iA == 0) {
            return null;
        }
        int iDataPosition = parcel.dataPosition();
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iA);
        return string;
    }
}
