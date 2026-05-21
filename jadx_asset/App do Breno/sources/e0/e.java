package e0;

import X2.l;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0609f;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f7177d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f7178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0925d f7179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7180c;

    public static final class a {
        public /* synthetic */ a(X2.g gVar) {
            this();
        }

        public final e a(f fVar) {
            l.e(fVar, "owner");
            return new e(fVar, null);
        }

        public a() {
        }
    }

    public /* synthetic */ e(f fVar, X2.g gVar) {
        this(fVar);
    }

    public static final e a(f fVar) {
        return f7177d.a(fVar);
    }

    public final C0925d b() {
        return this.f7179b;
    }

    public final void c() {
        AbstractC0609f abstractC0609fH = this.f7178a.h();
        if (abstractC0609fH.b() != AbstractC0609f.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        abstractC0609fH.a(new C0923b(this.f7178a));
        this.f7179b.e(abstractC0609fH);
        this.f7180c = true;
    }

    public final void d(Bundle bundle) {
        if (!this.f7180c) {
            c();
        }
        AbstractC0609f abstractC0609fH = this.f7178a.h();
        if (!abstractC0609fH.b().f(AbstractC0609f.b.STARTED)) {
            this.f7179b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + abstractC0609fH.b()).toString());
    }

    public final void e(Bundle bundle) {
        l.e(bundle, "outBundle");
        this.f7179b.g(bundle);
    }

    public e(f fVar) {
        this.f7178a = fVar;
        this.f7179b = new C0925d();
    }
}
