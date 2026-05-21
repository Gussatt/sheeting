package k1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class S6 extends W0.a {
    public static final Parcelable.Creator<S6> CREATOR = new T6();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f9231m;

    public S6(List list) {
        this.f9231m = list;
    }

    public static S6 d(EnumC1317t5... enumC1317t5Arr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(enumC1317t5Arr[0].d()));
        return new S6(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        List list = this.f9231m;
        int iA = W0.c.a(parcel);
        W0.c.l(parcel, 1, list, false);
        W0.c.b(parcel, iA);
    }
}
