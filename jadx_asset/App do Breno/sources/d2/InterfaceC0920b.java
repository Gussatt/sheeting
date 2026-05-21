package d2;

import X2.l;

/* JADX INFO: renamed from: d2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC0920b {

    /* JADX INFO: renamed from: d2.b$a */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* JADX INFO: renamed from: d2.b$b, reason: collision with other inner class name */
    public static final class C0119b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7163a;

        public C0119b(String str) {
            l.e(str, "sessionId");
            this.f7163a = str;
        }

        public final String a() {
            return this.f7163a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0119b) && l.a(this.f7163a, ((C0119b) obj).f7163a);
        }

        public int hashCode() {
            return this.f7163a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f7163a + ')';
        }
    }

    a a();

    void b(C0119b c0119b);

    boolean c();
}
