package C;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: C.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0237u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f390a;

    /* JADX INFO: renamed from: C.u$a */
    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final View f391a;

        public a(View view) {
            this.f391a = view;
        }
    }

    /* JADX INFO: renamed from: C.u$b */
    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public View f392b;

        public b(View view) {
            super(view);
            this.f392b = view;
        }
    }

    /* JADX INFO: renamed from: C.u$c */
    public static class c {
    }

    public C0237u(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f390a = new b(view);
        } else {
            this.f390a = new a(view);
        }
    }
}
