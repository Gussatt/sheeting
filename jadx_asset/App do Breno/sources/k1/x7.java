package k1;

import V0.AbstractC0549h;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class x7 extends W0.a {
    public static final Parcelable.Creator<x7> CREATOR = new y7();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f9948A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f9949B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Boolean f9950C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f9951D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final List f9952E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final String f9953F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final String f9954G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final String f9955H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final String f9956I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public final boolean f9957J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public final long f9958K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public final int f9959L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public final String f9960M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public final int f9961N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final long f9962O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final String f9963P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final String f9964Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final long f9965R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public final int f9966S;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f9967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f9968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f9969o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f9970p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f9971q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f9972r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f9973s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f9974t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f9975u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f9976v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f9977w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f9978x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f9979y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f9980z;

    public x7(String str, String str2, String str3, long j4, String str4, long j5, long j6, String str5, boolean z3, boolean z4, String str6, long j7, int i4, boolean z5, boolean z6, String str7, Boolean bool, long j8, List list, String str8, String str9, String str10, String str11, boolean z7, long j9, int i5, String str12, int i6, long j10, String str13, String str14, long j11, int i7) {
        AbstractC0549h.d(str);
        this.f9967m = str;
        this.f9968n = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f9969o = str3;
        this.f9976v = j4;
        this.f9970p = str4;
        this.f9971q = j5;
        this.f9972r = j6;
        this.f9973s = str5;
        this.f9974t = z3;
        this.f9975u = z4;
        this.f9977w = str6;
        this.f9978x = j7;
        this.f9979y = i4;
        this.f9980z = z5;
        this.f9948A = z6;
        this.f9949B = str7;
        this.f9950C = bool;
        this.f9951D = j8;
        this.f9952E = list;
        this.f9953F = str8;
        this.f9954G = str9;
        this.f9955H = str10;
        this.f9956I = str11;
        this.f9957J = z7;
        this.f9958K = j9;
        this.f9959L = i5;
        this.f9960M = str12;
        this.f9961N = i6;
        this.f9962O = j10;
        this.f9963P = str13;
        this.f9964Q = str14;
        this.f9965R = j11;
        this.f9966S = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        String str = this.f9967m;
        int iA = W0.c.a(parcel);
        W0.c.p(parcel, 2, str, false);
        W0.c.p(parcel, 3, this.f9968n, false);
        W0.c.p(parcel, 4, this.f9969o, false);
        W0.c.p(parcel, 5, this.f9970p, false);
        W0.c.m(parcel, 6, this.f9971q);
        W0.c.m(parcel, 7, this.f9972r);
        W0.c.p(parcel, 8, this.f9973s, false);
        W0.c.c(parcel, 9, this.f9974t);
        W0.c.c(parcel, 10, this.f9975u);
        W0.c.m(parcel, 11, this.f9976v);
        W0.c.p(parcel, 12, this.f9977w, false);
        W0.c.m(parcel, 14, this.f9978x);
        W0.c.j(parcel, 15, this.f9979y);
        W0.c.c(parcel, 16, this.f9980z);
        W0.c.c(parcel, 18, this.f9948A);
        W0.c.p(parcel, 19, this.f9949B, false);
        W0.c.d(parcel, 21, this.f9950C, false);
        W0.c.m(parcel, 22, this.f9951D);
        W0.c.q(parcel, 23, this.f9952E, false);
        W0.c.p(parcel, 24, this.f9953F, false);
        W0.c.p(parcel, 25, this.f9954G, false);
        W0.c.p(parcel, 26, this.f9955H, false);
        W0.c.p(parcel, 27, this.f9956I, false);
        W0.c.c(parcel, 28, this.f9957J);
        W0.c.m(parcel, 29, this.f9958K);
        W0.c.j(parcel, 30, this.f9959L);
        W0.c.p(parcel, 31, this.f9960M, false);
        W0.c.j(parcel, 32, this.f9961N);
        W0.c.m(parcel, 34, this.f9962O);
        W0.c.p(parcel, 35, this.f9963P, false);
        W0.c.p(parcel, 36, this.f9964Q, false);
        W0.c.m(parcel, 37, this.f9965R);
        W0.c.j(parcel, 38, this.f9966S);
        W0.c.b(parcel, iA);
    }

    public x7(String str, String str2, String str3, String str4, long j4, long j5, String str5, boolean z3, boolean z4, long j6, String str6, long j7, int i4, boolean z5, boolean z6, String str7, Boolean bool, long j8, List list, String str8, String str9, String str10, String str11, boolean z7, long j9, int i5, String str12, int i6, long j10, String str13, String str14, long j11, int i7) {
        this.f9967m = str;
        this.f9968n = str2;
        this.f9969o = str3;
        this.f9976v = j6;
        this.f9970p = str4;
        this.f9971q = j4;
        this.f9972r = j5;
        this.f9973s = str5;
        this.f9974t = z3;
        this.f9975u = z4;
        this.f9977w = str6;
        this.f9978x = j7;
        this.f9979y = i4;
        this.f9980z = z5;
        this.f9948A = z6;
        this.f9949B = str7;
        this.f9950C = bool;
        this.f9951D = j8;
        this.f9952E = list;
        this.f9953F = str8;
        this.f9954G = str9;
        this.f9955H = str10;
        this.f9956I = str11;
        this.f9957J = z7;
        this.f9958K = j9;
        this.f9959L = i5;
        this.f9960M = str12;
        this.f9961N = i6;
        this.f9962O = j10;
        this.f9963P = str13;
        this.f9964Q = str14;
        this.f9965R = j11;
        this.f9966S = i7;
    }
}
