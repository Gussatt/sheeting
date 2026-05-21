package c2;

/* JADX INFO: renamed from: c2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0687m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6081a;

    public C0687m(String str) {
        this.f6081a = str;
    }

    public final String a() {
        return this.f6081a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0687m) && X2.l.a(this.f6081a, ((C0687m) obj).f6081a);
    }

    public int hashCode() {
        String str = this.f6081a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f6081a + ')';
    }
}
