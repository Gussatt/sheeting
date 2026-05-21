package k1;

import V0.AbstractC0549h;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public final class s7 extends W0.a {
    public static final Parcelable.Creator<s7> CREATOR = new t7();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f9844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f9845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f9846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Long f9847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f9848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f9849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Double f9850s;

    public s7(int i4, String str, long j4, Long l4, Float f4, String str2, String str3, Double d4) {
        this.f9844m = i4;
        this.f9845n = str;
        this.f9846o = j4;
        this.f9847p = l4;
        this.f9850s = i4 == 1 ? f4 != null ? Double.valueOf(f4.doubleValue()) : null : d4;
        this.f9848q = str2;
        this.f9849r = str3;
    }

    public final Object d() {
        Long l4 = this.f9847p;
        if (l4 != null) {
            return l4;
        }
        Double d4 = this.f9850s;
        if (d4 != null) {
            return d4;
        }
        String str = this.f9848q;
        if (str != null) {
            return str;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        t7.a(this, parcel, i4);
    }

    public s7(u7 u7Var) {
        this(u7Var.f9879c, u7Var.f9880d, u7Var.f9881e, u7Var.f9878b);
    }

    public s7(String str, long j4, Object obj, String str2) {
        AbstractC0549h.d(str);
        this.f9844m = 2;
        this.f9845n = str;
        this.f9846o = j4;
        this.f9849r = str2;
        if (obj == null) {
            this.f9847p = null;
            this.f9850s = null;
            this.f9848q = null;
            return;
        }
        if (obj instanceof Long) {
            this.f9847p = (Long) obj;
            this.f9850s = null;
            this.f9848q = null;
        } else if (obj instanceof String) {
            this.f9847p = null;
            this.f9850s = null;
            this.f9848q = (String) obj;
        } else {
            if (obj instanceof Double) {
                this.f9847p = null;
                this.f9850s = (Double) obj;
                this.f9848q = null;
                return;
            }
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }
}
