package R;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0609f;
import androidx.lifecycle.C;
import androidx.lifecycle.InterfaceC0608e;
import e0.C0925d;

/* JADX INFO: loaded from: classes.dex */
public class N implements InterfaceC0608e, e0.f, androidx.lifecycle.F {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractComponentCallbacksC0497o f3088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.lifecycle.E f3089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Runnable f3090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.lifecycle.k f3091e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e0.e f3092f = null;

    public N(AbstractComponentCallbacksC0497o abstractComponentCallbacksC0497o, androidx.lifecycle.E e4, Runnable runnable) {
        this.f3088b = abstractComponentCallbacksC0497o;
        this.f3089c = e4;
        this.f3090d = runnable;
    }

    public void a(AbstractC0609f.a aVar) {
        this.f3091e.h(aVar);
    }

    @Override // androidx.lifecycle.InterfaceC0608e
    public V.a b() {
        Application application;
        Context applicationContext = this.f3088b.S0().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        V.b bVar = new V.b();
        if (application != null) {
            bVar.b(C.a.f4952e, application);
        }
        bVar.b(androidx.lifecycle.x.f5027a, this.f3088b);
        bVar.b(androidx.lifecycle.x.f5028b, this);
        if (this.f3088b.o() != null) {
            bVar.b(androidx.lifecycle.x.f5029c, this.f3088b.o());
        }
        return bVar;
    }

    @Override // androidx.lifecycle.F
    public androidx.lifecycle.E c() {
        d();
        return this.f3089c;
    }

    public void d() {
        if (this.f3091e == null) {
            this.f3091e = new androidx.lifecycle.k(this);
            e0.e eVarA = e0.e.a(this);
            this.f3092f = eVarA;
            eVarA.c();
            this.f3090d.run();
        }
    }

    public boolean e() {
        return this.f3091e != null;
    }

    public void f(Bundle bundle) {
        this.f3092f.d(bundle);
    }

    public void g(Bundle bundle) {
        this.f3092f.e(bundle);
    }

    @Override // androidx.lifecycle.j
    public AbstractC0609f h() {
        d();
        return this.f3091e;
    }

    @Override // e0.f
    public C0925d l() {
        d();
        return this.f3092f.b();
    }
}
