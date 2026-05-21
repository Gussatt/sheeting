package e1;

import android.os.Parcel;

/* JADX INFO: renamed from: e1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0927b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ClassLoader f7183a = AbstractC0927b.class.getClassLoader();

    public static void a(Parcel parcel, boolean z3) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
