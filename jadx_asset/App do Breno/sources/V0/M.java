package V0;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f3628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f3629b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.internal.a f3630c;

    public M(com.google.android.gms.common.internal.a aVar, Object obj) {
        this.f3630c = aVar;
        this.f3628a = obj;
    }

    public abstract void a(Object obj);

    public abstract void b();

    public final void c() {
        Object obj;
        synchronized (this) {
            try {
                obj = this.f3628a;
                if (this.f3629b) {
                    Log.w("GmsClient", "Callback proxy " + toString() + " being reused. This is not safe.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (obj != null) {
            a(obj);
        }
        synchronized (this) {
            this.f3629b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f3628a = null;
        }
    }

    public final void e() {
        d();
        synchronized (this.f3630c.f6218r) {
            this.f3630c.f6218r.remove(this);
        }
    }
}
