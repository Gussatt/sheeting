package q0;

import C.F;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0.b f11055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F f11056b;

    public k(n0.b bVar, F f4) {
        X2.l.e(bVar, "_bounds");
        X2.l.e(f4, "_windowInsetsCompat");
        this.f11055a = bVar;
        this.f11056b = f4;
    }

    public final Rect a() {
        return this.f11055a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!X2.l.a(k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        X2.l.c(obj, "null cannot be cast to non-null type androidx.window.layout.WindowMetrics");
        k kVar = (k) obj;
        return X2.l.a(this.f11055a, kVar.f11055a) && X2.l.a(this.f11056b, kVar.f11056b);
    }

    public int hashCode() {
        return (this.f11055a.hashCode() * 31) + this.f11056b.hashCode();
    }

    public String toString() {
        return "WindowMetrics( bounds=" + this.f11055a + ", windowInsetsCompat=" + this.f11056b + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k(Rect rect, F f4, int i4, X2.g gVar) {
        if ((i4 & 2) != 0) {
            f4 = new F.b().a();
            X2.l.d(f4, "Builder().build()");
        }
        this(rect, f4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(Rect rect, F f4) {
        this(new n0.b(rect), f4);
        X2.l.e(rect, "bounds");
        X2.l.e(f4, "insets");
    }
}
