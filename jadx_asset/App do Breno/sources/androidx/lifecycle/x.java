package androidx.lifecycle;

import V.a;
import androidx.lifecycle.AbstractC0609f;
import androidx.lifecycle.C;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.b f5027a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a.b f5028b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a.b f5029c = new a();

    public static final class a implements a.b {
    }

    public static final class b implements a.b {
    }

    public static final class c implements a.b {
    }

    public static final class d implements C.b {
        @Override // androidx.lifecycle.C.b
        public B b(Class cls, V.a aVar) {
            X2.l.e(cls, "modelClass");
            X2.l.e(aVar, "extras");
            return new z();
        }
    }

    public static final void a(e0.f fVar) {
        X2.l.e(fVar, "<this>");
        AbstractC0609f.b bVarB = fVar.h().b();
        if (bVarB != AbstractC0609f.b.INITIALIZED && bVarB != AbstractC0609f.b.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (fVar.l().c("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            y yVar = new y(fVar.l(), (F) fVar);
            fVar.l().h("androidx.lifecycle.internal.SavedStateHandlesProvider", yVar);
            fVar.h().a(new w(yVar));
        }
    }

    public static final z b(F f4) {
        X2.l.e(f4, "<this>");
        return (z) new C(f4, new d()).b("androidx.lifecycle.internal.SavedStateHandlesVM", z.class);
    }
}
