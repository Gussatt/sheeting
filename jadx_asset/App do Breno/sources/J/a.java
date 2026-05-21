package J;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Parcelable f2277m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f2276n = new C0051a();
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* JADX INFO: renamed from: J.a$a, reason: collision with other inner class name */
    public class C0051a extends a {
        public C0051a() {
            super((C0051a) null);
        }
    }

    public class b implements Parcelable.ClassLoaderCreator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return a.f2276n;
            }
            throw new IllegalStateException("superState must be null");
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i4) {
            return new a[i4];
        }
    }

    public /* synthetic */ a(C0051a c0051a) {
        this();
    }

    public final Parcelable a() {
        return this.f2277m;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.f2277m, i4);
    }

    public a() {
        this.f2277m = null;
    }

    public a(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2277m = parcelable == f2276n ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public a(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.f2277m = parcelable == null ? f2276n : parcelable;
    }
}
