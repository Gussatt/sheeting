package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0599v extends IOException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public J f4928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4929n;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v$a */
    public static class a extends C0599v {
        public a(String str) {
            super(str);
        }
    }

    public C0599v(String str) {
        super(str);
        this.f4928m = null;
    }

    public static C0599v b() {
        return new C0599v("Protocol message end-group tag did not match expected tag.");
    }

    public static C0599v c() {
        return new C0599v("Protocol message contained an invalid tag (zero).");
    }

    public static C0599v d() {
        return new C0599v("Protocol message had invalid UTF-8.");
    }

    public static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    public static C0599v f() {
        return new C0599v("CodedInputStream encountered a malformed varint.");
    }

    public static C0599v g() {
        return new C0599v("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static C0599v h() {
        return new C0599v("Failed to parse the message.");
    }

    public static C0599v i() {
        return new C0599v("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    public static C0599v l() {
        return new C0599v("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public static C0599v m() {
        return new C0599v("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public boolean a() {
        return this.f4929n;
    }

    public void j() {
        this.f4929n = true;
    }

    public C0599v k(J j4) {
        this.f4928m = j4;
        return this;
    }

    public C0599v(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f4928m = null;
    }
}
