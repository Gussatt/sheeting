package k1;

import android.text.TextUtils;

/* JADX INFO: renamed from: k1.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1201f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EnumC1204f4 f9422a;

    public C1201f1(EnumC1204f4 enumC1204f4) {
        this.f9422a = enumC1204f4;
    }

    public static C1201f1 a(String str) {
        return new C1201f1((TextUtils.isEmpty(str) || str.length() > 1) ? EnumC1204f4.UNINITIALIZED : C1229i4.g(str.charAt(0)));
    }

    public final EnumC1204f4 b() {
        return this.f9422a;
    }

    public final String c() {
        return String.valueOf(C1229i4.a(this.f9422a));
    }
}
