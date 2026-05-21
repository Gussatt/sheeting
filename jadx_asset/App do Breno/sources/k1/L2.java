package k1;

import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final class L2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f9127d;

    public L2(String str, String str2, Bundle bundle, long j4) {
        this.f9124a = str;
        this.f9125b = str2;
        this.f9127d = bundle;
        this.f9126c = j4;
    }

    public static L2 b(C1150J c1150j) {
        return new L2(c1150j.f9088m, c1150j.f9090o, c1150j.f9089n.g(), c1150j.f9091p);
    }

    public final C1150J a() {
        return new C1150J(this.f9124a, new C1148H(new Bundle(this.f9127d)), this.f9125b, this.f9126c);
    }

    public final String toString() {
        return "origin=" + this.f9125b + ",name=" + this.f9124a + ",params=" + this.f9127d.toString();
    }
}
