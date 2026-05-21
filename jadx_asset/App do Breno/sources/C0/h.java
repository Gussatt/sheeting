package C0;

import java.util.Arrays;
import z0.C1661b;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1661b f484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f485b;

    public h(C1661b c1661b, byte[] bArr) {
        if (c1661b == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f484a = c1661b;
        this.f485b = bArr;
    }

    public byte[] a() {
        return this.f485b;
    }

    public C1661b b() {
        return this.f484a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f484a.equals(hVar.f484a)) {
            return Arrays.equals(this.f485b, hVar.f485b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f484a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f485b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f484a + ", bytes=[...]}";
    }
}
