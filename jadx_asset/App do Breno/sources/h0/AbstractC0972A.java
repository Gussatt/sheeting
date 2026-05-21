package h0;

import C.AbstractC0241y;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: h0.A, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0972A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final M f7321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property f7322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property f7323c;

    /* JADX INFO: renamed from: h0.A$a */
    public class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(AbstractC0972A.c(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f4) {
            AbstractC0972A.g(view, f4.floatValue());
        }
    }

    /* JADX INFO: renamed from: h0.A$b */
    public class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return AbstractC0241y.h(view);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            AbstractC0241y.J(view, rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f7321a = new L();
        } else {
            f7321a = new K();
        }
        f7322b = new a(Float.class, "translationAlpha");
        f7323c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view) {
        f7321a.a(view);
    }

    public static z b(View view) {
        return new y(view);
    }

    public static float c(View view) {
        return f7321a.b(view);
    }

    public static P d(View view) {
        return new O(view);
    }

    public static void e(View view) {
        f7321a.c(view);
    }

    public static void f(View view, int i4, int i5, int i6, int i7) {
        f7321a.d(view, i4, i5, i6, i7);
    }

    public static void g(View view, float f4) {
        f7321a.e(view, f4);
    }

    public static void h(View view, int i4) {
        f7321a.f(view, i4);
    }

    public static void i(View view, Matrix matrix) {
        f7321a.g(view, matrix);
    }

    public static void j(View view, Matrix matrix) {
        f7321a.h(view, matrix);
    }
}
