package A2;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import v2.x;

/* JADX INFO: loaded from: classes.dex */
public class c implements x.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f39a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f40b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f41c;

    public c(int i4, Activity activity, x xVar) {
        this.f39a = activity;
        this.f40b = i4;
        this.f41c = xVar;
        xVar.f(this);
    }

    @Override // v2.x.b
    public boolean a() {
        return Build.VERSION.SDK_INT >= 35;
    }

    @Override // v2.x.b
    public int b() {
        if (!a()) {
            return 2;
        }
        View viewFindViewById = this.f39a.findViewById(this.f40b);
        if (viewFindViewById != null) {
            return viewFindViewById.getContentSensitivity();
        }
        throw new IllegalArgumentException(e());
    }

    @Override // v2.x.b
    public void c(int i4) {
        if (!a()) {
            throw new IllegalStateException(f());
        }
        View viewFindViewById = this.f39a.findViewById(this.f40b);
        if (viewFindViewById == null) {
            throw new IllegalArgumentException(e());
        }
        if (viewFindViewById.getContentSensitivity() == i4) {
            return;
        }
        viewFindViewById.setContentSensitivity(i4);
        viewFindViewById.invalidate();
    }

    public void d() {
        this.f41c.f(null);
        this.f39a = null;
    }

    public final String e() {
        return "FlutterView with ID " + this.f40b + "not found";
    }

    public final String f() {
        return "isSupported() should be called before attempting to set content sensitivity as it is not supported on this device.";
    }
}
