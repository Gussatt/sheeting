package H2;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class X3 extends R1 {

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1934a;

        static {
            int[] iArr = new int[EnumC0389p0.values().length];
            f1934a = iArr;
            try {
                iArr[EnumC0389p0.f2105o.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1934a[EnumC0389p0.f2106p.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1934a[EnumC0389p0.f2107q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1934a[EnumC0389p0.f2108r.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public X3(O3 o32) {
        super(o32);
    }

    @Override // H2.R1
    public E5 c(View view) {
        return new E5(view.getScrollX(), view.getScrollY());
    }

    @Override // H2.R1
    public void f(View view, long j4, long j5) {
        view.scrollBy((int) j4, (int) j5);
    }

    @Override // H2.R1
    public void g(View view, long j4, long j5) {
        view.scrollTo((int) j4, (int) j5);
    }

    @Override // H2.R1
    public void h(View view, boolean z3) {
        view.setHorizontalScrollBarEnabled(z3);
    }

    @Override // H2.R1
    public void i(View view, EnumC0389p0 enumC0389p0) {
        int i4 = a.f1934a[enumC0389p0.ordinal()];
        if (i4 == 1) {
            view.setOverScrollMode(0);
            return;
        }
        if (i4 == 2) {
            view.setOverScrollMode(1);
        } else if (i4 == 3) {
            view.setOverScrollMode(2);
        } else if (i4 == 4) {
            throw b().K(EnumC0389p0.f2108r);
        }
    }

    @Override // H2.R1
    public void j(View view, boolean z3) {
        view.setVerticalScrollBarEnabled(z3);
    }

    @Override // H2.R1
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public O3 b() {
        return (O3) super.b();
    }
}
