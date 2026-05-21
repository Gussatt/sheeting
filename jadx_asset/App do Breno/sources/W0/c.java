package W0;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static int a(Parcel parcel) {
        return t(parcel, 20293);
    }

    public static void b(Parcel parcel, int i4) {
        u(parcel, i4);
    }

    public static void c(Parcel parcel, int i4, boolean z3) {
        v(parcel, i4, 4);
        parcel.writeInt(z3 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i4, Boolean bool, boolean z3) {
        if (bool != null) {
            v(parcel, i4, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z3) {
            v(parcel, i4, 0);
        }
    }

    public static void e(Parcel parcel, int i4, Bundle bundle, boolean z3) {
        if (bundle == null) {
            if (z3) {
                v(parcel, i4, 0);
            }
        } else {
            int iT = t(parcel, i4);
            parcel.writeBundle(bundle);
            u(parcel, iT);
        }
    }

    public static void f(Parcel parcel, int i4, byte[] bArr, boolean z3) {
        if (bArr == null) {
            if (z3) {
                v(parcel, i4, 0);
            }
        } else {
            int iT = t(parcel, i4);
            parcel.writeByteArray(bArr);
            u(parcel, iT);
        }
    }

    public static void g(Parcel parcel, int i4, Double d4, boolean z3) {
        if (d4 != null) {
            v(parcel, i4, 8);
            parcel.writeDouble(d4.doubleValue());
        } else if (z3) {
            v(parcel, i4, 0);
        }
    }

    public static void h(Parcel parcel, int i4, Float f4, boolean z3) {
        if (f4 != null) {
            v(parcel, i4, 4);
            parcel.writeFloat(f4.floatValue());
        } else if (z3) {
            v(parcel, i4, 0);
        }
    }

    public static void i(Parcel parcel, int i4, IBinder iBinder, boolean z3) {
        if (iBinder == null) {
            if (z3) {
                v(parcel, i4, 0);
            }
        } else {
            int iT = t(parcel, i4);
            parcel.writeStrongBinder(iBinder);
            u(parcel, iT);
        }
    }

    public static void j(Parcel parcel, int i4, int i5) {
        v(parcel, i4, 4);
        parcel.writeInt(i5);
    }

    public static void k(Parcel parcel, int i4, int[] iArr, boolean z3) {
        if (iArr == null) {
            if (z3) {
                v(parcel, i4, 0);
            }
        } else {
            int iT = t(parcel, i4);
            parcel.writeIntArray(iArr);
            u(parcel, iT);
        }
    }

    public static void l(Parcel parcel, int i4, List list, boolean z3) {
        if (list == null) {
            if (z3) {
                v(parcel, i4, 0);
                return;
            }
            return;
        }
        int iT = t(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            parcel.writeInt(((Integer) list.get(i5)).intValue());
        }
        u(parcel, iT);
    }

    public static void m(Parcel parcel, int i4, long j4) {
        v(parcel, i4, 8);
        parcel.writeLong(j4);
    }

    public static void n(Parcel parcel, int i4, Long l4, boolean z3) {
        if (l4 != null) {
            v(parcel, i4, 8);
            parcel.writeLong(l4.longValue());
        } else if (z3) {
            v(parcel, i4, 0);
        }
    }

    public static void o(Parcel parcel, int i4, Parcelable parcelable, int i5, boolean z3) {
        if (parcelable == null) {
            if (z3) {
                v(parcel, i4, 0);
            }
        } else {
            int iT = t(parcel, i4);
            parcelable.writeToParcel(parcel, i5);
            u(parcel, iT);
        }
    }

    public static void p(Parcel parcel, int i4, String str, boolean z3) {
        if (str == null) {
            if (z3) {
                v(parcel, i4, 0);
            }
        } else {
            int iT = t(parcel, i4);
            parcel.writeString(str);
            u(parcel, iT);
        }
    }

    public static void q(Parcel parcel, int i4, List list, boolean z3) {
        if (list == null) {
            if (z3) {
                v(parcel, i4, 0);
            }
        } else {
            int iT = t(parcel, i4);
            parcel.writeStringList(list);
            u(parcel, iT);
        }
    }

    public static void r(Parcel parcel, int i4, Parcelable[] parcelableArr, int i5, boolean z3) {
        if (parcelableArr == null) {
            if (z3) {
                v(parcel, i4, 0);
                return;
            }
            return;
        }
        int iT = t(parcel, i4);
        parcel.writeInt(parcelableArr.length);
        for (Parcelable parcelable : parcelableArr) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                w(parcel, parcelable, i5);
            }
        }
        u(parcel, iT);
    }

    public static void s(Parcel parcel, int i4, List list, boolean z3) {
        if (list == null) {
            if (z3) {
                v(parcel, i4, 0);
                return;
            }
            return;
        }
        int iT = t(parcel, i4);
        int size = list.size();
        parcel.writeInt(size);
        for (int i5 = 0; i5 < size; i5++) {
            Parcelable parcelable = (Parcelable) list.get(i5);
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                w(parcel, parcelable, 0);
            }
        }
        u(parcel, iT);
    }

    public static int t(Parcel parcel, int i4) {
        parcel.writeInt(i4 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void u(Parcel parcel, int i4) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i4 - 4);
        parcel.writeInt(iDataPosition - i4);
        parcel.setDataPosition(iDataPosition);
    }

    public static void v(Parcel parcel, int i4, int i5) {
        parcel.writeInt(i4 | (i5 << 16));
    }

    public static void w(Parcel parcel, Parcelable parcelable, int i4) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i4);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }
}
