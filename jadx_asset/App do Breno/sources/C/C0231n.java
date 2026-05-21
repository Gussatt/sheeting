package C;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: C.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0231n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewParent f380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewParent f381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f384e;

    public C0231n(View view) {
        this.f382c = view;
    }

    public boolean a(float f4, float f5, boolean z3) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return E.a(viewParentI, this.f382c, f4, f5, z3);
    }

    public boolean b(float f4, float f5) {
        ViewParent viewParentI;
        if (!m() || (viewParentI = i(0)) == null) {
            return false;
        }
        return E.b(viewParentI, this.f382c, f4, f5);
    }

    public boolean c(int i4, int i5, int[] iArr, int[] iArr2) {
        return d(i4, i5, iArr, iArr2, 0);
    }

    public boolean d(int i4, int i5, int[] iArr, int[] iArr2, int i6) {
        ViewParent viewParentI;
        int i7;
        int i8;
        if (!m() || (viewParentI = i(i6)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f382c.getLocationInWindow(iArr2);
            i7 = iArr2[0];
            i8 = iArr2[1];
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (iArr == null) {
            iArr = j();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        E.c(viewParentI, this.f382c, i4, i5, iArr3, i6);
        if (iArr2 != null) {
            this.f382c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i7;
            iArr2[1] = iArr2[1] - i8;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        h(i4, i5, i6, i7, iArr, i8, iArr2);
    }

    public boolean f(int i4, int i5, int i6, int i7, int[] iArr) {
        return h(i4, i5, i6, i7, iArr, 0, null);
    }

    public boolean g(int i4, int i5, int i6, int i7, int[] iArr, int i8) {
        return h(i4, i5, i6, i7, iArr, i8, null);
    }

    public final boolean h(int i4, int i5, int i6, int i7, int[] iArr, int i8, int[] iArr2) {
        ViewParent viewParentI;
        int i9;
        int i10;
        int[] iArr3;
        if (!m() || (viewParentI = i(i8)) == null) {
            return false;
        }
        if (i4 == 0 && i5 == 0 && i6 == 0 && i7 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f382c.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] iArrJ = j();
            iArrJ[0] = 0;
            iArrJ[1] = 0;
            iArr3 = iArrJ;
        } else {
            iArr3 = iArr2;
        }
        E.d(viewParentI, this.f382c, i4, i5, i6, i7, i8, iArr3);
        if (iArr != null) {
            this.f382c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    public final ViewParent i(int i4) {
        if (i4 == 0) {
            return this.f380a;
        }
        if (i4 != 1) {
            return null;
        }
        return this.f381b;
    }

    public final int[] j() {
        if (this.f384e == null) {
            this.f384e = new int[2];
        }
        return this.f384e;
    }

    public boolean k() {
        return l(0);
    }

    public boolean l(int i4) {
        return i(i4) != null;
    }

    public boolean m() {
        return this.f383d;
    }

    public void n(boolean z3) {
        if (this.f383d) {
            AbstractC0241y.Q(this.f382c);
        }
        this.f383d = z3;
    }

    public final void o(int i4, ViewParent viewParent) {
        if (i4 == 0) {
            this.f380a = viewParent;
        } else {
            if (i4 != 1) {
                return;
            }
            this.f381b = viewParent;
        }
    }

    public boolean p(int i4) {
        return q(i4, 0);
    }

    public boolean q(int i4, int i5) {
        if (l(i5)) {
            return true;
        }
        if (!m()) {
            return false;
        }
        View view = this.f382c;
        for (ViewParent parent = this.f382c.getParent(); parent != null; parent = parent.getParent()) {
            if (E.f(parent, view, this.f382c, i4, i5)) {
                o(i5, parent);
                E.e(parent, view, this.f382c, i4, i5);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void r() {
        s(0);
    }

    public void s(int i4) {
        ViewParent viewParentI = i(i4);
        if (viewParentI != null) {
            E.g(viewParentI, this.f382c, i4);
            o(i4, null);
        }
    }
}
