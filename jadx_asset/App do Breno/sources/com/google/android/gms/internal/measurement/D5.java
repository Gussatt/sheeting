package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class D5 implements InterfaceC0837q5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC0860t5 f6317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f6319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f6320d;

    public D5(InterfaceC0860t5 interfaceC0860t5, String str, Object[] objArr) {
        this.f6317a = interfaceC0860t5;
        this.f6318b = str;
        this.f6319c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f6320d = cCharAt;
            return;
        }
        int i4 = cCharAt & 8191;
        int i5 = 1;
        int i6 = 13;
        while (true) {
            int i7 = i5 + 1;
            char cCharAt2 = str.charAt(i5);
            if (cCharAt2 < 55296) {
                this.f6320d = i4 | (cCharAt2 << i6);
                return;
            } else {
                i4 |= (cCharAt2 & 8191) << i6;
                i6 += 13;
                i5 = i7;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0837q5
    public final InterfaceC0860t5 a() {
        return this.f6317a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0837q5
    public final boolean b() {
        return (this.f6320d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC0837q5
    public final int c() {
        int i4 = this.f6320d;
        if ((i4 & 1) != 0) {
            return 1;
        }
        return (i4 & 4) == 4 ? 3 : 2;
    }

    public final String d() {
        return this.f6318b;
    }

    public final Object[] e() {
        return this.f6319c;
    }
}
