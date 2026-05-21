package j0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import p.C1475a;

/* JADX INFO: renamed from: j0.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1107b extends AbstractC1106a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseIntArray f8562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Parcel f8563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f8564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8565g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f8566h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f8567i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8568j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8569k;

    public C1107b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1475a(), new C1475a(), new C1475a());
    }

    @Override // j0.AbstractC1106a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f8563e.writeInt(-1);
        } else {
            this.f8563e.writeInt(bArr.length);
            this.f8563e.writeByteArray(bArr);
        }
    }

    @Override // j0.AbstractC1106a
    public void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f8563e, 0);
    }

    @Override // j0.AbstractC1106a
    public void E(int i4) {
        this.f8563e.writeInt(i4);
    }

    @Override // j0.AbstractC1106a
    public void G(Parcelable parcelable) {
        this.f8563e.writeParcelable(parcelable, 0);
    }

    @Override // j0.AbstractC1106a
    public void I(String str) {
        this.f8563e.writeString(str);
    }

    @Override // j0.AbstractC1106a
    public void a() {
        int i4 = this.f8567i;
        if (i4 >= 0) {
            int i5 = this.f8562d.get(i4);
            int iDataPosition = this.f8563e.dataPosition();
            this.f8563e.setDataPosition(i5);
            this.f8563e.writeInt(iDataPosition - i5);
            this.f8563e.setDataPosition(iDataPosition);
        }
    }

    @Override // j0.AbstractC1106a
    public AbstractC1106a b() {
        Parcel parcel = this.f8563e;
        int iDataPosition = parcel.dataPosition();
        int i4 = this.f8568j;
        if (i4 == this.f8564f) {
            i4 = this.f8565g;
        }
        return new C1107b(parcel, iDataPosition, i4, this.f8566h + "  ", this.f8559a, this.f8560b, this.f8561c);
    }

    @Override // j0.AbstractC1106a
    public boolean g() {
        return this.f8563e.readInt() != 0;
    }

    @Override // j0.AbstractC1106a
    public byte[] i() {
        int i4 = this.f8563e.readInt();
        if (i4 < 0) {
            return null;
        }
        byte[] bArr = new byte[i4];
        this.f8563e.readByteArray(bArr);
        return bArr;
    }

    @Override // j0.AbstractC1106a
    public CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f8563e);
    }

    @Override // j0.AbstractC1106a
    public boolean m(int i4) {
        while (this.f8568j < this.f8565g) {
            int i5 = this.f8569k;
            if (i5 == i4) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i4)) > 0) {
                return false;
            }
            this.f8563e.setDataPosition(this.f8568j);
            int i6 = this.f8563e.readInt();
            this.f8569k = this.f8563e.readInt();
            this.f8568j += i6;
        }
        return this.f8569k == i4;
    }

    @Override // j0.AbstractC1106a
    public int o() {
        return this.f8563e.readInt();
    }

    @Override // j0.AbstractC1106a
    public Parcelable q() {
        return this.f8563e.readParcelable(getClass().getClassLoader());
    }

    @Override // j0.AbstractC1106a
    public String s() {
        return this.f8563e.readString();
    }

    @Override // j0.AbstractC1106a
    public void w(int i4) {
        a();
        this.f8567i = i4;
        this.f8562d.put(i4, this.f8563e.dataPosition());
        E(0);
        E(i4);
    }

    @Override // j0.AbstractC1106a
    public void y(boolean z3) {
        this.f8563e.writeInt(z3 ? 1 : 0);
    }

    public C1107b(Parcel parcel, int i4, int i5, String str, C1475a c1475a, C1475a c1475a2, C1475a c1475a3) {
        super(c1475a, c1475a2, c1475a3);
        this.f8562d = new SparseIntArray();
        this.f8567i = -1;
        this.f8569k = -1;
        this.f8563e = parcel;
        this.f8564f = i4;
        this.f8565g = i5;
        this.f8568j = i4;
        this.f8566h = str;
    }
}
