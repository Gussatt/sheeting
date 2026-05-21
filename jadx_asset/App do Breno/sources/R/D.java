package R;

import R.B;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class D implements Parcelable {
    public static final Parcelable.Creator<D> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ArrayList f2993m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ArrayList f2994n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public C0484b[] f2995o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f2996p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f2997q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f2998r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ArrayList f2999s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f3000t;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public D createFromParcel(Parcel parcel) {
            return new D(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public D[] newArray(int i4) {
            return new D[i4];
        }
    }

    public D() {
        this.f2997q = null;
        this.f2998r = new ArrayList();
        this.f2999s = new ArrayList();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeStringList(this.f2993m);
        parcel.writeStringList(this.f2994n);
        parcel.writeTypedArray(this.f2995o, i4);
        parcel.writeInt(this.f2996p);
        parcel.writeString(this.f2997q);
        parcel.writeStringList(this.f2998r);
        parcel.writeTypedList(this.f2999s);
        parcel.writeTypedList(this.f3000t);
    }

    public D(Parcel parcel) {
        this.f2997q = null;
        this.f2998r = new ArrayList();
        this.f2999s = new ArrayList();
        this.f2993m = parcel.createStringArrayList();
        this.f2994n = parcel.createStringArrayList();
        this.f2995o = (C0484b[]) parcel.createTypedArray(C0484b.CREATOR);
        this.f2996p = parcel.readInt();
        this.f2997q = parcel.readString();
        this.f2998r = parcel.createStringArrayList();
        this.f2999s = parcel.createTypedArrayList(C0485c.CREATOR);
        this.f3000t = parcel.createTypedArrayList(B.g.CREATOR);
    }
}
