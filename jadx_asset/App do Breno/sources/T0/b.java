package T0;

import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public class b extends Exception {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Status f3464m;

    public b(Status status) {
        super(status.f() + ": " + (status.g() != null ? status.g() : ""));
        this.f3464m = status;
    }

    public Status a() {
        return this.f3464m;
    }
}
