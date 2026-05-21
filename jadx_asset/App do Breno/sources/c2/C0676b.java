package c2;

/* JADX INFO: renamed from: c2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0676b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6015c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6016d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EnumC0692r f6017e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0675a f6018f;

    public C0676b(String str, String str2, String str3, String str4, EnumC0692r enumC0692r, C0675a c0675a) {
        X2.l.e(str, "appId");
        X2.l.e(str2, "deviceModel");
        X2.l.e(str3, "sessionSdkVersion");
        X2.l.e(str4, "osVersion");
        X2.l.e(enumC0692r, "logEnvironment");
        X2.l.e(c0675a, "androidAppInfo");
        this.f6013a = str;
        this.f6014b = str2;
        this.f6015c = str3;
        this.f6016d = str4;
        this.f6017e = enumC0692r;
        this.f6018f = c0675a;
    }

    public final C0675a a() {
        return this.f6018f;
    }

    public final String b() {
        return this.f6013a;
    }

    public final String c() {
        return this.f6014b;
    }

    public final EnumC0692r d() {
        return this.f6017e;
    }

    public final String e() {
        return this.f6016d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0676b)) {
            return false;
        }
        C0676b c0676b = (C0676b) obj;
        return X2.l.a(this.f6013a, c0676b.f6013a) && X2.l.a(this.f6014b, c0676b.f6014b) && X2.l.a(this.f6015c, c0676b.f6015c) && X2.l.a(this.f6016d, c0676b.f6016d) && this.f6017e == c0676b.f6017e && X2.l.a(this.f6018f, c0676b.f6018f);
    }

    public final String f() {
        return this.f6015c;
    }

    public int hashCode() {
        return (((((((((this.f6013a.hashCode() * 31) + this.f6014b.hashCode()) * 31) + this.f6015c.hashCode()) * 31) + this.f6016d.hashCode()) * 31) + this.f6017e.hashCode()) * 31) + this.f6018f.hashCode();
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f6013a + ", deviceModel=" + this.f6014b + ", sessionSdkVersion=" + this.f6015c + ", osVersion=" + this.f6016d + ", logEnvironment=" + this.f6017e + ", androidAppInfo=" + this.f6018f + ')';
    }
}
