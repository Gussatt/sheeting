package R;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: renamed from: R.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0485c implements Parcelable {
    public static final Parcelable.Creator<C0485c> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f3151m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List f3152n;

    /* JADX INFO: renamed from: R.c$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0485c createFromParcel(Parcel parcel) {
            return new C0485c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0485c[] newArray(int i4) {
            return new C0485c[i4];
        }
    }

    public C0485c(Parcel parcel) {
        this.f3151m = parcel.createStringArrayList();
        this.f3152n = parcel.createTypedArrayList(C0484b.CREATOR);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f3151m);
        parcel.writeTypedList(this.f3152n);
    }
}
