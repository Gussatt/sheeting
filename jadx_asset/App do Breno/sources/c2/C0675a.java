package c2;

import java.util.List;

/* JADX INFO: renamed from: c2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0675a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f6011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f6012f;

    public C0675a(String str, String str2, String str3, String str4, s sVar, List list) {
        X2.l.e(str, "packageName");
        X2.l.e(str2, "versionName");
        X2.l.e(str3, "appBuildVersion");
        X2.l.e(str4, "deviceManufacturer");
        X2.l.e(sVar, "currentProcessDetails");
        X2.l.e(list, "appProcessDetails");
        this.f6007a = str;
        this.f6008b = str2;
        this.f6009c = str3;
        this.f6010d = str4;
        this.f6011e = sVar;
        this.f6012f = list;
    }

    public final String a() {
        return this.f6009c;
    }

    public final List b() {
        return this.f6012f;
    }

    public final s c() {
        return this.f6011e;
    }

    public final String d() {
        return this.f6010d;
    }

    public final String e() {
        return this.f6007a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0675a)) {
            return false;
        }
        C0675a c0675a = (C0675a) obj;
        return X2.l.a(this.f6007a, c0675a.f6007a) && X2.l.a(this.f6008b, c0675a.f6008b) && X2.l.a(this.f6009c, c0675a.f6009c) && X2.l.a(this.f6010d, c0675a.f6010d) && X2.l.a(this.f6011e, c0675a.f6011e) && X2.l.a(this.f6012f, c0675a.f6012f);
    }

    public final String f() {
        return this.f6008b;
    }

    public int hashCode() {
        return (((((((((this.f6007a.hashCode() * 31) + this.f6008b.hashCode()) * 31) + this.f6009c.hashCode()) * 31) + this.f6010d.hashCode()) * 31) + this.f6011e.hashCode()) * 31) + this.f6012f.hashCode();
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f6007a + ", versionName=" + this.f6008b + ", appBuildVersion=" + this.f6009c + ", deviceManufacturer=" + this.f6010d + ", currentProcessDetails=" + this.f6011e + ", appProcessDetails=" + this.f6012f + ')';
    }
}
