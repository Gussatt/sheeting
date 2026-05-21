package S0;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class A extends z {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final byte[] f3388m;

    public A(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f3388m = bArr;
    }

    @Override // S0.z
    public final byte[] u() {
        return this.f3388m;
    }
}
