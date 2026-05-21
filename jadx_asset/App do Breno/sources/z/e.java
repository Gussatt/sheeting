package z;

import android.util.Base64;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12045c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f12046d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12047e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12048f;

    public e(String str, String str2, String str3, List list) {
        this.f12043a = (String) B.f.b(str);
        this.f12044b = (String) B.f.b(str2);
        this.f12045c = (String) B.f.b(str3);
        this.f12046d = (List) B.f.b(list);
        this.f12048f = a(str, str2, str3);
    }

    public final String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List b() {
        return this.f12046d;
    }

    public int c() {
        return this.f12047e;
    }

    public String d() {
        return this.f12048f;
    }

    public String e() {
        return this.f12043a;
    }

    public String f() {
        return this.f12044b;
    }

    public String g() {
        return this.f12045c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f12043a + ", mProviderPackage: " + this.f12044b + ", mQuery: " + this.f12045c + ", mCertificates:");
        for (int i4 = 0; i4 < this.f12046d.size(); i4++) {
            sb.append(" [");
            List list = (List) this.f12046d.get(i4);
            for (int i5 = 0; i5 < list.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f12047e);
        return sb.toString();
    }
}
