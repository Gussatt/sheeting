package U0;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import g1.HandlerC0965e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p.C1475a;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3551a = Collections.synchronizedMap(new C1475a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3552b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f3553c;

    public final AbstractC0523g c(String str, Class cls) {
        return (AbstractC0523g) cls.cast(this.f3551a.get(str));
    }

    public final void d(String str, AbstractC0523g abstractC0523g) {
        if (this.f3551a.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        this.f3551a.put(str, abstractC0523g);
        if (this.f3552b > 0) {
            new HandlerC0965e(Looper.getMainLooper()).post(new a0(this, abstractC0523g, str));
        }
    }

    public final void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        Iterator it = this.f3551a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0523g) it.next()).a(str, fileDescriptor, printWriter, strArr);
        }
    }

    public final void f(int i4, int i5, Intent intent) {
        Iterator it = this.f3551a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0523g) it.next()).e(i4, i5, intent);
        }
    }

    public final void g(Bundle bundle) {
        this.f3552b = 1;
        this.f3553c = bundle;
        for (Map.Entry entry : this.f3551a.entrySet()) {
            ((AbstractC0523g) entry.getValue()).f(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    public final void h() {
        this.f3552b = 5;
        Iterator it = this.f3551a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0523g) it.next()).g();
        }
    }

    public final void i() {
        this.f3552b = 3;
        Iterator it = this.f3551a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0523g) it.next()).h();
        }
    }

    public final void j(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        for (Map.Entry entry : this.f3551a.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((AbstractC0523g) entry.getValue()).i(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    public final void k() {
        this.f3552b = 2;
        Iterator it = this.f3551a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0523g) it.next()).j();
        }
    }

    public final void l() {
        this.f3552b = 4;
        Iterator it = this.f3551a.values().iterator();
        while (it.hasNext()) {
            ((AbstractC0523g) it.next()).k();
        }
    }
}
