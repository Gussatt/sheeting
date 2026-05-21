package androidx.datastore.preferences.protobuf;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class e0 extends RuntimeException {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f4708m;

    public e0(J j4) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f4708m = null;
    }

    public C0599v a() {
        return new C0599v(getMessage());
    }
}
