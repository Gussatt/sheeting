package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import j0.C1107b;
import j0.InterfaceC1108c;

/* JADX INFO: loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC1108c f5506m;

    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ParcelImpl[] newArray(int i4) {
            return new ParcelImpl[i4];
        }
    }

    public ParcelImpl(Parcel parcel) {
        this.f5506m = new C1107b(parcel).u();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        new C1107b(parcel).L(this.f5506m);
    }
}
