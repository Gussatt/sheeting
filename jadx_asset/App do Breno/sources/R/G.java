package R;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class G implements Parcelable {
    public static final Parcelable.Creator<G> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f3009m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f3010n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f3011o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f3012p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3013q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f3014r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f3015s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f3016t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f3017u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final boolean f3018v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final int f3019w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f3020x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f3021y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f3022z;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public G createFromParcel(Parcel parcel) {
            return new G(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public G[] newArray(int i4) {
            return new G[i4];
        }
    }

    public G(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o) {
        this.f3009m = abstractComponentCallbacksC0497o.getClass().getName();
        this.f3010n = abstractComponentCallbacksC0497o.f3252g;
        this.f3011o = abstractComponentCallbacksC0497o.f3262q;
        this.f3012p = abstractComponentCallbacksC0497o.f3270y;
        this.f3013q = abstractComponentCallbacksC0497o.f3271z;
        this.f3014r = abstractComponentCallbacksC0497o.f3219A;
        this.f3015s = abstractComponentCallbacksC0497o.f3222D;
        this.f3016t = abstractComponentCallbacksC0497o.f3259n;
        this.f3017u = abstractComponentCallbacksC0497o.f3221C;
        this.f3018v = abstractComponentCallbacksC0497o.f3220B;
        this.f3019w = abstractComponentCallbacksC0497o.f3237S.ordinal();
        this.f3020x = abstractComponentCallbacksC0497o.f3255j;
        this.f3021y = abstractComponentCallbacksC0497o.f3256k;
        this.f3022z = abstractComponentCallbacksC0497o.f3230L;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f3009m);
        sb.append(" (");
        sb.append(this.f3010n);
        sb.append(")}:");
        if (this.f3011o) {
            sb.append(" fromLayout");
        }
        if (this.f3013q != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f3013q));
        }
        String str = this.f3014r;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f3014r);
        }
        if (this.f3015s) {
            sb.append(" retainInstance");
        }
        if (this.f3016t) {
            sb.append(" removing");
        }
        if (this.f3017u) {
            sb.append(" detached");
        }
        if (this.f3018v) {
            sb.append(" hidden");
        }
        if (this.f3020x != null) {
            sb.append(" targetWho=");
            sb.append(this.f3020x);
            sb.append(" targetRequestCode=");
            sb.append(this.f3021y);
        }
        if (this.f3022z) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f3009m);
        parcel.writeString(this.f3010n);
        parcel.writeInt(this.f3011o ? 1 : 0);
        parcel.writeInt(this.f3012p);
        parcel.writeInt(this.f3013q);
        parcel.writeString(this.f3014r);
        parcel.writeInt(this.f3015s ? 1 : 0);
        parcel.writeInt(this.f3016t ? 1 : 0);
        parcel.writeInt(this.f3017u ? 1 : 0);
        parcel.writeInt(this.f3018v ? 1 : 0);
        parcel.writeInt(this.f3019w);
        parcel.writeString(this.f3020x);
        parcel.writeInt(this.f3021y);
        parcel.writeInt(this.f3022z ? 1 : 0);
    }

    public G(Parcel parcel) {
        this.f3009m = parcel.readString();
        this.f3010n = parcel.readString();
        this.f3011o = parcel.readInt() != 0;
        this.f3012p = parcel.readInt();
        this.f3013q = parcel.readInt();
        this.f3014r = parcel.readString();
        this.f3015s = parcel.readInt() != 0;
        this.f3016t = parcel.readInt() != 0;
        this.f3017u = parcel.readInt() != 0;
        this.f3018v = parcel.readInt() != 0;
        this.f3019w = parcel.readInt();
        this.f3020x = parcel.readString();
        this.f3021y = parcel.readInt();
        this.f3022z = parcel.readInt() != 0;
    }
}
