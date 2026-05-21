package v;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: renamed from: v.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1583b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1583b f11516e = new C1583b(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11520d;

    /* JADX INFO: renamed from: v.b$a */
    public static class a {
        public static Insets a(int i4, int i5, int i6, int i7) {
            return Insets.of(i4, i5, i6, i7);
        }
    }

    public C1583b(int i4, int i5, int i6, int i7) {
        this.f11517a = i4;
        this.f11518b = i5;
        this.f11519c = i6;
        this.f11520d = i7;
    }

    public static C1583b a(C1583b c1583b, C1583b c1583b2) {
        return b(Math.max(c1583b.f11517a, c1583b2.f11517a), Math.max(c1583b.f11518b, c1583b2.f11518b), Math.max(c1583b.f11519c, c1583b2.f11519c), Math.max(c1583b.f11520d, c1583b2.f11520d));
    }

    public static C1583b b(int i4, int i5, int i6, int i7) {
        return (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) ? f11516e : new C1583b(i4, i5, i6, i7);
    }

    public static C1583b c(Rect rect) {
        return b(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C1583b d(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public Insets e() {
        return a.a(this.f11517a, this.f11518b, this.f11519c, this.f11520d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1583b.class != obj.getClass()) {
            return false;
        }
        C1583b c1583b = (C1583b) obj;
        return this.f11520d == c1583b.f11520d && this.f11517a == c1583b.f11517a && this.f11519c == c1583b.f11519c && this.f11518b == c1583b.f11518b;
    }

    public int hashCode() {
        return (((((this.f11517a * 31) + this.f11518b) * 31) + this.f11519c) * 31) + this.f11520d;
    }

    public String toString() {
        return "Insets{left=" + this.f11517a + ", top=" + this.f11518b + ", right=" + this.f11519c + ", bottom=" + this.f11520d + '}';
    }
}
