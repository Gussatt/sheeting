package U0;

import V0.AbstractC0549h;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* JADX INFO: renamed from: U0.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0523g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0524h f3581b;

    public AbstractC0523g(InterfaceC0524h interfaceC0524h) {
        this.f3581b = interfaceC0524h;
    }

    public static InterfaceC0524h c(C0522f c0522f) {
        if (c0522f.d()) {
            c0522f.b();
            return c0.m1(null);
        }
        if (c0522f.c()) {
            return Z.b(c0522f.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    public static InterfaceC0524h d(Activity activity) {
        return c(new C0522f(activity));
    }

    public Activity b() {
        Activity activityE = this.f3581b.e();
        AbstractC0549h.j(activityE);
        return activityE;
    }

    public abstract void e(int i4, int i5, Intent intent);

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
