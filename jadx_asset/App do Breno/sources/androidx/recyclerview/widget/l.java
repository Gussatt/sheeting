package androidx.recyclerview.widget;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f5496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f5497b = new a();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5498a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5499b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5500c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5501d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5502e;

        public void a(int i4) {
            this.f5498a = i4 | this.f5498a;
        }

        public boolean b() {
            int i4 = this.f5498a;
            if ((i4 & 7) != 0 && (i4 & c(this.f5501d, this.f5499b)) == 0) {
                return false;
            }
            int i5 = this.f5498a;
            if ((i5 & 112) != 0 && (i5 & (c(this.f5501d, this.f5500c) << 4)) == 0) {
                return false;
            }
            int i6 = this.f5498a;
            if ((i6 & 1792) != 0 && (i6 & (c(this.f5502e, this.f5499b) << 8)) == 0) {
                return false;
            }
            int i7 = this.f5498a;
            return (i7 & 28672) == 0 || (i7 & (c(this.f5502e, this.f5500c) << 12)) != 0;
        }

        public int c(int i4, int i5) {
            if (i4 > i5) {
                return 1;
            }
            return i4 == i5 ? 2 : 4;
        }

        public void d() {
            this.f5498a = 0;
        }

        public void e(int i4, int i5, int i6, int i7) {
            this.f5499b = i4;
            this.f5500c = i5;
            this.f5501d = i6;
            this.f5502e = i7;
        }
    }

    public interface b {
        View a(int i4);

        int b();

        int c(View view);

        int d();

        int e(View view);
    }

    public l(b bVar) {
        this.f5496a = bVar;
    }

    public View a(int i4, int i5, int i6, int i7) {
        int iD = this.f5496a.d();
        int iB = this.f5496a.b();
        int i8 = i5 > i4 ? 1 : -1;
        View view = null;
        while (i4 != i5) {
            View viewA = this.f5496a.a(i4);
            this.f5497b.e(iD, iB, this.f5496a.c(viewA), this.f5496a.e(viewA));
            if (i6 != 0) {
                this.f5497b.d();
                this.f5497b.a(i6);
                if (this.f5497b.b()) {
                    return viewA;
                }
            }
            if (i7 != 0) {
                this.f5497b.d();
                this.f5497b.a(i7);
                if (this.f5497b.b()) {
                    view = viewA;
                }
            }
            i4 += i8;
        }
        return view;
    }
}
