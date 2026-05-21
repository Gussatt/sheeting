package n0;

import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10582c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10583d;

    public b(int i4, int i5, int i6, int i7) {
        this.f10580a = i4;
        this.f10581b = i5;
        this.f10582c = i6;
        this.f10583d = i7;
        if (i4 > i6) {
            throw new IllegalArgumentException(("Left must be less than or equal to right, left: " + i4 + ", right: " + i6).toString());
        }
        if (i5 <= i7) {
            return;
        }
        throw new IllegalArgumentException(("top must be less than or equal to bottom, top: " + i5 + ", bottom: " + i7).toString());
    }

    public final int a() {
        return this.f10583d - this.f10581b;
    }

    public final int b() {
        return this.f10580a;
    }

    public final int c() {
        return this.f10581b;
    }

    public final int d() {
        return this.f10582c - this.f10580a;
    }

    public final boolean e() {
        return a() == 0 && d() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!X2.l.a(b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        X2.l.c(obj, "null cannot be cast to non-null type androidx.window.core.Bounds");
        b bVar = (b) obj;
        return this.f10580a == bVar.f10580a && this.f10581b == bVar.f10581b && this.f10582c == bVar.f10582c && this.f10583d == bVar.f10583d;
    }

    public final Rect f() {
        return new Rect(this.f10580a, this.f10581b, this.f10582c, this.f10583d);
    }

    public int hashCode() {
        return (((((this.f10580a * 31) + this.f10581b) * 31) + this.f10582c) * 31) + this.f10583d;
    }

    public String toString() {
        return b.class.getSimpleName() + " { [" + this.f10580a + ',' + this.f10581b + ',' + this.f10582c + ',' + this.f10583d + "] }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        X2.l.e(rect, "rect");
    }
}
