package C;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: C.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0234q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f386b;

    public C0234q(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f385a | this.f386b;
    }

    public void b(View view, View view2, int i4) {
        c(view, view2, i4, 0);
    }

    public void c(View view, View view2, int i4, int i5) {
        if (i5 == 1) {
            this.f386b = i4;
        } else {
            this.f385a = i4;
        }
    }

    public void d(View view, int i4) {
        if (i4 == 1) {
            this.f386b = 0;
        } else {
            this.f385a = 0;
        }
    }
}
