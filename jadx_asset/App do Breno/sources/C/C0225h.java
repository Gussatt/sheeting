package C;

import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;

/* JADX INFO: renamed from: C.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0225h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f379a;

    /* JADX INFO: renamed from: C.h$a */
    public static class a {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public C0225h(DisplayCutout displayCutout) {
        this.f379a = displayCutout;
    }

    public static C0225h e(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new C0225h(displayCutout);
    }

    public int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f379a);
        }
        return 0;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f379a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f379a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.f(this.f379a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0225h.class != obj.getClass()) {
            return false;
        }
        return B.c.a(this.f379a, ((C0225h) obj).f379a);
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f379a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f379a + "}";
    }
}
