package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class W extends AbstractC0730e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f6604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6606d;

    @Override // com.google.android.gms.internal.measurement.AbstractC0730e0
    public final AbstractC0730e0 a(boolean z3) {
        this.f6604b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0730e0
    public final AbstractC0739f0 b() {
        if (this.f6604b == 1 && this.f6603a != null && this.f6605c != 0 && this.f6606d != 0) {
            return new Y(this.f6603a, false, this.f6605c, null, null, this.f6606d, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f6603a == null) {
            sb.append(" fileOwner");
        }
        if (this.f6604b == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.f6605c == 0) {
            sb.append(" fileChecks");
        }
        if (this.f6606d == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0730e0
    public final AbstractC0730e0 c(int i4) {
        this.f6605c = i4;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC0730e0
    public final AbstractC0730e0 d(int i4) {
        this.f6606d = 1;
        return this;
    }

    public final AbstractC0730e0 e(String str) {
        this.f6603a = "";
        return this;
    }
}
