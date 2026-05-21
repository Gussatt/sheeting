package W0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public static class a extends RuntimeException {
        public a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static Bundle a(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iU);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iU);
        return bArrCreateByteArray;
    }

    public static int[] c(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iU);
        return iArrCreateIntArray;
    }

    public static ArrayList d(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i5 = parcel.readInt();
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iU);
        return arrayList;
    }

    public static Parcelable e(Parcel parcel, int i4, Parcelable.Creator creator) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iU);
        return parcelable;
    }

    public static String f(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iU);
        return string;
    }

    public static ArrayList g(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iU);
        return arrayListCreateStringArrayList;
    }

    public static Object[] h(Parcel parcel, int i4, Parcelable.Creator creator) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        Object[] objArrCreateTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iU);
        return objArrCreateTypedArray;
    }

    public static ArrayList i(Parcel parcel, int i4, Parcelable.Creator creator) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iU);
        return arrayListCreateTypedArrayList;
    }

    public static void j(Parcel parcel, int i4) {
        if (parcel.dataPosition() == i4) {
            return;
        }
        throw new a("Overread allowed size end=" + i4, parcel);
    }

    public static int k(int i4) {
        return (char) i4;
    }

    public static boolean l(Parcel parcel, int i4) {
        y(parcel, i4, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean m(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        if (iU == 0) {
            return null;
        }
        x(parcel, i4, iU, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static Double n(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        if (iU == 0) {
            return null;
        }
        x(parcel, i4, iU, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static Float o(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        if (iU == 0) {
            return null;
        }
        x(parcel, i4, iU, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int p(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder q(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        int iDataPosition = parcel.dataPosition();
        if (iU == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iU);
        return strongBinder;
    }

    public static int r(Parcel parcel, int i4) {
        y(parcel, i4, 4);
        return parcel.readInt();
    }

    public static long s(Parcel parcel, int i4) {
        y(parcel, i4, 8);
        return parcel.readLong();
    }

    public static Long t(Parcel parcel, int i4) {
        int iU = u(parcel, i4);
        if (iU == 0) {
            return null;
        }
        x(parcel, i4, iU, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int u(Parcel parcel, int i4) {
        return (i4 & (-65536)) != -65536 ? (char) (i4 >> 16) : parcel.readInt();
    }

    public static void v(Parcel parcel, int i4) {
        parcel.setDataPosition(parcel.dataPosition() + u(parcel, i4));
    }

    public static int w(Parcel parcel) {
        int iP = p(parcel);
        int iU = u(parcel, iP);
        int iK = k(iP);
        int iDataPosition = parcel.dataPosition();
        if (iK != 20293) {
            throw new a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iP))), parcel);
        }
        int i4 = iU + iDataPosition;
        if (i4 >= iDataPosition && i4 <= parcel.dataSize()) {
            return i4;
        }
        throw new a("Size read is invalid start=" + iDataPosition + " end=" + i4, parcel);
    }

    public static void x(Parcel parcel, int i4, int i5, int i6) {
        if (i5 == i6) {
            return;
        }
        throw new a("Expected size " + i6 + " got " + i5 + " (0x" + Integer.toHexString(i5) + ")", parcel);
    }

    public static void y(Parcel parcel, int i4, int i5) {
        int iU = u(parcel, i4);
        if (iU == i5) {
            return;
        }
        throw new a("Expected size " + i5 + " got " + iU + " (0x" + Integer.toHexString(iU) + ")", parcel);
    }
}
