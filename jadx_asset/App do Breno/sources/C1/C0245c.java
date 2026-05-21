package C1;

import java.io.File;

/* JADX INFO: renamed from: C1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0245c extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F1.F f592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f594c;

    public C0245c(F1.F f4, String str, File file) {
        if (f4 == null) {
            throw new NullPointerException("Null report");
        }
        this.f592a = f4;
        if (str == null) {
            throw new NullPointerException("Null sessionId");
        }
        this.f593b = str;
        if (file == null) {
            throw new NullPointerException("Null reportFile");
        }
        this.f594c = file;
    }

    @Override // C1.G
    public F1.F b() {
        return this.f592a;
    }

    @Override // C1.G
    public File c() {
        return this.f594c;
    }

    @Override // C1.G
    public String d() {
        return this.f593b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            G g4 = (G) obj;
            if (this.f592a.equals(g4.b()) && this.f593b.equals(g4.d()) && this.f594c.equals(g4.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f592a.hashCode() ^ 1000003) * 1000003) ^ this.f593b.hashCode()) * 1000003) ^ this.f594c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f592a + ", sessionId=" + this.f593b + ", reportFile=" + this.f594c + "}";
    }
}
