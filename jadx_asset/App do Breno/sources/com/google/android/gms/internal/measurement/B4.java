package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class B4 extends D4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6297d;

    public /* synthetic */ B4(byte[] bArr, int i4, int i5, boolean z3, C4 c4) {
        super(null);
        this.f6297d = Integer.MAX_VALUE;
        this.f6295b = 0;
    }

    public final int c(int i4) {
        int i5 = this.f6297d;
        this.f6297d = 0;
        int i6 = this.f6295b + this.f6296c;
        this.f6295b = i6;
        if (i6 <= 0) {
            this.f6296c = 0;
            return i5;
        }
        this.f6296c = i6;
        this.f6295b = 0;
        return i5;
    }
}
