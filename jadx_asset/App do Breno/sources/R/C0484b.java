package R;

import R.J;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC0609f;
import java.util.ArrayList;

/* JADX INFO: renamed from: R.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0484b implements Parcelable {
    public static final Parcelable.Creator<C0484b> CREATOR = new a();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int[] f3137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f3138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int[] f3139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int[] f3140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f3142r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f3143s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f3144t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final CharSequence f3145u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f3146v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final CharSequence f3147w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final ArrayList f3148x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final ArrayList f3149y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f3150z;

    /* JADX INFO: renamed from: R.b$a */
    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0484b createFromParcel(Parcel parcel) {
            return new C0484b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0484b[] newArray(int i4) {
            return new C0484b[i4];
        }
    }

    public C0484b(C0483a c0483a) {
        int size = c0483a.f3037c.size();
        this.f3137m = new int[size * 6];
        if (!c0483a.f3043i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3138n = new ArrayList(size);
        this.f3139o = new int[size];
        this.f3140p = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            J.a aVar = (J.a) c0483a.f3037c.get(i5);
            int i6 = i4 + 1;
            this.f3137m[i4] = aVar.f3054a;
            ArrayList arrayList = this.f3138n;
            AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o = aVar.f3055b;
            arrayList.add(abstractComponentCallbacksC0497o != null ? abstractComponentCallbacksC0497o.f3252g : null);
            int[] iArr = this.f3137m;
            iArr[i6] = aVar.f3056c ? 1 : 0;
            iArr[i4 + 2] = aVar.f3057d;
            iArr[i4 + 3] = aVar.f3058e;
            int i7 = i4 + 5;
            iArr[i4 + 4] = aVar.f3059f;
            i4 += 6;
            iArr[i7] = aVar.f3060g;
            this.f3139o[i5] = aVar.f3061h.ordinal();
            this.f3140p[i5] = aVar.f3062i.ordinal();
        }
        this.f3141q = c0483a.f3042h;
        this.f3142r = c0483a.f3045k;
        this.f3143s = c0483a.f3135v;
        this.f3144t = c0483a.f3046l;
        this.f3145u = c0483a.f3047m;
        this.f3146v = c0483a.f3048n;
        this.f3147w = c0483a.f3049o;
        this.f3148x = c0483a.f3050p;
        this.f3149y = c0483a.f3051q;
        this.f3150z = c0483a.f3052r;
    }

    public final void a(C0483a c0483a) {
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z3 = true;
            if (i4 >= this.f3137m.length) {
                c0483a.f3042h = this.f3141q;
                c0483a.f3045k = this.f3142r;
                c0483a.f3043i = true;
                c0483a.f3046l = this.f3144t;
                c0483a.f3047m = this.f3145u;
                c0483a.f3048n = this.f3146v;
                c0483a.f3049o = this.f3147w;
                c0483a.f3050p = this.f3148x;
                c0483a.f3051q = this.f3149y;
                c0483a.f3052r = this.f3150z;
                return;
            }
            J.a aVar = new J.a();
            int i6 = i4 + 1;
            aVar.f3054a = this.f3137m[i4];
            if (B.m0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0483a + " op #" + i5 + " base fragment #" + this.f3137m[i6]);
            }
            aVar.f3061h = AbstractC0609f.b.values()[this.f3139o[i5]];
            aVar.f3062i = AbstractC0609f.b.values()[this.f3140p[i5]];
            int[] iArr = this.f3137m;
            int i7 = i4 + 2;
            if (iArr[i6] == 0) {
                z3 = false;
            }
            aVar.f3056c = z3;
            int i8 = iArr[i7];
            aVar.f3057d = i8;
            int i9 = iArr[i4 + 3];
            aVar.f3058e = i9;
            int i10 = i4 + 5;
            int i11 = iArr[i4 + 4];
            aVar.f3059f = i11;
            i4 += 6;
            int i12 = iArr[i10];
            aVar.f3060g = i12;
            c0483a.f3038d = i8;
            c0483a.f3039e = i9;
            c0483a.f3040f = i11;
            c0483a.f3041g = i12;
            c0483a.d(aVar);
            i5++;
        }
    }

    public C0483a b(B b4) {
        C0483a c0483a = new C0483a(b4);
        a(c0483a);
        c0483a.f3135v = this.f3143s;
        for (int i4 = 0; i4 < this.f3138n.size(); i4++) {
            String str = (String) this.f3138n.get(i4);
            if (str != null) {
                ((J.a) c0483a.f3037c.get(i4)).f3055b = b4.O(str);
            }
        }
        c0483a.i(1);
        return c0483a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f3137m);
        parcel.writeStringList(this.f3138n);
        parcel.writeIntArray(this.f3139o);
        parcel.writeIntArray(this.f3140p);
        parcel.writeInt(this.f3141q);
        parcel.writeString(this.f3142r);
        parcel.writeInt(this.f3143s);
        parcel.writeInt(this.f3144t);
        TextUtils.writeToParcel(this.f3145u, parcel, 0);
        parcel.writeInt(this.f3146v);
        TextUtils.writeToParcel(this.f3147w, parcel, 0);
        parcel.writeStringList(this.f3148x);
        parcel.writeStringList(this.f3149y);
        parcel.writeInt(this.f3150z ? 1 : 0);
    }

    public C0484b(Parcel parcel) {
        this.f3137m = parcel.createIntArray();
        this.f3138n = parcel.createStringArrayList();
        this.f3139o = parcel.createIntArray();
        this.f3140p = parcel.createIntArray();
        this.f3141q = parcel.readInt();
        this.f3142r = parcel.readString();
        this.f3143s = parcel.readInt();
        this.f3144t = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f3145u = (CharSequence) creator.createFromParcel(parcel);
        this.f3146v = parcel.readInt();
        this.f3147w = (CharSequence) creator.createFromParcel(parcel);
        this.f3148x = parcel.createStringArrayList();
        this.f3149y = parcel.createStringArrayList();
        this.f3150z = parcel.readInt() != 0;
    }
}
