package r1;

import V0.AbstractC0548g;
import V0.AbstractC0549h;
import V0.C0552k;
import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11212b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11213c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11214d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f11215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11216f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11217g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f11218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f11219b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f11220c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f11221d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f11222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f11223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f11224g;

        public n a() {
            return new n(this.f11219b, this.f11218a, this.f11220c, this.f11221d, this.f11222e, this.f11223f, this.f11224g);
        }

        public b b(String str) {
            this.f11218a = AbstractC0549h.e(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f11219b = AbstractC0549h.e(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f11220c = str;
            return this;
        }

        public b e(String str) {
            this.f11221d = str;
            return this;
        }

        public b f(String str) {
            this.f11222e = str;
            return this;
        }

        public b g(String str) {
            this.f11224g = str;
            return this;
        }

        public b h(String str) {
            this.f11223f = str;
            return this;
        }
    }

    public static n a(Context context) {
        C0552k c0552k = new C0552k(context);
        String strA = c0552k.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new n(strA, c0552k.a("google_api_key"), c0552k.a("firebase_database_url"), c0552k.a("ga_trackingId"), c0552k.a("gcm_defaultSenderId"), c0552k.a("google_storage_bucket"), c0552k.a("project_id"));
    }

    public String b() {
        return this.f11211a;
    }

    public String c() {
        return this.f11212b;
    }

    public String d() {
        return this.f11213c;
    }

    public String e() {
        return this.f11214d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return AbstractC0548g.a(this.f11212b, nVar.f11212b) && AbstractC0548g.a(this.f11211a, nVar.f11211a) && AbstractC0548g.a(this.f11213c, nVar.f11213c) && AbstractC0548g.a(this.f11214d, nVar.f11214d) && AbstractC0548g.a(this.f11215e, nVar.f11215e) && AbstractC0548g.a(this.f11216f, nVar.f11216f) && AbstractC0548g.a(this.f11217g, nVar.f11217g);
    }

    public String f() {
        return this.f11215e;
    }

    public String g() {
        return this.f11217g;
    }

    public String h() {
        return this.f11216f;
    }

    public int hashCode() {
        return AbstractC0548g.b(this.f11212b, this.f11211a, this.f11213c, this.f11214d, this.f11215e, this.f11216f, this.f11217g);
    }

    public String toString() {
        return AbstractC0548g.c(this).a("applicationId", this.f11212b).a("apiKey", this.f11211a).a("databaseUrl", this.f11213c).a("gcmSenderId", this.f11215e).a("storageBucket", this.f11216f).a("projectId", this.f11217g).toString();
    }

    public n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AbstractC0549h.o(!b1.o.a(str), "ApplicationId must be set.");
        this.f11212b = str;
        this.f11211a = str2;
        this.f11213c = str3;
        this.f11214d = str4;
        this.f11215e = str5;
        this.f11216f = str6;
        this.f11217g = str7;
    }
}
